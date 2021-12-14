package com.redgrapefruit.justenoughgems.registry

import com.redgrapefruit.justenoughgems.item.GemAmulet
import com.redgrapefruit.justenoughgems.item.GemAmuletConfig
import com.redgrapefruit.justenoughgems.item.GemItem
import com.redgrapefruit.justenoughgems.item.GemItemConfig
import com.redgrapefruit.justenoughgems.util.IRegistry
import com.redgrapefruit.justenoughgems.util.toId
import com.redgrapefruit.justenoughgems.util.toLocalId
import net.fabricmc.fabric.api.`object`.builder.v1.client.model.FabricModelPredicateProviderRegistry
import net.minecraft.item.Item
import net.minecraft.util.registry.Registry

object ItemRegistry : IRegistry {
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
    }

    private fun register(name: String, item: Item) {
        Registry.register(Registry.ITEM, name.toId(), item)

        if (item is GemItem) {
            FabricModelPredicateProviderRegistry.register(item, "usage".toLocalId(), GemItem::modelPredicateProvider)
        }
    }
}
