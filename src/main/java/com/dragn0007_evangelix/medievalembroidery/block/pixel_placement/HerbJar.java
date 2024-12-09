package com.dragn0007_evangelix.medievalembroidery.block.pixel_placement;

import com.dragn0007.medievalembroidery.block.pixel_placement.util.PixelPlacer;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class HerbJar extends PixelPlacer {

    private static final VoxelShape SHAPE = Shapes.or(
            Block.box(-1.25, 0, -1.25, 1.25, 4, 1.25),
            Block.box(-0.95, 4, -0.95, 0.95, 4.5, 0.95),
            Block.box(-1.15, 4.5, -1.15, 1.15, 5, 1.15)
    );

    public HerbJar() {
        super(Properties.of(Material.AIR).sound(SoundType.GLASS).noOcclusion());
    }

    @Override
    public VoxelShape getVoxelShape(Direction direction) {
        return SHAPE;
    }
}
