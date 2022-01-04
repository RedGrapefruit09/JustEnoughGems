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

        val ANDALUSITE = GemToolConfig(
            chance = Chance(8),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 150, 0)
            )
        )

        val MORGANITE = GemToolConfig(
            chance = Chance(11),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 200, 0),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0)
            )
        )

        val TAAFFEITE = GemToolConfig(
            chance = Chance(14),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 250, 1),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 150, 1)
            )
        )

        val PINK_QUARTZ = GemToolConfig(
            chance = Chance(17),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 350, 1),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200, 1)
            )
        )

        val EUCLASE = GemToolConfig(
            chance = Chance(20),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 425, 2),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 250, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 125, 0)
            )
        )

        val CHRYSOLITE = GemToolConfig(
            chance = Chance(23),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 500, 2),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 325, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 175, 1)
            )
        )

        val SAPPHIRE = GemToolConfig(
            chance = Chance(26),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 575, 2),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 400, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 275, 2)
            )
        )

        val HELIODORE = GemToolConfig(
            chance = Chance(29),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 625, 2),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 450, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 325, 2),
                StatusEffectInstance(StatusEffects.SPEED, 200, 0)
            )
        )

        val RUBY = GemToolConfig(
            chance = Chance(32),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 700, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 525, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 400, 2),
                StatusEffectInstance(StatusEffects.SPEED, 250, 1)
            )
        )

        val AQUAMARINE = GemToolConfig(
            chance = Chance(35),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 775, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 615, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 475, 2),
                StatusEffectInstance(StatusEffects.SPEED, 325, 1)
            )
        )

        val TANZANITE = GemToolConfig(
            chance = Chance(38),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 850, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 675, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 525, 2),
                StatusEffectInstance(StatusEffects.SPEED, 400, 2)
            )
        )

        val TSAVORITE = GemToolConfig(
            chance = Chance(41),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 925, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 750, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 600, 2),
                StatusEffectInstance(StatusEffects.SPEED, 475, 2),
                StatusEffectInstance(StatusEffects.HEALTH_BOOST, 150, 1)
            )
        )

        val VERDELITE = GemToolConfig(
            chance = Chance(44),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 1000, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 825, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 675, 2),
                StatusEffectInstance(StatusEffects.SPEED, 550, 2),
                StatusEffectInstance(StatusEffects.HEALTH_BOOST, 250, 2)
            )
        )

        val INDIGOLITE = GemToolConfig(
            chance = Chance(47),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 1075, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 900, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 750, 3),
                StatusEffectInstance(StatusEffects.SPEED, 625, 3),
                StatusEffectInstance(StatusEffects.HEALTH_BOOST, 350, 2)
            )
        )

        val OPAL = GemToolConfig(
            chance = Chance(50),
            effects = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 1150, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1000, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 850, 3),
                StatusEffectInstance(StatusEffects.SPEED, 700, 3),
                StatusEffectInstance(StatusEffects.HEALTH_BOOST, 415, 3)
            )
        )
    }
}
