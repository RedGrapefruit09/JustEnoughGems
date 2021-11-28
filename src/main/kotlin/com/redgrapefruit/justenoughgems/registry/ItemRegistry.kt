package com.redgrapefruit.justenoughgems.registry

import com.redgrapefruit.justenoughgems.IRegistry
import com.redgrapefruit.justenoughgems.item.GemItem
import com.redgrapefruit.justenoughgems.item.GemItemConfig
import com.redgrapefruit.justenoughgems.toId
import com.redgrapefruit.justenoughgems.toLocalId
import net.fabricmc.fabric.api.`object`.builder.v1.client.model.FabricModelPredicateProviderRegistry
import net.minecraft.item.Item
import net.minecraft.util.registry.Registry

object ItemRegistry : IRegistry {
    val QUARTZ_GEM = GemItem(GemItemConfig.QUARTZ, 1)

    override fun register() {
        register("quartz_gem", QUARTZ_GEM)
    }

    private fun register(name: String, item: Item) {
        Registry.register(Registry.ITEM, name.toId(), item)

        if (item is GemItem) {
            FabricModelPredicateProviderRegistry.register(item, "usage".toLocalId(), GemItem::modelPredicateProvider)
        }
    }
}
