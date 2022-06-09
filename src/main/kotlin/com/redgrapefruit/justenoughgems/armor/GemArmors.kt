package com.redgrapefruit.justenoughgems.armor

import com.redgrapefruit.justenoughgems.util.RomanNumber
import com.redgrapefruit.justenoughgems.util.defaultItemSettings
import com.redgrapefruit.justenoughgems.util.newLine
import net.minecraft.client.item.TooltipContext
import net.minecraft.entity.damage.DamageSource
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.item.ArmorItem
import net.minecraft.item.ArmorMaterial
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.util.Formatting
import net.minecraft.world.World

abstract class BaseGemArmorItem(
    armorMaterial: ArmorMaterial,
    private val piece: ArmorPiece,
    val config: GemArmorConfig,
    private val tier: Int) : ArmorItem(armorMaterial, piece.slot, defaultItemSettings) {

    override fun appendTooltip(
        stack: ItemStack,
        world: World?,
        tooltip: MutableList<Text>,
        context: TooltipContext
    ) {
        tooltip.newLine()

        tooltip += Text.translatable("misc.jeg.tier")
            .append(Text.literal(RomanNumber.toRoman(tier)))
            .formatted(Formatting.GREEN)

        tooltip.newLine()

        tooltip += Text.translatable("misc.jeg.reflect_damage_pt1")
            .append(Text.literal(config.reflectPercentages[piece].toString()))
            .append(Text.translatable("misc.jeg.reflect_damage_pt2"))
            .append(Text.translatable("misc.jeg.reflect_damage_pt3"))
            .append(Text.literal("${config.reflectChances[piece]!!.format()}%"))
            .formatted(Formatting.DARK_GREEN)
    }
}

class GemHelmetItem(armorMaterial: ArmorMaterial, config: GemArmorConfig, tier: Int)
    : BaseGemArmorItem(armorMaterial, ArmorPiece.HELMET, config, tier)

class GemChestplateItem(armorMaterial: ArmorMaterial, config: GemArmorConfig, tier: Int)
    : BaseGemArmorItem(armorMaterial, ArmorPiece.CHESTPLATE, config, tier)

class GemLeggingsItem(armorMaterial: ArmorMaterial, config: GemArmorConfig, tier: Int)
    : BaseGemArmorItem(armorMaterial, ArmorPiece.LEGGINGS, config, tier)

class GemBootsItem(armorMaterial: ArmorMaterial, config: GemArmorConfig, tier: Int)
    : BaseGemArmorItem(armorMaterial, ArmorPiece.BOOTS, config, tier)

// implementation of the ArmorReflectionMixin
object ArmorReflectionMixinImpl {
    fun onArmorDamaged(inventory: PlayerInventory, source: DamageSource, amount: Float, self: PlayerEntity) {
        val helmet = inventory.getArmorStack(0)
        val chestplate = inventory.getArmorStack(1)
        val leggings = inventory.getArmorStack(2)
        val boots = inventory.getArmorStack(3)

        applyArmorReflection(source, ArmorPiece.HELMET, helmet, amount, self)
        applyArmorReflection(source, ArmorPiece.CHESTPLATE, chestplate, amount, self)
        applyArmorReflection(source, ArmorPiece.LEGGINGS, leggings, amount, self)
        applyArmorReflection(source, ArmorPiece.BOOTS, boots, amount, self)
    }

    private fun applyArmorReflection(source: DamageSource, piece: ArmorPiece, stack: ItemStack, amount: Float, self: PlayerEntity) {
        if (stack.isEmpty || stack.item !is BaseGemArmorItem || source.attacker == null) return

        val item = stack.item as BaseGemArmorItem
        val chance = item.config.reflectChances[piece]!!
        val percent = item.config.reflectPercentages[piece]!!

        chance.ifValid {
            val reflectedAmount = amount / 100f * percent
            source.attacker!!.damage(DamageSource.player(self), reflectedAmount)
        }
    }
}
