package com.link.food.mod.Drinks;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class Slush extends MainDrinkItem{
    public Slush(Settings settings) {
        super(settings);
    }

    @Override
    protected void onConsume(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 150, 2));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 150, 3));
        }
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.foodmod.slush.tooltip").formatted(Formatting.BLUE));
    }
}