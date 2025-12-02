package nl.eetgeenappels.ssssv.veinminer

import dev.architectury.event.EventResult
import dev.architectury.utils.value.IntValue
import net.minecraft.core.BlockPos
import net.minecraft.server.level.ServerPlayer
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.state.BlockState

object Veinminer {
    fun onBlockBreak(
        level: Level,
        blockPos: BlockPos,
        blockState: BlockState,
        player: ServerPlayer,
        intValue: IntValue
    ): EventResult {


        return EventResult.pass()
    }
}
