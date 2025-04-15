package com.dragn0007_evangelix.medievalembroidery.armor;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.SkystoneArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public final class SkystoneArmorRenderer extends GeoArmorRenderer<SkystoneArmorItem> {

	public SkystoneArmorRenderer() {

		super(new GeoModel<>() {
			@Override
			public ResourceLocation getModelResource(SkystoneArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "geo/gem_armor.geo.json");
			}

			@Override
			public ResourceLocation getTextureResource(SkystoneArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "textures/armor/seastone_armor_heart.png");
			}

			@Override
			public ResourceLocation getAnimationResource(SkystoneArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "animations/gem_armor.animation.json");
			}
		});
	}
}
