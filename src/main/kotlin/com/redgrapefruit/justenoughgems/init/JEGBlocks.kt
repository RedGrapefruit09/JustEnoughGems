package com.redgrapefruit.justenoughgems.init

import com.redgrapefruit.justenoughgems.block.OreBlock
import com.redgrapefruit.justenoughgems.util.IRegistry
import com.redgrapefruit.justenoughgems.util.MOD_ITEM_GROUP
import com.redgrapefruit.justenoughgems.util.Range
import com.redgrapefruit.justenoughgems.util.toId
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.util.registry.Registry

object JEGBlocks : IRegistry {
    val QUARTZ_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1f), JEGItems.QUARTZ_FRAGMENT)
    val ANDALUSITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.05f), JEGItems.ANDALUSITE_FRAGMENT)
    val MORGANITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.1f), JEGItems.MORGANITE_FRAGMENT)
    val TAAFFEITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.15f), JEGItems.TAAFFEITE_FRAGMENT)
    val PINK_QUARTZ_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.2f), JEGItems.PINK_QUARTZ_FRAGMENT)
    val EUCLASE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.25f), JEGItems.EUCLASE_FRAGMENT)
    val CHRYSOLITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.3f), JEGItems.CHRYSOLITE_FRAGMENT)
    val SAPPHIRE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.35f), JEGItems.SAPPHIRE_FRAGMENT)
    val HELIODORE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.4f), JEGItems.HELIODORE_FRAGMENT)
    val RUBY_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.45f), JEGItems.RUBY_FRAGMENT)
    val AQUAMARINE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.5f), JEGItems.AQUAMARINE_FRAGMENT)
    val TANZANITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.55f), JEGItems.TANZANITE_FRAGMENT)
    val TSAVORITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.6f), JEGItems.TSAVORITE_FRAGMENT)
    val VERDELITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.65f), JEGItems.VERDELITE_FRAGMENT)
    val INDIGOLITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.7f), JEGItems.INDIGOLITE_FRAGMENT)
    val OPAL_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.75f), JEGItems.OPAL_FRAGMENT)

    override fun register() {
        register("quartz_ore", QUARTZ_ORE)
        register("andalusite_ore", ANDALUSITE_ORE)
        register("morganite_ore", MORGANITE_ORE)
        register("taaffeite_ore", TAAFFEITE_ORE)
        register("pink_quartz_ore", PINK_QUARTZ_ORE)
        register("euclase_ore", EUCLASE_ORE)
        register("chrysolite_ore", CHRYSOLITE_ORE)
        register("sapphire_ore", SAPPHIRE_ORE)
        register("heliodore_ore", HELIODORE_ORE)
        register("ruby_ore", RUBY_ORE)
        register("aquamarine_ore", AQUAMARINE_ORE)
        register("tanzanite_ore", TANZANITE_ORE)
        register("tsavorite_ore", TSAVORITE_ORE)
        register("verdelite_ore", VERDELITE_ORE)
        register("indigolite_ore", INDIGOLITE_ORE)
        register("opal_ore", OPAL_ORE)
    }

    private fun register(name: String, block: Block) {
        Registry.register(Registry.BLOCK, name.toId(), block)
        Registry.register(Registry.ITEM, name.toId(), BlockItem(block, Item.Settings().group(MOD_ITEM_GROUP)))
    }
}
