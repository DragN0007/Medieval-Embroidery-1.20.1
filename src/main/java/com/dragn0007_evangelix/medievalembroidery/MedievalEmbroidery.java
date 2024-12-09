package com.dragn0007_evangelix.medievalembroidery;

import com.dragn0007_evangelix.medievalembroidery.entity.EntityTypes;
import com.dragn0007_evangelix.medievalembroidery.event.MedievalEmbroideryClientEvent;
import com.dragn0007_evangelix.medievalembroidery.gui.MEMenuTypes;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import com.dragn0007_evangelix.medievalembroidery.util.config.MedievalEmbroideryCommonConfig;
import com.dragn0007_evangelix.medievalembroidery.world.gen.CreatureSpawnGeneration;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import software.bernie.geckolib.GeckoLib;

@Mod(MedievalEmbroidery.MODID)
public class MedievalEmbroidery
{
    public static final String MODID = "medievalembroidery";

    public static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIER_SERIALIZERS = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MODID);
    public static final RegistryObject<Codec<CreatureSpawnGeneration>> SPAWN_CODEC = BIOME_MODIFIER_SERIALIZERS.register("spawn_biome_modifier",
            () -> RecordCodecBuilder.create(builder ->
                    builder.group(Biome.LIST_CODEC.fieldOf("biomes").forGetter(CreatureSpawnGeneration::biomes)).apply(builder, CreatureSpawnGeneration::new)));

    public MedievalEmbroidery()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MEItems.register(eventBus);
        EntityTypes.ENTITY_TYPES.register(eventBus);
        MEMenuTypes.register(eventBus);
        BIOME_MODIFIER_SERIALIZERS.register(eventBus);

        GeckoLib.initialize();
//        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MedievalEmbroideryClientEvent.SPEC, "livestock-overhaul-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MedievalEmbroideryCommonConfig.SPEC, "medieval-embroidery-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final EntityDataSerializer<ResourceLocation> RESOURCE_MECATION = new EntityDataSerializer<>() {
        @Override
        public void write(FriendlyByteBuf buf, ResourceLocation resourceLocation) {
            buf.writeResourceLocation(resourceLocation);
        }

        @Override
        public ResourceLocation read(FriendlyByteBuf buf) {
            return buf.readResourceLocation();
        }

        @Override
        public ResourceLocation copy(ResourceLocation resourceLocation) {
            return resourceLocation;
        }
    };

    static {
        EntityDataSerializers.registerSerializer(RESOURCE_MECATION);
    }
}