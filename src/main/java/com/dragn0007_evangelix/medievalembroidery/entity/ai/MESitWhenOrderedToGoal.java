package com.dragn0007_evangelix.medievalembroidery.entity.ai;

import java.util.EnumSet;

import com.dragn0007_evangelix.medievalembroidery.entity.util.AbstractMount;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.goal.Goal;

public class MESitWhenOrderedToGoal extends Goal {
   private final AbstractMount mob;

   public MESitWhenOrderedToGoal(AbstractMount p_25898_) {
      this.mob = p_25898_;
      this.setFlags(EnumSet.of(Goal.Flag.JUMP, Goal.Flag.MOVE));
   }

   public boolean canContinueToUse() {
      return this.mob.isOrderedToSit();
   }

   public boolean canUse() {
      if (!this.mob.isTamed()) {
         return false;
      } else if (this.mob.isInWaterOrBubble()) {
         return false;
      } else if (!this.mob.onGround()) {
         return false;
      } else {
         LivingEntity livingentity = this.mob.getOwner();
         if (livingentity == null) {
            return true;
         } else {
            return this.mob.distanceToSqr(livingentity) < 144.0D && livingentity.getLastHurtByMob() != null ? false : this.mob.isOrderedToSit();
         }
      }
   }

   public void start() {
      this.mob.getNavigation().stop();
      this.mob.setInSittingPose(true);
   }

   public void stop() {
      this.mob.setInSittingPose(false);
   }
}