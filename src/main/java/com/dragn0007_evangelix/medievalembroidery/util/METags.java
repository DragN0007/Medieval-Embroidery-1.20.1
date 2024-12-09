package com.dragn0007_evangelix.medievalembroidery.util;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class METags {
//    public static class Blocks {
//        public static final TagKey<Block> MUSHROOM =
//                tag("mushroom");
//
//        private static TagKey<Block> tag (String name) {
//            return BlockTags.create(new ResourceLocation(MedievalEmbroidery.MODID, name));
//        }
//        private static TagKey<Block> forgeTag (String name) {
//            return BlockTags.create(new ResourceLocation("forge", name));
//        }
//    }

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

        private static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(MedievalEmbroidery.MODID, name));
        }
        private static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

}
