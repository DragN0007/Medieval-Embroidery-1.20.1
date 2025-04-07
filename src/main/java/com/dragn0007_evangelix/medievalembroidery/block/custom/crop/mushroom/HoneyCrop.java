package com.dragn0007_evangelix.medievalembroidery.block.custom.crop.mushroom;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crop.MEMushroomCropBlock;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.BlockState;

public class HoneyCrop extends MEMushroomCropBlock {
    public HoneyCrop(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return MEBlocks.HONEY.get().defaultBlockState();
    }

    @Override
    public ItemLike getBaseSeedId() {
        return MEItems.HONEY.get();
    }
}
