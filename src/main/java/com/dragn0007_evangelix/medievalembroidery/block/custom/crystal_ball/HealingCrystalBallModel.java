package com.dragn0007_evangelix.medievalembroidery.block.custom.crystal_ball;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HealingCrystalBallModel extends GeoModel<HealingCrystalBallEntity> {
    @Override
    public ResourceLocation getModelResource(HealingCrystalBallEntity object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "geo/crystal_ball.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HealingCrystalBallEntity object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "textures/block/healing_crystal_ball.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HealingCrystalBallEntity animatable) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "animations/crystal_ball.animation.json");
    }
}