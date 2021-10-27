package com.link.food.mod.Features;

import com.link.food.mod.registry.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;


public class SeedBlockFeature extends Feature<DefaultFeatureConfig> {
    public SeedBlockFeature(Codec<DefaultFeatureConfig> configCodec) {
        super(configCodec);
    }
    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        BlockPos topPos = context.getWorld().getTopPosition(Heightmap.Type.WORLD_SURFACE, context.getOrigin());
        Direction offset = Direction.NORTH;

        for (int y = 0; y < 1; y++) {
            context.getWorld().setBlockState(topPos.up(y).offset(offset), ModBlocks.SEED_BLOCK.getDefaultState(), 3);
        }

        return true;
    }

}
