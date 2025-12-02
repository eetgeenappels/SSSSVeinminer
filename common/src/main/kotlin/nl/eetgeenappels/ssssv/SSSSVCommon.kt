package nl.eetgeenappels.ssssv

import dev.architectury.event.events.common.BlockEvent
import dev.architectury.utils.value.IntValue
import net.fabricmc.api.ModInitializer
import net.minecraft.core.BlockPos
import net.minecraft.server.level.ServerPlayer
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.state.BlockState
import nl.eetgeenappels.ssssv.config.SSSSVServerConfig
import nl.eetgeenappels.ssssv.veinminer.Veinminer
import org.slf4j.LoggerFactory

object SSSSVCommon {
    const val MOD_ID: String = "ssssv"

    val LOGGER = LoggerFactory.getLogger(MOD_ID)

    fun init() {
        // Write common init code here.
        SSSSVServerConfig()

    }
}
