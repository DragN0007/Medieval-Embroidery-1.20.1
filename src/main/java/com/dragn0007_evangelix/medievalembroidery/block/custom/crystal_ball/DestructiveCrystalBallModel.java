package com.dragn0007_evangelix.medievalembroidery.block.custom.crystal_ball;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DestructiveCrystalBallModel extends GeoModel<DestructiveCrystalBallEntity> {
    @Override
    public ResourceLocation getModelResource(DestructiveCrystalBallEntity object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "geo/crystal_ball.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DestructiveCrystalBallEntity object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "textures/block/destructive_crystal_ball.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DestructiveCrystalBallEntity animatable) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "animations/crystal_ball.animation.json");
    }
}