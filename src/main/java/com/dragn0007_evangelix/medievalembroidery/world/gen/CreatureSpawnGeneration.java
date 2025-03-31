package com.dragn0007_evangelix.medievalembroidery.world.gen;

import com.dragn0007_evangelix.medievalembroidery.entity.EntityTypes;
import com.dragn0007_evangelix.medievalembroidery.util.config.MedievalEmbroideryCommonConfig;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.Arrays;
import java.util.List;

public class CreatureSpawnGeneration {
    public static void onEntitySpawn(final BiomeLoadingEvent event) {

        addEntityToSpecificBiomes(event, EntityTypes.BUTTERFLY_ENTITY.get(),
                MedievalEmbroideryCommonConfig.BUTTERFLY_WEIGHT.get(), 1, 4,
                Biomes.JUNGLE, Biomes.SPARSE_JUNGLE,
                Biomes.SAVANNA,
                Biomes.PLAINS, Biomes.SUNFLOWER_PLAINS,
                Biomes.DARK_FOREST, Biomes.MUSHROOM_FIELDS
        );

        addEntityToSpecificBiomes(event, EntityTypes.CRESTEDLIZARD_ENTITY.get(),
                MedievalEmbroideryCommonConfig.CRESTEDLIZARD_WEIGHT.get(), 1, 1,
                Biomes.JUNGLE, Biomes.SPARSE_JUNGLE,
                Biomes.SAVANNA,
                Biomes.SWAMP
        );

        addEntityToSpecificBiomes(event, EntityTypes.DIREWOLF_ENTITY.get(),
                MedievalEmbroideryCommonConfig.DIREWOLF_WEIGHT.get(), 1, 2,
                Biomes.FOREST, Biomes.FLOWER_FOREST, Biomes.DARK_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST, Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                Biomes.SWAMP,
                Biomes.WINDSWEPT_GRAVELLY_HILLS, Biomes.WINDSWEPT_HILLS
        );

        addEntityToSpecificBiomes(event, EntityTypes.FAIRY_ENTITY.get(),
                MedievalEmbroideryCommonConfig.FAIRY_WEIGHT.get(), 1, 4,
                Biomes.DARK_FOREST, Biomes.MUSHROOM_FIELDS
        );

        addEntityToSpecificBiomes(event, EntityTypes.FANGEDELK_ENTITY.get(),
                MedievalEmbroideryCommonConfig.ELK_WEIGHT.get(), 1, 2,
                Biomes.WINDSWEPT_GRAVELLY_HILLS, Biomes.WINDSWEPT_HILLS,
                Biomes.TAIGA, Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                Biomes.SNOWY_PLAINS
        );

        addEntityToSpecificBiomes(event, EntityTypes.GAMEHEN_ENTITY.get(),
                MedievalEmbroideryCommonConfig.GAMEHEN_WEIGHT.get(), 2, 4,
                Biomes.WINDSWEPT_GRAVELLY_HILLS, Biomes.WINDSWEPT_HILLS,
                Biomes.TAIGA, Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                Biomes.PLAINS, Biomes.SWAMP, Biomes.SAVANNA
        );

        addEntityToSpecificBiomes(event, EntityTypes.LIGHTNING_BUG_ENTITY.get(),
                MedievalEmbroideryCommonConfig.GAMEHEN_WEIGHT.get(), 1, 3,
                Biomes.WINDSWEPT_GRAVELLY_HILLS, Biomes.WINDSWEPT_HILLS,
                Biomes.TAIGA, Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                Biomes.PLAINS, Biomes.SWAMP, Biomes.SAVANNA,
                Biomes.JUNGLE, Biomes.SPARSE_JUNGLE,
                Biomes.SWAMP
        );

        addEntityToSpecificBiomes(event, EntityTypes.TURKEY_ENTITY.get(),
                MedievalEmbroideryCommonConfig.TURKEY_WEIGHT.get(), 2, 2,
                Biomes.WINDSWEPT_GRAVELLY_HILLS, Biomes.WINDSWEPT_HILLS,
                Biomes.TAIGA, Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                Biomes.PLAINS, Biomes.SWAMP, Biomes.SAVANNA
        );

        addEntityToSpecificBiomes(event, EntityTypes.WOOLLYBOAR_ENTITY.get(),
                MedievalEmbroideryCommonConfig.WOOLLY_BOAR_WEIGHT.get(), 1, 2,
                Biomes.FOREST, Biomes.FLOWER_FOREST, Biomes.DARK_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST, Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                Biomes.SWAMP,
                Biomes.WINDSWEPT_GRAVELLY_HILLS, Biomes.WINDSWEPT_HILLS
        );

        addEntityToSpecificBiomes(event, EntityTypes.SWAMPYAK_ENTITY.get(),
                MedievalEmbroideryCommonConfig.YAK_WEIGHT.get(), 1, 2,
                Biomes.SWAMP,
                Biomes.WINDSWEPT_GRAVELLY_HILLS, Biomes.WINDSWEPT_HILLS
        );

        addEntityToSpecificBiomes(event, EntityTypes.RAVEN_ENTITY.get(),
                MedievalEmbroideryCommonConfig.RAVEN_WEIGHT.get(), 1, 1,
                Biomes.FOREST, Biomes.FLOWER_FOREST, Biomes.DARK_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST, Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                Biomes.SWAMP, Biomes.PLAINS
        );

        addEntityToSpecificBiomes(event, EntityTypes.MAMMOTH_ENTITY.get(),
                MedievalEmbroideryCommonConfig.MAMMOTH_WEIGHT.get(), 1, 3,
                Biomes.OLD_GROWTH_SPRUCE_TAIGA, Biomes.OLD_GROWTH_PINE_TAIGA, Biomes.SNOWY_TAIGA,
                Biomes.SNOWY_PLAINS, Biomes.SNOWY_SLOPES
        );
    }

