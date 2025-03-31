package com.dragn0007_evangelix.medievalembroidery.block;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.custom.FungiRotator;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crop.bush.*;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crop.herb.*;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crop.mushroom.*;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crystal.CrystalOreBlock;
import com.dragn0007_evangelix.medievalembroidery.block.custom.placedfood.PlatedFood;
import com.dragn0007_evangelix.medievalembroidery.block.leaves.AppleLeaves;
import com.dragn0007_evangelix.medievalembroidery.block.leaves.ApricotLeaves;
import com.dragn0007_evangelix.medievalembroidery.block.leaves.LemonLeaves;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.*;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacer;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacerContainer;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacerEntity;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacerItem;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import com.dragn0007_evangelix.medievalembroidery.world.feature.tree.AppleTreeGrower;
import com.dragn0007_evangelix.medievalembroidery.world.feature.tree.ApricotTreeGrower;
import com.dragn0007_evangelix.medievalembroidery.world.feature.tree.LemonTreeGrower;
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
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MedievalEmbroidery.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES
            = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MedievalEmbroidery.MODID);

    //Benches
//    public static final RegistryObject<Block> POTION_CAULDRON = registerBlock("potion_cauldron",
//            () -> new PotionCauldron(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));


    //Ores & Ore Blocks
    public static final RegistryObject<Block> FIRESTONE_ORE = registerBlock("firestone_ore",
            () -> new Block(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> FIRESTONE_BLOCK = registerBlock("firestone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> SEASTONE_ORE = registerBlock("seastone_ore",
            () -> new Block(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> SEASTONE_BLOCK = registerBlock("seastone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> FROSTSTONE_ORE = registerBlock("froststone_ore",
            () -> new Block(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> FROSTSTONE_BLOCK = registerBlock("froststone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> MOSSTONE_ORE = registerBlock("mosstone_ore",
            () -> new Block(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> MOSSTONE_BLOCK = registerBlock("mosstone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> ASTROSTONE_ORE = registerBlock("astrostone_ore",
            () -> new Block(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> ASTROSTONE_BLOCK = registerBlock("astrostone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> DEPTHSTONE_ORE = registerBlock("depthstone_ore",
            () -> new Block(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> DEPTHSTONE_BLOCK = registerBlock("depthstone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> SKYSTONE_ORE = registerBlock("skystone_ore",
            () -> new Block(Block.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> SKYSTONE_BLOCK = registerBlock("skystone_block",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> SALT_ORE = registerBlock("salt_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

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
    public static final RegistryObject<PlatedFood> CORNISH_HEN = registerBlockWithoutItem("cornish_hen",
            () -> new PlatedFood());


    // Pixel Placement
    public static final RegistryObject<HerbJar> HERB_JAR = registerPixelPlacer("herb_jar", HerbJar::new);
    public static final RegistryObject<Plate> PLATE = registerPixelPlacer("plate", Plate::new);
    public static final RegistryObject<Utensil> UTENSIL_WOODEN = registerPixelPlacer("utensil_wooden", () -> new Utensil(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Utensil> UTENSIL_METAL = registerPixelPlacer("utensil_metal", () -> new Utensil(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Cup> CUP_CLAY = registerPixelPlacer("cup_clay", () -> new Cup(BlockBehaviour.Properties.copy(Blocks.CLAY)));
    public static final RegistryObject<Cup> CUP_METAL = registerPixelPlacer("cup_metal", () -> new Cup(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Goblet> GOBLET = registerPixelPlacer("goblet", Goblet::new);
    public static final RegistryObject<Tankard> TANKARD = registerPixelPlacer("tankard", Tankard::new);
    public static final RegistryObject<LargePotionJar> LARGE_POTION_JAR_PINK = registerPixelPlacer("large_potion_jar_pink", LargePotionJar::new);
    public static final RegistryObject<LargePotionJar> LARGE_POTION_JAR_RED = registerPixelPlacer("large_potion_jar_red", LargePotionJar::new);
    public static final RegistryObject<LargePotionJar> LARGE_POTION_JAR_GREEN = registerPixelPlacer("large_potion_jar_green", LargePotionJar::new);
    public static final RegistryObject<LargePotionJar> LARGE_POTION_JAR_CYAN = registerPixelPlacer("large_potion_jar_cyan", LargePotionJar::new);
    public static final RegistryObject<LargePotionJar> LARGE_POTION_JAR_PURPLE = registerPixelPlacer("large_potion_jar_purple", LargePotionJar::new);
    public static final RegistryObject<OpenBook> OPEN_BOOK = registerPixelPlacer("open_book", OpenBook::new);
    public static final RegistryObject<OpenBook> OPEN_BOOK_FLAT = registerPixelPlacer("open_book_flat", OpenBook::new);
    public static final RegistryObject<ClosedBook> BOOK_CLOSED = registerPixelPlacer("book_closed", ClosedBook::new);
    public static final RegistryObject<GroundedSword> IRON_GROUNDED_SWORD = registerPixelPlacer("iron_grounded_sword", () -> new GroundedSword(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<GroundedSword> GOLDEN_GROUNDED_SWORD = registerPixelPlacer("golden_grounded_sword", () -> new GroundedSword(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<GroundedSword> DIAMOND_GROUNDED_SWORD = registerPixelPlacer("diamond_grounded_sword", () -> new GroundedSword(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<GroundedSword> NETHERITE_GROUNDED_SWORD = registerPixelPlacer("netherite_grounded_sword", () -> new GroundedSword(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<GroundedSword> OBSIDIAN_GROUNDED_SWORD = registerPixelPlacer("obsidian_grounded_sword", () -> new GroundedSword(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<PixelPlacerContainer> PIXEL_PLACER_CONTAINER = BLOCKS.register("pixel_placer_container", PixelPlacerContainer::new);
    public static final RegistryObject<BlockEntityType<PixelPlacerEntity>> PIXEL_PLACER_ENTITY = BLOCK_ENTITIES.register("pixel_placer_container",
            () -> BlockEntityType.Builder.of(PixelPlacerEntity::new, PIXEL_PLACER_CONTAINER.get()).build(null));



    //Fungi
    public static final RegistryObject<FungiRotator> BLEWIT = registerBlockWithoutItem("blewit",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> HONEY = registerBlockWithoutItem("honey",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> KING = registerBlockWithoutItem("king",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> MATSUTAKE = registerBlockWithoutItem("matsutake",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> OYSTER = registerBlockWithoutItem("oyster",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> PORCINI = registerBlockWithoutItem("porcini",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> YELLOWFOOT = registerBlockWithoutItem("yellowfoot",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<FungiRotator> WOODSCHICKEN = registerBlockWithoutItem("woodschicken",
            () -> new FungiRotator(Block.Properties.copy(Blocks.POPPY).sound(SoundType.FUNGUS).noCollission()));

    public static final RegistryObject<Block> BLEWIT_CROP = registerBlockWithoutItem("blewit_crop",
            () -> new BlewitCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> HONEY_CROP = registerBlockWithoutItem("honey_crop",
            () -> new HoneyCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> KING_CROP = registerBlockWithoutItem("king_crop",
            () -> new KingCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> MATSUTAKE_CROP = registerBlockWithoutItem("matsutake_crop",
            () -> new MatsutakeCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> OYSTER_CROP = registerBlockWithoutItem("oyster_crop",
            () -> new OysterCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> PORCINI_CROP = registerBlockWithoutItem("porcini_crop",
            () -> new PorciniCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> YELLOWFOOT_CROP = registerBlockWithoutItem("yellowfoot_crop",
            () -> new YellowFootCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));
    public static final RegistryObject<Block> WOODSCHICKEN_CROP = registerBlockWithoutItem("woodschicken_crop",
            () -> new WoodsChickenCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).sound(SoundType.FUNGUS).noCollission()));


    //Fruit Tree
    public static final RegistryObject<Block> APPLE_LEAVES = registerPlantBlock("apple_leaves",
            () -> new AppleLeaves(Block.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> APRICOT_LEAVES = registerPlantBlock("apricot_leaves",
            () -> new ApricotLeaves(Block.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> LEMON_LEAVES = registerPlantBlock("lemon_leaves",
            () -> new LemonLeaves(Block.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> APPLE_SAPLING = registerBlockWithoutItem("apple_sapling",
            () -> new SaplingBlock(new AppleTreeGrower(), Block.Properties.copy(Blocks.POPPY).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> APRICOT_SAPLING = registerBlockWithoutItem("apricot_sapling",
            () -> new SaplingBlock(new ApricotTreeGrower(), Block.Properties.copy(Blocks.POPPY).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> LEMON_SAPLING = registerBlockWithoutItem("lemon_sapling",
            () -> new SaplingBlock(new LemonTreeGrower(), Block.Properties.copy(Blocks.POPPY).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));


    //Bush
    public static final RegistryObject<Block> BILBERRY_BUSH_CROP = registerBlockWithoutItem("bilberry_bush_crop",
            () -> new BilberryCrop(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> COWBERRY_BUSH_CROP = registerBlockWithoutItem("cowberry_bush_crop",
            () -> new CowberryCrop(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> ELDERBERRY_BUSH_CROP = registerBlockWithoutItem("elderberry_bush_crop",
            () -> new ElderberryCrop(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> HAWTHORN_BUSH_CROP = registerBlockWithoutItem("hawthorn_bush_crop",
            () -> new HawthornCrop(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> REDCURRANT_BUSH_CROP = registerBlockWithoutItem("redcurrant_bush_crop",
            () -> new RedCurrantCrop(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));


    //Plants & Herbs
    public static final RegistryObject<Block> HENVEN_PLANT = registerBlockWithoutItem("henven_plant",
            () -> new HenvenHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_HENVEN_PLANT = registerBlockWithoutItem("wild_henven_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> CANNAAN_PLANT = registerBlockWithoutItem("cannaan_plant",
            () -> new CannaanHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_CANNAAN_PLANT = registerBlockWithoutItem("wild_cannaan_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> DRAGONEYE_PLANT = registerBlockWithoutItem("dragoneye_plant",
            () -> new DragonEyeHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_DRAGONEYE_PLANT = registerBlockWithoutItem("wild_dragoneye_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> SPRINNAN_PLANT = registerBlockWithoutItem("sprinnan_plant",
            () -> new SprinnanHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_SPRINNAN_PLANT = registerBlockWithoutItem("wild_sprinnan_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> VIRENNES_PLANT = registerBlockWithoutItem("virennes_plant",
            () -> new VirennesHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_VIRENNES_PLANT = registerBlockWithoutItem("wild_virennes_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> BRUTEFLOWER_PLANT = registerBlockWithoutItem("bruteflower_plant",
            () -> new BruteFlowerHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_BRUTEFLOWER_PLANT = registerBlockWithoutItem("wild_bruteflower_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> GRANGIN_PLANT = registerBlockWithoutItem("grangin_plant",
            () -> new BruteFlowerHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_GRANGIN_PLANT = registerBlockWithoutItem("wild_grangin_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> CACHEN_PLANT = registerBlockWithoutItem("cachen_plant",
            () -> new BruteFlowerHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_CACHEN_PLANT = registerBlockWithoutItem("wild_cachen_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> FAIRYFLOWER_PLANT = registerBlockWithoutItem("fairyflower_plant",
            () -> new BruteFlowerHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_FAIRYFLOWER_PLANT = registerBlockWithoutItem("wild_fairyflower_plant",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 1, Block.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> LADYRIVER_PLANT = registerBlockWithoutItem("ladyriver_plant",
            () -> new BruteFlowerHerbBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<FlowerBlock> WILD_LADYRIVER_PLANT = registerBlockWithoutItem("wild_ladyriver_plant",
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

    public static final RegistryObject<Block> POTTED_BLUE_DRAGON = registerBlockWithoutItem("potted_blue_dragon",
            () -> new FlowerPotBlock(null, MEBlocks.BLUE_DRAGON, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission()));
    public static final RegistryObject<Block> POTTED_VIOLET_DRAGON = registerBlockWithoutItem("potted_violet_dragon",
            () -> new FlowerPotBlock(null, MEBlocks.VIOLET_DRAGON, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission()));
    public static final RegistryObject<Block> POTTED_PINK_MAGE = registerBlockWithoutItem("potted_pink_mage",
            () -> new FlowerPotBlock(null, MEBlocks.PINK_MAGE, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission()));
    public static final RegistryObject<Block> POTTED_PURPLE_MAGE = registerBlockWithoutItem("potted_purple_mage",
            () -> new FlowerPotBlock(null, MEBlocks.PURPLE_MAGE, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission()));
    public static final RegistryObject<Block> POTTED_FIRE_DAISY = registerBlockWithoutItem("potted_fire_daisy",
            () -> new FlowerPotBlock(null, MEBlocks.FIRE_DAISY, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission()));



    protected static <T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }

    protected static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends PixelPlacer>RegistryObject<T> registerPixelPlacer(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        MEItems.ITEMS.register("pixel_placement/" + name, () -> new PixelPlacerItem(toReturn.get(), new Item.Properties()));
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
