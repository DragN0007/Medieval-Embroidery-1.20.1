package com.dragn0007_evangelix.medievalembroidery.client.model.armor;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import com.dragn0007.medievalembroidery.item.custom.armor.BoarArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BoarFurArmorModel extends AnimatedGeoModel<BoarArmorItem> {
    @Override
    public ResourceLocation getModelLocation(BoarArmorItem object) {
        return new ResourceLocation(MedievalEmbroideryMain.MODID, "geo/boar_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BoarArmorItem object) {
        return new ResourceLocation(MedievalEmbroideryMain.MODID, "textures/armor/boar/boar_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BoarArmorItem animatable) {
        return new ResourceLocation(MedievalEmbroideryMain.MODID, "animations/direwolf_armor.animation.json");
    }
}
