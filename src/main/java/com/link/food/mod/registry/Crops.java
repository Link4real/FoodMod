package com.link.food.mod.registry;

import com.link.food.mod.Crops.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Crops implements ModInitializer {
    public static final TomatoCropBlock TOMATO_CROP = new TomatoCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final CropBlockOnion ONION_CROP = new CropBlockOnion(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final CropBlockPeach PEACH_CROP = new CropBlockPeach(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final OrangeCropBlock ORANGE_CROP = new OrangeCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final CropBlockStrawberries STRAWBERRIE_CROP = new CropBlockStrawberries(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final CropBlockGrape GRAPE_CROP = new CropBlockGrape(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final CropBlockRice RICE_CROP = new CropBlockRice(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Item ONION_SEEDS = new AliasedBlockItem(Crops.ONION_CROP, new Item.Settings().group(ItemGroup.MISC));
    public static final Item TOMATO_SEEDS = new AliasedBlockItem(Crops.TOMATO_CROP, new Item.Settings().group(ItemGroup.MISC));
    public static final Item PEACH = new AliasedBlockItem(Crops.PEACH_CROP, new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(4f).build()));
    public static final Item ORANGE_SEEDS = new AliasedBlockItem(Crops.ORANGE_CROP, new Item.Settings().group(ItemGroup.MISC));
    public static final Item STRAWBERRIE_SEEDS = new AliasedBlockItem(Crops.STRAWBERRIE_CROP, new Item.Settings().group(ItemGroup.MISC));
    public static final Item GRAPE_SEEDS = new AliasedBlockItem(Crops.GRAPE_CROP, new Item.Settings().group(ItemGroup.MISC));
    public static final Item RICE_SEEDS = new AliasedBlockItem(Crops.RICE_CROP, new Item.Settings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {

        Registry.register(Registry.BLOCK, new Identifier("foodmod", "tomato_crop"), TOMATO_CROP);
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "onion_crop"), ONION_CROP);
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "peach_crop"), PEACH_CROP);
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "orange_crop"), ORANGE_CROP);
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "strawberry_crop"), STRAWBERRIE_CROP);
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "grape_crop"), GRAPE_CROP);
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "rice_crop"), RICE_CROP);

        Registry.register(Registry.ITEM, new Identifier("foodmod", "onion_seeds"), ONION_SEEDS);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "tomato_seeds"), TOMATO_SEEDS);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "peach"), PEACH);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "orange_seeds"), ORANGE_SEEDS);
        Registry.register(Registry.ITEM ,new Identifier("foodmod", "strawberry_seeds"), STRAWBERRIE_SEEDS);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "grape_seeds"), GRAPE_SEEDS);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "rice_seeds"), RICE_SEEDS);
    }
}