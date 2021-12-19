package com.redgrapefruit.justenoughgems.tool

import net.minecraft.item.Items
import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient

@DslMarker
annotation class ToolMaterialDsl

@ToolMaterialDsl
inline fun toolMaterial(action: ToolMaterialScope.() -> Unit): ToolMaterial {
    val scope = ToolMaterialScope()
    scope.action()
    return scope.create()
}

class ToolMaterialScope(
    var durability: Int? = null,
    var miningSpeedMultiplier: Float? = null,
    var attackDamage: Float? = null,
    var miningLevel: Int? = null,
    var enchantability: Int? = null,
    var repairIngredient: Ingredient? = null
) {
    fun placeholderRepairIngredient() {
        repairIngredient = Ingredient.ofItems(Items.BEDROCK)
    }

    fun create(): ToolMaterial {
        assert(durability)
        assert(miningSpeedMultiplier)
        assert(attackDamage)
        assert(miningLevel)
        assert(enchantability)
        assert(repairIngredient)

        return Impl(this)
    }

    private fun <T> assert(value: T?) {
        if (value == null) throw RuntimeException("Assertion failed: null reference")
    }

    private class Impl(private val scope: ToolMaterialScope) : ToolMaterial {
        override fun getDurability(): Int {
            return scope.durability!!
        }

        override fun getMiningSpeedMultiplier(): Float {
            return scope.miningSpeedMultiplier!!
        }

        override fun getAttackDamage(): Float {
            return scope.attackDamage!!
        }

        override fun getMiningLevel(): Int {
            return scope.miningLevel!!
        }

        override fun getEnchantability(): Int {
            return scope.enchantability!!
        }

        override fun getRepairIngredient(): Ingredient {
            return scope.repairIngredient!!
        }
    }
}
