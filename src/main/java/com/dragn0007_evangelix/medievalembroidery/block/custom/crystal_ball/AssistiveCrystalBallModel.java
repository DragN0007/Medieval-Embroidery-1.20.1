package com.dragn0007_evangelix.medievalembroidery.block.custom.crystal_ball;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AssistiveCrystalBallModel extends GeoModel<AssistiveCrystalBallEntity> {
    @Override
    public ResourceLocation getModelResource(AssistiveCrystalBallEntity object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "geo/crystal_ball.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AssistiveCrystalBallEntity object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "textures/block/assistive_crystal_ball.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AssistiveCrystalBallEntity animatable) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "animations/crystal_ball.animation.json");
    }
}