package net.kirill.jarm.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kirill.jarm.JarmMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup JARM = FabricItemGroupBuilder.build(new Identifier(JarmMod.Mod_ID, "jarmgroup"), () -> new ItemStack(ModItems.URANIUM_INGOT));
}
