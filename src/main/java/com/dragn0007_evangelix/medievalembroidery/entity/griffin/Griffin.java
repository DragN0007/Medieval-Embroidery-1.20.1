package com.dragn0007_evangelix.medievalembroidery.entity.griffin;

import com.dragn0007_evangelix.medievalembroidery.entity.EntityTypes;
import com.dragn0007_evangelix.medievalembroidery.entity.ai.MEOwnerHurtByTargetGoal;
import com.dragn0007_evangelix.medievalembroidery.entity.ai.MEOwnerHurtTargetGoal;
import com.dragn0007_evangelix.medievalembroidery.entity.ai.MESitWhenOrderedToGoal;
import com.dragn0007_evangelix.medievalembroidery.entity.util.AbstractMount;
import com.dragn0007_evangelix.medievalembroidery.event.MedievalEmbroideryClientEvent;
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
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
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
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;
import java.util.Random;

public class Griffin extends AbstractMount implements GeoEntity {

	public Griffin(EntityType<? extends Griffin> type, Level level) {
		super(type, level);
//		this.moveControl = new FlyingMoveControl(this, 10, false);
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
		return false;
	}

	public static AttributeSupplier.Builder createAttributes() {
		return Mob.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 80.0D)
				.add(Attributes.ATTACK_DAMAGE, 4D)
				.add(Attributes.KNOCKBACK_RESISTANCE, 0.8F)
				.add(Attributes.ARMOR_TOUGHNESS, 3D)
				.add(Attributes.ARMOR, 1D)
				.add(Attributes.MOVEMENT_SPEED, 0.26F)
				.add(Attributes.FLYING_SPEED, 0.26F);
	}

