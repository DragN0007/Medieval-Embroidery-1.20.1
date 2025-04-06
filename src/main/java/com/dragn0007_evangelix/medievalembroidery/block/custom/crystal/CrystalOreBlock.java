package com.dragn0007_evangelix.medievalembroidery.block.custom.crystal;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3f;
import org.joml.Vector3fc;

import java.util.Random;

public class CrystalOreBlock extends RedStoneOreBlock {
    private final DustParticleOptions particle;

    public CrystalOreBlock(int color) {
        super(Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().randomTicks()
                .lightLevel((blockState) -> blockState.getValue(LIT) ? 9 : 0).strength(3.0F));

        particle = new DustParticleOptions(new Vector3f((Vector3fc) Vec3.fromRGB24(color)), 1.0F);
    }

    @Override
    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource random) {

        if(!blockState.getValue(LIT)) {
            return;
        }

        for(Direction direction : Direction.values()) {
            BlockPos blockpos = blockPos.relative(direction);
            if (!level.getBlockState(blockpos).isSolidRender(level, blockpos)) {
                Direction.Axis direction$axis = direction.getAxis();
                double d1 = direction$axis == Direction.Axis.X ? 0.5D + 0.5625D * (double)direction.getStepX() : (double)random.nextFloat();
                double d2 = direction$axis == Direction.Axis.Y ? 0.5D + 0.5625D * (double)direction.getStepY() : (double)random.nextFloat();
                double d3 = direction$axis == Direction.Axis.Z ? 0.5D + 0.5625D * (double)direction.getStepZ() : (double)random.nextFloat();
                level.addParticle(particle, (double)blockPos.getX() + d1, (double)blockPos.getY() + d2, (double)blockPos.getZ() + d3, 0.0D, 0.0D, 0.0D);
            }
        }

        super.animateTick(blockState, level, blockPos, random);
    }
}
