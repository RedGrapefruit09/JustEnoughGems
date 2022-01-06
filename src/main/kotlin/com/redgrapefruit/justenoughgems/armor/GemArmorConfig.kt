package com.redgrapefruit.justenoughgems.armor

import com.redgrapefruit.justenoughgems.util.Chance
import net.minecraft.entity.EquipmentSlot

data class GemArmorConfig(
    val reflectPercentages: Map<ArmorPiece, Int>,
    val reflectChances: Map<ArmorPiece, Chance>
) {
    companion object {
        val QUARTZ = GemArmorConfig(
            mapOf(
                ArmorPiece.HELMET to 20,
                ArmorPiece.CHESTPLATE to 30,
                ArmorPiece.LEGGINGS to 20,
                ArmorPiece.BOOTS to 15
            ),
            mapOf(
                ArmorPiece.HELMET to Chance(10),
                ArmorPiece.CHESTPLATE to Chance(15),
                ArmorPiece.LEGGINGS to Chance(10),
                ArmorPiece.BOOTS to Chance(5)
            )
        )
    }
}

enum class ArmorPiece(val slot: EquipmentSlot) {
    HELMET(EquipmentSlot.HEAD),
    CHESTPLATE(EquipmentSlot.CHEST),
    LEGGINGS(EquipmentSlot.LEGS),
    BOOTS(EquipmentSlot.FEET);
}
