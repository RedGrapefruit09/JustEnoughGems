package com.redgrapefruit.justenoughgems.init

import com.redgrapefruit.justenoughgems.tool.GemPickaxeItem
import com.redgrapefruit.justenoughgems.tool.GemShovelItem
import com.redgrapefruit.justenoughgems.tool.GemToolConfig
import com.redgrapefruit.justenoughgems.util.IInitializer
import com.redgrapefruit.justenoughgems.util.register

object JEGTools : IInitializer {
    // Pickaxes
    val QUARTZ_PICKAXE = GemPickaxeItem(JEGToolMaterials.QUARTZ, 2, -2.0f, GemToolConfig.QUARTZ, 1)
    val ANDALUSITE_PICKAXE = GemPickaxeItem(JEGToolMaterials.ANDALUSITE, 3, -2.0f, GemToolConfig.ANDALUSITE, 2)
    val MORGANITE_PICKAXE = GemPickaxeItem(JEGToolMaterials.MORGANITE, 4, -2.0f, GemToolConfig.MORGANITE, 3)
    val TAAFFEITE_PICKAXE = GemPickaxeItem(JEGToolMaterials.TAAFFEITE, 5, -2.0f, GemToolConfig.TAAFFEITE, 4)
    val PINK_QUARTZ_PICKAXE = GemPickaxeItem(JEGToolMaterials.PINK_QUARTZ, 6, -2.0f, GemToolConfig.PINK_QUARTZ, 5)
    val EUCLASE_PICKAXE = GemPickaxeItem(JEGToolMaterials.EUCLASE, 7, -2.0f, GemToolConfig.EUCLASE, 6)
    val CHRYSOLITE_PICKAXE = GemPickaxeItem(JEGToolMaterials.CHRYSOLITE, 8, -2.0f, GemToolConfig.CHRYSOLITE, 7)
    val SAPPHIRE_PICKAXE = GemPickaxeItem(JEGToolMaterials.SAPPHIRE, 9, -2.0f, GemToolConfig.SAPPHIRE, 8)
    val HELIODORE_PICKAXE = GemPickaxeItem(JEGToolMaterials.HELIODORE, 10, -2.0f, GemToolConfig.HELIODORE, 9)
    val RUBY_PICKAXE = GemPickaxeItem(JEGToolMaterials.RUBY, 11, -2.0f, GemToolConfig.RUBY, 10)
    val AQUAMARINE_PICKAXE = GemPickaxeItem(JEGToolMaterials.AQUAMARINE, 12, -2.0f, GemToolConfig.AQUAMARINE, 11)
    val TANZANITE_PICKAXE = GemPickaxeItem(JEGToolMaterials.TANZANITE, 13, -2.0f, GemToolConfig.TANZANITE, 12)
    val TSAVORITE_PICKAXE = GemPickaxeItem(JEGToolMaterials.TSAVORITE, 14, -2.0f, GemToolConfig.TSAVORITE, 13)
    val VERDELITE_PICKAXE = GemPickaxeItem(JEGToolMaterials.VERDELITE, 15, -2.0f, GemToolConfig.VERDELITE, 14)
    val INDIGOLITE_PICKAXE = GemPickaxeItem(JEGToolMaterials.INDIGOLITE, 16, -2.0f, GemToolConfig.INDIGOLITE, 15)
    val OPAL_PICKAXE = GemPickaxeItem(JEGToolMaterials.OPAL, 17, -2.0f, GemToolConfig.OPAL, 16)

