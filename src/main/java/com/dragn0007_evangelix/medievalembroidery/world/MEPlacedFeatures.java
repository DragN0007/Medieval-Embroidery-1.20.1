package com.dragn0007_evangelix.medievalembroidery.world;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class MEPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ASSISTIVE_CRYSTAL = registerKey("assistive_crystal");
    public static final ResourceKey<PlacedFeature> CONJURING_CRYSTAL = registerKey("conjuring_crystal");
    public static final ResourceKey<PlacedFeature> DESTRUCTIVE_CRYSTAL = registerKey("destructive_crystal");
    public static final ResourceKey<PlacedFeature> HEALING_CRYSTAL = registerKey("healing_crystal");
    public static final ResourceKey<PlacedFeature> PROTECTIVE_CRYSTAL = registerKey("protective_crystal");
    public static final ResourceKey<PlacedFeature> ASTROSTONE = registerKey("astrostone");
    public static final ResourceKey<PlacedFeature> DEPTHSTONE = registerKey("depthstone");
    public static final ResourceKey<PlacedFeature> FIRESTONE = registerKey("firestone");
    public static final ResourceKey<PlacedFeature> FROSTSTONE = registerKey("froststone");
    public static final ResourceKey<PlacedFeature> MOSSTONE = registerKey("mosstone");
    public static final ResourceKey<PlacedFeature> SEASTONE = registerKey("seastone");
    public static final ResourceKey<PlacedFeature> SKYSTONE = registerKey("skystone");
    public static final ResourceKey<PlacedFeature> LEMON = registerKey("lemon");
    public static final ResourceKey<PlacedFeature> APRICOT = registerKey("apricot");
    public static final ResourceKey<PlacedFeature> APPLE = registerKey("apple");
    public static final ResourceKey<PlacedFeature> BILBERRY_BUSH = registerKey("bilberry_bush");
    public static final ResourceKey<PlacedFeature> COWBERRY_BUSH = registerKey("cowberry_bush");
    public static final ResourceKey<PlacedFeature> ELDERBERRY_BUSH = registerKey("elderberry_bush");
    public static final ResourceKey<PlacedFeature> HAWTHORN_BUSH = registerKey("hawthorn_bush");
    public static final ResourceKey<PlacedFeature> REDCURRANT_BUSH = registerKey("redcurrant_bush");
    public static final ResourceKey<PlacedFeature> BLUE_DRAGON = registerKey("blue_dragon");
    public static final ResourceKey<PlacedFeature> VIOLET_DRAGON = registerKey("violet_dragon");
    public static final ResourceKey<PlacedFeature> PINK_MAGE = registerKey("pink_mage");
    public static final ResourceKey<PlacedFeature> PURPLE_MAGE = registerKey("purple_mage");
    public static final ResourceKey<PlacedFeature> FIRE_DAISY = registerKey("fire_daisy");
    public static final ResourceKey<PlacedFeature> GROUND_VINE = registerKey("ground_vine");
    public static final ResourceKey<PlacedFeature> BLEWIT = registerKey("blewit");
    public static final ResourceKey<PlacedFeature> HONEY = registerKey("honey");
    public static final ResourceKey<PlacedFeature> KING = registerKey("king");
    public static final ResourceKey<PlacedFeature> MATSUTAKE = registerKey("matsutake");
    public static final ResourceKey<PlacedFeature> OYSTER = registerKey("oyster");
    public static final ResourceKey<PlacedFeature> PORCINI = registerKey("porcini");
    public static final ResourceKey<PlacedFeature> WOODS_CHICKEN = registerKey("woods_chicken");
    public static final ResourceKey<PlacedFeature> YELLOWFOOT = registerKey("yellowfoot");
    public static final ResourceKey<PlacedFeature> HENVEN = registerKey("henven");
    public static final ResourceKey<PlacedFeature> CACHEN = registerKey("cachen");
    public static final ResourceKey<PlacedFeature> CAANNAN = registerKey("caannan");
    public static final ResourceKey<PlacedFeature> DRAGONEYE = registerKey("dragoneye");
    public static final ResourceKey<PlacedFeature> SPRINNAN = registerKey("sprinnan");
    public static final ResourceKey<PlacedFeature> VIRENNES = registerKey("virennes");
    public static final ResourceKey<PlacedFeature> BRUTEFLOWER = registerKey("bruteflower");
    public static final ResourceKey<PlacedFeature> GRANGIN = registerKey("grangin");
    public static final ResourceKey<PlacedFeature> FAIRYFLOWER = registerKey("fairyflower");
    public static final ResourceKey<PlacedFeature> LADYRIVER = registerKey("ladyriver");;
    

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        
        //Trees
        register(context, LEMON, configuredFeatures.getOrThrow(MEConfigFeatures.LEMON),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        MEBlocks.LEMON_SAPLING.get()));

        register(context, APRICOT, configuredFeatures.getOrThrow(MEConfigFeatures.APRICOT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        MEBlocks.APRICOT_SAPLING.get()));

        register(context, APPLE, configuredFeatures.getOrThrow(MEConfigFeatures.APPLE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        MEBlocks.APPLE_SAPLING.get()));

        
        //Plants
        register(context, BILBERRY_BUSH, configuredFeatures.getOrThrow(MEConfigFeatures.BILBERRY_BUSH),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, COWBERRY_BUSH, configuredFeatures.getOrThrow(MEConfigFeatures.COWBERRY_BUSH),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, ELDERBERRY_BUSH, configuredFeatures.getOrThrow(MEConfigFeatures.ELDERBERRY_BUSH),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, HAWTHORN_BUSH, configuredFeatures.getOrThrow(MEConfigFeatures.HAWTHORN_BUSH),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, REDCURRANT_BUSH, configuredFeatures.getOrThrow(MEConfigFeatures.REDCURRANT_BUSH),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BLUE_DRAGON, configuredFeatures.getOrThrow(MEConfigFeatures.BLUE_DRAGON),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, VIOLET_DRAGON, configuredFeatures.getOrThrow(MEConfigFeatures.VIOLET_DRAGON),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, PINK_MAGE, configuredFeatures.getOrThrow(MEConfigFeatures.PINK_MAGE),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, PURPLE_MAGE, configuredFeatures.getOrThrow(MEConfigFeatures.PURPLE_MAGE),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, FIRE_DAISY, configuredFeatures.getOrThrow(MEConfigFeatures.FIRE_DAISY),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, GROUND_VINE, configuredFeatures.getOrThrow(MEConfigFeatures.GROUND_VINE),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BLEWIT, configuredFeatures.getOrThrow(MEConfigFeatures.BLEWIT),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, HONEY, configuredFeatures.getOrThrow(MEConfigFeatures.HONEY),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, KING, configuredFeatures.getOrThrow(MEConfigFeatures.KING),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, MATSUTAKE, configuredFeatures.getOrThrow(MEConfigFeatures.MATSUTAKE),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, OYSTER, configuredFeatures.getOrThrow(MEConfigFeatures.OYSTER),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, PORCINI, configuredFeatures.getOrThrow(MEConfigFeatures.PORCINI),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, WOODS_CHICKEN, configuredFeatures.getOrThrow(MEConfigFeatures.WOODS_CHICKEN),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, YELLOWFOOT, configuredFeatures.getOrThrow(MEConfigFeatures.YELLOWFOOT),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, HENVEN, configuredFeatures.getOrThrow(MEConfigFeatures.HENVEN),
               List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BRUTEFLOWER, configuredFeatures.getOrThrow(MEConfigFeatures.BRUTEFLOWER),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, CACHEN, configuredFeatures.getOrThrow(MEConfigFeatures.CACHEN),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, CAANNAN, configuredFeatures.getOrThrow(MEConfigFeatures.CAANNAN),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DRAGONEYE, configuredFeatures.getOrThrow(MEConfigFeatures.DRAGONEYE),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, FAIRYFLOWER, configuredFeatures.getOrThrow(MEConfigFeatures.FAIRYFLOWER),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, GRANGIN, configuredFeatures.getOrThrow(MEConfigFeatures.GRANGIN),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, LADYRIVER, configuredFeatures.getOrThrow(MEConfigFeatures.LADYRIVER),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, SPRINNAN, configuredFeatures.getOrThrow(MEConfigFeatures.SPRINNAN),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, VIRENNES, configuredFeatures.getOrThrow(MEConfigFeatures.VIRENNES),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        

        //Ores
        register(context, ASSISTIVE_CRYSTAL, configuredFeatures.getOrThrow(MEConfigFeatures.ASSISTIVE_CRYSTAL),
                OrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(60))));

        register(context, CONJURING_CRYSTAL, configuredFeatures.getOrThrow(MEConfigFeatures.CONJURING_CRYSTAL),
                OrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(60))));

        register(context, DESTRUCTIVE_CRYSTAL, configuredFeatures.getOrThrow(MEConfigFeatures.DESTRUCTIVE_CRYSTAL),
                OrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(60))));

        register(context, HEALING_CRYSTAL, configuredFeatures.getOrThrow(MEConfigFeatures.HEALING_CRYSTAL),
                OrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(60))));

        register(context, PROTECTIVE_CRYSTAL, configuredFeatures.getOrThrow(MEConfigFeatures.PROTECTIVE_CRYSTAL),
                OrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(60))));

        register(context, ASTROSTONE, configuredFeatures.getOrThrow(MEConfigFeatures.ASTROSTONE),
                OrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(30), VerticalAnchor.absolute(90))));

        register(context, DEPTHSTONE, configuredFeatures.getOrThrow(MEConfigFeatures.DEPTHSTONE),
                OrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(30), VerticalAnchor.absolute(90))));

        register(context, FIRESTONE, configuredFeatures.getOrThrow(MEConfigFeatures.FIRESTONE),
                OrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(30), VerticalAnchor.absolute(90))));

        register(context, FROSTSTONE, configuredFeatures.getOrThrow(MEConfigFeatures.FROSTSTONE),
                OrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(30), VerticalAnchor.absolute(90))));

        register(context, MOSSTONE, configuredFeatures.getOrThrow(MEConfigFeatures.MOSSTONE),
                OrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(30), VerticalAnchor.absolute(90))));

        register(context, SEASTONE, configuredFeatures.getOrThrow(MEConfigFeatures.SEASTONE),
                OrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(30), VerticalAnchor.absolute(90))));

        register(context, SKYSTONE, configuredFeatures.getOrThrow(MEConfigFeatures.SKYSTONE),
                OrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(30), VerticalAnchor.absolute(90))));

    }

    public static ResourceKey<PlacedFeature> registerKey (String name){
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MedievalEmbroidery.MODID, name));
    }
    public static void register
    (BootstapContext < PlacedFeature > context, ResourceKey < PlacedFeature > key, Holder < ConfiguredFeature < ?, ?>>
    configuration,
            List < PlacementModifier > modifiers){
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
