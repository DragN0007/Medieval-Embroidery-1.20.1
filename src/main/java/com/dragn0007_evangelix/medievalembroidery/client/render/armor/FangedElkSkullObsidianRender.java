package com.dragn0007_evangelix.medievalembroidery.client.render.armor;

import com.dragn0007.medievalembroidery.client.model.armor.FangedElkSkullObsidianModel;
import com.dragn0007.medievalembroidery.item.custom.armor.FangedElkObsidianArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FangedElkSkullObsidianRender extends GeoArmorRenderer<FangedElkObsidianArmorItem> {
    public FangedElkSkullObsidianRender() {
        super(new FangedElkSkullObsidianModel());

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
