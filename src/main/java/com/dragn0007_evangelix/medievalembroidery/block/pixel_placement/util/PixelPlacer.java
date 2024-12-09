package com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

public abstract class PixelPlacer extends Block {

    public PixelPlacer(Properties properties) {
        super(properties);
    }

    public abstract VoxelShape getVoxelShape(Direction direction);
}
