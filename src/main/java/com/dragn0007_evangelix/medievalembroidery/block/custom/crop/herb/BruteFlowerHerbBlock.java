package com.dragn0007_evangelix.medievalembroidery.block.custom.crop.herb;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crop.MEHerbBlock;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.BlockState;

public class BruteFlowerHerbBlock extends MEHerbBlock {
    public BruteFlowerHerbBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return MEBlocks.BRUTEFLOWER.get().defaultBlockState();
    }

    @Override
    public ItemLike getBaseSeedId() {
        return MEItems.BRUTEFLOWER.get();
    }
}
