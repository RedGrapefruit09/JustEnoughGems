package com.redgrapefruit.justenoughgems.init

import com.redgrapefruit.justenoughgems.tool.toolMaterial

object JEGToolMaterials {
    // TODO (v0.5): add ingots and set them as repair materials

    // Spec:
    // durability += 300
    // mining speed += 2.5f
    // attack damage += 2.5f
    // enchantability += 3

    val QUARTZ = toolMaterial {
        durability = 1800
        miningSpeedMultiplier = 11f
        attackDamage = 4.5f
        miningLevel = 4
        enchantability = 18
        placeholderRepairIngredient()
    }

    val ANDALUSITE = toolMaterial {
        durability = 2100
        miningSpeedMultiplier = 13.5f
        attackDamage = 7f
        miningLevel = 4
        enchantability = 21
        placeholderRepairIngredient()
    }

    val MORGANITE = toolMaterial {
        durability = 2400
        miningSpeedMultiplier = 16f
        attackDamage = 9.5f
        miningLevel = 4
        enchantability = 24
        placeholderRepairIngredient()
    }

    val TAAFFEITE = toolMaterial {
        durability = 2700
        miningSpeedMultiplier = 18.5f
        attackDamage = 12f
        miningLevel = 4
        enchantability = 27
        placeholderRepairIngredient()
    }

    val PINK_QUARTZ = toolMaterial {
        durability = 3000
        miningSpeedMultiplier = 21f
        attackDamage = 14.5f
        miningLevel = 4
        enchantability = 30
        placeholderRepairIngredient()
    }

    val EUCLASE = toolMaterial {
        durability = 3300
        miningSpeedMultiplier = 23.5f
        attackDamage = 17f
        miningLevel = 4
        enchantability = 33
        placeholderRepairIngredient()
    }

    val CHRYSOLITE = toolMaterial {
        durability = 3600
        miningSpeedMultiplier = 26f
        attackDamage = 19.5f
        miningLevel = 4
        enchantability = 36
        placeholderRepairIngredient()
    }

    val SAPPHIRE = toolMaterial {
        durability = 3900
        miningSpeedMultiplier = 28.5f
        attackDamage = 22f
        miningLevel = 4
        enchantability = 39
        placeholderRepairIngredient()
    }

    val HELIODORE = toolMaterial {
        durability = 4200
        miningSpeedMultiplier = 30f
        attackDamage = 24.5f
        miningLevel = 4
        enchantability = 42
        placeholderRepairIngredient()
    }

    val RUBY = toolMaterial {
        durability = 4500
        miningSpeedMultiplier = 32.5f
        attackDamage = 27f
        miningLevel = 4
        enchantability = 45
        placeholderRepairIngredient()
    }

    val AQUAMARINE = toolMaterial {
        durability = 4800
        miningSpeedMultiplier = 35f
        attackDamage = 29.5f
        miningLevel = 4
        enchantability = 48
        placeholderRepairIngredient()
    }

    val TANZANITE = toolMaterial {
        durability = 5100
        miningSpeedMultiplier = 37.5f
        attackDamage = 32f
        miningLevel = 4
        enchantability = 51
        placeholderRepairIngredient()
    }

    val TSAVORITE = toolMaterial {
        durability = 5400
        miningSpeedMultiplier = 40f
        attackDamage = 34.5f
        miningLevel = 4
        enchantability = 54
        placeholderRepairIngredient()
    }

    val VERDELITE = toolMaterial {
        durability = 5700
        miningSpeedMultiplier = 42.5f
        attackDamage = 37f
        miningLevel = 4
        enchantability = 57
        placeholderRepairIngredient()
    }

    val INDIGOLITE = toolMaterial {
        durability = 6000
        miningSpeedMultiplier = 45f
        attackDamage = 39.5f
        miningLevel = 4
        enchantability = 60
        placeholderRepairIngredient()
    }

    val OPAL = toolMaterial {
        durability = 6300
        miningSpeedMultiplier = 47.5f
        attackDamage = 42f
        miningLevel = 4
        enchantability = 63
        placeholderRepairIngredient()
    }
}
