package com.dragn0007_evangelix.medievalembroidery.util;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class METags {

    public static class Items {
        public static final TagKey<Item> MILK = forgeTag("milk");
        public static final TagKey<Item> BERRIES = forgeTag("berries");
        public static final TagKey<Item> CRYSTALS = forgeTag("crystals");
        public static final TagKey<Item> GLAZES = forgeTag("glazes");
        public static final TagKey<Item> FRUITS = forgeTag("fruits");
        public static final TagKey<Item> WHEAT = forgeTag("wheat");
        public static final TagKey<Item> WATER = forgeTag("water");
        public static final TagKey<Item> HERBS = forgeTag("herbs");
        public static final TagKey<Item> LEAVES = forgeTag("leaves");
        public static final TagKey<Item> COOKED_CHICKEN = forgeTag("cooked_chicken");
        public static final TagKey<Item> RAW_CHICKEN = forgeTag("raw_chicken");
        public static final TagKey<Item> RAW_MEATS = forgeTag("raw_meats");
        public static final TagKey<Item> VEGETABLES = forgeTag("vegetables");
        public static final TagKey<Item> COOKED_MEATS = forgeTag("cooked_meats");
        public static final TagKey<Item> CARNIVORE_EATS = tag("carnivore_eats");
        public static final TagKey<Item> CARNIVORE_DESIRES = tag("carnivore_desires");
        public static final TagKey<Item> HERBIVORE_EATS = tag("herbivore_eats");
        public static final TagKey<Item> FISH = forgeTag("fish");

        private static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(MedievalEmbroidery.MODID, name));
        }
        private static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Entity_Types {

        public static final TagKey<EntityType<?>> LARGE_PREDATOR_PREY = forgeTag("large_predator_prey");
        public static final TagKey<EntityType<?>> MEDIUM_PREDATOR_PREY = forgeTag("medium_predator_prey");
        public static final TagKey<EntityType<?>> SMALL_PREDATOR_PREY = forgeTag("small_predator_prey");
        public static final TagKey<EntityType<?>> LARGE_PREDATORS = forgeTag("large_predators");
        public static final TagKey<EntityType<?>> MEDIUM_PREDATORS = forgeTag("medium_predators");
        public static final TagKey<EntityType<?>> SMALL_PREDATORS = forgeTag("small_predators");
        public static final TagKey<EntityType<?>> PREDATORS = forgeTag("predators");
        public static final TagKey<EntityType<?>> LARGE_HERBIVORES = forgeTag("large_herbivores");
        public static final TagKey<EntityType<?>> MEDIUM_HERBIVORES = forgeTag("medium_herbivores");
        public static final TagKey<EntityType<?>> SMALL_HERBIVORES = forgeTag("small_herbivores");
        public static final TagKey<EntityType<?>> HERBIVORES = forgeTag("herbivores");

        public static TagKey<EntityType<?>> forgeTag(String name) {
            return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> LARGE_DRAGON_DESTROYS = forgeTag("large_dragon_destroys");
        public static final TagKey<Block> MEDIUM_DRAGON_DESTROYS = forgeTag("medium_dragon_destroys");
        public static final TagKey<Block> SMALL_DRAGON_DESTROYS = forgeTag("small_dragon_destroys");
        public static final TagKey<Block> SAND = forgeTag("sand");
        public static final TagKey<Block> DESERT_ANIMALS_SPAWNABLE_ON = tag("desert_animals_spawnable_on");

        public static TagKey<net.minecraft.world.level.block.Block> forgeTag (String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

        public static TagKey<net.minecraft.world.level.block.Block> tag (String name) {
            return BlockTags.create(new ResourceLocation(MedievalEmbroidery.MODID, name));
        }
    }

}
