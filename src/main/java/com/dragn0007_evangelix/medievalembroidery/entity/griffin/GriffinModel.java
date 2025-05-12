package com.dragn0007_evangelix.medievalembroidery.entity.griffin;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GriffinModel extends GeoModel<Griffin> {

    public enum Variant {
        BAY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/bay.png")),
        BLACK(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/black.png")),
        BLUE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/blue.png")),
        BROWN(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/brown.png")),
        CHESTNUT(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/chestnut.png")),
        DARK_BROWN(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/dark_brown.png")),
        GOLD(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/gold.png")),
        GREY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/grey.png")),
        LIGHT_GREY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/light_grey.png")),
        TAN(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/tan.png")),
        RED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/red.png")),
        WHITE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/white.png")),
        BALD_EAGLE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/bald.png")),
        HUMMINGBIRD(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/griffin/hummingbird.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation LARGE_ANIMATION = new ResourceLocation(MedievalEmbroidery.MODID, "animations/griffin.animation.json");
    public static final ResourceLocation MEDIUM_ANIMATION = new ResourceLocation(MedievalEmbroidery.MODID, "animations/medium_griffin.animation.json");
    public static final ResourceLocation SMALL_ANIMATION = new ResourceLocation(MedievalEmbroidery.MODID, "animations/small_griffin.animation.json");
    public static final ResourceLocation MODEL = new ResourceLocation(MedievalEmbroidery.MODID, "geo/hawk_griffin.geo.json");

    @Override
    public ResourceLocation getModelResource(Griffin object) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(Griffin object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationResource(Griffin animatable) {
        return LARGE_ANIMATION;
    }
}

