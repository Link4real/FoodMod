package com.link.food.mod.registry;


import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    public static final Item MANGO = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(64).food(new FoodComponent.Builder().hunger(3).saturationModifier(5f).build()));
    public static final Item SALAD = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(5).saturationModifier(2f).build()));
    public static final Item BURGER = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(8).saturationModifier(7f).build()));
    public static final Item BUN = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(64).food(new FoodComponent.Builder().hunger(2).saturationModifier(4f).build()));
    public static final Item FLOUR = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item BUTTER = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(2f).build()));
    public static final Item SALT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 250, 1), 0.1f).build()));
    public static final Item TOMATO = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(4f).build()));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("foodmod", "mango"), MANGO);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "salad"), SALAD);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "burger"), BURGER);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "bun"), BUN);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "flour"), FLOUR);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "butter"), BUTTER);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "salt"), SALT);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "tomato"), TOMATO);
    }
}
