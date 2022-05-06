package net.kirill.jarm;

import net.fabricmc.api.ModInitializer;
import net.kirill.jarm.block.ModBlocks;
import net.kirill.jarm.block.RadioactiveModBlocks;
import net.kirill.jarm.effect.ModEffects;
import net.kirill.jarm.item.ModItems;
import net.kirill.jarm.potion.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JarmMod implements ModInitializer {
	public static final String Mod_ID = "jarm";
	public static final Logger LOGGER = LoggerFactory.getLogger("jarm");

	@Override
	public void onInitialize() {
		ModEffects.registerEffects();
		ModBlocks.registerModBlocks();
		RadioactiveModBlocks.registerRadioactiveModBlocks();
		ModItems.registerModItems();
		ModPotions.registerPotions();
		LOGGER.info("Hello Fabric world!");
	}
}
