package com.dragn0007_evangelix.medievalembroidery.block.custom.crystal_ball;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ConjuringCrystalBallModel extends GeoModel<ConjuringCrystalBallEntity> {
    @Override
    public ResourceLocation getModelResource(ConjuringCrystalBallEntity object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "geo/crystal_ball.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ConjuringCrystalBallEntity object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "textures/block/conjuring_crystal_ball.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ConjuringCrystalBallEntity animatable) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "animations/crystal_ball.animation.json");
    }
}