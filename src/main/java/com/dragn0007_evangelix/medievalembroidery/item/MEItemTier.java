package com.dragn0007_evangelix.medievalembroidery.item;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum MEItemTier implements Tier {

//    SPECTRAL(8, 4000, 16.0F, 25F, 15, () -> {
//        return Ingredient.of(MEItems.SPECTRAL_DUST.get());
//    }),
    OBSIDIAN(5, 2800, 10.0F, 5.5F, 15, () -> {
        return Ingredient.of(MEItems.OBSIDIAN_SHARD.get());
    }),
    TURKEYLEG(1, 0, 5F, 3.0F, 0, () -> {
        return Ingredient.of(Items.BONE);
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    MEItemTier(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
