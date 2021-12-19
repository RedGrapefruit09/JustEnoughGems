package com.redgrapefruit.justenoughgems.tool

import com.redgrapefruit.justenoughgems.util.RomanNumber
import com.redgrapefruit.justenoughgems.util.defaultItemSettings
import com.redgrapefruit.justenoughgems.util.newLine
import net.minecraft.client.item.TooltipContext
import net.minecraft.entity.LivingEntity
import net.minecraft.item.AxeItem
import net.minecraft.item.ItemStack
import net.minecraft.item.SwordItem
import net.minecraft.item.ToolMaterial
import net.minecraft.text.LiteralText
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Formatting
import net.minecraft.world.World

private object GemWeapons {
    fun renderTooltip(tooltip: MutableList<Text>, config: GemWeaponConfig, tier: Int) {
        tooltip.newLine()

        tooltip += TranslatableText("misc.jeg.tier")
            .append(LiteralText(RomanNumber.toRoman(tier)))
            .formatted(Formatting.GREEN)

        tooltip += TranslatableText("misc.jeg.chance_full")
            .append(LiteralText("${config.attackerChance.format()}%"))
            .formatted(Formatting.DARK_BLUE)

        tooltip.newLine()

        tooltip += TranslatableText("misc.jeg.effects_on_attacker")
            .append(LiteralText(" (${config.attackerChance.format()}% "))
            .append(TranslatableText("misc.jeg.chance"))
            .append(LiteralText("):"))
            .formatted(Formatting.GRAY)

        config.toAttacker.forEach { effect ->
            tooltip += LiteralText("- ")
                .append(TranslatableText(effect.effectType.translationKey))
                .append(LiteralText(" (${effect.duration}, x${effect.amplifier + 1})"))
        }

        tooltip.newLine()

        tooltip += TranslatableText("misc.jeg.effects_on_mob")
            .append(LiteralText(" (${config.targetChance.format()}% "))
            .append(TranslatableText("misc.jeg.chance"))
            .append(LiteralText("):"))
            .formatted(Formatting.GRAY)

        config.toTarget.forEach { effect ->
            tooltip += LiteralText("- ")
                .append(TranslatableText(effect.effectType.translationKey))
                .append(LiteralText(" (${effect.duration}, x${effect.amplifier + 1})"))
        }
    }

    fun postHit(target: LivingEntity, attacker: LivingEntity, config: GemWeaponConfig) {
        config.attackerChance.ifValid {
            config.toAttacker.forEach(attacker::addStatusEffect)
        }

        config.targetChance.ifValid {
            config.toTarget.forEach(target::addStatusEffect)
        }
    }
}

class GemSword(
    toolMaterial: ToolMaterial,
    attackDamage: Int,
    attackSpeed: Float,
    private val config: GemWeaponConfig,
    private val tier: Int)
    : SwordItem(toolMaterial, attackDamage, attackSpeed, defaultItemSettings) {

    override fun postHit(stack: ItemStack, target: LivingEntity, attacker: LivingEntity): Boolean {
        super.postHit(stack, target, attacker)
        GemWeapons.postHit(target, attacker, config)
        return true
    }

    override fun appendTooltip(
        stack: ItemStack,
        world: World?,
        tooltip: MutableList<Text>,
        context: TooltipContext
    ) {
        super.appendTooltip(stack, world, tooltip, context)
        GemWeapons.renderTooltip(tooltip, config, tier)
    }
}

class GemAxe(
    toolMaterial: ToolMaterial,
    attackDamage: Float,
    attackSpeed: Float,
    private val config: GemWeaponConfig,
    private val tier: Int)
    : AxeItem(toolMaterial, attackDamage, attackSpeed, defaultItemSettings) {

    override fun postHit(stack: ItemStack, target: LivingEntity, attacker: LivingEntity): Boolean {
        super.postHit(stack, target, attacker)
        GemWeapons.postHit(target, attacker, config)
        return true
    }

    override fun appendTooltip(
        stack: ItemStack,
        world: World?,
        tooltip: MutableList<Text>,
        context: TooltipContext
    ) {
        super.appendTooltip(stack, world, tooltip, context)
        GemWeapons.renderTooltip(tooltip, config, tier)
    }
}
