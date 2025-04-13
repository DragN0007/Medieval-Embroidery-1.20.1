package com.dragn0007_evangelix.medievalembroidery.block.custom.crystal_ball;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class AssistiveCrystalBall extends BaseEntityBlock implements EntityBlock {
    public AssistiveCrystalBall() {
        super(Properties.of().sound(SoundType.AMETHYST).lightLevel((p_152677_) -> 7).noOcclusion().pushReaction(PushReaction.DESTROY).noOcclusion().strength(0.3F));
    }

    protected static final VoxelShape AABB = Shapes.or(Block.box(3, 0, 3, 13, 3, 13), Block.box(4, 3, 4, 12, 6, 12));

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return AABB;
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        super.animateTick(state, level, pos, random);
        if (random.nextInt(10) == 0) {
            level.addParticle(ParticleTypes.ENCHANT, (double) pos.getX() + random.nextDouble(), (double) pos.getY() + 1.1D, (double) pos.getZ() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
        }
        if (random.nextInt(20) == 0) {
            level.playLocalSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1.0F + random.nextFloat(), random.nextFloat() * 0.7F + 0.3F, false);
        }
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return MEBlocks.ASSISTIVE_CRYSTAL_BALL_ENTITY.get().create(pPos, pState);
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }
}
