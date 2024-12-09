package com.dragn0007_evangelix.medievalembroidery.item;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum MEArmorTier implements ArmorMaterial {

    YAK_WOOL("yak_wool", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_LEATHER, 2.0F, 0.1F, () -> {
        return Ingredient.of(MEItems.YAK_WOOL.get());
    }),
    OBSIDIAN("obsidian", 37, new int[]{4, 8, 10, 4}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.of(MEItems.OBSIDIAN_SHARD.get());
    }),
    FANGED_ELK_SKULL("fanged_elk_skull", 30, new int[]{3, 7, 8, 3}, 12, SoundEvents.ARMOR_EQUIP_LEATHER, 3.0F, 0.1F, () -> {
        return Ingredient.of(MEItems.FANGED_ELK_HELMET.get());
    }),
    DIREWOLF("direwolf", 30, new int[]{2, 6, 7, 1}, 12, SoundEvents.ARMOR_EQUIP_LEATHER, 3.0F, 0.1F, () -> {
        return Ingredient.of(MEItems.DIREWOLF_FUR.get());
    }),

    BOAR("boar", 30, new int[]{2, 6, 7, 1}, 12, SoundEvents.ARMOR_EQUIP_LEATHER, 3.0F, 0.1F, () -> {
        return Ingredient.of(MEItems.BOAR_FUR.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;


    private MEArmorTier(String p_i231593_3_, int durabilityMultiplier, int[] slotProtection, int enchantmentValue, SoundEvent soundType, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = p_i231593_3_;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtection;
        this.enchantmentValue = enchantmentValue;
        this.sound = soundType;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot slot) {
        return HEALTH_PER_SLOT[slot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot p_200902_1_) {
        return this.slotProtections[p_200902_1_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return MedievalEmbroideryMain.MODID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}