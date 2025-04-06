package com.dragn0007_evangelix.medievalembroidery.block.custom.crystal;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3f;
import org.joml.Vector3fc;

import java.util.Random;

public class CrystalOreBlock extends Block {

    public CrystalOreBlock(int color) {
        super(Properties.copy(Blocks.AMETHYST_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().randomTicks().strength(3.0F));
    }
}
