package com.dragn0007_evangelix.medievalembroidery.entity.fanged_elk;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.entity.direwolf.Direwolf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class FangedElkModel extends DefaultedEntityGeoModel<FangedElk> {

    public FangedElkModel() {
        super(new ResourceLocation(MedievalEmbroidery.MODID, "fanged_elk"), true);
    }

    @Override
    public void setCustomAnimations(FangedElk animatable, long instanceId, AnimationState<FangedElk> animationState) {

        CoreGeoBone neck = getAnimationProcessor().getBone("neck");

        if (neck != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            neck.setRotX(neck.getRotX() + (entityData.headPitch() * Mth.DEG_TO_RAD));
            float maxYaw = Mth.clamp(entityData.netHeadYaw(), -25.0f, 25.0f);
            neck.setRotY(neck.getRotY() + (maxYaw * Mth.DEG_TO_RAD));
        }
    }

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

