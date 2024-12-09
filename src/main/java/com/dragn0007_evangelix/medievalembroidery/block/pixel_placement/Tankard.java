package com.dragn0007_evangelix.medievalembroidery.block.pixel_placement;

import com.dragn0007.medievalembroidery.block.pixel_placement.util.PixelPlacer;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Tankard extends PixelPlacer {

    private final static VoxelShape NORTH = Shapes.or(
            Block.box(-3, 0, -3, 3, 7.8, 3),
            Block.box(-0.5, 1, -6.4, 0.5, 6.8, -5.4),
            Block.box(-0.5, 5.8, -5.4, 0.5, 6.8, -3),
            Block.box(-0.5, 1, -5.4, 0.5, 2, -3)
    );

    private final static VoxelShape EAST = Shapes.or(
        Block.box(-3, 0, -3, 3, 7.8, 3),
        Block.box(-6.4, 1, -0.5, -5.4, 6.8, 0.5),
        Block.box(-5.4, 5.8, -0.5, -3, 6.8, 0.5),
        Block.box(-5.4, 1, -0.5, -3, 2, 0.5)
    );

    private final static VoxelShape SOUTH = Shapes.or(
            Block.box(-3, 0, -3, 3, 7.8, 3),
            Block.box(-0.5, 1, 5.4, 0.5, 6.8, 6.4),
            Block.box(-0.5, 5.8, 3, 0.5, 6.8, 5.4),
            Block.box(-0.5, 1, 3, 0.5, 2, 5.4)
    );

    private final static VoxelShape WEST = Shapes.or(
        Block.box(-3, 0, -3, 3, 7.8, 3),
        Block.box(5.4, 1, -0.5, 6.4, 6.8, 0.5),
        Block.box(3, 5.8, -0.5, 5.4, 6.8, 0.5),
        Block.box(3, 1, -0.5, 5.4, 2, 0.5)
    );

    public Tankard() {
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
