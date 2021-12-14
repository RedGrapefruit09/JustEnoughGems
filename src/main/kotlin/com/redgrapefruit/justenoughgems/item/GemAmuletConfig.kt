package com.redgrapefruit.justenoughgems.item

import net.minecraft.entity.effect.StatusEffect

data class GemAmuletConfig(
    val initialDurability: Int,
    val durabilityDecrease: Int,
    val expiryTime: Int,
    val effects: Map<StatusEffect, Int>
)
