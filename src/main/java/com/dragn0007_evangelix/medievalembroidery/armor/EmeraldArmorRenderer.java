package com.dragn0007_evangelix.medievalembroidery.armor;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.EmeraldArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public final class EmeraldArmorRenderer extends GeoArmorRenderer<EmeraldArmorItem> {

	public EmeraldArmorRenderer() {

		super(new GeoModel<>() {
			@Override
			public ResourceLocation getModelResource(EmeraldArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "geo/high_armor.geo.json");
			}

			@Override
			public ResourceLocation getTextureResource(EmeraldArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "textures/armor/emerald_armor.png");
			}

			@Override
			public ResourceLocation getAnimationResource(EmeraldArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "animations/high_armor.animation.json");
			}
		});
	}
}
