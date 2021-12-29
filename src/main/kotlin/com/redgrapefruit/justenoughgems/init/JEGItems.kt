package com.redgrapefruit.justenoughgems.init

import com.redgrapefruit.justenoughgems.item.*
import com.redgrapefruit.justenoughgems.util.IRegistry
import com.redgrapefruit.justenoughgems.util.toId
import com.redgrapefruit.justenoughgems.util.toLocalId
import net.fabricmc.fabric.api.`object`.builder.v1.client.model.FabricModelPredicateProviderRegistry
import net.minecraft.item.Item
import net.minecraft.util.registry.Registry

object JEGItems : IRegistry {
    // Gems
    val QUARTZ_GEM = GemItem(GemItemConfig.QUARTZ, 1)
    val ANDALUSITE_GEM = GemItem(GemItemConfig.ANDALUSITE, 2)
    val MORGANITE_GEM = GemItem(GemItemConfig.MORGANITE, 3)
    val TAAFFEITE_GEM = GemItem(GemItemConfig.TAAFFEITE, 4)
    val PINK_QUARTZ_GEM = GemItem(GemItemConfig.PINK_QUARTZ, 5)
    val EUCLASE_GEM = GemItem(GemItemConfig.EUCLASE, 6)
    val CHRYSOLITE_GEM = GemItem(GemItemConfig.CHRYSOLITE, 7)
    val SAPPHIRE_GEM = GemItem(GemItemConfig.SAPPHIRE, 8)
    val HELIODORE_GEM = GemItem(GemItemConfig.HELIODORE, 9)
    val RUBY_GEM = GemItem(GemItemConfig.RUBY, 10)
    val AQUAMARINE_GEM = GemItem(GemItemConfig.AQUAMARINE, 11)
    val TANZANITE_GEM = GemItem(GemItemConfig.TANZANITE, 12)
    val TSAVORITE_GEM = GemItem(GemItemConfig.TSAVORITE, 13)
    val VERDELITE_GEM = GemItem(GemItemConfig.VERDELITE, 14)
    val INDIGOLITE_GEM = GemItem(GemItemConfig.INDIGOLITE, 15)
    val OPAL_GEM = GemItem(GemItemConfig.OPAL, 16)

    // Amulets
    val QUARTZ_AMULET = GemAmulet(GemAmuletConfig.QUARTZ, 1)
    val ANDALUSITE_AMULET = GemAmulet(GemAmuletConfig.ANDALUSITE, 2)
    val MORGANITE_AMULET = GemAmulet(GemAmuletConfig.MORGANITE, 3)
    val TAAFFEITE_AMULET = GemAmulet(GemAmuletConfig.TAAFFEITE, 4)
    val PINK_QUARTZ_AMULET = GemAmulet(GemAmuletConfig.PINK_QUARTZ, 5)
    val EUCLASE_AMULET = GemAmulet(GemAmuletConfig.EUCLASE, 6)
    val CHRYSOLITE_AMULET = GemAmulet(GemAmuletConfig.CHRYSOLITE, 7)
    val SAPPHIRE_AMULET = GemAmulet(GemAmuletConfig.SAPPHIRE, 8)
    val HELIODORE_AMULET = GemAmulet(GemAmuletConfig.HELIODORE, 9)
    val RUBY_AMULET = GemAmulet(GemAmuletConfig.RUBY, 10)
    val AQUAMARINE_AMULET = GemAmulet(GemAmuletConfig.AQUAMARINE, 11)
    val TANZANITE_AMULET = GemAmulet(GemAmuletConfig.TANZANITE, 12)
    val TSAVORITE_AMULET = GemAmulet(GemAmuletConfig.TSAVORITE, 13)
    val VERDELITE_AMULET = GemAmulet(GemAmuletConfig.VERDELITE, 14)
    val INDIGOLITE_AMULET = GemAmulet(GemAmuletConfig.INDIGOLITE, 15)
    val OPAL_AMULET = GemAmulet(GemAmuletConfig.OPAL, 16)

