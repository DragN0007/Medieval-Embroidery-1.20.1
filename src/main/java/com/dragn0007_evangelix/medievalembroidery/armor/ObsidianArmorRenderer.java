package com.dragn0007_evangelix.medievalembroidery.armor;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.AstrostoneArmorItem;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.ObsidianArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public final class ObsidianArmorRenderer extends GeoArmorRenderer<ObsidianArmorItem> {

	public ObsidianArmorRenderer() {

		super(new GeoModel<>() {
			@Override
			public ResourceLocation getModelResource(ObsidianArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "geo/high_armor.geo.json");
			}

			@Override
			public ResourceLocation getTextureResource(ObsidianArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "textures/armor/obsidian_armor.png");
			}

			@Override
			public ResourceLocation getAnimationResource(ObsidianArmorItem animatable) {
				return new ResourceLocation(MedievalEmbroidery.MODID, "animations/high_armor.animation.json");
			}
		});
	}
}
