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
                ArmorPiece.HELMET to 5,
                ArmorPiece.CHESTPLATE to 15,
                ArmorPiece.LEGGINGS to 10,
                ArmorPiece.BOOTS to 5
            ),
            mapOf(
                ArmorPiece.HELMET to Chance(10),
                ArmorPiece.CHESTPLATE to Chance(15),
                ArmorPiece.LEGGINGS to Chance(10),
                ArmorPiece.BOOTS to Chance(5)
            )
        )

        val ANDALUSITE = GemArmorConfig(
            mapOf(
                ArmorPiece.HELMET to 8,
                ArmorPiece.CHESTPLATE to 18,
                ArmorPiece.LEGGINGS to 13,
                ArmorPiece.BOOTS to 8
            ),
            mapOf(
                ArmorPiece.HELMET to Chance(15),
                ArmorPiece.CHESTPLATE to Chance(20),
                ArmorPiece.LEGGINGS to Chance(15),
                ArmorPiece.BOOTS to Chance(10)
            )
        )

        val MORGANITE = GemArmorConfig(
            mapOf(
                ArmorPiece.HELMET to 11,
                ArmorPiece.CHESTPLATE to 21,
                ArmorPiece.LEGGINGS to 16,
                ArmorPiece.BOOTS to 11
            ),
            mapOf(
                ArmorPiece.HELMET to Chance(20),
                ArmorPiece.CHESTPLATE to Chance(25),
                ArmorPiece.LEGGINGS to Chance(20),
                ArmorPiece.BOOTS to Chance(15)
            )
        )

        val TAAFFEITE = GemArmorConfig(
            mapOf(
                ArmorPiece.HELMET to 14,
                ArmorPiece.CHESTPLATE to 24,
                ArmorPiece.LEGGINGS to 19,
                ArmorPiece.BOOTS to 14
            ),
            mapOf(
                ArmorPiece.HELMET to Chance(25),
                ArmorPiece.CHESTPLATE to Chance(30),
                ArmorPiece.LEGGINGS to Chance(25),
                ArmorPiece.BOOTS to Chance(20)
            )
        )

        val PINK_QUARTZ = GemArmorConfig(
            mapOf(
                ArmorPiece.HELMET to 17,
                ArmorPiece.CHESTPLATE to 27,
                ArmorPiece.LEGGINGS to 22,
                ArmorPiece.BOOTS to 17
            ),
            mapOf(
                ArmorPiece.HELMET to Chance(30),
                ArmorPiece.CHESTPLATE to Chance(35),
                ArmorPiece.LEGGINGS to Chance(30),
                ArmorPiece.BOOTS to Chance(25)
            )
        )

        val EUCLASE = GemArmorConfig(
            mapOf(
                ArmorPiece.HELMET to 20,
                ArmorPiece.CHESTPLATE to 30,
                ArmorPiece.LEGGINGS to 25,
                ArmorPiece.BOOTS to 20
            ),
            mapOf(
                ArmorPiece.HELMET to Chance(35),
                ArmorPiece.CHESTPLATE to Chance(40),
                ArmorPiece.LEGGINGS to Chance(35),
                ArmorPiece.BOOTS to Chance(30)
            )
        )

        val CHRYSOLITE = GemArmorConfig(
            mapOf(
                ArmorPiece.HELMET to 23,
                ArmorPiece.CHESTPLATE to 33,
                ArmorPiece.LEGGINGS to 28,
                ArmorPiece.BOOTS to 23
            ),
            mapOf(
                ArmorPiece.HELMET to Chance(40),
                ArmorPiece.CHESTPLATE to Chance(45),
                ArmorPiece.LEGGINGS to Chance(40),
                ArmorPiece.BOOTS to Chance(35)
            )
        )

        val SAPPHIRE = GemArmorConfig(
            mapOf(
                ArmorPiece.HELMET to 26,
                ArmorPiece.CHESTPLATE to 36,
                ArmorPiece.LEGGINGS to 31,
                ArmorPiece.BOOTS to 26
            ),
            mapOf(
                ArmorPiece.HELMET to Chance(45),
                ArmorPiece.CHESTPLATE to Chance(50),
                ArmorPiece.LEGGINGS to Chance(45),
                ArmorPiece.BOOTS to Chance(40)
            )
        )
    }
}

// A stripped-down version of EquipmentSlot with support for armor slots only, better names.
// Can convert back to EquipmentSlot if needed
enum class ArmorPiece(val slot: EquipmentSlot) {
    HELMET(EquipmentSlot.HEAD),
    CHESTPLATE(EquipmentSlot.CHEST),
    LEGGINGS(EquipmentSlot.LEGS),
    BOOTS(EquipmentSlot.FEET);
}
