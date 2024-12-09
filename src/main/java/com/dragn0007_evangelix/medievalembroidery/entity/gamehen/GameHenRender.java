package com.dragn0007_evangelix.medievalembroidery.entity.gamehen;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GameHenRender extends GeoEntityRenderer<GameHenEntity> {
    public GameHenRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GameHenModel());
    }
}
