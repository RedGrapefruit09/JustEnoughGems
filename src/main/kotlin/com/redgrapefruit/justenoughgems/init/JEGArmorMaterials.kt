package com.redgrapefruit.justenoughgems.init

import com.redgrapefruit.justenoughgems.armor.armorMaterial

object JEGArmorMaterials {
    private val BASE_DURABILITY = intArrayOf(13, 15, 16, 11)

    val QUARTZ = armorMaterial {
        durability(BASE_DURABILITY, 40)
        protection(4, 7, 9, 4)
        enchantability = 18
        defaultEquipSound()
        repairWith(JEGItems.QUARTZ_INGOT)
        name = "quartz"
        toughness = 3.5F
        noKnockbackResistance()
    }

    val ANDALUSITE = armorMaterial {
        durability(BASE_DURABILITY, 43)
        protection(6, 9, 11, 6)
        enchantability = 21
        defaultEquipSound()
        repairWith(JEGItems.ANDALUSITE_INGOT)
        name = "andalusite"
        toughness = 3.75F
        noKnockbackResistance()
    }

    val MORGANITE = armorMaterial {
        durability(BASE_DURABILITY, 46)
        protection(8, 11, 13, 8)
        enchantability = 24
        defaultEquipSound()
        repairWith(JEGItems.MORGANITE_INGOT)
        name = "morganite"
        toughness = 4.0F
        noKnockbackResistance()
    }

    val TAAFFEITE = armorMaterial {
        durability(BASE_DURABILITY, 49)
        protection(10, 13, 15, 10)
        enchantability = 27
        defaultEquipSound()
        repairWith(JEGItems.TAAFFEITE_INGOT)
        name = "taaffeite"
        toughness = 4.25F
        noKnockbackResistance()
    }

    val PINK_QUARTZ = armorMaterial {
        durability(BASE_DURABILITY, 52)
        protection(12, 15, 17, 12)
        enchantability = 30
        defaultEquipSound()
        repairWith(JEGItems.PINK_QUARTZ_INGOT)
        name = "pink_quartz"
        toughness = 4.5F
        noKnockbackResistance()
    }

    val EUCLASE = armorMaterial {
        durability(BASE_DURABILITY, 55)
        protection(14, 17, 19, 14)
        enchantability = 33
        defaultEquipSound()
        repairWith(JEGItems.EUCLASE_INGOT)
        name = "euclase"
        toughness = 4.75F
        noKnockbackResistance()
    }

    val CHRYSOLITE = armorMaterial {
        durability(BASE_DURABILITY, 58)
        protection(16, 19, 21, 16)
        enchantability = 36
        defaultEquipSound()
        repairWith(JEGItems.CHRYSOLITE_INGOT)
        name = "chrysolite"
        toughness = 5.0F
        noKnockbackResistance()
    }

    val SAPPHIRE = armorMaterial {
        durability(BASE_DURABILITY, 61)
        protection(18, 21, 23, 18)
        enchantability = 39
        defaultEquipSound()
        repairWith(JEGItems.SAPPHIRE_INGOT)
        name = "sapphire"
        toughness = 5.25F
        noKnockbackResistance()
    }

    val HELIODORE = armorMaterial {
        durability(BASE_DURABILITY, 64)
        protection(20, 23, 25, 20)
        enchantability = 42
        defaultEquipSound()
        repairWith(JEGItems.HELIODORE_INGOT)
        name = "heliodore"
        toughness = 5.5F
        noKnockbackResistance()
    }

    val RUBY = armorMaterial {
        durability(BASE_DURABILITY, 67)
        protection(22, 25, 27, 22)
        enchantability = 45
        defaultEquipSound()
        repairWith(JEGItems.RUBY_INGOT)
        name = "ruby"
        toughness = 5.75F
        noKnockbackResistance()
    }
}
