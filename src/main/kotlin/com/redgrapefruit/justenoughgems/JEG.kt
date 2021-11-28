package com.redgrapefruit.justenoughgems

import com.redgrapefruit.justenoughgems.registry.ItemRegistry
import net.fabricmc.api.ModInitializer

object JEG : ModInitializer {
    override fun onInitialize() {
        ItemRegistry.register()
    }
}
