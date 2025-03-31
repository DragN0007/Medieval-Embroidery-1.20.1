package com.dragn0007_evangelix.medievalembroidery.item;


import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MEItemGroup {

    public static final CreativeModeTab DECOR_GROUP = new CreativeModeTab("decormodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get());
        }
    };
    public static final CreativeModeTab HERB_GROUP = new CreativeModeTab("herbmodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MEItems.HENVEN.get());
        }
    };
    public static final CreativeModeTab FOOD_GROUP = new CreativeModeTab("foodmodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MEItems.ELDERBERRY_PIE.get());
        }
    };
//    public static final CreativeModeTab POTION_GROUP = new CreativeModeTab("potionmodtab")
//    {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(MEItems.DRAGONPOTION.get());
//        }
//    };
    public static final CreativeModeTab ENTITY_GROUP = new CreativeModeTab("entitymodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MEItems.TURKEY_SPAWN_EGG.get());
        }
    };
    public static final CreativeModeTab MAGIC_GROUP = new CreativeModeTab("magicmodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MEItems.ATTUNED_SCROLL.get());
        }
    };
    public static final CreativeModeTab EQUIPMENT_GROUP = new CreativeModeTab("equipmentmodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MEItems.OBSIDIAN_AXE.get());
        }
    };
    public static final CreativeModeTab DRAGON_GROUP = new CreativeModeTab("dragonmodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MEItems.OBSIDIAN_DRAGON_ARMOR.get());
        }
    };
}
