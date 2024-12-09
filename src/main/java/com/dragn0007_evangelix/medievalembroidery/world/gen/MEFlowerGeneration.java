package com.dragn0007_evangelix.medievalembroidery.world.gen;

import com.dragn0007.medievalembroidery.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Set;

public class MEFlowerGeneration {

    public static void generateFlowers(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(ForgeRegistries.Keys.BIOMES, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        //PLANTS
        if (types.contains(BiomeDictionary.Type.MOUNTAIN)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.VIOLET_DRAGON_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.MOUNTAIN)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.BLUE_DRAGON_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.HILLS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.PINK_MAGE_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.WET)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.PURPLE_MAGE_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.HOT)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.FIRE_DAISY_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.GROUND_VINE_PLACED);
        }

        //BUSHES
        if (types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.ELDERBERRY_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.BILBERRY_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.COWBERRY_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.HAWTHORN_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.REDCURRANT_PLACED);
        }


        //FUNGI
        if (types.contains(BiomeDictionary.Type.WET)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.BLEWIT_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.HONEY_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.SAVANNA)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.KING_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.WET)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.MATSUTAKE_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.CONIFEROUS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.OYSTER_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.DENSE)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.PORCINI_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.WOODSCHICKEN_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.PLATEAU)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.YELLOWFOOT_PLACED);
        }


        //WILD HERBS
        if (types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.HENVEN_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.SAVANNA)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.DRAGONEYE_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.SWAMP)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.CANNAAN_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.VIRENNES_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.BRUTEFLOWER_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.HILLS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.SPRINNAN_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.JUNGLE)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.CACHEN_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.GRANGIN_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.DENSE)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.FAIRYFLOWER_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.RIVER)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.LADYRIVER_PLACED);
        }


    }
}
