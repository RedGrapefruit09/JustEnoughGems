package com.redgrapefruit.justenoughgems

import com.google.gson.Gson
import com.google.gson.JsonObject
import com.redgrapefruit.justenoughgems.init.*
import com.redgrapefruit.justenoughgems.util.LOGGER
import com.redgrapefruit.justenoughgems.util.download
import com.redgrapefruit.justenoughgems.util.internetConnected
import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader

object JEG : ModInitializer {
    override fun onInitialize() {
        // Register content
        JEGItems.initialize()
        JEGTools.initialize()
        JEGWeapons.initialize()
        JEGShields.initialize()
        JEGBlocks.initialize()
        JEGWorldgen.initialize()

        // Determine version
        var version = FabricLoader.getInstance().getModContainer("jeg").get().metadata.version.friendlyString
        // Log version
        LOGGER.info("Loaded JustEnoughGems $version.")

        // If Internet is available, we can check for updates and notify the player if a new update is available
        if (internetConnected()) {
            // Download tags in a JSON using GitHub API
            var raw = download("https://api.github.com/repos/RedGrapefruit09/JustEnoughGems/tags")
            raw = "{\"tags\":${raw}}"
            // Parse the JSON and extract the latest tag name
            val obj = Gson().fromJson(raw, JsonObject::class.java)
            var tag = obj.get("tags").asJsonArray[0].asJsonObject["name"].asString
            // Clean up versions
            tag = tag.replace("v", "")
            tag = tag.removeSuffix(".0")
            version = version.replace("-SNAPSHOT", "")
            // Convert them to integers
            val intExpected = tag.toDouble()
            val intActual = version.toDouble()
            // Compare and log
            if (intExpected == intActual) {
                LOGGER.info("Running an up-to-date version of JustEnoughGems!")
            }
            if (intExpected > intActual) {
                LOGGER.warn("Running an outdated version of JustEnoughGems! Please, update to version $intExpected.")
            }
            if (intExpected < intActual) {
                LOGGER.warn("Running an unreleased version of JustEnoughGems! Latest released version is $intExpected, downgrade to it if needed.")
            }
        } else {
            LOGGER.warn("Internet is unavailable. Cannot check for updates!")
        }
    }
}
