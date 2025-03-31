package com.dragn0007_evangelix.medievalembroidery.client.model.armor;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.FangedElkNetheriteArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FangedElkSkullNetheriteModel extends AnimatedGeoModel<FangedElkNetheriteArmorItem> {
    @Override
    public ResourceLocation getModelLocation(FangedElkNetheriteArmorItem object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "geo/fanged_elk_skull.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(FangedElkNetheriteArmorItem object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "textures/armor/fangedelk/fanged_elk_skull_netherite.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FangedElkNetheriteArmorItem animatable) {
        return null;
    }
}
