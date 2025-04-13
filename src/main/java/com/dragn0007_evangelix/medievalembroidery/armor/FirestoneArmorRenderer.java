package com.dragn0007_evangelix.medievalembroidery.armor;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.FirestoneArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public final class FirestoneArmorRenderer extends GeoArmorRenderer<FirestoneArmorItem> {

	public FirestoneArmorRenderer() {

		super(new GeoModel<>() {
			@Override
			public ResourceLocation getModelResource(FirestoneArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "geo/gem_armor.geo.json");
			}

			@Override
			public ResourceLocation getTextureResource(FirestoneArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "textures/armor/depthstone_armor_heart.png");
			}

			@Override
			public ResourceLocation getAnimationResource(FirestoneArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "animations/gem_armor.animation.json");
			}
		});
	}
}