    // Shovels
    val QUARTZ_SHOVEL = GemShovelItem(JEGToolMaterials.QUARTZ, 1f, -1.1f, GemToolConfig.QUARTZ, 1)
    val ANDALUSITE_SHOVEL = GemShovelItem(JEGToolMaterials.ANDALUSITE, 1.5f, -1.1f, GemToolConfig.ANDALUSITE, 2)
    val MORGANITE_SHOVEL = GemShovelItem(JEGToolMaterials.MORGANITE, 2f, -1.1f, GemToolConfig.MORGANITE, 3)
    val TAAFFEITE_SHOVEL = GemShovelItem(JEGToolMaterials.TAAFFEITE, 2.5f, -1.1f, GemToolConfig.TAAFFEITE, 4)
    val PINK_QUARTZ_SHOVEL = GemShovelItem(JEGToolMaterials.PINK_QUARTZ, 3f, -1.1f, GemToolConfig.PINK_QUARTZ, 5)
    val EUCLASE_SHOVEL = GemShovelItem(JEGToolMaterials.EUCLASE, 3.5f, -1.1f, GemToolConfig.EUCLASE, 6)
    val CHRYSOLITE_SHOVEL = GemShovelItem(JEGToolMaterials.CHRYSOLITE, 4f, -1.1f, GemToolConfig.CHRYSOLITE, 7)
    val SAPPHIRE_SHOVEL = GemShovelItem(JEGToolMaterials.SAPPHIRE, 4.5f, -1.1f, GemToolConfig.SAPPHIRE, 8)
    val HELIODORE_SHOVEL = GemShovelItem(JEGToolMaterials.HELIODORE, 5f, -1.1f, GemToolConfig.HELIODORE, 9)
    val RUBY_SHOVEL = GemShovelItem(JEGToolMaterials.RUBY, 5.5f, -1.1f, GemToolConfig.RUBY, 10)
    val AQUAMARINE_SHOVEL = GemShovelItem(JEGToolMaterials.AQUAMARINE, 6f, -1.1f, GemToolConfig.AQUAMARINE, 11)
    val TANZANITE_SHOVEL = GemShovelItem(JEGToolMaterials.TANZANITE, 6.5f, -1.1f, GemToolConfig.TANZANITE, 12)
    val TSAVORITE_SHOVEL = GemShovelItem(JEGToolMaterials.TSAVORITE, 7f, -1.1f, GemToolConfig.TSAVORITE, 13)
    val VERDELITE_SHOVEL = GemShovelItem(JEGToolMaterials.VERDELITE, 7.5f, -1.1f, GemToolConfig.VERDELITE, 14)
    val INDIGOLITE_SHOVEL = GemShovelItem(JEGToolMaterials.INDIGOLITE, 8f, -1.1f, GemToolConfig.INDIGOLITE, 15)
    val OPAL_SHOVEL = GemShovelItem(JEGToolMaterials.OPAL, 8.5f, -1.1f, GemToolConfig.OPAL, 16)

    override fun initialize() {
        register("quartz_pickaxe", QUARTZ_PICKAXE)
        register("andalusite_pickaxe", ANDALUSITE_PICKAXE)
        register("morganite_pickaxe", MORGANITE_PICKAXE)
        register("taaffeite_pickaxe", TAAFFEITE_PICKAXE)
        register("pink_quartz_pickaxe", PINK_QUARTZ_PICKAXE)
        register("euclase_pickaxe", EUCLASE_PICKAXE)
        register("chrysolite_pickaxe", CHRYSOLITE_PICKAXE)
        register("sapphire_pickaxe", SAPPHIRE_PICKAXE)
        register("heliodore_pickaxe", HELIODORE_PICKAXE)
        register("ruby_pickaxe", RUBY_PICKAXE)
        register("aquamarine_pickaxe", AQUAMARINE_PICKAXE)
        register("tanzanite_pickaxe", TANZANITE_PICKAXE)
        register("tsavorite_pickaxe", TSAVORITE_PICKAXE)
        register("verdelite_pickaxe", VERDELITE_PICKAXE)
        register("indigolite_pickaxe", INDIGOLITE_PICKAXE)
        register("opal_pickaxe", OPAL_PICKAXE)

        register("quartz_shovel", QUARTZ_SHOVEL)
        register("andalusite_shovel", ANDALUSITE_SHOVEL)
        register("morganite_shovel", MORGANITE_SHOVEL)
        register("taaffeite_shovel", TAAFFEITE_SHOVEL)
        register("pink_quartz_shovel", PINK_QUARTZ_SHOVEL)
        register("euclase_shovel", EUCLASE_SHOVEL)
        register("chrysolite_shovel", CHRYSOLITE_SHOVEL)
        register("sapphire_shovel", SAPPHIRE_SHOVEL)
        register("heliodore_shovel", HELIODORE_SHOVEL)
        register("ruby_shovel", RUBY_SHOVEL)
        register("aquamarine_shovel", AQUAMARINE_SHOVEL)
        register("tanzanite_shovel", TANZANITE_SHOVEL)
        register("tsavorite_shovel", TSAVORITE_SHOVEL)
        register("verdelite_shovel", VERDELITE_SHOVEL)
        register("indigolite_shovel", INDIGOLITE_SHOVEL)
        register("opal_shovel", OPAL_SHOVEL)
    }
}
