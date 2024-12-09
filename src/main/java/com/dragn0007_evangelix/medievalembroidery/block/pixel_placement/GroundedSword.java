package com.dragn0007_evangelix.medievalembroidery.block.pixel_placement;

import com.dragn0007.medievalembroidery.block.pixel_placement.util.PixelPlacer;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GroundedSword extends PixelPlacer {

    private static final VoxelShape NORTH = Shapes.or(
            Block.box(-1.5000000000000004, 0, 0, 1.4999999999999996, 14, 1.4), Block.box(-5.499999999999998, 12, -0.30000000000000004, 5.500000000000002, 14, 1.7));

    private static final VoxelShape EAST = Shapes.or(
            Block.box(-0.6999999999999988, 0, -0.8000000000000012, 0.7000000000000011, 14, 2.199999999999999), Block.box(-0.9999999999999989, 12, -4.799999999999999, 1.000000000000001, 14, 6.200000000000001));

    private static final VoxelShape SOUTH = Shapes.or(
            Block.box(-1.5000000000000004, 0, 0, 1.4999999999999996, 14, 1.4), Block.box(-5.499999999999998, 12, -0.30000000000000004, 5.500000000000002, 14, 1.7));

    private static final VoxelShape WEST = Shapes.or(
            Block.box(-0.6999999999999988, 0, -0.8000000000000012, 0.7000000000000011, 14, 2.199999999999999), Block.box(-0.9999999999999989, 12, -4.799999999999999, 1.000000000000001, 14, 6.200000000000001)
    );

    public GroundedSword(Properties properties) {
        super(properties);
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
