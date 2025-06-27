package com.dragn0007_evangelix.medievalembroidery.entity.direwolf;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class DirewolfModel extends DefaultedEntityGeoModel<Direwolf> {

    public DirewolfModel() {
        super(new ResourceLocation(MedievalEmbroidery.MODID, "direwolf"), true);
    }

    @Override
    public void setCustomAnimations(Direwolf animatable, long instanceId, AnimationState<Direwolf> animationState) {

        CoreGeoBone neck = getAnimationProcessor().getBone("neck");
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (neck != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            neck.setRotX(neck.getRotX() + (entityData.headPitch() * Mth.DEG_TO_RAD));
            float maxYaw = Mth.clamp(entityData.netHeadYaw(), -25.0f, 25.0f);
            neck.setRotY(neck.getRotY() + (maxYaw * Mth.DEG_TO_RAD));
        }

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(head.getRotX() + (entityData.headPitch() * Mth.DEG_TO_RAD));
            float maxYaw = Mth.clamp(entityData.netHeadYaw(), -25.0f, 25.0f);
            head.setRotY(head.getRotY() + (maxYaw * Mth.DEG_TO_RAD));
        }
    }

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

