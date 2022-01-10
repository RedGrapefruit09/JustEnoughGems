package com.redgrapefruit.justenoughgems.init

import com.github.crimsondawn45.fabricshieldlib.lib.event.ShieldBlockCallback
import com.redgrapefruit.justenoughgems.item.*
import com.redgrapefruit.justenoughgems.util.IInitializer
import com.redgrapefruit.justenoughgems.util.register
import net.minecraft.entity.damage.DamageSource
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.ActionResult

object JEGItems : IInitializer {
    // Gems
    val QUARTZ_GEM = GemOrbItem(GemOrbConfig.QUARTZ, 1)
    val ANDALUSITE_GEM = GemOrbItem(GemOrbConfig.ANDALUSITE, 2)
    val MORGANITE_GEM = GemOrbItem(GemOrbConfig.MORGANITE, 3)
    val TAAFFEITE_GEM = GemOrbItem(GemOrbConfig.TAAFFEITE, 4)
    val PINK_QUARTZ_GEM = GemOrbItem(GemOrbConfig.PINK_QUARTZ, 5)
    val EUCLASE_GEM = GemOrbItem(GemOrbConfig.EUCLASE, 6)
    val CHRYSOLITE_GEM = GemOrbItem(GemOrbConfig.CHRYSOLITE, 7)
    val SAPPHIRE_GEM = GemOrbItem(GemOrbConfig.SAPPHIRE, 8)
    val HELIODORE_GEM = GemOrbItem(GemOrbConfig.HELIODORE, 9)
    val RUBY_GEM = GemOrbItem(GemOrbConfig.RUBY, 10)
    val AQUAMARINE_GEM = GemOrbItem(GemOrbConfig.AQUAMARINE, 11)
    val TANZANITE_GEM = GemOrbItem(GemOrbConfig.TANZANITE, 12)
    val TSAVORITE_GEM = GemOrbItem(GemOrbConfig.TSAVORITE, 13)
    val VERDELITE_GEM = GemOrbItem(GemOrbConfig.VERDELITE, 14)
    val INDIGOLITE_GEM = GemOrbItem(GemOrbConfig.INDIGOLITE, 15)
    val OPAL_GEM = GemOrbItem(GemOrbConfig.OPAL, 16)

    // Amulets
    val QUARTZ_AMULET = GemAmuletItem(GemAmuletConfig.QUARTZ, 1)
    val ANDALUSITE_AMULET = GemAmuletItem(GemAmuletConfig.ANDALUSITE, 2)
    val MORGANITE_AMULET = GemAmuletItem(GemAmuletConfig.MORGANITE, 3)
    val TAAFFEITE_AMULET = GemAmuletItem(GemAmuletConfig.TAAFFEITE, 4)
    val PINK_QUARTZ_AMULET = GemAmuletItem(GemAmuletConfig.PINK_QUARTZ, 5)
    val EUCLASE_AMULET = GemAmuletItem(GemAmuletConfig.EUCLASE, 6)
    val CHRYSOLITE_AMULET = GemAmuletItem(GemAmuletConfig.CHRYSOLITE, 7)
    val SAPPHIRE_AMULET = GemAmuletItem(GemAmuletConfig.SAPPHIRE, 8)
    val HELIODORE_AMULET = GemAmuletItem(GemAmuletConfig.HELIODORE, 9)
    val RUBY_AMULET = GemAmuletItem(GemAmuletConfig.RUBY, 10)
    val AQUAMARINE_AMULET = GemAmuletItem(GemAmuletConfig.AQUAMARINE, 11)
    val TANZANITE_AMULET = GemAmuletItem(GemAmuletConfig.TANZANITE, 12)
    val TSAVORITE_AMULET = GemAmuletItem(GemAmuletConfig.TSAVORITE, 13)
    val VERDELITE_AMULET = GemAmuletItem(GemAmuletConfig.VERDELITE, 14)
    val INDIGOLITE_AMULET = GemAmuletItem(GemAmuletConfig.INDIGOLITE, 15)
    val OPAL_AMULET = GemAmuletItem(GemAmuletConfig.OPAL, 16)

