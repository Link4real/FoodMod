package com.link.food.mod.Features;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

public class Features {

    private static final Feature<DefaultFeatureConfig> SEED_BLOCK = new SeedBlockFeature(DefaultFeatureConfig.CODEC);
    public static final ConfiguredFeature<?, ?> SEED_BLOCK_CONFIGURED = SEED_BLOCK.configure(FeatureConfig.DEFAULT)
            .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(20)));

    public static void register() {
        Registry.register(Registry.FEATURE, new Identifier("foodmod", "seedblock_feature"), SEED_BLOCK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("foodmod", "seedblock"), SEED_BLOCK_CONFIGURED);
    }
}