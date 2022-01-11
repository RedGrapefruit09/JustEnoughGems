package com.redgrapefruit.justenoughgems.init

import com.redgrapefruit.justenoughgems.item.ModItem
import com.redgrapefruit.justenoughgems.util.IInitializer
import com.redgrapefruit.justenoughgems.util.MOD_ITEM_GROUP
import com.redgrapefruit.justenoughgems.util.register
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item

object JEGFood : IInitializer {
    // Apples
    val QUARTZ_APPLE = foodItem(1, 5, 1.3F, StatusEffectInstance(StatusEffects.REGENERATION, 500, 1))
    val ANDALUSITE_APPLE = foodItem(2, 5, 1.32F, StatusEffectInstance(StatusEffects.REGENERATION, 575, 1))
    val MORGANITE_APPLE = foodItem(3, 5, 1.34F, StatusEffectInstance(StatusEffects.REGENERATION, 650, 1))
    val TAAFFEITE_APPLE = foodItem(4, 6, 1.36F, StatusEffectInstance(StatusEffects.REGENERATION, 725, 1))
    val PINK_QUARTZ_APPLE = foodItem(5, 6, 1.38F, StatusEffectInstance(StatusEffects.REGENERATION, 800, 2))
    val EUCLASE_APPLE = foodItem(6, 6, 1.4F, StatusEffectInstance(StatusEffects.REGENERATION, 875, 2))
    val CHRYSOLITE_APPLE = foodItem(7, 7, 1.42F, StatusEffectInstance(StatusEffects.REGENERATION, 950, 2))
    val SAPPHIRE_APPLE = foodItem(8, 7, 1.44F, StatusEffectInstance(StatusEffects.REGENERATION, 1025, 2))
    val HELIODORE_APPLE = foodItem(9, 7, 1.46F, StatusEffectInstance(StatusEffects.REGENERATION, 1100, 3))
    val RUBY_APPLE = foodItem(10, 8, 1.48F, StatusEffectInstance(StatusEffects.REGENERATION, 1175, 3))
    val AQUAMARINE_APPLE = foodItem(11, 8, 1.5F, StatusEffectInstance(StatusEffects.REGENERATION, 1250, 3))
    val TANZANITE_APPLE = foodItem(12, 8, 1.52F, StatusEffectInstance(StatusEffects.REGENERATION, 1325, 3))
    val TSAVORITE_APPLE = foodItem(13, 9, 1.54F, StatusEffectInstance(StatusEffects.REGENERATION, 1400, 4))
    val VERDELITE_APPLE = foodItem(14, 9, 1.56F, StatusEffectInstance(StatusEffects.REGENERATION, 1475, 4))
    val INDIGOLITE_APPLE = foodItem(15, 9, 1.58F, StatusEffectInstance(StatusEffects.REGENERATION, 1550, 4))
    val OPAL_APPLE = foodItem(16, 10, 1.6F, StatusEffectInstance(StatusEffects.REGENERATION, 1625, 4))

    override fun initialize() {
        register("quartz_apple", QUARTZ_APPLE)
        register("andalusite_apple", ANDALUSITE_APPLE)
        register("morganite_apple", MORGANITE_APPLE)
        register("taaffeite_apple", TAAFFEITE_APPLE)
        register("pink_quartz_apple", PINK_QUARTZ_APPLE)
        register("euclase_apple", EUCLASE_APPLE)
        register("chrysolite_apple", CHRYSOLITE_APPLE)
        register("sapphire_apple", SAPPHIRE_APPLE)
        register("heliodore_apple", HELIODORE_APPLE)
        register("ruby_apple", RUBY_APPLE)
        register("aquamarine_apple", AQUAMARINE_APPLE)
        register("tanzanite_apple", TANZANITE_APPLE)
        register("tsavorite_apple", TSAVORITE_APPLE)
        register("verdelite_apple", VERDELITE_APPLE)
        register("indigolite_apple", INDIGOLITE_APPLE)
        register("opal_apple", OPAL_APPLE)
    }

    private fun foodItem(tier: Int, hunger: Int, saturationModifier: Float, effect: StatusEffectInstance): Item {
        return ModItem(tier, setting = Item.Settings()
            .group(MOD_ITEM_GROUP)
            .food(FoodComponent.Builder()
                .alwaysEdible()
                .statusEffect(effect, 1.0F)
                .hunger(hunger)
                .saturationModifier(saturationModifier)
                .build()))
    }
}
