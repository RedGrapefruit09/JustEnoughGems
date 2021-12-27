package com.redgrapefruit.justenoughgems.init

import com.github.crimsondawn45.fabricshieldlib.lib.event.ShieldBlockCallback
import com.redgrapefruit.justenoughgems.item.GemShield
import com.redgrapefruit.justenoughgems.util.IRegistry
import com.redgrapefruit.justenoughgems.util.toId
import net.minecraft.entity.damage.DamageSource
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.util.ActionResult
import net.minecraft.util.registry.Registry

object JEGShields: IRegistry {
    val QUARTZ_SHIELD = GemShield(1, 10, 2500, 95, 16)

    override fun register() {
        register("quartz_shield", QUARTZ_SHIELD)

        // Damage reflection
        ShieldBlockCallback.EVENT.register { defender, source, amount, _, shield ->
            val attacker = source.attacker
            val item = shield.item

            if (attacker != null && defender is PlayerEntity && item is GemShield) {
                attacker.damage(DamageSource.player(defender), amount / 100f * item.reflectPercent)
            }

            ActionResult.PASS
        }
    }

    private fun register(name: String, item: Item) {
        Registry.register(Registry.ITEM, name.toId(), item)
    }
}
