package com.redgrapefruit.justenoughgems

import net.fabricmc.api.ModInitializer
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import kotlin.random.Random

object JEG : ModInitializer {
    override fun onInitialize() {

    }
}

abstract class ModItem : Item(Settings().group(ItemGroup.MISC))

data class Range(
    val min: Int,
    val max: Int
) {
    fun pick() = Random.nextInt(min, max)
}

@JvmInline
value class Chance(private val chance: Int) {
    fun randomize() = Random.nextInt(101) <= chance

    inline fun ifValid(action: () -> Unit) {
        if (randomize()) action()
    }
}
