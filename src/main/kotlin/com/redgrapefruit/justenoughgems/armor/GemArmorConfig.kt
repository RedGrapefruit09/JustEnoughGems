package com.redgrapefruit.justenoughgems.armor

import com.redgrapefruit.justenoughgems.util.Chance
import net.minecraft.entity.EquipmentSlot

data class GemArmorConfig(
    val reflectPercentages: Map<ArmorPiece, Int>,
    val reflectChances: Map<ArmorPiece, Chance>
)

enum class ArmorPiece(val slot: EquipmentSlot) {
    HELMET(EquipmentSlot.HEAD),
    CHESTPLATE(EquipmentSlot.CHEST),
    LEGGINGS(EquipmentSlot.LEGS),
    BOOTS(EquipmentSlot.FEET);
}
