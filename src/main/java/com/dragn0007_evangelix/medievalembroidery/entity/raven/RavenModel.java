package com.dragn0007_evangelix.medievalembroidery.entity.raven;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RavenModel extends AnimatedGeoModel<Raven> {

    public enum Variant {
        A (new ResourceLocation(MedievalEmbroidery.MODID, "textures/entities/raven.png")
        );

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation MODEL = new ResourceLocation (MedievalEmbroidery.MODID, "geo/raven.geo.json");
    public static final ResourceLocation ANIMATION = new ResourceLocation (MedievalEmbroidery.MODID, "animations/raven.animation.json");

    @Override
    public ResourceLocation getModelLocation(Raven object) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureLocation(Raven object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Raven animatable) {
        return ANIMATION;
    }
}
