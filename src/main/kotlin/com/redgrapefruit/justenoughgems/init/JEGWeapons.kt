package com.redgrapefruit.justenoughgems.init

import com.redgrapefruit.justenoughgems.tool.GemAxe
import com.redgrapefruit.justenoughgems.tool.GemSword
import com.redgrapefruit.justenoughgems.tool.GemWeaponConfig
import com.redgrapefruit.justenoughgems.util.IRegistry
import com.redgrapefruit.justenoughgems.util.toId
import net.minecraft.item.Item
import net.minecraft.util.registry.Registry

object JEGWeapons : IRegistry {
    // Swords (simple)
    val QUARTZ_SWORD = GemSword(JEGToolMaterials.QUARTZ, 3, -1.6f, GemWeaponConfig.QUARTZ, 1)
    val ANDALUSITE_SWORD = GemSword(JEGToolMaterials.ANDALUSITE, 5, -1.6f, GemWeaponConfig.QUARTZ, 2)
    val MORGANITE_SWORD = GemSword(JEGToolMaterials.MORGANITE, 7, -1.55f, GemWeaponConfig.QUARTZ, 3)
    val TAAFFEITE_SWORD = GemSword(JEGToolMaterials.TAAFFEITE, 9, -1.55f, GemWeaponConfig.QUARTZ, 4)
    val PINK_QUARTZ_SWORD = GemSword(JEGToolMaterials.PINK_QUARTZ, 11, -1.5f, GemWeaponConfig.QUARTZ, 5)
    val EUCLASE_SWORD = GemSword(JEGToolMaterials.EUCLASE, 13, -1.5f, GemWeaponConfig.QUARTZ, 6)
    val CHRYSOLITE_SWORD = GemSword(JEGToolMaterials.CHRYSOLITE, 15, -1.45f, GemWeaponConfig.QUARTZ, 7)
    val SAPPHIRE_SWORD = GemSword(JEGToolMaterials.SAPPHIRE, 17, -1.45f, GemWeaponConfig.QUARTZ, 8)
    val HELIODORE_SWORD = GemSword(JEGToolMaterials.HELIODORE, 19, -1.4f, GemWeaponConfig.QUARTZ, 9)
    val RUBY_SWORD = GemSword(JEGToolMaterials.RUBY, 21, -1.4f, GemWeaponConfig.QUARTZ, 10)
    val AQUAMARINE_SWORD = GemSword(JEGToolMaterials.AQUAMARINE, 23, -1.35f, GemWeaponConfig.QUARTZ, 11)
    val TANZANITE_SWORD = GemSword(JEGToolMaterials.TANZANITE, 25, -1.35f, GemWeaponConfig.QUARTZ, 12)
    val TSAVORITE_SWORD = GemSword(JEGToolMaterials.TSAVORITE, 27, -1.3f, GemWeaponConfig.QUARTZ, 13)
    val VERDELITE_SWORD = GemSword(JEGToolMaterials.VERDELITE, 29, -1.3f, GemWeaponConfig.QUARTZ, 14)
    val INDIGOLITE_SWORD = GemSword(JEGToolMaterials.INDIGOLITE, 31, -1.25f, GemWeaponConfig.QUARTZ, 15)
    val OPAL_SWORD = GemSword(JEGToolMaterials.OPAL, 33, -1.25f, GemWeaponConfig.QUARTZ, 16)

    // Axes (simple)
//    val QUARTZ_AXE = GemAxe(JEGToolMaterials.QUARTZ, 5f, -3f)
//    val ANDALUSITE_AXE = GemAxe(JEGToolMaterials.ANDALUSITE, 8f, -3f)
//    val MORGANITE_AXE = GemAxe(JEGToolMaterials.MORGANITE, 11f, -2.95f)
//    val TAAFFEITE_AXE = GemAxe(JEGToolMaterials.TAAFFEITE, 14f, -2.95f)
//    val PINK_QUARTZ_AXE = GemAxe(JEGToolMaterials.PINK_QUARTZ, 17f, -2.9f)
//    val EUCLASE_AXE = GemAxe(JEGToolMaterials.EUCLASE, 20f, -2.9f)
//    val CHRYSOLITE_AXE = GemAxe(JEGToolMaterials.CHRYSOLITE, 23f, -2.85f)
//    val SAPPHIRE_AXE = GemAxe(JEGToolMaterials.SAPPHIRE, 26f, -2.85f)
//    val HELIODORE_AXE = GemAxe(JEGToolMaterials.HELIODORE, 29f, -2.8f)
//    val RUBY_AXE = GemAxe(JEGToolMaterials.RUBY, 32f, -2.8f)
//    val AQUAMARINE_AXE = GemAxe(JEGToolMaterials.AQUAMARINE, 35f, -2.75f)
//    val TANZANITE_AXE = GemAxe(JEGToolMaterials.TANZANITE, 38f, -2.75f)
//    val TSAVORITE_AXE = GemAxe(JEGToolMaterials.TSAVORITE, 41f, -2.7f)
//    val VERDELITE_AXE = GemAxe(JEGToolMaterials.VERDELITE, 44f, -2.7f)
//    val INDIGOLITE_AXE = GemAxe(JEGToolMaterials.INDIGOLITE, 47f, -2.65f)
//    val OPAL_AXE = GemAxe(JEGToolMaterials.OPAL, 50f, -2.65f)

    override fun register() {
        register("quartz_sword", QUARTZ_SWORD)
        register("andalusite_sword", ANDALUSITE_SWORD)
        register("morganite_sword", MORGANITE_SWORD)
        register("taaffeite_sword", TAAFFEITE_SWORD)
        register("pink_quartz_sword", PINK_QUARTZ_SWORD)
        register("euclase_sword", EUCLASE_SWORD)
        register("chrysolite_sword", CHRYSOLITE_SWORD)
        register("sapphire_sword", SAPPHIRE_SWORD)
        register("heliodore_sword", HELIODORE_SWORD)
        register("ruby_sword", RUBY_SWORD)
        register("aquamarine_sword", AQUAMARINE_SWORD)
        register("tanzanite_sword", TANZANITE_SWORD)
        register("tsavorite_sword", TSAVORITE_SWORD)
        register("verdelite_sword", VERDELITE_SWORD)
        register("indigolite_sword", INDIGOLITE_SWORD)
        register("opal_sword", OPAL_SWORD)

//        register("quartz_axe", QUARTZ_AXE)
//        register("andalusite_axe", ANDALUSITE_AXE)
//        register("morganite_axe", MORGANITE_AXE)
//        register("taaffeite_axe", TAAFFEITE_AXE)
//        register("pink_quartz_axe", PINK_QUARTZ_AXE)
//        register("euclase_axe", EUCLASE_AXE)
//        register("chrysolite_axe", CHRYSOLITE_AXE)
//        register("sapphire_axe", SAPPHIRE_AXE)
//        register("heliodore_axe", HELIODORE_AXE)
//        register("ruby_axe", RUBY_AXE)
//        register("aquamarine_axe", AQUAMARINE_AXE)
//        register("tanzanite_axe", TANZANITE_AXE)
//        register("tsavorite_axe", TSAVORITE_AXE)
//        register("verdelite_axe", VERDELITE_AXE)
//        register("indigolite_axe", INDIGOLITE_AXE)
//        register("opal_axe", OPAL_AXE)
    }

    private fun register(name: String, item: Item) {
        Registry.register(Registry.ITEM, name.toId(), item)
    }
}
