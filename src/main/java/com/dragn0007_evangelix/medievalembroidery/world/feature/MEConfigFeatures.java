package com.dragn0007_evangelix.medievalembroidery.world.feature;


import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.util.config.MedievalEmbroideryCommonConfig;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class MEConfigFeatures {


    //TREE
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> APPLE = FeatureUtils.register("apple",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.OAK_LOG),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(MEBlocks.APPLE_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> APPLE_CHECKED =
            PlacementUtils.register("apple_checked",
                    APPLE, PlacementUtils.filteredByBlockSurvival(MEBlocks.APPLE_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> APPLE_SPAWN =
            FeatureUtils.register("apple_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(APPLE_CHECKED, 0.2222223F)), APPLE_CHECKED));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> APRICOT = FeatureUtils.register("apricot",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.DARK_OAK_LOG),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(MEBlocks.APRICOT_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> APRICOT_CHECKED =
            PlacementUtils.register("apricot_checked",
                    APRICOT, PlacementUtils.filteredByBlockSurvival(MEBlocks.APRICOT_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> APRICOT_SPAWN =
            FeatureUtils.register("apricot_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(APRICOT_CHECKED, 0.33333334F)), APRICOT_CHECKED));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> LEMON = FeatureUtils.register("lemon",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.OAK_LOG),
            new StraightTrunkPlacer(2, 0, 2),
            BlockStateProvider.simple(MEBlocks.LEMON_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> LEMON_CHECKED =
            PlacementUtils.register("lemon_checked",
                    LEMON, PlacementUtils.filteredByBlockSurvival(MEBlocks.LEMON_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> LEMON_SPAWN =
            FeatureUtils.register("lemon_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(LEMON_CHECKED, 0.33333334F)), LEMON_CHECKED));



    //ORES
    public static final List<OreConfiguration.TargetBlockState> HEALING_CRYSTAL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MEBlocks.HEALING_CRYSTAL_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> PROTECTIVE_CRYSTAL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MEBlocks.PROTECTIVE_CRYSTAL_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> DESTRUCTIVE_CRYSTAL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MEBlocks.DESTRUCTIVE_CRYSTAL_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> CONJURING_CRYSTAL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MEBlocks.CONJURING_CRYSTAL_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> ASSISTIVE_CRYSTAL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MEBlocks.ASSISTIVE_CRYSTAL_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> ASTROSTONE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MEBlocks.ASTROSTONE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> DEPTHSTONE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MEBlocks.DEPTHSTONE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> FIRESTONE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MEBlocks.FIRESTONE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> FROSTSONE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MEBlocks.FROSTSTONE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> MOSSTONE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MEBlocks.MOSSTONE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> SEASTONE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MEBlocks.SEASTONE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> SKYSTONE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MEBlocks.SKYSTONE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> SALT = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MEBlocks.SALT_ORE.get().defaultBlockState()));


    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> HEALING_CRYSTAL_ORE = FeatureUtils.register("healing_crystal_ore",
            Feature.ORE, new OreConfiguration(HEALING_CRYSTAL, 3));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PROTECTIVE_CRYSTAL_ORE = FeatureUtils.register("protective_crystal_ore",
            Feature.ORE, new OreConfiguration(PROTECTIVE_CRYSTAL, 3));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DESTRUCTIVE_CRYSTAL_ORE = FeatureUtils.register("destructive_crystal_ore",
            Feature.ORE, new OreConfiguration(DESTRUCTIVE_CRYSTAL, 3));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CONJURING_CRYSTAL_ORE = FeatureUtils.register("conjuring_crystal_ore",
            Feature.ORE, new OreConfiguration(CONJURING_CRYSTAL, 3));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ASSISTIVE_CRYSTAL_ORE = FeatureUtils.register("assistive_crystal_ore",
            Feature.ORE, new OreConfiguration(ASSISTIVE_CRYSTAL, 3));


    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ASTROSTONE_ORE = FeatureUtils.register("astrostone_ore",
            Feature.ORE, new OreConfiguration(ASTROSTONE, 5));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEPTHSTONE_ORE = FeatureUtils.register("depthstone_ore",
            Feature.ORE, new OreConfiguration(DEPTHSTONE, 5));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FIRESTONE_ORE = FeatureUtils.register("firestone_ore",
            Feature.ORE, new OreConfiguration(FIRESTONE, 5));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FROSTSTONE_ORE = FeatureUtils.register("froststone_ore",
            Feature.ORE, new OreConfiguration(FROSTSONE, 5));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MOSSTONE_ORE = FeatureUtils.register("mosstone_ore",
            Feature.ORE, new OreConfiguration(MOSSTONE, 5));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SEASTONE_ORE = FeatureUtils.register("seastone_ore",
            Feature.ORE, new OreConfiguration(SEASTONE, 5));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SKYSTONE_ORE = FeatureUtils.register("skystone_ore",
            Feature.ORE, new OreConfiguration(SKYSTONE, 5));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SALT_ORE = FeatureUtils.register("salt_ore",
            Feature.ORE, new OreConfiguration(SALT, 8));

    //PLANTS
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> VIOLET_DRAGON =
            FeatureUtils.register("violet_dragon", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.PLANTTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.VIOLET_DRAGON.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> BLUE_DRAGON =
            FeatureUtils.register("blue_dragon", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.PLANTTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.BLUE_DRAGON.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PINK_MAGE =
            FeatureUtils.register("pink_mage", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.PLANTTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.PINK_MAGE.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PURPLE_MAGE =
            FeatureUtils.register("purple_mage", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.PLANTTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.PURPLE_MAGE.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FIRE_DAISY =
            FeatureUtils.register("fire_daisy", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.PLANTTRIES.get(), 3, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.FIRE_DAISY.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> GROUND_VINE =
            FeatureUtils.register("ground_vine", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.PLANTTRIES.get(), 3, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.GROUND_VINE.get())))));

    //BUSHES
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> ELDERBERRY =
            FeatureUtils.register("elderberry", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.BUSHTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.ELDERBERRY_BUSH_CROP.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> COWBERRY =
            FeatureUtils.register("cowberry", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.BUSHTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.COWBERRY_BUSH_CROP.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> BILBERRY =
            FeatureUtils.register("bilberry", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.BUSHTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.BILBERRY_BUSH_CROP.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HAWTHORN =
            FeatureUtils.register("hawthorn", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.BUSHTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.HAWTHORN_BUSH_CROP.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> REDCURRANT =
            FeatureUtils.register("redcurrant", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.BUSHTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.REDCURRANT_BUSH_CROP.get())))));

    //FUNGI
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> BLEWIT =
            FeatureUtils.register("blewit", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.MUSHROOMTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.BLEWIT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HONEY =
            FeatureUtils.register("honey", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.MUSHROOMTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.HONEY.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> KING =
            FeatureUtils.register("king", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.MUSHROOMTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.KING.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> MATSUTAKE =
            FeatureUtils.register("matsutake", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.MUSHROOMTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.MATSUTAKE.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> OYSTER =
            FeatureUtils.register("oyster", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.MUSHROOMTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.OYSTER.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PORCINI =
            FeatureUtils.register("porcini", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.MUSHROOMTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.PORCINI.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> WOODSCHICKEN =
            FeatureUtils.register("woodschicken", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.MUSHROOMTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WOODSCHICKEN.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> YELLOWFOOT =
            FeatureUtils.register("yellowfoot", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.MUSHROOMTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.YELLOWFOOT.get())))));


    //WILD HERBS
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HENVEN =
            FeatureUtils.register("henven", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.HERBTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_HENVEN_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CANNAAN =
            FeatureUtils.register("cannaan", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.HERBTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_CANNAAN_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DRAGONEYE =
            FeatureUtils.register("dragoneye", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.HERBTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_DRAGONEYE_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> SPRINNAN =
            FeatureUtils.register("sprinnan", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.HERBTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_SPRINNAN_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> VIRENNES =
            FeatureUtils.register("virennes", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.HERBTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_VIRENNES_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> BRUTEFLOWER =
            FeatureUtils.register("bruteflower", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.HERBTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_BRUTEFLOWER_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FAIRYFLOWER =
            FeatureUtils.register("fairyflower", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.HERBTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_FAIRYFLOWER_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> GRANGIN =
            FeatureUtils.register("grangin", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.HERBTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_GRANGIN_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CACHEN =
            FeatureUtils.register("cachen", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.HERBTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_CACHEN_PLANT.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> LADYRIVER =
            FeatureUtils.register("ladyriver", Feature.FLOWER,
                    new RandomPatchConfiguration(MedievalEmbroideryCommonConfig.HERBTRIES.get(), 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_LADYRIVER_PLANT.get())))));


}


