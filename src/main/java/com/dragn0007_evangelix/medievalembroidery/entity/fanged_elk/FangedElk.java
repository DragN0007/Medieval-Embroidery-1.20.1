package com.dragn0007_evangelix.medievalembroidery.entity.fanged_elk;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.entity.EntityTypes;
import com.dragn0007_evangelix.medievalembroidery.entity.ai.GroundTieGoal;
import com.dragn0007_evangelix.medievalembroidery.entity.util.AbstractMount;
import com.dragn0007_evangelix.medievalembroidery.gui.MountMenu;
import com.dragn0007_evangelix.medievalembroidery.util.METags;
import com.dragn0007_evangelix.medievalembroidery.util.MedievalEmbroideryCommonConfig;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.stream.Stream;

public class FangedElk extends AbstractMount implements GeoEntity {

	public FangedElk(EntityType<? extends FangedElk> type, Level level) {
		super(type, level);
	}

	@Override
	public Vec3 getLeashOffset() {
		return new Vec3(0D, (double) this.getEyeHeight() * 0.8F, (double) (this.getBbWidth() * 1.2F));
		//              ^ Side offset                      ^ Height offset                   ^ Length offset
	}

	public static AttributeSupplier.Builder createBaseHorseAttributes() {
		return Mob.createMobAttributes()
				.add(Attributes.JUMP_STRENGTH)
				.add(Attributes.MAX_HEALTH, 55.0D)
				.add(Attributes.MOVEMENT_SPEED, 0.255F)
				.add(Attributes.ATTACK_DAMAGE, 4D);
	}

	public void randomizeAttributes() {
		this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(this.generateRandomMaxHealth());
		this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(this.generateRandomSpeed());
		this.getAttribute(Attributes.JUMP_STRENGTH).setBaseValue(this.generateRandomJumpStrength());
	}

	public static final Ingredient FOOD_ITEMS = Ingredient.of(METags.Items.HERBIVORE_EATS);
	public boolean isFood(ItemStack itemStack) {
		return FOOD_ITEMS.test(itemStack);
	}

	@Override
	public void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(0, new GroundTieGoal(this));

