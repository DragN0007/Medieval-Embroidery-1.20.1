package com.dragn0007_evangelix.medievalembroidery.item;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.util.METags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class METoolTiers {

    public static final Tier OBSIDIAN = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2500, 10.0F, 5.0F, 15,
                    METags.Blocks.NEEDS_OBSIDIAN_TOOL, () -> Ingredient.of(MEItems.OBSIDIAN_SHARD.get())),
            new ResourceLocation(MedievalEmbroidery.MODID, "obsidian"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1200, 7.5F, 2.5F, 10,
                    METags.Blocks.NEEDS_EMERALD_TOOL, () -> Ingredient.of(Items.EMERALD)),
            new ResourceLocation(MedievalEmbroidery.MODID, "emerald"), List.of(Tiers.DIAMOND), List.of());


    public static final Tier ASTROSTONE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 600, 7.0F, 2.5F, 10,
                    METags.Blocks.NEEDS_GEMSTONE_TOOL, () -> Ingredient.of(MEItems.ASTROSTONE.get())),
            new ResourceLocation(MedievalEmbroidery.MODID, "astrostone"), List.of(Tiers.IRON), List.of());

    public static final Tier DEPTHSTONE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 600, 7.0F, 2.5F, 10,
                    METags.Blocks.NEEDS_GEMSTONE_TOOL, () -> Ingredient.of(MEItems.DEPTHSTONE.get())),
            new ResourceLocation(MedievalEmbroidery.MODID, "depthstone"), List.of(Tiers.IRON), List.of());

    public static final Tier FIRESTONE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 600, 7.0F, 2.5F, 10,
                    METags.Blocks.NEEDS_GEMSTONE_TOOL, () -> Ingredient.of(MEItems.FIRESTONE.get())),
            new ResourceLocation(MedievalEmbroidery.MODID, "firestone"), List.of(Tiers.IRON), List.of());

    public static final Tier FROSTSTONE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 600, 7.0F, 2.5F, 10,
                    METags.Blocks.NEEDS_GEMSTONE_TOOL, () -> Ingredient.of(MEItems.FROSTSTONE.get())),
            new ResourceLocation(MedievalEmbroidery.MODID, "froststone"), List.of(Tiers.IRON), List.of());

    public static final Tier MOSSTONE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 600, 7.0F, 2.5F, 10,
                    METags.Blocks.NEEDS_GEMSTONE_TOOL, () -> Ingredient.of(MEItems.MOSSTONE.get())),
            new ResourceLocation(MedievalEmbroidery.MODID, "mosstone"), List.of(Tiers.IRON), List.of());

    public static final Tier SEASTONE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 600, 7.0F, 2.5F, 10,
                    METags.Blocks.NEEDS_GEMSTONE_TOOL, () -> Ingredient.of(MEItems.SEASTONE.get())),
            new ResourceLocation(MedievalEmbroidery.MODID, "seastone"), List.of(Tiers.IRON), List.of());

    public static final Tier SKYSTONE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 600, 7.0F, 2.5F, 10,
                    METags.Blocks.NEEDS_GEMSTONE_TOOL, () -> Ingredient.of(MEItems.SKYSTONE.get())),
            new ResourceLocation(MedievalEmbroidery.MODID, "skystone"), List.of(Tiers.IRON), List.of());

}