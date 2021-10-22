package com.link.food.mod.registry;

import com.link.food.mod.Drinks.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DrinkItems {

    public static Item CUP = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(16));
   public static OrangeJuice ORANGE_JUICE = new OrangeJuice(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
   public static Slush PEACH_SLUSH = new Slush(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
   public static Slush STRAWBERRY_SLUSH = new Slush(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
    public static Slush LEMON_SLUSH = new Slush(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
    public static HotChocolate HOT_CHOCOLATE = new HotChocolate(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
   public static AppleJuice APPLE_JUICE = new AppleJuice(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
   public static GrapeJuice GRAPE_JUICE = new GrapeJuice(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
   public static IceTea ICETEA_PEACH = new IceTea(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
   public static IceTea ICETEA_STRAWBERRY = new IceTea(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
   public static IceTea ICETEA_LEMON = new IceTea(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
   public static Lemonade LEMONADE = new Lemonade(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
   public static Lemonade ORANGE_LEMONADE = new Lemonade(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier("foodmod","orange_juice"), ORANGE_JUICE);
        Registry.register(Registry.ITEM, new Identifier("foodmod","peach_slush"), PEACH_SLUSH);
        Registry.register(Registry.ITEM, new Identifier("foodmod","strawberry_slush"), STRAWBERRY_SLUSH);
        Registry.register(Registry.ITEM, new Identifier("foodmod","hot_chocolate"), HOT_CHOCOLATE);
        Registry.register(Registry.ITEM, new Identifier("foodmod","cup"), CUP);
        Registry.register(Registry.ITEM, new Identifier("foodmod","apple_juice"), APPLE_JUICE);
        Registry.register(Registry.ITEM, new Identifier("foodmod","grape_juice"), GRAPE_JUICE);
        Registry.register(Registry.ITEM, new Identifier("foodmod","icetea_peach"), ICETEA_PEACH);
        Registry.register(Registry.ITEM, new Identifier("foodmod","icetea_strawberry"), ICETEA_STRAWBERRY);
        Registry.register(Registry.ITEM, new Identifier("foodmod","icetea_lemon"), ICETEA_LEMON);
        Registry.register(Registry.ITEM, new Identifier("foodmod","lemonade"), LEMONADE);
        Registry.register(Registry.ITEM, new Identifier("foodmod","lemon_slush"), LEMON_SLUSH);
        Registry.register(Registry.ITEM, new Identifier("foodmod","orange_slush"), ORANGE_LEMONADE);
    }
}