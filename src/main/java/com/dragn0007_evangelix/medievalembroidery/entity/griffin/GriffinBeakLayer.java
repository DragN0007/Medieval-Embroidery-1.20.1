package com.dragn0007_evangelix.medievalembroidery.entity.griffin;

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

public class GriffinBeakLayer extends GeoRenderLayer<Griffin> {
    public GriffinBeakLayer(GeoRenderer entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(PoseStack poseStack, Griffin animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
        RenderType renderMarkingType = RenderType.entityCutout(((Griffin)animatable).getBeakLocation());
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
        NONE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/none.png")),
        BLACK(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/beak/black.png")),
        BLUE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/beak/blue.png")),
        BROWN(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/beak/brown.png")),
        DARK_BROWN(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/beak/dark_brown.png")),
        GOLD(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/beak/gold.png")),
        GREY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/beak/grey.png")),
        RED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/beak/red.png")),
        WHITE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/beak/white.png"));

        public final ResourceLocation resourceLocation;
        Overlay(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Overlay overlayFromOrdinal(int overlay) { return Overlay.values()[overlay % Overlay.values().length];
        }
    }

}
