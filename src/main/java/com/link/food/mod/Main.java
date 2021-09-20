package com.link.food.mod;

import com.link.food.mod.registry.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.link.food.mod.Crops.Crops.*;

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
                stacks.add(new ItemStack(ModItems.ONION));
                stacks.add(new ItemStack(ModItems.ORANGE));
                stacks.add(new ItemStack(ModItems.STRAWBERRY));
                stacks.add(new ItemStack(ModItems.GRAPE));
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

    public static final ItemGroup SEEDS = FabricItemGroupBuilder.create(
            new Identifier("foodmod", "seeds"))
            .icon(() -> new ItemStack(TOMATO_SEEDS))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(TOMATO_SEEDS));
                stacks.add(new ItemStack(ONION_SEEDS));
                stacks.add(new ItemStack(ORANGE_SEEDS));
                stacks.add(new ItemStack(PEACH));
                stacks.add(new ItemStack(STRAWBERRIE_SEEDS));
                stacks.add(new ItemStack(GRAPE_SEEDS));
            })
            .build();
    // ...

    @Override
    public void onInitialize() {
        PizzaItems.registerItems();
        ModItems.registerItems();
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "tomato_crop"), TOMATO_CROP);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "tomato_seeds"), TOMATO_SEEDS);
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "onion_crop"), ONION_CROP);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "onion_seeds"), ONION_SEEDS);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "peach"), PEACH);
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "peach_crop"), PEACH_CROP);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "orange_seeds"), ORANGE_SEEDS);
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "orange_crop"), ORANGE_CROP);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "strawberry_seeds"), STRAWBERRIE_SEEDS);
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "strawberry_crop"), STRAWBERRIE_CROP);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "grape_seeds"), GRAPE_SEEDS);
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "grape_crop"), GRAPE_CROP);

    }
}





//Link4real 2021