package net.kirill.jarm.item.custom;

import net.kirill.jarm.item.ModItems;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.kirill.jarm.util.Variables.*;
import java.util.List;

public class HammerItem extends Item {
    int damage;
    boolean damaged;
    public HammerItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("tooltip.jarm.hammer").formatted(Formatting.GRAY));
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!damaged && ((PlayerEntity)entity).getActiveItem().equals(ModItems.HAMMER)) {
                stack.damage(damage, ((PlayerEntity) entity), consumedPlayer -> consumedPlayer.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
                damaged = true;
            }
        }
    }
