package com.redgrapefruit.justenoughgems.init

import com.redgrapefruit.justenoughgems.armor.*
import com.redgrapefruit.justenoughgems.util.IInitializer
import com.redgrapefruit.justenoughgems.util.register

object JEGArmor : IInitializer {
    // Quartz
    val QUARTZ_BOOTS = GemBootsItem(JEGArmorMaterials.QUARTZ, GemArmorConfig.QUARTZ, 1)
    val QUARTZ_LEGGINGS = GemLeggingsItem(JEGArmorMaterials.QUARTZ, GemArmorConfig.QUARTZ, 1)
    val QUARTZ_CHESTPLATE = GemChestplateItem(JEGArmorMaterials.QUARTZ, GemArmorConfig.QUARTZ, 1)
    val QUARTZ_HELMET = GemHelmetItem(JEGArmorMaterials.QUARTZ, GemArmorConfig.QUARTZ, 1)

    override fun initialize() {
        register("quartz_boots", QUARTZ_BOOTS)
        register("quartz_leggings", QUARTZ_LEGGINGS)
        register("quartz_chestplate", QUARTZ_CHESTPLATE)
        register("quartz_helmet", QUARTZ_HELMET)
    }
}
