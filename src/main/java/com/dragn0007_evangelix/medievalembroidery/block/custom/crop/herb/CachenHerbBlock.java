package com.dragn0007_evangelix.medievalembroidery.block.custom.crop.herb;

import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class CachenHerbBlock extends CropBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_2;
    public CachenHerbBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 2;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return MEItems.CACHEN.get();
    }
}
