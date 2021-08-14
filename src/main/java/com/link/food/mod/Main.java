package com.link.food.mod;

import com.link.food.mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    public static final String MOD_ID = "foodmod";



    @Override
    public void onInitialize() {
        ModItems.registerItems();

    }
}
