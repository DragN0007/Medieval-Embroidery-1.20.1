package com.dragn0007_evangelix.medievalembroidery.world.feature;

import com.dragn0007.medievalembroidery.util.config.MedievalEmbroideryCommonConfig;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class ModPlacedFeatures {
    
    //TREE
    public static final Holder<PlacedFeature> APPLE_PLACED =
            PlacementUtils.register("apple_placed",
                    ModConfigFeatures.APPLE_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.05F, 1)));

    public static final Holder<PlacedFeature> APRICOT_PLACED =
            PlacementUtils.register("apricot_placed",
                    ModConfigFeatures.APRICOT_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.05F, 1)));

    public static final Holder<PlacedFeature> LEMON_PLACED =
            PlacementUtils.register("lemon_placed",
                    ModConfigFeatures.LEMON_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.05F, 1)));
    

    //ORES
    public static final Holder<PlacedFeature> HEALING_CRYSTAL_ORE_PLACED = PlacementUtils.register("healing_crystal_ore_placed",
            ModConfigFeatures.HEALING_CRYSTAL_ORE, ModOrePlacement.commonOrePlacement(MedievalEmbroideryCommonConfig.CRYSTALPERCHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(90))));
    public static final Holder<PlacedFeature> PROTECTIVE_CRYSTAL_ORE_PLACED = PlacementUtils.register("protective_crystal_ore_placed",
            ModConfigFeatures.PROTECTIVE_CRYSTAL_ORE, ModOrePlacement.commonOrePlacement(MedievalEmbroideryCommonConfig.CRYSTALPERCHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(90))));
    public static final Holder<PlacedFeature> DESTRUCTIVE_CRYSTAL_ORE_PLACED = PlacementUtils.register("destructive_crystal_ore_placed",
            ModConfigFeatures.DESTRUCTIVE_CRYSTAL_ORE, ModOrePlacement.commonOrePlacement(MedievalEmbroideryCommonConfig.CRYSTALPERCHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(90))));
    public static final Holder<PlacedFeature> ASSISTIVE_CRYSTAL_ORE_PLACED = PlacementUtils.register("assistive_crystal_ore_placed",
            ModConfigFeatures.ASSISTIVE_CRYSTAL_ORE, ModOrePlacement.commonOrePlacement(MedievalEmbroideryCommonConfig.CRYSTALPERCHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(90))));
    public static final Holder<PlacedFeature> CONJURING_CRYSTAL_ORE_PLACED = PlacementUtils.register("conjuring_crystal_ore_placed",
            ModConfigFeatures.CONJURING_CRYSTAL_ORE, ModOrePlacement.commonOrePlacement(MedievalEmbroideryCommonConfig.CRYSTALPERCHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(90))));

    public static final Holder<PlacedFeature> ASTROSTONE_PLACED = PlacementUtils.register("astrostone_placed",
            ModConfigFeatures.ASTROSTONE_ORE, ModOrePlacement.commonOrePlacement(MedievalEmbroideryCommonConfig.GEMPERCHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(100))));
    public static final Holder<PlacedFeature> DEPTHSTONE_PLACED = PlacementUtils.register("depthstone_placed",
            ModConfigFeatures.DEPTHSTONE_ORE, ModOrePlacement.commonOrePlacement(MedievalEmbroideryCommonConfig.GEMPERCHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(100))));
    public static final Holder<PlacedFeature> FIRESTONE_PLACED = PlacementUtils.register("firestone_placed",
            ModConfigFeatures.FIRESTONE_ORE, ModOrePlacement.commonOrePlacement(MedievalEmbroideryCommonConfig.GEMPERCHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(100))));
    public static final Holder<PlacedFeature> FROSTSTONE_PLACED = PlacementUtils.register("froststone_placed",
            ModConfigFeatures.FROSTSTONE_ORE, ModOrePlacement.commonOrePlacement(MedievalEmbroideryCommonConfig.GEMPERCHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(100))));
    public static final Holder<PlacedFeature> MOSSTONE_PLACED = PlacementUtils.register("mosstone_placed",
            ModConfigFeatures.MOSSTONE_ORE, ModOrePlacement.commonOrePlacement(MedievalEmbroideryCommonConfig.GEMPERCHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(100))));
    public static final Holder<PlacedFeature> SEASTONE_PLACED = PlacementUtils.register("seastone_placed",
            ModConfigFeatures.SEASTONE_ORE, ModOrePlacement.commonOrePlacement(MedievalEmbroideryCommonConfig.GEMPERCHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(100))));
    public static final Holder<PlacedFeature> SKYSTONE_PLACED = PlacementUtils.register("skystone_placed",
            ModConfigFeatures.SKYSTONE_ORE, ModOrePlacement.commonOrePlacement(MedievalEmbroideryCommonConfig.GEMPERCHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(100))));
    public static final Holder<PlacedFeature> SALT_PLACED = PlacementUtils.register("salt_placed",
            ModConfigFeatures.SALT_ORE, ModOrePlacement.commonOrePlacement(MedievalEmbroideryCommonConfig.SALTPERCHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(100))));

    //PLANTS
    public static final Holder<PlacedFeature> VIOLET_DRAGON_PLACED =
            PlacementUtils.register("violet_dragon_placed",
                    ModConfigFeatures.VIOLET_DRAGON,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> BLUE_DRAGON_PLACED =
            PlacementUtils.register("blue_dragon_placed",
                    ModConfigFeatures.BLUE_DRAGON,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> PINK_MAGE_PLACED =
            PlacementUtils.register("pink_mage_placed",
                    ModConfigFeatures.PINK_MAGE,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> PURPLE_MAGE_PLACED =
            PlacementUtils.register("purple_mage_placed",
                    ModConfigFeatures.PURPLE_MAGE,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> FIRE_DAISY_PLACED =
            PlacementUtils.register("fire_daisy_placed",
                    ModConfigFeatures.FIRE_DAISY,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> GROUND_VINE_PLACED =
            PlacementUtils.register("ground_vine_placed",
                    ModConfigFeatures.GROUND_VINE,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());


    //BUSHES
    public static final Holder<PlacedFeature> ELDERBERRY_PLACED =
            PlacementUtils.register("elderberry_placed",
                    ModConfigFeatures.ELDERBERRY,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> BILBERRY_PLACED =
            PlacementUtils.register("bilberry_placed",
                    ModConfigFeatures.BILBERRY,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> COWBERRY_PLACED =
            PlacementUtils.register("cowberry_placed",
                    ModConfigFeatures.COWBERRY,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> HAWTHORN_PLACED =
            PlacementUtils.register("hawthorn_placed",
                    ModConfigFeatures.HAWTHORN,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> REDCURRANT_PLACED =
            PlacementUtils.register("redcurrant_placed",
                    ModConfigFeatures.REDCURRANT,
                    RarityFilter.onAverageOnceEvery(28),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    //FUNGI
    public static final Holder<PlacedFeature> BLEWIT_PLACED =
            PlacementUtils.register("blewit_placed",
                    ModConfigFeatures.BLEWIT,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> HONEY_PLACED =
            PlacementUtils.register("honey_placed",
                    ModConfigFeatures.HONEY,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> KING_PLACED =
            PlacementUtils.register("king_placed",
                    ModConfigFeatures.KING,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> MATSUTAKE_PLACED =
            PlacementUtils.register("matsutake_placed",
                    ModConfigFeatures.MATSUTAKE,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> OYSTER_PLACED =
            PlacementUtils.register("oyster_placed",
                    ModConfigFeatures.OYSTER,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> PORCINI_PLACED =
            PlacementUtils.register("porcini_placed",
                    ModConfigFeatures.PORCINI,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> WOODSCHICKEN_PLACED =
            PlacementUtils.register("woodschicken_placed",
                    ModConfigFeatures.WOODSCHICKEN,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> YELLOWFOOT_PLACED =
            PlacementUtils.register("yellowfoot_placed",
                    ModConfigFeatures.YELLOWFOOT,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());


    //WILD HERBS
    public static final Holder<PlacedFeature> HENVEN_PLACED =
            PlacementUtils.register("henven_placed",
                    ModConfigFeatures.HENVEN,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> CANNAAN_PLACED =
            PlacementUtils.register("cannaan_placed",
                    ModConfigFeatures.CANNAAN,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DRAGONEYE_PLACED =
            PlacementUtils.register("dragoneye_placed",
                    ModConfigFeatures.DRAGONEYE,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> SPRINNAN_PLACED =
            PlacementUtils.register("sprinnan_placed",
                    ModConfigFeatures.SPRINNAN,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> VIRENNES_PLACED =
            PlacementUtils.register("virennes_placed",
                    ModConfigFeatures.VIRENNES,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> BRUTEFLOWER_PLACED =
            PlacementUtils.register("bruteflower_placed",
                    ModConfigFeatures.BRUTEFLOWER,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> FAIRYFLOWER_PLACED =
            PlacementUtils.register("fairyflower_placed",
                    ModConfigFeatures.FAIRYFLOWER,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> GRANGIN_PLACED =
            PlacementUtils.register("grangin_placed",
                    ModConfigFeatures.GRANGIN,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> CACHEN_PLACED =
            PlacementUtils.register("cachen_placed",
                    ModConfigFeatures.CACHEN,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> LADYRIVER_PLACED =
            PlacementUtils.register("ladyriver_placed",
                    ModConfigFeatures.LADYRIVER,
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());


}
