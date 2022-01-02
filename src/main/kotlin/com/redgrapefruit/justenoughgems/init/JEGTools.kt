package com.redgrapefruit.justenoughgems.init

import com.redgrapefruit.justenoughgems.tool.GemPickaxeItem
import com.redgrapefruit.justenoughgems.tool.GemToolConfig
import com.redgrapefruit.justenoughgems.util.IInitializer
import com.redgrapefruit.justenoughgems.util.register

object JEGTools : IInitializer {
    // Pickaxes
    val QUARTZ_PICKAXE = GemPickaxeItem(JEGToolMaterials.QUARTZ, 2, -2.0f, GemToolConfig.QUARTZ, 1)

    override fun initialize() {
        register("quartz_pickaxe", QUARTZ_PICKAXE)
    }
}
