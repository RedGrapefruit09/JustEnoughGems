package com.redgrapefruit.justenoughgems.tool

import com.redgrapefruit.justenoughgems.util.RomanNumber
import com.redgrapefruit.justenoughgems.util.defaultItemSettings
import com.redgrapefruit.justenoughgems.util.newLine
import net.minecraft.block.BlockState
import net.minecraft.client.item.TooltipContext
import net.minecraft.entity.LivingEntity
import net.minecraft.item.*
import net.minecraft.text.Text.literal
import net.minecraft.text.Text
import net.minecraft.text.Text.translatable
import net.minecraft.util.Formatting
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

private object GemToolCommons {
    fun renderTooltip(tooltip: MutableList<Text>, config: GemToolConfig, tier: Int) {
        tooltip.newLine()

        tooltip += Text.translatable("misc.jeg.tier")
            .append(Text.literal(RomanNumber.toRoman(tier)))
            .formatted(Formatting.GREEN)

        tooltip.newLine()

        tooltip += Text.translatable("misc.jeg.effects_on_miner")
            .append(Text.literal(" (${config.chance.format()}% "))
            .append(Text.translatable("misc.jeg.chance"))
            .append(Text.literal("):"))
            .formatted(Formatting.GRAY)

        config.effects.forEach { effect ->
            tooltip += Text.literal("- ")
                .append(Text.translatable(effect.effectType.translationKey))
                .append(Text.literal(" (${effect.duration}, x${effect.amplifier + 1})"))
        }
    }

    fun postMine(config: GemToolConfig, miner: LivingEntity) {
        config.chance.ifValid {
            config.effects.forEach(miner::addStatusEffect)
        }
    }
}

class GemPickaxeItem(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, private val config: GemToolConfig, private val tier: Int)
    : PickaxeItem(material, attackDamage, attackSpeed, defaultItemSettings) {

    override fun appendTooltip(stack: ItemStack, world: World?, tooltip: MutableList<Text>, context: TooltipContext) {
        super.appendTooltip(stack, world, tooltip, context)
        GemToolCommons.renderTooltip(tooltip, config, tier)
    }

    override fun postMine(stack: ItemStack, world: World?, state: BlockState, pos: BlockPos, miner: LivingEntity): Boolean {
        super.postMine(stack, world, state, pos, miner)
        GemToolCommons.postMine(config, miner)
        return true
    }
}

class GemHoeItem(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, private val config: GemToolConfig, private val tier: Int)
    : HoeItem(material, attackDamage, attackSpeed, defaultItemSettings) {

    override fun appendTooltip(stack: ItemStack, world: World?, tooltip: MutableList<Text>, context: TooltipContext) {
        super.appendTooltip(stack, world, tooltip, context)
        GemToolCommons.renderTooltip(tooltip, config, tier)
    }

    override fun postMine(stack: ItemStack, world: World?, state: BlockState, pos: BlockPos, miner: LivingEntity): Boolean {
        super.postMine(stack, world, state, pos, miner)
        GemToolCommons.postMine(config, miner)
        return true
    }
}

class GemShovelItem(material: ToolMaterial, attackDamage: Float, attackSpeed: Float, private val config: GemToolConfig, private val tier: Int)
    : ShovelItem(material, attackDamage, attackSpeed, defaultItemSettings) {

    override fun appendTooltip(stack: ItemStack, world: World?, tooltip: MutableList<Text>, context: TooltipContext) {
        super.appendTooltip(stack, world, tooltip, context)
        GemToolCommons.renderTooltip(tooltip, config, tier)
    }

    override fun postMine(stack: ItemStack, world: World?, state: BlockState, pos: BlockPos, miner: LivingEntity): Boolean {
        super.postMine(stack, world, state, pos, miner)
        GemToolCommons.postMine(config, miner)
        return true
    }
}
