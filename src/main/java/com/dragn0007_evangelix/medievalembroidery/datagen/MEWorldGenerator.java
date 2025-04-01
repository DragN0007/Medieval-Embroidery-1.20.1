package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class MEWorldGenerator extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder();
//            .add(Registries.CONFIGURED_FEATURE, MEConfigFeatures::bootstrap)
//            .add(Registries.PLACED_FEATURE, MEPlacedFeatures::bootstrap)
//            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, BiomeHitter::bootstrap);
//
    public MEWorldGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(MedievalEmbroidery.MODID));
    }
}
