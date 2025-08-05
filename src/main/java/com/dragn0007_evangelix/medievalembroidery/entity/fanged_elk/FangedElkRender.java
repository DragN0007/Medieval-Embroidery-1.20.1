package com.dragn0007_evangelix.medievalembroidery.entity.fanged_elk;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class FangedElkRender extends GeoEntityRenderer<FangedElk> {

    public FangedElkRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new FangedElkModel());
        this.addRenderLayer(new FangedElkMarkingLayer(this));
    }

    @Override
    public void preRender(PoseStack poseStack, FangedElk entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {

        if (!entity.isBaby()) {
            if (entity.hasChest()) {
                model.getBone("saddlebags").ifPresent(b -> b.setHidden(false));
            } else {
                model.getBone("saddlebags").ifPresent(b -> b.setHidden(true));
            }

            if (entity.isSaddled()) {
                model.getBone("saddle").ifPresent(b -> b.setHidden(false));
                model.getBone("saddle2").ifPresent(b -> b.setHidden(false));
            } else {
                model.getBone("saddle").ifPresent(b -> b.setHidden(true));
                model.getBone("saddle2").ifPresent(b -> b.setHidden(true));
            }

        }

        if (entity.isBaby()) {
            model.getBone("saddlebags").ifPresent(b -> b.setHidden(true));
            model.getBone("saddle").ifPresent(b -> b.setHidden(true));
            model.getBone("saddle2").ifPresent(b -> b.setHidden(true));
            model.getBone("AntlersRight").ifPresent(b -> b.setHidden(true));
            model.getBone("AntlersLeft").ifPresent(b -> b.setHidden(true));
            model.getBone("fangs").ifPresent(b -> b.setHidden(true));
            model.getBone("fangs2").ifPresent(b -> b.setHidden(true));
            poseStack.scale(0.6F, 0.6F, 0.6F);
        } else if (!entity.isBaby() && entity.isFemale()) {
            model.getBone("AntlersRight").ifPresent(b -> b.setHidden(true));
            model.getBone("AntlersLeft").ifPresent(b -> b.setHidden(true));
            model.getBone("fangs").ifPresent(b -> b.setHidden(false));
            model.getBone("fangs2").ifPresent(b -> b.setHidden(true));
            poseStack.scale(1.0F, 1.0F, 1.0F);
        } else if (!entity.isBaby() && entity.isMale()) {
            model.getBone("AntlersRight").ifPresent(b -> b.setHidden(false));
            model.getBone("AntlersLeft").ifPresent(b -> b.setHidden(false));
            model.getBone("fangs").ifPresent(b -> b.setHidden(false));
            model.getBone("fangs2").ifPresent(b -> b.setHidden(false));
            poseStack.scale(1.0F, 1.0F, 1.0F);
        }

        super.preRender(poseStack, animatable, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }
}