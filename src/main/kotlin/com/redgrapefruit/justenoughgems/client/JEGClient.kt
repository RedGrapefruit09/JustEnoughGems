package com.redgrapefruit.justenoughgems.client

import com.redgrapefruit.justenoughgems.util.registerOrbModelPredicateProviders
import net.fabricmc.api.ClientModInitializer

object JEGClient : ClientModInitializer {
    override fun onInitializeClient() {
        registerOrbModelPredicateProviders()
    }
}
