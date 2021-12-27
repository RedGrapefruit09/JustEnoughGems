package com.redgrapefruit.justenoughgems.item

import com.github.crimsondawn45.fabricshieldlib.lib.`object`.FabricShieldItem
import com.redgrapefruit.justenoughgems.util.MOD_ITEM_GROUP
import com.redgrapefruit.justenoughgems.util.RomanNumber
import com.redgrapefruit.justenoughgems.util.newLine
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.ItemStack
import net.minecraft.text.LiteralText
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Formatting
import net.minecraft.world.World

// TODO: add repair items in v0.5

class GemShield(
    private val tier: Int,
    val reflectPercent: Int,
    maxDamage: Int,
    cooldownTicks: Int,
    enchantability: Int) : FabricShieldItem(FabricItemSettings().maxDamage(maxDamage).group(MOD_ITEM_GROUP), cooldownTicks, enchantability) {

    override fun appendTooltip(
        stack: ItemStack,
        world: World?,
        tooltip: MutableList<Text>,
        context: TooltipContext
    ) {
        tooltip += TranslatableText("misc.jeg.tier")
            .append(LiteralText(RomanNumber.toRoman(tier)))
            .formatted(Formatting.BLUE)

        tooltip.newLine()

        tooltip += TranslatableText("misc.jeg.reflect_damage_pt1")
            .append(LiteralText(reflectPercent.toString()))
            .append(TranslatableText("misc.jeg.reflect_damage_pt2"))
            .formatted(Formatting.DARK_GREEN)
    }
}