    // Fragments
    val QUARTZ_FRAGMENT = ModItem(1)
    val ANDALUSITE_FRAGMENT = ModItem(2)
    val MORGANITE_FRAGMENT = ModItem(3)
    val TAAFFEITE_FRAGMENT = ModItem(4)
    val PINK_QUARTZ_FRAGMENT = ModItem(5)
    val EUCLASE_FRAGMENT = ModItem(6)
    val CHRYSOLITE_FRAGMENT = ModItem(7)
    val SAPPHIRE_FRAGMENT = ModItem(8)
    val HELIODORE_FRAGMENT = ModItem(9)
    val RUBY_FRAGMENT = ModItem(10)
    val AQUAMARINE_FRAGMENT = ModItem(11)
    val TANZANITE_FRAGMENT = ModItem(12)
    val TSAVORITE_FRAGMENT = ModItem(13)
    val VERDELITE_FRAGMENT = ModItem(14)
    val INDIGOLITE_FRAGMENT = ModItem(15)
    val OPAL_FRAGMENT = ModItem(16)

    // Ingots
    val QUARTZ_INGOT = ModItem(1)
    val ANDALUSITE_INGOT = ModItem(2)
    val MORGANITE_INGOT = ModItem(3)
    val TAAFFEITE_INGOT = ModItem(4)
    val PINK_QUARTZ_INGOT = ModItem(5)
    val EUCLASE_INGOT = ModItem(6)
    val CHRYSOLITE_INGOT = ModItem(7)
    val SAPPHIRE_INGOT = ModItem(8)
    val HELIODORE_INGOT = ModItem(9)
    val RUBY_INGOT = ModItem(10)
    val AQUAMARINE_INGOT = ModItem(11)
    val TANZANITE_INGOT = ModItem(12)
    val TSAVORITE_INGOT = ModItem(13)
    val VERDELITE_INGOT = ModItem(14)
    val INDIGOLITE_INGOT = ModItem(15)
    val OPAL_INGOT = ModItem(16)

    // Nuggets
    val QUARTZ_NUGGET = ModItem(1)
    val ANDALUSITE_NUGGET = ModItem(2)
    val MORGANITE_NUGGET = ModItem(3)
    val TAAFFEITE_NUGGET = ModItem(4)
    val PINK_QUARTZ_NUGGET = ModItem(5)
    val EUCLASE_NUGGET = ModItem(6)
    val CHRYSOLITE_NUGGET = ModItem(7)
    val SAPPHIRE_NUGGET = ModItem(8)
    val HELIODORE_NUGGET = ModItem(9)
    val RUBY_NUGGET = ModItem(10)
    val AQUAMARINE_NUGGET = ModItem(11)
    val TANZANITE_NUGGET = ModItem(12)
    val TSAVORITE_NUGGET = ModItem(13)
    val VERDELITE_NUGGET = ModItem(14)
    val INDIGOLITE_NUGGET = ModItem(15)
    val OPAL_NUGGET = ModItem(16)

