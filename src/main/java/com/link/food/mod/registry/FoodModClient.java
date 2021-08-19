package com.link.food.mod.registry;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import static com.link.food.mod.registry.Crops.ONION_CROP;
import static com.link.food.mod.registry.Crops.TOMATO_CROP;

public class FoodModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TOMATO_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ONION_CROP);
        BlockRenders.defineRenders();

    }
}
