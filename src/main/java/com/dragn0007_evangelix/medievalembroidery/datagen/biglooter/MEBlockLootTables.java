package com.dragn0007_evangelix.medievalembroidery.datagen.biglooter;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class MEBlockLootTables extends BlockLootSubProvider {

    public MEBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MEBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
