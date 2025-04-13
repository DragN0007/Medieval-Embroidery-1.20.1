package com.dragn0007_evangelix.medievalembroidery.armor;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.AstrostoneArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public final class AstrostoneArmorRenderer extends GeoArmorRenderer<AstrostoneArmorItem> {

	public AstrostoneArmorRenderer() {

		super(new GeoModel<>() {
			@Override
			public ResourceLocation getModelResource(AstrostoneArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "geo/gem_armor.geo.json");
			}

			@Override
			public ResourceLocation getTextureResource(AstrostoneArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "textures/armor/astrostone_armor_heart.png");
			}

			@Override
			public ResourceLocation getAnimationResource(AstrostoneArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "animations/gem_armor.animation.json");
			}
		});
	}
}
