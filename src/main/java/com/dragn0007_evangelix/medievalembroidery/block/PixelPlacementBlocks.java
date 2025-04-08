package com.dragn0007_evangelix.medievalembroidery.block;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.*;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacer;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacerContainer;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacerEntity;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacerItem;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
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

public class PixelPlacementBlocks {

    // this is *all* pixel placement blocks -dragoon

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MedievalEmbroidery.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES
            = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MedievalEmbroidery.MODID);

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


    private static <T extends PixelPlacer>RegistryObject<T> registerPixelPlacer(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        MEItems.ITEMS.register(name, () -> new PixelPlacerItem(toReturn.get(), new Item.Properties()));
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        BLOCK_ENTITIES.register(eventBus);
    }
}
