package com.dragn0007_evangelix.medievalembroidery.world;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.entity.EntityTypes;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class BiomeHitter {

    // this is all done with datagen now, tenks
    // preferably all entries should be done with biome tags instead of specific biomes so that it's compatible with modded biomes
    // unless you want something to only spawn in a vanilla or ME biome  -dragoon

    public static final ResourceKey<BiomeModifier> DIREWOLF = registerKey("direwolf");
    public static final ResourceKey<BiomeModifier> FAIRY = registerKey("fairy");
    public static final ResourceKey<BiomeModifier> FANGED_ELK = registerKey("fanged_elk");

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
    public static final ResourceKey<BiomeModifier> SALT = registerKey("salt");
    public static final ResourceKey<BiomeModifier> LEMON = registerKey("lemon");
    public static final ResourceKey<BiomeModifier> APRICOT = registerKey("apricot");
    public static final ResourceKey<BiomeModifier> APPLE = registerKey("apple");
    public static final ResourceKey<BiomeModifier> BILBERRY_BUSH = registerKey("bilberry_bush");
    public static final ResourceKey<BiomeModifier> COWBERRY_BUSH = registerKey("cowberry_bush");
    public static final ResourceKey<BiomeModifier> ELDERBERRY_BUSH = registerKey("elderberry_bush");
    public static final ResourceKey<BiomeModifier> HAWTHORN_BUSH = registerKey("hawthorn_bush");
    public static final ResourceKey<BiomeModifier> REDCURRANT_BUSH = registerKey("redcurrant_bush");
    public static final ResourceKey<BiomeModifier> BLUE_DRAGON = registerKey("blue_dragon");
    public static final ResourceKey<BiomeModifier> VIOLET_DRAGON = registerKey("violet_dragon");
    public static final ResourceKey<BiomeModifier> PINK_MAGE = registerKey("pink_mage");
    public static final ResourceKey<BiomeModifier> PURPLE_MAGE = registerKey("purple_mage");
    public static final ResourceKey<BiomeModifier> FIRE_DAISY = registerKey("fire_daisy");
    public static final ResourceKey<BiomeModifier> GROUND_VINE = registerKey("ground_vine");
    public static final ResourceKey<BiomeModifier> BLEWIT = registerKey("blewit");
    public static final ResourceKey<BiomeModifier> HONEY = registerKey("honey");
    public static final ResourceKey<BiomeModifier> KING = registerKey("king");
    public static final ResourceKey<BiomeModifier> MATSUTAKE = registerKey("matsutake");
    public static final ResourceKey<BiomeModifier> OYSTER = registerKey("oyster");
    public static final ResourceKey<BiomeModifier> PORCINI = registerKey("porcini");
    public static final ResourceKey<BiomeModifier> WOODS_CHICKEN = registerKey("woods_chicken");
    public static final ResourceKey<BiomeModifier> YELLOWFOOT = registerKey("yellowfoot");
    public static final ResourceKey<BiomeModifier> HENVEN = registerKey("henven");
    public static final ResourceKey<BiomeModifier> CACHEN = registerKey("cachen");
    public static final ResourceKey<BiomeModifier> CAANNAN = registerKey("caannan");
    public static final ResourceKey<BiomeModifier> DRAGONEYE = registerKey("dragoneye");
    public static final ResourceKey<BiomeModifier> SPRINNAN = registerKey("sprinnan");
    public static final ResourceKey<BiomeModifier> VIRENNES = registerKey("virennes");
    public static final ResourceKey<BiomeModifier> BRUTEFLOWER = registerKey("bruteflower");
    public static final ResourceKey<BiomeModifier> GRANGIN = registerKey("grangin");
    public static final ResourceKey<BiomeModifier> FAIRYFLOWER = registerKey("fairyflower");
    public static final ResourceKey<BiomeModifier> LADYRIVER = registerKey("ladyriver");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        //Entities
        context.register(DIREWOLF, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                List.of(new MobSpawnSettings.SpawnerData(EntityTypes.DIREWOLF_ENTITY.get(),
                        4,
                        2,
                        5
                ))));

        context.register(FAIRY, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                List.of(new MobSpawnSettings.SpawnerData(EntityTypes.FAIRY_ENTITY.get(),
                        4,
                        1,
                        4
                ))));

        context.register(FANGED_ELK, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                List.of(new MobSpawnSettings.SpawnerData(EntityTypes.FANGED_ELK_ENTITY.get(),
                        5,
                        1,
                        3
                ))));


        //Trees
        context.register(LEMON, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.LEMON)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(APRICOT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.APRICOT)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(APPLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.APPLE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));


        //Plants
        context.register(BILBERRY_BUSH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.BILBERRY_BUSH)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(COWBERRY_BUSH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.COWBERRY_BUSH)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ELDERBERRY_BUSH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.ELDERBERRY_BUSH)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(HAWTHORN_BUSH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.HAWTHORN_BUSH)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(REDCURRANT_BUSH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.REDCURRANT_BUSH)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BLUE_DRAGON, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.BLUE_DRAGON)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(VIOLET_DRAGON, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.VIOLET_DRAGON)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(PINK_MAGE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.PINK_MAGE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(PURPLE_MAGE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.PURPLE_MAGE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(FIRE_DAISY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.FIRE_DAISY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(GROUND_VINE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.GROUND_VINE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BLEWIT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.BLEWIT)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(HONEY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.HONEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(KING, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.KING)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(MATSUTAKE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.MATSUTAKE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(OYSTER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_CONIFEROUS),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.OYSTER)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(PORCINI, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.PORCINI)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(WOODS_CHICKEN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.WOODS_CHICKEN)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(YELLOWFOOT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLATEAU),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.YELLOWFOOT)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(HENVEN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
               biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.HENVEN)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BRUTEFLOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
               biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.BRUTEFLOWER)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CACHEN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
               biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.CACHEN)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CAANNAN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
               biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.CAANNAN)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(DRAGONEYE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
               biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.DRAGONEYE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(FAIRYFLOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
               biomes.getOrThrow(Tags.Biomes.IS_DENSE_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.FAIRYFLOWER)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(GRANGIN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
               biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.GRANGIN)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(LADYRIVER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
               biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.LADYRIVER)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(SPRINNAN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
               biomes.getOrThrow(BiomeTags.IS_HILL),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.SPRINNAN)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(VIRENNES, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
               biomes.getOrThrow(Tags.Biomes.IS_COLD_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.VIRENNES)),
                GenerationStep.Decoration.VEGETAL_DECORATION));


        //Ores
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

        context.register(SALT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MEPlacedFeatures.SALT)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    public static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(MedievalEmbroidery.MODID, name));
    }
}