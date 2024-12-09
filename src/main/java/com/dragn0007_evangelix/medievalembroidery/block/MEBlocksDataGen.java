package com.dragn0007_evangelix.medievalembroidery.block;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import com.dragn0007.medievalembroidery.block.custom.decorvox.FairyBody;
import com.dragn0007.medievalembroidery.block.custom.decorvox.MedTavernTable;
import com.dragn0007.medievalembroidery.block.custom.decorvox.SmlTavernTable;
import com.dragn0007.medievalembroidery.block.decorvox.FancyPane;
import com.dragn0007.medievalembroidery.item.MEItemGroup;
import com.dragn0007.medievalembroidery.item.MEItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MEBlocksDataGen {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MedievalEmbroideryMain.MODID);


    public static final RegistryObject<MedTavernTable> MED_TAVERNTABLE = registerBlock("med_taverntable",
            () -> new MedTavernTable());
    public static final RegistryObject<SmlTavernTable> SML_TAVERNTABLE = registerBlock("sml_taverntable",
            () -> new SmlTavernTable());
    public static final RegistryObject<FairyBody> FAIRY_BODY = registerBlock("fairy_body",
            () -> new FairyBody());


    public static final RegistryObject<Block> FRAMED_GLASS_1 = registerBlock("framed_glass_1",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> FRAMED_GLASS_2 = registerBlock("framed_glass_2",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> FRAMED_GLASS_3 = registerBlock("framed_glass_3",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> FRAMED_GLASS_4 = registerBlock("framed_glass_4",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> FRAMED_GLASS_5 = registerBlock("framed_glass_5",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> FRAMED_GLASS_6 = registerBlock("framed_glass_6",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> FRAMED_GLASS_7 = registerBlock("framed_glass_7",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> FRAMED_GLASS_8 = registerBlock("framed_glass_8",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> FRAMED_GLASS_9 = registerBlock("framed_glass_9",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> FRAMED_GLASS_10 = registerBlock("framed_glass_10",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> FRAMED_GLASS_PANE_1 = registerBlock("framed_glass_pane_1",
            () -> new FancyPane());
    public static final RegistryObject<Block> FRAMED_GLASS_PANE_2 = registerBlock("framed_glass_pane_2",
            () -> new FancyPane());
    public static final RegistryObject<Block> FRAMED_GLASS_PANE_3 = registerBlock("framed_glass_pane_3",
            () -> new FancyPane());
    public static final RegistryObject<Block> FRAMED_GLASS_PANE_4 = registerBlock("framed_glass_pane_4",
            () -> new FancyPane());
    public static final RegistryObject<Block> FRAMED_GLASS_PANE_5 = registerBlock("framed_glass_pane_5",
            () -> new FancyPane());
    public static final RegistryObject<Block> FRAMED_GLASS_PANE_6 = registerBlock("framed_glass_pane_6",
            () -> new FancyPane());
    public static final RegistryObject<Block> FRAMED_GLASS_PANE_7 = registerBlock("framed_glass_pane_7",
            () -> new FancyPane());
    public static final RegistryObject<Block> FRAMED_GLASS_PANE_8 = registerBlock("framed_glass_pane_8",
            () -> new FancyPane());
    public static final RegistryObject<Block> FRAMED_GLASS_PANE_9 = registerBlock("framed_glass_pane_9",
            () -> new FancyPane());
    public static final RegistryObject<Block> FRAMED_GLASS_PANE_10 = registerBlock("framed_glass_pane_10",
            () -> new FancyPane());


    public static final RegistryObject<Block> BEIGE_BRICKS = registerBlock("beige_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLACK_BRICKS = registerBlock("black_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLUE_BRICKS = registerBlock("blue_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BROWN_BRICKS = registerBlock("brown_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> FADED_BRICKS = registerBlock("faded_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREEN_BRICKS = registerBlock("green_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREY_BRICKS = registerBlock("grey_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> MAROON_BRICKS = registerBlock("maroon_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> NAVY_BRICKS = registerBlock("navy_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> ORANGE_BRICKS = registerBlock("orange_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PALE_BLUE_BRICKS = registerBlock("pale_blue_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PINK_BRICKS = registerBlock("pink_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PURPLE_BRICKS = registerBlock("purple_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> RED_BRICKS = registerBlock("red_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> SWAMPY_BRICKS = registerBlock("swampy_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> WHITE_BRICKS = registerBlock("white_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> YELLOW_BRICKS = registerBlock("yellow_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

    public static final RegistryObject<Block> BEIGE_BRICKS_MOSSY = registerBlock("beige_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLACK_BRICKS_MOSSY = registerBlock("black_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLUE_BRICKS_MOSSY = registerBlock("blue_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BROWN_BRICKS_MOSSY = registerBlock("brown_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> FADED_BRICKS_MOSSY = registerBlock("faded_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREEN_BRICKS_MOSSY = registerBlock("green_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREY_BRICKS_MOSSY = registerBlock("grey_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> MAROON_BRICKS_MOSSY = registerBlock("maroon_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> NAVY_BRICKS_MOSSY = registerBlock("navy_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> ORANGE_BRICKS_MOSSY = registerBlock("orange_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PALE_BLUE_BRICKS_MOSSY = registerBlock("pale_blue_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PINK_BRICKS_MOSSY = registerBlock("pink_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PURPLE_BRICKS_MOSSY = registerBlock("purple_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> RED_BRICKS_MOSSY = registerBlock("red_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> SWAMPY_BRICKS_MOSSY = registerBlock("swampy_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> WHITE_BRICKS_MOSSY = registerBlock("white_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> YELLOW_BRICKS_MOSSY = registerBlock("yellow_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

    public static final RegistryObject<Block> BEIGE_BRICKS_STAIRS = registerBlock("beige_bricks_stairs",
            () -> new StairBlock(BEIGE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLACK_BRICKS_STAIRS = registerBlock("black_bricks_stairs",
            () -> new StairBlock(BLACK_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLUE_BRICKS_STAIRS = registerBlock("blue_bricks_stairs",
            () -> new StairBlock(BLUE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BROWN_BRICKS_STAIRS = registerBlock("brown_bricks_stairs",
            () -> new StairBlock(BROWN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> FADED_BRICKS_STAIRS = registerBlock("faded_bricks_stairs",
            () -> new StairBlock(FADED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GREEN_BRICKS_STAIRS = registerBlock("green_bricks_stairs",
            () -> new StairBlock(GREEN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GREY_BRICKS_STAIRS = registerBlock("grey_bricks_stairs",
            () -> new StairBlock(GREY_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MAROON_BRICKS_STAIRS = registerBlock("maroon_bricks_stairs",
            () -> new StairBlock(MAROON_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> NAVY_BRICKS_STAIRS = registerBlock("navy_bricks_stairs",
            () -> new StairBlock(NAVY_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> ORANGE_BRICKS_STAIRS = registerBlock("orange_bricks_stairs",
            () -> new StairBlock(ORANGE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PALE_BLUE_BRICKS_STAIRS = registerBlock("pale_blue_bricks_stairs",
            () -> new StairBlock(PALE_BLUE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PINK_BRICKS_STAIRS = registerBlock("pink_bricks_stairs",
            () -> new StairBlock(PINK_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PURPLE_BRICKS_STAIRS = registerBlock("purple_bricks_stairs",
            () -> new StairBlock(PURPLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> RED_BRICKS_STAIRS = registerBlock("red_bricks_stairs",
            () -> new StairBlock(RED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> SWAMPY_BRICKS_STAIRS = registerBlock("swampy_bricks_stairs",
            () -> new StairBlock(SWAMPY_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> WHITE_BRICKS_STAIRS = registerBlock("white_bricks_stairs",
            () -> new StairBlock(WHITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> YELLOW_BRICKS_STAIRS = registerBlock("yellow_bricks_stairs",
            () -> new StairBlock(YELLOW_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> BEIGE_BRICKS_STAIRS_MOSSY = registerBlock("beige_bricks_stairs_mossy",
            () -> new StairBlock(BEIGE_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLACK_BRICKS_STAIRS_MOSSY = registerBlock("black_bricks_stairs_mossy",
            () -> new StairBlock(BLACK_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLUE_BRICKS_STAIRS_MOSSY = registerBlock("blue_bricks_stairs_mossy",
            () -> new StairBlock(BLUE_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BROWN_BRICKS_STAIRS_MOSSY = registerBlock("brown_bricks_stairs_mossy",
            () -> new StairBlock(BROWN_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> FADED_BRICKS_STAIRS_MOSSY = registerBlock("faded_bricks_stairs_mossy",
            () -> new StairBlock(FADED_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GREEN_BRICKS_STAIRS_MOSSY = registerBlock("green_bricks_stairs_mossy",
            () -> new StairBlock(GREEN_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GREY_BRICKS_STAIRS_MOSSY = registerBlock("grey_bricks_stairs_mossy",
            () -> new StairBlock(GREY_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MAROON_BRICKS_STAIRS_MOSSY = registerBlock("maroon_bricks_stairs_mossy",
            () -> new StairBlock(MAROON_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> NAVY_BRICKS_STAIRS_MOSSY = registerBlock("navy_bricks_stairs_mossy",
            () -> new StairBlock(NAVY_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> ORANGE_BRICKS_STAIRS_MOSSY = registerBlock("orange_bricks_stairs_mossy",
            () -> new StairBlock(ORANGE_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PALE_BLUE_BRICKS_STAIRS_MOSSY = registerBlock("pale_blue_bricks_stairs_mossy",
            () -> new StairBlock(PALE_BLUE_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PINK_BRICKS_STAIRS_MOSSY = registerBlock("pink_bricks_stairs_mossy",
            () -> new StairBlock(PINK_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PURPLE_BRICKS_STAIRS_MOSSY = registerBlock("purple_bricks_stairs_mossy",
            () -> new StairBlock(PURPLE_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> RED_BRICKS_STAIRS_MOSSY = registerBlock("red_bricks_stairs_mossy",
            () -> new StairBlock(RED_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> SWAMPY_BRICKS_STAIRS_MOSSY = registerBlock("swampy_bricks_stairs_mossy",
            () -> new StairBlock(SWAMPY_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> WHITE_BRICKS_STAIRS_MOSSY = registerBlock("white_bricks_stairs_mossy",
            () -> new StairBlock(WHITE_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> YELLOW_BRICKS_STAIRS_MOSSY = registerBlock("yellow_bricks_stairs_mossy",
            () -> new StairBlock(YELLOW_BRICKS_MOSSY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> BEIGE_BRICKS_SLAB = registerBlock("beige_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLACK_BRICKS_SLAB = registerBlock("black_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLUE_BRICKS_SLAB = registerBlock("blue_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BROWN_BRICKS_SLAB = registerBlock("brown_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> FADED_BRICKS_SLAB = registerBlock("faded_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREEN_BRICKS_SLAB = registerBlock("green_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREY_BRICKS_SLAB = registerBlock("grey_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> MAROON_BRICKS_SLAB = registerBlock("maroon_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> NAVY_BRICKS_SLAB = registerBlock("navy_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> ORANGE_BRICKS_SLAB = registerBlock("orange_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PALE_BLUE_BRICKS_SLAB = registerBlock("pale_blue_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PINK_BRICKS_SLAB = registerBlock("pink_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PURPLE_BRICKS_SLAB = registerBlock("purple_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> RED_BRICKS_SLAB = registerBlock("red_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> SWAMPY_BRICKS_SLAB = registerBlock("swampy_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> WHITE_BRICKS_SLAB = registerBlock("white_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> YELLOW_BRICKS_SLAB = registerBlock("yellow_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

    public static final RegistryObject<Block> BEIGE_BRICKS_SLAB_MOSSY = registerBlock("beige_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLACK_BRICKS_SLAB_MOSSY = registerBlock("black_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLUE_BRICKS_SLAB_MOSSY = registerBlock("blue_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BROWN_BRICKS_SLAB_MOSSY = registerBlock("brown_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> FADED_BRICKS_SLAB_MOSSY = registerBlock("faded_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREEN_BRICKS_SLAB_MOSSY = registerBlock("green_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREY_BRICKS_SLAB_MOSSY = registerBlock("grey_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> MAROON_BRICKS_SLAB_MOSSY = registerBlock("maroon_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> NAVY_BRICKS_SLAB_MOSSY = registerBlock("navy_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> ORANGE_BRICKS_SLAB_MOSSY = registerBlock("orange_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PALE_BLUE_BRICKS_SLAB_MOSSY = registerBlock("pale_blue_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PINK_BRICKS_SLAB_MOSSY = registerBlock("pink_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PURPLE_BRICKS_SLAB_MOSSY = registerBlock("purple_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> RED_BRICKS_SLAB_MOSSY = registerBlock("red_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> SWAMPY_BRICKS_SLAB_MOSSY = registerBlock("swampy_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> WHITE_BRICKS_SLAB_MOSSY = registerBlock("white_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> YELLOW_BRICKS_SLAB_MOSSY = registerBlock("yellow_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    
    protected static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    protected static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        MEItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(MEItemGroup.DECOR_GROUP)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
