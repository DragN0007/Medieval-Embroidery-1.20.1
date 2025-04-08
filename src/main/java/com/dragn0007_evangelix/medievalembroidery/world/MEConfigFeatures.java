package com.dragn0007_evangelix.medievalembroidery.world;


import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
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

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

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

    }
    
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MedievalEmbroidery.MODID, name));
    }
    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
      ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}


