package com.dragn0007_evangelix.medievalembroidery.block.custom.crystal_ball;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.google.common.collect.Lists;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.Animation;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;

public class ConjuringCrystalBallEntity extends BlockEntity implements GeoBlockEntity {
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	public int tickCount;
	private final List<BlockPos> effectBlocks = Lists.newArrayList();

	public ConjuringCrystalBallEntity(BlockPos pos, BlockState state) {
		super(MEBlocks.CONJURING_CRYSTAL_BALL_ENTITY.get(), pos, state);
	}

	public static void serverTick(Level level, BlockPos pos, BlockState state, ConjuringCrystalBallEntity entity) {
		++entity.tickCount;
		applyEffects(level, pos, entity.effectBlocks);
	}

	private static void applyEffects(Level level, BlockPos pos, List<BlockPos> posList) {
		int i = posList.size();
		int j = i / 7 * 16;
		int k = pos.getX();
		int l = pos.getY();
		int i1 = pos.getZ();
		AABB aabb = (new AABB(k, l, i1, k + 1, l + 1, i1 + 1)).inflate(j).expandTowards(0.0D, level.getHeight(), 0.0D);
		List<Player> list = level.getEntitiesOfClass(Player.class, aabb);
		if (!list.isEmpty()) {
			for(Player player : list) {
				if (pos.closerThan(player.blockPosition(), j)) {
					player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 260, 0, true, true));
				}
			}

		}
	}

	public <T extends GeoAnimatable> PlayState predicate(software.bernie.geckolib.core.animation.AnimationState<T> tAnimationState) {
		AnimationController<T> controller = tAnimationState.getController();

		controller.setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));

		return PlayState.CONTINUE;
	}

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
		controllers.add(new AnimationController<>(this, "controller", 2, this::predicate));
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.cache;
	}
}
