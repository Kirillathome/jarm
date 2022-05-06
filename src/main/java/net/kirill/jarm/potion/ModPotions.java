package net.kirill.jarm.potion;

import net.kirill.jarm.JarmMod;
import net.kirill.jarm.effect.ModEffects;
import net.kirill.jarm.item.ModItems;
import net.kirill.jarm.mixin.BrewingRecipeRegistryMixin;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPotions {
    public static Potion RADIATION_POTION;

    public static Potion registerPotion(String name){
        return Registry.register(Registry.POTION, new Identifier(JarmMod.Mod_ID, name),
                new Potion(new StatusEffectInstance(ModEffects.RADIATION, 1800, 0)));
    }

    public static void registerPotions(){
        RADIATION_POTION = registerPotion("radiation_potion");
        registerPotionRecipes();
    }
    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.URANIUM_APPLE,
                ModPotions.RADIATION_POTION);
    }
}
