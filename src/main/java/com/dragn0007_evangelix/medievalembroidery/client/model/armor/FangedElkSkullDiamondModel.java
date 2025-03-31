package com.dragn0007_evangelix.medievalembroidery.client.model.armor;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.FangedElkDiamondArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FangedElkSkullDiamondModel extends AnimatedGeoModel<FangedElkDiamondArmorItem> {
    @Override
    public ResourceLocation getModelLocation(FangedElkDiamondArmorItem object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "geo/fanged_elk_skull.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(FangedElkDiamondArmorItem object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "textures/armor/fangedelk/fanged_elk_skull_diamond.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FangedElkDiamondArmorItem animatable) {
        return null;
    }
}
