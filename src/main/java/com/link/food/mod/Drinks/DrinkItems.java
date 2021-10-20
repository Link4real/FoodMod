package com.link.food.mod.Drinks;

import com.link.food.mod.Drinks.OrangeJuice;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DrinkItems {

   public static OrangeJuice ORANGE_JUICE = new OrangeJuice(new Item.Settings().group(ItemGroup.FOOD));
   public static Slush PEACH_SLUSH = new Slush(new Item.Settings().group(ItemGroup.FOOD));
   public static Slush STRAWBERRY_SLUSH = new Slush(new Item.Settings().group(ItemGroup.FOOD));

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier("foodmod","orange_juice"), ORANGE_JUICE);
        Registry.register(Registry.ITEM, new Identifier("foodmod","peach_slush"), PEACH_SLUSH);
        Registry.register(Registry.ITEM, new Identifier("foodmod","strawberry_slush"), STRAWBERRY_SLUSH);
    }
}