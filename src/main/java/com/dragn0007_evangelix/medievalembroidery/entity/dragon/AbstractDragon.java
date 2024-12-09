package com.dragn0007_evangelix.medievalembroidery.entity.dragon;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

import javax.annotation.Nullable;
import java.util.UUID;

public class AbstractDragon extends TamableAnimal {

    /*TODO; Notes
    -Dragons cannot have babies, and therefor cannot be parents either.
    -Dragons can wear armor and have storage without the need for chests.
    -Dragons can wear special dragon banners, sort of like carpets.
    -Dragons are not tamed automatically when hatched. They should be tamed with either a
    magical item or something normal like meat. If not tamed as a baby, they'll do whatever the
    config says they should (either die or turn feral).
    -Dragons have different attributes, but movement speed and health are randomized like horses.
     */

    public static final UUID ARMOR_MODIFIER_UUID = UUID.fromString("3c50e848-b2e3-404a-9879-7550b12dd09b");
    public static final EntityDataAccessor<Integer> DATA_CARPET_ID = SynchedEntityData.defineId(AbstractDragon.class, EntityDataSerializers.INT);

    public AbstractDragon(EntityType<? extends AbstractDragon> entityType, Level level) {
        super(entityType, level);
    }

    public boolean canParent() {
        return false;
    }

    public static AttributeSupplier.Builder createBaseDragonAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 400.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.235F)
                .add(Attributes.ATTACK_DAMAGE, 16D);
    }

    public void randomizeAttributes() {
        this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(this.generateRandomMaxHealth());
        this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(this.generateRandomSpeed());
    }

    public float generateRandomMaxHealth() {
        return 100.0F + (float)this.random.nextInt(8) + (float)this.random.nextInt(9);
    }

    public double generateRandomSpeed() {
        return ((double)0.45F + this.random.nextDouble() * 0.3D + this.random.nextDouble() * 0.3D + this.random.nextDouble() * 0.3D) * 0.25D;
    }

    @Override
    public SoundEvent getAmbientSound() {
        super.getAmbientSound();
        return SoundEvents.ENDER_DRAGON_AMBIENT;
    }

    @Override
    public SoundEvent getDeathSound() {
        return SoundEvents.ENDER_DRAGON_DEATH;
    }

    @Override
    public SoundEvent getHurtSound(DamageSource damageSource) {
        super.getHurtSound(damageSource);
        return SoundEvents.ENDER_DRAGON_GROWL;
    }

    @Override
    public boolean canBeRiddenInWater(Entity rider) {
        return false;
    }

    @org.jetbrains.annotations.Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }

    @Override
    public void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_CARPET_ID, -1);
    }

    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
    }

    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);

    }

    @Override
    @Nullable
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor serverLevelAccessor, DifficultyInstance instance, MobSpawnType spawnType, @Nullable SpawnGroupData data, @Nullable CompoundTag tag) {
        this.randomizeAttributes();
        return super.finalizeSpawn(serverLevelAccessor, instance, spawnType, data, tag);
    }

}