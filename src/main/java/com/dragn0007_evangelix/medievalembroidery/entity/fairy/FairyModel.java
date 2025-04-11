package com.dragn0007_evangelix.medievalembroidery.entity.fairy;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FairyModel extends GeoModel<Fairy> {

    public enum Variant {
        BLUE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fairy/fairy_blue.png")),
        PURPLE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fairy/fairy_purple.png")),
        YELLOW(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fairy/fairy_yellow.png")),
        LIGHT_BLUE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fairy/fairy_light_blue.png")),
        CHERRY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fairy/fairy_cherry.png")),
        MANGROVE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fairy/fairy_mangrove.png")),
        SWEET_BERRY(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fairy/fairy_sweet_berry.png")),
        DEEPSLATE(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fairy/fairy_deepslate.png")),
        RED_MUSHROOM(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fairy/fairy_red_mushroom.png")),
        BROWN_MUSHROOM(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fairy/fairy_brown_mushroom.png")),
        LICHEN(new ResourceLocation(MedievalEmbroidery.MODID, "textures/entity/fairy/fairy_lichen.png")),
        ;

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation ANIMATION = new ResourceLocation(MedievalEmbroidery.MODID, "animations/fairy.animation.json");
    public static final ResourceLocation REINDEER_MODEL = new ResourceLocation(MedievalEmbroidery.MODID, "geo/fairy.geo.json");

    @Override
    public ResourceLocation getModelResource(Fairy object) {
        return REINDEER_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(Fairy object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationResource(Fairy animatable) {
        return ANIMATION;
    }
}

