package com.redgrapefruit.justenoughgems.tool

import com.redgrapefruit.justenoughgems.util.Chance
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects

data class GemWeaponConfig(
    val attackerChance: Chance,
    val targetChance: Chance,
    val toAttacker: List<StatusEffectInstance>,
    val toTarget: List<StatusEffectInstance>
) {
    companion object {
        // Notes:
        // attacker chance starts at 5 increases by 3
        // target chance starts at 10 increases by 5

        val QUARTZ = GemWeaponConfig(
            attackerChance = Chance(5),
            targetChance = Chance(10),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 100, 0)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 125, 0)
            )
        )
    }
}
