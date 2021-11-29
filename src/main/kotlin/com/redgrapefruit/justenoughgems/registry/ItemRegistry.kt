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

    override fun register() {
        register("quartz_gem", QUARTZ_GEM)
        register("andalusite_gem", ANDALUSITE_GEM)
        register("morganite_gem", MORGANITE_GEM)
        register("taaffeite_gem", TAAFFEITE_GEM)
    }

    private fun register(name: String, item: Item) {
        Registry.register(Registry.ITEM, name.toId(), item)

        if (item is GemItem) {
            FabricModelPredicateProviderRegistry.register(item, "usage".toLocalId(), GemItem::modelPredicateProvider)
        }
    }
}
