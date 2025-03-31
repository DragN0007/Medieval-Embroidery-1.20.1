package com.dragn0007_evangelix.medievalembroidery.client.model.item;

import com.dragn0007_evangelix.medievalembroidery.client.MEResources;
import com.dragn0007_evangelix.medievalembroidery.item.custom.GrimoireItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GrimoireModel extends AnimatedGeoModel<GrimoireItem> {
	@Override
	public ResourceLocation getModelLocation(GrimoireItem object) {
		return MEResources.GRIMOIRE_MODEL;
	}

	@Override
	public ResourceLocation getTextureLocation(GrimoireItem object) {
		return MEResources.GRIMOIRE_TEXTURE;
	}

	@Override
	public ResourceLocation getAnimationFileLocation(GrimoireItem animatable) {
		return MEResources.GRIMOIRE_ANIMATIONS;
	}
}
