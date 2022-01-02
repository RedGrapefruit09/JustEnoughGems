package com.redgrapefruit.justenoughgems.tool

import com.redgrapefruit.justenoughgems.util.RomanNumber
import com.redgrapefruit.justenoughgems.util.defaultItemSettings
import com.redgrapefruit.justenoughgems.util.newLine
import net.minecraft.block.BlockState
import net.minecraft.client.item.TooltipContext
import net.minecraft.entity.LivingEntity
import net.minecraft.item.*
import net.minecraft.text.LiteralText
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Formatting
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

private object GemTools {
    fun renderTooltip(tooltip: MutableList<Text>, config: GemToolConfig, tier: Int) {
        tooltip.newLine()

        tooltip += TranslatableText("misc.jeg.tier")
            .append(LiteralText(RomanNumber.toRoman(tier)))
            .formatted(Formatting.GREEN)

        tooltip.newLine()

        tooltip += TranslatableText("misc.jeg.effects_on_miner")
            .append(LiteralText(" (${config.chance.format()}% "))
            .append(TranslatableText("misc.jeg.chance"))
            .append(LiteralText("):"))
            .formatted(Formatting.GRAY)
    }

    fun postMine(config: GemToolConfig, miner: LivingEntity) {
        config.chance.ifValid {
            config.effects.forEach(miner::addStatusEffect)
        }
    }
}

class GemPickaxe(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, private val config: GemToolConfig, private val tier: Int)
    : PickaxeItem(material, attackDamage, attackSpeed, defaultItemSettings) {

    override fun appendTooltip(stack: ItemStack, world: World?, tooltip: MutableList<Text>, context: TooltipContext) {
        super.appendTooltip(stack, world, tooltip, context)
        GemTools.renderTooltip(tooltip, config, tier)
    }

    override fun postMine(stack: ItemStack, world: World?, state: BlockState, pos: BlockPos, miner: LivingEntity): Boolean {
        super.postMine(stack, world, state, pos, miner)
        GemTools.postMine(config, miner)
        return true
    }
}

class GemHoe(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, private val config: GemToolConfig, private val tier: Int)
    : HoeItem(material, attackDamage, attackSpeed, defaultItemSettings) {

    override fun appendTooltip(stack: ItemStack, world: World?, tooltip: MutableList<Text>, context: TooltipContext) {
        super.appendTooltip(stack, world, tooltip, context)
        GemTools.renderTooltip(tooltip, config, tier)
    }

    override fun postMine(stack: ItemStack, world: World?, state: BlockState, pos: BlockPos, miner: LivingEntity): Boolean {
        super.postMine(stack, world, state, pos, miner)
        GemTools.postMine(config, miner)
        return true
    }
}

class GemShovel(material: ToolMaterial, attackDamage: Float, attackSpeed: Float, private val config: GemToolConfig, private val tier: Int)
    : ShovelItem(material, attackDamage, attackSpeed, defaultItemSettings) {

    override fun appendTooltip(stack: ItemStack, world: World?, tooltip: MutableList<Text>, context: TooltipContext) {
        super.appendTooltip(stack, world, tooltip, context)
        GemTools.renderTooltip(tooltip, config, tier)
    }

    override fun postMine(stack: ItemStack, world: World?, state: BlockState, pos: BlockPos, miner: LivingEntity): Boolean {
        super.postMine(stack, world, state, pos, miner)
        GemTools.postMine(config, miner)
        return true
    }
}
