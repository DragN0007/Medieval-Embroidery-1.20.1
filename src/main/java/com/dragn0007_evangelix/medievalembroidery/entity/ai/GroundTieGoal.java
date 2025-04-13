package com.dragn0007_evangelix.medievalembroidery.entity.ai;

import com.dragn0007_evangelix.medievalembroidery.entity.util.AbstractMount;
import com.dragn0007_evangelix.medievalembroidery.util.MedievalEmbroideryCommonConfig;
import net.minecraft.world.entity.ai.goal.Goal;

import java.util.EnumSet;

public class GroundTieGoal extends Goal {
    private final AbstractMount mob;

    public GroundTieGoal(AbstractMount oMount) {
        this.mob = oMount;
        this.setFlags(EnumSet.of(Flag.JUMP, Flag.MOVE));
    }

    public boolean canContinueToUse() {
        return this.mob.isSaddled() && !this.mob.isVehicle() && MedievalEmbroideryCommonConfig.GROUND_TIE.get() || this.mob.isLeashed();
    }

    public boolean canUse() {
        if (!MedievalEmbroideryCommonConfig.GROUND_TIE.get()) {
            return false;
        } else if (this.mob.isInWaterOrBubble()) {
            return false;
        } else if (!this.mob.onGround()) {
            return false;
        } else {
            return this.mob.isSaddled() && !this.mob.isVehicle() && MedievalEmbroideryCommonConfig.GROUND_TIE.get() || this.mob.isLeashed();
        }
    }

    public void start() {
        this.mob.getNavigation().stop();
    }

    public void stop() {
    }
}
