package com.dragn0007_evangelix.medievalembroidery.world.gen;

import com.dragn0007.medievalembroidery.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class MEOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.HEALING_CRYSTAL_ORE_PLACED);
        base.add(ModPlacedFeatures.PROTECTIVE_CRYSTAL_ORE_PLACED);
        base.add(ModPlacedFeatures.DESTRUCTIVE_CRYSTAL_ORE_PLACED);
        base.add(ModPlacedFeatures.ASSISTIVE_CRYSTAL_ORE_PLACED);
        base.add(ModPlacedFeatures.CONJURING_CRYSTAL_ORE_PLACED);

        base.add(ModPlacedFeatures.ASTROSTONE_PLACED);
        base.add(ModPlacedFeatures.DEPTHSTONE_PLACED);
        base.add(ModPlacedFeatures.FIRESTONE_PLACED);
        base.add(ModPlacedFeatures.FROSTSTONE_PLACED);
        base.add(ModPlacedFeatures.MOSSTONE_PLACED);
        base.add(ModPlacedFeatures.SEASTONE_PLACED);
        base.add(ModPlacedFeatures.SKYSTONE_PLACED);

        base.add(ModPlacedFeatures.SALT_PLACED);
    }
}