    private static void addEntityToAllBiomesExceptThese(BiomeLoadingEvent event, EntityType<?> type,
                                                        int weight, int minCount, int maxCount, ResourceKey<Biome>... biomes) {
        boolean isBiomeSelected = Arrays.stream(biomes).map(ResourceKey::location)
                .map(Object::toString).anyMatch(s -> s.equals(event.getName().toString()));

        if(!isBiomeSelected) {
            addEntityToAllBiomes(event, type, weight, minCount, maxCount);
        }
    }
    @SafeVarargs
    private static void addEntityToSpecificBiomes(BiomeLoadingEvent event, EntityType<?> type,
                                                  int weight, int minCount, int maxCount, ResourceKey<Biome>... biomes) {
        boolean isBiomeSelected = Arrays.stream(biomes).map(ResourceKey::location)
                .map(Object::toString).anyMatch(s -> s.equals(event.getName().toString()));

        if(isBiomeSelected) {
            addEntityToAllBiomes(event, type, weight, minCount, maxCount);
        }
    }
    private static void addEntityToAllOverworldBiomes(BiomeLoadingEvent event, EntityType<?> type,
                                                      int weight, int minCount, int maxCount) {
        if(!event.getCategory().equals(Biome.BiomeCategory.THEEND) && !event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
            addEntityToAllBiomes(event, type, weight, minCount, maxCount);
        }
    }
    private static void addEntityToAllBiomesNoNether(BiomeLoadingEvent event, EntityType<?> type,
                                                     int weight, int minCount, int maxCount) {
        if(!event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
            List<MobSpawnSettings.SpawnerData> base = event.getSpawns().getSpawner(type.getCategory());
            base.add(new MobSpawnSettings.SpawnerData(type,weight, minCount, maxCount));
        }
    }
    private static void addEntityToAllBiomesNoEnd(BiomeLoadingEvent event, EntityType<?> type,
                                                  int weight, int minCount, int maxCount) {
        if(!event.getCategory().equals(Biome.BiomeCategory.THEEND)) {
            List<MobSpawnSettings.SpawnerData> base = event.getSpawns().getSpawner(type.getCategory());
            base.add(new MobSpawnSettings.SpawnerData(type,weight, minCount, maxCount));
        }
    }
    private static void addEntityToAllBiomes(BiomeLoadingEvent event, EntityType<?> type,
                                             int weight, int minCount, int maxCount) {
        List<MobSpawnSettings.SpawnerData> base = event.getSpawns().getSpawner(type.getCategory());
        base.add(new MobSpawnSettings.SpawnerData(type,weight, minCount, maxCount));
    }
}
