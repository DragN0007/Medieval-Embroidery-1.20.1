package com.dragn0007_evangelix.medievalembroidery.event;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.magic.GrimoireModel;
import com.dragn0007_evangelix.medievalembroidery.magic.MagicRenderer;
import com.dragn0007_evangelix.medievalembroidery.magic.spells.FireballModel;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = MedievalEmbroidery.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MedievalEmbroideryClientEvent {

    public static final KeyMapping MOUNT_SPEED_UP = new KeyMapping("key.medievalembroidery.mount_speed_up", InputConstants.KEY_LCONTROL, "key.medievalembroidery.categories.medievalembroidery");
    public static final KeyMapping MOUNT_SLOW_DOWN = new KeyMapping("key.medievalembroidery.mount_slow_down", InputConstants.KEY_LALT, "key.medievalembroidery.categories.medievalembroidery");
    public static final KeyMapping SWIM_UP = new KeyMapping("key.medievalembroidery.swim_up", InputConstants.KEY_SPACE, "key.medievalembroidery.categories.medievalembroidery");
    public static final KeyMapping SWIM_DOWN = new KeyMapping("key.medievalembroidery.swim_down", InputConstants.KEY_LCONTROL, "key.medievalembroidery.categories.medievalembroidery");

    public static final KeyMapping FLY_UP = new KeyMapping("key.medievalembroidery.fly_up", InputConstants.KEY_S, "key.medievalembroidery.categories.medievalembroidery");
    public static final KeyMapping FLY_DOWN = new KeyMapping("key.medievalembroidery.fly_down", InputConstants.KEY_W, "key.medievalembroidery.categories.medievalembroidery");
    public static final KeyMapping STRAFE_LEFT = new KeyMapping("key.medievalembroidery.strafe_left", InputConstants.KEY_A, "key.medievalembroidery.categories.medievalembroidery");
    public static final KeyMapping STRAFE_RIGHT = new KeyMapping("key.medievalembroidery.strafe_right", InputConstants.KEY_D, "key.medievalembroidery.categories.medievalembroidery");
    public static final KeyMapping TAKE_OFF = new KeyMapping("key.medievalembroidery.take_off", InputConstants.KEY_SPACE, "key.medievalembroidery.categories.medievalembroidery");

    @SubscribeEvent
    public static void registerKeyBindings(RegisterKeyMappingsEvent event) {
        KeyMapping[] keyMappings = {MOUNT_SPEED_UP, MOUNT_SLOW_DOWN, SWIM_UP, SWIM_DOWN, FLY_UP, FLY_DOWN, STRAFE_LEFT, STRAFE_RIGHT, TAKE_OFF};
        for (KeyMapping keyMapping : keyMappings) {
            event.register(keyMapping);
        }
    }

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {

    }

    @SubscribeEvent
    public static void registerLayerDefinitionsEvent(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(MagicRenderer.GRIMOIRE, GrimoireModel::createLayer);
        event.registerLayerDefinition(MagicRenderer.FIREBALL, FireballModel::createLayer);
    }

    @SubscribeEvent
    public static void registerReloadableEvent(RegisterClientReloadListenersEvent event) {
        event.registerReloadListener(MagicRenderer.INSTANCE);
    }
}




