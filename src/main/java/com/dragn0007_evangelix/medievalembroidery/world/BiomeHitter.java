package com.dragn0007_evangelix.medievalembroidery.world;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeHitter {

    public static final ResourceKey<BiomeModifier> ASSISTIVE_CRYSTAL = registerKey("assistive_crystal");
    public static final ResourceKey<BiomeModifier> CONJURING_CRYSTAL = registerKey("conjuring_crystal");
    public static final ResourceKey<BiomeModifier> DESTRUCTIVE_CRYSTAL = registerKey("destructive_crystal");
    public static final ResourceKey<BiomeModifier> HEALING_CRYSTAL = registerKey("healing_crystal");
    public static final ResourceKey<BiomeModifier> PROTECTIVE_CRYSTAL = registerKey("protective_crystal");
    public static final ResourceKey<BiomeModifier> ASTROSTONE = registerKey("astrostone");
    public static final ResourceKey<BiomeModifier> DEPTHSTONE = registerKey("depthstone");
    public static final ResourceKey<BiomeModifier> FIRESTONE = registerKey("firestone");
    public static final ResourceKey<BiomeModifier> FROSTSTONE = registerKey("froststone");
    public static final ResourceKey<BiomeModifier> MOSSTONE = registerKey("mosstone");
    public static final ResourceKey<BiomeModifier> SEASTONE = registerKey("seastone");
    public static final ResourceKey<BiomeModifier> SKYSTONE = registerKey("skystone");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ASSISTIVE_CRYSTAL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.ASSISTIVE_CRYSTAL)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(CONJURING_CRYSTAL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.CONJURING_CRYSTAL)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(DESTRUCTIVE_CRYSTAL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.DESTRUCTIVE_CRYSTAL)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(HEALING_CRYSTAL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.HEALING_CRYSTAL)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(PROTECTIVE_CRYSTAL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.PROTECTIVE_CRYSTAL)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ASTROSTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.ASTROSTONE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(DEPTHSTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.DEPTHSTONE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(FIRESTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.FIRESTONE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(FROSTSTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.FROSTSTONE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(MOSSTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_LUSH),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.MOSSTONE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(SEASTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OCEAN),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.SEASTONE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(SKYSTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.SKYSTONE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    public static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(MedievalEmbroidery.MODID, name));
    }
}