package com.dragn0007_evangelix.medievalembroidery.entity.turkey;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TurkeyModel extends AnimatedGeoModel<TurkeyEntity> {
    
    public enum Variant {
        A (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/turkey.png"));
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(MedievalEmbroideryMain.MODID, "geo/turkey.geo.json");
    public static final ResourceLocation babyModel = new ResourceLocation (MedievalEmbroideryMain.MODID, "geo/turkey_chick.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(MedievalEmbroideryMain.MODID, "animations/turkey.animation.json");



    @Override
    public ResourceLocation getModelLocation(TurkeyEntity object) {
        if(object.isBaby())
        return babyModel;
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(TurkeyEntity object) {
        if(object.isBaby())
        return (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/turkey_chick.png"));
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TurkeyEntity animatable) {
        return animation;
    }
}
