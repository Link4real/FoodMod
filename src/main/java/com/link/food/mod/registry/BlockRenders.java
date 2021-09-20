package com.link.food.mod.registry;

import com.link.food.mod.Crops.Crops;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BlockRenders {

    public static void defineRenders() {
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.TOMATO_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.ONION_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.PEACH_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.ORANGE_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.STRAWBERRIE_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.GRAPE_CROP, RenderLayer.getCutoutMipped());
    }
}
