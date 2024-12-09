package com.dragn0007_evangelix.medievalembroidery.client.model.armor;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import com.dragn0007.medievalembroidery.item.custom.armor.FangedElkIronArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FangedElkSkullIronModel extends AnimatedGeoModel<FangedElkIronArmorItem> {
    @Override
    public ResourceLocation getModelLocation(FangedElkIronArmorItem object) {
        return new ResourceLocation(MedievalEmbroideryMain.MODID, "geo/fanged_elk_skull.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(FangedElkIronArmorItem object) {
        return new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/armor/fangedelk/fanged_elk_skull_iron.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FangedElkIronArmorItem animatable) {
        return null;
    }
}
