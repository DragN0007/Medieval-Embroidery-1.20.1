package com.dragn0007_evangelix.medievalembroidery.client.render.armor;

import com.dragn0007_evangelix.medievalembroidery.client.model.armor.FangedElkSkullModel;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.FangedElkArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FangedElkSkullRender extends GeoArmorRenderer<FangedElkArmorItem> {
    public FangedElkSkullRender() {
        super(new FangedElkSkullModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
