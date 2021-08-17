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
    public static final Item YEAST = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item PRETZEL = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(4f).build()));
    public static final Item OIL = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item FRIES = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(3f).build()));
    public static final Item CHERRY = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().snack().hunger(1).saturationModifier(1f).build()));
    public static final Item CHICKEN_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().saturationModifier(3f).hunger(10).build()));
    public static final Item FISH_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(11).saturationModifier(4f).build()));
    public static final Item SAUSAGE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(4f).build()));
    public static final Item FRIED_SAUSAGE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(6f).build()));
    public static final Item FRIED_EGG = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(3f).build()));
    public static final Item TACO = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().saturationModifier(4f).hunger(6).build()));
    public static final Item TORTILLA = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().saturationModifier(5f).hunger(4).build()));
    public static final Item TACO_SHELL = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item SALSA = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(4f).snack().build()));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("foodmod", "mango"), MANGO);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "lettuce"), SALAD);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "burger"), BURGER);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "bun"), BUN);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "flour"), FLOUR);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "butter"), BUTTER);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "salt"), SALT);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "tomato"), TOMATO);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "yeast"), YEAST);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "pretzel"), PRETZEL);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "sunflower_oil"), OIL);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "fries"), FRIES);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "cherry"), CHERRY);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "chicken_sandwich"), CHICKEN_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "fish_sandwich"), FISH_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "sausage"), SAUSAGE);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "fried_sausage"), FRIED_SAUSAGE);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "fried_egg"), FRIED_EGG);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "taco"), TACO);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "tortilla"), TORTILLA);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "taco_shell"), TACO_SHELL);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "salsa"), SALSA);

    }
}
