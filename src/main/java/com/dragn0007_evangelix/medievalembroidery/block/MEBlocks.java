package com.dragn0007_evangelix.medievalembroidery.block;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.custom.FungiRotator;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crop.bush.*;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crop.herb.*;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crop.mushroom.*;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crystal.CrystalOreBlock;
import com.dragn0007_evangelix.medievalembroidery.block.custom.placedfood.PlatedFood;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import net.minecraft.world.effect.MobEffects;
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

    //please don't rearrange categories, i have them set up in a specific way (adhd meltdown style) -dragoon

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


    //Plants
    public static final RegistryObject<FungiRotator> WILD_BLEWIT = registerBlock("wild_blewit",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> WILD_HONEY = registerBlock("wild_honey",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> WILD_KING = registerBlock("wild_king",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> WILD_MATSUTAKE = registerBlock("wild_matsutake",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> WILD_OYSTER = registerBlock("wild_oyster",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> WILD_PORCINI = registerBlock("wild_porcini",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> WILD_YELLOWFOOT = registerBlock("wild_yellowfoot",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> WILD_WOODS_CHICKEN = registerBlock("wild_woods_chicken",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));

    public static final RegistryObject<Block> BLEWIT = registerBlockWithoutItem("blewit",
            () -> new BlewitCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> HONEY = registerBlockWithoutItem("honey",
            () -> new HoneyCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> KING = registerBlockWithoutItem("king",
            () -> new KingCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> MATSUTAKE = registerBlockWithoutItem("matsutake",
            () -> new MatsutakeCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> OYSTER = registerBlockWithoutItem("oyster",
            () -> new OysterCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> PORCINI = registerBlockWithoutItem("porcini",
            () -> new PorciniCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> YELLOWFOOT = registerBlockWithoutItem("yellowfoot",
            () -> new YellowFootCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> WOODS_CHICKEN = registerBlockWithoutItem("woods_chicken",
            () -> new WoodsChickenCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));

    public static final RegistryObject<Block> BILBERRY_BUSH = registerBlockWithoutItem("bilberry_bush",
            () -> new BilberryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> COWBERRY_BUSH = registerBlockWithoutItem("cowberry_bush",
            () -> new CowberryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> ELDERBERRY_BUSH = registerBlockWithoutItem("elderberry_bush",
            () -> new ElderberryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> HAWTHORN_BUSH = registerBlockWithoutItem("hawthorn_bush",
            () -> new HawthornBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> REDCURRANT_BUSH = registerBlockWithoutItem("redcurrant_bush",
            () -> new RedcurrantBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> HENVEN = registerBlockWithoutItem("henven",
            () -> new HenvenHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_HENVEN = registerBlockWithoutItem("wild_henven",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> CANNAAN = registerBlockWithoutItem("cannaan",
            () -> new CannaanHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_CANNAAN = registerBlockWithoutItem("wild_cannaan",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> DRAGONEYE = registerBlockWithoutItem("dragoneye",
            () -> new DragonEyeHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_DRAGONEYE = registerBlockWithoutItem("wild_dragoneye",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> SPRINNAN = registerBlockWithoutItem("sprinnan",
            () -> new SprinnanHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_SPRINNAN = registerBlockWithoutItem("wild_sprinnan",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> VIRENNES = registerBlockWithoutItem("virennes",
            () -> new VirennesHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_VIRENNES = registerBlockWithoutItem("wild_virennes",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> BRUTEFLOWER = registerBlockWithoutItem("bruteflower",
            () -> new BruteFlowerHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_BRUTEFLOWER = registerBlockWithoutItem("wild_bruteflower",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> GRANGIN = registerBlockWithoutItem("grangin",
            () -> new GranginHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_GRANGIN = registerBlockWithoutItem("wild_grangin",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> CACHEN = registerBlockWithoutItem("cachen",
            () -> new CachenHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_CACHEN = registerBlockWithoutItem("wild_cachen",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> FAIRYFLOWER = registerBlockWithoutItem("fairyflower",
            () -> new FairyFlowerHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_FAIRYFLOWER = registerBlockWithoutItem("wild_fairyflower",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> LADYRIVER = registerBlockWithoutItem("ladyriver",
            () -> new LadyriverHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_LADYRIVER = registerBlockWithoutItem("wild_ladyriver",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> BLUE_DRAGON = registerPlantBlock("blue_dragon",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> VIOLET_DRAGON = registerPlantBlock("violet_dragon",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> PINK_MAGE = registerPlantBlock("pink_mage",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> PURPLE_MAGE = registerPlantBlock("purple_mage",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> FIRE_DAISY = registerPlantBlock("fire_daisy",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<Block> GROUND_VINE = registerPlantBlock("ground_vine",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));


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
