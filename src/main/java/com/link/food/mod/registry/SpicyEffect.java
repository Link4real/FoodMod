package com.link.food.mod.registry;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class SpicyEffect extends StatusEffect {
    public SpicyEffect() {
        super(
                StatusEffectCategory.HARMFUL,
                0xef1818);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity) entity).damage(DamageSource.MAGIC, 1 << amplifier);
        }
    }
}
