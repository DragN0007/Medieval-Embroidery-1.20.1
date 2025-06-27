package com.dragn0007_evangelix.medievalembroidery.entity.fairy;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.entity.fanged_elk.FangedElk;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class FairyModel extends DefaultedEntityGeoModel<Fairy> {

    public FairyModel() {
        super(new ResourceLocation(MedievalEmbroidery.MODID, "fairy"), true);
    }

    @Override
    public void setCustomAnimations(Fairy animatable, long instanceId, AnimationState<Fairy> animationState) {

        CoreGeoBone neck = getAnimationProcessor().getBone("neck");

        if (neck != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            neck.setRotX(neck.getRotX() + (entityData.headPitch() * Mth.DEG_TO_RAD));
            float maxYaw = Mth.clamp(entityData.netHeadYaw(), -25.0f, 25.0f);
            neck.setRotY(neck.getRotY() + (maxYaw * Mth.DEG_TO_RAD));
        }
    }

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

