package com.dragn0007_evangelix.medievalembroidery.entity.direwolf;

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

public class DirewolfMarkingLayer extends GeoRenderLayer<Direwolf> {
    public DirewolfMarkingLayer(GeoRenderer entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(PoseStack poseStack, Direwolf animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {

        RenderType renderMarkingType = RenderType.entityCutout(((Direwolf)animatable).getOverlayLocation());
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
        NONE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/direwolf/overlay/direwolf_none_overlay.png")),
        BALD(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/direwolf/overlay/direwolf_bald_overlay.png")),
        FULL_SOCKS(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/direwolf/overlay/direwolf_full_socks_overlay.png")),
        SIMPLE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/direwolf/overlay/direwolf_simple_overlay.png")),
        SOCKS(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/direwolf/overlay/direwolf_socks_overlay.png")),
        MITTENS(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/direwolf/overlay/direwolf_mittens_overlay.png")),
        BLAZE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/direwolf/overlay/direwolf_blaze_overlay.png"));

        public final ResourceLocation resourceLocation;
        Overlay(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Overlay overlayFromOrdinal(int overlay) { return Overlay.values()[overlay % Overlay.values().length];
        }
    }

}
