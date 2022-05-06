package net.kirill.jarm.effect;

import net.kirill.jarm.JarmMod;
import net.kirill.jarm.effect.custom.RadiationEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects {

    public static StatusEffect RADIATION;

    public static StatusEffect registerStatusEffect(String name){
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(JarmMod.Mod_ID, name),
                new RadiationEffect(StatusEffectCategory.HARMFUL, 3009988));
    }

    public static void registerEffects(){
        RADIATION = registerStatusEffect("radiation");
    }
}
