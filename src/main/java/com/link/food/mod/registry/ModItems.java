package com.link.food.mod.registry;

import com.link.food.mod.Main;
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

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mango"), MANGO);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "salad"), SALAD);
    }
}
