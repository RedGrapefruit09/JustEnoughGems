package com.redgrapefruit.justenoughgems.init

import com.github.crimsondawn45.fabricshieldlib.lib.event.ShieldBlockCallback
import com.redgrapefruit.justenoughgems.item.GemShieldItem
import com.redgrapefruit.justenoughgems.util.IInitializer
import com.redgrapefruit.justenoughgems.util.register
import net.minecraft.entity.damage.DamageSource
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.ActionResult

object JEGShields: IInitializer {
    val QUARTZ_SHIELD = GemShieldItem(1, 50, 2500, 95, 16, JEGItems.QUARTZ_INGOT)
    val ANDALUSITE_SHIELD = GemShieldItem(2, 60, 2750, 90, 17, JEGItems.ANDALUSITE_INGOT)
    val MORGANITE_SHIELD = GemShieldItem(3, 70, 3000, 85, 18, JEGItems.MORGANITE_INGOT)
    val TAAFFEITE_SHIELD = GemShieldItem(4, 80, 3250, 80, 19, JEGItems.TAAFFEITE_INGOT)
    val PINK_QUARTZ_SHIELD = GemShieldItem(5, 90, 3500, 75, 20, JEGItems.PINK_QUARTZ_INGOT)
    val EUCLASE_SHIELD = GemShieldItem(6, 100, 3750, 70, 21, JEGItems.EUCLASE_INGOT)
    val CHRYSOLITE_SHIELD = GemShieldItem(7, 110, 4000, 65, 22, JEGItems.CHRYSOLITE_INGOT)
    val SAPPHIRE_SHIELD = GemShieldItem(8, 120, 4250, 60, 23, JEGItems.SAPPHIRE_INGOT)
    val HELIODORE_SHIELD = GemShieldItem(9, 130, 4500, 55, 24, JEGItems.HELIODORE_INGOT)
    val RUBY_SHIELD = GemShieldItem(10, 140, 4750, 50, 25, JEGItems.RUBY_INGOT)
    val AQUAMARINE_SHIELD = GemShieldItem(11, 150, 5000, 45, 26, JEGItems.AQUAMARINE_INGOT)
    val TANZANITE_SHIELD = GemShieldItem(12, 160, 5250, 40, 27, JEGItems.TANZANITE_INGOT)
    val TSAVORITE_SHIELD = GemShieldItem(13, 170, 5500, 35, 28, JEGItems.TSAVORITE_INGOT)
    val VERDELITE_SHIELD = GemShieldItem(14, 180, 5750, 30, 29, JEGItems.VERDELITE_INGOT)
    val INDIGOLITE_SHIELD = GemShieldItem(15, 190, 6000, 25, 30, JEGItems.INDIGOLITE_INGOT)
    val OPAL_SHIELD = GemShieldItem(16, 200, 6250, 20, 31, JEGItems.OPAL_INGOT)

    override fun initialize() {
        register("quartz_shield", QUARTZ_SHIELD)
        register("andalusite_shield", ANDALUSITE_SHIELD)
        register("morganite_shield", MORGANITE_SHIELD)
        register("taaffeite_shield", TAAFFEITE_SHIELD)
        register("pink_quartz_shield", PINK_QUARTZ_SHIELD)
        register("euclase_shield", EUCLASE_SHIELD)
        register("chrysolite_shield", CHRYSOLITE_SHIELD)
        register("sapphire_shield", SAPPHIRE_SHIELD)
        register("heliodore_shield", HELIODORE_SHIELD)
        register("ruby_shield", RUBY_SHIELD)
        register("aquamarine_shield", AQUAMARINE_SHIELD)
        register("tanzanite_shield", TANZANITE_SHIELD)
        register("tsavorite_shield", TSAVORITE_SHIELD)
        register("verdelite_shield", VERDELITE_SHIELD)
        register("indigolite_shield", INDIGOLITE_SHIELD)
        register("opal_shield", OPAL_SHIELD)

        // Damage reflection
        ShieldBlockCallback.EVENT.register { defender, source, amount, _, shield ->
            val attacker = source.attacker
            val item = shield.item

            if (attacker != null && defender is PlayerEntity && item is GemShieldItem) {
                attacker.damage(DamageSource.player(defender), amount / 100f * item.reflectPercent)
            }

            ActionResult.PASS
        }
    }
}
