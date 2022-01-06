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

    // Morganite
    val MORGANITE_BOOTS = GemBootsItem(JEGArmorMaterials.MORGANITE, GemArmorConfig.MORGANITE, 3)
    val MORGANITE_LEGGINGS = GemLeggingsItem(JEGArmorMaterials.MORGANITE, GemArmorConfig.MORGANITE, 3)
    val MORGANITE_CHESTPLATE = GemChestplateItem(JEGArmorMaterials.MORGANITE, GemArmorConfig.MORGANITE, 3)
    val MORGANITE_HELMET = GemHelmetItem(JEGArmorMaterials.MORGANITE, GemArmorConfig.MORGANITE, 3)

    // Taaffeite
    val TAAFFEITE_BOOTS = GemBootsItem(JEGArmorMaterials.TAAFFEITE, GemArmorConfig.TAAFFEITE, 4)
    val TAAFFEITE_LEGGINGS = GemLeggingsItem(JEGArmorMaterials.TAAFFEITE, GemArmorConfig.TAAFFEITE, 4)
    val TAAFFEITE_CHESTPLATE = GemChestplateItem(JEGArmorMaterials.TAAFFEITE, GemArmorConfig.TAAFFEITE, 4)
    val TAAFFEITE_HELMET = GemHelmetItem(JEGArmorMaterials.TAAFFEITE, GemArmorConfig.TAAFFEITE, 4)

    override fun initialize() {
        register("quartz_boots", QUARTZ_BOOTS)
        register("quartz_leggings", QUARTZ_LEGGINGS)
        register("quartz_chestplate", QUARTZ_CHESTPLATE)
        register("quartz_helmet", QUARTZ_HELMET)

        register("andalusite_boots", ANDALUSITE_BOOTS)
        register("andalusite_leggings", ANDALUSITE_LEGGINGS)
        register("andalusite_chestplate", ANDALUSITE_CHESTPLATE)
        register("andalusite_helmet", ANDALUSITE_HELMET)

        register("morganite_boots", MORGANITE_BOOTS)
        register("morganite_leggings", MORGANITE_LEGGINGS)
        register("morganite_chestplate", MORGANITE_CHESTPLATE)
        register("morganite_helmet", MORGANITE_HELMET)

        register("taaffeite_boots", TAAFFEITE_BOOTS)
        register("taaffeite_leggings", TAAFFEITE_LEGGINGS)
        register("taaffeite_chestplate", TAAFFEITE_CHESTPLATE)
        register("taaffeite_helmet", TAAFFEITE_HELMET)
    }
}
