package com.dragn0007_evangelix.medievalembroidery;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.PixelPlacementBlocks;
import com.dragn0007_evangelix.medievalembroidery.entity.EntityTypes;
import com.dragn0007_evangelix.medievalembroidery.gui.MEMenuTypes;
import com.dragn0007_evangelix.medievalembroidery.item.MEItemGroup;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import com.dragn0007_evangelix.medievalembroidery.util.MedievalEmbroideryClientConfig;
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
        MEItemGroup.register(eventBus);
        MEBlocks.register(eventBus);
        PixelPlacementBlocks.register(eventBus);
        EntityTypes.ENTITY_TYPES.register(eventBus);
        MEMenuTypes.register(eventBus);

        GeckoLib.initialize();
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MedievalEmbroideryClientConfig.SPEC, "medieval-embroidery-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MedievalEmbroideryCommonConfig.SPEC, "medieval-embroidery-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final EntityDataSerializer<ResourceLocation> RESOURCE_LOCATION = EntityDataSerializer.simple(FriendlyByteBuf::writeResourceLocation, FriendlyByteBuf::readResourceLocation);
    static {
        EntityDataSerializers.registerSerializer(RESOURCE_LOCATION);
    }
}