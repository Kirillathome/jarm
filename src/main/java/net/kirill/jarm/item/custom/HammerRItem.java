package net.kirill.jarm.item.custom;

import net.kirill.jarm.item.ModItems;
import net.kirill.jarm.util.Variables;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.kirill.jarm.item.custom.HammerItem;
import net.kirill.jarm.util.Variables.*;

public class HammerRItem extends Item {
    int damage;
    boolean damaged;
    public HammerRItem(Settings settings) {
        super(settings);
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        stack.decrement(1);
        ((PlayerEntity)entity).giveItemStack(ModItems.HAMMER.getDefaultStack());
        damage++;
        damaged = false;
    }

}
