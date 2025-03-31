package com.dragn0007_evangelix.medievalembroidery.client.model.armor;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.FangedElkArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FangedElkSkullModel extends AnimatedGeoModel<FangedElkArmorItem> {
    @Override
    public ResourceLocation getModelLocation(FangedElkArmorItem object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "geo/fanged_elk_skull.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(FangedElkArmorItem object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "textures/armor/fangedelk/fanged_elk_skull.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FangedElkArmorItem animatable) {
        return null;
    }
}
