package com.dragn0007_evangelix.medievalembroidery.item.custom;

import net.minecraft.world.item.Item;

public class DragonArmorItem extends Item {
   private final int protection;

   public DragonArmorItem(int i, Properties properties) {
      super(properties);
      this.protection = i;
   }

   public int getProtection() {
      return this.protection;
   }
}