    // Fragments
    val QUARTZ_FRAGMENT = ModItem(1)
    val ANDALUSITE_FRAGMENT = ModItem(2)
    val MORGANITE_FRAGMENT = ModItem(3)
    val TAAFFEITE_FRAGMENT = ModItem(4)
    val PINK_QUARTZ_FRAGMENT = ModItem(5)
    val EUCLASE_FRAGMENT = ModItem(6)
    val CHRYSOLITE_FRAGMENT = ModItem(7)
    val SAPPHIRE_FRAGMENT = ModItem(8)
    val HELIODORE_FRAGMENT = ModItem(9)
    val RUBY_FRAGMENT = ModItem(10)
    val AQUAMARINE_FRAGMENT = ModItem(11)
    val TANZANITE_FRAGMENT = ModItem(12)
    val TSAVORITE_FRAGMENT = ModItem(13)
    val VERDELITE_FRAGMENT = ModItem(14)
    val INDIGOLITE_FRAGMENT = ModItem(15)
    val OPAL_FRAGMENT = ModItem(16)

    // Ingots
    val QUARTZ_INGOT = ModItem(1)
    val ANDALUSITE_INGOT = ModItem(2)
    val MORGANITE_INGOT = ModItem(3)
    val TAAFFEITE_INGOT = ModItem(4)
    val PINK_QUARTZ_INGOT = ModItem(5)
    val EUCLASE_INGOT = ModItem(6)
    val CHRYSOLITE_INGOT = ModItem(7)
    val SAPPHIRE_INGOT = ModItem(8)
    val HELIODORE_INGOT = ModItem(9)
    val RUBY_INGOT = ModItem(10)
    val AQUAMARINE_INGOT = ModItem(11)
    val TANZANITE_INGOT = ModItem(12)
    val TSAVORITE_INGOT = ModItem(13)
    val VERDELITE_INGOT = ModItem(14)
    val INDIGOLITE_INGOT = ModItem(15)
    val OPAL_INGOT = ModItem(16)

    // Nuggets
    val QUARTZ_NUGGET = ModItem(1)
    val ANDALUSITE_NUGGET = ModItem(2)
    val MORGANITE_NUGGET = ModItem(3)
    val TAAFFEITE_NUGGET = ModItem(4)
    val PINK_QUARTZ_NUGGET = ModItem(5)
    val EUCLASE_NUGGET = ModItem(6)
    val CHRYSOLITE_NUGGET = ModItem(7)
    val SAPPHIRE_NUGGET = ModItem(8)
    val HELIODORE_NUGGET = ModItem(9)
    val RUBY_NUGGET = ModItem(10)
    val AQUAMARINE_NUGGET = ModItem(11)
    val TANZANITE_NUGGET = ModItem(12)
    val TSAVORITE_NUGGET = ModItem(13)
    val VERDELITE_NUGGET = ModItem(14)
    val INDIGOLITE_NUGGET = ModItem(15)
    val OPAL_NUGGET = ModItem(16)

