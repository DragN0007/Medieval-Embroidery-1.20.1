package com.dragn0007_evangelix.medievalembroidery.block.custom.crystal;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;

public class CrystalOreBlock extends Block {

    public CrystalOreBlock(int color) {
        super(Properties.copy(Blocks.AMETHYST_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().randomTicks().strength(3.0F).noOcclusion());
    }
}
