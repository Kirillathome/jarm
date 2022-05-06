package net.kirill.jarm.item.custom;

import net.kirill.jarm.effect.ModEffects;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class UraniumSwordItem extends SwordItem {

    public UraniumSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(ModEffects.RADIATION, 100, 0), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(ModEffects.RADIATION, 100, 0));
        return super.postHit(stack, target, attacker);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        tooltip.add(new TranslatableText("tooltip.jarm.radioactive").formatted(Formatting.DARK_AQUA));
        tooltip.add(new TranslatableText("tooltip.jarm.radioactive2").formatted(Formatting.ITALIC).formatted(Formatting.DARK_GRAY));
    }
    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        miner.addStatusEffect(new StatusEffectInstance(ModEffects.RADIATION, 100, 0));
        return super.postMine(stack, world, state, pos, miner);
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(ModEffects.RADIATION, 100, 0));
    }
}
