package com.dragn0007_evangelix.medievalembroidery.block.custom.crystal_ball;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ProtectiveCrystalBallModel extends GeoModel<ProtectiveCrystalBallEntity> {
    @Override
    public ResourceLocation getModelResource(ProtectiveCrystalBallEntity object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "geo/crystal_ball.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ProtectiveCrystalBallEntity object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "textures/block/protective_crystal_ball.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ProtectiveCrystalBallEntity animatable) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "animations/crystal_ball.animation.json");
    }
}