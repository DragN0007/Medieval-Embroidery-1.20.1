package com.dragn0007_evangelix.medievalembroidery.event;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = MedievalEmbroidery.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MedievalEmbroideryClientEvent {

    public static final KeyMapping MOUNT_SPEED_UP = new KeyMapping("key.medievalembroidery.mount_speed_up", InputConstants.KEY_LCONTROL, "key.medievalembroidery.categories.medievalembroidery");
    public static final KeyMapping MOUNT_SLOW_DOWN = new KeyMapping("key.medievalembroidery.mount_slow_down", InputConstants.KEY_LALT, "key.medievalembroidery.categories.medievalembroidery");
    public static final KeyMapping SWIM_UP = new KeyMapping("key.medievalembroidery.swim_up", InputConstants.KEY_SPACE, "key.medievalembroidery.categories.medievalembroidery");
    public static final KeyMapping SWIM_DOWN = new KeyMapping("key.medievalembroidery.swim_down", InputConstants.KEY_LCONTROL, "key.medievalembroidery.categories.medievalembroidery");

    @SubscribeEvent
    public static void registerKeyBindings(RegisterKeyMappingsEvent event) {
        KeyMapping[] keyMappings = {MOUNT_SPEED_UP, MOUNT_SLOW_DOWN, SWIM_UP, SWIM_DOWN};
        for (KeyMapping keyMapping : keyMappings) {
            event.register(keyMapping);
        }
    }

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {

    }

}




