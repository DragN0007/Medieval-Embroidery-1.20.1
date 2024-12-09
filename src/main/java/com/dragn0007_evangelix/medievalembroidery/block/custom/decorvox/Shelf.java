package com.dragn0007_evangelix.medievalembroidery.block.custom.decorvox;

import com.dragn0007.medievalembroidery.block.custom.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class Shelf extends DecorRotator {

    public Shelf() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(0, 14, 4, 18, 16, 16),
            Block.box(0, 7, 14, 2, 14, 16),
            Block.box(16, 7, 14, 18, 14, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(0, 14, 0, 12, 16, 18),
            Block.box(0, 7, 0, 2, 14, 2),
            Block.box(0, 7, 16, 2, 14, 18)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(-2, 14, 0, 16, 16, 12),
            Block.box(14, 7, 0, 16, 14, 2),
            Block.box(-2, 7, 0, 0, 14, 2)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(4, 14, -2, 16, 16, 16),
            Block.box(14, 7, 14, 16, 14, 16),
            Block.box(14, 7, -2, 16, 14, 0)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

}
