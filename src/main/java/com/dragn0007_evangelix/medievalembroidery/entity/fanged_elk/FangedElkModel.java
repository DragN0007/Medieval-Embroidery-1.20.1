package com.dragn0007_evangelix.medievalembroidery.entity.fanged_elk;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FangedElkModel extends GeoModel<FangedElk> {

    public enum Variant {
        BLUE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fanged_elk/fanged_elk_blue.png")),
        BLACK(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fanged_elk/fanged_elk_black.png")),
        BROWN(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fanged_elk/fanged_elk_brown.png")),
        BURGUNDY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fanged_elk/fanged_elk_burgundy.png")),
        WHITE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fanged_elk/fanged_elk_white.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation ANIMATION = new ResourceLocation(MedievalEmbroidery.MODID, "animations/fanged_elk.animation.json");
    public static final ResourceLocation MODEL = new ResourceLocation(MedievalEmbroidery.MODID, "geo/fanged_elk.geo.json");

    @Override
    public ResourceLocation getModelResource(FangedElk object) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(FangedElk object) {
        return object.getTextureResource();
    }

    @Override
    public ResourceLocation getAnimationResource(FangedElk animatable) {
        return ANIMATION;
    }
}

