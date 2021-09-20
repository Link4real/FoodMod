package com.link.food.mod.registry;

import com.link.food.mod.tooltip.TooltipItemMargherita;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PizzaItems {

    public static final Item PIZZA_DOUGH = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item TOMATO_SAUCE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(2f).build()));
    public static final Item CHEESE_PIZZA = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(12).saturationModifier(8f).build()));
    public static final Item PEPPERONI = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).build()));
    public static final Item PEPPERONI_PIZZA = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(12).saturationModifier(8f).build()));
    public static final Item FISH_PIZZA = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(12).saturationModifier(8f).build()));
    public static final Item PIZZA_MARGHERITA = new TooltipItemMargherita(new Item.Settings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(12).saturationModifier(8f).build()));
    public static final Item OLIVE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(3f).build()));
    public static final Item GREEK_PIZZA = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(12).saturationModifier(9f).build()));
    //Raw
    public static final Item RAW_CHEESE_PIZZA = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(16));
    public static final Item RAW_PEPPERONI_PIZZA = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(16));
    public static final Item RAW_FISH_PIZZA = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(16));
    public static final Item RAW_PIZZA_MARGHARITA = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(16));
    public static final Item RAW_GREEK_PIZZA = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(16));

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier("foodmod", "pizza_dough"), PIZZA_DOUGH);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "tomato_sauce"), TOMATO_SAUCE);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "pepperoni"), PEPPERONI);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "olive"), OLIVE);
        //Pizzas
        Registry.register(Registry.ITEM, new Identifier("foodmod", "cheese_pizza"), CHEESE_PIZZA);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "pepperoni_pizza"), PEPPERONI_PIZZA);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "fish_pizza"), FISH_PIZZA);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "pizza_margherita"), PIZZA_MARGHERITA);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "greek_pizza"), GREEK_PIZZA);
        //Raw Variants
        Registry.register(Registry.ITEM, new Identifier("foodmod", "raw_cheese_pizza"), RAW_CHEESE_PIZZA);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "raw_fish_pizza"), RAW_FISH_PIZZA);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "raw_pepperoni_pizza"), RAW_PEPPERONI_PIZZA);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "raw_pizza_margherita"), RAW_PIZZA_MARGHARITA);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "raw_greek_pizza"), RAW_GREEK_PIZZA);

    }
}












//Link4real 2021