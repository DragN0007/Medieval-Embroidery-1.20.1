package com.dragn0007_evangelix.medievalembroidery.client.render.armor;

import com.dragn0007.medievalembroidery.client.model.armor.FangedElkSkullGoldModel;
import com.dragn0007.medievalembroidery.item.custom.armor.FangedElkGoldArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FangedElkSkullGoldRender extends GeoArmorRenderer<FangedElkGoldArmorItem> {
    public FangedElkSkullGoldRender() {
        super(new FangedElkSkullGoldModel());

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
