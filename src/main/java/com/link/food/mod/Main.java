package com.link.food.mod;

import com.link.food.mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

    public static final String MOD_ID = "foodmod";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier("foodmod", "main"))
            .icon(() -> new ItemStack(ModItems.TACO))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModItems.TACO));
                stacks.add(new ItemStack(ModItems.SALSA));
                stacks.add(new ItemStack(ModItems.SALAD));
                stacks.add(new ItemStack(ModItems.TACO_SHELL));
                stacks.add(new ItemStack(ModItems.TORTILLA));
                stacks.add(new ItemStack(ModItems.BURGER));
                stacks.add(new ItemStack(ModItems.BUN));
                stacks.add(new ItemStack(ModItems.FLOUR));
                stacks.add(new ItemStack(ModItems.YEAST));
                stacks.add(new ItemStack(ModItems.OIL));
                stacks.add(new ItemStack(ModItems.BUTTER));
                stacks.add(new ItemStack(ModItems.SALT));
                stacks.add(new ItemStack(ModItems.PRETZEL));
                stacks.add(new ItemStack(ModItems.CHICKEN_SANDWICH));
                stacks.add(new ItemStack(ModItems.FISH_SANDWICH));
                stacks.add(new ItemStack(ModItems.TOMATO));
                stacks.add(new ItemStack(ModItems.CHERRY));
                stacks.add(new ItemStack(ModItems.FRIED_EGG));
                stacks.add(new ItemStack(ModItems.SAUSAGE));
                stacks.add(new ItemStack(ModItems.FRIED_SAUSAGE));
                stacks.add(new ItemStack(ModItems.FRIES));
                stacks.add(new ItemStack(ModItems.MANGO));
            })
            .build();
    // ...


    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
