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

    // Andalusite
    val ANDALUSITE_BOOTS = GemBootsItem(JEGArmorMaterials.ANDALUSITE, GemArmorConfig.ANDALUSITE, 2)
    val ANDALUSITE_LEGGINGS = GemLeggingsItem(JEGArmorMaterials.ANDALUSITE, GemArmorConfig.ANDALUSITE, 2)
    val ANDALUSITE_CHESTPLATE = GemChestplateItem(JEGArmorMaterials.ANDALUSITE, GemArmorConfig.ANDALUSITE, 2)
    val ANDALUSITE_HELMET = GemHelmetItem(JEGArmorMaterials.ANDALUSITE, GemArmorConfig.ANDALUSITE, 2)

    override fun initialize() {
        register("quartz_boots", QUARTZ_BOOTS)
        register("quartz_leggings", QUARTZ_LEGGINGS)
        register("quartz_chestplate", QUARTZ_CHESTPLATE)
        register("quartz_helmet", QUARTZ_HELMET)

        register("andalusite_boots", ANDALUSITE_BOOTS)
        register("andalusite_leggings", ANDALUSITE_LEGGINGS)
        register("andalusite_chestplate", ANDALUSITE_CHESTPLATE)
        register("andalusite_helmet", ANDALUSITE_HELMET)
    }
}
