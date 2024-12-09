package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import com.dragn0007.medievalembroidery.block.MEBlocks;
import com.dragn0007.medievalembroidery.block.MEBlocksDataGen;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MEBlockstateProvider extends BlockStateProvider {
    public MEBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MedievalEmbroideryMain.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        simpleBlock(MEBlocks.ASTROSTONE_BLOCK.get());
        simpleBlockItem(MEBlocks.ASTROSTONE_BLOCK.get(), models().cubeAll(MEBlocks.ASTROSTONE_BLOCK.get().getRegistryName().getPath(),
                blockTexture(MEBlocks.ASTROSTONE_BLOCK.get())));

        simpleBlock(MEBlocks.FIRE_DAISY.get(), models().cross(MEBlocks.FIRE_DAISY.get().getRegistryName().getPath(),
                blockTexture(MEBlocks.FIRE_DAISY.get())));
        simpleBlock(MEBlocks.BLUE_DRAGON.get(), models().cross(MEBlocks.BLUE_DRAGON.get().getRegistryName().getPath(),
                blockTexture(MEBlocks.BLUE_DRAGON.get())));
        simpleBlock(MEBlocks.VIOLET_DRAGON.get(), models().cross(MEBlocks.VIOLET_DRAGON.get().getRegistryName().getPath(),
                blockTexture(MEBlocks.VIOLET_DRAGON.get())));

        simpleBlock(MEBlocksDataGen.FRAMED_GLASS_1.get());
        simpleBlockItem(MEBlocksDataGen.FRAMED_GLASS_1.get(), models().cubeAll(MEBlocksDataGen.FRAMED_GLASS_1.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FRAMED_GLASS_1.get())));
        simpleBlock(MEBlocksDataGen.FRAMED_GLASS_2.get());
        simpleBlockItem(MEBlocksDataGen.FRAMED_GLASS_2.get(), models().cubeAll(MEBlocksDataGen.FRAMED_GLASS_2.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FRAMED_GLASS_2.get())));
        simpleBlock(MEBlocksDataGen.FRAMED_GLASS_3.get());
        simpleBlockItem(MEBlocksDataGen.FRAMED_GLASS_3.get(), models().cubeAll(MEBlocksDataGen.FRAMED_GLASS_3.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FRAMED_GLASS_3.get())));
        simpleBlock(MEBlocksDataGen.FRAMED_GLASS_4.get());
        simpleBlockItem(MEBlocksDataGen.FRAMED_GLASS_4.get(), models().cubeAll(MEBlocksDataGen.FRAMED_GLASS_4.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FRAMED_GLASS_4.get())));
        simpleBlock(MEBlocksDataGen.FRAMED_GLASS_5.get());
        simpleBlockItem(MEBlocksDataGen.FRAMED_GLASS_5.get(), models().cubeAll(MEBlocksDataGen.FRAMED_GLASS_5.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FRAMED_GLASS_5.get())));
        simpleBlock(MEBlocksDataGen.FRAMED_GLASS_6.get());
        simpleBlockItem(MEBlocksDataGen.FRAMED_GLASS_6.get(), models().cubeAll(MEBlocksDataGen.FRAMED_GLASS_6.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FRAMED_GLASS_6.get())));
        simpleBlock(MEBlocksDataGen.FRAMED_GLASS_7.get());
        simpleBlockItem(MEBlocksDataGen.FRAMED_GLASS_7.get(), models().cubeAll(MEBlocksDataGen.FRAMED_GLASS_7.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FRAMED_GLASS_7.get())));
        simpleBlock(MEBlocksDataGen.FRAMED_GLASS_8.get());
        simpleBlockItem(MEBlocksDataGen.FRAMED_GLASS_8.get(), models().cubeAll(MEBlocksDataGen.FRAMED_GLASS_8.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FRAMED_GLASS_8.get())));
        simpleBlock(MEBlocksDataGen.FRAMED_GLASS_9.get());
        simpleBlockItem(MEBlocksDataGen.FRAMED_GLASS_9.get(), models().cubeAll(MEBlocksDataGen.FRAMED_GLASS_9.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FRAMED_GLASS_9.get())));
        simpleBlock(MEBlocksDataGen.FRAMED_GLASS_10.get());
        simpleBlockItem(MEBlocksDataGen.FRAMED_GLASS_10.get(), models().cubeAll(MEBlocksDataGen.FRAMED_GLASS_10.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FRAMED_GLASS_10.get())));

        stairsBlock((StairBlock) MEBlocksDataGen.BEIGE_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.BEIGE_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.BEIGE_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.BEIGE_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BEIGE_BRICKS.get()), blockTexture(MEBlocksDataGen.BEIGE_BRICKS.get()), blockTexture(MEBlocksDataGen.BEIGE_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.BLACK_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.BLACK_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.BLACK_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.BLACK_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BLACK_BRICKS.get()), blockTexture(MEBlocksDataGen.BLACK_BRICKS.get()), blockTexture(MEBlocksDataGen.BLACK_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.BLUE_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.BLUE_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.BLUE_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.BLUE_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BLUE_BRICKS.get()), blockTexture(MEBlocksDataGen.BLUE_BRICKS.get()), blockTexture(MEBlocksDataGen.BLUE_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.BROWN_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.BROWN_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.BROWN_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.BROWN_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BROWN_BRICKS.get()), blockTexture(MEBlocksDataGen.BROWN_BRICKS.get()), blockTexture(MEBlocksDataGen.BROWN_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.FADED_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.FADED_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.FADED_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.FADED_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FADED_BRICKS.get()), blockTexture(MEBlocksDataGen.FADED_BRICKS.get()), blockTexture(MEBlocksDataGen.FADED_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.GREEN_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.GREEN_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.GREEN_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.GREEN_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.GREEN_BRICKS.get()), blockTexture(MEBlocksDataGen.GREEN_BRICKS.get()), blockTexture(MEBlocksDataGen.GREEN_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.GREY_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.GREY_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.GREY_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.GREY_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.GREY_BRICKS.get()), blockTexture(MEBlocksDataGen.GREY_BRICKS.get()), blockTexture(MEBlocksDataGen.GREY_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.MAROON_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.MAROON_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.MAROON_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.MAROON_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.MAROON_BRICKS.get()), blockTexture(MEBlocksDataGen.MAROON_BRICKS.get()), blockTexture(MEBlocksDataGen.MAROON_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.NAVY_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.NAVY_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.NAVY_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.NAVY_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.NAVY_BRICKS.get()), blockTexture(MEBlocksDataGen.NAVY_BRICKS.get()), blockTexture(MEBlocksDataGen.NAVY_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.ORANGE_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.ORANGE_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.ORANGE_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.ORANGE_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.ORANGE_BRICKS.get()), blockTexture(MEBlocksDataGen.ORANGE_BRICKS.get()), blockTexture(MEBlocksDataGen.ORANGE_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.PALE_BLUE_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.PALE_BLUE_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.PALE_BLUE_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS.get()), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS.get()), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.PINK_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.PINK_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.PINK_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.PINK_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PINK_BRICKS.get()), blockTexture(MEBlocksDataGen.PINK_BRICKS.get()), blockTexture(MEBlocksDataGen.PINK_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.PURPLE_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.PURPLE_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.PURPLE_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.PURPLE_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PURPLE_BRICKS.get()), blockTexture(MEBlocksDataGen.PURPLE_BRICKS.get()), blockTexture(MEBlocksDataGen.PURPLE_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.RED_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.RED_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.RED_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.RED_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.RED_BRICKS.get()), blockTexture(MEBlocksDataGen.RED_BRICKS.get()), blockTexture(MEBlocksDataGen.RED_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.SWAMPY_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.SWAMPY_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.SWAMPY_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.SWAMPY_BRICKS.get()), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS.get()), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.WHITE_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.WHITE_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.WHITE_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.WHITE_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.WHITE_BRICKS.get()), blockTexture(MEBlocksDataGen.WHITE_BRICKS.get()), blockTexture(MEBlocksDataGen.WHITE_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.YELLOW_BRICKS_STAIRS.get(), blockTexture(MEBlocksDataGen.YELLOW_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.YELLOW_BRICKS_STAIRS.get(), models().stairs(MEBlocksDataGen.YELLOW_BRICKS_STAIRS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.YELLOW_BRICKS.get()), blockTexture(MEBlocksDataGen.YELLOW_BRICKS.get()), blockTexture(MEBlocksDataGen.YELLOW_BRICKS.get())));

        stairsBlock((StairBlock) MEBlocksDataGen.BEIGE_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.BEIGE_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.BEIGE_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.BLACK_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.BLACK_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.BLACK_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.BLUE_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.BLUE_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.BLUE_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.BROWN_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.BROWN_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.BROWN_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.FADED_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.FADED_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.FADED_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.FADED_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FADED_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.FADED_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.FADED_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.GREEN_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.GREEN_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.GREEN_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.GREY_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.GREY_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.GREY_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.GREY_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.GREY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.GREY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.GREY_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.MAROON_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.MAROON_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.MAROON_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.NAVY_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.NAVY_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.NAVY_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.ORANGE_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.ORANGE_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.ORANGE_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.PALE_BLUE_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.PALE_BLUE_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.PALE_BLUE_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.PINK_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.PINK_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.PINK_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.PINK_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PINK_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PINK_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PINK_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.PURPLE_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.PURPLE_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.PURPLE_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.RED_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.RED_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.RED_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.RED_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.RED_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.RED_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.RED_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.SWAMPY_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.SWAMPY_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.SWAMPY_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.WHITE_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.WHITE_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.WHITE_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocksDataGen.YELLOW_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.YELLOW_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocksDataGen.YELLOW_BRICKS_STAIRS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get())));


        simpleBlock(MEBlocksDataGen.BEIGE_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.BEIGE_BRICKS.get(), models().cubeAll(MEBlocksDataGen.BEIGE_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BEIGE_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.BLACK_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.BLACK_BRICKS.get(), models().cubeAll(MEBlocksDataGen.BLACK_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BLACK_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.BLUE_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.BLUE_BRICKS.get(), models().cubeAll(MEBlocksDataGen.BLUE_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BLUE_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.BROWN_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.BROWN_BRICKS.get(), models().cubeAll(MEBlocksDataGen.BROWN_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BROWN_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.FADED_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.FADED_BRICKS.get(), models().cubeAll(MEBlocksDataGen.FADED_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FADED_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.GREEN_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.GREEN_BRICKS.get(), models().cubeAll(MEBlocksDataGen.GREEN_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.GREEN_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.GREY_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.GREY_BRICKS.get(), models().cubeAll(MEBlocksDataGen.GREY_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.GREY_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.MAROON_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.MAROON_BRICKS.get(), models().cubeAll(MEBlocksDataGen.MAROON_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.MAROON_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.NAVY_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.NAVY_BRICKS.get(), models().cubeAll(MEBlocksDataGen.NAVY_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.NAVY_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.ORANGE_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.ORANGE_BRICKS.get(), models().cubeAll(MEBlocksDataGen.ORANGE_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.ORANGE_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.PALE_BLUE_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.PALE_BLUE_BRICKS.get(), models().cubeAll(MEBlocksDataGen.PALE_BLUE_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.PINK_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.PINK_BRICKS.get(), models().cubeAll(MEBlocksDataGen.PINK_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PINK_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.PURPLE_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.PURPLE_BRICKS.get(), models().cubeAll(MEBlocksDataGen.PURPLE_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PURPLE_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.RED_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.RED_BRICKS.get(), models().cubeAll(MEBlocksDataGen.RED_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.RED_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.SWAMPY_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.SWAMPY_BRICKS.get(), models().cubeAll(MEBlocksDataGen.SWAMPY_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.SWAMPY_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.WHITE_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.WHITE_BRICKS.get(), models().cubeAll(MEBlocksDataGen.WHITE_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.WHITE_BRICKS.get())));
        simpleBlock(MEBlocksDataGen.YELLOW_BRICKS.get());
        simpleBlockItem(MEBlocksDataGen.YELLOW_BRICKS.get(), models().cubeAll(MEBlocksDataGen.YELLOW_BRICKS.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.YELLOW_BRICKS.get())));

        simpleBlock(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.FADED_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.FADED_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.FADED_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FADED_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.GREY_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.GREY_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.GREY_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.GREY_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.PINK_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.PINK_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.PINK_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PINK_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.RED_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.RED_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.RED_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.RED_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get(), models().cubeAll(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get())));

        slabBlock((SlabBlock) MEBlocksDataGen.BEIGE_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.BEIGE_BRICKS.get()), blockTexture(MEBlocksDataGen.BEIGE_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.BEIGE_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.BEIGE_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BEIGE_BRICKS.get()), blockTexture(MEBlocksDataGen.BEIGE_BRICKS.get()), blockTexture(MEBlocksDataGen.BEIGE_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.BLACK_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.BLACK_BRICKS.get()), blockTexture(MEBlocksDataGen.BLACK_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.BLACK_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.BLACK_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BLACK_BRICKS.get()), blockTexture(MEBlocksDataGen.BLACK_BRICKS.get()), blockTexture(MEBlocksDataGen.BLACK_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.BLUE_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.BLUE_BRICKS.get()), blockTexture(MEBlocksDataGen.BLUE_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.BLUE_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.BLUE_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BLUE_BRICKS.get()), blockTexture(MEBlocksDataGen.BLUE_BRICKS.get()), blockTexture(MEBlocksDataGen.BLUE_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.BROWN_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.BROWN_BRICKS.get()), blockTexture(MEBlocksDataGen.BROWN_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.BROWN_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.BROWN_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BROWN_BRICKS.get()), blockTexture(MEBlocksDataGen.BROWN_BRICKS.get()), blockTexture(MEBlocksDataGen.BROWN_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.FADED_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.FADED_BRICKS.get()), blockTexture(MEBlocksDataGen.FADED_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.FADED_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.FADED_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FADED_BRICKS.get()), blockTexture(MEBlocksDataGen.FADED_BRICKS.get()), blockTexture(MEBlocksDataGen.FADED_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.GREEN_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.GREEN_BRICKS.get()), blockTexture(MEBlocksDataGen.GREEN_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.GREEN_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.GREEN_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.GREEN_BRICKS.get()), blockTexture(MEBlocksDataGen.GREEN_BRICKS.get()), blockTexture(MEBlocksDataGen.GREEN_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.GREY_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.GREY_BRICKS.get()), blockTexture(MEBlocksDataGen.GREY_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.GREY_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.GREY_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.GREY_BRICKS.get()), blockTexture(MEBlocksDataGen.GREY_BRICKS.get()), blockTexture(MEBlocksDataGen.GREY_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.MAROON_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.MAROON_BRICKS.get()), blockTexture(MEBlocksDataGen.MAROON_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.MAROON_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.MAROON_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.MAROON_BRICKS.get()), blockTexture(MEBlocksDataGen.MAROON_BRICKS.get()), blockTexture(MEBlocksDataGen.MAROON_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.NAVY_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.NAVY_BRICKS.get()), blockTexture(MEBlocksDataGen.NAVY_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.NAVY_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.NAVY_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.NAVY_BRICKS.get()), blockTexture(MEBlocksDataGen.NAVY_BRICKS.get()), blockTexture(MEBlocksDataGen.NAVY_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.ORANGE_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.ORANGE_BRICKS.get()), blockTexture(MEBlocksDataGen.ORANGE_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.ORANGE_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.ORANGE_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.ORANGE_BRICKS.get()), blockTexture(MEBlocksDataGen.ORANGE_BRICKS.get()), blockTexture(MEBlocksDataGen.ORANGE_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.PALE_BLUE_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS.get()), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.PALE_BLUE_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.PALE_BLUE_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS.get()), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS.get()), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.PINK_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.PINK_BRICKS.get()), blockTexture(MEBlocksDataGen.PINK_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.PINK_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.PINK_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PINK_BRICKS.get()), blockTexture(MEBlocksDataGen.PINK_BRICKS.get()), blockTexture(MEBlocksDataGen.PINK_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.PURPLE_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.PURPLE_BRICKS.get()), blockTexture(MEBlocksDataGen.PURPLE_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.PURPLE_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.PURPLE_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PURPLE_BRICKS.get()), blockTexture(MEBlocksDataGen.PURPLE_BRICKS.get()), blockTexture(MEBlocksDataGen.PURPLE_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.RED_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.RED_BRICKS.get()), blockTexture(MEBlocksDataGen.RED_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.RED_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.RED_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.RED_BRICKS.get()), blockTexture(MEBlocksDataGen.RED_BRICKS.get()), blockTexture(MEBlocksDataGen.RED_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.SWAMPY_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS.get()), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.SWAMPY_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.SWAMPY_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.SWAMPY_BRICKS.get()), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS.get()), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.WHITE_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.WHITE_BRICKS.get()), blockTexture(MEBlocksDataGen.WHITE_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.WHITE_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.WHITE_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.WHITE_BRICKS.get()), blockTexture(MEBlocksDataGen.WHITE_BRICKS.get()), blockTexture(MEBlocksDataGen.WHITE_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.YELLOW_BRICKS_SLAB.get(), blockTexture(MEBlocksDataGen.YELLOW_BRICKS.get()), blockTexture(MEBlocksDataGen.YELLOW_BRICKS.get()));
        simpleBlockItem(MEBlocksDataGen.YELLOW_BRICKS_SLAB.get(), models().slab(MEBlocksDataGen.YELLOW_BRICKS_SLAB.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.YELLOW_BRICKS.get()), blockTexture(MEBlocksDataGen.YELLOW_BRICKS.get()), blockTexture(MEBlocksDataGen.YELLOW_BRICKS.get())));

        slabBlock((SlabBlock) MEBlocksDataGen.BEIGE_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.BEIGE_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.BEIGE_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.BLACK_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.BLACK_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.BLACK_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.BLUE_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.BLUE_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.BLUE_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.BROWN_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.BROWN_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.BROWN_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.FADED_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.FADED_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.FADED_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.FADED_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.FADED_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.FADED_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.FADED_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.FADED_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.GREEN_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.GREEN_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.GREEN_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.GREY_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.GREY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.GREY_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.GREY_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.GREY_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.GREY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.GREY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.GREY_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.MAROON_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.MAROON_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.MAROON_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.NAVY_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.NAVY_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.NAVY_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.ORANGE_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.ORANGE_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.ORANGE_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.PALE_BLUE_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.PALE_BLUE_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.PALE_BLUE_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.PINK_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.PINK_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PINK_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.PINK_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.PINK_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PINK_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PINK_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PINK_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.PURPLE_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.PURPLE_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.PURPLE_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.RED_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.RED_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.RED_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.RED_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.RED_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.RED_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.RED_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.RED_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.SWAMPY_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.SWAMPY_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.SWAMPY_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.WHITE_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.WHITE_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.WHITE_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocksDataGen.YELLOW_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocksDataGen.YELLOW_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocksDataGen.YELLOW_BRICKS_SLAB_MOSSY.get().getRegistryName().getPath(),
                blockTexture(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get()), blockTexture(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get())));
        
        
        
    }

}
