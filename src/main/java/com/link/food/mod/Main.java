package com.link.food.mod;

import com.link.food.mod.registry.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.link.food.mod.registry.CropItems.*;
import static com.link.food.mod.registry.DrinkItems.*;
import static com.link.food.mod.registry.PizzaItems.*;
import static com.link.food.mod.registry.SushiItems.*;
import static com.link.food.mod.registry.SpicyItems.*;

public class Main implements ModInitializer {
    public static final StatusEffect SPICY = new SpicyEffect();



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
                stacks.add(new ItemStack(ModItems.FRUIT_SALAD));
                stacks.add(new ItemStack(ModItems.CHEESE));
                stacks.add(new ItemStack(ModItems.ONION));
                stacks.add(new ItemStack(ModItems.ORANGE));
                stacks.add(new ItemStack(ModItems.STRAWBERRY));
                stacks.add(new ItemStack(ModItems.GRAPE));
                stacks.add(new ItemStack(ModItems.CHOCOLATE));
                stacks.add(new ItemStack(ModItems.APPLE_PIE));
                stacks.add(new ItemStack(ModItems.RICE));
                stacks.add(new ItemStack(ModItems.LEMON));
            })
            .build();
    // ...

    public static final ItemGroup PIZZA_GROUP = FabricItemGroupBuilder.create(
            new Identifier("foodmod", "pizza"))
            .icon(() -> new ItemStack(PizzaItems.PEPPERONI_PIZZA))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(PIZZA_DOUGH));
                stacks.add(new ItemStack(TOMATO_SAUCE));
                stacks.add(new ItemStack(PEPPERONI));
                stacks.add(new ItemStack(OLIVE));
                stacks.add(new ItemStack(CHEESE_PIZZA));
                stacks.add(new ItemStack(PEPPERONI_PIZZA));
                stacks.add(new ItemStack(FISH_PIZZA));
                stacks.add(new ItemStack(PIZZA_MARGHERITA));
                stacks.add(new ItemStack(GREEK_PIZZA));
                stacks.add(new ItemStack(RAW_CHEESE_PIZZA));
                stacks.add(new ItemStack(RAW_PEPPERONI_PIZZA));
                stacks.add(new ItemStack(RAW_FISH_PIZZA));
                stacks.add(new ItemStack(RAW_PIZZA_MARGHARITA));
                stacks.add(new ItemStack(RAW_GREEK_PIZZA));

            })
            .build();
    // ...


    public static final ItemGroup SUSHI = FabricItemGroupBuilder.create(
            new Identifier("foodmod", "sushi"))
            .icon(() -> new ItemStack(VEGETABLE_SUSHI))
            .appendItems(stacks -> {
                  stacks.add(new ItemStack(ModItems.RICE));
                  stacks.add(new ItemStack(FISH_SUSHI));
                  stacks.add(new ItemStack(VEGETABLE_SUSHI));
                  stacks.add(new ItemStack(MANGO_SUSHI));
                  stacks.add(new ItemStack(EGG_SUSHI));
                  stacks.add(new ItemStack(NIGIRI));
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
                stacks.add(new ItemStack(RICE_SEEDS));
                stacks.add(new ItemStack(LEMON_SEEDS));
                stacks.add(new ItemStack(CHILI_SEEDS));
            })
            .build();
    // ...


    public static final ItemGroup DRINKS = FabricItemGroupBuilder.create(
            new Identifier("foodmod", "drinks"))
            .icon(() -> new ItemStack(DrinkItems.ORANGE_JUICE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CUP));
                stacks.add(new ItemStack(HOT_CHOCOLATE));
                stacks.add(new ItemStack(ORANGE_JUICE));
                stacks.add(new ItemStack(APPLE_JUICE));
                stacks.add(new ItemStack(GRAPE_JUICE));
                stacks.add(new ItemStack(PEACH_SLUSH));
                stacks.add(new ItemStack(LEMON_SLUSH));
                stacks.add(new ItemStack(STRAWBERRY_SLUSH));
                stacks.add(new ItemStack(ICETEA_PEACH));
                stacks.add(new ItemStack(ICETEA_STRAWBERRY));
                stacks.add(new ItemStack(ICETEA_LEMON));
                stacks.add(new ItemStack(LEMONADE));
                stacks.add(new ItemStack(ORANGE_LEMONADE));
            })
            .build();
    // ...

    public static final ItemGroup SPICYITEMS = FabricItemGroupBuilder.create(
            new Identifier("foodmod", "spicy"))
            .icon(() -> new ItemStack(CHILI_PEPPER))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CHILI_PEPPER));
                stacks.add(new ItemStack(CHILI_SEEDS));
                stacks.add(new ItemStack(JALAPENO));
                stacks.add(new ItemStack(JALAPENO_SEEDS));
            })
            .build();
    // ...

    @Override
    public void onInitialize() {
        PizzaItems.registerItems();
        ModItems.registerItems();
        SushiItems.registerItems();
        DrinkItems.registerItems();
        SpicyItems.registerItems();
        ModBlocks.registerBlocks();
        Registry.register(Registry.STATUS_EFFECT, new Identifier("foodmod", "spicy"), SPICY);
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
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "rice_crop"), RICE_CROP);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "rice_seeds"), RICE_SEEDS);
        Registry.register(Registry.BLOCK, new Identifier("foodmod","lemon_crop"), LEMON_CROP);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "lemon_seeds"), LEMON_SEEDS);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "chili_seeds"), CHILI_SEEDS);
        Registry.register(Registry.BLOCK, new Identifier("foodmod","chili_crop"), CHILI_CROP);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "jalapeno_seeds"), JALAPENO_SEEDS);
        Registry.register(Registry.BLOCK, new Identifier("foodmod","jalapeno_crop"), JALAPENO_CROP);
    }
}





//Link4real 2021