package com.redgrapefruit.justenoughgems

import com.google.gson.Gson
import com.google.gson.JsonObject
import com.redgrapefruit.justenoughgems.init.*
import com.redgrapefruit.justenoughgems.util.*
import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader

object JEG : ModInitializer {
    override fun onInitialize() {
        // Register content
        JEGItems.initialize()
        JEGFood.initialize()
        JEGTools.initialize()
        JEGWeapons.initialize()
        JEGArmor.initialize()
        JEGOres.initialize()

        // Log version data
        val version = FabricLoader.getInstance().getModContainer("jeg").get().metadata.version.friendlyString
        logger.info("Loaded JustEnoughGems $version.")
        // Check for updates
        checkForUpdates(version)
    }

    private fun checkForUpdates(version: String) {
        // If Internet is available, we can check for updates and notify the player if a new update is available
        if (internetConnected()) {
            // Download tags in a JSON using GitHub API
            var raw = download("https://api.github.com/repos/RedGrapefruit09/JustEnoughGems/tags")
            raw = "{\"tags\":${raw}}"
            // Parse the JSON and extract the latest tag name
            val obj = Gson().fromJson(raw, JsonObject::class.java)
            val tag = obj.get("tags").asJsonArray[0].asJsonObject["name"].asString
            // Parse semantic versions
            val expectedVersion = SemanticVersion.from(tag)
            val actualVersion = SemanticVersion.from(version)
            // Compare
            when (expectedVersion.compare(actualVersion)) {
                ComparisonResult.EQUAL -> {
                    logger.info("Running an up-to-date version of JustEnoughGems!")
                }
                ComparisonResult.BIGGER -> {
                    logger.warn("Running an outdated version of JustEnoughGems! Please, update to version ${expectedVersion.formatToString()}.")
                }
                ComparisonResult.LESS -> {
                    logger.warn("Running an unreleased version of JustEnoughGems! Latest released version is ${expectedVersion.formatToString()}, downgrade to it if needed.")
                }
            }
        } else {
            logger.warn("Internet is unavailable. Cannot check for updates!")
        }
    }
}
