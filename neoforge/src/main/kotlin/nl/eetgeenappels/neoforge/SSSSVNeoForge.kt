package nl.eetgeenappels.neoforge

import net.neoforged.fml.common.Mod
import nl.eetgeenappels.ssssv.SSSSVCommon
import nl.eetgeenappels.ssssv.SSSSVCommon.init

@Mod(SSSSVCommon.MOD_ID)
class SSSSVNeoForge {
    init {
        // Run our common setup.
        init()
        SSSSVCommon.LOGGER.info("Initializing SSSSV NeoForge")
    }
}
