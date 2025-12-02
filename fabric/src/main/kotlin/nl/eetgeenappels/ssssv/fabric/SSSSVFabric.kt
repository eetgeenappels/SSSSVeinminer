package nl.eetgeenappels.ssssv.fabric

import net.fabricmc.api.ModInitializer
import nl.eetgeenappels.ssssv.SSSSVCommon

class SSSSVFabric : ModInitializer {
    override fun onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.

        SSSSVCommon.init()

        SSSSVCommon.LOGGER.info("SSSSVCommon init (dis is fabric)!")
    }
}
