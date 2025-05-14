package com.dragn0007_evangelix.medievalembroidery.entity.griffin;

import com.dragn0007_evangelix.medievalembroidery.event.MedievalEmbroideryClientEvent;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GriffinRender extends GeoEntityRenderer<Griffin> {

    public GriffinRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GriffinModel());
        this.addRenderLayer(new GriffinFeatheringLayer(this));
        this.addRenderLayer(new GriffinBeakLayer(this));
        this.addRenderLayer(new GriffinMarkingLayer(this));
        this.addRenderLayer(new GriffinTackLayer(this));
    }

    @Override
    public void preRender(PoseStack poseStack, Griffin entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {

        if(entity.isBaby()) {
            poseStack.scale(0.5F, 0.5F, 0.5F);
        } else {
            poseStack.scale(1F, 1F, 1F);
        }

        if(entity.isSaddled()) {
            model.getBone("saddle").ifPresent(b -> b.setHidden(false));
            model.getBone("saddle_remove").ifPresent(b -> b.setHidden(true));
        } else {
            model.getBone("saddle").ifPresent(b -> b.setHidden(true));
            model.getBone("saddle_remove").ifPresent(b -> b.setHidden(false));
        }

        super.preRender(poseStack, animatable, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }

}


