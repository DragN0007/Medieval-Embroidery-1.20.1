package com.dragn0007_evangelix.medievalembroidery.entity.direwolf;

import com.dragn0007_evangelix.medievalembroidery.entity.EntityTypes;
import com.dragn0007_evangelix.medievalembroidery.entity.ai.DirewolfFollowPackLeaderGoal;
import com.dragn0007_evangelix.medievalembroidery.entity.ai.MEOwnerHurtByTargetGoal;
import com.dragn0007_evangelix.medievalembroidery.entity.ai.MEOwnerHurtTargetGoal;
import com.dragn0007_evangelix.medievalembroidery.entity.ai.MESitWhenOrderedToGoal;
import com.dragn0007_evangelix.medievalembroidery.entity.util.AbstractMount;
import com.dragn0007_evangelix.medievalembroidery.util.METags;
import com.dragn0007_evangelix.medievalembroidery.util.MedievalEmbroideryCommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.Animation;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.stream.Stream;

public class Direwolf extends AbstractMount implements GeoEntity {

	public Direwolf(EntityType<? extends Direwolf> type, Level level) {
		super(type, level);
	}

	@Override
	public boolean canWearArmor() {
		return false;
	}
	@Override
	public boolean canWearCarpet() {
		return false;
	}
	@Override
	public boolean canWearChest() {
		return false;
	}
	@Override
	public boolean canJump() {
		return true;
	}

