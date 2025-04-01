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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
