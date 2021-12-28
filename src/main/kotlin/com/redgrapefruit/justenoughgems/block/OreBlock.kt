package com.redgrapefruit.justenoughgems.block

import com.redgrapefruit.justenoughgems.util.Range
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.ShapeContext
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.ItemEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.state.StateManager
import net.minecraft.state.property.IntProperty
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.world.BlockView
import net.minecraft.world.World

class OreBlock(settings: FabricBlockSettings, private val fragment: Item, private val amount: Range = Range(0, 2)) : Block(settings) {
    companion object {
        val stageProperty: IntProperty = IntProperty.of("stage", 0, 5)
    }

    init {
        defaultState = stateManager.defaultState.with(stageProperty, 0)
    }

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        super.appendProperties(builder)
        builder.add(stageProperty)
    }

    override fun afterBreak(
        world: World,
        player: PlayerEntity,
        pos: BlockPos,
        state: BlockState,
        blockEntity: BlockEntity?,
        stack: ItemStack
    ) {
        super.afterBreak(world, player, pos, state, blockEntity, stack)

        val drop = ItemStack(fragment, amount.pick())
        world.spawnEntity(ItemEntity(world, pos.x.toDouble(), pos.y.toDouble(), pos.z.toDouble(), drop))

        val newStage = state[stageProperty] + 1
        if (newStage > 5) return
        world.setBlockState(pos, state.with(stageProperty, newStage))
    }

    override fun getOutlineShape(
        state: BlockState,
        world: BlockView,
        pos: BlockPos,
        context: ShapeContext
    ): VoxelShape {
        val height = when (state[stageProperty]) {
            0 -> 16
            1 -> 13
            2 -> 10
            3 -> 7
            4 -> 4
            5 -> 2
            else -> throw ArithmeticException("Out-of-bounds stage value: ${state[stageProperty]}")
        }

        return createCuboidShape(0.0, 0.0, 0.0, 16.0, height.toDouble(), 16.0)
    }
}
