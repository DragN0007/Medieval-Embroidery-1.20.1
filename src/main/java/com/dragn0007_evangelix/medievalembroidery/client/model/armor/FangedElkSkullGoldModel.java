package com.dragn0007_evangelix.medievalembroidery.client.model.armor;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.FangedElkGoldArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FangedElkSkullGoldModel extends AnimatedGeoModel<FangedElkGoldArmorItem> {
    @Override
    public ResourceLocation getModelLocation(FangedElkGoldArmorItem object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "geo/fanged_elk_skull.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(FangedElkGoldArmorItem object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "textures/armor/fangedelk/fanged_elk_skull_gold.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FangedElkGoldArmorItem animatable) {
        return null;
    }
}