    // Shields
    val QUARTZ_SHIELD = GemShieldItem(1, 50, 2500, 95, 16, JEGItems.QUARTZ_INGOT)
    val ANDALUSITE_SHIELD = GemShieldItem(2, 60, 2750, 90, 17, JEGItems.ANDALUSITE_INGOT)
    val MORGANITE_SHIELD = GemShieldItem(3, 70, 3000, 85, 18, JEGItems.MORGANITE_INGOT)
    val TAAFFEITE_SHIELD = GemShieldItem(4, 80, 3250, 80, 19, JEGItems.TAAFFEITE_INGOT)
    val PINK_QUARTZ_SHIELD = GemShieldItem(5, 90, 3500, 75, 20, JEGItems.PINK_QUARTZ_INGOT)
    val EUCLASE_SHIELD = GemShieldItem(6, 100, 3750, 70, 21, JEGItems.EUCLASE_INGOT)
    val CHRYSOLITE_SHIELD = GemShieldItem(7, 110, 4000, 65, 22, JEGItems.CHRYSOLITE_INGOT)
    val SAPPHIRE_SHIELD = GemShieldItem(8, 120, 4250, 60, 23, JEGItems.SAPPHIRE_INGOT)
    val HELIODORE_SHIELD = GemShieldItem(9, 130, 4500, 55, 24, JEGItems.HELIODORE_INGOT)
    val RUBY_SHIELD = GemShieldItem(10, 140, 4750, 50, 25, JEGItems.RUBY_INGOT)
    val AQUAMARINE_SHIELD = GemShieldItem(11, 150, 5000, 45, 26, JEGItems.AQUAMARINE_INGOT)
    val TANZANITE_SHIELD = GemShieldItem(12, 160, 5250, 40, 27, JEGItems.TANZANITE_INGOT)
    val TSAVORITE_SHIELD = GemShieldItem(13, 170, 5500, 35, 28, JEGItems.TSAVORITE_INGOT)
    val VERDELITE_SHIELD = GemShieldItem(14, 180, 5750, 30, 29, JEGItems.VERDELITE_INGOT)
    val INDIGOLITE_SHIELD = GemShieldItem(15, 190, 6000, 25, 30, JEGItems.INDIGOLITE_INGOT)
    val OPAL_SHIELD = GemShieldItem(16, 200, 6250, 20, 31, JEGItems.OPAL_INGOT)

