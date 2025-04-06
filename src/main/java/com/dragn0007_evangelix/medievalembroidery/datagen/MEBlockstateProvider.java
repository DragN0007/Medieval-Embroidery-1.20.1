package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
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
        blockWithItem(MEBlocks.FIRESTONE_ORE);
        blockWithItem(MEBlocks.FIRESTONE_BLOCK);
        blockWithItem(MEBlocks.SEASTONE_ORE);
        blockWithItem(MEBlocks.SEASTONE_BLOCK);
        blockWithItem(MEBlocks.FROSTSTONE_ORE);
        blockWithItem(MEBlocks.FROSTSTONE_BLOCK);
        blockWithItem(MEBlocks.MOSSTONE_ORE);
        blockWithItem(MEBlocks.MOSSTONE_BLOCK);
        blockWithItem(MEBlocks.ASTROSTONE_ORE);
        blockWithItem(MEBlocks.ASTROSTONE_BLOCK);
        blockWithItem(MEBlocks.DEPTHSTONE_ORE);
        blockWithItem(MEBlocks.DEPTHSTONE_BLOCK);
        blockWithItem(MEBlocks.SKYSTONE_ORE);
        blockWithItem(MEBlocks.SKYSTONE_BLOCK);
        blockWithItem(MEBlocks.SALT_ORE);

        stairsBlock((StairBlock) MEBlocks.BEIGE_BRICKS_STAIRS.get(), blockTexture(MEBlocks.BEIGE_BRICKS.get()));
        simpleBlockItem(MEBlocks.BEIGE_BRICKS_STAIRS.get(), models().stairs(MEBlocks.BEIGE_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.BEIGE_BRICKS.get()), blockTexture(MEBlocks.BEIGE_BRICKS.get()), blockTexture(MEBlocks.BEIGE_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.BLACK_BRICKS_STAIRS.get(), blockTexture(MEBlocks.BLACK_BRICKS.get()));
        simpleBlockItem(MEBlocks.BLACK_BRICKS_STAIRS.get(), models().stairs(MEBlocks.BLACK_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.BLACK_BRICKS.get()), blockTexture(MEBlocks.BLACK_BRICKS.get()), blockTexture(MEBlocks.BLACK_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.BLUE_BRICKS_STAIRS.get(), blockTexture(MEBlocks.BLUE_BRICKS.get()));
        simpleBlockItem(MEBlocks.BLUE_BRICKS_STAIRS.get(), models().stairs(MEBlocks.BLUE_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.BLUE_BRICKS.get()), blockTexture(MEBlocks.BLUE_BRICKS.get()), blockTexture(MEBlocks.BLUE_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.BROWN_BRICKS_STAIRS.get(), blockTexture(MEBlocks.BROWN_BRICKS.get()));
        simpleBlockItem(MEBlocks.BROWN_BRICKS_STAIRS.get(), models().stairs(MEBlocks.BROWN_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.BROWN_BRICKS.get()), blockTexture(MEBlocks.BROWN_BRICKS.get()), blockTexture(MEBlocks.BROWN_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.FADED_BRICKS_STAIRS.get(), blockTexture(MEBlocks.FADED_BRICKS.get()));
        simpleBlockItem(MEBlocks.FADED_BRICKS_STAIRS.get(), models().stairs(MEBlocks.FADED_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.FADED_BRICKS.get()), blockTexture(MEBlocks.FADED_BRICKS.get()), blockTexture(MEBlocks.FADED_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.GREEN_BRICKS_STAIRS.get(), blockTexture(MEBlocks.GREEN_BRICKS.get()));
        simpleBlockItem(MEBlocks.GREEN_BRICKS_STAIRS.get(), models().stairs(MEBlocks.GREEN_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.GREEN_BRICKS.get()), blockTexture(MEBlocks.GREEN_BRICKS.get()), blockTexture(MEBlocks.GREEN_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.GREY_BRICKS_STAIRS.get(), blockTexture(MEBlocks.GREY_BRICKS.get()));
        simpleBlockItem(MEBlocks.GREY_BRICKS_STAIRS.get(), models().stairs(MEBlocks.GREY_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.GREY_BRICKS.get()), blockTexture(MEBlocks.GREY_BRICKS.get()), blockTexture(MEBlocks.GREY_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.MAROON_BRICKS_STAIRS.get(), blockTexture(MEBlocks.MAROON_BRICKS.get()));
        simpleBlockItem(MEBlocks.MAROON_BRICKS_STAIRS.get(), models().stairs(MEBlocks.MAROON_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.MAROON_BRICKS.get()), blockTexture(MEBlocks.MAROON_BRICKS.get()), blockTexture(MEBlocks.MAROON_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.NAVY_BRICKS_STAIRS.get(), blockTexture(MEBlocks.NAVY_BRICKS.get()));
        simpleBlockItem(MEBlocks.NAVY_BRICKS_STAIRS.get(), models().stairs(MEBlocks.NAVY_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.NAVY_BRICKS.get()), blockTexture(MEBlocks.NAVY_BRICKS.get()), blockTexture(MEBlocks.NAVY_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.ORANGE_BRICKS_STAIRS.get(), blockTexture(MEBlocks.ORANGE_BRICKS.get()));
        simpleBlockItem(MEBlocks.ORANGE_BRICKS_STAIRS.get(), models().stairs(MEBlocks.ORANGE_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.ORANGE_BRICKS.get()), blockTexture(MEBlocks.ORANGE_BRICKS.get()), blockTexture(MEBlocks.ORANGE_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.PALE_BLUE_BRICKS_STAIRS.get(), blockTexture(MEBlocks.PALE_BLUE_BRICKS.get()));
        simpleBlockItem(MEBlocks.PALE_BLUE_BRICKS_STAIRS.get(), models().stairs(MEBlocks.PALE_BLUE_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.PALE_BLUE_BRICKS.get()), blockTexture(MEBlocks.PALE_BLUE_BRICKS.get()), blockTexture(MEBlocks.PALE_BLUE_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.PINK_BRICKS_STAIRS.get(), blockTexture(MEBlocks.PINK_BRICKS.get()));
        simpleBlockItem(MEBlocks.PINK_BRICKS_STAIRS.get(), models().stairs(MEBlocks.PINK_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.PINK_BRICKS.get()), blockTexture(MEBlocks.PINK_BRICKS.get()), blockTexture(MEBlocks.PINK_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.PURPLE_BRICKS_STAIRS.get(), blockTexture(MEBlocks.PURPLE_BRICKS.get()));
        simpleBlockItem(MEBlocks.PURPLE_BRICKS_STAIRS.get(), models().stairs(MEBlocks.PURPLE_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.PURPLE_BRICKS.get()), blockTexture(MEBlocks.PURPLE_BRICKS.get()), blockTexture(MEBlocks.PURPLE_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.RED_BRICKS_STAIRS.get(), blockTexture(MEBlocks.RED_BRICKS.get()));
        simpleBlockItem(MEBlocks.RED_BRICKS_STAIRS.get(), models().stairs(MEBlocks.RED_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.RED_BRICKS.get()), blockTexture(MEBlocks.RED_BRICKS.get()), blockTexture(MEBlocks.RED_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.SWAMPY_BRICKS_STAIRS.get(), blockTexture(MEBlocks.SWAMPY_BRICKS.get()));
        simpleBlockItem(MEBlocks.SWAMPY_BRICKS_STAIRS.get(), models().stairs(MEBlocks.SWAMPY_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.SWAMPY_BRICKS.get()), blockTexture(MEBlocks.SWAMPY_BRICKS.get()), blockTexture(MEBlocks.SWAMPY_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.WHITE_BRICKS_STAIRS.get(), blockTexture(MEBlocks.WHITE_BRICKS.get()));
        simpleBlockItem(MEBlocks.WHITE_BRICKS_STAIRS.get(), models().stairs(MEBlocks.WHITE_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.WHITE_BRICKS.get()), blockTexture(MEBlocks.WHITE_BRICKS.get()), blockTexture(MEBlocks.WHITE_BRICKS.get())));
        stairsBlock((StairBlock) MEBlocks.YELLOW_BRICKS_STAIRS.get(), blockTexture(MEBlocks.YELLOW_BRICKS.get()));
        simpleBlockItem(MEBlocks.YELLOW_BRICKS_STAIRS.get(), models().stairs(MEBlocks.YELLOW_BRICKS_STAIRS.getId().getPath(),
                blockTexture(MEBlocks.YELLOW_BRICKS.get()), blockTexture(MEBlocks.YELLOW_BRICKS.get()), blockTexture(MEBlocks.YELLOW_BRICKS.get())));

        stairsBlock((StairBlock) MEBlocks.BEIGE_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.BEIGE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.BEIGE_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.BEIGE_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.BEIGE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BEIGE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BEIGE_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.BLACK_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.BLACK_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.BLACK_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.BLACK_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.BLACK_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BLACK_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BLACK_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.BLUE_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.BLUE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.BLUE_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.BLUE_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BLUE_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.BROWN_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.BROWN_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.BROWN_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.BROWN_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.BROWN_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BROWN_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BROWN_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.FADED_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.FADED_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.FADED_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.FADED_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.FADED_BRICKS_MOSSY.get()), blockTexture(MEBlocks.FADED_BRICKS_MOSSY.get()), blockTexture(MEBlocks.FADED_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.GREEN_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.GREEN_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.GREEN_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.GREEN_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.GREEN_BRICKS_MOSSY.get()), blockTexture(MEBlocks.GREEN_BRICKS_MOSSY.get()), blockTexture(MEBlocks.GREEN_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.GREY_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.GREY_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.GREY_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.GREY_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.GREY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.GREY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.GREY_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.MAROON_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.MAROON_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.MAROON_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.MAROON_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.MAROON_BRICKS_MOSSY.get()), blockTexture(MEBlocks.MAROON_BRICKS_MOSSY.get()), blockTexture(MEBlocks.MAROON_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.NAVY_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.NAVY_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.NAVY_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.NAVY_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.NAVY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.NAVY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.NAVY_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.ORANGE_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.ORANGE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.ORANGE_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.ORANGE_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.ORANGE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.ORANGE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.ORANGE_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.PALE_BLUE_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.PALE_BLUE_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.PALE_BLUE_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.PINK_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.PINK_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.PINK_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.PINK_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.PINK_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PINK_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PINK_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.PURPLE_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.PURPLE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.PURPLE_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.PURPLE_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.PURPLE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PURPLE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PURPLE_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.RED_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.RED_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.RED_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.RED_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.RED_BRICKS_MOSSY.get()), blockTexture(MEBlocks.RED_BRICKS_MOSSY.get()), blockTexture(MEBlocks.RED_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.SWAMPY_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.SWAMPY_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.SWAMPY_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.SWAMPY_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.SWAMPY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.SWAMPY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.SWAMPY_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.WHITE_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.WHITE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.WHITE_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.WHITE_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.WHITE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.WHITE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.WHITE_BRICKS_MOSSY.get())));
        stairsBlock((StairBlock) MEBlocks.YELLOW_BRICKS_STAIRS_MOSSY.get(), blockTexture(MEBlocks.YELLOW_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.YELLOW_BRICKS_STAIRS_MOSSY.get(), models().stairs(MEBlocks.YELLOW_BRICKS_STAIRS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.YELLOW_BRICKS_MOSSY.get()), blockTexture(MEBlocks.YELLOW_BRICKS_MOSSY.get()), blockTexture(MEBlocks.YELLOW_BRICKS_MOSSY.get())));


        simpleBlock(MEBlocks.BEIGE_BRICKS.get());
        simpleBlockItem(MEBlocks.BEIGE_BRICKS.get(), models().cubeAll(MEBlocks.BEIGE_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.BEIGE_BRICKS.get())));
        simpleBlock(MEBlocks.BLACK_BRICKS.get());
        simpleBlockItem(MEBlocks.BLACK_BRICKS.get(), models().cubeAll(MEBlocks.BLACK_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.BLACK_BRICKS.get())));
        simpleBlock(MEBlocks.BLUE_BRICKS.get());
        simpleBlockItem(MEBlocks.BLUE_BRICKS.get(), models().cubeAll(MEBlocks.BLUE_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.BLUE_BRICKS.get())));
        simpleBlock(MEBlocks.BROWN_BRICKS.get());
        simpleBlockItem(MEBlocks.BROWN_BRICKS.get(), models().cubeAll(MEBlocks.BROWN_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.BROWN_BRICKS.get())));
        simpleBlock(MEBlocks.FADED_BRICKS.get());
        simpleBlockItem(MEBlocks.FADED_BRICKS.get(), models().cubeAll(MEBlocks.FADED_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.FADED_BRICKS.get())));
        simpleBlock(MEBlocks.GREEN_BRICKS.get());
        simpleBlockItem(MEBlocks.GREEN_BRICKS.get(), models().cubeAll(MEBlocks.GREEN_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.GREEN_BRICKS.get())));
        simpleBlock(MEBlocks.GREY_BRICKS.get());
        simpleBlockItem(MEBlocks.GREY_BRICKS.get(), models().cubeAll(MEBlocks.GREY_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.GREY_BRICKS.get())));
        simpleBlock(MEBlocks.MAROON_BRICKS.get());
        simpleBlockItem(MEBlocks.MAROON_BRICKS.get(), models().cubeAll(MEBlocks.MAROON_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.MAROON_BRICKS.get())));
        simpleBlock(MEBlocks.NAVY_BRICKS.get());
        simpleBlockItem(MEBlocks.NAVY_BRICKS.get(), models().cubeAll(MEBlocks.NAVY_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.NAVY_BRICKS.get())));
        simpleBlock(MEBlocks.ORANGE_BRICKS.get());
        simpleBlockItem(MEBlocks.ORANGE_BRICKS.get(), models().cubeAll(MEBlocks.ORANGE_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.ORANGE_BRICKS.get())));
        simpleBlock(MEBlocks.PALE_BLUE_BRICKS.get());
        simpleBlockItem(MEBlocks.PALE_BLUE_BRICKS.get(), models().cubeAll(MEBlocks.PALE_BLUE_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.PALE_BLUE_BRICKS.get())));
        simpleBlock(MEBlocks.PINK_BRICKS.get());
        simpleBlockItem(MEBlocks.PINK_BRICKS.get(), models().cubeAll(MEBlocks.PINK_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.PINK_BRICKS.get())));
        simpleBlock(MEBlocks.PURPLE_BRICKS.get());
        simpleBlockItem(MEBlocks.PURPLE_BRICKS.get(), models().cubeAll(MEBlocks.PURPLE_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.PURPLE_BRICKS.get())));
        simpleBlock(MEBlocks.RED_BRICKS.get());
        simpleBlockItem(MEBlocks.RED_BRICKS.get(), models().cubeAll(MEBlocks.RED_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.RED_BRICKS.get())));
        simpleBlock(MEBlocks.SWAMPY_BRICKS.get());
        simpleBlockItem(MEBlocks.SWAMPY_BRICKS.get(), models().cubeAll(MEBlocks.SWAMPY_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.SWAMPY_BRICKS.get())));
        simpleBlock(MEBlocks.WHITE_BRICKS.get());
        simpleBlockItem(MEBlocks.WHITE_BRICKS.get(), models().cubeAll(MEBlocks.WHITE_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.WHITE_BRICKS.get())));
        simpleBlock(MEBlocks.YELLOW_BRICKS.get());
        simpleBlockItem(MEBlocks.YELLOW_BRICKS.get(), models().cubeAll(MEBlocks.YELLOW_BRICKS.getId().getPath(),
                blockTexture(MEBlocks.YELLOW_BRICKS.get())));

        simpleBlock(MEBlocks.BEIGE_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.BEIGE_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.BEIGE_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.BEIGE_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.BLACK_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.BLACK_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.BLACK_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.BLACK_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.BLUE_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.BLUE_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.BLUE_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.BLUE_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.BROWN_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.BROWN_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.BROWN_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.BROWN_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.FADED_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.FADED_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.FADED_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.FADED_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.GREEN_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.GREEN_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.GREEN_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.GREEN_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.GREY_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.GREY_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.GREY_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.GREY_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.MAROON_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.MAROON_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.MAROON_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.MAROON_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.NAVY_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.NAVY_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.NAVY_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.NAVY_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.ORANGE_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.ORANGE_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.ORANGE_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.ORANGE_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.PALE_BLUE_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.PINK_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.PINK_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.PINK_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.PINK_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.PURPLE_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.PURPLE_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.PURPLE_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.PURPLE_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.RED_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.RED_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.RED_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.RED_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.SWAMPY_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.SWAMPY_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.SWAMPY_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.SWAMPY_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.WHITE_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.WHITE_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.WHITE_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.WHITE_BRICKS_MOSSY.get())));
        simpleBlock(MEBlocks.YELLOW_BRICKS_MOSSY.get());
        simpleBlockItem(MEBlocks.YELLOW_BRICKS_MOSSY.get(), models().cubeAll(MEBlocks.YELLOW_BRICKS_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.YELLOW_BRICKS_MOSSY.get())));

        slabBlock((SlabBlock) MEBlocks.BEIGE_BRICKS_SLAB.get(), blockTexture(MEBlocks.BEIGE_BRICKS.get()), blockTexture(MEBlocks.BEIGE_BRICKS.get()));
        simpleBlockItem(MEBlocks.BEIGE_BRICKS_SLAB.get(), models().slab(MEBlocks.BEIGE_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.BEIGE_BRICKS.get()), blockTexture(MEBlocks.BEIGE_BRICKS.get()), blockTexture(MEBlocks.BEIGE_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.BLACK_BRICKS_SLAB.get(), blockTexture(MEBlocks.BLACK_BRICKS.get()), blockTexture(MEBlocks.BLACK_BRICKS.get()));
        simpleBlockItem(MEBlocks.BLACK_BRICKS_SLAB.get(), models().slab(MEBlocks.BLACK_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.BLACK_BRICKS.get()), blockTexture(MEBlocks.BLACK_BRICKS.get()), blockTexture(MEBlocks.BLACK_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.BLUE_BRICKS_SLAB.get(), blockTexture(MEBlocks.BLUE_BRICKS.get()), blockTexture(MEBlocks.BLUE_BRICKS.get()));
        simpleBlockItem(MEBlocks.BLUE_BRICKS_SLAB.get(), models().slab(MEBlocks.BLUE_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.BLUE_BRICKS.get()), blockTexture(MEBlocks.BLUE_BRICKS.get()), blockTexture(MEBlocks.BLUE_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.BROWN_BRICKS_SLAB.get(), blockTexture(MEBlocks.BROWN_BRICKS.get()), blockTexture(MEBlocks.BROWN_BRICKS.get()));
        simpleBlockItem(MEBlocks.BROWN_BRICKS_SLAB.get(), models().slab(MEBlocks.BROWN_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.BROWN_BRICKS.get()), blockTexture(MEBlocks.BROWN_BRICKS.get()), blockTexture(MEBlocks.BROWN_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.FADED_BRICKS_SLAB.get(), blockTexture(MEBlocks.FADED_BRICKS.get()), blockTexture(MEBlocks.FADED_BRICKS.get()));
        simpleBlockItem(MEBlocks.FADED_BRICKS_SLAB.get(), models().slab(MEBlocks.FADED_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.FADED_BRICKS.get()), blockTexture(MEBlocks.FADED_BRICKS.get()), blockTexture(MEBlocks.FADED_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.GREEN_BRICKS_SLAB.get(), blockTexture(MEBlocks.GREEN_BRICKS.get()), blockTexture(MEBlocks.GREEN_BRICKS.get()));
        simpleBlockItem(MEBlocks.GREEN_BRICKS_SLAB.get(), models().slab(MEBlocks.GREEN_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.GREEN_BRICKS.get()), blockTexture(MEBlocks.GREEN_BRICKS.get()), blockTexture(MEBlocks.GREEN_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.GREY_BRICKS_SLAB.get(), blockTexture(MEBlocks.GREY_BRICKS.get()), blockTexture(MEBlocks.GREY_BRICKS.get()));
        simpleBlockItem(MEBlocks.GREY_BRICKS_SLAB.get(), models().slab(MEBlocks.GREY_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.GREY_BRICKS.get()), blockTexture(MEBlocks.GREY_BRICKS.get()), blockTexture(MEBlocks.GREY_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.MAROON_BRICKS_SLAB.get(), blockTexture(MEBlocks.MAROON_BRICKS.get()), blockTexture(MEBlocks.MAROON_BRICKS.get()));
        simpleBlockItem(MEBlocks.MAROON_BRICKS_SLAB.get(), models().slab(MEBlocks.MAROON_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.MAROON_BRICKS.get()), blockTexture(MEBlocks.MAROON_BRICKS.get()), blockTexture(MEBlocks.MAROON_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.NAVY_BRICKS_SLAB.get(), blockTexture(MEBlocks.NAVY_BRICKS.get()), blockTexture(MEBlocks.NAVY_BRICKS.get()));
        simpleBlockItem(MEBlocks.NAVY_BRICKS_SLAB.get(), models().slab(MEBlocks.NAVY_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.NAVY_BRICKS.get()), blockTexture(MEBlocks.NAVY_BRICKS.get()), blockTexture(MEBlocks.NAVY_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.ORANGE_BRICKS_SLAB.get(), blockTexture(MEBlocks.ORANGE_BRICKS.get()), blockTexture(MEBlocks.ORANGE_BRICKS.get()));
        simpleBlockItem(MEBlocks.ORANGE_BRICKS_SLAB.get(), models().slab(MEBlocks.ORANGE_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.ORANGE_BRICKS.get()), blockTexture(MEBlocks.ORANGE_BRICKS.get()), blockTexture(MEBlocks.ORANGE_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.PALE_BLUE_BRICKS_SLAB.get(), blockTexture(MEBlocks.PALE_BLUE_BRICKS.get()), blockTexture(MEBlocks.PALE_BLUE_BRICKS.get()));
        simpleBlockItem(MEBlocks.PALE_BLUE_BRICKS_SLAB.get(), models().slab(MEBlocks.PALE_BLUE_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.PALE_BLUE_BRICKS.get()), blockTexture(MEBlocks.PALE_BLUE_BRICKS.get()), blockTexture(MEBlocks.PALE_BLUE_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.PINK_BRICKS_SLAB.get(), blockTexture(MEBlocks.PINK_BRICKS.get()), blockTexture(MEBlocks.PINK_BRICKS.get()));
        simpleBlockItem(MEBlocks.PINK_BRICKS_SLAB.get(), models().slab(MEBlocks.PINK_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.PINK_BRICKS.get()), blockTexture(MEBlocks.PINK_BRICKS.get()), blockTexture(MEBlocks.PINK_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.PURPLE_BRICKS_SLAB.get(), blockTexture(MEBlocks.PURPLE_BRICKS.get()), blockTexture(MEBlocks.PURPLE_BRICKS.get()));
        simpleBlockItem(MEBlocks.PURPLE_BRICKS_SLAB.get(), models().slab(MEBlocks.PURPLE_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.PURPLE_BRICKS.get()), blockTexture(MEBlocks.PURPLE_BRICKS.get()), blockTexture(MEBlocks.PURPLE_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.RED_BRICKS_SLAB.get(), blockTexture(MEBlocks.RED_BRICKS.get()), blockTexture(MEBlocks.RED_BRICKS.get()));
        simpleBlockItem(MEBlocks.RED_BRICKS_SLAB.get(), models().slab(MEBlocks.RED_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.RED_BRICKS.get()), blockTexture(MEBlocks.RED_BRICKS.get()), blockTexture(MEBlocks.RED_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.SWAMPY_BRICKS_SLAB.get(), blockTexture(MEBlocks.SWAMPY_BRICKS.get()), blockTexture(MEBlocks.SWAMPY_BRICKS.get()));
        simpleBlockItem(MEBlocks.SWAMPY_BRICKS_SLAB.get(), models().slab(MEBlocks.SWAMPY_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.SWAMPY_BRICKS.get()), blockTexture(MEBlocks.SWAMPY_BRICKS.get()), blockTexture(MEBlocks.SWAMPY_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.WHITE_BRICKS_SLAB.get(), blockTexture(MEBlocks.WHITE_BRICKS.get()), blockTexture(MEBlocks.WHITE_BRICKS.get()));
        simpleBlockItem(MEBlocks.WHITE_BRICKS_SLAB.get(), models().slab(MEBlocks.WHITE_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.WHITE_BRICKS.get()), blockTexture(MEBlocks.WHITE_BRICKS.get()), blockTexture(MEBlocks.WHITE_BRICKS.get())));
        slabBlock((SlabBlock) MEBlocks.YELLOW_BRICKS_SLAB.get(), blockTexture(MEBlocks.YELLOW_BRICKS.get()), blockTexture(MEBlocks.YELLOW_BRICKS.get()));
        simpleBlockItem(MEBlocks.YELLOW_BRICKS_SLAB.get(), models().slab(MEBlocks.YELLOW_BRICKS_SLAB.getId().getPath(),
                blockTexture(MEBlocks.YELLOW_BRICKS.get()), blockTexture(MEBlocks.YELLOW_BRICKS.get()), blockTexture(MEBlocks.YELLOW_BRICKS.get())));

        slabBlock((SlabBlock) MEBlocks.BEIGE_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.BEIGE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BEIGE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.BEIGE_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.BEIGE_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.BEIGE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BEIGE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BEIGE_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.BLACK_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.BLACK_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BLACK_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.BLACK_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.BLACK_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.BLACK_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BLACK_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BLACK_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.BLUE_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BLUE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.BLUE_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.BLUE_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BLUE_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.BROWN_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.BROWN_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BROWN_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.BROWN_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.BROWN_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.BROWN_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BROWN_BRICKS_MOSSY.get()), blockTexture(MEBlocks.BROWN_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.FADED_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.FADED_BRICKS_MOSSY.get()), blockTexture(MEBlocks.FADED_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.FADED_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.FADED_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.FADED_BRICKS_MOSSY.get()), blockTexture(MEBlocks.FADED_BRICKS_MOSSY.get()), blockTexture(MEBlocks.FADED_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.GREEN_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.GREEN_BRICKS_MOSSY.get()), blockTexture(MEBlocks.GREEN_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.GREEN_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.GREEN_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.GREEN_BRICKS_MOSSY.get()), blockTexture(MEBlocks.GREEN_BRICKS_MOSSY.get()), blockTexture(MEBlocks.GREEN_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.GREY_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.GREY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.GREY_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.GREY_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.GREY_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.GREY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.GREY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.GREY_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.MAROON_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.MAROON_BRICKS_MOSSY.get()), blockTexture(MEBlocks.MAROON_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.MAROON_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.MAROON_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.MAROON_BRICKS_MOSSY.get()), blockTexture(MEBlocks.MAROON_BRICKS_MOSSY.get()), blockTexture(MEBlocks.MAROON_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.NAVY_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.NAVY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.NAVY_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.NAVY_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.NAVY_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.NAVY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.NAVY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.NAVY_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.ORANGE_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.ORANGE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.ORANGE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.ORANGE_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.ORANGE_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.ORANGE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.ORANGE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.ORANGE_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.PALE_BLUE_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.PALE_BLUE_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.PALE_BLUE_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.PINK_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.PINK_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PINK_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.PINK_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.PINK_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.PINK_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PINK_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PINK_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.PURPLE_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.PURPLE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PURPLE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.PURPLE_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.PURPLE_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.PURPLE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PURPLE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.PURPLE_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.RED_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.RED_BRICKS_MOSSY.get()), blockTexture(MEBlocks.RED_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.RED_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.RED_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.RED_BRICKS_MOSSY.get()), blockTexture(MEBlocks.RED_BRICKS_MOSSY.get()), blockTexture(MEBlocks.RED_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.SWAMPY_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.SWAMPY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.SWAMPY_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.SWAMPY_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.SWAMPY_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.SWAMPY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.SWAMPY_BRICKS_MOSSY.get()), blockTexture(MEBlocks.SWAMPY_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.WHITE_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.WHITE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.WHITE_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.WHITE_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.WHITE_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.WHITE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.WHITE_BRICKS_MOSSY.get()), blockTexture(MEBlocks.WHITE_BRICKS_MOSSY.get())));
        slabBlock((SlabBlock) MEBlocks.YELLOW_BRICKS_SLAB_MOSSY.get(), blockTexture(MEBlocks.YELLOW_BRICKS_MOSSY.get()), blockTexture(MEBlocks.YELLOW_BRICKS_MOSSY.get()));
        simpleBlockItem(MEBlocks.YELLOW_BRICKS_SLAB_MOSSY.get(), models().slab(MEBlocks.YELLOW_BRICKS_SLAB_MOSSY.getId().getPath(),
                blockTexture(MEBlocks.YELLOW_BRICKS_MOSSY.get()), blockTexture(MEBlocks.YELLOW_BRICKS_MOSSY.get()), blockTexture(MEBlocks.YELLOW_BRICKS_MOSSY.get())));
    }

    public void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
