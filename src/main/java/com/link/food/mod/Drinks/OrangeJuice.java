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
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.foodmod.orange_juice_class.tooltip").formatted(Formatting.BLUE));
    }
}
