package com.dragn0007_evangelix.medievalembroidery.datagen.biglooter;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.custom.placedfood.PlatedFood;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class MEBlockLootTables extends BlockLootSubProvider {

    public MEBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        createOreDrop(MEBlocks.FIRESTONE_ORE.get(), MEItems.FIRESTONE.get());
        dropSelf(MEBlocks.FIRESTONE_BLOCK.get());
        createOreDrop(MEBlocks.SEASTONE_ORE.get(), MEItems.SEASTONE.get());
        dropSelf(MEBlocks.SEASTONE_BLOCK.get());
        createOreDrop(MEBlocks.FROSTSTONE_ORE.get(), MEItems.FROSTSTONE.get());
        dropSelf(MEBlocks.FROSTSTONE_BLOCK.get());
        createOreDrop(MEBlocks.MOSSTONE_ORE.get(), MEItems.MOSSTONE.get());
        dropSelf(MEBlocks.MOSSTONE_BLOCK.get());
        createOreDrop(MEBlocks.ASTROSTONE_ORE.get(), MEItems.ASTROSTONE.get());
        dropSelf(MEBlocks.ASTROSTONE_BLOCK.get());
        createOreDrop(MEBlocks.DEPTHSTONE_ORE.get(), MEItems.DEPTHSTONE.get());
        dropSelf(MEBlocks.DEPTHSTONE_BLOCK.get());
        createOreDrop(MEBlocks.SKYSTONE_ORE.get(), MEItems.SKYSTONE.get());
        dropSelf(MEBlocks.SKYSTONE_BLOCK.get());
        createOreDrop(MEBlocks.SALT_ORE.get(), MEItems.SALT.get());

        createOreDrop(MEBlocks.ASSISTIVE_CRYSTAL_ORE.get(), MEItems.ASSISTIVE_CRYSTAL_SHARD.get());
        createOreDrop(MEBlocks.CONJURING_CRYSTAL_ORE.get(), MEItems.CONJURING_CRYSTAL_SHARD.get());
        createOreDrop(MEBlocks.DESTRUCTIVE_CRYSTAL_ORE.get(), MEItems.DESTRUCTIVE_CRYSTAL_SHARD.get());
        createOreDrop(MEBlocks.HEALING_CRYSTAL_ORE.get(), MEItems.HEALING_CRYSTAL_SHARD.get());
        createOreDrop(MEBlocks.PROTECTIVE_CRYSTAL_ORE.get(), MEItems.PROTECTIVE_CRYSTAL_SHARD.get());

        dropOther(MEBlocks.SWEET_BREAD.get(), MEItems.SWEET_BREAD.get());
        dropOther(MEBlocks.SWEET_BREAD_CREAM.get(), MEItems.SWEET_BREAD_CREAM.get());
        dropOther(MEBlocks.SWEET_BREAD_HONEY.get(), MEItems.SWEET_BREAD_HONEY.get());
        dropOther(MEBlocks.SWEET_BREAD_REDCURRANT.get(), MEItems.REDCURRANT_SWEET_BREAD.get());
        dropOther(MEBlocks.SWEET_BREAD_BILBERRY.get(), MEItems.BILBERRY_SWEET_BREAD.get());
        dropOther(MEBlocks.SWEET_BREAD_COWBERRY.get(), MEItems.COWBERRY_SWEET_BREAD.get());
        dropOther(MEBlocks.SWEET_BREAD_HAWTHORN.get(), MEItems.HAWTHORNBERRY_SWEET_BREAD.get());
        dropOther(MEBlocks.SWEET_BREAD_ELDERBERRY.get(), MEItems.ELDERBERRY_SWEET_BREAD.get());
        dropOther(MEBlocks.SWEET_BREAD_FRUIT.get(), MEItems.FRUIT_SWEET_BREAD.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MEBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
