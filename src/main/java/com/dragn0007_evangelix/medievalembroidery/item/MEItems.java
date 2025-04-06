package com.dragn0007_evangelix.medievalembroidery.item;


import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.item.custom.MortarAndPestleItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class MEItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MedievalEmbroidery.MODID);

    //Crafting Ingredients
    public static final RegistryObject<Item> MORTAR_AND_PESTLE = ITEMS.register("mortar_and_pestle",
            () -> new MortarAndPestleItem(new Item.Properties().stacksTo(1)));


    //Crystals & Ores
    public static final RegistryObject<Item> ASSISTIVE_CRYSTAL_SHARD = ITEMS.register("assistive_crystal_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESTRUCTIVE_CRYSTAL_SHARD = ITEMS.register("destructive_crystal_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PROTECTIVE_CRYSTAL_SHARD = ITEMS.register("protective_crystal_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEALING_CRYSTAL_SHARD = ITEMS.register("healing_crystal_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONJURING_CRYSTAL_SHARD = ITEMS.register("conjuring_crystal_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRESTONE = ITEMS.register("firestone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOSSTONE = ITEMS.register("mosstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYSTONE = ITEMS.register("skystone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEASTONE = ITEMS.register("seastone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FROSTSTONE = ITEMS.register("froststone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEPTHSTONE = ITEMS.register("depthstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASTROSTONE = ITEMS.register("astrostone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTAL_DUST = ITEMS.register("crystal_dust",
            () -> new Item(new Item.Properties()));


    //Spices, Ingredients & Food
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SWEET_BREAD = ITEMS.register("sweet_bread",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD.get(), (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()))));
    public static final RegistryObject<Item> SWEET_BREAD_CREAM = ITEMS.register("sweet_bread_cream",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_CREAM.get(), (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()))));
    public static final RegistryObject<Item> SWEET_BREAD_HONEY = ITEMS.register("sweet_bread_honey",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_HONEY.get(), (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()))));
    public static final RegistryObject<Item> ELDERBERRY_PIE = ITEMS.register("elderberry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).build())));
    public static final RegistryObject<Item> BILBERRY_PIE = ITEMS.register("bilberry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).build())));
    public static final RegistryObject<Item> COWBERRY_PIE = ITEMS.register("cowberry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).build())));
    public static final RegistryObject<Item> REDCURRANT_PIE = ITEMS.register("redcurrant_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).build())));
    public static final RegistryObject<Item> HAWTHORN_PIE = ITEMS.register("hawthorn_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).build())));
    public static final RegistryObject<Item> MIXEDBERRY_PIE = ITEMS.register("mixedberry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(24).saturationMod(1).build())));
    public static final RegistryObject<Item> ELDERBERRY_GLAZE = ITEMS.register("elderberry_glaze",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> BILBERRY_GLAZE = ITEMS.register("bilberry_glaze",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> COWBERRY_GLAZE = ITEMS.register("cowberry_glaze",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> REDCURRANT_GLAZE = ITEMS.register("redcurrant_glaze",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> HAWTHORN_GLAZE = ITEMS.register("hawthorn_glaze",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> FRUIT_GLAZE = ITEMS.register("fruit_glaze",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> ELDERBERRY_SWEET_BREAD_CREAM = ITEMS.register("elderberry_sweet_bread_cream",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_ELDERBERRY.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()))));
    public static final RegistryObject<Item> BILBERRY_SWEET_BREAD_CREAM = ITEMS.register("bilberry_sweet_bread_cream",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_BILBERRY.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()))));
    public static final RegistryObject<Item> COWBERRY_SWEET_BREAD_CREAM = ITEMS.register("cowberry_sweet_bread_cream",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_COWBERRY.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()))));
    public static final RegistryObject<Item> REDCURRANT_SWEET_BREAD_CREAM = ITEMS.register("redcurrant_sweet_bread_cream",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_REDCURRANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()))));
    public static final RegistryObject<Item> HAWTHORN_SWEET_BREAD_CREAM = ITEMS.register("hawthorn_sweet_bread_cream",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_HAWTHORN.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()))));
    public static final RegistryObject<Item> FRUIT_SWEET_BREAD_CREAM = ITEMS.register("fruit_sweet_bread_cream",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_FRUIT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}