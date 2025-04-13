package com.dragn0007_evangelix.medievalembroidery.world;


import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class MEConfigFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ASSISTIVE_CRYSTAL = registerKey("assistive_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CONJURING_CRYSTAL = registerKey("conjuring_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DESTRUCTIVE_CRYSTAL = registerKey("destructive_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HEALING_CRYSTAL = registerKey("healing_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PROTECTIVE_CRYSTAL = registerKey("protective_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ASTROSTONE = registerKey("astrostone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEPTHSTONE = registerKey("depthstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FIRESTONE = registerKey("firestone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FROSTSTONE = registerKey("froststone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSSTONE = registerKey("mosstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SEASTONE = registerKey("seastone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SKYSTONE = registerKey("skystone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SALT = registerKey("salt");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEMON = registerKey("lemon");
    public static final ResourceKey<ConfiguredFeature<?, ?>> APRICOT = registerKey("apricot");
    public static final ResourceKey<ConfiguredFeature<?, ?>> APPLE = registerKey("apple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BILBERRY_BUSH = registerKey("bilberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COWBERRY_BUSH = registerKey("cowberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ELDERBERRY_BUSH = registerKey("elderberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HAWTHORN_BUSH = registerKey("hawthorn_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> REDCURRANT_BUSH = registerKey("redcurrant_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_DRAGON = registerKey("blue_dragon");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VIOLET_DRAGON = registerKey("violet_dragon");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_MAGE = registerKey("pink_mage");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_MAGE = registerKey("purple_mage");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FIRE_DAISY = registerKey("fire_daisy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GROUND_VINE = registerKey("ground_vine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLEWIT = registerKey("blewit");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HONEY = registerKey("honey");
    public static final ResourceKey<ConfiguredFeature<?, ?>> KING = registerKey("king");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MATSUTAKE = registerKey("matsutake");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OYSTER = registerKey("oyster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PORCINI = registerKey("porcini");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WOODS_CHICKEN = registerKey("woods_chicken");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOWFOOT = registerKey("yellowfoot");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HENVEN = registerKey("henven");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CACHEN = registerKey("cachen");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAANNAN = registerKey("caannan");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DRAGONEYE = registerKey("dragoneye");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPRINNAN = registerKey("sprinnan");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VIRENNES = registerKey("virennes");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRUTEFLOWER = registerKey("bruteflower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRANGIN = registerKey("grangin");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FAIRYFLOWER = registerKey("fairyflower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LADYRIVER = registerKey("ladyriver");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        //Trees
        register(context, LEMON, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.SPRUCE_LOG),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(MEBlocks.LEMON_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        register(context, APRICOT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.DARK_OAK_LOG),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(MEBlocks.APRICOT_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        register(context, APPLE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.OAK_LOG),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(MEBlocks.APPLE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());


        //Plants
        register(context, BILBERRY_BUSH, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.BILBERRY_BUSH.get())))));

        register(context, COWBERRY_BUSH, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.COWBERRY_BUSH.get())))));

        register(context, ELDERBERRY_BUSH, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.ELDERBERRY_BUSH.get())))));

        register(context, HAWTHORN_BUSH, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.HAWTHORN_BUSH.get())))));

        register(context, REDCURRANT_BUSH, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.REDCURRANT_BUSH.get())))));

        register(context, BLUE_DRAGON, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.BLUE_DRAGON.get())))));

        register(context, VIOLET_DRAGON, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.VIOLET_DRAGON.get())))));

        register(context, PINK_MAGE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.PINK_MAGE.get())))));

        register(context, PURPLE_MAGE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.PURPLE_MAGE.get())))));

        register(context, FIRE_DAISY, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.FIRE_DAISY.get())))));

        register(context, GROUND_VINE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.GROUND_VINE.get())))));

        register(context, BLEWIT, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_BLEWIT.get())))));

        register(context, HONEY, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_HONEY.get())))));

        register(context, KING, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_KING.get())))));

        register(context, OYSTER, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_OYSTER.get())))));

        register(context, MATSUTAKE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_MATSUTAKE.get())))));

        register(context, PORCINI, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_PORCINI.get())))));

        register(context, WOODS_CHICKEN, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_WOODS_CHICKEN.get())))));

        register(context, YELLOWFOOT, Feature.FLOWER,
                new RandomPatchConfiguration(10, 2, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_YELLOWFOOT.get())))));

        register(context, HENVEN, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_HENVEN.get())))));

        register(context, BRUTEFLOWER, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_BRUTEFLOWER.get())))));

        register(context, CACHEN, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_CACHEN.get())))));

        register(context, CAANNAN, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_CANNAAN.get())))));

        register(context, DRAGONEYE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_DRAGONEYE.get())))));

        register(context, FAIRYFLOWER, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_FAIRYFLOWER.get())))));

        register(context, GRANGIN, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_GRANGIN.get())))));

        register(context, LADYRIVER, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_LADYRIVER.get())))));

        register(context, SPRINNAN, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_SPRINNAN.get())))));

        register(context, VIRENNES, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(MEBlocks.WILD_VIRENNES.get())))));

        //Ores
        RuleTest stoneReplaceabeles = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceabeles = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceabeles = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceabeles = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> assistive = List.of(OreConfiguration.target(stoneReplaceabeles,
                        MEBlocks.ASSISTIVE_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, MEBlocks.ASSISTIVE_CRYSTAL_ORE.get().defaultBlockState()));
        register(context, ASSISTIVE_CRYSTAL, Feature.ORE, new OreConfiguration(assistive, 3));

        List<OreConfiguration.TargetBlockState> conjuring = List.of(OreConfiguration.target(stoneReplaceabeles,
                        MEBlocks.CONJURING_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, MEBlocks.CONJURING_CRYSTAL_ORE.get().defaultBlockState()));
        register(context, CONJURING_CRYSTAL, Feature.ORE, new OreConfiguration(conjuring, 3));

        List<OreConfiguration.TargetBlockState> destructive = List.of(OreConfiguration.target(stoneReplaceabeles,
                        MEBlocks.DESTRUCTIVE_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, MEBlocks.DESTRUCTIVE_CRYSTAL_ORE.get().defaultBlockState()));
        register(context, DESTRUCTIVE_CRYSTAL, Feature.ORE, new OreConfiguration(destructive, 3));

        List<OreConfiguration.TargetBlockState> healing = List.of(OreConfiguration.target(stoneReplaceabeles,
                        MEBlocks.HEALING_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, MEBlocks.HEALING_CRYSTAL_ORE.get().defaultBlockState()));
        register(context, HEALING_CRYSTAL, Feature.ORE, new OreConfiguration(healing, 3));

        List<OreConfiguration.TargetBlockState> protective = List.of(OreConfiguration.target(stoneReplaceabeles,
                        MEBlocks.PROTECTIVE_CRYSTAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, MEBlocks.PROTECTIVE_CRYSTAL_ORE.get().defaultBlockState()));
        register(context, PROTECTIVE_CRYSTAL, Feature.ORE, new OreConfiguration(protective, 3));

        List<OreConfiguration.TargetBlockState> astrostone = List.of(OreConfiguration.target(stoneReplaceabeles,
                        MEBlocks.ASTROSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, MEBlocks.ASTROSTONE_ORE.get().defaultBlockState()));
        register(context, ASTROSTONE, Feature.ORE, new OreConfiguration(astrostone, 5));

        List<OreConfiguration.TargetBlockState> depthstone = List.of(OreConfiguration.target(stoneReplaceabeles,
                        MEBlocks.DEPTHSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, MEBlocks.DEPTHSTONE_ORE.get().defaultBlockState()));
        register(context, DEPTHSTONE, Feature.ORE, new OreConfiguration(depthstone, 5));

        List<OreConfiguration.TargetBlockState> firestone = List.of(OreConfiguration.target(stoneReplaceabeles,
                        MEBlocks.FIRESTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, MEBlocks.FIRESTONE_ORE.get().defaultBlockState()));
        register(context, FIRESTONE, Feature.ORE, new OreConfiguration(firestone, 5));

        List<OreConfiguration.TargetBlockState> froststone = List.of(OreConfiguration.target(stoneReplaceabeles,
                        MEBlocks.FROSTSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, MEBlocks.FROSTSTONE_ORE.get().defaultBlockState()));
        register(context, FROSTSTONE, Feature.ORE, new OreConfiguration(froststone, 5));

        List<OreConfiguration.TargetBlockState> mosstone = List.of(OreConfiguration.target(stoneReplaceabeles,
                        MEBlocks.MOSSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, MEBlocks.MOSSTONE_ORE.get().defaultBlockState()));
        register(context, MOSSTONE, Feature.ORE, new OreConfiguration(mosstone, 5));

        List<OreConfiguration.TargetBlockState> seastone = List.of(OreConfiguration.target(stoneReplaceabeles,
                        MEBlocks.SEASTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, MEBlocks.SEASTONE_ORE.get().defaultBlockState()));
        register(context, SEASTONE, Feature.ORE, new OreConfiguration(seastone, 5));

        List<OreConfiguration.TargetBlockState> skystone = List.of(OreConfiguration.target(stoneReplaceabeles,
                        MEBlocks.SKYSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, MEBlocks.SKYSTONE_ORE.get().defaultBlockState()));
        register(context, SKYSTONE, Feature.ORE, new OreConfiguration(skystone, 5));

        List<OreConfiguration.TargetBlockState> salt = List.of(OreConfiguration.target(stoneReplaceabeles,
                        MEBlocks.SALT_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceabeles, MEBlocks.SALT_ORE.get().defaultBlockState()));
        register(context, SALT, Feature.ORE, new OreConfiguration(salt, 7));

    }
    
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MedievalEmbroidery.MODID, name));
    }
    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
      ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}


