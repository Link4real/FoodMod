package com.link.food.mod.Drinks;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class OrangeJuice extends MainDrinkItem {
    public OrangeJuice(Settings settings) {
        super(settings);
    }

    @Override
    protected void onConsume(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1, false, true));
        }
    }
}
