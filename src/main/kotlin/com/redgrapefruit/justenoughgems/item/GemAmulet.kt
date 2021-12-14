package com.redgrapefruit.justenoughgems.item

import com.redgrapefruit.itemnbt3.CustomData
import com.redgrapefruit.itemnbt3.DataClient
import com.redgrapefruit.justenoughgems.util.RomanNumber
import com.redgrapefruit.justenoughgems.util.decrement
import net.minecraft.client.item.TooltipContext
import net.minecraft.entity.Entity
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.text.LiteralText
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Formatting
import net.minecraft.world.World

class GemAmulet(private val config: GemAmuletConfig, private val tier: Int) : Item(Settings().group(ItemGroup.MISC).maxCount(1)) {
    override fun inventoryTick(stack: ItemStack, world: World, entity: Entity, slot: Int, selected: Boolean) {
        if (entity !is PlayerEntity) return

        DataClient.use(::GemAmuletState, stack) { state ->
            state.decreaseInDurability++

            if (state.decreaseInDurability >= config.initialDurability) {
                stack.decrement()
                return@use
            }

            config.effects.forEach { (effect, amplifier) ->
                val instance = StatusEffectInstance(effect, config.expiryTime, amplifier)
                entity.addStatusEffect(instance)
            }
        }
    }

    override fun appendTooltip(
        stack: ItemStack,
        world: World?,
        tooltip: MutableList<Text>,
        context: TooltipContext
    ) {
        tooltip += TranslatableText("misc.jeg.tier")
            .append(LiteralText(RomanNumber.toRoman(tier)))
            .formatted(Formatting.BLUE)

        DataClient.use(::GemAmuletState, stack) { state ->
            tooltip += TranslatableText("misc.jeg.durability")
                .append(LiteralText("${config.initialDurability - state.decreaseInDurability}/${config.initialDurability}"))
                .formatted(getDurabilityColoring(stack))
        }

        tooltip += LiteralText("")
        tooltip += TranslatableText("misc.jeg.effects").formatted(Formatting.GRAY)

        config.effects.forEach { (effect, amplifier) ->
            tooltip += LiteralText("- ")
                .append(TranslatableText(effect.translationKey))
                .append(LiteralText(" ${RomanNumber.toRoman(amplifier)}"))
        }
    }

    private fun getCurrentDurability(stack: ItemStack): Int {
        var output = 0

        DataClient.use(::GemAmuletState, stack) { state ->
            output = config.initialDurability - state.decreaseInDurability
        }

        return output
    }

    private fun getDurabilityColoring(stack: ItemStack): Formatting {
        val durability = getCurrentDurability(stack)

        // States:
        // x>3/4 => Dark Green
        // x>2/4 => Green
        // x>1/4 => Yellow
        // x<1/4 => Red

        val quarter = config.initialDurability / 4

        return when {
            durability > quarter * 3 -> Formatting.DARK_GREEN
            durability > quarter * 2 -> Formatting.GREEN
            durability > quarter -> Formatting.YELLOW
            else -> Formatting.RED
        }
    }
}

data class GemAmuletState(var decreaseInDurability: Int = 0) : CustomData {
    override fun getNbtCategory(): String = "GemAmuletState"

    override fun readNbt(nbt: NbtCompound) {
        decreaseInDurability = nbt.getInt("Durability Decrease")
    }

    override fun writeNbt(nbt: NbtCompound) {
        nbt.putInt("Durability Decrease", decreaseInDurability)
    }
}
