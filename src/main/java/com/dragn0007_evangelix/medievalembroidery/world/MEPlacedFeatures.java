package com.dragn0007_evangelix.medievalembroidery.world;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

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

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

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
