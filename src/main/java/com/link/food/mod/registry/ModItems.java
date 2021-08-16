package com.link.food.mod.registry;


import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    public static final Item MANGO = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(64).food(new FoodComponent.Builder().hunger(3).saturationModifier(5f).build()));
    public static final Item SALAD = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(5).saturationModifier(2f).build()));
    public static final Item BURGER = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(8).saturationModifier(7f).build()));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("foodmod", "mango"), MANGO);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "salad"), SALAD);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "burger"), BURGER);
    }
}
