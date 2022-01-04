package com.redgrapefruit.justenoughgems.util

import com.redgrapefruit.justenoughgems.init.OreConfiguration
import com.redgrapefruit.justenoughgems.item.GemOrbItem
import net.fabricmc.fabric.api.`object`.builder.v1.client.model.FabricModelPredicateProviderRegistry
import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.util.registry.BuiltinRegistries
import net.minecraft.util.registry.Registry
import net.minecraft.util.registry.RegistryKey
import net.minecraft.world.gen.GenerationStep

interface IInitializer {
    fun initialize()
}

private val orbs: MutableSet<GemOrbItem> = mutableSetOf()

fun register(name: String, item: Item) {
    Registry.register(Registry.ITEM, name.toId(), item)

    if (item is GemOrbItem) orbs += item
}

fun registerOrbModelPredicateProviders() {
    orbs.forEach {
        FabricModelPredicateProviderRegistry.register(it, "usage".toLocalId(), GemOrbItem::modelPredicateProvider)
    }
}

fun register(name: String, block: Block) {
    Registry.register(Registry.BLOCK, name.toId(), block)
    Registry.register(Registry.ITEM, name.toId(), BlockItem(block, Item.Settings().group(MOD_ITEM_GROUP)))
}

fun register(name: String, config: OreConfiguration) {
    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, name.toId(), config.configured)

    Registry.register(BuiltinRegistries.PLACED_FEATURE, name.toId(), config.placed)

    BiomeModifications.addFeature(
        BiomeSelectors.foundInOverworld(),
        GenerationStep.Feature.UNDERGROUND_ORES,
        RegistryKey.of(Registry.PLACED_FEATURE_KEY, name.toId()))
}
