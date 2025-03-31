package com.dragn0007_evangelix.medievalembroidery.world.feature.tree;

import com.dragn0007_evangelix.medievalembroidery.world.feature.MEConfigFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class LemonTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random p_204307_, boolean p_204308_) {
        return MEConfigFeatures.LEMON;
    }
}
