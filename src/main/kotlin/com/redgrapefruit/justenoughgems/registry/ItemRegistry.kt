package com.redgrapefruit.justenoughgems.registry

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
    }

    private fun register(name: String, item: Item) {
        Registry.register(Registry.ITEM, name.toId(), item)

        if (item is GemItem) {
            FabricModelPredicateProviderRegistry.register(item, "usage".toLocalId(), GemItem::modelPredicateProvider)
        }
    }
}
