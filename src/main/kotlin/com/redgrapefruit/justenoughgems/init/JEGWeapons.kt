package com.redgrapefruit.justenoughgems.init

import com.redgrapefruit.justenoughgems.util.IRegistry
import com.redgrapefruit.justenoughgems.util.defaultItemSettings
import com.redgrapefruit.justenoughgems.util.toId
import net.minecraft.item.Item
import net.minecraft.item.SwordItem
import net.minecraft.util.registry.Registry

object JEGWeapons : IRegistry {
    // Swords (simple)
    val QUARTZ_SWORD = SwordItem(JEGToolMaterials.QUARTZ, 3, -1.6f, defaultItemSettings)
    val ANDALUSITE_SWORD = SwordItem(JEGToolMaterials.ANDALUSITE, 5, -1.6f, defaultItemSettings)
    val MORGANITE_SWORD = SwordItem(JEGToolMaterials.MORGANITE, 7, -1.55f, defaultItemSettings)
    val TAAFFEITE_SWORD = SwordItem(JEGToolMaterials.TAAFFEITE, 9, -1.55f, defaultItemSettings)
    val PINK_QUARTZ_SWORD = SwordItem(JEGToolMaterials.PINK_QUARTZ, 11, -1.5f, defaultItemSettings)
    val EUCLASE_SWORD = SwordItem(JEGToolMaterials.EUCLASE, 13, -1.5f, defaultItemSettings)
    val CHRYSOLITE_SWORD = SwordItem(JEGToolMaterials.CHRYSOLITE, 15, -1.45f, defaultItemSettings)
    val SAPPHIRE_SWORD = SwordItem(JEGToolMaterials.SAPPHIRE, 17, -1.45f, defaultItemSettings)
    val HELIODORE_SWORD = SwordItem(JEGToolMaterials.HELIODORE, 19, -1.4f, defaultItemSettings)
    val RUBY_SWORD = SwordItem(JEGToolMaterials.RUBY, 21, -1.4f, defaultItemSettings)
    val AQUAMARINE_SWORD = SwordItem(JEGToolMaterials.AQUAMARINE, 23, -1.35f, defaultItemSettings)
    val TANZANITE_SWORD = SwordItem(JEGToolMaterials.TANZANITE, 25, -1.35f, defaultItemSettings)
    val TSAVORITE_SWORD = SwordItem(JEGToolMaterials.TSAVORITE, 27, -1.3f, defaultItemSettings)
    val VERDELITE_SWORD = SwordItem(JEGToolMaterials.VERDELITE, 29, -1.3f, defaultItemSettings)
    val INDIGOLITE_SWORD = SwordItem(JEGToolMaterials.INDIGOLITE, 31, -1.25f, defaultItemSettings)
    val OPAL_SWORD = SwordItem(JEGToolMaterials.OPAL, 33, -1.25f, defaultItemSettings)

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
    }

    private fun register(name: String, item: Item) {
        Registry.register(Registry.ITEM, name.toId(), item)
    }
}
