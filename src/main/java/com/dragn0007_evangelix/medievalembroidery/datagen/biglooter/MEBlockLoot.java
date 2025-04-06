package com.dragn0007_evangelix.medievalembroidery.datagen.biglooter;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.PixelPlacementBlocks;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class MEBlockLoot extends BlockLootSubProvider {

    public MEBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        add(MEBlocks.FIRESTONE_ORE.get(), block -> createOreDrop(MEBlocks.FIRESTONE_ORE.get(), MEItems.FIRESTONE.get()));
        dropSelf(MEBlocks.FIRESTONE_BLOCK.get());
        add(MEBlocks.SEASTONE_ORE.get(), block -> createOreDrop(MEBlocks.SEASTONE_ORE.get(), MEItems.SEASTONE.get()));
        dropSelf(MEBlocks.SEASTONE_BLOCK.get());
        add(MEBlocks.FROSTSTONE_ORE.get(), block -> createOreDrop(MEBlocks.FROSTSTONE_ORE.get(), MEItems.FROSTSTONE.get()));
        dropSelf(MEBlocks.FROSTSTONE_BLOCK.get());
        add(MEBlocks.MOSSTONE_ORE.get(), block -> createOreDrop(MEBlocks.MOSSTONE_ORE.get(), MEItems.MOSSTONE.get()));
        dropSelf(MEBlocks.MOSSTONE_BLOCK.get());
        add(MEBlocks.ASTROSTONE_ORE.get(), block -> createOreDrop(MEBlocks.ASTROSTONE_ORE.get(), MEItems.ASTROSTONE.get()));
        dropSelf(MEBlocks.ASTROSTONE_BLOCK.get());
        add(MEBlocks.DEPTHSTONE_ORE.get(), block -> createOreDrop(MEBlocks.DEPTHSTONE_ORE.get(), MEItems.DEPTHSTONE.get()));
        dropSelf(MEBlocks.DEPTHSTONE_BLOCK.get());
        add(MEBlocks.SKYSTONE_ORE.get(), block -> createOreDrop(MEBlocks.SKYSTONE_ORE.get(), MEItems.SKYSTONE.get()));
        dropSelf(MEBlocks.SKYSTONE_BLOCK.get());
        add(MEBlocks.SALT_ORE.get(), block -> createOreDrop(MEBlocks.SALT_ORE.get(), MEItems.SALT.get()));

        add(MEBlocks.ASSISTIVE_CRYSTAL_ORE.get(), block -> createOreDrop(MEBlocks.ASSISTIVE_CRYSTAL_ORE.get(), MEItems.ASSISTIVE_CRYSTAL_SHARD.get()));
        add(MEBlocks.CONJURING_CRYSTAL_ORE.get(), block -> createOreDrop(MEBlocks.CONJURING_CRYSTAL_ORE.get(), MEItems.CONJURING_CRYSTAL_SHARD.get()));
        add(MEBlocks.DESTRUCTIVE_CRYSTAL_ORE.get(), block -> createOreDrop(MEBlocks.DESTRUCTIVE_CRYSTAL_ORE.get(), MEItems.DESTRUCTIVE_CRYSTAL_SHARD.get()));
        add(MEBlocks.HEALING_CRYSTAL_ORE.get(), block -> createOreDrop(MEBlocks.HEALING_CRYSTAL_ORE.get(), MEItems.HEALING_CRYSTAL_SHARD.get()));
        add(MEBlocks.PROTECTIVE_CRYSTAL_ORE.get(), block -> createOreDrop(MEBlocks.PROTECTIVE_CRYSTAL_ORE.get(), MEItems.PROTECTIVE_CRYSTAL_SHARD.get()));

        dropOther(MEBlocks.SWEET_BREAD.get(), MEItems.SWEET_BREAD.get());
        dropOther(MEBlocks.SWEET_BREAD_CREAM.get(), MEItems.SWEET_BREAD_CREAM.get());
        dropOther(MEBlocks.SWEET_BREAD_HONEY.get(), MEItems.SWEET_BREAD_HONEY.get());
        dropOther(MEBlocks.SWEET_BREAD_REDCURRANT.get(), MEItems.REDCURRANT_SWEET_BREAD_CREAM.get());
        dropOther(MEBlocks.SWEET_BREAD_BILBERRY.get(), MEItems.BILBERRY_SWEET_BREAD_CREAM.get());
        dropOther(MEBlocks.SWEET_BREAD_COWBERRY.get(), MEItems.COWBERRY_SWEET_BREAD_CREAM.get());
        dropOther(MEBlocks.SWEET_BREAD_HAWTHORN.get(), MEItems.HAWTHORN_SWEET_BREAD_CREAM.get());
        dropOther(MEBlocks.SWEET_BREAD_ELDERBERRY.get(), MEItems.ELDERBERRY_SWEET_BREAD_CREAM.get());
        dropOther(MEBlocks.SWEET_BREAD_FRUIT.get(), MEItems.FRUIT_SWEET_BREAD_CREAM.get());

        dropSelf(MEBlocks.BEIGE_BRICKS.get());
        dropSelf(MEBlocks.BLACK_BRICKS.get());
        dropSelf(MEBlocks.BLUE_BRICKS.get());
        dropSelf(MEBlocks.BROWN_BRICKS.get());
        dropSelf(MEBlocks.FADED_BRICKS.get());
        dropSelf(MEBlocks.GREEN_BRICKS.get());
        dropSelf(MEBlocks.GREY_BRICKS.get());
        dropSelf(MEBlocks.MAROON_BRICKS.get());
        dropSelf(MEBlocks.NAVY_BRICKS.get());
        dropSelf(MEBlocks.ORANGE_BRICKS.get());
        dropSelf(MEBlocks.PALE_BLUE_BRICKS.get());
        dropSelf(MEBlocks.PINK_BRICKS.get());
        dropSelf(MEBlocks.PURPLE_BRICKS.get());
        dropSelf(MEBlocks.RED_BRICKS.get());
        dropSelf(MEBlocks.SWAMPY_BRICKS.get());
        dropSelf(MEBlocks.WHITE_BRICKS.get());
        dropSelf(MEBlocks.YELLOW_BRICKS.get());
        dropSelf(MEBlocks.BEIGE_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.BLACK_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.BLUE_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.BROWN_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.FADED_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.GREEN_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.GREY_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.MAROON_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.NAVY_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.ORANGE_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.PINK_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.PURPLE_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.RED_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.SWAMPY_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.WHITE_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.YELLOW_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.BEIGE_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.BLACK_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.BLUE_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.BROWN_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.FADED_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.GREEN_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.GREY_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.MAROON_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.NAVY_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.ORANGE_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.PALE_BLUE_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.PINK_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.PURPLE_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.RED_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.SWAMPY_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.WHITE_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.YELLOW_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.BEIGE_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.BLACK_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.BLUE_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.BROWN_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.FADED_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.GREEN_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.GREY_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.MAROON_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.NAVY_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.ORANGE_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.PALE_BLUE_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.PINK_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.PURPLE_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.RED_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.SWAMPY_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.WHITE_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.YELLOW_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.BEIGE_BRICKS_SLAB.get());
        dropSelf(MEBlocks.BLACK_BRICKS_SLAB.get());
        dropSelf(MEBlocks.BLUE_BRICKS_SLAB.get());
        dropSelf(MEBlocks.BROWN_BRICKS_SLAB.get());
        dropSelf(MEBlocks.FADED_BRICKS_SLAB.get());
        dropSelf(MEBlocks.GREEN_BRICKS_SLAB.get());
        dropSelf(MEBlocks.GREY_BRICKS_SLAB.get());
        dropSelf(MEBlocks.MAROON_BRICKS_SLAB.get());
        dropSelf(MEBlocks.NAVY_BRICKS_SLAB.get());
        dropSelf(MEBlocks.ORANGE_BRICKS_SLAB.get());
        dropSelf(MEBlocks.PALE_BLUE_BRICKS_SLAB.get());
        dropSelf(MEBlocks.PINK_BRICKS_SLAB.get());
        dropSelf(MEBlocks.PURPLE_BRICKS_SLAB.get());
        dropSelf(MEBlocks.RED_BRICKS_SLAB.get());
        dropSelf(MEBlocks.SWAMPY_BRICKS_SLAB.get());
        dropSelf(MEBlocks.WHITE_BRICKS_SLAB.get());
        dropSelf(MEBlocks.YELLOW_BRICKS_SLAB.get());
        dropSelf(MEBlocks.BEIGE_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.BLACK_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.BLUE_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.BROWN_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.FADED_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.GREEN_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.GREY_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.MAROON_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.NAVY_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.ORANGE_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.PALE_BLUE_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.PINK_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.PURPLE_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.RED_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.SWAMPY_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.WHITE_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.YELLOW_BRICKS_SLAB_MOSSY.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MEBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
