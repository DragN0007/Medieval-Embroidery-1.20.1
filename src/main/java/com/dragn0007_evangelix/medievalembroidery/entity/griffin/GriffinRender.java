package com.dragn0007_evangelix.medievalembroidery.entity.griffin;

import com.dragn0007_evangelix.medievalembroidery.event.MedievalEmbroideryClientEvent;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GriffinRender extends GeoEntityRenderer<Griffin> {

    public GriffinRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GriffinModel());
        this.addRenderLayer(new GriffinFeatheringLayer(this));
        this.addRenderLayer(new GriffinBeakLayer(this));
        this.addRenderLayer(new GriffinMarkingLayer(this));
        this.addRenderLayer(new GriffinTackLayer(this));
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
    public void preRender(PoseStack poseStack, Griffin entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {

        if(entity.isBaby()) {
            poseStack.scale(0.5F, 0.5F, 0.5F);
        } else {
            poseStack.scale(1F, 1F, 1F);
        }

        if(entity.isSaddled()) {
            model.getBone("saddle").ifPresent(b -> b.setHidden(false));
        } else {
            model.getBone("saddle").ifPresent(b -> b.setHidden(true));
        }

        // Z = Roll
        // Y = Pitch
        // X = Yaw

        // griffin should roll slightly when strafing/ turning
        if(entity.isVehicle() && entity.isFlying()) {
            if (MedievalEmbroideryClientEvent.STRAFE_LEFT.isDown()) {
                model.getBone("body").ifPresent(b -> b.setRotZ(-15F));
            } else if(MedievalEmbroideryClientEvent.STRAFE_RIGHT.isDown()) {
                model.getBone("body").ifPresent(b -> b.setRotZ(15F));
            } else if ((MedievalEmbroideryClientEvent.STRAFE_RIGHT.isDown() && MedievalEmbroideryClientEvent.STRAFE_LEFT.isDown())) {
                model.getBone("body").ifPresent(b -> b.setRotZ(0));
            }
        }

        // griffin should yaw slightly when diving or flying up
        if(entity.isVehicle() && entity.isFlying()) {
            if (MedievalEmbroideryClientEvent.FLY_DOWN.isDown()) {
                model.getBone("body").ifPresent(b -> b.setRotX(-15F));
            } else if(MedievalEmbroideryClientEvent.FLY_UP.isDown()) {
                model.getBone("body").ifPresent(b -> b.setRotX(15F));
            } else if ((MedievalEmbroideryClientEvent.FLY_DOWN.isDown() && MedievalEmbroideryClientEvent.FLY_UP.isDown())) {
                model.getBone("body").ifPresent(b -> b.setRotX(0));
            }
        }

        super.preRender(poseStack, animatable, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }

}


