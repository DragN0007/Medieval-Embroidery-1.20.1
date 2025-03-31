package com.dragn0007_evangelix.medievalembroidery.world.gen;

import com.dragn0007_evangelix.medievalembroidery.world.feature.MEPlacedFeatures;
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

            base.add(MEPlacedFeatures.VIOLET_DRAGON_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.MOUNTAIN)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.BLUE_DRAGON_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.HILLS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.PINK_MAGE_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.WET)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.PURPLE_MAGE_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.HOT)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.FIRE_DAISY_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.GROUND_VINE_PLACED);
        }

        //BUSHES
        if (types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.ELDERBERRY_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.BILBERRY_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.COWBERRY_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.HAWTHORN_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.REDCURRANT_PLACED);
        }


        //FUNGI
        if (types.contains(BiomeDictionary.Type.WET)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.BLEWIT_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.HONEY_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.SAVANNA)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.KING_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.WET)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.MATSUTAKE_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.CONIFEROUS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.OYSTER_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.DENSE)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.PORCINI_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.WOODSCHICKEN_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.PLATEAU)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.YELLOWFOOT_PLACED);
        }


        //WILD HERBS
        if (types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.HENVEN_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.SAVANNA)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.DRAGONEYE_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.SWAMP)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.CANNAAN_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.VIRENNES_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.BRUTEFLOWER_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.HILLS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.SPRINNAN_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.JUNGLE)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.CACHEN_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.GRANGIN_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.DENSE)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.FAIRYFLOWER_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.RIVER)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(MEPlacedFeatures.LADYRIVER_PLACED);
        }


    }
}
