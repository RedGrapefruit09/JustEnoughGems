package com.redgrapefruit.justenoughgems

import com.redgrapefruit.justenoughgems.init.JEGBlocks
import com.redgrapefruit.justenoughgems.init.JEGItems
import com.redgrapefruit.justenoughgems.init.JEGShields
import com.redgrapefruit.justenoughgems.init.JEGWeapons
import net.fabricmc.api.ModInitializer

object JEG : ModInitializer {
    override fun onInitialize() {
        JEGItems.register()
        JEGWeapons.register()
        JEGShields.register()
        JEGBlocks.register()
    }
}
