package com.dragn0007_evangelix.medievalembroidery.event;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.client.render.armor.*;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;


@Mod.EventBusSubscriber(modid = MedievalEmbroidery.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MedievalEmbroideryClientEvent {

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(FangedElkArmorItem.class, () -> new FangedElkSkullRender());
        GeoArmorRenderer.registerArmorRenderer(FangedElkIronArmorItem.class, () -> new FangedElkSkullIronRender());
        GeoArmorRenderer.registerArmorRenderer(FangedElkGoldArmorItem.class, () -> new FangedElkSkullGoldRender());
        GeoArmorRenderer.registerArmorRenderer(FangedElkDiamondArmorItem.class, () -> new FangedElkSkullDiamondRender());
        GeoArmorRenderer.registerArmorRenderer(FangedElkNetheriteArmorItem.class, () -> new FangedElkSkullNetheriteRender());
        GeoArmorRenderer.registerArmorRenderer(FangedElkObsidianArmorItem.class, () -> new FangedElkSkullObsidianRender());
        GeoArmorRenderer.registerArmorRenderer(DirewolfArmorItem.class, () -> new DirewolfFurArmorRender());
        GeoArmorRenderer.registerArmorRenderer(BoarArmorItem.class, () -> new BoarFurArmorRender());
    }

}




