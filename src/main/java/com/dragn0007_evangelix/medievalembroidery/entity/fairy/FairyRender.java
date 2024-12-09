package com.dragn0007_evangelix.medievalembroidery.entity.fairy;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class FairyRender extends GeoEntityRenderer<Fairy> {
    public FairyRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new FairyModel());
    }
    protected int getBlockLightLevel(Fairy p_174146_, BlockPos p_174147_) {
        int i = (int) Mth.clampedLerp(0.0F, 15.0F, 1.0F - (float)p_174146_.getDarkTicksRemaining() / 10.0F);
        return i == 15 ? 15 : Math.max(i, super.getBlockLightLevel(p_174146_, p_174147_));
    }
}
