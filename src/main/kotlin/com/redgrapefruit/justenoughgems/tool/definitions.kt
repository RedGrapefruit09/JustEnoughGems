package com.redgrapefruit.justenoughgems.tool

import com.redgrapefruit.justenoughgems.util.defaultItemSettings
import net.minecraft.item.AxeItem
import net.minecraft.item.ToolMaterial

class ModAxe(toolMaterial: ToolMaterial, attackDamage: Float, attackSpeed: Float) : AxeItem(toolMaterial, attackDamage, attackSpeed, defaultItemSettings)
