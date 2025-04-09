package com.dragn0007_evangelix.medievalembroidery.entity.direwolf;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class DirewolfRender extends GeoEntityRenderer<Direwolf> {

    public DirewolfRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DirewolfModel());
        this.addRenderLayer(new DirewolfMarkingLayer(this));
        this.addRenderLayer(new DirewolfEyeLayer(this));
        this.addRenderLayer(new DirewolfTackLayer(this));
    }

    @Override
    public void render(Direwolf entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {

        if(entity.isBaby()) {
            poseStack.scale(0.5F, 0.5F, 0.5F);
        } else {
            poseStack.scale(1F, 1F, 1F);
        }

        if(!entity.isBaby() && entity.isMale()) {
            poseStack.scale(1.1F, 1.1F, 1.1F);
        } else if (!entity.isBaby() && entity.isFemale()) {
            poseStack.scale(1F, 1F, 1F);
        }

        if(entity.isSaddled()) {
            model.getBone("saddle").ifPresent(b -> b.setHidden(false));
        } else {
            model.getBone("saddle").ifPresent(b -> b.setHidden(true));
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

}


