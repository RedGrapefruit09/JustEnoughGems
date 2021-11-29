package com.redgrapefruit.justenoughgems.item

import com.redgrapefruit.itemnbt3.CustomData
import com.redgrapefruit.itemnbt3.DataClient
import com.redgrapefruit.justenoughgems.util.*
import net.minecraft.client.item.TooltipContext
import net.minecraft.client.world.ClientWorld
import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.text.LiteralText
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Formatting
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World

// Implementation

class GemItem(private val config: GemItemConfig, private val tier: Int) : Item(Settings().group(ItemGroup.MISC).maxCount(1)) {
    private fun readyForUsage(stack: ItemStack): Boolean {
        var out = false

        DataClient.use(::GemItemState, stack) { state ->
            out = state.reload >= config.reloadTime
        }

        return out
    }

    override fun inventoryTick(stack: ItemStack, world: World, entity: Entity, slot: Int, selected: Boolean) {
        super.inventoryTick(stack, world, entity, slot, selected)

        DataClient.use(::GemItemState, stack) { state ->
            ++state.reload

            if (state.uses == 0) {
                stack.decrement()
            }
        }
    }

    override fun use(world: World, user: PlayerEntity, hand: Hand): TypedActionResult<ItemStack> {
        val stack = user.getStackInHand(hand)

        // Validation

        if (!readyForUsage(stack)) return super.use(world, user, hand)

        var outOfUses = false

        DataClient.use(::GemItemState, stack) { state ->
            println(state.uses)
            if (state.uses <= 0) outOfUses = true
        }

        if (outOfUses) {
            stack.decrement()
            return TypedActionResult.consume(stack)
        }

        // Count in usage

        DataClient.use(::GemItemState, stack) { state ->
            state.reload = 0
            --state.uses
        }

        // Application

        config.effects.forEach { effect ->
            effect.chance.ifValid {
                val duration = effect.duration.pick()
                val amplifier = effect.amplifier.pick()
                val instance = StatusEffectInstance(effect.statusEffect, duration, amplifier)
                user.addStatusEffect(instance)
            }
        }

        return super.use(world, user, hand)
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

        if (readyForUsage(stack)) {
            tooltip += TranslatableText("misc.jeg.ready_to_use")
                .formatted(Formatting.GREEN)
        } else {
            DataClient.use(::GemItemState, stack) { state ->
                tooltip += TranslatableText("misc.jeg.cooldown")
                    .append(LiteralText("${state.reload}/${config.reloadTime}"))
                    .formatted(Formatting.RED)
            }
        }

        DataClient.use(::GemItemState, stack) { state ->
            tooltip += TranslatableText("misc.jeg.uses_left")
                .append(LiteralText("${state.uses}/4"))
                .formatted(Formatting.AQUA)
        }

        tooltip += LiteralText("")
        tooltip += TranslatableText("misc.jeg.effects")
            .formatted(Formatting.GRAY)

        config.effects.forEach { effect ->
            tooltip += LiteralText("- ")
                .append(TranslatableText(effect.statusEffect.translationKey))
                .append(LiteralText(" (${effect.chance.format()}% chance)"))
        }
    }

    companion object {
        fun modelPredicateProvider(stack: ItemStack, world: ClientWorld?, entity: LivingEntity?, i: Int): Float {
            var uses = 0

            DataClient.use(::GemItemState, stack) { state ->
                uses = state.uses
            }

            return when (uses) {
                0 -> 0.4f // hack
                1 -> 0.4f
                2 -> 0.3f
                3 -> 0.2f
                4 -> 0.1f
                else -> throw RuntimeException("Out of bounds: $uses")
            }
        }
    }
}

// Storage

private data class GemItemState(var reload: Int = 0, var uses: Int = 4) : CustomData {
    override fun getNbtCategory(): String = "GemItemState"

    override fun readNbt(nbt: NbtCompound) {
        reload = nbt.getInt("Reload")
        uses = nbt.getInt("Uses")
    }

    override fun writeNbt(nbt: NbtCompound) {
        nbt.putInt("Reload", reload)
        nbt.putInt("Uses", uses)
    }
}

data class GemItemConfig(
    val reloadTime: Int,
    val effects: List<GemItemEffect>
) {
    companion object {
        val QUARTZ = GemItemConfig(
            reloadTime = 480,
            effects = listOf(
                GemItemEffect(
                    statusEffect = StatusEffects.SPEED,
                    duration = Range(100, 200).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance(75)
                )
            )
        )

        val ANDALUSITE = GemItemConfig(
            reloadTime = 450,
            effects = listOf(
                GemItemEffect(
                    statusEffect = StatusEffects.SPEED,
                    duration = Range(150, 300).scaled(),
                    amplifier = Range(0, 1),
                    chance = Chance(85)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.REGENERATION,
                    duration = Range(200, 400).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance(60)
                )
            )
        )

        val MORGANITE = GemItemConfig(
            reloadTime = 420,
            effects = listOf(
                GemItemEffect(
                    statusEffect = StatusEffects.SPEED,
                    duration = Range(250, 350).scaled(),
                    amplifier = Range.nonRandom(1),
                    chance = Chance(90)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.REGENERATION,
                    duration = Range(300, 450).scaled(),
                    amplifier = Range(0, 1),
                    chance = Chance(75)
                )
            )
        )

        val TAAFFEITE = GemItemConfig(
            reloadTime = 390,
            effects = listOf(
                GemItemEffect(
                    statusEffect = StatusEffects.SPEED,
                    duration = Range(300, 400).scaled(),
                    amplifier = Range(1, 2),
                    chance = Chance(95)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.REGENERATION,
                    duration = Range(400, 500).scaled(),
                    amplifier = Range.nonRandom(1),
                    chance = Chance(85)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.ABSORPTION,
                    duration = Range(100, 250).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance(35)
                )
            )
        )

        private const val MULTIPLIER = 15

        private fun Range.scaled(): Range {
            return Range(min * MULTIPLIER, max * MULTIPLIER)
        }
    }
}

data class GemItemEffect(
    val statusEffect: StatusEffect,
    val duration: Range,
    val amplifier: Range,
    val chance: Chance
)
