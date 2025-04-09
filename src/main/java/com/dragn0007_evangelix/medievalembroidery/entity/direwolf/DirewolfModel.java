package com.dragn0007_evangelix.medievalembroidery.entity.direwolf;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DirewolfModel extends GeoModel<Direwolf> {

    public enum Variant {
        BLUE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/direwolf/direwolf_blue.png")),
        BLACK(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/direwolf/direwolf_black.png")),
        BROWN(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/direwolf/direwolf_brown.png")),
        PURPLE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/direwolf/direwolf_purple.png")),
        RED(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/direwolf/direwolf_red.png")),
        WHITE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/direwolf/direwolf_white.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation ANIMATION = new ResourceLocation(MedievalEmbroidery.MODID, "animations/direwolf.animation.json");
    public static final ResourceLocation REINDEER_MODEL = new ResourceLocation(MedievalEmbroidery.MODID, "geo/direwolf.geo.json");

    @Override
    public ResourceLocation getModelResource(Direwolf object) {
        return REINDEER_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(Direwolf object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationResource(Direwolf animatable) {
        return ANIMATION;
    }
}

