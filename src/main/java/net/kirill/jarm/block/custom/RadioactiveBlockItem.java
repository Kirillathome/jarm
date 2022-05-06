package net.kirill.jarm.block.custom;

import net.kirill.jarm.effect.ModEffects;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RadioactiveBlockItem extends BlockItem {
    public RadioactiveBlockItem(Block block, Settings settings) {
        super(block, settings);
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(ModEffects.RADIATION, 100, 0));
    }
}
