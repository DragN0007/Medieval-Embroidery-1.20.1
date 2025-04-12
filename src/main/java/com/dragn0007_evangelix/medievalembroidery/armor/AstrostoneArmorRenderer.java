package com.dragn0007_evangelix.medievalembroidery.armor;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.AstrostoneArmorItem;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import software.bernie.example.item.WolfArmorItem;
import software.bernie.example.registry.ItemRegistry;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;

import java.util.Set;


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
