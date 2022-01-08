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

    // Pink Quartz
    val PINK_QUARTZ_BOOTS = GemBootsItem(JEGArmorMaterials.PINK_QUARTZ, GemArmorConfig.PINK_QUARTZ, 5)
    val PINK_QUARTZ_LEGGINGS = GemLeggingsItem(JEGArmorMaterials.PINK_QUARTZ, GemArmorConfig.PINK_QUARTZ, 5)
    val PINK_QUARTZ_CHESTPLATE = GemChestplateItem(JEGArmorMaterials.PINK_QUARTZ, GemArmorConfig.PINK_QUARTZ, 5)
    val PINK_QUARTZ_HELMET = GemHelmetItem(JEGArmorMaterials.PINK_QUARTZ, GemArmorConfig.PINK_QUARTZ, 5)

    // Euclase
    val EUCLASE_BOOTS = GemBootsItem(JEGArmorMaterials.EUCLASE, GemArmorConfig.EUCLASE, 6)
    val EUCLASE_LEGGINGS = GemLeggingsItem(JEGArmorMaterials.EUCLASE, GemArmorConfig.EUCLASE, 6)
    val EUCLASE_CHESTPLATE = GemChestplateItem(JEGArmorMaterials.EUCLASE, GemArmorConfig.EUCLASE, 6)
    val EUCLASE_HELMET = GemHelmetItem(JEGArmorMaterials.EUCLASE, GemArmorConfig.EUCLASE, 6)

    // Chrysolite
    val CHRYSOLITE_BOOTS = GemBootsItem(JEGArmorMaterials.CHRYSOLITE, GemArmorConfig.CHRYSOLITE, 7)
    val CHRYSOLITE_LEGGINGS = GemLeggingsItem(JEGArmorMaterials.CHRYSOLITE, GemArmorConfig.CHRYSOLITE, 7)
    val CHRYSOLITE_CHESTPLATE = GemChestplateItem(JEGArmorMaterials.CHRYSOLITE, GemArmorConfig.CHRYSOLITE, 7)
    val CHRYSOLITE_HELMET = GemHelmetItem(JEGArmorMaterials.CHRYSOLITE, GemArmorConfig.CHRYSOLITE, 7)

    // Sapphire
    val SAPPHIRE_BOOTS = GemBootsItem(JEGArmorMaterials.SAPPHIRE, GemArmorConfig.SAPPHIRE, 8)
    val SAPPHIRE_LEGGINGS = GemLeggingsItem(JEGArmorMaterials.SAPPHIRE, GemArmorConfig.SAPPHIRE, 8)
    val SAPPHIRE_CHESTPLATE = GemChestplateItem(JEGArmorMaterials.SAPPHIRE, GemArmorConfig.SAPPHIRE, 8)
    val SAPPHIRE_HELMET = GemHelmetItem(JEGArmorMaterials.SAPPHIRE, GemArmorConfig.SAPPHIRE, 8)

    // Heliodore
    val HELIODORE_BOOTS = GemBootsItem(JEGArmorMaterials.HELIODORE, GemArmorConfig.HELIODORE, 9)
    val HELIODORE_LEGGINGS = GemLeggingsItem(JEGArmorMaterials.HELIODORE, GemArmorConfig.HELIODORE, 9)
    val HELIODORE_CHESTPLATE = GemChestplateItem(JEGArmorMaterials.HELIODORE, GemArmorConfig.HELIODORE, 9)
    val HELIODORE_HELMET = GemHelmetItem(JEGArmorMaterials.HELIODORE, GemArmorConfig.HELIODORE, 9)

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

        register("pink_quartz_boots", PINK_QUARTZ_BOOTS)
        register("pink_quartz_leggings", PINK_QUARTZ_LEGGINGS)
        register("pink_quartz_chestplate", PINK_QUARTZ_CHESTPLATE)
        register("pink_quartz_helmet", PINK_QUARTZ_HELMET)

        register("euclase_boots", EUCLASE_BOOTS)
        register("euclase_leggings", EUCLASE_LEGGINGS)
        register("euclase_chestplate", EUCLASE_CHESTPLATE)
        register("euclase_helmet", EUCLASE_HELMET)

        register("chrysolite_boots", CHRYSOLITE_BOOTS)
        register("chrysolite_leggings", CHRYSOLITE_LEGGINGS)
        register("chrysolite_chestplate", CHRYSOLITE_CHESTPLATE)
        register("chrysolite_helmet", CHRYSOLITE_HELMET)

        register("sapphire_boots", SAPPHIRE_BOOTS)
        register("sapphire_leggings", SAPPHIRE_LEGGINGS)
        register("sapphire_chestplate", SAPPHIRE_CHESTPLATE)
        register("sapphire_helmet", SAPPHIRE_HELMET)

        register("heliodore_boots", HELIODORE_BOOTS)
        register("heliodore_leggings", HELIODORE_LEGGINGS)
        register("heliodore_chestplate", HELIODORE_CHESTPLATE)
        register("heliodore_helmet", HELIODORE_HELMET)
    }
}
