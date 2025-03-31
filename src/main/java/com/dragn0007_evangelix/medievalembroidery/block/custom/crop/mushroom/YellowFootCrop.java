package com.dragn0007_evangelix.medievalembroidery.block.custom.crop.mushroom;

import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class YellowFootCrop extends CropBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_2;
    public YellowFootCrop(Properties properties) {
        super(properties);
    }
    protected boolean mayPlaceOn(BlockState p_51042_, BlockGetter p_51043_, BlockPos p_51044_) {
        return p_51042_.is(Blocks.FARMLAND);
    }
    public boolean canSurvive(BlockState p_51028_, LevelReader p_51029_, BlockPos p_51030_) {
        BlockPos blockpos = p_51030_.below();
        if (p_51028_.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
            return p_51029_.getBlockState(blockpos).canSustainPlant(p_51029_, blockpos, Direction.UP, this);
        return this.mayPlaceOn(p_51029_.getBlockState(blockpos), p_51029_, blockpos);
    }
    @Override
    public int getMaxAge() {
        return 2;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return MEItems.YELLOWFOOT.get();
    }
}
