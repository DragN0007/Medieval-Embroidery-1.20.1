package com.dragn0007_evangelix.medievalembroidery.entity.turkey;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TurkeyRender extends GeoEntityRenderer<TurkeyEntity> {
    public TurkeyRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TurkeyModel());
    }
}
