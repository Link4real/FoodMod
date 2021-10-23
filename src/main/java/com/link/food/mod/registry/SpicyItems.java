package com.link.food.mod.registry;

import com.link.food.mod.Main;
import com.link.food.mod.tooltip.TooltipItemSpicyMedium;
import com.link.food.mod.tooltip.TooltipItemSpicyMild;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpicyItems {

    public static TooltipItemSpicyMild CHILI_PEPPER = new TooltipItemSpicyMild(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().alwaysEdible().snack().hunger(1).saturationModifier(2f).statusEffect(new StatusEffectInstance(Main.SPICY, 250, 0), 0.1f).build()));
    public static final TooltipItemSpicyMedium JALAPENO = new TooltipItemSpicyMedium(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(2f).statusEffect(new StatusEffectInstance(Main.SPICY, 250, 1), 0.4f).snack().alwaysEdible().build()));





    public static void registerItems() {


        Registry.register(Registry.ITEM, new Identifier("foodmod", "chili_pepper"), CHILI_PEPPER);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "jalapeno"), JALAPENO);

    }
}