	public static AttributeSupplier.Builder createAttributes() {
		return Mob.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 45.0D)
				.add(Attributes.ATTACK_DAMAGE, 4D)
				.add(Attributes.KNOCKBACK_RESISTANCE, 0.6F)
				.add(Attributes.ARMOR_TOUGHNESS, 3D)
				.add(Attributes.ARMOR, 1D)
				.add(Attributes.MOVEMENT_SPEED, 0.26F)
				.add(Attributes.JUMP_STRENGTH, 0.6F);
	}

	public static final Ingredient FOOD_ITEMS = Ingredient.of(METags.Items.CARNIVORE_EATS);
	public boolean isFood(ItemStack itemStack) {
		return FOOD_ITEMS.test(itemStack);
	}

	public void registerGoals() {
		this.goalSelector.addGoal(0, new FloatGoal(this));
		this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
		this.goalSelector.addGoal(1, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new BreedGoal(this, 1.0D));
		this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0D));
		this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 2.0D, true));
		this.goalSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Monster.class, false));

		this.goalSelector.addGoal(0, new MESitWhenOrderedToGoal(this));
		this.goalSelector.addGoal(1, new MEOwnerHurtByTargetGoal(this));
		this.goalSelector.addGoal(1, new MEOwnerHurtTargetGoal(this));
		this.goalSelector.addGoal(3, new SearchForCarnivoreFoodGoal());
		this.goalSelector.addGoal(3, new DirewolfFollowPackLeaderGoal(this));

		this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Player.class, 15.0F, 1.8F, 1.8F,
				entity -> entity instanceof Player && this.isBaby()));

		this.goalSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, 3, true, false,
				entity -> entity instanceof Player && !this.isBaby() && !this.isTamed()));

		this.goalSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 3, true, false,
				entity -> entity.getType().is(METags.Entity_Types.MEDIUM_PREDATOR_PREY) && !this.isBaby() && !this.isTamed()));

		this.goalSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 3, true, false,
				entity -> entity.getType().is(METags.Entity_Types.PREDATORS) && !entity.getType().is(METags.Entity_Types.LARGE_PREDATORS) && !this.isBaby() && !(entity.getType() == (EntityTypes.DIREWOLF_ENTITY.get())) && !this.isTamed()));

		this.goalSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 3, true, false,
				entity -> entity.getType().is(METags.Entity_Types.HERBIVORES) && !this.isBaby() && !this.isTamed()));
	}

	public void openInventory(Player player) {
		return;
	}

	public InteractionResult mobInteract(Player player, InteractionHand hand) {
		InteractionResult interactionresult = super.mobInteract(player, hand);
		ItemStack itemStack = player.getItemInHand(hand);

		if (itemStack.is(Items.SHEARS) && player.isShiftKeyDown() && isOwnedBy(player)) {
			if (this.isSaddled()) {
				this.dropEquipment();
				this.inventory.removeAllItems();
				this.playChestEquipsSound();

				return InteractionResult.sidedSuccess(this.level().isClientSide);
			}
		}

		if (this.isOwnedBy(player) && player.isSecondaryUseActive()) {
			this.setOrderedToSit(!this.isOrderedToSit());
			this.jumping = false;
			this.navigation.stop();
			this.setTarget(null);
			return InteractionResult.SUCCESS;
		}

		if (this.isFood(itemStack) && this.isTamed()) {
			int i = this.getAge();
			if (!this.level().isClientSide && i == 0 && this.canFallInLove()) {
				this.usePlayerItem(player, hand, itemStack);
				this.setInLove(player);
				return InteractionResult.SUCCESS;
			}
		}

		if (!this.isTamed() && this.isFood(itemStack) && this.random.nextInt(5) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, player)) {
			this.tame(player);
			return InteractionResult.SUCCESS;
		}

		if (this.isTamed() && this.isBaby() && this.isFood(itemStack)) {
			int i = this.getAge();
			this.usePlayerItem(player, hand, itemStack);
			this.ageUp(getSpeedUpSecondsWhenFeeding(-i), true);
			return InteractionResult.sidedSuccess(this.level().isClientSide);
		}

		if(!this.isBaby()) {
			if(this.isVehicle()) {
				return super.mobInteract(player, hand);
			}
		}

		if (this.level().isClientSide) {
			boolean flag = this.isOwnedBy(player) || this.isTamed() || this.isFood(itemStack) && !this.isTamed();
			return flag ? InteractionResult.CONSUME : InteractionResult.PASS;
		} else if (this.isTamed()) {
			if (this.isFood(itemStack) && this.getHealth() < this.getMaxHealth()) {
				this.heal(2.0F);

				if (!player.getAbilities().instabuild) {
					itemStack.shrink(1);
				}

				this.gameEvent(GameEvent.EAT, this);
				return InteractionResult.SUCCESS;
			} else {
				return interactionresult;
			}
		}

		if(this.isBaby() || !this.isOwnedBy(player) || this.isInSittingPose()) {
			return super.mobInteract(player, hand);
		} else {
			this.doPlayerRide(player);
			return InteractionResult.sidedSuccess(this.level().isClientSide);
		}
	}

	public Direwolf leader;
	public int packSize = 1;

	public int getMaxHerdSize() {
		return MedievalEmbroideryCommonConfig.DIREWOLF_MAX_PACK_COUNT.get();
	}

	public boolean hasFollowers() {
		return this.packSize > 1;
	}

	public boolean inRangeOfLeader() {
		return this.distanceToSqr(this.leader) <= 121.0D;
	}

	public void pathToLeader() {
		if (this.isFollower()) {
			this.getNavigation().moveTo(this.leader, 1.0D);
		}

	}

	public void addFollowers(Stream<? extends Direwolf> p_27534_) {
		p_27534_.limit((long)(this.getMaxHerdSize() - this.packSize)).filter((mob) -> {
			return mob != this;
		}).forEach((mob) -> {
			mob.startFollowing(this);
		});
	}

	public boolean isFollower() {
		return this.leader != null && this.leader.isAlive();
	}

	public Direwolf startFollowing(Direwolf mob) {
		this.leader = mob;
		mob.addFollower();
		return mob;
	}

	public void stopFollowing() {
		this.leader.removeFollower();
		this.leader = null;
	}

	public void addFollower() {
		++this.packSize;
	}

	public void removeFollower() {
		--this.packSize;
	}

	public boolean canBeFollowed() {
		return this.hasFollowers() && this.packSize < this.getMaxHerdSize();
	}

	public int regenHealthCounter = 0;

	public void tick() {
		super.tick();

		regenHealthCounter++;

		if (this.getHealth() < this.getMaxHealth() && regenHealthCounter >= 300 && this.isAlive()) {
			this.setHealth(this.getHealth() + 2);
			regenHealthCounter = 0;
			this.level().addParticle(ParticleTypes.HEART, this.getRandomX(0.6D), this.getRandomY(), this.getRandomZ(0.6D), 0.7D, 0.7D, 0.7D);
		}

		if (this.isOnSnow()) {
			if (!this.hasSpeedEffect()) {
				this.applySpeedEffect();
			}
		} else {
			if (this.hasSpeedEffect()) {
				this.removeSpeedEffect();
			}
		}

		if (this.hasFollowers()) {
			if (!this.hasStrengthEffect()) {
				this.applyStrengthEffect();
			}
		} else {
			if (this.hasStrengthEffect()) {
				this.removeStrengthEffect();
			}
		}

	}

	public void applySpeedEffect() {
		MobEffectInstance effectInstance = new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0, false, false);
		this.addEffect(effectInstance);
	}

	public boolean hasSpeedEffect() {
		return this.hasEffect(MobEffects.MOVEMENT_SPEED);
	}

	public void removeSpeedEffect() {
		this.removeEffect(MobEffects.MOVEMENT_SPEED);
	}

	public void applyStrengthEffect() {
		MobEffectInstance effectInstance = new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0, false, false);
		this.addEffect(effectInstance);
	}

	public boolean hasStrengthEffect() {
		return this.hasEffect(MobEffects.DAMAGE_BOOST);
	}

	public void removeStrengthEffect() {
		this.removeEffect(MobEffects.DAMAGE_BOOST);
	}

	public boolean hurt(DamageSource source, float v) {
		super.hurt(source, v);
		Entity entity = source.getDirectEntity();
		if (entity instanceof AbstractArrow) {
			return false;
		}
		return true;
	}

	@Override
	public float getStepHeight() {
		return 1.6F;
	}

	public final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

	public <T extends GeoAnimatable> PlayState predicate(software.bernie.geckolib.core.animation.AnimationState<T> tAnimationState) {
		double currentSpeed = this.getDeltaMovement().lengthSqr();
		double speedThreshold = 0.02;

		double x = this.getX() - this.xo;
		double z = this.getZ() - this.zo;
		boolean isMoving = (x * x + z * z) > 0.0001;

		AnimationController<T> controller = tAnimationState.getController();

		if (isMoving) {
			if (hasSpeedEffect()) {
				controller.setAnimation(RawAnimation.begin().then("run", Animation.LoopType.LOOP));
				controller.setAnimationSpeed(1.6);
			} else if ((!hasSpeedEffect() && currentSpeed > speedThreshold) || (this.isVehicle() && this.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(SPRINT_SPEED_MOD))) {
				controller.setAnimation(RawAnimation.begin().then("run", Animation.LoopType.LOOP));
				controller.setAnimationSpeed(2.2);
			} else if (this.isVehicle() && this.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(WALK_SPEED_MOD)) {
				controller.setAnimation(RawAnimation.begin().then("walk", Animation.LoopType.LOOP));
				controller.setAnimationSpeed(1.6);
			} else {
				controller.setAnimation(RawAnimation.begin().then("walk", Animation.LoopType.LOOP));
				controller.setAnimationSpeed(1.5);
			}
		} else if (this.isInSittingPose()) {
			controller.setAnimation(RawAnimation.begin().then("sit", Animation.LoopType.LOOP));
			controller.setAnimationSpeed(0.8);
		} else {
			controller.setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
			controller.setAnimationSpeed(0.8);
		}

		return PlayState.CONTINUE;
	}

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
		controllers.add(new AnimationController<>(this, "controller", 2, this::predicate));
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.geoCache;
	}

	public SoundEvent getAmbientSound() {
		super.getAmbientSound();
		return SoundEvents.WOLF_GROWL;
	}

	public SoundEvent getDeathSound() {
		super.getDeathSound();
		return SoundEvents.WOLF_DEATH;
	}

	public SoundEvent getHurtSound(DamageSource p_30720_) {
		super.getHurtSound(p_30720_);
		return SoundEvents.WOLF_HURT;
	}

	public void playStepSound(BlockPos p_28254_, BlockState p_28255_) {
		this.playSound(SoundEvents.WOLF_STEP, 0.15F, 1.0F);
	}

	@Override
	public void positionRider(Entity entity, Entity.MoveFunction moveFunction) {
		if (this.hasPassenger(entity)) {
			double offsetX = 0.0;
			double offsetY = 1.0;
			double offsetZ = -0.3;

			if (this.isMale()) {
				offsetY = 1.1;
			}

			double radYaw = Math.toRadians(this.getYRot());

			double offsetXRotated = offsetX * Math.cos(radYaw) - offsetZ * Math.sin(radYaw);
			double offsetYRotated = offsetY;
			double offsetZRotated = offsetX * Math.sin(radYaw) + offsetZ * Math.cos(radYaw);

			double x = this.getX() + offsetXRotated;
			double y = this.getY() + offsetYRotated;
			double z = this.getZ() + offsetZRotated;

			entity.setPos(x, y, z);
		}
	}

	// Generates the base texture
	public ResourceLocation getTextureLocation() {
		return DirewolfModel.Variant.variantFromOrdinal(getVariant()).resourceLocation;
	}

	public ResourceLocation getOverlayLocation() {
		return DirewolfMarkingLayer.Overlay.overlayFromOrdinal(getOverlayVariant()).resourceLocation;
	}

	public ResourceLocation getEyeLocation() {
		return DirewolfEyeLayer.Overlay.overlayFromOrdinal(getEyeVariant()).resourceLocation;
	}

	public static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(Direwolf.class, EntityDataSerializers.INT);

	public int getVariant() {
		return this.entityData.get(VARIANT);
	}

	public void setVariant(int variant) {
		this.entityData.set(VARIANT, variant);
	}

	public static final EntityDataAccessor<Integer> OVERLAY = SynchedEntityData.defineId(Direwolf.class, EntityDataSerializers.INT);

	public int getOverlayVariant() {
		return this.entityData.get(OVERLAY);
	}

	public void setOverlayVariant(int variant) {
		this.entityData.set(OVERLAY, variant);
	}

	public static final EntityDataAccessor<Integer> EYES = SynchedEntityData.defineId(Direwolf.class, EntityDataSerializers.INT);

	public int getEyeVariant() {
		return this.entityData.get(EYES);
	}

	public void setEyeVariant(int variant) {
		this.entityData.set(EYES, variant);
	}

	@Override
	public void readAdditionalSaveData(CompoundTag tag) {
		super.readAdditionalSaveData(tag);

		if (tag.contains("Variant")) {
			setVariant(tag.getInt("Variant"));
		}

		if (tag.contains("Overlay")) {
			setOverlayVariant(tag.getInt("Overlay"));
		}

		if (tag.contains("Eyes")) {
			setEyeVariant(tag.getInt("Eyes"));
		}

		if (tag.contains("Gender")) {
			setGender(tag.getInt("Gender"));
		}
	}

	@Override
	public void addAdditionalSaveData(CompoundTag tag) {
		super.addAdditionalSaveData(tag);
		tag.putInt("Variant", getVariant());
		tag.putInt("Overlay", getOverlayVariant());
		tag.putInt("Eyes", getEyeVariant());
		tag.putInt("Gender", getGender());
	}

	@Override
	@Nullable
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor serverLevelAccessor, DifficultyInstance instance, MobSpawnType spawnType, @Nullable SpawnGroupData data, @Nullable CompoundTag tag) {
		if (data == null) {
			data = new AgeableMob.AgeableMobGroupData(0.2F);
		}
		Random random = new Random();

		setGender(random.nextInt(Gender.values().length));
		setVariant(random.nextInt(DirewolfModel.Variant.values().length));
		setOverlayVariant(random.nextInt(DirewolfMarkingLayer.Overlay.values().length));
		setEyeVariant(random.nextInt(DirewolfEyeLayer.Overlay.values().length));

		return super.finalizeSpawn(serverLevelAccessor, instance, spawnType, data, tag);
	}

	public boolean canParent() {
		return !this.isVehicle() && !this.isBaby() && this.isInLove();
	}

	public boolean canMate(Animal animal) {
		if (animal == this) {
			return false;
		} else if (!(animal instanceof Direwolf)) {
			return false;
		} else {
			if (!MedievalEmbroideryCommonConfig.GENDERS_AFFECT_BREEDING.get()) {
				return this.canParent() && ((Direwolf) animal).canParent();
			} else {
				Direwolf partner = (Direwolf) animal;
				if (this.canParent() && partner.canParent() && this.getGender() != partner.getGender()) {
					return true;
				}

				if (MedievalEmbroideryCommonConfig.GENDERS_AFFECT_BREEDING.get() && this.canParent() && partner.canParent() && this.getGender() != partner.getGender()) {
					return isFemale();
				}
			}
		}
		return false;
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
		Direwolf ageableMob1 = (Direwolf) ageableMob;

		if (ageableMob instanceof Direwolf) {
			Direwolf direwolf = (Direwolf) ageableMob;
			ageableMob1 = EntityTypes.DIREWOLF_ENTITY.get().create(serverLevel);

			int i = this.random.nextInt(9);
			int variant;
			if (i < 4) {
				variant = this.getVariant();
			} else if (i < 8) {
				variant = direwolf.getVariant();
			} else {
				variant = this.random.nextInt(DirewolfModel.Variant.values().length);
			}

			int j = this.random.nextInt(5);
			int overlay;
			if (j < 2) {
				overlay = this.getOverlayVariant();
			} else if (j < 4) {
				overlay = direwolf.getOverlayVariant();
			} else {
				overlay = this.random.nextInt(DirewolfMarkingLayer.Overlay.values().length);
			}

			int k = this.random.nextInt(5);
			int eyes;
			if (k < 2) {
				eyes = this.getEyeVariant();
			} else if (k < 4) {
				eyes = direwolf.getEyeVariant();
			} else {
				eyes = this.random.nextInt(DirewolfEyeLayer.Overlay.values().length);
			}

			int gender;
			gender = this.random.nextInt(Gender.values().length);

			ageableMob1.setVariant(variant);
			ageableMob1.setOverlayVariant(overlay);
			ageableMob1.setEyeVariant(eyes);
			ageableMob1.setGender(gender);
		}

		return ageableMob1;
	}

	@Override
	public void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(VARIANT, 0);
		this.entityData.define(OVERLAY, 0);
		this.entityData.define(EYES, 0);
		this.entityData.define(GENDER, 0);
	}

}
