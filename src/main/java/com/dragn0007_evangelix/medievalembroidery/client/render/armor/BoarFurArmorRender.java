package com.dragn0007_evangelix.medievalembroidery.client.render.armor;

import com.dragn0007.medievalembroidery.client.model.armor.BoarFurArmorModel;
import com.dragn0007.medievalembroidery.item.custom.armor.BoarArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BoarFurArmorRender extends GeoArmorRenderer<BoarArmorItem> {
    public BoarFurArmorRender() {
        super(new BoarFurArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
