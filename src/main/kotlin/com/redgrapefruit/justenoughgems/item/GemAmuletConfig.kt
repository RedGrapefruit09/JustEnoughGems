package com.redgrapefruit.justenoughgems.item

import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffects

data class GemAmuletConfig(
    val initialDurability: Int,
    val expiryTime: Int,
    val effects: Map<StatusEffect, Int>
) {
    companion object {
        // NOTE:
        // Initial durability = 6000 + t * 1200
        // Expiry time = t * 20

        val QUARTZ = GemAmuletConfig(
            initialDurability = 7200,
            expiryTime = 20,
            effects = mapOf(
                StatusEffects.SPEED to 0,
                StatusEffects.REGENERATION to 0
            )
        )
    }
}