		this.goalSelector.addGoal(1, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 0.7D));
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.4, true));
		this.goalSelector.addGoal(1, new FloatGoal(this));

		this.goalSelector.addGoal(1, new BreedGoal(this, 1.0D, FangedElk.class));
		this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.25D));

		this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, LivingEntity.class, 15.0F, 1.8F, 1.8F, entity ->
				(entity.getType().is(METags.Entity_Types.MEDIUM_PREDATORS) && !this.isTamed()) ||
						(entity.getType().is(METags.Entity_Types.MEDIUM_PREDATORS) && (entity instanceof TamableAnimal && !((TamableAnimal) entity).isTame())) && this.isTamed()
		));
	}

	public float generateRandomMaxHealth() {
		float baseHealth;
		baseHealth = 16.0F;
		return baseHealth + this.random.nextInt(3) + this.random.nextInt(5);
	}

	public double generateRandomJumpStrength() {
		double baseStrength = 0.4F;
		double multiplier = this.random.nextDouble() * 0.2D + this.random.nextDouble() * 0.2D + this.random.nextDouble() * 0.25D;
		baseStrength = 0.55F;
		return baseStrength + multiplier;
	}

	public double generateRandomSpeed() {
		double baseSpeed = 0.0F;
		double multiplier = (this.random.nextDouble() * 0.1D + this.random.nextDouble() * 0.1D + this.random.nextDouble() * 0.1D) * 0.30D;
		baseSpeed = 0.2F;
		return baseSpeed + multiplier;
	}

	protected int getInventorySize() {
		if (this.hasChest()) {
			return 17;
		}
		return super.getInventorySize();
	}

	@Override
	public void positionRider(Entity entity, MoveFunction moveFunction) {
		if (this.hasPassenger(entity)) {

			double offsetX = 0;
			double offsetY = 1.55;
			double offsetZ = -0.2;

			if (this.isJumping()) {
				offsetZ = -0.3;
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

	@Override
	public void openInventory(Player player) {
		if(player instanceof ServerPlayer serverPlayer && this.isTamed()) {
			NetworkHooks.openScreen(serverPlayer, new SimpleMenuProvider((containerId, inventory, p) -> {
				return new MountMenu(containerId, inventory, this.inventory, this);
			}, this.getDisplayName()), (data) -> {
				data.writeInt(this.getInventorySize());
				data.writeInt(this.getId());
			});
		}
	}

	@Override
	public boolean handleEating(Player player, ItemStack stack) {
		int i = 0;
		int j = 0;
		float f = 0.0F;
		boolean flag = false;
		if (stack.is(METags.Items.HERBIVORE_EATS)) {
			i = 90;
			j = 6;
			f = 10.0F;
			if (this.isTamed() && this.getAge() == 0 && this.canFallInLove()) {
				flag = true;
				this.setInLove(player);
			}
		}

		if (this.getHealth() < this.getMaxHealth() && f > 0.0F) {
			this.heal(f);
			flag = true;
		}

		if (this.isBaby() && i > 0) {
			this.level().addParticle(ParticleTypes.HAPPY_VILLAGER, this.getRandomX(1.0D), this.getRandomY() + 0.5D, this.getRandomZ(1.0D), 0.0D, 0.0D, 0.0D);
			if (!this.level().isClientSide) {
				this.ageUp(i);
			}

			flag = true;
		}

		if (j > 0 && (flag || !this.isTamed()) && this.getTemper() < this.getMaxTemper()) {
			flag = true;
			if (!this.level().isClientSide) {
				this.modifyTemper(j);
			}
		}

		if (flag) {
			this.gameEvent(GameEvent.ENTITY_INTERACT);
			if (!this.isSilent()) {
				SoundEvent soundevent = this.getEatingSound();
				if (soundevent != null) {
					this.level().playSound(null, this.getX(), this.getY(), this.getZ(), this.getEatingSound(), this.getSoundSource(), 1.0F, 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F);
				}
			}
		}

		return flag;
	}

	@Override
	protected boolean canPerformRearing() {
		return false;
	}

	private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
		controllers.add(new AnimationController<>(this, "controller", 2, this::predicate));
	}

	private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
		double x = this.getX() - this.xo;
		double z = this.getZ() - this.zo;

		boolean isMoving = (x * x + z * z) > 0.0001;

		double movementSpeed = this.getAttributeBaseValue(Attributes.MOVEMENT_SPEED);
		double animationSpeed = Math.max(0.1, movementSpeed);

		AnimationController<T> controller = tAnimationState.getController();

		if (this.isJumping()) {
			controller.setAnimation(RawAnimation.begin().then("jump", Animation.LoopType.PLAY_ONCE));
			controller.setAnimationSpeed(1.0);
		} else {
			if (isMoving) {
				if (this.isAggressive() || (this.isVehicle() && this.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(SPRINT_SPEED_MOD))) {
					controller.setAnimation(RawAnimation.begin().then("sprint", Animation.LoopType.LOOP));
					controller.setAnimationSpeed(Math.max(0.1, 0.82 * controller.getAnimationSpeed() + animationSpeed));

				} else if (this.isVehicle() && !this.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(WALK_SPEED_MOD) && !this.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(SPRINT_SPEED_MOD)) {
					controller.setAnimation(RawAnimation.begin().then("run", Animation.LoopType.LOOP));
					controller.setAnimationSpeed(Math.max(0.1, 0.8 * controller.getAnimationSpeed() + animationSpeed));

				} else if (this.isOnSand() && this.isVehicle() && !this.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(WALK_SPEED_MOD) && !this.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(SPRINT_SPEED_MOD)) {
					controller.setAnimation(RawAnimation.begin().then("run", Animation.LoopType.LOOP));
					controller.setAnimationSpeed(Math.max(0.1, 0.78 * controller.getAnimationSpeed() + animationSpeed));

				} else {
					controller.setAnimation(RawAnimation.begin().then("walk", Animation.LoopType.LOOP));
					controller.setAnimationSpeed(Math.max(0.1, 0.82 * controller.getAnimationSpeed() + animationSpeed));
				}
			} else {
				if (this.isVehicle() || !MedievalEmbroideryCommonConfig.GROUND_TIE.get()) {
					controller.setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
				} else {
					controller.setAnimation(RawAnimation.begin().then("idle3", Animation.LoopType.LOOP));
				}
				controller.setAnimationSpeed(1.0);
			}
		}
		return PlayState.CONTINUE;
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.geoCache;
	}

	private void applySpeedEffect() {
		MobEffect speedEffect = MobEffect.byId(1);
		MobEffectInstance speedEffectInstance = new MobEffectInstance(speedEffect, 200, 0, false, false);
		this.addEffect(speedEffectInstance);
	}

	private boolean hasSpeedEffect() {
		return this.hasEffect(MobEffect.byId(1));
	}

	private void removeSpeedEffect() {
		this.removeEffect(MobEffect.byId(1));
	}

	@Override
	public InteractionResult mobInteract(Player player, InteractionHand hand) {
		ItemStack itemStack = player.getItemInHand(hand);

		if (itemStack.is(Items.SHEARS) && player.isShiftKeyDown()) {
			if (this.hasChest()) {
				this.dropEquipment();
				this.inventory.removeAllItems();

				this.setChest(false);
				this.playChestEquipsSound();

				return InteractionResult.sidedSuccess(this.level().isClientSide);
			}
		}

		if(!this.isBaby()) {
			if(this.isTamed() && player.isSecondaryUseActive()) {
				this.openInventory(player);
				return InteractionResult.sidedSuccess(this.level().isClientSide);
			}

			if(this.isVehicle()) {
				return super.mobInteract(player, hand);
			}
		}

		if(!itemStack.isEmpty()) {
			if(this.isFood(itemStack)) {
				return this.fedFood(player, itemStack);
			}

			InteractionResult interactionResult = itemStack.interactLivingEntity(player, this, hand);
			if(interactionResult.consumesAction()) {
				return interactionResult;
			}

			if(!this.isTamed()) {
				this.makeMad();
				return InteractionResult.sidedSuccess(this.level().isClientSide);
			}

			if(!this.hasChest() && itemStack.is(Blocks.CHEST.asItem())) {
				this.setChest(true);
				this.playChestEquipsSound();
				if(!player.getAbilities().instabuild) {
					itemStack.shrink(1);
				}

				this.createInventory();
				return InteractionResult.sidedSuccess(this.level().isClientSide);
			}

			boolean canSaddle = !this.isBaby() && !this.isSaddled() && this.isSaddle(itemStack);
			if(this.isArmor(itemStack) || canSaddle) {
				this.openInventory(player);
				return InteractionResult.sidedSuccess(this.level().isClientSide);
			}
		}

		if(this.isBaby()) {
			return super.mobInteract(player, hand);
		} else {
			this.doPlayerRide(player);
			return InteractionResult.sidedSuccess(this.level().isClientSide);
		}
	}

	public FangedElk leader;
	public int herdSize = 1;

	public int getMaxHerdSize() {
		return MedievalEmbroideryCommonConfig.ELK_MAX_HERD_COUNT.get();
	}

	public boolean hasFollowers() {
		return this.herdSize > 1;
	}

	public boolean inRangeOfLeader() {
		return this.distanceToSqr(this.leader) <= 121.0D;
	}

	public void pathToLeader() {
		if (this.isFollower()) {
			this.getNavigation().moveTo(this.leader, 1.0D);
		}

	}

	public void addFollowers(Stream<? extends FangedElk> p_27534_) {
		p_27534_.limit((long)(this.getMaxHerdSize() - this.herdSize)).filter((mob) -> {
			return mob != this;
		}).forEach((mob) -> {
			mob.startFollowing(this);
		});
	}

	public boolean isFollower() {
		return this.leader != null && this.leader.isAlive();
	}

	public FangedElk startFollowing(FangedElk mob) {
		this.leader = mob;
		mob.addFollower();
		return mob;
	}

	public void stopFollowing() {
		this.leader.removeFollower();
		this.leader = null;
	}

	public void addFollower() {
		++this.herdSize;
	}

	public void removeFollower() {
		--this.herdSize;
	}

	public boolean canBeFollowed() {
		return this.hasFollowers() && this.herdSize < this.getMaxHerdSize();
	}

	@Override
	public void tick() {
		super.tick();

		if (this.isOnSnow()) {
			if (!this.hasSpeedEffect()) {
				this.applySpeedEffect();
			}
		} else {
			if (this.hasSpeedEffect()) {
				this.removeSpeedEffect();
			}
		}
	}

	@Override
	public boolean hurt(DamageSource damageSource, float v) {
		if (damageSource.is(DamageTypes.FREEZE)) {
			return false;
		}
		return super.hurt(damageSource, v);
	}

	@Override
	public boolean canFreeze() {
		return false;
	}

	@Override
	public SoundEvent getAmbientSound() {
		super.getAmbientSound();
		return SoundEvents.CAMEL_AMBIENT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.CAMEL_DEATH;
	}

	@Nullable
	@Override
	public SoundEvent getEatingSound() {
		return SoundEvents.CAMEL_EAT;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource damageSource) {
		super.getHurtSound(damageSource);
		return SoundEvents.CAMEL_HURT;
	}

	@Override
	public SoundEvent getAngrySound() {
		super.getAngrySound();
		return SoundEvents.CAMEL_HURT;
	}

	@Override
	public boolean canWearArmor() {
		return false;
	}

	public static final EntityDataAccessor<ResourceLocation> VARIANT_TEXTURE = SynchedEntityData.defineId(FangedElk.class, MedievalEmbroidery.RESOURCE_LOCATION);
	public static final EntityDataAccessor<ResourceLocation> OVERLAY_TEXTURE = SynchedEntityData.defineId(FangedElk.class, MedievalEmbroidery.RESOURCE_LOCATION);
	public static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(FangedElk.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> OVERLAY = SynchedEntityData.defineId(FangedElk.class, EntityDataSerializers.INT);

	public ResourceLocation getTextureResource() {
		return this.entityData.get(VARIANT_TEXTURE);
	}

	public ResourceLocation getOverlayLocation() {
		return this.entityData.get(OVERLAY_TEXTURE);
	}


	public int getVariant() {
		return this.entityData.get(VARIANT);
	}

	public int getOverlayVariant() {
		return this.entityData.get(OVERLAY);
	}

	public void setVariant(int variant) {
		this.entityData.set(VARIANT_TEXTURE, FangedElkModel.Variant.variantFromOrdinal(variant).resourceLocation);
		this.entityData.set(VARIANT, variant);
	}

	public void setOverlayVariant(int variant) {
		this.entityData.set(OVERLAY_TEXTURE, FangedElkMarkingLayer.Overlay.overlayFromOrdinal(variant).resourceLocation);
		this.entityData.set(OVERLAY, variant);
	}

	public void setVariantTexture(String variant) {
		ResourceLocation resourceLocation = ResourceLocation.tryParse(variant);
		if (resourceLocation == null) {
			resourceLocation = FangedElkModel.Variant.BLACK.resourceLocation;
		}
		this.entityData.set(VARIANT_TEXTURE, resourceLocation);
	}

	public void setOverlayVariantTexture(String variant) {
		ResourceLocation resourceLocation = ResourceLocation.tryParse(variant);
		if (resourceLocation == null) {
			resourceLocation = FangedElkMarkingLayer.Overlay.NONE.resourceLocation;
		}
		this.entityData.set(OVERLAY_TEXTURE, resourceLocation);
	}

	@Override
	public void readAdditionalSaveData(CompoundTag tag) {
		super.readAdditionalSaveData(tag);

		if (tag.contains("Variant")) {
			this.setVariant(tag.getInt("Variant"));
		}

		if (tag.contains("Overlay")) {
			this.setOverlayVariant(tag.getInt("Overlay"));
		}

		if (tag.contains("Variant_Texture")) {
			this.setVariantTexture(tag.getString("Variant_Texture"));
		}

		if (tag.contains("Overlay_Texture")) {
			this.setOverlayVariantTexture(tag.getString("Overlay_Texture"));
		}

		if (tag.contains("Gender")) {
			this.setGender(tag.getInt("Gender"));
		}
	}

	@Override
	public void addAdditionalSaveData(CompoundTag tag) {
		super.addAdditionalSaveData(tag);
		tag.putInt("Variant", this.getVariant());
		tag.putInt("Overlay", this.getOverlayVariant());
		tag.putString("Variant_Texture", this.getTextureResource().toString());
		tag.putString("Overlay_Texture", this.getOverlayLocation().toString());
		tag.putInt("Gender", this.getGender());
	}

	@Override
	@Nullable
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor serverLevelAccessor, DifficultyInstance instance, MobSpawnType spawnType, @Nullable SpawnGroupData data, @Nullable CompoundTag tag) {
		if (data == null) {
			data = new AgeableMobGroupData(0.2F);
		}

		Random random = new Random();
		this.setVariant(random.nextInt(FangedElkModel.Variant.values().length));
		this.setOverlayVariant(random.nextInt(FangedElkMarkingLayer.Overlay.values().length));
		this.setGender(random.nextInt(Gender.values().length));

		this.randomizeAttributes();
		return super.finalizeSpawn(serverLevelAccessor, instance, spawnType, data, tag);
	}

	@Override
	public void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(VARIANT, 0);
		this.entityData.define(OVERLAY, 0);
		this.entityData.define(GENDER, 0);
		this.entityData.define(VARIANT_TEXTURE, FangedElkModel.Variant.BLACK.resourceLocation);
		this.entityData.define(OVERLAY_TEXTURE, FangedElkMarkingLayer.Overlay.NONE.resourceLocation);
	}

	@Override
	public boolean canParent() {
		return !this.isVehicle() && !this.isPassenger() && !this.isBaby() && this.isInLove();
	}

	public boolean canMate(Animal animal) {
		if (animal == this) {
			return false;
		} else if (!(animal instanceof FangedElk)) {
			return false;
		} else {
			if (!MedievalEmbroideryCommonConfig.GENDERS_AFFECT_BREEDING.get()) {
				return this.canParent() && ((FangedElk) animal).canParent();
			} else {
				FangedElk partner = (FangedElk) animal;
				if (this.canParent() && partner.canParent() && this.getGender() != partner.getGender()) {
					return true;
				}

				boolean partnerIsFemale = partner.isFemale();
				boolean partnerIsMale = partner.isMale();
				if (MedievalEmbroideryCommonConfig.GENDERS_AFFECT_BREEDING.get() && this.canParent() && partner.canParent()
						&& ((isFemale() && partnerIsMale) || (isMale() && partnerIsFemale))) {
					return isFemale();
				}
			}
		}
		return false;
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
		FangedElk abstracthorse;
			FangedElk horse = (FangedElk) ageableMob;
			abstracthorse = EntityTypes.FANGED_ELK_ENTITY.get().create(serverLevel);

			int i = this.random.nextInt(9);
			int variant;
			if (i < 4) {
				variant = this.getVariant();
			} else if (i < 8) {
				variant = horse.getVariant();
			} else {
				variant = this.random.nextInt(FangedElkModel.Variant.values().length);
			}

			int j = this.random.nextInt(5);
			int overlay;
			if (j < 2) {
				overlay = this.getOverlayVariant();
			} else if (j < 4) {
				overlay = horse.getOverlayVariant();
			} else {
				overlay = this.random.nextInt(FangedElkMarkingLayer.Overlay.values().length);
			}

			int gender;
			gender = this.random.nextInt(Gender.values().length);

			((FangedElk) abstracthorse).setVariant(variant);
			((FangedElk) abstracthorse).setOverlayVariant(overlay);
			((FangedElk) abstracthorse).setGender(gender);

			if (this.random.nextInt(4) == 0) {
				int randomJumpStrength = (int) Math.max(horse.generateRandomJumpStrength(), this.random.nextInt(10) + 10);
				((FangedElk) abstracthorse).generateRandomJumpStrength();

				int betterSpeed = (int) Math.max(horse.getSpeed(), this.random.nextInt(10) + 20);
				((FangedElk) abstracthorse).setSpeed(betterSpeed);

				int betterHealth = (int) Math.max(horse.getHealth(), this.random.nextInt(20) + 40);
				((FangedElk) abstracthorse).setHealth(betterHealth);
			} else {
				((FangedElk) abstracthorse).setSpeed(horse.getSpeed());
				((FangedElk) abstracthorse).setHealth(horse.getHealth());
		}

		this.setOffspringAttributes(ageableMob, abstracthorse);
		return abstracthorse;
	}

}