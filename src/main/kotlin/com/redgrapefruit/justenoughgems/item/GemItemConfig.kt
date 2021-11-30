package com.redgrapefruit.justenoughgems.item

import com.redgrapefruit.justenoughgems.util.Chance
import com.redgrapefruit.justenoughgems.util.Range
import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffects

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

        val PINK_QUARTZ = GemItemConfig(
            reloadTime = 360,
            effects = listOf(
                GemItemEffect(
                    statusEffect = StatusEffects.SPEED,
                    duration = Range(350, 500).scaled(),
                    amplifier = Range.nonRandom(2),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.REGENERATION,
                    duration = Range(500, 550).scaled(),
                    amplifier = Range(1, 2),
                    chance = Chance(95)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.ABSORPTION,
                    duration = Range(200, 300).scaled(),
                    amplifier = Range(0, 1),
                    chance = Chance(50)
                )
            )
        )

        val EUCLASE = GemItemConfig(
            reloadTime = 330,
            effects = listOf(
                GemItemEffect(
                    statusEffect = StatusEffects.SPEED,
                    duration = Range(400, 550).scaled(),
                    amplifier = Range(2, 3),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.REGENERATION,
                    duration = Range(550, 700).scaled(),
                    amplifier = Range.nonRandom(2),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.ABSORPTION,
                    duration = Range(250, 400).scaled(),
                    amplifier = Range.nonRandom(1),
                    chance = Chance(60)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.FIRE_RESISTANCE,
                    duration = Range(150, 300).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance(30)
                )
            )
        )

        val CHRYSOLITE = GemItemConfig(
            reloadTime = 300,
            effects = listOf(
                GemItemEffect(
                    statusEffect = StatusEffects.SPEED,
                    duration = Range(500, 600).scaled(),
                    amplifier = Range.nonRandom(3),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.REGENERATION,
                    duration = Range(600, 750).scaled(),
                    amplifier = Range(2, 3),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.ABSORPTION,
                    duration = Range(300, 450).scaled(),
                    amplifier = Range(1, 2),
                    chance = Chance(75)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.FIRE_RESISTANCE,
                    duration = Range(200, 350).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance(40)
                )
            )
        )

        val SAPPHIRE = GemItemConfig(
            reloadTime = 270,
            effects = listOf(
                GemItemEffect(
                    statusEffect = StatusEffects.SPEED,
                    duration = Range(550, 700).scaled(),
                    amplifier = Range(3, 4),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.REGENERATION,
                    duration = Range(700, 850).scaled(),
                    amplifier = Range.nonRandom(3),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.ABSORPTION,
                    duration = Range(400, 500).scaled(),
                    amplifier = Range.nonRandom(2),
                    chance = Chance(80)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.FIRE_RESISTANCE,
                    duration = Range(250, 400).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance(50)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.STRENGTH,
                    duration = Range(100, 150).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance(15)
                )
            )
        )

        val HELIODORE = GemItemConfig(
            reloadTime = 240,
            effects = listOf(
                GemItemEffect(
                    statusEffect = StatusEffects.SPEED,
                    duration = Range(600, 750).scaled(),
                    amplifier = Range.nonRandom(4),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.REGENERATION,
                    duration = Range(800, 900).scaled(),
                    amplifier = Range(3, 4),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.ABSORPTION,
                    duration = Range(500, 550).scaled(),
                    amplifier = Range(2, 3),
                    chance = Chance(85)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.FIRE_RESISTANCE,
                    duration = Range(300, 450).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance(60)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.STRENGTH,
                    duration = Range(150, 300).scaled(),
                    amplifier = Range(0, 1),
                    chance = Chance(25)
                )
            )
        )

        val RUBY = GemItemConfig(
            reloadTime = 210,
            effects = listOf(
                GemItemEffect(
                    statusEffect = StatusEffects.SPEED,
                    duration = Range(650, 800).scaled(),
                    amplifier = Range(4, 5),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.REGENERATION,
                    duration = Range(800, 900).scaled(),
                    amplifier = Range(3, 4),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.ABSORPTION,
                    duration = Range(550, 600).scaled(),
                    amplifier = Range.nonRandom(3),
                    chance = Chance(90)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.FIRE_RESISTANCE,
                    duration = Range(350, 500).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance(70)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.STRENGTH,
                    duration = Range(200, 400).scaled(),
                    amplifier = Range.nonRandom(1),
                    chance = Chance(40)
                )
            )
        )

        val AQUAMARINE = GemItemConfig(
            reloadTime = 180,
            effects = listOf(
                GemItemEffect(
                    statusEffect = StatusEffects.SPEED,
                    duration = Range(700, 800).scaled(),
                    amplifier = Range.nonRandom(5),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.REGENERATION,
                    duration = Range(850, 950).scaled(),
                    amplifier = Range.nonRandom(4),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.ABSORPTION,
                    duration = Range(600, 650).scaled(),
                    amplifier = Range(3, 4),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.FIRE_RESISTANCE,
                    duration = Range(400, 550).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance(75)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.STRENGTH,
                    duration = Range(250, 450).scaled(),
                    amplifier = Range(1, 2),
                    chance = Chance(50)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.JUMP_BOOST,
                    duration = Range(100, 200).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance(25)
                )
            )
        )

        val TANZANITE = GemItemConfig(
            reloadTime = 150,
            effects = listOf(
                GemItemEffect(
                    statusEffect = StatusEffects.SPEED,
                    duration = Range(750, 800).scaled(),
                    amplifier = Range(5, 6),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.REGENERATION,
                    duration = Range(900, 1000).scaled(),
                    amplifier = Range(4, 5),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.ABSORPTION,
                    duration = Range(650, 700).scaled(),
                    amplifier = Range.nonRandom(4),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.FIRE_RESISTANCE,
                    duration = Range(500, 700).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance(85)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.STRENGTH,
                    duration = Range(350, 550).scaled(),
                    amplifier = Range.nonRandom(2),
                    chance = Chance(65)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.JUMP_BOOST,
                    duration = Range(250, 400).scaled(),
                    amplifier = Range(0, 1),
                    chance = Chance(40)
                )
            )
        )

        val TSAVORITE = GemItemConfig(
            reloadTime = 120,
            effects = listOf(
                GemItemEffect(
                    statusEffect = StatusEffects.SPEED,
                    duration = Range(800, 850).scaled(),
                    amplifier = Range.nonRandom(6),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.REGENERATION,
                    duration = Range(950, 1000).scaled(),
                    amplifier = Range.nonRandom(5),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.ABSORPTION,
                    duration = Range(700, 800).scaled(),
                    amplifier = Range(4, 5),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.FIRE_RESISTANCE,
                    duration = Range(500, 700).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance.always
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.STRENGTH,
                    duration = Range(400, 600).scaled(),
                    amplifier = Range(2, 3),
                    chance = Chance(75)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.JUMP_BOOST,
                    duration = Range(300, 450).scaled(),
                    amplifier = Range.nonRandom(1),
                    chance = Chance(50)
                ),
                GemItemEffect(
                    statusEffect = StatusEffects.HEALTH_BOOST,
                    duration = Range(100, 150).scaled(),
                    amplifier = Range.nonRandom(0),
                    chance = Chance(30)
                )
            )
        )

        // Apply a constant multiplier to all durations to speed up & unify balancing changes
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
