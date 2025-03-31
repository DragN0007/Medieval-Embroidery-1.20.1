package com.dragn0007_evangelix.medievalembroidery.world.gen;

import com.dragn0007_evangelix.medievalembroidery.world.feature.MEPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class MEOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(MEPlacedFeatures.HEALING_CRYSTAL_ORE_PLACED);
        base.add(MEPlacedFeatures.PROTECTIVE_CRYSTAL_ORE_PLACED);
        base.add(MEPlacedFeatures.DESTRUCTIVE_CRYSTAL_ORE_PLACED);
        base.add(MEPlacedFeatures.ASSISTIVE_CRYSTAL_ORE_PLACED);
        base.add(MEPlacedFeatures.CONJURING_CRYSTAL_ORE_PLACED);

        base.add(MEPlacedFeatures.ASTROSTONE_PLACED);
        base.add(MEPlacedFeatures.DEPTHSTONE_PLACED);
        base.add(MEPlacedFeatures.FIRESTONE_PLACED);
        base.add(MEPlacedFeatures.FROSTSTONE_PLACED);
        base.add(MEPlacedFeatures.MOSSTONE_PLACED);
        base.add(MEPlacedFeatures.SEASTONE_PLACED);
        base.add(MEPlacedFeatures.SKYSTONE_PLACED);

        base.add(MEPlacedFeatures.SALT_PLACED);
    }
}
