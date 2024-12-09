package com.dragn0007_evangelix.medievalembroidery.block.custom.decorvox;

import com.dragn0007.medievalembroidery.block.custom.DecorRotatorLit;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class FairyBody extends DecorRotatorLit {

    public FairyBody() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(7.3252675, 0.07723045509431747, 7.248852107034187, 8.6747325, 1.6438604550943174, 8.837452107034188)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(7.1625478929658115, 0.07723045509431747, 7.3252675, 8.751147892965813, 1.6438604550943174, 8.6747325)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(7.3252675, 0.07723045509431747, 7.248852107034187, 8.6747325, 1.6438604550943174, 8.837452107034188)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(7.1625478929658115, 0.07723045509431747, 7.3252675, 8.751147892965813, 1.6438604550943174, 8.6747325)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
