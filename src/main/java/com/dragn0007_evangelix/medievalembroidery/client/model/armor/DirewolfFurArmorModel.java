package com.dragn0007_evangelix.medievalembroidery.client.model.armor;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.DirewolfArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DirewolfFurArmorModel extends AnimatedGeoModel<DirewolfArmorItem> {
    @Override
    public ResourceLocation getModelLocation(DirewolfArmorItem object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "geo/direwolf_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(DirewolfArmorItem object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "textures/armor/direwolf/direwolf_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(DirewolfArmorItem animatable) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "animations/direwolf_armor.animation.json");
    }
}
