package com.link.food.mod.registry;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BlockRenders {

    public static void defineRenders() {
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.TOMATO_CROP, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(Crops.ONION_CROP, RenderLayer.getCutoutMipped());

    }
}
