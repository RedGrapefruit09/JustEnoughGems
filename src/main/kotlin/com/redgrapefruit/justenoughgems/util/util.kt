package com.redgrapefruit.justenoughgems.util

import com.redgrapefruit.justenoughgems.init.JEGItems
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.text.LiteralText
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import org.apache.logging.log4j.LogManager
import kotlin.random.Random

val LOGGER = LogManager.getLogger("JEG")

val MOD_ITEM_GROUP: ItemGroup by lazy {
    FabricItemGroupBuilder
        .create("item_group".toId())
        .icon { JEGItems.OPAL_GEM.defaultStack }
        .build()
}

val defaultItemSettings: Item.Settings = Item.Settings().group(MOD_ITEM_GROUP)

open class Range(
    val min: Int,
    val max: Int
) {
    open fun pick() = Random.nextInt(min, max + 1)

    companion object {
        fun nonRandom(value: Int) = NonRandomRange(value)
    }
}

class NonRandomRange(private val i: Int) : Range(Int.MIN_VALUE, Int.MAX_VALUE) {
    override fun pick(): Int = i
}

@JvmInline
value class Chance(private val chance: Int) {
    fun randomize() = Random.nextInt(101) <= chance

    inline fun ifValid(action: () -> Unit) {
        if (randomize()) action()
    }

    fun format(): String = chance.toString()

    companion object {
        val always = Chance(100)
    }
}

fun ItemStack.decrement() = decrement(1)

interface IRegistry {
    fun register()
}

fun String.toId() = Identifier("jeg", this)
fun String.toLocalId() = Identifier(this)

fun avg(vararg numbers: Int): Int {
    return numbers.sum() / numbers.size
}

fun avg(r: Range) = avg(r.min, r.max)

fun ticksToSeconds(t: Int) = t / 20

fun MutableList<Text>.newLine() {
    add(LiteralText(""))
}
