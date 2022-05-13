package net.kirill.jarm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kirill.jarm.JarmMod;
import net.kirill.jarm.effect.ModEffects;
import net.kirill.jarm.item.custom.*;
import net.kirill.jarm.item.custom.armor.ModArmorMaterials;
import net.kirill.jarm.item.custom.tools.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_URANIUM = registerItem("raw_uranium", new RadioactiveItem(new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item URANIUM_INGOT = registerItem("uranium_ingot", new RadioactiveItem(new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item URANIUM_NUGGET = registerItem("uranium_nugget", new RadioactiveItem(new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item URANIUM_APPLE = registerItem("uranium_apple", new UraniumAppleItem(new FabricItemSettings().group(ModItemGroup.JARM).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.RADIATION, 200, 0), 1.0f).build())));

    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget", new Item(new FabricItemSettings().group(ModItemGroup.JARM)));


    public static final Item LEAD_SWORD = registerItem("lead_sword", new SwordItem(ModToolMaterials.LEAD, 3, -2.4f, new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item LEAD_SHOVEL = registerItem("lead_shovel", new ShovelItem(ModToolMaterials.LEAD, 1.5f, -3f, new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item LEAD_PICKAXE = registerItem("lead_pickaxe", new ModPickaxeItem(ModToolMaterials.LEAD, 1, -2.8f, new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item LEAD_AXE = registerItem("lead_axe", new ModAxeItem(ModToolMaterials.LEAD, 5.5f, -3.1f, new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item LEAD_HOE = registerItem("lead_hoe", new ModHoeItem(ModToolMaterials.LEAD, 0, -2.5f, new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item URANIUM_SWORD = registerItem("uranium_sword", new UraniumSwordItem(ModToolMaterials.URANIUM, 2, -2.4f, new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item URANIUM_SHOVEL = registerItem("uranium_shovel", new RadioactiveModShovelItem(ModToolMaterials.URANIUM, 1f, -3f, new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item URANIUM_PICKAXE = registerItem("uranium_pickaxe", new RadioactiveModPickaxeItem(ModToolMaterials.URANIUM, 1, -2.8f, new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item URANIUM_AXE = registerItem("uranium_axe", new RadioactiveModAxeItem(ModToolMaterials.URANIUM, 5f, -3.1f, new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item URANIUM_HOE = registerItem("uranium_hoe", new RadioactiveModHoeItem(ModToolMaterials.URANIUM, 0, -2.5f, new FabricItemSettings().group(ModItemGroup.JARM)));

    public static final Item HAMMER = registerItem("hammer", new HammerItem(new FabricItemSettings().group(ModItemGroup.JARM).maxCount(1).maxDamage(32)));
    public static final Item IRON_PLATE = registerItem("iron_plate", new Item(new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item URANIUM_PLATE = registerItem("uranium_plate", new RadioactiveItem(new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item LEAD_PLATE = registerItem("lead_plate", new Item(new FabricItemSettings().group(ModItemGroup.JARM)));

    public static final Item LEAD_HELMET = registerItem("lead_helmet", new ArmorItem(ModArmorMaterials.LEAD, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item LEAD_CHESTPLATE = registerItem("lead_chestplate", new ArmorItem(ModArmorMaterials.LEAD, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item LEAD_LEGGINGS = registerItem("lead_leggings", new ArmorItem(ModArmorMaterials.LEAD, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.JARM)));
    public static final Item LEAD_BOOTS = registerItem("lead_boots", new ArmorItem(ModArmorMaterials.LEAD, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.JARM)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(JarmMod.Mod_ID, name), item);
    }
    public static void registerModItems(){
        JarmMod.LOGGER.info("Registering ModItems for: " + JarmMod.Mod_ID);
    }
}
