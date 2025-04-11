package com.dragn0007_evangelix.medievalembroidery.entity.fairy;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class FairyRender extends GeoEntityRenderer<Fairy> {

    public FairyRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new FairyModel());
    }

    protected int getBlockLightLevel(Fairy fairy, BlockPos pos) {
        int i = (int) Mth.clampedLerp(0.0F, 15.0F, 1.0F - (float)fairy.getDarkTicksRemaining() / 10.0F);
        return i == 15 ? 15 : Math.max(i, super.getBlockLightLevel(fairy, pos));
    }

    @Override
    public void render(Fairy entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {

        if(entity.isBaby()) {
            poseStack.scale(0.5F, 0.5F, 0.5F);
        } else {
            poseStack.scale(1F, 1F, 1F);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

}


