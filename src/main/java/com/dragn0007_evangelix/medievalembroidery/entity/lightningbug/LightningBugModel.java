package com.dragn0007_evangelix.medievalembroidery.entity.lightningbug;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LightningBugModel extends AnimatedGeoModel<LightningBugEntity> {
    
    public enum Variant {
        A (new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/entities/lightning_bug.png")
        );
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(MedievalEmbroideryMain.MODID, "geo/lightning_bug.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(MedievalEmbroideryMain.MODID, "animations/fly.animation.json");

    @Override
    public ResourceLocation getModelLocation(LightningBugEntity object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(LightningBugEntity object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LightningBugEntity animatable) {
        return animation;
    }
}