    override fun initialize() {
        register("quartz_gem", QUARTZ_GEM)
        register("andalusite_gem", ANDALUSITE_GEM)
        register("morganite_gem", MORGANITE_GEM)
        register("taaffeite_gem", TAAFFEITE_GEM)
        register("pink_quartz_gem", PINK_QUARTZ_GEM)
        register("euclase_gem", EUCLASE_GEM)
        register("chrysolite_gem", CHRYSOLITE_GEM)
        register("sapphire_gem", SAPPHIRE_GEM)
        register("heliodore_gem", HELIODORE_GEM)
        register("ruby_gem", RUBY_GEM)
        register("aquamarine_gem", AQUAMARINE_GEM)
        register("tanzanite_gem", TANZANITE_GEM)
        register("tsavorite_gem", TSAVORITE_GEM)
        register("verdelite_gem", VERDELITE_GEM)
        register("indigolite_gem", INDIGOLITE_GEM)
        register("opal_gem", OPAL_GEM)

        register("quartz_amulet", QUARTZ_AMULET)
        register("andalusite_amulet", ANDALUSITE_AMULET)
        register("morganite_amulet", MORGANITE_AMULET)
        register("taaffeite_amulet", TAAFFEITE_AMULET)
        register("pink_quartz_amulet", PINK_QUARTZ_AMULET)
        register("euclase_amulet", EUCLASE_AMULET)
        register("chrysolite_amulet", CHRYSOLITE_AMULET)
        register("sapphire_amulet", SAPPHIRE_AMULET)
        register("heliodore_amulet", HELIODORE_AMULET)
        register("ruby_amulet", RUBY_AMULET)
        register("aquamarine_amulet", AQUAMARINE_AMULET)
        register("tanzanite_amulet", TANZANITE_AMULET)
        register("tsavorite_amulet", TSAVORITE_AMULET)
        register("verdelite_amulet", VERDELITE_AMULET)
        register("indigolite_amulet", INDIGOLITE_AMULET)
        register("opal_amulet", OPAL_AMULET)

        register("quartz_fragment", QUARTZ_FRAGMENT)
        register("andalusite_fragment", ANDALUSITE_FRAGMENT)
        register("morganite_fragment", MORGANITE_FRAGMENT)
        register("taaffeite_fragment", TAAFFEITE_FRAGMENT)
        register("pink_quartz_fragment", PINK_QUARTZ_FRAGMENT)
        register("euclase_fragment", EUCLASE_FRAGMENT)
        register("chrysolite_fragment", CHRYSOLITE_FRAGMENT)
        register("sapphire_fragment", SAPPHIRE_FRAGMENT)
        register("heliodore_fragment", HELIODORE_FRAGMENT)
        register("ruby_fragment", RUBY_FRAGMENT)
        register("aquamarine_fragment", AQUAMARINE_FRAGMENT)
        register("tanzanite_fragment", TANZANITE_FRAGMENT)
        register("tsavorite_fragment", TSAVORITE_FRAGMENT)
        register("verdelite_fragment", VERDELITE_FRAGMENT)
        register("indigolite_fragment", INDIGOLITE_FRAGMENT)
        register("opal_fragment", OPAL_FRAGMENT)

        register("quartz_ingot", QUARTZ_INGOT)
        register("andalusite_ingot", ANDALUSITE_INGOT)
        register("morganite_ingot", MORGANITE_INGOT)
        register("taaffeite_ingot", TAAFFEITE_INGOT)
        register("pink_quartz_ingot", PINK_QUARTZ_INGOT)
        register("euclase_ingot", EUCLASE_INGOT)
        register("chrysolite_ingot", CHRYSOLITE_INGOT)
        register("sapphire_ingot", SAPPHIRE_INGOT)
        register("heliodore_ingot", HELIODORE_INGOT)
        register("ruby_ingot", RUBY_INGOT)
        register("aquamarine_ingot", AQUAMARINE_INGOT)
        register("tanzanite_ingot", TANZANITE_INGOT)
        register("tsavorite_ingot", TSAVORITE_INGOT)
        register("verdelite_ingot", VERDELITE_INGOT)
        register("indigolite_ingot", INDIGOLITE_INGOT)
        register("opal_ingot", OPAL_INGOT)

        register("quartz_nugget", QUARTZ_NUGGET)
        register("andalusite_nugget", ANDALUSITE_NUGGET)
        register("morganite_nugget", MORGANITE_NUGGET)
        register("taaffeite_nugget", TAAFFEITE_NUGGET)
        register("pink_quartz_nugget", PINK_QUARTZ_NUGGET)
        register("euclase_nugget", EUCLASE_NUGGET)
        register("chrysolite_nugget", CHRYSOLITE_NUGGET)
        register("sapphire_nugget", SAPPHIRE_NUGGET)
        register("heliodore_nugget", HELIODORE_NUGGET)
        register("ruby_nugget", RUBY_NUGGET)
        register("aquamarine_nugget", AQUAMARINE_NUGGET)
        register("tanzanite_nugget", TANZANITE_NUGGET)
        register("tsavorite_nugget", TSAVORITE_NUGGET)
        register("verdelite_nugget", VERDELITE_NUGGET)
        register("indigolite_nugget", INDIGOLITE_NUGGET)
        register("opal_nugget", OPAL_NUGGET)

        register("quartz_shield", QUARTZ_SHIELD)
        register("andalusite_shield", ANDALUSITE_SHIELD)
        register("morganite_shield", MORGANITE_SHIELD)
        register("taaffeite_shield", TAAFFEITE_SHIELD)
        register("pink_quartz_shield", PINK_QUARTZ_SHIELD)
        register("euclase_shield", EUCLASE_SHIELD)
        register("chrysolite_shield", CHRYSOLITE_SHIELD)
        register("sapphire_shield", SAPPHIRE_SHIELD)
        register("heliodore_shield", HELIODORE_SHIELD)
        register("ruby_shield", RUBY_SHIELD)
        register("aquamarine_shield", AQUAMARINE_SHIELD)
        register("tanzanite_shield", TANZANITE_SHIELD)
        register("tsavorite_shield", TSAVORITE_SHIELD)
        register("verdelite_shield", VERDELITE_SHIELD)
        register("indigolite_shield", INDIGOLITE_SHIELD)
        register("opal_shield", OPAL_SHIELD)

        registerShieldCallback()
    }

    private fun registerShieldCallback() {
        ShieldBlockCallback.EVENT.register { defender, source, amount, _, shield ->
            val attacker = source.attacker
            val item = shield.item

            if (attacker != null && defender is PlayerEntity && item is GemShieldItem) {
                attacker.damage(DamageSource.player(defender), amount / 100f * item.reflectPercent)
            }

            ActionResult.PASS
        }
    }
}
