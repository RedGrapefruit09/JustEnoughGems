package com.redgrapefruit.justenoughgems.util

import java.util.*

// Taken from https://stackoverflow.com/questions/12967896/converting-integers-to-roman-numerals-java
// And converted to Kotlin using IntelliJ auto-conversion
object RomanNumber {
    private val map = TreeMap<Int, String>()

    fun toRoman(number: Int): String? {
        val l = map.floorKey(number)
        return if (number == l) {
            map[number]
        } else map[l].toString() + toRoman(number - l)
    }

    init {
        map[1000] = "M"
        map[900] = "CM"
        map[500] = "D"
        map[400] = "CD"
        map[100] = "C"
        map[90] = "XC"
        map[50] = "L"
        map[40] = "XL"
        map[10] = "X"
        map[9] = "IX"
        map[5] = "V"
        map[4] = "IV"
        map[1] = "I"
    }
}
