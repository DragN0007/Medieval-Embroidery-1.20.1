package com.dragn0007_evangelix.medievalembroidery.entity.fairy;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FairyModel extends AnimatedGeoModel<Fairy> {
    
    public enum Variant {
        A (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/fairy/fairy_1.png")),
        B (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/fairy/fairy_2.png")),
        C (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/fairy/fairy_3.png")),
        D (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/fairy/fairy_4.png")),
        E (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/fairy/fairy_5.png")),
        F (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/fairy_6.png")),
        G (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/fairy_7.png"));
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(MedievalEmbroideryMain.MODID, "geo/fairy.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(MedievalEmbroideryMain.MODID, "animations/fly.animation.json");

    @Override
    public ResourceLocation getModelLocation(Fairy object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Fairy object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Fairy animatable) {
        return animation;
    }
}
