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

public class GriffinMarkingLayer extends GeoRenderLayer<Griffin> {
    public GriffinMarkingLayer(GeoRenderer entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(PoseStack poseStack, Griffin animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
        RenderType renderMarkingType = RenderType.entityCutout(((Griffin)animatable).getOverlayLocation());
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
        BAY_PRIMARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/bay_primary.png")),
        BAY_SECONDARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/bay_secondary.png")),
        BAY_SPECKLED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/bay_speckled.png")),
        BAY_STRIPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/bay_striped.png")),
        BAY_TIPPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/bay_tipped.png")),
        BLACK_PRIMARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/black_primary.png")),
        BLACK_SECONDARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/black_secondary.png")),
        BLACK_SPECKLED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/black_speckled.png")),
        BLACK_STRIPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/black_striped.png")),
        BLACK_TIPPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/black_tipped.png")),
        BLUE_PRIMARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/blue_primary.png")),
        BLUE_SECONDARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/blue_secondary.png")),
        BLUE_SPECKLED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/blue_speckled.png")),
        BLUE_STRIPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/blue_striped.png")),
        BLUE_TIPPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/blue_tipped.png")),
        BROWN_PRIMARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/brown_primary.png")),
        BROWN_SECONDARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/brown_secondary.png")),
        BROWN_SPECKLED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/brown_speckled.png")),
        BROWN_STRIPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/brown_striped.png")),
        BROWN_TIPPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/brown_tipped.png")),
        CHESTNUT_PRIMARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/chestnut_primary.png")),
        CHESTNUT_SECONDARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/chestnut_secondary.png")),
        CHESTNUT_SPECKLED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/chestnut_speckled.png")),
        CHESTNUT_STRIPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/chestnut_striped.png")),
        CHESTNUT_TIPPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/chestnut_tipped.png")),
        DARK_BROWN_PRIMARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/dark_brown_primary.png")),
        DARK_BROWN_SECONDARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/dark_brown_secondary.png")),
        DARK_BROWN_SPECKLED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/dark_brown_speckled.png")),
        DARK_BROWN_STRIPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/dark_brown_striped.png")),
        DARK_BROWN_TIPPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/dark_brown_tipped.png")),
        GOLD_PRIMARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/gold_primary.png")),
        GOLD_SECONDARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/gold_secondary.png")),
        GOLD_SPECKLED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/gold_speckled.png")),
        GOLD_STRIPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/gold_striped.png")),
        GOLD_TIPPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/gold_tipped.png")),
        GREY_PRIMARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/grey_primary.png")),
        GREY_SECONDARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/grey_secondary.png")),
        GREY_SPECKLED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/grey_speckled.png")),
        GREY_STRIPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/grey_striped.png")),
        GREY_TIPPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/grey_tipped.png")),
        LIGHT_GREY_PRIMARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/light_grey_primary.png")),
        LIGHT_GREY_SECONDARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/light_grey_secondary.png")),
        LIGHT_GREY_SPECKLED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/light_grey_speckled.png")),
        LIGHT_GREY_STRIPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/light_grey_striped.png")),
        LIGHT_GREY_TIPPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/light_grey_tipped.png")),
        RED_PRIMARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/red_primary.png")),
        RED_SECONDARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/red_secondary.png")),
        RED_SPECKLED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/red_speckled.png")),
        RED_STRIPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/red_striped.png")),
        RED_TIPPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/red_tipped.png")),
        TAN_PRIMARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/tan_primary.png")),
        TAN_SECONDARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/tan_secondary.png")),
        TAN_SPECKLED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/tan_speckled.png")),
        TAN_STRIPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/tan_striped.png")),
        TAN_TIPPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/tan_tipped.png")),
        WHITE_PRIMARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/white_primary.png")),
        WHITE_SECONDARY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/white_secondary.png")),
        WHITE_SPECKLED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/white_speckled.png")),
        WHITE_STRIPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/white_striped.png")),
        WHITE_TIPPED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/overlay/white_tipped.png"));

        public final ResourceLocation resourceLocation;
        Overlay(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Overlay overlayFromOrdinal(int overlay) { return Overlay.values()[overlay % Overlay.values().length];
        }
    }

}
