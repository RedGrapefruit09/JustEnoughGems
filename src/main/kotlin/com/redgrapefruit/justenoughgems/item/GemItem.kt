package com.redgrapefruit.justenoughgems.item

import com.redgrapefruit.itemnbt3.CustomData
import com.redgrapefruit.itemnbt3.DataClient
import com.redgrapefruit.justenoughgems.Chance
import com.redgrapefruit.justenoughgems.ModItem
import com.redgrapefruit.justenoughgems.Range
import net.minecraft.entity.Entity
import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World

// Implementation

class GemItem(private val config: GemItemConfig) : ModItem() {
    private var readyForUsage: Boolean = false

    override fun inventoryTick(stack: ItemStack, world: World, entity: Entity, slot: Int, selected: Boolean) {
        super.inventoryTick(stack, world, entity, slot, selected)

        DataClient.use(::GemItemState, stack) { state ->
            if (state.reload < config.reloadTime) {
                ++state.reload
            } else {
                readyForUsage = true
            }
        }
    }

    override fun use(world: World, user: PlayerEntity, hand: Hand): TypedActionResult<ItemStack> {
        if (!readyForUsage) return super.use(world, user, hand)

        val stack = user.getStackInHand(hand)

        readyForUsage = false
        DataClient.use(::GemItemState, stack) { state ->
            state.reload = 0
        }

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
}

// Storage

private data class GemItemState(var reload: Int = 0) : CustomData {
    override fun getNbtCategory(): String = "GemItemState"

    override fun readNbt(nbt: NbtCompound) {
        reload = nbt.getInt("Reload")
    }

    override fun writeNbt(nbt: NbtCompound) {
        nbt.putInt("Reload", reload)
    }
}

data class GemItemConfig(
    val reloadTime: Int,
    val effects: List<GemItemEffect>
)

data class GemItemEffect(
    val statusEffect: StatusEffect,
    val duration: Range,
    val amplifier: Range,
    val chance: Chance
)
