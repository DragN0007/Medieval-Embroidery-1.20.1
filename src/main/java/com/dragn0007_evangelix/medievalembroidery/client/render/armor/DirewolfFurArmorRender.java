package com.dragn0007_evangelix.medievalembroidery.client.render.armor;

import com.dragn0007.medievalembroidery.client.model.armor.DirewolfFurArmorModel;
import com.dragn0007.medievalembroidery.item.custom.armor.DirewolfArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class DirewolfFurArmorRender extends GeoArmorRenderer<DirewolfArmorItem> {
    public DirewolfFurArmorRender() {
        super(new DirewolfFurArmorModel());

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
