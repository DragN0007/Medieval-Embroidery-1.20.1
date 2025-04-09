package com.dragn0007_evangelix.medievalembroidery.entity.ai;

import com.dragn0007_evangelix.medievalembroidery.entity.util.AbstractMount;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.target.TargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;

import java.util.EnumSet;

public class MEOwnerHurtTargetGoal extends TargetGoal {
   private final AbstractMount tameAnimal;
   private LivingEntity ownerLastHurt;
   private int timestamp;

   public MEOwnerHurtTargetGoal(AbstractMount p_26114_) {
      super(p_26114_, false);
      this.tameAnimal = p_26114_;
      this.setFlags(EnumSet.of(Flag.TARGET));
   }

   public boolean canUse() {
      if (this.tameAnimal.isTamed()) {
         LivingEntity livingentity = this.tameAnimal.getOwner();
         if (livingentity == null) {
            return false;
         } else {
            this.ownerLastHurt = livingentity.getLastHurtMob();
            int i = livingentity.getLastHurtMobTimestamp();
            return i != this.timestamp && this.canAttack(this.ownerLastHurt, TargetingConditions.DEFAULT) && this.tameAnimal.wantsToAttack(this.ownerLastHurt, livingentity);
         }
      } else {
         return false;
      }
   }

   public void start() {
      this.mob.setTarget(this.ownerLastHurt);
      LivingEntity livingentity = this.tameAnimal.getOwner();
      if (livingentity != null) {
         this.timestamp = livingentity.getLastHurtMobTimestamp();
      }

      super.start();
   }
}