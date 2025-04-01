package com.dragn0007_evangelix.medievalembroidery;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.entity.EntityTypes;
import com.dragn0007_evangelix.medievalembroidery.gui.MEMenuTypes;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import com.dragn0007_evangelix.medievalembroidery.util.MedievalEmbroideryCommonConfig;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;

@Mod(MedievalEmbroidery.MODID)
public class MedievalEmbroidery
{
    public static final String MODID = "medievalembroidery";

    public MedievalEmbroidery()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MEItems.register(eventBus);
        MEBlocks.register(eventBus);
        EntityTypes.ENTITY_TYPES.register(eventBus);
        MEMenuTypes.register(eventBus);

        GeckoLib.initialize();
//        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MedievalEmbroideryClientEvent.SPEC, "medieval-embroidery-client.toml");
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