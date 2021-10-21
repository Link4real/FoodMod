package com.link.food.mod.registry;

import com.link.food.mod.tooltip.TooltipItemChocolate;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;

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
    public static final Item TOAST = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(7f).snack().build()));
    public static final Item BREAD_DOUGH = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item WAFFLE_DOUGH = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item WAFFLE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(5f).build()));
    public static final Item PANCAKE_DOUGH = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item PANCAKE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).build()));
    public static final Item CUPCAKE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(5f).build()));
    public static final Item CUPCAKE_DOUGH = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item PRETZEL_DOUGH = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item KETCHUP = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(2f).build()));
    public static final Item HOTDOG = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).saturationModifier(8f).build()));
    public static final Item CEREAL = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).build()));
    public static final Item CHEESE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(3f).build()));
    public static final Item WATER = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item ONION = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).build()));
    public static final Item ORANGE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(4f).build()));
    public static final Item STRAWBERRY = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(5f).snack().build()));
    public static final Item FRUIT_SALAD = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(13).saturationModifier(6f).build()));
    public static final Item GRAPE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(3f).build()));
    public static final Item CHOCOLATE = new TooltipItemChocolate(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).build()));
    public static final Item APPLE_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(6f).build()));
    public static final Item RICE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).snack().build()));
    public static final Item LEMON = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(2f).build()));

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
        Registry.register(Registry.ITEM, new Identifier("foodmod", "pretzel_dough"), PRETZEL_DOUGH);
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
        Registry.register(Registry.ITEM, new Identifier("foodmod", "toast"), TOAST);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "bread_dough"), BREAD_DOUGH);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "waffle_dough"), WAFFLE_DOUGH);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "waffle"), WAFFLE);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "pancake_dough"), PANCAKE_DOUGH);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "pancake"), PANCAKE);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "cupcake"), CUPCAKE);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "cupcake_dough"), CUPCAKE_DOUGH);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "ketchup"), KETCHUP);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "hotdog"), HOTDOG);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "cereal"), CEREAL);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "cheese"), CHEESE);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "water"), WATER);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "onion"), ONION);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "orange"), ORANGE);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "strawberry"), STRAWBERRY);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "fruit_salad"), FRUIT_SALAD);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "grape"), GRAPE);
        Registry.register(Registry.ITEM, new Identifier("foodmod","chocolate"), CHOCOLATE);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "apple_pie"), APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier("foodmod","rice"), RICE);
        Registry.register(Registry.ITEM, new Identifier("foodmod","lemon"), LEMON);
    }
}

//Link4real 2021