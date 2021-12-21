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
    val ANDALUSITE_SWORD = GemSword(JEGToolMaterials.ANDALUSITE, 5, -1.6f, GemWeaponConfig.ANDALUSITE, 2)
    val MORGANITE_SWORD = GemSword(JEGToolMaterials.MORGANITE, 7, -1.55f, GemWeaponConfig.MORGANITE, 3)
    val TAAFFEITE_SWORD = GemSword(JEGToolMaterials.TAAFFEITE, 9, -1.55f, GemWeaponConfig.TAAFFEITE, 4)
    val PINK_QUARTZ_SWORD = GemSword(JEGToolMaterials.PINK_QUARTZ, 11, -1.5f, GemWeaponConfig.PINK_QUARTZ, 5)
    val EUCLASE_SWORD = GemSword(JEGToolMaterials.EUCLASE, 13, -1.5f, GemWeaponConfig.EUCLASE, 6)
    val CHRYSOLITE_SWORD = GemSword(JEGToolMaterials.CHRYSOLITE, 15, -1.45f, GemWeaponConfig.CHRYSOLITE, 7)
    val SAPPHIRE_SWORD = GemSword(JEGToolMaterials.SAPPHIRE, 17, -1.45f, GemWeaponConfig.SAPPHIRE, 8)
    val HELIODORE_SWORD = GemSword(JEGToolMaterials.HELIODORE, 19, -1.4f, GemWeaponConfig.HELIODORE, 9)
    val RUBY_SWORD = GemSword(JEGToolMaterials.RUBY, 21, -1.4f, GemWeaponConfig.RUBY, 10)
    val AQUAMARINE_SWORD = GemSword(JEGToolMaterials.AQUAMARINE, 23, -1.35f, GemWeaponConfig.AQUAMARINE, 11)
    val TANZANITE_SWORD = GemSword(JEGToolMaterials.TANZANITE, 25, -1.35f, GemWeaponConfig.TANZANITE, 12)
    val TSAVORITE_SWORD = GemSword(JEGToolMaterials.TSAVORITE, 27, -1.3f, GemWeaponConfig.TSAVORITE, 13)
    val VERDELITE_SWORD = GemSword(JEGToolMaterials.VERDELITE, 29, -1.3f, GemWeaponConfig.VERDELITE, 14)
    val INDIGOLITE_SWORD = GemSword(JEGToolMaterials.INDIGOLITE, 31, -1.25f, GemWeaponConfig.INDIGOLITE, 15)
    val OPAL_SWORD = GemSword(JEGToolMaterials.OPAL, 33, -1.25f, GemWeaponConfig.OPAL, 16)

    // Axes (simple)
    val QUARTZ_AXE = GemAxe(JEGToolMaterials.QUARTZ, 5f, -3f, GemWeaponConfig.QUARTZ, 1)
    val ANDALUSITE_AXE = GemAxe(JEGToolMaterials.ANDALUSITE, 8f, -3f, GemWeaponConfig.ANDALUSITE, 2)
    val MORGANITE_AXE = GemAxe(JEGToolMaterials.MORGANITE, 11f, -2.95f, GemWeaponConfig.MORGANITE, 3)
    val TAAFFEITE_AXE = GemAxe(JEGToolMaterials.TAAFFEITE, 14f, -2.95f, GemWeaponConfig.TAAFFEITE, 4)
    val PINK_QUARTZ_AXE = GemAxe(JEGToolMaterials.PINK_QUARTZ, 17f, -2.9f, GemWeaponConfig.PINK_QUARTZ, 5)
    val EUCLASE_AXE = GemAxe(JEGToolMaterials.EUCLASE, 20f, -2.9f, GemWeaponConfig.EUCLASE, 6)
    val CHRYSOLITE_AXE = GemAxe(JEGToolMaterials.CHRYSOLITE, 23f, -2.85f, GemWeaponConfig.CHRYSOLITE, 7)
    val SAPPHIRE_AXE = GemAxe(JEGToolMaterials.SAPPHIRE, 26f, -2.85f, GemWeaponConfig.SAPPHIRE, 8)
    val HELIODORE_AXE = GemAxe(JEGToolMaterials.HELIODORE, 29f, -2.8f, GemWeaponConfig.HELIODORE, 9)
    val RUBY_AXE = GemAxe(JEGToolMaterials.RUBY, 32f, -2.8f, GemWeaponConfig.RUBY, 10)
    val AQUAMARINE_AXE = GemAxe(JEGToolMaterials.AQUAMARINE, 35f, -2.75f, GemWeaponConfig.AQUAMARINE, 11)
    val TANZANITE_AXE = GemAxe(JEGToolMaterials.TANZANITE, 38f, -2.75f, GemWeaponConfig.TANZANITE, 12)
    val TSAVORITE_AXE = GemAxe(JEGToolMaterials.TSAVORITE, 41f, -2.7f, GemWeaponConfig.TSAVORITE, 13)
    val VERDELITE_AXE = GemAxe(JEGToolMaterials.VERDELITE, 44f, -2.7f, GemWeaponConfig.VERDELITE, 14)
    val INDIGOLITE_AXE = GemAxe(JEGToolMaterials.INDIGOLITE, 47f, -2.65f, GemWeaponConfig.INDIGOLITE, 15)
    val OPAL_AXE = GemAxe(JEGToolMaterials.OPAL, 50f, -2.65f, GemWeaponConfig.OPAL, 16)

    // Double swords
    val QUARTZ_DOUBLE_SWORD = GemSword(JEGToolMaterials.QUARTZ, 12, -2.0f, GemWeaponConfig.QUARTZ, 1)
    val ANDALUSITE_DOUBLE_SWORD = GemSword(JEGToolMaterials.ANDALUSITE, 15, -2.0f, GemWeaponConfig.ANDALUSITE, 2)
    val MORGANITE_DOUBLE_SWORD = GemSword(JEGToolMaterials.MORGANITE, 18, -1.95f, GemWeaponConfig.MORGANITE, 3)
    val TAAFFEITE_DOUBLE_SWORD = GemSword(JEGToolMaterials.TAAFFEITE, 21, -1.95f, GemWeaponConfig.TAAFFEITE, 4)
    val PINK_QUARTZ_DOUBLE_SWORD = GemSword(JEGToolMaterials.PINK_QUARTZ, 24, -1.9f, GemWeaponConfig.PINK_QUARTZ, 5)
    val EUCLASE_DOUBLE_SWORD = GemSword(JEGToolMaterials.EUCLASE, 27, -1.9f, GemWeaponConfig.EUCLASE, 6)
    val CHRYSOLITE_DOUBLE_SWORD = GemSword(JEGToolMaterials.CHRYSOLITE, 30, -1.85f, GemWeaponConfig.CHRYSOLITE, 7)
    val SAPPHIRE_DOUBLE_SWORD = GemSword(JEGToolMaterials.SAPPHIRE, 33, -1.85f, GemWeaponConfig.SAPPHIRE, 8)
    val HELIODORE_DOUBLE_SWORD = GemSword(JEGToolMaterials.HELIODORE, 36, -1.8f, GemWeaponConfig.HELIODORE, 9)
    val RUBY_DOUBLE_SWORD = GemSword(JEGToolMaterials.RUBY, 39, -1.8f, GemWeaponConfig.RUBY, 10)
    val AQUAMARINE_DOUBLE_SWORD = GemSword(JEGToolMaterials.AQUAMARINE, 42, -1.75f, GemWeaponConfig.AQUAMARINE, 11)
    val TANZANITE_DOUBLE_SWORD = GemSword(JEGToolMaterials.TANZANITE, 45, -1.75f, GemWeaponConfig.TANZANITE, 12)
    val TSAVORITE_DOUBLE_SWORD = GemSword(JEGToolMaterials.TSAVORITE, 48, -1.7f, GemWeaponConfig.TSAVORITE, 13)
    val VERDELITE_DOUBLE_SWORD = GemSword(JEGToolMaterials.VERDELITE, 51, -1.7f, GemWeaponConfig.VERDELITE, 14)
    val INDIGOLITE_DOUBLE_SWORD = GemSword(JEGToolMaterials.INDIGOLITE, 54, -1.65f, GemWeaponConfig.INDIGOLITE, 15)
    val OPAL_DOUBLE_SWORD = GemSword(JEGToolMaterials.OPAL, 57, -1.65f, GemWeaponConfig.OPAL, 16)

    // Double axes
    val QUARTZ_DOUBLE_AXE = GemAxe(JEGToolMaterials.QUARTZ, 15f, -3.2f, GemWeaponConfig.QUARTZ, 1)
    val ANDALUSITE_DOUBLE_AXE = GemAxe(JEGToolMaterials.ANDALUSITE, 20f, -3.2f, GemWeaponConfig.ANDALUSITE, 2)
    val MORGANITE_DOUBLE_AXE = GemAxe(JEGToolMaterials.MORGANITE, 25f, -3.2f, GemWeaponConfig.MORGANITE, 3)
    val TAAFFEITE_DOUBLE_AXE = GemAxe(JEGToolMaterials.TAAFFEITE, 30f, -3.15f, GemWeaponConfig.TAAFFEITE, 4)
    val PINK_QUARTZ_DOUBLE_AXE = GemAxe(JEGToolMaterials.PINK_QUARTZ, 35f, -3.15f, GemWeaponConfig.PINK_QUARTZ, 5)
    val EUCLASE_DOUBLE_AXE = GemAxe(JEGToolMaterials.EUCLASE, 40f, -3.15f, GemWeaponConfig.EUCLASE, 6)
    val CHRYSOLITE_DOUBLE_AXE = GemAxe(JEGToolMaterials.CHRYSOLITE, 45f, -3.1f, GemWeaponConfig.CHRYSOLITE, 7)
    val SAPPHIRE_DOUBLE_AXE = GemAxe(JEGToolMaterials.SAPPHIRE, 50f, -3.1f, GemWeaponConfig.SAPPHIRE, 8)
    val HELIODORE_DOUBLE_AXE = GemAxe(JEGToolMaterials.HELIODORE, 55f, -3.1f, GemWeaponConfig.HELIODORE, 9)
    val RUBY_DOUBLE_AXE = GemAxe(JEGToolMaterials.RUBY, 60f, -3.05f, GemWeaponConfig.RUBY, 10)
    val AQUAMARINE_DOUBLE_AXE = GemAxe(JEGToolMaterials.AQUAMARINE, 65f, -3.05f, GemWeaponConfig.AQUAMARINE, 11)
    val TANZANITE_DOUBLE_AXE = GemAxe(JEGToolMaterials.TANZANITE, 70f, -3.05f, GemWeaponConfig.TANZANITE, 12)
    val TSAVORITE_DOUBLE_AXE = GemAxe(JEGToolMaterials.TSAVORITE, 75f, -3.0f, GemWeaponConfig.TSAVORITE, 13)
    val VERDELITE_DOUBLE_AXE = GemAxe(JEGToolMaterials.VERDELITE, 80f, -3.0f, GemWeaponConfig.VERDELITE, 14)
    val INDIGOLITE_DOUBLE_AXE = GemAxe(JEGToolMaterials.INDIGOLITE, 85f, -3.0f, GemWeaponConfig.INDIGOLITE, 15)
    val OPAL_DOUBLE_AXE = GemAxe(JEGToolMaterials.OPAL, 90f, -2.95f, GemWeaponConfig.OPAL, 16)

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

        register("quartz_axe", QUARTZ_AXE)
        register("andalusite_axe", ANDALUSITE_AXE)
        register("morganite_axe", MORGANITE_AXE)
        register("taaffeite_axe", TAAFFEITE_AXE)
        register("pink_quartz_axe", PINK_QUARTZ_AXE)
        register("euclase_axe", EUCLASE_AXE)
        register("chrysolite_axe", CHRYSOLITE_AXE)
        register("sapphire_axe", SAPPHIRE_AXE)
        register("heliodore_axe", HELIODORE_AXE)
        register("ruby_axe", RUBY_AXE)
        register("aquamarine_axe", AQUAMARINE_AXE)
        register("tanzanite_axe", TANZANITE_AXE)
        register("tsavorite_axe", TSAVORITE_AXE)
        register("verdelite_axe", VERDELITE_AXE)
        register("indigolite_axe", INDIGOLITE_AXE)
        register("opal_axe", OPAL_AXE)

        register("quartz_double_sword", QUARTZ_DOUBLE_SWORD)
        register("andalusite_double_sword", ANDALUSITE_DOUBLE_SWORD)
        register("morganite_double_sword", MORGANITE_DOUBLE_SWORD)
        register("taaffeite_double_sword", TAAFFEITE_DOUBLE_SWORD)
        register("pink_quartz_double_sword", PINK_QUARTZ_DOUBLE_SWORD)
        register("euclase_double_sword", EUCLASE_DOUBLE_SWORD)
        register("chrysolite_double_sword", CHRYSOLITE_DOUBLE_SWORD)
        register("sapphire_double_sword", SAPPHIRE_DOUBLE_SWORD)
        register("heliodore_double_sword", HELIODORE_DOUBLE_SWORD)
        register("ruby_double_sword", RUBY_DOUBLE_SWORD)
        register("aquamarine_double_sword", AQUAMARINE_DOUBLE_SWORD)
        register("tanzanite_double_sword", TANZANITE_DOUBLE_SWORD)
        register("tsavorite_double_sword", TSAVORITE_DOUBLE_SWORD)
        register("verdelite_double_sword", VERDELITE_DOUBLE_SWORD)
        register("indigolite_double_sword", INDIGOLITE_DOUBLE_SWORD)
        register("opal_double_sword", OPAL_DOUBLE_SWORD)

        register("quartz_double_axe", QUARTZ_DOUBLE_AXE)
        register("andalusite_double_axe", ANDALUSITE_DOUBLE_AXE)
        register("morganite_double_axe", MORGANITE_DOUBLE_AXE)
        register("taaffeite_double_axe", TAAFFEITE_DOUBLE_AXE)
        register("pink_quartz_double_axe", PINK_QUARTZ_DOUBLE_AXE)
        register("euclase_double_axe", EUCLASE_DOUBLE_AXE)
        register("chrysolite_double_axe", CHRYSOLITE_DOUBLE_AXE)
        register("sapphire_double_axe", SAPPHIRE_DOUBLE_AXE)
        register("heliodore_double_axe", HELIODORE_DOUBLE_AXE)
        register("ruby_double_axe", RUBY_DOUBLE_AXE)
        register("aquamarine_double_axe", AQUAMARINE_DOUBLE_AXE)
        register("tanzanite_double_axe", TANZANITE_DOUBLE_AXE)
        register("tsavorite_double_axe", TSAVORITE_DOUBLE_AXE)
        register("verdelite_double_axe", VERDELITE_DOUBLE_AXE)
        register("indigolite_double_axe", INDIGOLITE_DOUBLE_AXE)
        register("opal_double_axe", OPAL_DOUBLE_AXE)
    }

    private fun register(name: String, item: Item) {
        Registry.register(Registry.ITEM, name.toId(), item)
    }
}
