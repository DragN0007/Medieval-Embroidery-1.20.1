package com.dragn0007_evangelix.medievalembroidery.item.custom;

import com.dragn0007_evangelix.medievalembroidery.item.MEItemGroup;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class MEAlcoholItem extends Item {


    public MobEffectInstance[] effectInstances;

    public MEAlcoholItem(MobEffectInstance... effectInstances) {
        super(new Properties().craftRemainder(Items.GLASS_BOTTLE).craftRemainder(Items.GLASS_BOTTLE).tab(MEItemGroup.FOOD_GROUP));
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

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player playerEntity, InteractionHand hand) {
        return ItemUtils.startUsingInstantly(level, playerEntity, hand);
    }
    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        if (!pLevel.isClientSide) {
            for (int i = 0; i < effectInstances.length; i++) {
                pLivingEntity.addEffect(effectInstances[i]);
            }
            pLivingEntity.getItemInHand(InteractionHand.MAIN_HAND).shrink(1);
        }
        return super.finishUsingItem(pStack, pLevel, pLivingEntity);

    }
}

