package com.dragn0007_evangelix.medievalembroidery.client.render.armor;

import com.dragn0007_evangelix.medievalembroidery.client.model.armor.FangedElkSkullNetheriteModel;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.FangedElkNetheriteArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FangedElkSkullNetheriteRender extends GeoArmorRenderer<FangedElkNetheriteArmorItem> {
    public FangedElkSkullNetheriteRender() {
        super(new FangedElkSkullNetheriteModel());

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
