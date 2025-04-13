package com.dragn0007_evangelix.medievalembroidery.item;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum MEArmorMaterials implements ArmorMaterial {

    ASTROSTONE("astrostone", 17, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266654_) -> {
        p_266654_.put(ArmorItem.Type.BOOTS, 3);
        p_266654_.put(ArmorItem.Type.LEGGINGS, 4);
        p_266654_.put(ArmorItem.Type.CHESTPLATE, 5);
        p_266654_.put(ArmorItem.Type.HELMET, 4);
    }), 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.3F, () -> Ingredient.of(MEItems.ASTROSTONE.get())),

    DEPTHSTONE("depthstone", 17, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266654_) -> {
        p_266654_.put(ArmorItem.Type.BOOTS, 3);
        p_266654_.put(ArmorItem.Type.LEGGINGS, 4);
        p_266654_.put(ArmorItem.Type.CHESTPLATE, 5);
        p_266654_.put(ArmorItem.Type.HELMET, 4);
    }), 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.3F, () -> Ingredient.of(MEItems.DEPTHSTONE.get())),

    FIRESTONE("firestone", 17, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266654_) -> {
        p_266654_.put(ArmorItem.Type.BOOTS, 3);
        p_266654_.put(ArmorItem.Type.LEGGINGS, 4);
        p_266654_.put(ArmorItem.Type.CHESTPLATE, 5);
        p_266654_.put(ArmorItem.Type.HELMET, 4);
    }), 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.3F, () -> Ingredient.of(MEItems.FIRESTONE.get())),

    FROSTSTONE("froststone", 17, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266654_) -> {
        p_266654_.put(ArmorItem.Type.BOOTS, 3);
        p_266654_.put(ArmorItem.Type.LEGGINGS, 4);
        p_266654_.put(ArmorItem.Type.CHESTPLATE, 5);
        p_266654_.put(ArmorItem.Type.HELMET, 4);
    }), 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.3F, () -> Ingredient.of(MEItems.FROSTSTONE.get())),

    MOSSTONE("mosstone", 17, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266654_) -> {
        p_266654_.put(ArmorItem.Type.BOOTS, 3);
        p_266654_.put(ArmorItem.Type.LEGGINGS, 4);
        p_266654_.put(ArmorItem.Type.CHESTPLATE, 5);
        p_266654_.put(ArmorItem.Type.HELMET, 4);
    }), 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.3F, () -> Ingredient.of(MEItems.MOSSTONE.get())),

    SEASTONE("seastone", 17, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266654_) -> {
        p_266654_.put(ArmorItem.Type.BOOTS, 3);
        p_266654_.put(ArmorItem.Type.LEGGINGS, 4);
        p_266654_.put(ArmorItem.Type.CHESTPLATE, 5);
        p_266654_.put(ArmorItem.Type.HELMET, 4);
    }), 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.3F, () -> Ingredient.of(MEItems.SEASTONE.get())),

    SKYSTONE("skystone", 17, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266654_) -> {
        p_266654_.put(ArmorItem.Type.BOOTS, 3);
        p_266654_.put(ArmorItem.Type.LEGGINGS, 4);
        p_266654_.put(ArmorItem.Type.CHESTPLATE, 5);
        p_266654_.put(ArmorItem.Type.HELMET, 4);
    }), 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.3F, () -> Ingredient.of(MEItems.SKYSTONE.get()));

    public static final StringRepresentable.EnumCodec<ArmorMaterials> CODEC = StringRepresentable.fromEnum(ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(ArmorItem.Type.BOOTS, 13);
        p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
        p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
        p_266653_.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    MEArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionTypeMap,
                     int enchantmentValue, SoundEvent soundEvent, float toughness, float knockbackRes, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionFunctionForType = protectionTypeMap;
        this.enchantmentValue = enchantmentValue;
        this.sound = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackRes;
        this.repairIngredient = repairMaterial;
    }

    public int getDurabilityForType(ArmorItem.Type p_266745_) {
        return HEALTH_FUNCTION_FOR_TYPE.get(p_266745_) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type p_266752_) {
        return this.protectionFunctionForType.get(p_266752_);
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

    public String getName() {
        return MedievalEmbroidery.MODID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String getSerializedName() {
        return MedievalEmbroidery.MODID + ":" + this.name;
    }
}