package com.link.food.mod.registry;

import com.link.food.mod.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block SEED_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.0f, 5f).sounds(BlockSoundGroup.STONE));


    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier("foodmod", "seed_block"), SEED_BLOCK);

    }
}
