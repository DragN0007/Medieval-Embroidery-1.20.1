package com.dragn0007_evangelix.medievalembroidery.block.pixel_placement;

import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacer;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LargePotionJar extends PixelPlacer {

    private final static VoxelShape NORTH = Shapes.or(
            Block.box(-3, 0, -3, 3, 7, 3),
            Block.box(-3, 8, -3, 3, 9, 3),
            Block.box(-2, 1, -2, 2, 10, 2)
    );

    private final static VoxelShape EAST = Shapes.or(
            Block.box(-3, 0, -3, 3, 7, 3),
            Block.box(-3, 8, -3, 3, 9, 3),
            Block.box(-2, 1, -2, 2, 10, 2)
    );

    private final static VoxelShape SOUTH = Shapes.or(
            Block.box(-3, 0, -3, 3, 7, 3),
            Block.box(-3, 8, -3, 3, 9, 3),
            Block.box(-2, 1, -2, 2, 10, 2)
    );

    private final static VoxelShape WEST = Shapes.or(
            Block.box(-3, 0, -3, 3, 7, 3),
            Block.box(-3, 8, -3, 3, 9, 3),
            Block.box(-2, 1, -2, 2, 10, 2)
    );

    public LargePotionJar() {
        super(Properties.copy(Blocks.GLASS).instabreak());
    }

    @Override
    public VoxelShape getVoxelShape(Direction direction) {
        return switch(direction ){
            case EAST -> EAST;
            case SOUTH -> SOUTH;
            case WEST -> WEST;
            default -> NORTH;
        };
    }
}
