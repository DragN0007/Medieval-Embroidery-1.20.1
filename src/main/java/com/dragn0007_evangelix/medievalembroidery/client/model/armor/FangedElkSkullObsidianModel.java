package com.dragn0007_evangelix.medievalembroidery.client.model.armor;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import com.dragn0007.medievalembroidery.item.custom.armor.FangedElkObsidianArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FangedElkSkullObsidianModel extends AnimatedGeoModel<FangedElkObsidianArmorItem> {
    @Override
    public ResourceLocation getModelLocation(FangedElkObsidianArmorItem object) {
        return new ResourceLocation(MedievalEmbroideryMain.MODID, "geo/fanged_elk_skull.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(FangedElkObsidianArmorItem object) {
        return new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/armor/fangedelk/fanged_elk_skull_obsidian.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FangedElkObsidianArmorItem animatable) {
        return null;
    }
}
