package com.dragn0007_evangelix.medievalembroidery.block.pixel_placement;

import com.dragn0007.medievalembroidery.block.pixel_placement.util.PixelPlacer;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ClosedBook extends PixelPlacer {

    private final static VoxelShape NORTH = Shapes.or(
            Block.box(-2.5999999999999996, 0, -5, 3.4000000000000004, 2.8, 5)
    );

    private final static VoxelShape EAST = Shapes.or(
            Block.box(-4.6, 0, -3, 5.4, 2.8, 3)
    );

    private final static VoxelShape SOUTH = Shapes.or(
            Block.box(-2.5999999999999996, 0, -5, 3.4000000000000004, 2.8, 5)
    );

    private final static VoxelShape WEST = Shapes.or(
            Block.box(-4.6, 0, -3, 5.4, 2.8, 3)
    );

    public ClosedBook() {
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
