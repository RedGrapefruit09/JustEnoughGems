package com.redgrapefruit.justenoughgems.init

import com.redgrapefruit.justenoughgems.util.IRegistry
import com.redgrapefruit.justenoughgems.util.toId
import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.minecraft.block.Block
import net.minecraft.util.registry.BuiltinRegistries
import net.minecraft.util.registry.Registry
import net.minecraft.util.registry.RegistryKey
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.YOffset
import net.minecraft.world.gen.decorator.CountPlacementModifier
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier
import net.minecraft.world.gen.decorator.SquarePlacementModifier
import net.minecraft.world.gen.feature.*

object JEGWorldgen : IRegistry {
    val QUARTZ_ORE = createOreConfig(JEGBlocks.QUARTZ_ORE, 9, 20, 50)
    val ANDALUSITE_ORE = createOreConfig(JEGBlocks.ANDALUSITE_ORE, 9, 19, 45)
    val MORGANITE_ORE = createOreConfig(JEGBlocks.MORGANITE_ORE, 8, 18, 40)
    val TAAFFEITE_ORE = createOreConfig(JEGBlocks.TAAFFEITE_ORE, 8, 17, 35)
    val PINK_QUARTZ_ORE = createOreConfig(JEGBlocks.PINK_QUARTZ_ORE, 7, 16, 30)
    val EUCLASE_ORE = createOreConfig(JEGBlocks.EUCLASE_ORE, 7, 15, 25)
    val CHRYSOLITE_ORE = createOreConfig(JEGBlocks.CHRYSOLITE_ORE, 6, 14, 20)
    val SAPPHIRE_ORE = createOreConfig(JEGBlocks.SAPPHIRE_ORE, 6, 13, 15)
    val HELIODORE_ORE = createOreConfig(JEGBlocks.HELIODORE_ORE, 5, 12, 10)
    val RUBY_ORE = createOreConfig(JEGBlocks.RUBY_ORE, 5, 11, 5)
    val AQUAMARINE_ORE = createOreConfig(JEGBlocks.AQUAMARINE_ORE, 4, 10, 0)
    val TANZANITE_ORE = createOreConfig(JEGBlocks.TANZANITE_ORE, 4, 9, -5)
    val TSAVORITE_ORE = createOreConfig(JEGBlocks.TSAVORITE_ORE, 3, 8, -10)
    val VERDELITE_ORE = createOreConfig(JEGBlocks.VERDELITE_ORE, 3, 7, -15)
    val INDIGOLITE_ORE = createOreConfig(JEGBlocks.INDIGOLITE_ORE, 2, 6, -20)
    val OPAL_ORE = createOreConfig(JEGBlocks.OPAL_ORE, 2, 5, -25)

    override fun register() {
        register("quartz_ore_overworld", QUARTZ_ORE)
        register("andalusite_ore_overworld", ANDALUSITE_ORE)
        register("morganite_ore_overworld", MORGANITE_ORE)
        register("taaffeite_ore_overworld", TAAFFEITE_ORE)
        register("pink_quartz_ore_overworld", PINK_QUARTZ_ORE)
        register("euclase_ore_overworld", EUCLASE_ORE)
        register("chrysolite_ore_overworld", CHRYSOLITE_ORE)
        register("sapphire_ore_overworld", SAPPHIRE_ORE)
        register("heliodore_ore_overworld", HELIODORE_ORE)
        register("ruby_ore_overworld", RUBY_ORE)
        register("aquamarine_ore_overworld", AQUAMARINE_ORE)
        register("tanzanite_ore_overworld", TANZANITE_ORE)
        register("tsavorite_ore_overworld", TSAVORITE_ORE)
        register("verdelite_ore_overworld", VERDELITE_ORE)
        register("indigolite_ore_overworld", INDIGOLITE_ORE)
        register("opal_ore_overworld", OPAL_ORE)
    }

    private fun register(name: String, config: OreConfiguration) {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, name.toId(), config.configured)

        Registry.register(BuiltinRegistries.PLACED_FEATURE, name.toId(), config.placed)

        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES,
            RegistryKey.of(Registry.PLACED_FEATURE_KEY, name.toId()))
    }
}

data class OreConfiguration(
    val configured: ConfiguredFeature<*, *>,
    val placed: PlacedFeature)

private fun createOreConfig(block: Block, veinSize: Int, veinsPerChunk: Int, maxHeight: Int): OreConfiguration {
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
