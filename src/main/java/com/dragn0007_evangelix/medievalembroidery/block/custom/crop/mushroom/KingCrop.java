package com.dragn0007_evangelix.medievalembroidery.block.custom.crop.mushroom;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crop.MEMushroomCropBlock;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.BlockState;

public class KingCrop extends MEMushroomCropBlock {
    public KingCrop(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return MEBlocks.KING.get().defaultBlockState();
    }

    @Override
    public ItemLike getBaseSeedId() {
        return MEItems.KING.get();
    }
}
