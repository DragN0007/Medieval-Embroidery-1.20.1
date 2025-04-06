package com.dragn0007_evangelix.medievalembroidery.block;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crystal.CrystalOreBlock;
import com.dragn0007_evangelix.medievalembroidery.block.custom.placedfood.PlatedFood;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.*;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacer;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacerContainer;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacerEntity;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacerItem;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MEBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MedievalEmbroidery.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES
            = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MedievalEmbroidery.MODID);

    //Ores & Ore Blocks
    public static final RegistryObject<Block> FIRESTONE_ORE = registerBlock("firestone_ore",
            () -> new DropExperienceBlock(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> FIRESTONE_BLOCK = registerBlock("firestone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> SEASTONE_ORE = registerBlock("seastone_ore",
            () -> new DropExperienceBlock(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> SEASTONE_BLOCK = registerBlock("seastone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> FROSTSTONE_ORE = registerBlock("froststone_ore",
            () -> new DropExperienceBlock(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> FROSTSTONE_BLOCK = registerBlock("froststone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> MOSSTONE_ORE = registerBlock("mosstone_ore",
            () -> new DropExperienceBlock(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> MOSSTONE_BLOCK = registerBlock("mosstone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> ASTROSTONE_ORE = registerBlock("astrostone_ore",
            () -> new DropExperienceBlock(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> ASTROSTONE_BLOCK = registerBlock("astrostone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> DEPTHSTONE_ORE = registerBlock("depthstone_ore",
            () -> new DropExperienceBlock(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> DEPTHSTONE_BLOCK = registerBlock("depthstone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> SKYSTONE_ORE = registerBlock("skystone_ore",
            () -> new DropExperienceBlock(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> SKYSTONE_BLOCK = registerBlock("skystone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> SALT_ORE = registerBlock("salt_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));

    public static final RegistryObject<Block> ASSISTIVE_CRYSTAL_ORE = registerBlock("assistive_crystal_ore",
            () -> new CrystalOreBlock(255255255));
    public static final RegistryObject<Block> DESTRUCTIVE_CRYSTAL_ORE = registerBlock("destructive_crystal_ore",
            () -> new CrystalOreBlock(16711680));
    public static final RegistryObject<Block> HEALING_CRYSTAL_ORE = registerBlock("healing_crystal_ore",
            () -> new CrystalOreBlock(13746255));
    public static final RegistryObject<Block> CONJURING_CRYSTAL_ORE = registerBlock("conjuring_crystal_ore",
            () -> new CrystalOreBlock(602550));
    public static final RegistryObject<Block> PROTECTIVE_CRYSTAL_ORE = registerBlock("protective_crystal_ore",
            () -> new CrystalOreBlock(8854255));


    //Food - Placed
    public static final RegistryObject<PlatedFood> SWEET_BREAD = registerBlockWithoutItem("sweet_bread",
            () -> new PlatedFood());
    public static final RegistryObject<PlatedFood> SWEET_BREAD_CREAM = registerBlockWithoutItem("sweet_bread_cream",
            () -> new PlatedFood());
    public static final RegistryObject<PlatedFood> SWEET_BREAD_HONEY = registerBlockWithoutItem("sweet_bread_honey",
            () -> new PlatedFood());
    public static final RegistryObject<PlatedFood> SWEET_BREAD_REDCURRANT = registerBlockWithoutItem("sweet_bread_redcurrant",
            () -> new PlatedFood());
    public static final RegistryObject<PlatedFood> SWEET_BREAD_BILBERRY = registerBlockWithoutItem("sweet_bread_bilberry",
            () -> new PlatedFood());
    public static final RegistryObject<PlatedFood> SWEET_BREAD_COWBERRY = registerBlockWithoutItem("sweet_bread_cowberry",
            () -> new PlatedFood());
    public static final RegistryObject<PlatedFood> SWEET_BREAD_HAWTHORN = registerBlockWithoutItem("sweet_bread_hawthorn",
            () -> new PlatedFood());
    public static final RegistryObject<PlatedFood> SWEET_BREAD_ELDERBERRY = registerBlockWithoutItem("sweet_bread_elderberry",
            () -> new PlatedFood());
    public static final RegistryObject<PlatedFood> SWEET_BREAD_FRUIT = registerBlockWithoutItem("sweet_bread_fruit",
            () -> new PlatedFood());


    public static final RegistryObject<Block> BEIGE_BRICKS = registerBlock("beige_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLACK_BRICKS = registerBlock("black_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLUE_BRICKS = registerBlock("blue_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BROWN_BRICKS = registerBlock("brown_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> FADED_BRICKS = registerBlock("faded_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREEN_BRICKS = registerBlock("green_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREY_BRICKS = registerBlock("grey_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> MAROON_BRICKS = registerBlock("maroon_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> NAVY_BRICKS = registerBlock("navy_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> ORANGE_BRICKS = registerBlock("orange_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PALE_BLUE_BRICKS = registerBlock("pale_blue_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PINK_BRICKS = registerBlock("pink_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PURPLE_BRICKS = registerBlock("purple_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> RED_BRICKS = registerBlock("red_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> SWAMPY_BRICKS = registerBlock("swampy_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> WHITE_BRICKS = registerBlock("white_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> YELLOW_BRICKS = registerBlock("yellow_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

    public static final RegistryObject<Block> BEIGE_BRICKS_MOSSY = registerBlock("beige_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLACK_BRICKS_MOSSY = registerBlock("black_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLUE_BRICKS_MOSSY = registerBlock("blue_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BROWN_BRICKS_MOSSY = registerBlock("brown_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> FADED_BRICKS_MOSSY = registerBlock("faded_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREEN_BRICKS_MOSSY = registerBlock("green_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREY_BRICKS_MOSSY = registerBlock("grey_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> MAROON_BRICKS_MOSSY = registerBlock("maroon_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> NAVY_BRICKS_MOSSY = registerBlock("navy_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> ORANGE_BRICKS_MOSSY = registerBlock("orange_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PALE_BLUE_BRICKS_MOSSY = registerBlock("pale_blue_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PINK_BRICKS_MOSSY = registerBlock("pink_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PURPLE_BRICKS_MOSSY = registerBlock("purple_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> RED_BRICKS_MOSSY = registerBlock("red_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> SWAMPY_BRICKS_MOSSY = registerBlock("swampy_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> WHITE_BRICKS_MOSSY = registerBlock("white_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> YELLOW_BRICKS_MOSSY = registerBlock("yellow_bricks_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

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
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLACK_BRICKS_SLAB = registerBlock("black_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLUE_BRICKS_SLAB = registerBlock("blue_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BROWN_BRICKS_SLAB = registerBlock("brown_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> FADED_BRICKS_SLAB = registerBlock("faded_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREEN_BRICKS_SLAB = registerBlock("green_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREY_BRICKS_SLAB = registerBlock("grey_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> MAROON_BRICKS_SLAB = registerBlock("maroon_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> NAVY_BRICKS_SLAB = registerBlock("navy_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> ORANGE_BRICKS_SLAB = registerBlock("orange_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PALE_BLUE_BRICKS_SLAB = registerBlock("pale_blue_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PINK_BRICKS_SLAB = registerBlock("pink_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PURPLE_BRICKS_SLAB = registerBlock("purple_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> RED_BRICKS_SLAB = registerBlock("red_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> SWAMPY_BRICKS_SLAB = registerBlock("swampy_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> WHITE_BRICKS_SLAB = registerBlock("white_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> YELLOW_BRICKS_SLAB = registerBlock("yellow_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

    public static final RegistryObject<Block> BEIGE_BRICKS_SLAB_MOSSY = registerBlock("beige_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLACK_BRICKS_SLAB_MOSSY = registerBlock("black_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BLUE_BRICKS_SLAB_MOSSY = registerBlock("blue_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> BROWN_BRICKS_SLAB_MOSSY = registerBlock("brown_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> FADED_BRICKS_SLAB_MOSSY = registerBlock("faded_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREEN_BRICKS_SLAB_MOSSY = registerBlock("green_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> GREY_BRICKS_SLAB_MOSSY = registerBlock("grey_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> MAROON_BRICKS_SLAB_MOSSY = registerBlock("maroon_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> NAVY_BRICKS_SLAB_MOSSY = registerBlock("navy_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> ORANGE_BRICKS_SLAB_MOSSY = registerBlock("orange_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PALE_BLUE_BRICKS_SLAB_MOSSY = registerBlock("pale_blue_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PINK_BRICKS_SLAB_MOSSY = registerBlock("pink_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> PURPLE_BRICKS_SLAB_MOSSY = registerBlock("purple_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> RED_BRICKS_SLAB_MOSSY = registerBlock("red_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> SWAMPY_BRICKS_SLAB_MOSSY = registerBlock("swampy_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> WHITE_BRICKS_SLAB_MOSSY = registerBlock("white_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> YELLOW_BRICKS_SLAB_MOSSY = registerBlock("yellow_bricks_slab_mossy",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));



    protected static <T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }

    protected static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    protected static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        MEItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    protected static <T extends Block>RegistryObject<T> registerPlantBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerPlantBlockItem(name, toReturn);
        return toReturn;
    }
    protected static <T extends Block> void registerPlantBlockItem(String name, RegistryObject<T> block) {
        MEItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        BLOCK_ENTITIES.register(eventBus);
    }
}
