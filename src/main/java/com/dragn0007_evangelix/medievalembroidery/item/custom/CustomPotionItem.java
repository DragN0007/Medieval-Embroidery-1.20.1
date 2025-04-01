package com.dragn0007_evangelix.medievalembroidery.item.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;

public class CustomPotionItem extends Item {

    public MobEffectInstance[] effectInstances;

    public CustomPotionItem(MobEffectInstance... effectInstances) {
        super(new Properties().craftRemainder(Items.GLASS_BOTTLE));
        this.effectInstances = effectInstances;
    }


    public SoundEvent getDrinkingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }

    @Override
    public int getUseDuration(ItemStack pStack) {
        return 32;
    }

}

