package com.link.food.mod.registry;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SushiItems {

    public static final Item FISH_SUSHI = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(8f).snack().build()));





    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("foodmod", "fish_sushi"), FISH_SUSHI);


    }
}