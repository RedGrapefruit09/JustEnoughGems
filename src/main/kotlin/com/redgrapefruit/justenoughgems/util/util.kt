@file:JvmName("Utils")

package com.redgrapefruit.justenoughgems.util

import com.redgrapefruit.justenoughgems.init.JEGItems
import net.fabricmc.api.EnvType
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.text.LiteralText
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import java.io.IOException
import java.net.MalformedURLException
import java.net.URL
import kotlin.random.Random

val logger: Logger = LogManager.getLogger("JEG")

val MOD_ITEM_GROUP: ItemGroup by lazy {
    FabricItemGroupBuilder
        .create("item_group".toId())
        .icon { JEGItems.OPAL_GEM.defaultStack }
        .build()
}

val defaultItemSettings: FabricItemSettings = FabricItemSettings().group(MOD_ITEM_GROUP)

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

fun download(link: String): String {
    var out: String

    URL(link).openStream().use { input ->
        out = input.readBytes().decodeToString()
    }

    return out
}

fun internetConnected(): Boolean {
    return try {
        val url = URL("http://www.google.com")
        val connection = url.openConnection()
        connection.connect()
        true
    } catch (e: MalformedURLException) {
        false
    } catch (e: IOException) {
        false
    }
}

inline fun clientSide(action: () -> Unit) {
    if (FabricLoader.getInstance().environmentType == EnvType.CLIENT) action()
}

inline fun serverSide(action: () -> Unit) {
    if (FabricLoader.getInstance().environmentType == EnvType.SERVER) action()
}

data class SemanticVersion(
    val major: Int,
    val minor: Int,
    val patch: Int
) {
    // Basic semantic comparison
    fun compare(other: SemanticVersion): ComparisonResult {
        if (this.major > other.major || this.minor > other.minor || this.patch > other.patch) {
            return ComparisonResult.BIGGER
        }

        if (this.major < other.major || this.minor < other.minor || this.patch < other.patch) {
            return ComparisonResult.LESS
        }

        return ComparisonResult.EQUAL
    }

    // Formatting
    fun formatToString(): String {
        return "v$major.$minor.$patch"
    }

    companion object {
        // Legacy versions need to be normalized, since before v0.6.0 JustEnoughGems used a scuffed semantic versioning model,
        // so we have versions like these:
        // - v0.5 (no patch component)
        // - 0.4.0 (no v prefix)
        // This also removes the -SNAPSHOT suffix, the mechanism will determine if it's an unreleased version anyway
        fun from(str: String): SemanticVersion {
            var target = str

            target = target.replace("v", "")
            target = target.removeSuffix("-SNAPSHOT")

            if (target.split(".").size == 2) {
                target = "$target.0"
            }

            val components = target.split(".")

            return SemanticVersion(components[0].toInt(), components[1].toInt(), components[2].toInt())
        }
    }
}

enum class ComparisonResult {
    EQUAL,
    BIGGER,
    LESS
}
