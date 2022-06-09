package com.redgrapefruit.justenoughgems.item

import com.redgrapefruit.justenoughgems.util.MOD_ITEM_GROUP
import com.redgrapefruit.justenoughgems.util.RomanNumber
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.text.Text.literal
import net.minecraft.text.Text
import net.minecraft.text.Text.translatable
import net.minecraft.util.Formatting
import net.minecraft.world.World

open class ModItem(
    private val tier: Int,
    notStackable: Boolean = false)
    : Item(Settings()
        .group(MOD_ITEM_GROUP)
        .maxCount(if (notStackable) 1 else 64)) {

    override fun appendTooltip(
        stack: ItemStack,
        world: World?,
        tooltip: MutableList<Text>,
        context: TooltipContext
    ) {
        tooltip += Text.translatable("misc.jeg.tier")
            .append(Text.literal(RomanNumber.toRoman(tier)))
            .formatted(Formatting.BLUE)
    }
}
