package com.dragn0007_evangelix.medievalembroidery.block.pixel_placement;

import com.dragn0007.medievalembroidery.block.pixel_placement.util.PixelPlacer;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Utensil extends PixelPlacer {

    private static final VoxelShape NORTH = Shapes.or(
            Block.box(1.4, 0, -1, 2.2, 0.7, 0),
            Block.box(1.4, -0.025, 0, 2.8, 0.725, 4),
            Block.box(1.3, 0, -4, 2.3, 0.9, -1),
            Block.box(-0.4, 0, -1, 0.4, 0.7, 1),
            Block.box(-0.5, 0, -4, 0.5, 0.9, -1),
            Block.box(-1, 0, 1, 1, 0.7, 1.7),
            Block.box(0.4, 0, 1.7, 1, 0.7, 3.7),
            Block.box(-1, 0, 1.7, -0.4, 0.7, 3.7),
            Block.box(-2.8, 0, -1, -2, 0.7, 1),
            Block.box(-2.9, 0, -4, -1.9, 0.9, -1),
            Block.box(-3.4, 0, 1, -1.4, 0.7, 1.5),
            Block.box(-3.4, 0, 3.2, -1.4, 0.7, 3.7),
            Block.box(-1.9, 0, 1.5, -1.4, 0.7, 3.2),
            Block.box(-3.4, 0, 1.5, -2.9, 0.7, 3.2),
            Block.box(-2.9, 0, 1.5, -1.9, 0.4, 3.2)
    );

    private static final VoxelShape EAST = Shapes.or(
            Block.box(-1, 0, -2.2, 0, 0.7, -1.4),
            Block.box(0, -0.025, -2.8, 4, 0.725, -1.4),
            Block.box(-4, 0, -2.3, -1, 0.9, -1.3),
            Block.box(-1, 0, -0.4, 1, 0.7, 0.4),
            Block.box(-4, 0, -0.5, -1, 0.9, 0.5),
            Block.box(1, 0, -1, 1.7, 0.7, 1),
            Block.box(1.7, 0, -1, 3.7, 0.7, -0.4),
            Block.box(1.7, 0, 0.4, 3.7, 0.7, 1),
            Block.box(-1, 0, 2, 1, 0.7, 2.8),
            Block.box(-4, 0, 1.9, -1, 0.9, 2.9),
            Block.box(1, 0, 1.4, 1.5, 0.7, 3.4),
            Block.box(3.2, 0, 1.4, 3.7, 0.7, 3.4),
            Block.box(1.5, 0, 1.4, 3.2, 0.7, 1.9),
            Block.box(1.5, 0, 2.9, 3.2, 0.7, 3.4),
            Block.box(1.5, 0, 1.9, 3.2, 0.4, 2.9)
    );

    private static final VoxelShape SOUTH = Shapes.or(
            Block.box(-2.2, 0, 0, -1.4, 0.7, 1),
            Block.box(-2.8, -0.025, -4, -1.4, 0.725, 0),
            Block.box(-2.3, 0, 1, -1.3, 0.9, 4),
            Block.box(-0.4, 0, -1, 0.4, 0.7, 1),
            Block.box(-0.5, 0, 1, 0.5, 0.9, 4),
            Block.box(-1, 0, -1.7, 1, 0.7, -1),
            Block.box(-1, 0, -3.7, -0.4, 0.7, -1.7),
            Block.box(0.4, 0, -3.7, 1, 0.7, -1.7),
            Block.box(2, 0, -1, 2.8, 0.7, 1),
            Block.box(1.9, 0, 1, 2.9, 0.9, 4),
            Block.box(1.4, 0, -1.5, 3.4, 0.7, -1),
            Block.box(1.4, 0, -3.7, 3.4, 0.7, -3.2),
            Block.box(1.4, 0, -3.2, 1.9, 0.7, -1.5),
            Block.box(2.9, 0, -3.2, 3.4, 0.7, -1.5),
            Block.box(1.9, 0, -3.2, 2.9, 0.4, -1.5)
    );

    private static final VoxelShape WEST = Shapes.or(
            Block.box(0, 0, 1.4, 1, 0.7, 2.2),
            Block.box(-4, -0.025, 1.4, 0, 0.725, 2.8),
            Block.box(1, 0, 1.3, 4, 0.9, 2.3),
            Block.box(-1, 0, -0.4, 1, 0.7, 0.4),
            Block.box(1, 0, -0.5, 4, 0.9, 0.5),
            Block.box(-1.7, 0, -1, -1, 0.7, 1),
            Block.box(-3.7, 0, 0.4, -1.7, 0.7, 1),
            Block.box(-3.7, 0, -1, -1.7, 0.7, -0.4),
            Block.box(-1, 0, -2.8, 1, 0.7, -2),
            Block.box(1, 0, -2.9, 4, 0.9, -1.9),
            Block.box(-1.5, 0, -3.4, -1, 0.7, -1.4),
            Block.box(-3.7, 0, -3.4, -3.2, 0.7, -1.4),
            Block.box(-3.2, 0, -1.9, -1.5, 0.7, -1.4),
            Block.box(-3.2, 0, -3.4, -1.5, 0.7, -2.9),
            Block.box(-3.2, 0, -2.9, -1.5, 0.4, -1.9)
    );

    public Utensil(Properties properties) {
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
