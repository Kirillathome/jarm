package net.kirill.jarm.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kirill.jarm.JarmMod;
import net.kirill.jarm.block.custom.RadioactiveBlock;
import net.kirill.jarm.block.custom.RadioactiveBlockItem;
import net.kirill.jarm.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RadioactiveModBlocks {

    public static final Block URANIUM_ORE = registerBlock("uranium_ore", new RadioactiveBlock(FabricBlockSettings.of(Material.METAL).strength(3.5f).requiresTool()), ModItemGroup.JARM);
    public static final Block DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore", new RadioactiveBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.JARM);
    public static final Block URANIUM_BLOCK = registerBlock("uranium_block", new RadioactiveBlock(FabricBlockSettings.of(Material.METAL).strength(4.5f).requiresTool()), ModItemGroup.JARM);
    public static final Block RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block", new RadioactiveBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.JARM);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(JarmMod.Mod_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(JarmMod.Mod_ID, name),
                new RadioactiveBlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerRadioactiveModBlocks() {
        JarmMod.LOGGER.info("Registering RadioactiveModBlocks for: " + JarmMod.Mod_ID);
    }
}
