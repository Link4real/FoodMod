package com.link.food.mod.Drinks;

import com.link.food.mod.DrinkItems.MainDrinkItem;
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

public class GrapeJuice extends MainDrinkItem {
    public GrapeJuice(Settings settings) {
        super(settings);
    }

    @Override
    protected void onConsume(ItemStack stack, World world, LivingEntity user) {
        if(!world.isClient) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 150, 1, false, true));
        }
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.foodmod.grape_juice.tooltip").formatted(Formatting.BLUE));
    }
}
