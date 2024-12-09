package com.dragn0007_evangelix.medievalembroidery.item.custom;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;

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


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player playerEntity, InteractionHand hand) {
        return ItemUtils.startUsingInstantly(level, playerEntity, hand);
    }
        @Override
        public ItemStack finishUsingItem(ItemStack p_42984_, Level p_42985_, LivingEntity p_42986_) {
            Player player = p_42986_ instanceof Player ? (Player)p_42986_ : null;
            if (player instanceof ServerPlayer) {
                CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer)player, p_42984_);
            }

            if (!p_42985_.isClientSide) {
                for(MobEffectInstance mobeffectinstance : PotionUtils.getMobEffects(p_42984_)) {
                    if (mobeffectinstance.getEffect().isInstantenous()) {
                        mobeffectinstance.getEffect().applyInstantenousEffect(player, player, p_42986_, mobeffectinstance.getAmplifier(), 1.0D);
                    } else {
                        p_42986_.addEffect(new MobEffectInstance(mobeffectinstance));
                    }
                }
            }

            if (player != null) {
                player.awardStat(Stats.ITEM_USED.get(this));
                if (!player.getAbilities().instabuild) {
                    p_42984_.shrink(1);
                }
            }

            if (player == null || !player.getAbilities().instabuild) {
                if (p_42984_.isEmpty()) {
                    return new ItemStack(Items.GLASS_BOTTLE);
                }

                if (player != null) {
                    player.getInventory().add(new ItemStack(Items.GLASS_BOTTLE));
                }
            }

            p_42985_.gameEvent(p_42986_, GameEvent.DRINKING_FINISH, p_42986_.eyeBlockPosition());
            return p_42984_;
        }
}

