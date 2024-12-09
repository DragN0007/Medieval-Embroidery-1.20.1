package com.dragn0007_evangelix.medievalembroidery.block.custom.placedfood;

import com.dragn0007.medievalembroidery.block.custom.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class PlatedFood extends DecorRotator {

    public PlatedFood() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(4, 0, 4, 12, 0.5, 12),
            Block.box(4, 0.5, 4, 12, 1, 5),
            Block.box(4, 0.5, 11, 12, 1, 12),
            Block.box(4, 0.5, 5, 5, 1, 11),
            Block.box(11, 0.5, 5, 12, 1, 11)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(4, 0, 4, 12, 0.5, 12),
            Block.box(4, 0.5, 4, 12, 1, 5),
            Block.box(4, 0.5, 11, 12, 1, 12),
            Block.box(4, 0.5, 5, 5, 1, 11),
            Block.box(11, 0.5, 5, 12, 1, 11)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(4, 0, 4, 12, 0.5, 12),
            Block.box(4, 0.5, 4, 12, 1, 5),
            Block.box(4, 0.5, 11, 12, 1, 12),
            Block.box(4, 0.5, 5, 5, 1, 11),
            Block.box(11, 0.5, 5, 12, 1, 11)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(4, 0, 4, 12, 0.5, 12),
            Block.box(4, 0.5, 4, 12, 1, 5),
            Block.box(4, 0.5, 11, 12, 1, 12),
            Block.box(4, 0.5, 5, 5, 1, 11),
            Block.box(11, 0.5, 5, 12, 1, 11)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
