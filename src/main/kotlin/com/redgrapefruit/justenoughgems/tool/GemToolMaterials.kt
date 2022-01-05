package com.redgrapefruit.justenoughgems.tool

import com.redgrapefruit.justenoughgems.init.JEGItems

object GemToolMaterials {
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
        repairWith(JEGItems.QUARTZ_INGOT)
    }

    val ANDALUSITE = toolMaterial {
        durability = 2100
        miningSpeedMultiplier = 13.5f
        attackDamage = 7f
        miningLevel = 4
        enchantability = 21
        repairWith(JEGItems.ANDALUSITE_INGOT)
    }

    val MORGANITE = toolMaterial {
        durability = 2400
        miningSpeedMultiplier = 16f
        attackDamage = 9.5f
        miningLevel = 4
        enchantability = 24
        repairWith(JEGItems.MORGANITE_INGOT)
    }

    val TAAFFEITE = toolMaterial {
        durability = 2700
        miningSpeedMultiplier = 18.5f
        attackDamage = 12f
        miningLevel = 4
        enchantability = 27
        repairWith(JEGItems.TAAFFEITE_INGOT)
    }

    val PINK_QUARTZ = toolMaterial {
        durability = 3000
        miningSpeedMultiplier = 21f
        attackDamage = 14.5f
        miningLevel = 4
        enchantability = 30
        repairWith(JEGItems.PINK_QUARTZ_INGOT)
    }

    val EUCLASE = toolMaterial {
        durability = 3300
        miningSpeedMultiplier = 23.5f
        attackDamage = 17f
        miningLevel = 4
        enchantability = 33
        repairWith(JEGItems.EUCLASE_INGOT)
    }

    val CHRYSOLITE = toolMaterial {
        durability = 3600
        miningSpeedMultiplier = 26f
        attackDamage = 19.5f
        miningLevel = 4
        enchantability = 36
        repairWith(JEGItems.CHRYSOLITE_INGOT)
    }

    val SAPPHIRE = toolMaterial {
        durability = 3900
        miningSpeedMultiplier = 28.5f
        attackDamage = 22f
        miningLevel = 4
        enchantability = 39
        repairWith(JEGItems.SAPPHIRE_INGOT)
    }

    val HELIODORE = toolMaterial {
        durability = 4200
        miningSpeedMultiplier = 30f
        attackDamage = 24.5f
        miningLevel = 4
        enchantability = 42
        repairWith(JEGItems.HELIODORE_INGOT)
    }

    val RUBY = toolMaterial {
        durability = 4500
        miningSpeedMultiplier = 32.5f
        attackDamage = 27f
        miningLevel = 4
        enchantability = 45
        repairWith(JEGItems.RUBY_INGOT)
    }

    val AQUAMARINE = toolMaterial {
        durability = 4800
        miningSpeedMultiplier = 35f
        attackDamage = 29.5f
        miningLevel = 4
        enchantability = 48
        repairWith(JEGItems.AQUAMARINE_INGOT)
    }

    val TANZANITE = toolMaterial {
        durability = 5100
        miningSpeedMultiplier = 37.5f
        attackDamage = 32f
        miningLevel = 4
        enchantability = 51
        repairWith(JEGItems.TANZANITE_INGOT)
    }

    val TSAVORITE = toolMaterial {
        durability = 5400
        miningSpeedMultiplier = 40f
        attackDamage = 34.5f
        miningLevel = 4
        enchantability = 54
        repairWith(JEGItems.TSAVORITE_INGOT)
    }

    val VERDELITE = toolMaterial {
        durability = 5700
        miningSpeedMultiplier = 42.5f
        attackDamage = 37f
        miningLevel = 4
        enchantability = 57
        repairWith(JEGItems.VERDELITE_INGOT)
    }

    val INDIGOLITE = toolMaterial {
        durability = 6000
        miningSpeedMultiplier = 45f
        attackDamage = 39.5f
        miningLevel = 4
        enchantability = 60
        repairWith(JEGItems.INDIGOLITE_INGOT)
    }

    val OPAL = toolMaterial {
        durability = 6300
        miningSpeedMultiplier = 47.5f
        attackDamage = 42f
        miningLevel = 4
        enchantability = 63
        repairWith(JEGItems.OPAL_INGOT)
    }
}
