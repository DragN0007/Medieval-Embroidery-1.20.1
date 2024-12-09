package com.dragn0007_evangelix.medievalembroidery.entity.gamehen;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GameHenModel extends AnimatedGeoModel<GameHenEntity> {
    
    public enum Variant {
        GOLD (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/hen_1.png")),
        WHITE (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/hen_2.png")),
        BLACK (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/hen_3.png"));
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(MedievalEmbroideryMain.MODID, "geo/cornish_hen.geo.json");
    public static final ResourceLocation babyModel = new ResourceLocation (MedievalEmbroideryMain.MODID, "geo/cornishhen_chick.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(MedievalEmbroideryMain.MODID, "animations/turkey.animation.json");



    @Override
    public ResourceLocation getModelLocation(GameHenEntity object) {
        if(object.isBaby())
        return babyModel;
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(GameHenEntity object) {
        if(object.isBaby())
        return (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/cornish_hen_chick.png"));
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GameHenEntity animatable) {
        return animation;
    }
}
