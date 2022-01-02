package com.redgrapefruit.justenoughgems.tool

import com.redgrapefruit.justenoughgems.util.Chance
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects

data class GemToolConfig(
    val chance: Chance,
    val effects: List<StatusEffectInstance>
) {
    companion object {
        val QUARTZ = GemToolConfig(
            chance = Chance(5),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 100, 0)
            )
        )
    }
}
