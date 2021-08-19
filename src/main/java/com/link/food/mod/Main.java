package com.link.food.mod;

import com.link.food.mod.registry.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.link.food.mod.registry.Crops.TOMATO_CROP;
import static com.link.food.mod.registry.Crops.TOMATO_SEEDS;

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
                stacks.add(new ItemStack(ModItems.PRETZEL_DOUGH));
                stacks.add(new ItemStack(ModItems.CHICKEN_SANDWICH));
                stacks.add(new ItemStack(ModItems.FISH_SANDWICH));
                stacks.add(new ItemStack(ModItems.TOMATO));
                stacks.add(new ItemStack(ModItems.CHERRY));
                stacks.add(new ItemStack(ModItems.FRIED_EGG));
                stacks.add(new ItemStack(ModItems.SAUSAGE));
                stacks.add(new ItemStack(ModItems.FRIED_SAUSAGE));
                stacks.add(new ItemStack(ModItems.FRIES));
                stacks.add(new ItemStack(ModItems.MANGO));
                stacks.add(new ItemStack(ModItems.BREAD_DOUGH));
                stacks.add(new ItemStack(ModItems.TOAST));
                stacks.add(new ItemStack(ModItems.WAFFLE_DOUGH));
                stacks.add(new ItemStack(ModItems.WAFFLE));
                stacks.add(new ItemStack(ModItems.PANCAKE_DOUGH));
                stacks.add(new ItemStack(ModItems.PANCAKE));
                stacks.add(new ItemStack(ModItems.CUPCAKE));
                stacks.add(new ItemStack(ModItems.CUPCAKE_DOUGH));
                stacks.add(new ItemStack(ModItems.KETCHUP));
                stacks.add(new ItemStack(ModItems.HOTDOG));
                stacks.add(new ItemStack(ModItems.CEREAL));
                stacks.add(new ItemStack(ModItems.CHEESE));
                stacks.add(new ItemStack(TOMATO_SEEDS));
            })
            .build();
    // ...

    public static final ItemGroup PIZZA_GROUP = FabricItemGroupBuilder.create(
            new Identifier("foodmod", "pizza"))
            .icon(() -> new ItemStack(PizzaItems.PEPPERONI_PIZZA))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(PizzaItems.PIZZA_DOUGH));
                stacks.add(new ItemStack(PizzaItems.TOMATO_SAUCE));
                stacks.add(new ItemStack(PizzaItems.PEPPERONI));
                stacks.add(new ItemStack(PizzaItems.OLIVE));
                stacks.add(new ItemStack(PizzaItems.CHEESE_PIZZA));
                stacks.add(new ItemStack(PizzaItems.PEPPERONI_PIZZA));
                stacks.add(new ItemStack(PizzaItems.FISH_PIZZA));
                stacks.add(new ItemStack(PizzaItems.PIZZA_MARGHERITA));
                stacks.add(new ItemStack(PizzaItems.GREEK_PIZZA));
                stacks.add(new ItemStack(PizzaItems.RAW_CHEESE_PIZZA));
                stacks.add(new ItemStack(PizzaItems.RAW_PEPPERONI_PIZZA));
                stacks.add(new ItemStack(PizzaItems.RAW_FISH_PIZZA));
                stacks.add(new ItemStack(PizzaItems.RAW_PIZZA_MARGHARITA));
                stacks.add(new ItemStack(PizzaItems.RAW_GREEK_PIZZA));

            })
            .build();
    // ...

    @Override
    public void onInitialize() {
        PizzaItems.registerItems();
        ModItems.registerItems();
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "tomato_crop"), TOMATO_CROP);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "tomato_seeds"), TOMATO_SEEDS);



    }
}





//Link4real 2021