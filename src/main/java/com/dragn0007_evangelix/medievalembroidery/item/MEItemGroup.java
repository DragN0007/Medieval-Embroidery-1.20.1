package com.dragn0007_evangelix.medievalembroidery.item;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.PixelPlacementBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MEItemGroup {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MedievalEmbroidery.MODID);

    public static final RegistryObject<CreativeModeTab> DECOR_GROUP = CREATIVE_MODE_TABS.register("decormodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.decormodtab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(MEBlocks.ASSISTIVE_CRYSTAL_ORE.get());
                        output.accept(MEBlocks.CONJURING_CRYSTAL_ORE.get());
                        output.accept(MEBlocks.DESTRUCTIVE_CRYSTAL_ORE.get());
                        output.accept(MEBlocks.HEALING_CRYSTAL_ORE.get());
                        output.accept(MEBlocks.PROTECTIVE_CRYSTAL_ORE.get());

                        output.accept(MEBlocks.FIRESTONE_ORE.get());
                        output.accept(MEBlocks.FIRESTONE_BLOCK.get());
                        output.accept(MEBlocks.SEASTONE_ORE.get());
                        output.accept(MEBlocks.SEASTONE_BLOCK.get());
                        output.accept(MEBlocks.FROSTSTONE_ORE.get());
                        output.accept(MEBlocks.FROSTSTONE_BLOCK.get());
                        output.accept(MEBlocks.MOSSTONE_ORE.get());
                        output.accept(MEBlocks.MOSSTONE_BLOCK.get());
                        output.accept(MEBlocks.ASTROSTONE_ORE.get());
                        output.accept(MEBlocks.ASTROSTONE_BLOCK.get());
                        output.accept(MEBlocks.DEPTHSTONE_ORE.get());
                        output.accept(MEBlocks.DEPTHSTONE_BLOCK.get());
                        output.accept(MEBlocks.SKYSTONE_ORE.get());
                        output.accept(MEBlocks.SKYSTONE_BLOCK.get());
                        output.accept(MEBlocks.SALT_ORE.get());

                        output.accept(PixelPlacementBlocks.BOOK_CLOSED.get());
                        output.accept(PixelPlacementBlocks.OPEN_BOOK_FLAT.get());
                        output.accept(PixelPlacementBlocks.OPEN_BOOK.get());
                        output.accept(PixelPlacementBlocks.CUP_CLAY.get());
                        output.accept(PixelPlacementBlocks.CUP_METAL.get());
                        output.accept(PixelPlacementBlocks.GOBLET.get());
                        output.accept(PixelPlacementBlocks.TANKARD.get());
                        output.accept(PixelPlacementBlocks.HERB_JAR.get());
                        output.accept(PixelPlacementBlocks.LARGE_POTION_JAR_CYAN.get());
                        output.accept(PixelPlacementBlocks.LARGE_POTION_JAR_GREEN.get());
                        output.accept(PixelPlacementBlocks.LARGE_POTION_JAR_PINK.get());
                        output.accept(PixelPlacementBlocks.LARGE_POTION_JAR_PINK.get());
                        output.accept(PixelPlacementBlocks.LARGE_POTION_JAR_RED.get());
                        output.accept(PixelPlacementBlocks.UTENSIL_METAL.get());
                        output.accept(PixelPlacementBlocks.UTENSIL_WOODEN.get());
                        output.accept(PixelPlacementBlocks.PLATE.get());
                        output.accept(PixelPlacementBlocks.IRON_GROUNDED_SWORD.get());
                        output.accept(PixelPlacementBlocks.GOLDEN_GROUNDED_SWORD.get());
                        output.accept(PixelPlacementBlocks.DIAMOND_GROUNDED_SWORD.get());
                        output.accept(PixelPlacementBlocks.NETHERITE_GROUNDED_SWORD.get());
                        output.accept(PixelPlacementBlocks.OBSIDIAN_GROUNDED_SWORD.get());

                        output.accept(MEBlocks.BEIGE_BRICKS.get());
                        output.accept(MEBlocks.BLACK_BRICKS.get());
                        output.accept(MEBlocks.BLUE_BRICKS.get());
                        output.accept(MEBlocks.BROWN_BRICKS.get());
                        output.accept(MEBlocks.FADED_BRICKS.get());
                        output.accept(MEBlocks.GREEN_BRICKS.get());
                        output.accept(MEBlocks.GREY_BRICKS.get());
                        output.accept(MEBlocks.MAROON_BRICKS.get());
                        output.accept(MEBlocks.NAVY_BRICKS.get());
                        output.accept(MEBlocks.ORANGE_BRICKS.get());
                        output.accept(MEBlocks.PALE_BLUE_BRICKS.get());
                        output.accept(MEBlocks.PINK_BRICKS.get());
                        output.accept(MEBlocks.PURPLE_BRICKS.get());
                        output.accept(MEBlocks.RED_BRICKS.get());
                        output.accept(MEBlocks.SWAMPY_BRICKS.get());
                        output.accept(MEBlocks.WHITE_BRICKS.get());
                        output.accept(MEBlocks.YELLOW_BRICKS.get());
                        output.accept(MEBlocks.BEIGE_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.BLACK_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.BLUE_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.BROWN_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.FADED_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.GREEN_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.GREY_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.MAROON_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.NAVY_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.ORANGE_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.PINK_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.PURPLE_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.RED_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.SWAMPY_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.WHITE_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.YELLOW_BRICKS_MOSSY.get());
                        output.accept(MEBlocks.BEIGE_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.BLACK_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.BLUE_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.BROWN_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.FADED_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.GREEN_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.GREY_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.MAROON_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.NAVY_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.ORANGE_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.PALE_BLUE_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.PINK_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.PURPLE_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.RED_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.SWAMPY_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.WHITE_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.YELLOW_BRICKS_STAIRS.get());
                        output.accept(MEBlocks.BEIGE_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.BLACK_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.BLUE_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.BROWN_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.FADED_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.GREEN_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.GREY_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.MAROON_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.NAVY_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.ORANGE_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.PALE_BLUE_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.PINK_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.PURPLE_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.RED_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.SWAMPY_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.WHITE_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.YELLOW_BRICKS_STAIRS_MOSSY.get());
                        output.accept(MEBlocks.BEIGE_BRICKS_SLAB.get());
                        output.accept(MEBlocks.BLACK_BRICKS_SLAB.get());
                        output.accept(MEBlocks.BLUE_BRICKS_SLAB.get());
                        output.accept(MEBlocks.BROWN_BRICKS_SLAB.get());
                        output.accept(MEBlocks.FADED_BRICKS_SLAB.get());
                        output.accept(MEBlocks.GREEN_BRICKS_SLAB.get());
                        output.accept(MEBlocks.GREY_BRICKS_SLAB.get());
                        output.accept(MEBlocks.MAROON_BRICKS_SLAB.get());
                        output.accept(MEBlocks.NAVY_BRICKS_SLAB.get());
                        output.accept(MEBlocks.ORANGE_BRICKS_SLAB.get());
                        output.accept(MEBlocks.PALE_BLUE_BRICKS_SLAB.get());
                        output.accept(MEBlocks.PINK_BRICKS_SLAB.get());
                        output.accept(MEBlocks.PURPLE_BRICKS_SLAB.get());
                        output.accept(MEBlocks.RED_BRICKS_SLAB.get());
                        output.accept(MEBlocks.SWAMPY_BRICKS_SLAB.get());
                        output.accept(MEBlocks.WHITE_BRICKS_SLAB.get());
                        output.accept(MEBlocks.YELLOW_BRICKS_SLAB.get());
                        output.accept(MEBlocks.BEIGE_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.BLACK_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.BLUE_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.BROWN_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.FADED_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.GREEN_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.GREY_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.MAROON_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.NAVY_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.ORANGE_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.PALE_BLUE_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.PINK_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.PURPLE_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.RED_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.SWAMPY_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.WHITE_BRICKS_SLAB_MOSSY.get());
                        output.accept(MEBlocks.YELLOW_BRICKS_SLAB_MOSSY.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> HERB_GROUP = CREATIVE_MODE_TABS.register("herbmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.herbmodtab"))
                    .displayItems((displayParameters, output) -> {


                    }).build());

    public static final RegistryObject<CreativeModeTab> FOOD_GROUP = CREATIVE_MODE_TABS.register("foodmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEItems.REDCURRANT_SWEET_BREAD_CREAM.get())).title(Component.translatable("itemGroup.foodmodtab"))
                    .displayItems((displayParameters, output) -> {
                        
                        output.accept(MEItems.SALT.get());

                        output.accept(MEItems.SWEET_BREAD.get());
                        output.accept(MEItems.SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.SWEET_BREAD_HONEY.get());
                        output.accept(MEItems.BILBERRY_SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.COWBERRY_SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.ELDERBERRY_SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.HAWTHORN_SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.REDCURRANT_SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.FRUIT_SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.BILBERRY_GLAZE.get());
                        output.accept(MEItems.COWBERRY_GLAZE.get());
                        output.accept(MEItems.ELDERBERRY_GLAZE.get());
                        output.accept(MEItems.HAWTHORN_GLAZE.get());
                        output.accept(MEItems.REDCURRANT_GLAZE.get());
                        output.accept(MEItems.FRUIT_GLAZE.get());
                        output.accept(MEItems.BILBERRY_PIE.get());
                        output.accept(MEItems.COWBERRY_PIE.get());
                        output.accept(MEItems.ELDERBERRY_PIE.get());
                        output.accept(MEItems.HAWTHORN_PIE.get());
                        output.accept(MEItems.REDCURRANT_PIE.get());
                        output.accept(MEItems.MIXEDBERRY_PIE.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> POTION_GROUP = CREATIVE_MODE_TABS.register("potionmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.potionmodtab"))
                    .displayItems((displayParameters, output) -> {


                    }).build());

    public static final RegistryObject<CreativeModeTab> ENTITY_GROUP = CREATIVE_MODE_TABS.register("entitymodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.entitymodtab"))
                    .displayItems((displayParameters, output) -> {


                    }).build());

    public static final RegistryObject<CreativeModeTab> MAGIC_GROUP = CREATIVE_MODE_TABS.register("magicmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEItems.HEALING_CRYSTAL_SHARD.get())).title(Component.translatable("itemGroup.magicmodtab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(MEItems.FIRESTONE.get());
                        output.accept(MEItems.SEASTONE.get());
                        output.accept(MEItems.FROSTSTONE.get());
                        output.accept(MEItems.MOSSTONE.get());
                        output.accept(MEItems.ASTROSTONE.get());
                        output.accept(MEItems.DEPTHSTONE.get());
                        output.accept(MEItems.SKYSTONE.get());
                        output.accept(MEItems.SALT.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> EQUIPMENT_GROUP = CREATIVE_MODE_TABS.register("equipmentmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.equipmentmodtab"))
                    .displayItems((displayParameters, output) -> {


                    }).build());

    public static final RegistryObject<CreativeModeTab> DRAGON_GROUP = CREATIVE_MODE_TABS.register("dragonmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.dragonmodtab"))
                    .displayItems((displayParameters, output) -> {


                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
