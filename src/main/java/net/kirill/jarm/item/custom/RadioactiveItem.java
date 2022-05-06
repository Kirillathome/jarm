package net.kirill.jarm.item.custom;

import net.kirill.jarm.effect.ModEffects;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class RadioactiveItem extends Item {

    public RadioactiveItem(Settings settings){
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        tooltip.add(new TranslatableText("tooltip.jarm.radioactive").formatted(Formatting.DARK_AQUA));
        tooltip.add(new TranslatableText("tooltip.jarm.radioactive2").formatted(Formatting.ITALIC).formatted(Formatting.DARK_GRAY));
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(ModEffects.RADIATION, 100, 0));
    }
}

