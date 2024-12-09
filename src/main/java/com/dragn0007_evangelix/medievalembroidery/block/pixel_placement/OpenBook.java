package com.dragn0007_evangelix.medievalembroidery.block.pixel_placement;

import com.dragn0007.medievalembroidery.block.pixel_placement.util.PixelPlacer;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class OpenBook extends PixelPlacer {

    private final static VoxelShape NORTH = Shapes.or(
            Block.box(-6, 0, -5, 0, 1, 5),
            Block.box(-5.7, 1, -4.7, -0.2999999999999998, 1.4, 4.699999999999999),
            Block.box(0.2999999999999998, 1, -4.7, 5.699999999999999, 1.4, 4.699999999999999),
            Block.box(0, 0, -5, 6, 1, 5),
            Block.box(-1, -0.05, -5.3, 1, 1, 5.300000000000001)
    );

    private final static VoxelShape EAST = Shapes.or(
            Block.box(-5, 0, -6, 5, 1, 0),
            Block.box(-4.699999999999999, 1, -5.7, 4.7, 1.4, -0.2999999999999998),
            Block.box(-4.699999999999999, 1, 0.2999999999999998, 4.7, 1.4, 5.699999999999999),
            Block.box(-5, 0, 0, 5, 1, 6),
            Block.box(-5.300000000000001, -0.05, -1, 5.3, 1, 1)
    );

    private final static VoxelShape SOUTH = Shapes.or(
            Block.box(-6, 0, -5, 0, 1, 5),
            Block.box(-5.7, 1, -4.7, -0.2999999999999998, 1.4, 4.699999999999999),
            Block.box(0.2999999999999998, 1, -4.7, 5.699999999999999, 1.4, 4.699999999999999),
            Block.box(0, 0, -5, 6, 1, 5),
            Block.box(-1, -0.05, -5.3, 1, 1, 5.300000000000001)
    );

    private final static VoxelShape WEST = Shapes.or(
            Block.box(-5, 0, -6, 5, 1, 0),
            Block.box(-4.699999999999999, 1, -5.7, 4.7, 1.4, -0.2999999999999998),
            Block.box(-4.699999999999999, 1, 0.2999999999999998, 4.7, 1.4, 5.699999999999999),
            Block.box(-5, 0, 0, 5, 1, 6),
            Block.box(-5.300000000000001, -0.05, -1, 5.3, 1, 1)
    );

    public OpenBook() {
        super(Properties.of(Material.WOOD));
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
