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

        val ANDALUSITE = GemAmuletConfig(
            initialDurability = 8400,
            expiryTime = 40,
            effects = mapOf(
                StatusEffects.SPEED to 1,
                StatusEffects.REGENERATION to 1
            )
        )

        val MORGANITE = GemAmuletConfig(
            initialDurability = 9600,
            expiryTime = 60,
            effects = mapOf(
                StatusEffects.SPEED to 2,
                StatusEffects.REGENERATION to 2
            )
        )

        val TAAFFEITE = GemAmuletConfig(
            initialDurability = 10800,
            expiryTime = 80,
            effects = mapOf(
                StatusEffects.SPEED to 3,
                StatusEffects.REGENERATION to 3,
                StatusEffects.ABSORPTION to 0
            )
        )

        val PINK_QUARTZ = GemAmuletConfig(
            initialDurability = 12000,
            expiryTime = 100,
            effects = mapOf(
                StatusEffects.SPEED to 4,
                StatusEffects.REGENERATION to 4,
                StatusEffects.ABSORPTION to 1
            )
        )

        val EUCLASE = GemAmuletConfig(
            initialDurability = 13200,
            expiryTime = 120,
            effects = mapOf(
                StatusEffects.SPEED to 5,
                StatusEffects.REGENERATION to 5,
                StatusEffects.ABSORPTION to 2,
                StatusEffects.FIRE_RESISTANCE to 0
            )
        )
    }
}
