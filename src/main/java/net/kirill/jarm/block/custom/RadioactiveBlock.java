package net.kirill.jarm.block.custom;

import net.kirill.jarm.effect.ModEffects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;

public class RadioactiveBlock extends Block {
    public RadioactiveBlock(Settings settings){
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("tooltip.jarm.radioactive").formatted(Formatting.DARK_AQUA));
        tooltip.add(new TranslatableText("tooltip.jarm.radioactive2").formatted(Formatting.ITALIC).formatted(Formatting.DARK_GRAY));
    }
    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient()) {
            player.addStatusEffect(new StatusEffectInstance(ModEffects.RADIATION, 100, 0));
        }
    }
}
