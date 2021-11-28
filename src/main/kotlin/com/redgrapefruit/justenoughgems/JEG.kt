package com.redgrapefruit.justenoughgems

import com.redgrapefruit.justenoughgems.registry.ItemRegistry
import net.fabricmc.api.ModInitializer
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier
import kotlin.random.Random

object JEG : ModInitializer {
    override fun onInitialize() {
        ItemRegistry.register()
    }
}

// Utils

abstract class ModItem : Item(Settings().group(ItemGroup.MISC))

data class Range(
    val min: Int,
    val max: Int
) {
    fun pick() = Random.nextInt(min, max + 1)
}

@JvmInline
value class Chance(private val chance: Int) {
    fun randomize() = Random.nextInt(101) <= chance

    inline fun ifValid(action: () -> Unit) {
        if (randomize()) action()
    }
}

fun ItemStack.decrement() = decrement(1)

interface IRegistry {
    fun register()
}

fun String.toId() = Identifier("jeg", this)
fun String.toLocalId() = Identifier(this)
