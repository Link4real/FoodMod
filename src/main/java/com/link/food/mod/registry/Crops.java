package com.link.food.mod.registry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Crops implements ModInitializer {
    public static final CropBlock TOMATO_CROP = new CropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final CropBlock ONION_CROP = new CropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Item ONION_SEEDS = new AliasedBlockItem(Crops.ONION_CROP, new Item.Settings().group(ItemGroup.MISC));
    public static final Item TOMATO_SEEDS = new AliasedBlockItem(Crops.TOMATO_CROP, new Item.Settings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {

        Registry.register(Registry.BLOCK, new Identifier("foodmod", "tomato_crop"), TOMATO_CROP);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "tomato_seeds"), TOMATO_SEEDS);
        Registry.register(Registry.BLOCK, new Identifier("foodmod", "onion_crop"), ONION_CROP);
        Registry.register(Registry.ITEM, new Identifier("foodmod", "onion_seeds"), ONION_SEEDS);
    }
}