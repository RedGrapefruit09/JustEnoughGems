package com.redgrapefruit.justenoughgems.item

import com.redgrapefruit.justenoughgems.util.RomanNumber
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.text.LiteralText
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Formatting
import net.minecraft.world.World

abstract class BaseItem(
    private val tier: Int,
    notStackable: Boolean = false)
    : Item(Settings()
        .group(ItemGroup.MISC)
        .maxCount(if (notStackable) 1 else 64)) {

    override fun appendTooltip(
        stack: ItemStack,
        world: World?,
        tooltip: MutableList<Text>,
        context: TooltipContext
    ) {
        tooltip += TranslatableText("misc.jeg.tier")
            .append(LiteralText(RomanNumber.toRoman(tier)))
            .formatted(Formatting.BLUE)
    }
}
