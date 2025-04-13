package com.dragn0007_evangelix.medievalembroidery.item;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.PixelPlacementBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MEItemGroup {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MedievalEmbroidery.MODID);

    //please don't rearrange categories, i have them set up in a specific way (adhd meltdown style) -dragoon

    public static final RegistryObject<CreativeModeTab> DECOR_GROUP = CREATIVE_MODE_TABS.register("decormodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.decormodtab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(MEBlocks.CONJURING_CRYSTAL_BALL.get());

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

    public static final RegistryObject<CreativeModeTab> ENTITY_GROUP = CREATIVE_MODE_TABS.register("entitymodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEItems.DIREWOLF.get())).title(Component.translatable("itemGroup.entitymodtab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(MEItems.DIREWOLF_SPAWN_EGG.get());
                        output.accept(MEItems.FAIRY_SPAWN_EGG.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> HERB_GROUP = CREATIVE_MODE_TABS.register("herbmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.BLEWIT.get())).title(Component.translatable("itemGroup.herbmodtab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(MEItems.LEMON_SEED.get());
                        output.accept(MEItems.APRICOT_PIT.get());
                        output.accept(MEItems.APPLE_SEED.get());

                        output.accept(MEItems.HENVEN.get());
                        output.accept(MEItems.CANNAAN.get());
                        output.accept(MEItems.DRAGONEYE.get());
                        output.accept(MEItems.SPRINNAN.get());
                        output.accept(MEItems.VIRENNES.get());
                        output.accept(MEItems.BRUTEFLOWER.get());
                        output.accept(MEItems.GRANGIN.get());
                        output.accept(MEItems.FAIRYFLOWER.get());
                        output.accept(MEItems.CACHEN.get());
                        output.accept(MEItems.LADYRIVER.get());

                        output.accept(MEBlocks.WILD_BLEWIT.get());
                        output.accept(MEBlocks.WILD_HONEY.get());
                        output.accept(MEBlocks.WILD_KING.get());
                        output.accept(MEBlocks.WILD_OYSTER.get());
                        output.accept(MEBlocks.WILD_MATSUTAKE.get());
                        output.accept(MEBlocks.WILD_PORCINI.get());
                        output.accept(MEBlocks.WILD_YELLOWFOOT.get());
                        output.accept(MEBlocks.WILD_WOODS_CHICKEN.get());

                        output.accept(MEBlocks.BLUE_DRAGON.get());
                        output.accept(MEBlocks.VIOLET_DRAGON.get());
                        output.accept(MEBlocks.PINK_MAGE.get());
                        output.accept(MEBlocks.PURPLE_MAGE.get());
                        output.accept(MEBlocks.FIRE_DAISY.get());
                        output.accept(MEBlocks.GROUND_VINE.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> FOOD_GROUP = CREATIVE_MODE_TABS.register("foodmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEItems.REDCURRANT_SWEET_BREAD_CREAM.get())).title(Component.translatable("itemGroup.foodmodtab"))
                    .displayItems((displayParameters, output) -> {
                        
                        output.accept(MEItems.SALT.get());
                        output.accept(MEItems.FLOUR.get());
                        output.accept(MEItems.SALT_BRINE.get());
                        output.accept(MEItems.MALTED_GRAIN.get());
                        output.accept(MEItems.WATER.get());

                        output.accept(MEItems.PICKLED_EGG.get());
                        output.accept(MEItems.PICKLED_MEAT.get());
                        output.accept(MEItems.PICKLED_MUSHROOMS.get());
                        output.accept(MEItems.PICKLED_VEGGIES.get());
                        output.accept(MEItems.SOUP_JARRED.get());
                        output.accept(MEItems.STEW_JARRED.get());

                        output.accept(MEItems.SWEET_BREAD.get());
                        output.accept(MEItems.SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.SWEET_BREAD_HONEY.get());

                        output.accept(Items.APPLE);
                        output.accept(MEItems.APPLE_CIDER.get());
                        output.accept(MEItems.APPLE_JUICE.get());
                        output.accept(MEItems.APPLE_PIE.get());
                        output.accept(MEItems.APRICOT.get());
                        output.accept(MEItems.APRICOT_TEA.get());
                        output.accept(MEItems.APRICOT_JUICE.get());
                        output.accept(MEItems.APRICOT_PIE.get());
                        output.accept(MEItems.LEMON.get());
                        output.accept(MEItems.LEMON_TEA.get());
                        output.accept(MEItems.LEMON_JUICE.get());
                        output.accept(MEItems.LEMON_PIE.get());

                        output.accept(MEItems.FRUIT_SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.FRUIT_GLAZE.get());

                        output.accept(MEItems.BILBERRY.get());
                        output.accept(MEItems.COWBERRY.get());
                        output.accept(MEItems.ELDERBERRY.get());
                        output.accept(MEItems.HAWTHORNBERRY.get());
                        output.accept(MEItems.REDCURRANT.get());
                        output.accept(MEItems.BILBERRY_GLAZE.get());
                        output.accept(MEItems.COWBERRY_GLAZE.get());
                        output.accept(MEItems.ELDERBERRY_GLAZE.get());
                        output.accept(MEItems.HAWTHORN_GLAZE.get());
                        output.accept(MEItems.REDCURRANT_GLAZE.get());
                        output.accept(MEItems.BILBERRY_SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.COWBERRY_SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.ELDERBERRY_SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.HAWTHORN_SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.REDCURRANT_SWEET_BREAD_CREAM.get());
                        output.accept(MEItems.BILBERRY_PIE.get());
                        output.accept(MEItems.COWBERRY_PIE.get());
                        output.accept(MEItems.ELDERBERRY_PIE.get());
                        output.accept(MEItems.HAWTHORN_PIE.get());
                        output.accept(MEItems.REDCURRANT_PIE.get());
                        output.accept(MEItems.MIXEDBERRY_PIE.get());

                        output.accept(MEItems.ELK.get());
                        output.accept(MEItems.COOKED_ELK.get());
                        output.accept(MEItems.SEASONED_ELK.get());
                        output.accept(MEItems.YAK.get());
                        output.accept(MEItems.COOKED_YAK.get());
                        output.accept(MEItems.SEASONED_YAK.get());
                        output.accept(MEItems.DIREWOLF.get());
                        output.accept(MEItems.COOKED_DIREWOLF.get());
                        output.accept(MEItems.SEASONED_DIREWOLF.get());

                        output.accept(MEItems.ALE.get());
                        output.accept(MEItems.FAIRY_ALE.get());
                        output.accept(MEItems.BILBERRY_MEAD.get());
                        output.accept(MEItems.COWBERRY_MEAD.get());
                        output.accept(MEItems.ELDERBERRY_MEAD.get());
                        output.accept(MEItems.HAWTHORN_MEAD.get());
                        output.accept(MEItems.REDCURRANT_MEAD.get());
                        output.accept(MEItems.HONEY_MEAD.get());
                        output.accept(MEItems.HERBAL_MEAD.get());
                        
                        output.accept(MEItems.BLEWIT.get());
                        output.accept(MEItems.COOKED_BLEWIT.get());
                        output.accept(MEItems.SEASONED_BLEWIT.get());
                        output.accept(MEItems.HONEY.get());
                        output.accept(MEItems.COOKED_HONEY.get());
                        output.accept(MEItems.SEASONED_HONEY.get());
                        output.accept(MEItems.KING.get());
                        output.accept(MEItems.COOKED_KING.get());
                        output.accept(MEItems.SEASONED_KING.get());
                        output.accept(MEItems.OYSTER.get());
                        output.accept(MEItems.COOKED_OYSTER.get());
                        output.accept(MEItems.SEASONED_OYSTER.get());
                        output.accept(MEItems.MATSUTAKE.get());
                        output.accept(MEItems.COOKED_MATSUTAKE.get());
                        output.accept(MEItems.SEASONED_MATSUTAKE.get());
                        output.accept(MEItems.PORCINI.get());
                        output.accept(MEItems.COOKED_PORCINI.get());
                        output.accept(MEItems.SEASONED_PORCINI.get());
                        output.accept(MEItems.YELLOWFOOT.get());
                        output.accept(MEItems.COOKED_YELLOWFOOT.get());
                        output.accept(MEItems.SEASONED_YELLOWFOOT.get());
                        output.accept(MEItems.WOODS_CHICKEN.get());
                        output.accept(MEItems.COOKED_WOODS_CHICKEN.get());
                        output.accept(MEItems.SEASONED_WOODS_CHICKEN.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> MAGIC_GROUP = CREATIVE_MODE_TABS.register("magicmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEItems.HEALING_CRYSTAL_SHARD.get())).title(Component.translatable("itemGroup.magicmodtab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(MEItems.SALT.get());
                        output.accept(MEItems.DIREWOLF_EYE.get());
                        output.accept(MEItems.FAIRY_DUST.get());
                        output.accept(MEItems.OBSIDIAN_SHARD.get());
                        output.accept(MEItems.CRYING_OBSIDIAN_SHARD.get());
                        output.accept(MEItems.FIRESTONE.get());
                        output.accept(MEItems.SEASTONE.get());
                        output.accept(MEItems.FROSTSTONE.get());
                        output.accept(MEItems.MOSSTONE.get());
                        output.accept(MEItems.ASTROSTONE.get());
                        output.accept(MEItems.DEPTHSTONE.get());
                        output.accept(MEItems.SKYSTONE.get());
                        output.accept(MEItems.ASSISTIVE_CRYSTAL_SHARD.get());
                        output.accept(MEItems.CONJURING_CRYSTAL_SHARD.get());
                        output.accept(MEItems.DESTRUCTIVE_CRYSTAL_SHARD.get());
                        output.accept(MEItems.HEALING_CRYSTAL_SHARD.get());
                        output.accept(MEItems.PROTECTIVE_CRYSTAL_SHARD.get());

                    }).build());

//    public static final RegistryObject<CreativeModeTab> POTION_GROUP = CREATIVE_MODE_TABS.register("potionmodtab",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.potionmodtab"))
//                    .displayItems((displayParameters, output) -> {
//
//
//                    }).build());
//
//    public static final RegistryObject<CreativeModeTab> DRAGON_GROUP = CREATIVE_MODE_TABS.register("dragonmodtab",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.dragonmodtab"))
//                    .displayItems((displayParameters, output) -> {
//
//
//                    }).build());
//
    public static final RegistryObject<CreativeModeTab> EQUIPMENT_GROUP = CREATIVE_MODE_TABS.register("equipmentmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PixelPlacementBlocks.IRON_GROUNDED_SWORD.get())).title(Component.translatable("itemGroup.equipmentmodtab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(MEItems.OBSIDIAN_SWORD.get());
                        output.accept(MEItems.OBSIDIAN_PICKAXE.get());
                        output.accept(MEItems.OBSIDIAN_SHOVEL.get());
                        output.accept(MEItems.OBSIDIAN_AXE.get());
                        output.accept(MEItems.OBSIDIAN_HOE.get());
                        output.accept(MEItems.OBSIDIAN_DAGGER.get());
                        output.accept(MEItems.OBSIDIAN_GREATSWORD.get());
                        output.accept(MEItems.OBSIDIAN_BATTLEAXE.get());
                        output.accept(MEItems.OBSIDIAN_WARHAMMER.get());

                        output.accept(MEItems.EMERALD_SWORD.get());
                        output.accept(MEItems.EMERALD_PICKAXE.get());
                        output.accept(MEItems.EMERALD_SHOVEL.get());
                        output.accept(MEItems.EMERALD_AXE.get());
                        output.accept(MEItems.EMERALD_HOE.get());
                        output.accept(MEItems.EMERALD_DAGGER.get());
                        output.accept(MEItems.EMERALD_GREATSWORD.get());
                        output.accept(MEItems.EMERALD_BATTLEAXE.get());
                        output.accept(MEItems.EMERALD_WARHAMMER.get());

                        output.accept(MEItems.ASTROSTONE_SWORD.get());
                        output.accept(MEItems.ASTROSTONE_PICKAXE.get());
                        output.accept(MEItems.ASTROSTONE_SHOVEL.get());
                        output.accept(MEItems.ASTROSTONE_AXE.get());
                        output.accept(MEItems.ASTROSTONE_HOE.get());
                        output.accept(MEItems.ASTROSTONE_DAGGER.get());
                        output.accept(MEItems.ASTROSTONE_GREATSWORD.get());
                        output.accept(MEItems.ASTROSTONE_BATTLEAXE.get());
                        output.accept(MEItems.ASTROSTONE_WARHAMMER.get());

                        output.accept(MEItems.DEPTHSTONE_SWORD.get());
                        output.accept(MEItems.DEPTHSTONE_PICKAXE.get());
                        output.accept(MEItems.DEPTHSTONE_SHOVEL.get());
                        output.accept(MEItems.DEPTHSTONE_AXE.get());
                        output.accept(MEItems.DEPTHSTONE_HOE.get());
                        output.accept(MEItems.DEPTHSTONE_DAGGER.get());
                        output.accept(MEItems.DEPTHSTONE_GREATSWORD.get());
                        output.accept(MEItems.DEPTHSTONE_BATTLEAXE.get());
                        output.accept(MEItems.DEPTHSTONE_WARHAMMER.get());

                        output.accept(MEItems.FIRESTONE_SWORD.get());
                        output.accept(MEItems.FIRESTONE_PICKAXE.get());
                        output.accept(MEItems.FIRESTONE_SHOVEL.get());
                        output.accept(MEItems.FIRESTONE_AXE.get());
                        output.accept(MEItems.FIRESTONE_HOE.get());
                        output.accept(MEItems.FIRESTONE_DAGGER.get());
                        output.accept(MEItems.FIRESTONE_GREATSWORD.get());
                        output.accept(MEItems.FIRESTONE_BATTLEAXE.get());
                        output.accept(MEItems.FIRESTONE_WARHAMMER.get());

                        output.accept(MEItems.FROSTSTONE_SWORD.get());
                        output.accept(MEItems.FROSTSTONE_PICKAXE.get());
                        output.accept(MEItems.FROSTSTONE_SHOVEL.get());
                        output.accept(MEItems.FROSTSTONE_AXE.get());
                        output.accept(MEItems.FROSTSTONE_HOE.get());
                        output.accept(MEItems.FROSTSTONE_DAGGER.get());
                        output.accept(MEItems.FROSTSTONE_GREATSWORD.get());
                        output.accept(MEItems.FROSTSTONE_BATTLEAXE.get());
                        output.accept(MEItems.FROSTSTONE_WARHAMMER.get());

                        output.accept(MEItems.MOSSTONE_SWORD.get());
                        output.accept(MEItems.MOSSTONE_PICKAXE.get());
                        output.accept(MEItems.MOSSTONE_SHOVEL.get());
                        output.accept(MEItems.MOSSTONE_AXE.get());
                        output.accept(MEItems.MOSSTONE_HOE.get());
                        output.accept(MEItems.MOSSTONE_DAGGER.get());
                        output.accept(MEItems.MOSSTONE_GREATSWORD.get());
                        output.accept(MEItems.MOSSTONE_BATTLEAXE.get());
                        output.accept(MEItems.MOSSTONE_WARHAMMER.get());

                        output.accept(MEItems.SEASTONE_SWORD.get());
                        output.accept(MEItems.SEASTONE_PICKAXE.get());
                        output.accept(MEItems.SEASTONE_SHOVEL.get());
                        output.accept(MEItems.SEASTONE_AXE.get());
                        output.accept(MEItems.SEASTONE_HOE.get());
                        output.accept(MEItems.SEASTONE_DAGGER.get());
                        output.accept(MEItems.SEASTONE_GREATSWORD.get());
                        output.accept(MEItems.SEASTONE_BATTLEAXE.get());
                        output.accept(MEItems.SEASTONE_WARHAMMER.get());

                        output.accept(MEItems.SKYSTONE_SWORD.get());
                        output.accept(MEItems.SKYSTONE_PICKAXE.get());
                        output.accept(MEItems.SKYSTONE_SHOVEL.get());
                        output.accept(MEItems.SKYSTONE_AXE.get());
                        output.accept(MEItems.SKYSTONE_HOE.get());
                        output.accept(MEItems.SKYSTONE_DAGGER.get());
                        output.accept(MEItems.SKYSTONE_GREATSWORD.get());
                        output.accept(MEItems.SKYSTONE_BATTLEAXE.get());
                        output.accept(MEItems.SKYSTONE_WARHAMMER.get());

                        output.accept(MEItems.ASTROSTONE_HELMET.get());
                        output.accept(MEItems.ASTROSTONE_CHESTPLATE.get());
                        output.accept(MEItems.ASTROSTONE_LEGGING.get());
                        output.accept(MEItems.ASTROSTONE_BOOTS.get());
                        output.accept(MEItems.DEPTHSTONE_HELMET.get());
                        output.accept(MEItems.DEPTHSTONE_CHESTPLATE.get());
                        output.accept(MEItems.DEPTHSTONE_LEGGING.get());
                        output.accept(MEItems.DEPTHSTONE_BOOTS.get());
                        output.accept(MEItems.FIRESTONE_HELMET.get());
                        output.accept(MEItems.FIRESTONE_CHESTPLATE.get());
                        output.accept(MEItems.FIRESTONE_LEGGING.get());
                        output.accept(MEItems.FIRESTONE_BOOTS.get());
                        output.accept(MEItems.FROSTSTONE_HELMET.get());
                        output.accept(MEItems.FROSTSTONE_CHESTPLATE.get());
                        output.accept(MEItems.FROSTSTONE_LEGGING.get());
                        output.accept(MEItems.FROSTSTONE_BOOTS.get());
                        output.accept(MEItems.MOSSTONE_HELMET.get());
                        output.accept(MEItems.MOSSTONE_CHESTPLATE.get());
                        output.accept(MEItems.MOSSTONE_LEGGING.get());
                        output.accept(MEItems.MOSSTONE_BOOTS.get());
                        output.accept(MEItems.SEASTONE_HELMET.get());
                        output.accept(MEItems.SEASTONE_CHESTPLATE.get());
                        output.accept(MEItems.SEASTONE_LEGGING.get());
                        output.accept(MEItems.SEASTONE_BOOTS.get());
                        output.accept(MEItems.SKYSTONE_HELMET.get());
                        output.accept(MEItems.SKYSTONE_CHESTPLATE.get());
                        output.accept(MEItems.SKYSTONE_LEGGING.get());
                        output.accept(MEItems.SKYSTONE_BOOTS.get());

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
