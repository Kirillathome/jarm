package net.kirill.jarm.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {

    public static final TagKey<Item> RADIOACTIVE = TagKey.of(Registry.ITEM_KEY, new Identifier("jarm", "radioactive"));

 }