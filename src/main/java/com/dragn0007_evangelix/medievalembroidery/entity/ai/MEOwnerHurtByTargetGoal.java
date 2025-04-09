package com.dragn0007_evangelix.medievalembroidery.entity.ai;

import com.dragn0007_evangelix.medievalembroidery.entity.util.AbstractMount;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.target.TargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;

import java.util.EnumSet;

public class MEOwnerHurtByTargetGoal extends TargetGoal {
   private final AbstractMount tameAnimal;
   private LivingEntity ownerLastHurtBy;
   private int timestamp;

   public MEOwnerHurtByTargetGoal(AbstractMount p_26107_) {
      super(p_26107_, false);
      this.tameAnimal = p_26107_;
      this.setFlags(EnumSet.of(Flag.TARGET));
   }

   public boolean canUse() {
      if (this.tameAnimal.isTamed()) {
         LivingEntity livingentity = this.tameAnimal.getOwner();
         if (livingentity == null) {
            return false;
         } else {
            this.ownerLastHurtBy = livingentity.getLastHurtByMob();
            int i = livingentity.getLastHurtByMobTimestamp();
            return i != this.timestamp && this.canAttack(this.ownerLastHurtBy, TargetingConditions.DEFAULT) && this.tameAnimal.wantsToAttack(this.ownerLastHurtBy, livingentity);
         }
      } else {
         return false;
      }
   }

   public void start() {
      this.mob.setTarget(this.ownerLastHurtBy);
      LivingEntity livingentity = this.tameAnimal.getOwner();
      if (livingentity != null) {
         this.timestamp = livingentity.getLastHurtByMobTimestamp();
      }

      super.start();
   }
}