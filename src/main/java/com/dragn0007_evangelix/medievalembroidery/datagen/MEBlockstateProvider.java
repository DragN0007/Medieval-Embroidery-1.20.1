package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class MEBlockstateProvider extends BlockStateProvider {
    public MEBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MedievalEmbroidery.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
         simpleBlock(MEBlocks.FIRESTONE_ORE.get());
         simpleBlock(MEBlocks.FIRESTONE_BLOCK.get());
         simpleBlock(MEBlocks.SEASTONE_ORE.get());
         simpleBlock(MEBlocks.SEASTONE_BLOCK.get());
         simpleBlock(MEBlocks.FROSTSTONE_ORE.get());
         simpleBlock(MEBlocks.FROSTSTONE_BLOCK.get());
         simpleBlock(MEBlocks.MOSSTONE_ORE.get());
         simpleBlock(MEBlocks.MOSSTONE_BLOCK.get());
         simpleBlock(MEBlocks.ASTROSTONE_ORE.get());
         simpleBlock(MEBlocks.ASTROSTONE_BLOCK.get());
         simpleBlock(MEBlocks.DEPTHSTONE_ORE.get());
         simpleBlock(MEBlocks.DEPTHSTONE_BLOCK.get());
         simpleBlock(MEBlocks.SKYSTONE_ORE.get());
         simpleBlock(MEBlocks.SKYSTONE_BLOCK.get());
         simpleBlock(MEBlocks.SALT_ORE.get());
    }

}
