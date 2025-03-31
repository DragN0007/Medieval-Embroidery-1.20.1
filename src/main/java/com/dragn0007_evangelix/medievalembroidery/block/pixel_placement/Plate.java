package com.dragn0007_evangelix.medievalembroidery.block.pixel_placement;

import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacer;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Plate extends PixelPlacer {
    private static final VoxelShape SHAPE = Shapes.or(
        Block.box(-4, 0, -4, 4, 0.5, 4),
        Block.box(-4, 0.5, -4, 4, 1, -3),
        Block.box(-4, 0.5, 3, 4, 1, 4),
        Block.box(-4, 0.5, -3, -3, 1, 3),
        Block.box(3, 0.5, -3, 4, 1, 3)
    );

    public Plate() {
        super(Properties.copy(Blocks.OAK_PLANKS).instabreak());
    }

    @Override
    public VoxelShape getVoxelShape(Direction direction) {
        return SHAPE;
    }
}
