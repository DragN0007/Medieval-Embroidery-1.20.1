package com.dragn0007_evangelix.medievalembroidery.client.render.armor;

import com.dragn0007.medievalembroidery.client.model.armor.FangedElkSkullDiamondModel;
import com.dragn0007.medievalembroidery.item.custom.armor.FangedElkDiamondArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FangedElkSkullDiamondRender extends GeoArmorRenderer<FangedElkDiamondArmorItem> {
    public FangedElkSkullDiamondRender() {
        super(new FangedElkSkullDiamondModel());

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
