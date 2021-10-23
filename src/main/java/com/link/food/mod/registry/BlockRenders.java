package com.link.food.mod.registry;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BlockRenders {

    public static void defineRenders() {
        BlockRenderLayerMap.INSTANCE.putBlock(CropItems.TOMATO_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(CropItems.ONION_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(CropItems.PEACH_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(CropItems.ORANGE_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(CropItems.STRAWBERRIE_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(CropItems.GRAPE_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(CropItems.RICE_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(CropItems.LEMON_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(CropItems.CHILI_CROP, RenderLayer.getCutoutMipped());
    }
}
