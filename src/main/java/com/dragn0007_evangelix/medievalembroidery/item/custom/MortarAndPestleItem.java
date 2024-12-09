package com.dragn0007_evangelix.medievalembroidery.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class MortarAndPestleItem extends Item {
    public MortarAndPestleItem(Properties properties) {
        super(properties);
    }
    @Override
    public boolean hasContainerItem(ItemStack itemStack) {
        return true;
    }
    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return itemStack.copy();
    }
}
