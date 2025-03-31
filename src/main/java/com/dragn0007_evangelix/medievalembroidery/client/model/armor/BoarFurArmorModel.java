package com.dragn0007_evangelix.medievalembroidery.client.model.armor;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.BoarArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BoarFurArmorModel extends AnimatedGeoModel<BoarArmorItem> {
    @Override
    public ResourceLocation getModelLocation(BoarArmorItem object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "geo/boar_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BoarArmorItem object) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "textures/armor/boar/boar_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BoarArmorItem animatable) {
        return new ResourceLocation(MedievalEmbroidery.MODID, "animations/direwolf_armor.animation.json");
    }
}
