package com.dragn0007_evangelix.medievalembroidery.entity.griffin;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.event.MedievalEmbroideryClientEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class GriffinModel extends DefaultedEntityGeoModel<Griffin> {

    public GriffinModel() {
        super(new ResourceLocation(MedievalEmbroidery.MODID, "griffin"), true);
    }

    // flying notes

    // S = Pull Up
    // W = Dive
    // A & D = Strafe
    // Ctrl = Flap (Fly Faster) - uses stam
    // Alt = Soar (Cruise) - replenishes stam
    // Nothing = Hover (Stay in Place) - does not use or replenish stam

    // griffins can dive or flap/ sprint to go faster
    // there should be some sort of speed cap like eyltras to prevent server lag (configurable?)
    // below is flying mechanic rotations v
    // may have to be switched to something else if it ends up replicating itself onto other griffins client-side
    // I don't know how this will react in a server environment
    // -dragoon

    @Override
    public void setCustomAnimations(Griffin animatable, long instanceId, AnimationState<Griffin> animationState) {

        // Z = Roll
        // Y = Pitch
        // X = Yaw

        EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

        CoreGeoBone neck = getAnimationProcessor().getBone("neck");
        CoreGeoBone body = getAnimationProcessor().getBone("body");

        if (neck != null) {
            neck.setRotX(neck.getRotX() + (entityData.headPitch() * Mth.DEG_TO_RAD));
            float maxYaw = Mth.clamp(entityData.netHeadYaw(), -25.0f, 25.0f);
            neck.setRotY(neck.getRotY() + (maxYaw * Mth.DEG_TO_RAD));
        }

        if (Minecraft.getInstance().player != null &&
                Minecraft.getInstance().player.getVehicle() == animatable) {

            if (animatable.getControllingPassenger() instanceof LocalPlayer player) {
                if (player.input.left) {
                    body.setRotZ(25 * (Mth.DEG_TO_RAD));
                } else if (player.input.right) {
                    body.setRotZ(-25 * (Mth.DEG_TO_RAD));
                }
            }
        }

    }

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

