package com.redgrapefruit.justenoughgems

import com.redgrapefruit.justenoughgems.init.*
import net.fabricmc.api.ModInitializer

object JEG : ModInitializer {
    override fun onInitialize() {
        JEGItems.register()
        JEGWeapons.register()
        JEGShields.register()
        JEGBlocks.register()
        JEGWorldgen.register()
    }
}
