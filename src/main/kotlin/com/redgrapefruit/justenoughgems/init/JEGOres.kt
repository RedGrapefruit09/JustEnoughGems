package com.redgrapefruit.justenoughgems.init

import com.redgrapefruit.justenoughgems.block.OreBlock
import com.redgrapefruit.justenoughgems.util.IInitializer
import com.redgrapefruit.justenoughgems.util.register
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.world.gen.YOffset
import net.minecraft.world.gen.decorator.CountPlacementModifier
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier
import net.minecraft.world.gen.decorator.SquarePlacementModifier
import net.minecraft.world.gen.feature.*

object JEGOres : IInitializer {
    // Blocks
    val QUARTZ_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1f), JEGItems.QUARTZ_FRAGMENT)
    val ANDALUSITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.05f), JEGItems.ANDALUSITE_FRAGMENT)
    val MORGANITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.1f), JEGItems.MORGANITE_FRAGMENT)
    val TAAFFEITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.15f), JEGItems.TAAFFEITE_FRAGMENT)
    val PINK_QUARTZ_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.2f), JEGItems.PINK_QUARTZ_FRAGMENT)
    val EUCLASE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.25f), JEGItems.EUCLASE_FRAGMENT)
    val CHRYSOLITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.3f), JEGItems.CHRYSOLITE_FRAGMENT)
    val SAPPHIRE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.35f), JEGItems.SAPPHIRE_FRAGMENT)
    val HELIODORE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.4f), JEGItems.HELIODORE_FRAGMENT)
    val RUBY_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.45f), JEGItems.RUBY_FRAGMENT)
    val AQUAMARINE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.5f), JEGItems.AQUAMARINE_FRAGMENT)
    val TANZANITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.55f), JEGItems.TANZANITE_FRAGMENT)
    val TSAVORITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.6f), JEGItems.TSAVORITE_FRAGMENT)
    val VERDELITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.65f), JEGItems.VERDELITE_FRAGMENT)
    val INDIGOLITE_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.7f), JEGItems.INDIGOLITE_FRAGMENT)
    val OPAL_ORE = OreBlock(FabricBlockSettings.of(Material.METAL).hardness(1.75f), JEGItems.OPAL_FRAGMENT)
    
    // Ore configs
    val QUARTZ_ORE_OVERWORLD = createOreConfig(QUARTZ_ORE, 9, 20, 50)
    val ANDALUSITE_ORE_OVERWORLD = createOreConfig(ANDALUSITE_ORE, 9, 19, 45)
    val MORGANITE_ORE_OVERWORLD = createOreConfig(MORGANITE_ORE, 8, 18, 40)
    val TAAFFEITE_ORE_OVERWORLD = createOreConfig(TAAFFEITE_ORE, 8, 17, 35)
    val PINK_QUARTZ_ORE_OVERWORLD = createOreConfig(PINK_QUARTZ_ORE, 7, 16, 30)
    val EUCLASE_ORE_OVERWORLD = createOreConfig(EUCLASE_ORE, 7, 15, 25)
    val CHRYSOLITE_ORE_OVERWORLD = createOreConfig(CHRYSOLITE_ORE, 6, 14, 20)
    val SAPPHIRE_ORE_OVERWORLD = createOreConfig(SAPPHIRE_ORE, 6, 13, 15)
    val HELIODORE_ORE_OVERWORLD = createOreConfig(HELIODORE_ORE, 5, 12, 10)
    val RUBY_ORE_OVERWORLD = createOreConfig(RUBY_ORE, 5, 11, 5)
    val AQUAMARINE_ORE_OVERWORLD = createOreConfig(AQUAMARINE_ORE, 4, 10, 0)
    val TANZANITE_ORE_OVERWORLD = createOreConfig(TANZANITE_ORE, 4, 9, -5)
    val TSAVORITE_ORE_OVERWORLD = createOreConfig(TSAVORITE_ORE, 3, 8, -10)
    val VERDELITE_ORE_OVERWORLD = createOreConfig(VERDELITE_ORE, 3, 7, -15)
    val INDIGOLITE_ORE_OVERWORLD = createOreConfig(INDIGOLITE_ORE, 2, 6, -20)
    val OPAL_ORE_OVERWORLD = createOreConfig(OPAL_ORE, 2, 5, -25)

    override fun initialize() {
        register("quartz_ore", QUARTZ_ORE)
        register("andalusite_ore", ANDALUSITE_ORE)
        register("morganite_ore", MORGANITE_ORE)
        register("taaffeite_ore", TAAFFEITE_ORE)
        register("pink_quartz_ore", PINK_QUARTZ_ORE)
        register("euclase_ore", EUCLASE_ORE)
        register("chrysolite_ore", CHRYSOLITE_ORE)
        register("sapphire_ore", SAPPHIRE_ORE)
        register("heliodore_ore", HELIODORE_ORE)
        register("ruby_ore", RUBY_ORE)
        register("aquamarine_ore", AQUAMARINE_ORE)
        register("tanzanite_ore", TANZANITE_ORE)
        register("tsavorite_ore", TSAVORITE_ORE)
        register("verdelite_ore", VERDELITE_ORE)
        register("indigolite_ore", INDIGOLITE_ORE)
        register("opal_ore", OPAL_ORE)

        register("quartz_ore_overworld", QUARTZ_ORE_OVERWORLD)
        register("andalusite_ore_overworld", ANDALUSITE_ORE_OVERWORLD)
        register("morganite_ore_overworld", MORGANITE_ORE_OVERWORLD)
        register("taaffeite_ore_overworld", TAAFFEITE_ORE_OVERWORLD)
        register("pink_quartz_ore_overworld", PINK_QUARTZ_ORE_OVERWORLD)
        register("euclase_ore_overworld", EUCLASE_ORE_OVERWORLD)
        register("chrysolite_ore_overworld", CHRYSOLITE_ORE_OVERWORLD)
        register("sapphire_ore_overworld", SAPPHIRE_ORE_OVERWORLD)
        register("heliodore_ore_overworld", HELIODORE_ORE_OVERWORLD)
        register("ruby_ore_overworld", RUBY_ORE_OVERWORLD)
        register("aquamarine_ore_overworld", AQUAMARINE_ORE_OVERWORLD)
        register("tanzanite_ore_overworld", TANZANITE_ORE_OVERWORLD)
        register("tsavorite_ore_overworld", TSAVORITE_ORE_OVERWORLD)
        register("verdelite_ore_overworld", VERDELITE_ORE_OVERWORLD)
        register("indigolite_ore_overworld", INDIGOLITE_ORE_OVERWORLD)
        register("opal_ore_overworld", OPAL_ORE_OVERWORLD)
    }
}

data class OreConfiguration(
    val configured: ConfiguredFeature<*, *>,
    val placed: PlacedFeature
)

fun createOreConfig(block: Block, veinSize: Int, veinsPerChunk: Int, maxHeight: Int): OreConfiguration {
    val configured = Feature.ORE.configure(
        OreFeatureConfig(
            OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
            block.defaultState,
            veinSize
        )
    )

    val placed = configured.withPlacement(
        CountPlacementModifier.of(veinsPerChunk),
        SquarePlacementModifier.of(),
        HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(maxHeight))
    )

    return OreConfiguration(configured, placed)
}

