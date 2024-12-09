package com.dragn0007_evangelix.medievalembroidery.block.pixel_placement;

import com.dragn0007.medievalembroidery.block.pixel_placement.util.PixelPlacer;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Goblet extends PixelPlacer {

    private static final VoxelShape SHAPE = Shapes.or(
        Block.box(-2, 0, -2, 2, 0.5, 2),
        Block.box(-1.7, 3.7, -1.7, 1.7, 7.5, 1.7),
        Block.box(-0.7, 0.5, -0.7, 0.7, 4, 0.7)
    );

    public Goblet() {
        super(Properties.of(Material.METAL));
    }

    @Override
    public VoxelShape getVoxelShape(Direction direction) {
        return SHAPE;
    }
}
