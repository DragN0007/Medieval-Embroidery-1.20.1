package com.dragn0007_evangelix.medievalembroidery.block.pixel_placement;

import com.dragn0007.medievalembroidery.block.pixel_placement.util.PixelPlacer;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Cup extends PixelPlacer {

    private static final VoxelShape SHAPE = Shapes.or(
        Block.box(-1.7, 0, -1.7, 1.7, 3.8, 1.7)
    );

    public Cup(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getVoxelShape(Direction direction) {
        return SHAPE;
    }
}