//	protected PathNavigation createNavigation(Level level) {
//		FlyingPathNavigation flyingpathnavigation = new FlyingPathNavigation(this, level);
//		flyingpathnavigation.setCanOpenDoors(false);
//		flyingpathnavigation.setCanFloat(true);
//		flyingpathnavigation.setCanPassDoors(true);
//		return flyingpathnavigation;
//	}

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
//		this.goalSelector.addGoal(5, new WaterAvoidingRandomFlyingGoal(this, 1.0D));
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 2.0D, true));
		this.goalSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Monster.class, false));

		this.goalSelector.addGoal(0, new MESitWhenOrderedToGoal(this));
		this.goalSelector.addGoal(1, new MEOwnerHurtByTargetGoal(this));
		this.goalSelector.addGoal(1, new MEOwnerHurtTargetGoal(this));
		this.goalSelector.addGoal(3, new SearchForCarnivoreFoodGoal());

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

	protected Vec2 getRiddenRotation(LivingEntity p_275502_) {
		return new Vec2(p_275502_.getXRot() * 0.5F, p_275502_.getYRot());
	}

	//TODO; Flying stuff
	public void travel(Vec3 vec3) {
		if (this.isVehicle() && this.hasControllingPassenger()) {
			LivingEntity livingentity = (LivingEntity) this.getControllingPassenger();
			this.setYRot(livingentity.getYRot());
			this.yRotO = this.getYRot();
			this.setXRot(livingentity.getXRot() * 0.5F);
			this.setRot(this.getYRot(), this.getXRot());
			this.yBodyRot = this.getYRot();
			float strafeSpeed = livingentity.xxa * 0.5F;
			float forwardSpeed = livingentity.zza;
			double verticalMovement = vec3.y;
			double maxVerticalMovement = verticalMovement * MedievalEmbroideryCommonConfig.MAX_GRIFFIN_SPEED_MULTIPLIER.get();

			if (MedievalEmbroideryClientEvent.TAKE_OFF.isDown() && !this.isFlying()) {
				verticalMovement = 0.4D;
			}

			if (this.isFlying() && this.isVehicle()) {
				if (MedievalEmbroideryClientEvent.FLY_DOWN.isDown()) {
					if (diveTime == 20) {
						forwardSpeed = forwardSpeed * 1.3F;
						verticalMovement = verticalMovement * -1.3D;
					} else if (diveTime == 40) {
						forwardSpeed = forwardSpeed * 1.4F;
						verticalMovement = verticalMovement * -1.4D;
					} else if (diveTime == 60) {
						forwardSpeed = forwardSpeed * 1.5F;
						verticalMovement = verticalMovement * -1.5D;
					} else if (diveTime == 80) {
						forwardSpeed = forwardSpeed * 1.6F;
						verticalMovement = verticalMovement * -1.6D;
					} else if (diveTime == 100) {
						forwardSpeed = forwardSpeed * 1.7F;
						verticalMovement = verticalMovement * -1.7D;
					} else if (diveTime == 120) {
						forwardSpeed = forwardSpeed * 1.8F;
						verticalMovement = verticalMovement * -1.8D;
					} else if (diveTime == 140) {
						forwardSpeed = forwardSpeed * 1.9F;
						verticalMovement = verticalMovement * -1.9D;
					} else if (diveTime == 160) {
						forwardSpeed = forwardSpeed * 2.0F;
						verticalMovement = verticalMovement * -2.0D;
					}
				}

				if (MedievalEmbroideryClientEvent.FLY_UP.isDown()) {
					if (diveTime == 20) {
						forwardSpeed = forwardSpeed * 1.3F;
						verticalMovement = verticalMovement * 0.5D;
					} else if (diveTime == 40) {
						forwardSpeed = forwardSpeed * 1.4F;
						verticalMovement = verticalMovement * 0.6D;
					} else if (diveTime == 60) {
						forwardSpeed = forwardSpeed * 1.5F;
						verticalMovement = verticalMovement * 0.7D;
					} else if (diveTime == 80) {
						forwardSpeed = forwardSpeed * 1.6F;
						verticalMovement = verticalMovement * 0.8D;
					} else if (diveTime == 100) {
						forwardSpeed = forwardSpeed * 1.7F;
						verticalMovement = verticalMovement * 0.9D;
					} else if (diveTime == 120) {
						forwardSpeed = forwardSpeed * 1.8F;
						verticalMovement = verticalMovement * 1.0D;
					} else if (diveTime == 140) {
						forwardSpeed = forwardSpeed * 1.9F;
						verticalMovement = verticalMovement * 1.1D;
					} else if (diveTime == 160) {
						forwardSpeed = forwardSpeed * 0.4F;
						verticalMovement = verticalMovement * 1.2D;
					}
				}
			}

		}
		super.travel(vec3);
	}

	private boolean diving = false;
	public boolean isDiving() {
		return this.diving;
	}
	public void setDiving(boolean dive) {
		this.diving = dive;
	}

	private boolean flapping = false;
	public boolean isFlapping() {
		return this.flapping;
	}
	public void setFlapping(boolean flap) {
		this.flapping = flap;
	}

	private boolean soarFlapping = false;
	public boolean isSoarFlapping() {
		return this.soarFlapping;
	}
	public void setSoarFlapping(boolean soarFlap) {
		this.soarFlapping = soarFlap;
	}

	private boolean flying = false;
	public boolean isFlying() {
		return this.flying;
	}
	public void setFlying(boolean fly) {
		this.flying = fly;
	}

	private boolean soaring = false;
	public boolean isSoaring() {
		return this.soaring;
	}
	public void setSoaring(boolean soar) {
		this.soaring = soar;
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

		if (!this.isTamed() && this.isBaby() && this.isFood(itemStack) && this.random.nextInt(30) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, player)) {
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

	public int flapCounter = this.random.nextInt(1600) + 1600;
	public int regenHealthCounter = 0;
	public int diveTime = 160;

	//TODO; Flying stuff
	public void tick() {
		super.tick();

		setFlying(!this.onGround());
		setSoaring(this.isFlying() && !this.isFlapping());

		regenHealthCounter++;

		if (this.getHealth() < this.getMaxHealth() && regenHealthCounter >= 300 && this.isAlive()) {
			this.setHealth(this.getHealth() + 2);
			regenHealthCounter = 0;
			this.level().addParticle(ParticleTypes.HEART, this.getRandomX(0.6D), this.getRandomY(), this.getRandomZ(0.6D), 0.7D, 0.7D, 0.7D);
		}


		if (this.isFlying() && this.isVehicle()) {
			if (this.isSoaring()) {
				flapCounter--;
			}

			if (--this.flapCounter <= 1) {
				setSoarFlapping(true);
				if (--this.flapCounter <= 0) {
					this.flapCounter = this.random.nextInt(3600) + 3600;
					setSoarFlapping(false);
				}
			}

			setFlapping(MedievalEmbroideryClientEvent.FLY_UP.isDown());

			if (MedievalEmbroideryClientEvent.FLY_DOWN.isDown() && diveTime < 161) {
				diveTime++;
			} else if (!MedievalEmbroideryClientEvent.FLY_DOWN.isDown() && diveTime > 0) {
				diveTime--;
			}
		}

	}

	public void aiStep() {
		super.aiStep();
		Vec3 vec3 = this.getDeltaMovement();
		if (!this.onGround() && vec3.y < 0.0D) {
			this.setDeltaMovement(vec3.multiply(1.0D, 0.6D, 1.0D));
		}
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
		return 1.0F;
	}

	public final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

	public <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
		double currentSpeed = this.getDeltaMovement().lengthSqr();
		double speedThreshold = 0.02;

		double x = this.getX() - this.xo;
		double z = this.getZ() - this.zo;
		boolean isMoving = (x * x + z * z) > 0.0001;

		AnimationController<T> controller = tAnimationState.getController();

		if (!this.isFlying()) {
			if (isMoving) {
				if ((currentSpeed > speedThreshold) || (this.isVehicle() && this.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(SPRINT_SPEED_MOD))) {
					controller.setAnimation(RawAnimation.begin().then("run", Animation.LoopType.LOOP));
					controller.setAnimationSpeed(2.0);
				} else if (this.isVehicle() && this.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(WALK_SPEED_MOD)) {
					controller.setAnimation(RawAnimation.begin().then("walk", Animation.LoopType.LOOP));
					controller.setAnimationSpeed(2.4);
				} else {
					controller.setAnimation(RawAnimation.begin().then("walk", Animation.LoopType.LOOP));
					controller.setAnimationSpeed(1.5);
				}
			} else if (this.isInSittingPose()) {
				controller.setAnimation(RawAnimation.begin().then("idle_sit", Animation.LoopType.LOOP));
				controller.setAnimationSpeed(0.8);
			} else {
				controller.setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
				controller.setAnimationSpeed(0.8);
			}
		}

		//TODO; Flying Stuff

		else if (this.isFlying()) {
			if (isMoving) {
				if ((this.isVehicle() && this.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(SPRINT_SPEED_MOD)) || this.isFlapping()) {
					controller.setAnimation(RawAnimation.begin().then("flap", Animation.LoopType.LOOP));
					controller.setAnimationSpeed(1.0);
				} else if ((this.isVehicle() && this.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(WALK_SPEED_MOD)) || this.isSoaring()) {
					controller.setAnimation(RawAnimation.begin().then("soar", Animation.LoopType.LOOP));
					controller.setAnimationSpeed(1.0);
				} else {
					controller.setAnimation(RawAnimation.begin().then("flap", Animation.LoopType.LOOP));
					controller.setAnimationSpeed(1.0);
				}
			} else if (this.isSoarFlapping()) {
				controller.setAnimation(RawAnimation.begin().then("flap_once", Animation.LoopType.PLAY_ONCE));
				controller.setAnimationSpeed(1.0);
			} else {
				controller.setAnimation(RawAnimation.begin().then("hover", Animation.LoopType.LOOP));
				controller.setAnimationSpeed(1.0);
			}
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
		return SoundEvents.CAT_PURR;
	}

	public SoundEvent getDeathSound() {
		super.getDeathSound();
		return SoundEvents.CAT_HISS;
	}

	public SoundEvent getHurtSound(DamageSource p_30720_) {
		super.getHurtSound(p_30720_);
		return SoundEvents.PHANTOM_HURT;
	}

	public void playStepSound(BlockPos p_28254_, BlockState p_28255_) {
		this.playSound(SoundEvents.WOLF_STEP, 0.15F, 1.0F);
	}

	@Override
	public void positionRider(Entity entity, MoveFunction moveFunction) {
		if (this.hasPassenger(entity)) {
			double offsetX = 0.0;
			double offsetY = 1.15;
			double offsetZ = 0.01;

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
		return GriffinModel.Variant.variantFromOrdinal(getVariant()).resourceLocation;
	}

	public ResourceLocation getOverlayLocation() {
		return GriffinMarkingLayer.Overlay.overlayFromOrdinal(getOverlayVariant()).resourceLocation;
	}

	public ResourceLocation getFeatheringLocation() {
		return GriffinFeatheringLayer.Overlay.overlayFromOrdinal(getFeatherVariant()).resourceLocation;
	}

	public ResourceLocation getBeakLocation() {
		return GriffinBeakLayer.Overlay.overlayFromOrdinal(getBeakVariant()).resourceLocation;
	}

	public static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(Griffin.class, EntityDataSerializers.INT);

	public int getVariant() {
		return this.entityData.get(VARIANT);
	}

	public void setVariant(int variant) {
		this.entityData.set(VARIANT, variant);
	}

	public static final EntityDataAccessor<Integer> OVERLAY = SynchedEntityData.defineId(Griffin.class, EntityDataSerializers.INT);

	public int getOverlayVariant() {
		return this.entityData.get(OVERLAY);
	}

	public void setOverlayVariant(int variant) {
		this.entityData.set(OVERLAY, variant);
	}

	public static final EntityDataAccessor<Integer> FEATHERING = SynchedEntityData.defineId(Griffin.class, EntityDataSerializers.INT);

	public int getFeatherVariant() {
		return this.entityData.get(FEATHERING);
	}

	public void setFeatherVariant(int variant) {
		this.entityData.set(FEATHERING, variant);
	}

	public static final EntityDataAccessor<Integer> BEAK = SynchedEntityData.defineId(Griffin.class, EntityDataSerializers.INT);

	public int getBeakVariant() {
		return this.entityData.get(BEAK);
	}

	public void setBeakVariant(int variant) {
		this.entityData.set(BEAK, variant);
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

		if (tag.contains("Feathering")) {
			setFeatherVariant(tag.getInt("Feathering"));
		}

		if (tag.contains("Beak")) {
			setBeakVariant(tag.getInt("Beak"));
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
		tag.putInt("Feathering", getFeatherVariant());
		tag.putInt("Beak", getBeakVariant());
		tag.putInt("Gender", getGender());
	}

	@Override
	@Nullable
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor serverLevelAccessor, DifficultyInstance instance, MobSpawnType spawnType, @Nullable SpawnGroupData data, @Nullable CompoundTag tag) {
		if (data == null) {
			data = new AgeableMobGroupData(0.2F);
		}
		Random random = new Random();

		setGender(random.nextInt(Gender.values().length));
		setVariant(random.nextInt(GriffinModel.Variant.values().length));
		setOverlayVariant(random.nextInt(GriffinMarkingLayer.Overlay.values().length));
		setFeatherVariant(random.nextInt(GriffinFeatheringLayer.Overlay.values().length));
		setBeakVariant(random.nextInt(GriffinBeakLayer.Overlay.values().length));

		return super.finalizeSpawn(serverLevelAccessor, instance, spawnType, data, tag);
	}

	public boolean canParent() {
		return !this.isVehicle() && !this.isBaby() && this.isInLove();
	}

	public boolean canMate(Animal animal) {
		if (animal == this) {
			return false;
		} else if (!(animal instanceof Griffin)) {
			return false;
		} else {
			if (!MedievalEmbroideryCommonConfig.GENDERS_AFFECT_BREEDING.get()) {
				return this.canParent() && ((Griffin) animal).canParent();
			} else {
				Griffin partner = (Griffin) animal;
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
		Griffin ageableMob1 = (Griffin) ageableMob;

		if (ageableMob instanceof Griffin) {
			Griffin mob = (Griffin) ageableMob;
			ageableMob1 = EntityTypes.GRIFFIN_ENTITY.get().create(serverLevel);

			int i = this.random.nextInt(9);
			int variant;
			if (i < 4) {
				variant = this.getVariant();
			} else if (i < 8) {
				variant = mob.getVariant();
			} else {
				variant = this.random.nextInt(GriffinModel.Variant.values().length);
			}

			int j = this.random.nextInt(5);
			int overlay;
			if (j < 2) {
				overlay = this.getOverlayVariant();
			} else if (j < 4) {
				overlay = mob.getOverlayVariant();
			} else {
				overlay = this.random.nextInt(GriffinMarkingLayer.Overlay.values().length);
			}

			int k = this.random.nextInt(5);
			int eyes;
			if (k < 2) {
				eyes = this.getFeatherVariant();
			} else if (k < 4) {
				eyes = mob.getFeatherVariant();
			} else {
				eyes = this.random.nextInt(GriffinFeatheringLayer.Overlay.values().length);
			}

			int gender;
			gender = this.random.nextInt(Gender.values().length);

			ageableMob1.setVariant(variant);
			ageableMob1.setOverlayVariant(overlay);
			ageableMob1.setFeatherVariant(eyes);
			ageableMob1.setGender(gender);
		}

		return ageableMob1;
	}

	@Override
	public void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(VARIANT, 0);
		this.entityData.define(OVERLAY, 0);
		this.entityData.define(FEATHERING, 0);
		this.entityData.define(BEAK, 0);
		this.entityData.define(GENDER, 0);
	}

}
