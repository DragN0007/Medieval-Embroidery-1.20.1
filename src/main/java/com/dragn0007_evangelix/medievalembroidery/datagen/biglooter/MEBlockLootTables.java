package com.dragn0007_evangelix.medievalembroidery.datagen.biglooter;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocksDataGen;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class MEBlockLootTables extends BlockLootSubProvider {

    public MEBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {

        this.dropSelf(MEBlocksDataGen.MED_TAVERNTABLE.get());
        this.dropSelf(MEBlocksDataGen.SML_TAVERNTABLE.get());
        this.dropSelf(MEBlocksDataGen.FAIRY_BODY.get());

        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_PANE_1.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_PANE_2.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_PANE_3.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_PANE_4.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_PANE_5.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_PANE_6.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_PANE_7.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_PANE_8.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_PANE_9.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_PANE_10.get());

        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_1.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_2.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_3.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_4.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_5.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_6.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_7.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_8.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_9.get());
        this.dropSelf(MEBlocksDataGen.FRAMED_GLASS_10.get());

        this.dropSelf(MEBlocksDataGen.BEIGE_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.BLACK_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.BLUE_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.BROWN_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.FADED_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.GREEN_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.GREY_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.MAROON_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.NAVY_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.ORANGE_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.PALE_BLUE_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.PINK_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.PURPLE_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.RED_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.SWAMPY_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.WHITE_BRICKS.get());
        this.dropSelf(MEBlocksDataGen.YELLOW_BRICKS.get());

        this.dropSelf(MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.BLACK_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.BLUE_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.BROWN_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.FADED_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.GREEN_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.GREY_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.MAROON_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.NAVY_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.PINK_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.RED_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.WHITE_BRICKS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get());

        this.dropSelf(MEBlocksDataGen.BEIGE_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.BLACK_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.BLUE_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.BROWN_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.FADED_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.GREEN_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.GREY_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.MAROON_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.NAVY_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.ORANGE_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.PALE_BLUE_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.PINK_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.PURPLE_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.RED_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.SWAMPY_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.WHITE_BRICKS_STAIRS.get());
        this.dropSelf(MEBlocksDataGen.YELLOW_BRICKS_STAIRS.get());

        this.dropSelf(MEBlocksDataGen.BEIGE_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.BLACK_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.BLUE_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.BROWN_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.FADED_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.GREEN_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.GREY_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.MAROON_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.NAVY_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.ORANGE_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.PALE_BLUE_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.PINK_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.PURPLE_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.RED_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.SWAMPY_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.WHITE_BRICKS_STAIRS_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.YELLOW_BRICKS_STAIRS_MOSSY.get());

        this.dropSelf(MEBlocksDataGen.BEIGE_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.BLACK_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.BLUE_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.BROWN_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.FADED_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.GREEN_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.GREY_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.MAROON_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.NAVY_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.ORANGE_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.PALE_BLUE_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.PINK_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.PURPLE_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.RED_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.SWAMPY_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.WHITE_BRICKS_SLAB.get());
        this.dropSelf(MEBlocksDataGen.YELLOW_BRICKS_SLAB.get());

        this.dropSelf(MEBlocksDataGen.BEIGE_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.BLACK_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.BLUE_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.BROWN_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.FADED_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.GREEN_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.GREY_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.MAROON_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.NAVY_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.ORANGE_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.PALE_BLUE_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.PINK_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.PURPLE_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.RED_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.SWAMPY_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.WHITE_BRICKS_SLAB_MOSSY.get());
        this.dropSelf(MEBlocksDataGen.YELLOW_BRICKS_SLAB_MOSSY.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MEBlocksDataGen.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
