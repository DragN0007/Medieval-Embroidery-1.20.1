package com.dragn0007_evangelix.medievalembroidery.client.render.item;

import com.dragn0007.medievalembroidery.client.model.item.GrimoireModel;
import com.dragn0007.medievalembroidery.item.custom.GrimoireItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class GrimoireRender extends GeoItemRenderer<GrimoireItem> {
	public GrimoireRender() {
		super(new GrimoireModel());
	}
}
