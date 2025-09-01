package com.dragn0007_evangelix.medievalembroidery.util;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.entity.util.AbstractMount;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

import java.util.Objects;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = MedievalEmbroidery.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MENetwork {

    public static class HandleSpeedRequest {
        private final int speedMod;

        public HandleSpeedRequest(int speedMod) {
            this.speedMod = speedMod;
        }

        public static void encode(HandleSpeedRequest msg, FriendlyByteBuf buffer) {
            buffer.writeInt(msg.speedMod);
        }

        public static HandleSpeedRequest decode(FriendlyByteBuf buffer) {
            return new HandleSpeedRequest(buffer.readInt());
        }

        public static void handle(HandleSpeedRequest msg, Supplier<NetworkEvent.Context> context) {
            NetworkEvent.Context ctx = context.get();
            ctx.enqueueWork(() -> {
                ServerPlayer player = ctx.getSender();
                if(player != null) {
                    if(player.getVehicle() instanceof AbstractMount mount) {
                        mount.handleSpeedRequest(msg.speedMod);
                    }
                }
            });
            ctx.setPacketHandled(true);
        }
    }

    public static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(MedievalEmbroidery.MODID, "me_network"), //this needs to be a unique name, else it may clash with other mod networks that may not be uniquely named -dragoon
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );

    @SubscribeEvent
    public static void commonSetupEvent(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            INSTANCE.registerMessage(0, HandleSpeedRequest.class, HandleSpeedRequest::encode, HandleSpeedRequest::decode, HandleSpeedRequest::handle);
        });
    }
}
