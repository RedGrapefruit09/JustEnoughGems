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
        toughness = 4.0F
        noKnockbackResistance()
    }

    val MORGANITE = armorMaterial {
        durability(BASE_DURABILITY, 46)
        protection(8, 11, 13, 8)
        enchantability = 24
        defaultEquipSound()
        repairWith(JEGItems.MORGANITE_INGOT)
        name = "morganite"
        toughness = 4.5F
        noKnockbackResistance()
    }
}