    override fun register() {
        register("quartz_gem", QUARTZ_GEM)
        register("andalusite_gem", ANDALUSITE_GEM)
        register("morganite_gem", MORGANITE_GEM)
        register("taaffeite_gem", TAAFFEITE_GEM)
        register("pink_quartz_gem", PINK_QUARTZ_GEM)
        register("euclase_gem", EUCLASE_GEM)
        register("chrysolite_gem", CHRYSOLITE_GEM)
        register("sapphire_gem", SAPPHIRE_GEM)
        register("heliodore_gem", HELIODORE_GEM)
        register("ruby_gem", RUBY_GEM)
        register("aquamarine_gem", AQUAMARINE_GEM)
        register("tanzanite_gem", TANZANITE_GEM)
        register("tsavorite_gem", TSAVORITE_GEM)
        register("verdelite_gem", VERDELITE_GEM)
        register("indigolite_gem", INDIGOLITE_GEM)
        register("opal_gem", OPAL_GEM)

        register("quartz_amulet", QUARTZ_AMULET)
        register("andalusite_amulet", ANDALUSITE_AMULET)
        register("morganite_amulet", MORGANITE_AMULET)
        register("taaffeite_amulet", TAAFFEITE_AMULET)
        register("pink_quartz_amulet", PINK_QUARTZ_AMULET)
        register("euclase_amulet", EUCLASE_AMULET)
        register("chrysolite_amulet", CHRYSOLITE_AMULET)
        register("sapphire_amulet", SAPPHIRE_AMULET)
        register("heliodore_amulet", HELIODORE_AMULET)
        register("ruby_amulet", RUBY_AMULET)
        register("aquamarine_amulet", AQUAMARINE_AMULET)
        register("tanzanite_amulet", TANZANITE_AMULET)
        register("tsavorite_amulet", TSAVORITE_AMULET)
        register("verdelite_amulet", VERDELITE_AMULET)
        register("indigolite_amulet", INDIGOLITE_AMULET)
        register("opal_amulet", OPAL_AMULET)

        register("quartz_fragment", QUARTZ_FRAGMENT)
        register("andalusite_fragment", ANDALUSITE_FRAGMENT)
        register("morganite_fragment", MORGANITE_FRAGMENT)
        register("taaffeite_fragment", TAAFFEITE_FRAGMENT)
        register("pink_quartz_fragment", PINK_QUARTZ_FRAGMENT)
        register("euclase_fragment", EUCLASE_FRAGMENT)
        register("chrysolite_fragment", CHRYSOLITE_FRAGMENT)
        register("sapphire_fragment", SAPPHIRE_FRAGMENT)
        register("heliodore_fragment", HELIODORE_FRAGMENT)
        register("ruby_fragment", RUBY_FRAGMENT)
        register("aquamarine_fragment", AQUAMARINE_FRAGMENT)
        register("tanzanite_fragment", TANZANITE_FRAGMENT)
        register("tsavorite_fragment", TSAVORITE_FRAGMENT)
        register("verdelite_fragment", VERDELITE_FRAGMENT)
        register("indigolite_fragment", INDIGOLITE_FRAGMENT)
        register("opal_fragment", OPAL_FRAGMENT)

        register("quartz_ingot", QUARTZ_INGOT)
        register("andalusite_ingot", ANDALUSITE_INGOT)
        register("morganite_ingot", MORGANITE_INGOT)
        register("taaffeite_ingot", TAAFFEITE_INGOT)
        register("pink_quartz_ingot", PINK_QUARTZ_INGOT)
        register("euclase_ingot", EUCLASE_INGOT)
        register("chrysolite_ingot", CHRYSOLITE_INGOT)
        register("sapphire_ingot", SAPPHIRE_INGOT)
        register("heliodore_ingot", HELIODORE_INGOT)
        register("ruby_ingot", RUBY_INGOT)
        register("aquamarine_ingot", AQUAMARINE_INGOT)
        register("tanzanite_ingot", TANZANITE_INGOT)
        register("tsavorite_ingot", TSAVORITE_INGOT)
        register("verdelite_ingot", VERDELITE_INGOT)
        register("indigolite_ingot", INDIGOLITE_INGOT)
        register("opal_ingot", OPAL_INGOT)

        register("quartz_nugget", QUARTZ_NUGGET)
        register("andalusite_nugget", ANDALUSITE_NUGGET)
        register("morganite_nugget", MORGANITE_NUGGET)
        register("taaffeite_nugget", TAAFFEITE_NUGGET)
        register("pink_quartz_nugget", PINK_QUARTZ_NUGGET)
        register("euclase_nugget", EUCLASE_NUGGET)
        register("chrysolite_nugget", CHRYSOLITE_NUGGET)
        register("sapphire_nugget", SAPPHIRE_NUGGET)
        register("heliodore_nugget", HELIODORE_NUGGET)
        register("ruby_nugget", RUBY_NUGGET)
        register("aquamarine_nugget", AQUAMARINE_NUGGET)
        register("tanzanite_nugget", TANZANITE_NUGGET)
        register("tsavorite_nugget", TSAVORITE_NUGGET)
        register("verdelite_nugget", VERDELITE_NUGGET)
        register("indigolite_nugget", INDIGOLITE_NUGGET)
        register("opal_nugget", OPAL_NUGGET)
    }

    private fun register(name: String, item: Item) {
        Registry.register(Registry.ITEM, name.toId(), item)

        if (item is GemItem) {
            FabricModelPredicateProviderRegistry.register(item, "usage".toLocalId(), GemItem::modelPredicateProvider)
        }
    }
}
