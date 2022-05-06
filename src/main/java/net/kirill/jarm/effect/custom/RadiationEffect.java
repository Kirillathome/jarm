package net.kirill.jarm.effect.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class RadiationEffect extends StatusEffect {
    public RadiationEffect(StatusEffectCategory statusEffectCategory, int color){
        super(statusEffectCategory, color);
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier){
        entity.damage(DamageSource.DRYOUT, amplifier + 0.5f);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier){
        return true;
    }
}
