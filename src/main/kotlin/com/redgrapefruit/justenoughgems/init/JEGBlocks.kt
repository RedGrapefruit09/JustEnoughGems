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
    val QUARTZ_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(3f), JEGItems.QUARTZ_FRAGMENT, Range(1, 3))

    override fun register() {
        register("quartz_ore", QUARTZ_ORE)
    }

    private fun register(name: String, block: Block) {
        Registry.register(Registry.BLOCK, name.toId(), block)
        Registry.register(Registry.ITEM, name.toId(), BlockItem(block, Item.Settings().group(MOD_ITEM_GROUP)))
    }
}
