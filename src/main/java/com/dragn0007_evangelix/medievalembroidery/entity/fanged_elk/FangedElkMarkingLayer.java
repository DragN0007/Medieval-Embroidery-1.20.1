package com.dragn0007_evangelix.medievalembroidery.entity.fanged_elk;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

public class FangedElkMarkingLayer extends GeoRenderLayer<FangedElk> {
    public FangedElkMarkingLayer(GeoRenderer entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(PoseStack poseStack, FangedElk animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {

        RenderType renderMarkingType = RenderType.entityCutout(((FangedElk)animatable).getOverlayLocation());
        poseStack.pushPose();
        poseStack.scale(1.0f, 1.0f, 1.0f);
        poseStack.translate(0.0d, 0.0d, 0.0d);
        poseStack.popPose();
        getRenderer().reRender(getDefaultBakedModel(animatable),
                poseStack,
                bufferSource,
                animatable,
                renderMarkingType,
                bufferSource.getBuffer(renderMarkingType), partialTick, packedLight, OverlayTexture.NO_OVERLAY,
                1, 1, 1, 1);
    }

    public enum Overlay {
        NONE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fanged_elk/overlay/none.png")),
        BLANKET(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fanged_elk/overlay/overlay_blanket.png")),
        FULL_SOCKS(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fanged_elk/overlay/overlay_full_socks.png")),
        PIEBALD(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fanged_elk/overlay/overlay_piebald.png")),
        SOCKS(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fanged_elk/overlay/overlay_socks.png")),
        SPOTTED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fanged_elk/overlay/overlay_spotted.png"));

        public final ResourceLocation resourceLocation;
        Overlay(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Overlay overlayFromOrdinal(int overlay) { return Overlay.values()[overlay % Overlay.values().length];
        }
    }

}
