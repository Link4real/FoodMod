package com.link.food.mod.registry;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import static com.link.food.mod.Crops.Crops.*;

public class FoodModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TOMATO_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ONION_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), PEACH_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ORANGE_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), STRAWBERRIE_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(), GRAPE_CROP);
        BlockRenders.defineRenders();
    }
}
