package com.dragn0007_evangelix.medievalembroidery.event;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.PixelPlacementBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crystal_ball.*;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacerEntityRenderer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = MedievalEmbroidery.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MedievalEmbroideryBlockEvent {

    @SubscribeEvent
    public static void entityRendererEvent(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(PixelPlacementBlocks.PIXEL_PLACER_ENTITY.get(), PixelPlacerEntityRenderer::new);
        event.registerBlockEntityRenderer(MEBlocks.ASSISTIVE_CRYSTAL_BALL_ENTITY.get(), context -> new AssistiveCrystalBallRenderer());
        event.registerBlockEntityRenderer(MEBlocks.CONJURING_CRYSTAL_BALL_ENTITY.get(), context -> new ConjuringCrystalBallRenderer());
        event.registerBlockEntityRenderer(MEBlocks.DESTRUCTIVE_CRYSTAL_BALL_ENTITY.get(), context -> new DestructiveCrystalBallRenderer());
        event.registerBlockEntityRenderer(MEBlocks.HEALING_CRYSTAL_BALL_ENTITY.get(), context -> new HealingCrystalBallRenderer());
        event.registerBlockEntityRenderer(MEBlocks.PROTECTIVE_CRYSTAL_BALL_ENTITY.get(), context -> new ProtectiveCrystalBallRenderer());
    }

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
        ResourceLocation resourceLocation = new ResourceLocation(MedievalEmbroidery.MODID, "null");
        ItemBlockRenderTypes.setRenderLayer(PixelPlacementBlocks.PIXEL_PLACER_CONTAINER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.ASSISTIVE_CRYSTAL_BALL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.CONJURING_CRYSTAL_BALL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.DESTRUCTIVE_CRYSTAL_BALL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.HEALING_CRYSTAL_BALL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.PROTECTIVE_CRYSTAL_BALL.get(), RenderType.translucent());
    }

}




