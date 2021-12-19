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

        val ANDALUSITE = GemWeaponConfig(
            attackerChance = Chance(8),
            targetChance = Chance(15),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 150, 0)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 175, 0)
            )
        )

        val MORGANITE = GemWeaponConfig(
            attackerChance = Chance(11),
            targetChance = Chance(20),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 200, 0),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 0)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 225, 0),
                StatusEffectInstance(StatusEffects.NAUSEA, 100, 0)
            )
        )

        val TAAFFEITE = GemWeaponConfig(
            attackerChance = Chance(14),
            targetChance = Chance(25),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 250, 1),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 150, 1)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 285, 1),
                StatusEffectInstance(StatusEffects.NAUSEA, 175, 1)
            )
        )

        val PINK_QUARTZ = GemWeaponConfig(
            attackerChance = Chance(17),
            targetChance = Chance(30),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 350, 1),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200, 1)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 400, 1),
                StatusEffectInstance(StatusEffects.NAUSEA, 250, 1)
            )
        )

        val EUCLASE = GemWeaponConfig(
            attackerChance = Chance(21),
            targetChance = Chance(35),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 425, 2),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 250, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 125, 0)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 450, 2),
                StatusEffectInstance(StatusEffects.NAUSEA, 325, 1),
                StatusEffectInstance(StatusEffects.WEAKNESS, 100, 0)
            )
        )

        val CHRYSOLITE = GemWeaponConfig(
            attackerChance = Chance(24),
            targetChance = Chance(40),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 500, 2),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 325, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 175, 1)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 525, 2),
                StatusEffectInstance(StatusEffects.NAUSEA, 400, 1),
                StatusEffectInstance(StatusEffects.WEAKNESS, 150, 1)
            )
        )

        val SAPPHIRE = GemWeaponConfig(
            attackerChance = Chance(27),
            targetChance = Chance(45),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 575, 2),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 400, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 275, 2)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 650, 2),
                StatusEffectInstance(StatusEffects.NAUSEA, 500, 1),
                StatusEffectInstance(StatusEffects.WEAKNESS, 225, 2)
            )
        )

        val HELIODORE = GemWeaponConfig(
            attackerChance = Chance(30),
            targetChance = Chance(50),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 625, 2),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 450, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 325, 2),
                StatusEffectInstance(StatusEffects.SPEED, 200, 0)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 725, 2),
                StatusEffectInstance(StatusEffects.NAUSEA, 575, 1),
                StatusEffectInstance(StatusEffects.WEAKNESS, 300, 2),
                StatusEffectInstance(StatusEffects.BLINDNESS, 200, 0)
            )
        )

        val RUBY = GemWeaponConfig(
            attackerChance = Chance(33),
            targetChance = Chance(55),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 700, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 525, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 400, 2),
                StatusEffectInstance(StatusEffects.SPEED, 250, 1)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 800, 2),
                StatusEffectInstance(StatusEffects.NAUSEA, 625, 1),
                StatusEffectInstance(StatusEffects.WEAKNESS, 360, 2),
                StatusEffectInstance(StatusEffects.BLINDNESS, 275, 0)
            )
        )

        val AQUAMARINE = GemWeaponConfig(
            attackerChance = Chance(36),
            targetChance = Chance(60),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 775, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 615, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 475, 2),
                StatusEffectInstance(StatusEffects.SPEED, 325, 1)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 850, 2),
                StatusEffectInstance(StatusEffects.NAUSEA, 700, 1),
                StatusEffectInstance(StatusEffects.WEAKNESS, 425, 2),
                StatusEffectInstance(StatusEffects.BLINDNESS, 325, 0)
            )
        )

        val TANZANITE = GemWeaponConfig(
            attackerChance = Chance(39),
            targetChance = Chance(65),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 850, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 675, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 525, 2),
                StatusEffectInstance(StatusEffects.SPEED, 400, 2)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 915, 2),
                StatusEffectInstance(StatusEffects.NAUSEA, 775, 1),
                StatusEffectInstance(StatusEffects.WEAKNESS, 500, 2),
                StatusEffectInstance(StatusEffects.BLINDNESS, 385, 0)
            )
        )

        val TSAVORITE = GemWeaponConfig(
            attackerChance = Chance(42),
            targetChance = Chance(70),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 925, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 750, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 600, 2),
                StatusEffectInstance(StatusEffects.SPEED, 475, 2),
                StatusEffectInstance(StatusEffects.HEALTH_BOOST, 150, 1)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 985, 2),
                StatusEffectInstance(StatusEffects.NAUSEA, 775, 1),
                StatusEffectInstance(StatusEffects.WEAKNESS, 600, 2),
                StatusEffectInstance(StatusEffects.BLINDNESS, 450, 0),
                StatusEffectInstance(StatusEffects.GLOWING, 200, 0)
            )
        )

        val VERDELITE = GemWeaponConfig(
            attackerChance = Chance(45),
            targetChance = Chance(75),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 1000, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 825, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 675, 2),
                StatusEffectInstance(StatusEffects.SPEED, 550, 2),
                StatusEffectInstance(StatusEffects.HEALTH_BOOST, 250, 2)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 1050, 2),
                StatusEffectInstance(StatusEffects.NAUSEA, 875, 1),
                StatusEffectInstance(StatusEffects.WEAKNESS, 725, 2),
                StatusEffectInstance(StatusEffects.BLINDNESS, 535, 1),
                StatusEffectInstance(StatusEffects.GLOWING, 275, 0)
            )
        )

        val INDIGOLITE = GemWeaponConfig(
            attackerChance = Chance(48),
            targetChance = Chance(80),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 1075, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 900, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 750, 3),
                StatusEffectInstance(StatusEffects.SPEED, 625, 3),
                StatusEffectInstance(StatusEffects.HEALTH_BOOST, 350, 2)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 1125, 2),
                StatusEffectInstance(StatusEffects.NAUSEA, 925, 2),
                StatusEffectInstance(StatusEffects.WEAKNESS, 825, 2),
                StatusEffectInstance(StatusEffects.BLINDNESS, 625, 2),
                StatusEffectInstance(StatusEffects.GLOWING, 315, 0)
            )
        )

        val OPAL = GemWeaponConfig(
            attackerChance = Chance(51),
            targetChance = Chance(85),
            toAttacker = listOf(
                StatusEffectInstance(StatusEffects.REGENERATION, 1150, 3),
                StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1000, 1),
                StatusEffectInstance(StatusEffects.ABSORPTION, 850, 3),
                StatusEffectInstance(StatusEffects.SPEED, 700, 3),
                StatusEffectInstance(StatusEffects.HEALTH_BOOST, 415, 3)
            ),
            toTarget = listOf(
                StatusEffectInstance(StatusEffects.POISON, 1250, 3),
                StatusEffectInstance(StatusEffects.NAUSEA, 1000, 3),
                StatusEffectInstance(StatusEffects.WEAKNESS, 900, 3),
                StatusEffectInstance(StatusEffects.BLINDNESS, 750, 3),
                StatusEffectInstance(StatusEffects.GLOWING, 500, 0)
            )
        )
    }
}
