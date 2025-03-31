package com.dragn0007_evangelix.medievalembroidery.item;


import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.item.custom.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class MEItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MedievalEmbroidery.MODID);

    //TODO; Spawn Eggs
//    public static final RegistryObject<Item> BUTTERFLY_SPAWN_EGG = ITEMS.register("butterfly_spawn_egg",
//            () -> new ForgeSpawnEggItem(EntityTypes.BUTTERFLY_ENTITY, 0xff9850, 0xff9850, new Item.Properties().stacksTo(64)));
//    public static final RegistryObject<Item> TURKEY_SPAWN_EGG = ITEMS.register("turkey_spawn_egg",
//            () -> new ForgeSpawnEggItem(EntityTypes.TURKEY_ENTITY, 0x524d53, 0x8f4424, new Item.Properties().stacksTo(64)));
//    public static final RegistryObject<Item> CRESTEDLIZARD_SPAWN_EGG = ITEMS.register("crestedlizard_spawn_egg",
//            () -> new ForgeSpawnEggItem(EntityTypes.CRESTEDLIZARD_ENTITY, 0x48af7b, 0x4aa9d9, new Item.Properties().stacksTo(64)));
//    public static final RegistryObject<Item> GAMEHEN_SPAWN_EGG = ITEMS.register("gamehen_spawn_egg",
//            () -> new ForgeSpawnEggItem(EntityTypes.GAMEHEN_ENTITY, 0xf0af5c, 0xd18c3f, new Item.Properties().stacksTo(64)));
//    public static final RegistryObject<Item> LIGHTNINGBUG_SPAWN_EGG = ITEMS.register("lightningbug_spawn_egg",
//            () -> new ForgeSpawnEggItem(EntityTypes.LIGHTNING_BUG_ENTITY, 0x2a2a2a, 0xffde00, new Item.Properties().stacksTo(64)));
//    public static final RegistryObject<Item> FANGEDELK_SPAWN_EGG = ITEMS.register("fangedelk_spawn_egg",
//            () -> new ForgeSpawnEggItem(EntityTypes.FANGEDELK_ENTITY, 0x883c10, 0xb96433, new Item.Properties().stacksTo(64)));
//    public static final RegistryObject<Item> SWAMPYAK_SPAWN_EGG = ITEMS.register("swampyak_spawn_egg",
//            () -> new ForgeSpawnEggItem(EntityTypes.SWAMPYAK_ENTITY, 0x695f51, 0x957e70, new Item.Properties().stacksTo(64)));
//    public static final RegistryObject<Item> FAIRY_SPAWN_EGG = ITEMS.register("fairy_spawn_egg",
//            () -> new ForgeSpawnEggItem(EntityTypes.FAIRY_ENTITY, 0xb999d4, 0xccb8de, new Item.Properties().stacksTo(64)));
//    public static final RegistryObject<Item> DIREWOLF_SPAWN_EGG = ITEMS.register("direwolf_spawn_egg",
//            () -> new ForgeSpawnEggItem(EntityTypes.DIREWOLF_ENTITY, 0x6d6568, 0x474043, new Item.Properties().stacksTo(64)));
//    public static final RegistryObject<Item> WOOLLY_BOAR_SPAWN_EGG = ITEMS.register("woolly_boar_spawn_egg",
//            () -> new ForgeSpawnEggItem(EntityTypes.WOOLLYBOAR_ENTITY, 0x78422f, 0x653322, new Item.Properties().stacksTo(64)));
//    public static final RegistryObject<Item> RAVEN_SPAWN_EGG = ITEMS.register("raven_spawn_egg",
//            () -> new ForgeSpawnEggItem(EntityTypes.RAVEN_ENTITY, 0x17191d, 0x1c1d2d, new Item.Properties().stacksTo(64)));
//    public static final RegistryObject<Item> MAMMOTH_SPAWN_EGG = ITEMS.register("mammoth_spawn_egg",
//            () -> new ForgeSpawnEggItem(EntityTypes.MAMMOTH_ENTITY, 0x543b27, 0x3e2b1b, new Item.Properties().stacksTo(64)));


    //TODO; Crafting Tools
    public static final RegistryObject<Item> MORTARNPESTLE = ITEMS.register("mortarnpestle",
            () -> new MortarAndPestleItem(new Item.Properties().stacksTo(1)));


    //TODO; Dragons
    public static final RegistryObject<Item> IRON_DRAGON_ARMOR = ITEMS.register("iron_dragon_armor",
            () -> new DragonArmorItem(15, (new Item.Properties()).stacksTo(1)));
    public static final RegistryObject<Item> GOLD_DRAGON_ARMOR = ITEMS.register("gold_dragon_armor",
            () -> new DragonArmorItem(20, (new Item.Properties()).stacksTo(1)));
    public static final RegistryObject<Item> DIAMOND_DRAGON_ARMOR = ITEMS.register("diamond_dragon_armor",
            () -> new DragonArmorItem(25, (new Item.Properties()).stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_DRAGON_ARMOR = ITEMS.register("netherite_dragon_armor",
            () -> new DragonArmorItem(30, (new Item.Properties()).stacksTo(1)));
    public static final RegistryObject<Item> OBSIDIAN_DRAGON_ARMOR = ITEMS.register("obsidian_dragon_armor",
            () -> new DragonArmorItem(35, (new Item.Properties()).stacksTo(1)));

    public static final RegistryObject<Item> BLACK_DRAGON_BANNER = ITEMS.register("black_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLUE_DRAGON_BANNER = ITEMS.register("blue_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BROWN_DRAGON_BANNER = ITEMS.register("brown_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CYAN_DRAGON_BANNER = ITEMS.register("cyan_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GREEN_DRAGON_BANNER = ITEMS.register("green_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GREY_DRAGON_BANNER = ITEMS.register("grey_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LIGHT_BLUE_DRAGON_BANNER = ITEMS.register("light_blue_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LIGHT_GREY_DRAGON_BANNER = ITEMS.register("light_grey_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LIME_DRAGON_BANNER = ITEMS.register("lime_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MAGENTA_DRAGON_BANNER = ITEMS.register("magenta_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ORANGE_DRAGON_BANNER = ITEMS.register("orange_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PINK_DRAGON_BANNER = ITEMS.register("pink_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PURPLE_DRAGON_BANNER = ITEMS.register("purple_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RED_DRAGON_BANNER = ITEMS.register("red_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WHITE_DRAGON_BANNER = ITEMS.register("white_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> YELLOW_DRAGON_BANNER = ITEMS.register("yellow_dragon_banner",
            () -> new Item (new Item.Properties().stacksTo(1)));


    //TODO; Crystals & Ores
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


    //TODO; Spell Scrolls
    public static final RegistryObject<Item> ATTUNED_SCROLL = ITEMS.register("attuned_scroll",
            () -> new AttunedScrollItem(new Item.Properties()));

    public static final RegistryObject<Item> ASSISTIVE_SPELL = ITEMS.register("assistive_spell",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> ASSISTIVE_SPELL_FIRE = ITEMS.register("assistive_spell_fire",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ASSISTIVE_SPELL_WATER = ITEMS.register("assistive_spell_water",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ASSISTIVE_SPELL_ICE = ITEMS.register("assistive_spell_ice",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ASSISTIVE_SPELL_NATURE = ITEMS.register("assistive_spell_nature",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ASSISTIVE_SPELL_DEPTHS = ITEMS.register("assistive_spell_depths",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ASSISTIVE_SPELL_ASTRO = ITEMS.register("assistive_spell_astro",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ASSISTIVE_SPELL_WEATHER = ITEMS.register("assistive_spell_weather",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DEFENSIVE_SPELL = ITEMS.register("defensive_spell",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> DEFENSIVE_SPELL_FIRE = ITEMS.register("defensive_spell_fire",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DEFENSIVE_SPELL_WATER = ITEMS.register("defensive_spell_water",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DEFENSIVE_SPELL_ICE = ITEMS.register("defensive_spell_ice",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DEFENSIVE_SPELL_NATURE = ITEMS.register("defensive_spell_nature",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DEFENSIVE_SPELL_DEPTHS = ITEMS.register("defensive_spell_depths",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DEFENSIVE_SPELL_ASTRO = ITEMS.register("defensive_spell_astro",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DEFENSIVE_SPELL_WEATHER = ITEMS.register("defensive_spell_weather",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> HEALING_SPELL = ITEMS.register("healing_spell",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> HEALING_SPELL_FIRE = ITEMS.register("healing_spell_fire",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HEALING_SPELL_WATER = ITEMS.register("healing_spell_water",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HEALING_SPELL_ICE = ITEMS.register("healing_spell_ice",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HEALING_SPELL_NATURE = ITEMS.register("healing_spell_nature",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HEALING_SPELL_DEPTHS = ITEMS.register("healing_spell_depths",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HEALING_SPELL_ASTRO = ITEMS.register("healing_spell_astro",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HEALING_SPELL_WEATHER = ITEMS.register("healing_spell_weather",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> OFFENSIVE_SPELL = ITEMS.register("offensive_spell",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> OFFENSIVE_SPELL_FIRE = ITEMS.register("offensive_spell_fire",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OFFENSIVE_SPELL_WATER = ITEMS.register("offensive_spell_water",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OFFENSIVE_SPELL_ICE = ITEMS.register("offensive_spell_ice",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OFFENSIVE_SPELL_NATURE = ITEMS.register("offensive_spell_nature",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OFFENSIVE_SPELL_DEPTHS = ITEMS.register("offensive_spell_depths",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OFFENSIVE_SPELL_ASTRO = ITEMS.register("offensive_spell_astro",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OFFENSIVE_SPELL_WEATHER = ITEMS.register("offensive_spell_weather",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SUMMONING_SPELL = ITEMS.register("summoning_spell",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SUMMONING_SPELL_FIRE = ITEMS.register("summoning_spell_fire",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SUMMONING_SPELL_WATER = ITEMS.register("summoning_spell_water",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SUMMONING_SPELL_ICE = ITEMS.register("summoning_spell_ice",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SUMMONING_SPELL_NATURE = ITEMS.register("summoning_spell_nature",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SUMMONING_SPELL_DEPTHS = ITEMS.register("summoning_spell_depths",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SUMMONING_SPELL_ASTRO = ITEMS.register("summoning_spell_astro",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SUMMONING_SPELL_WEATHER = ITEMS.register("summoning_spell_weather",
            () -> new Item(new Item.Properties().stacksTo(1)));


    public static final RegistryObject<Item> RIBBON = ITEMS.register("ribbon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRE_RIBBON = ITEMS.register("fire_ribbon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WATER_RIBBON = ITEMS.register("water_ribbon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICE_RIBBON = ITEMS.register("ice_ribbon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NATURE_RIBBON = ITEMS.register("nature_ribbon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEPTHS_RIBBON = ITEMS.register("depths_ribbon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASTRO_RIBBON = ITEMS.register("astro_ribbon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEATHER_RIBBON = ITEMS.register("weather_ribbon",
            () -> new Item(new Item.Properties()));



    //TODO; Misc Items

    public static final RegistryObject<Item> FAIRY_DUST = ITEMS.register("fairy_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHTNINGBUG_GOO = ITEMS.register("lightningbug_goo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHTNINGBUG_THORAX = ITEMS.register("lightningbug_thorax",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUTTERFLY_WING = ITEMS.register("butterfly_wing",
            () -> new Item(new Item.Properties()));


    //TODO; Spices
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties()));


    //TODO; Ingredients
    public static final RegistryObject<Item> MILK_BOTTLE = ITEMS.register("milk_bottle",
            () -> new MilkBottleItem(new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).food(new FoodProperties.Builder().nutrition(2).saturationMod(1).build())));
    public static final RegistryObject<Item> SALT_BRINE = ITEMS.register("salt_brine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MALTED_GRAIN = ITEMS.register("malted_grain",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).build())));


    //TODO; Food
    public static final RegistryObject<Item> TURKEY = ITEMS.register("turkey_leg",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0).meat().effect(() -> new MobEffectInstance(MobEffects.HUNGER, 300, 5) ,0.85F).build())));
    public static final RegistryObject<Item> COOKED_TURKEY = ITEMS.register("cooked_turkey",
            () -> new TurkeyLegItem(MEItemTier.TURKEYLEG, 1, -2f,
            (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(8).saturationMod(1).build()))));
    public static final RegistryObject<Item> HONEY_TURKEY = ITEMS.register("honey_turkey",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(12).saturationMod(1).build())));
    public static final RegistryObject<Item> BERRY_TURKEY = ITEMS.register("berry_turkey",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(12).saturationMod(1).build())));
    public static final RegistryObject<Item> SEASONED_TURKEY = ITEMS.register("seasoned_turkey",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(12).saturationMod(1).build())));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item (new Item.Properties().stacksTo(16).food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build())));
    public static final RegistryObject<Item> PICKLED_EGG = ITEMS.register("pickled_egg",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build())));
    public static final RegistryObject<Item> SWEET_BREAD = ITEMS.register("sweet_bread",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD.get(), (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()))));
    public static final RegistryObject<Item> SWEET_BREAD_CREAM = ITEMS.register("sweet_bread_cream",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_CREAM.get(), (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()))));
    public static final RegistryObject<Item> SWEET_BREAD_HONEY = ITEMS.register("sweet_bread_honey",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_HONEY.get(), (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()))));
    public static final RegistryObject<Item> CORNISH_HEN = ITEMS.register("cornish_hen",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0).meat().effect(() -> new MobEffectInstance(MobEffects.HUNGER, 300, 5) ,0.85F).build())));
    public static final RegistryObject<Item> COOKED_CORNISH_HEN = ITEMS.register("cooked_cornish_hen",
            () -> new ItemNameBlockItem(MEBlocks.CORNISH_HEN.get(), (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()))));
    public static final RegistryObject<Item> HONEY_CORNISH_HEN = ITEMS.register("honey_cornish_hen",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(8).saturationMod(1).build())));
    public static final RegistryObject<Item> BERRY_CORNISH_HEN = ITEMS.register("berry_cornish_hen",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(8).saturationMod(1).build())));
    public static final RegistryObject<Item> SEASONED_CORNISH_HEN = ITEMS.register("seasoned_cornish_hen",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(8).saturationMod(1).build())));
    public static final RegistryObject<Item> ELK = ITEMS.register("elk",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build())));
    public static final RegistryObject<Item> COOKED_ELK = ITEMS.register("cooked_elk",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(8).saturationMod(1).build())));
    public static final RegistryObject<Item> SEASONED_ELK = ITEMS.register("seasoned_elk",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(12).saturationMod(1).build())));
    public static final RegistryObject<Item> PICKLED_MEAT = ITEMS.register("pickled_meat",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(14).saturationMod(1).build())));
    public static final RegistryObject<Item> PICKLED_MUSHROOMS = ITEMS.register("pickled_mushrooms",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(14).saturationMod(1).build())));
    public static final RegistryObject<Item> PICKLED_VEGGIES = ITEMS.register("pickled_veggies",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(14).saturationMod(1).build())));
    public static final RegistryObject<Item> SOUP_JARRED = ITEMS.register("soup_jarred",
            () -> new Item (new Item.Properties().stacksTo(64).craftRemainder(Items.GLASS_BOTTLE).food(new FoodProperties.Builder().nutrition(14).saturationMod(1).build())));
    public static final RegistryObject<Item> STEW_JARRED = ITEMS.register("stew_jarred",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(14).saturationMod(1).build())));
    public static final RegistryObject<Item> YAK = ITEMS.register("yak",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build())));
    public static final RegistryObject<Item> COOKED_YAK = ITEMS.register("cooked_yak",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(8).saturationMod(1).build())));
    public static final RegistryObject<Item> SEASONED_YAK = ITEMS.register("seasoned_yak",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(12).saturationMod(1).build())));




    //TODO; Fruit Tree
    public static final RegistryObject<Item> APRICOT = ITEMS.register("apricot",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));

    public static final RegistryObject<Item> APPLE_SEED = ITEMS.register("apple_seed",
            () -> new ItemNameBlockItem(MEBlocks.APPLE_SAPLING.get(), (new Item.Properties())));
    public static final RegistryObject<Item> APRICOT_PIT = ITEMS.register("apricot_pit",
            () -> new ItemNameBlockItem(MEBlocks.APRICOT_SAPLING.get(), (new Item.Properties())));
    public static final RegistryObject<Item> LEMON_SEED = ITEMS.register("lemon_seed",
            () -> new ItemNameBlockItem(MEBlocks.LEMON_SAPLING.get(), (new Item.Properties())));

    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(18).saturationMod(1).build())));
    public static final RegistryObject<Item> APRICOT_PIE = ITEMS.register("apricot_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(18).saturationMod(1).build())));
    public static final RegistryObject<Item> LEMON_PIE = ITEMS.register("lemon_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(18).saturationMod(1).build())));


    public static final RegistryObject<Item> APPLE_CIDER = ITEMS.register("apple_cider",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 1, true, false)
            ));
    public static final RegistryObject<Item> APRICOT_TEA = ITEMS.register("apricot_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false)
            ));
    public static final RegistryObject<Item> LEMON_TEA = ITEMS.register("lemon_tea",
            () -> new TeaItem(
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false)
            ));

    public static final RegistryObject<Item> APPLE_JUICE = ITEMS.register("apple_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.REGENERATION, 1600, 1, true, false)
            ));
    public static final RegistryObject<Item> APRICOT_JUICE = ITEMS.register("apricot_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.REGENERATION, 1600, 1, true, false)
            ));
    public static final RegistryObject<Item> LEMON_JUICE = ITEMS.register("lemon_juice",
            () -> new JuiceItem(
                    new MobEffectInstance(MobEffects.REGENERATION, 1600, 1, true, false)
            ));



    //TODO; Berries/ Fruit-Based
    public static final RegistryObject<Item> ELDERBERRY = ITEMS.register("elderberry",
            () -> new ItemNameBlockItem(MEBlocks.ELDERBERRY_BUSH_CROP.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()))));
    public static final RegistryObject<Item> BILBERRY = ITEMS.register("bilberry",
            () -> new ItemNameBlockItem(MEBlocks.BILBERRY_BUSH_CROP.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()))));
    public static final RegistryObject<Item> COWBERRY = ITEMS.register("cowberry",
            () -> new ItemNameBlockItem(MEBlocks.COWBERRY_BUSH_CROP.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()))));
    public static final RegistryObject<Item> REDCURRANT = ITEMS.register("redcurrant",
            () -> new ItemNameBlockItem(MEBlocks.REDCURRANT_BUSH_CROP.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()))));
    public static final RegistryObject<Item> HAWTHORNBERRY = ITEMS.register("hawthornberry",
            () -> new ItemNameBlockItem(MEBlocks.HAWTHORN_BUSH_CROP.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()))));

    public static final RegistryObject<Item> ELDERBERRY_PIE = ITEMS.register("elderberry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).build())));
    public static final RegistryObject<Item> BILBERRY_PIE = ITEMS.register("bilberry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).build())));
    public static final RegistryObject<Item> COWBERRY_PIE = ITEMS.register("cowberry_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).build())));
    public static final RegistryObject<Item> REDCURRANT_PIE = ITEMS.register("redcurrant_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).build())));
    public static final RegistryObject<Item> HAWTHORNBERRY_PIE = ITEMS.register("hawthornberry_pie",
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
    public static final RegistryObject<Item> HAWTHORNBERRY_GLAZE = ITEMS.register("hawthornberry_glaze",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> FRUIT_GLAZE = ITEMS.register("fruit_glaze",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> ELDERBERRY_SWEET_BREAD = ITEMS.register("elderberry_sweet_bread",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_ELDERBERRY.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()))));
    public static final RegistryObject<Item> BILBERRY_SWEET_BREAD = ITEMS.register("bilberry_sweet_bread",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_BILBERRY.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()))));
    public static final RegistryObject<Item> COWBERRY_SWEET_BREAD = ITEMS.register("cowberry_sweet_bread",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_COWBERRY.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()))));
    public static final RegistryObject<Item> REDCURRANT_SWEET_BREAD = ITEMS.register("redcurrant_sweet_bread",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_REDCURRANT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()))));
    public static final RegistryObject<Item> HAWTHORNBERRY_SWEET_BREAD = ITEMS.register("hawthornberry_sweet_bread",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_HAWTHORN.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()))));
    public static final RegistryObject<Item> FRUIT_SWEET_BREAD = ITEMS.register("fruit_sweet_bread",
            () -> new ItemNameBlockItem(MEBlocks.SWEET_BREAD_FRUIT.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()))));


    //TODO; Alcohol
    public static final RegistryObject<Item> HONEY_MEAD = ITEMS.register("honey_mead",
            () -> new MEAlcoholItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 300, 0, true, false)
            ));
    public static final RegistryObject<Item> HERBAL_MEAD = ITEMS.register("herbal_mead",
            () -> new MEAlcoholItem(
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 300, 0, true, false)
            ));
    public static final RegistryObject<Item> ELDERBERRY_MEAD = ITEMS.register("elderberry_mead",
            () -> new MEAlcoholItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 300, 0, true, false)
            ));
    public static final RegistryObject<Item> BILBERRY_MEAD = ITEMS.register("bilberry_mead",
            () -> new MEAlcoholItem(
                    new MobEffectInstance(MobEffects.JUMP, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 300, 0, true, false)
            ));
    public static final RegistryObject<Item> COWBERRY_MEAD = ITEMS.register("cowberry_mead",
            () -> new MEAlcoholItem(
                    new MobEffectInstance(MobEffects.SLOW_FALLING, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 300, 0, true, false)
            ));
    public static final RegistryObject<Item> HAWTHORN_MEAD = ITEMS.register("hawthorn_mead",
            () -> new MEAlcoholItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 300, 0, true, false)
            ));
    public static final RegistryObject<Item> REDCURRANT_MEAD = ITEMS.register("redcurrant_mead",
            () -> new MEAlcoholItem(
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 300, 0, true, false)
            ));
    public static final RegistryObject<Item> ALE = ITEMS.register("ale",
            () -> new MEAlcoholItem(
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 300, 0, true, false)
            ));
    public static final RegistryObject<Item> FAIRY_ALE = ITEMS.register("fairy_ale",
            () -> new MEAlcoholItem(
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.SLOW_FALLING, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.CONFUSION, 300, 0, true, false)
            ));


    //TODO; Fungi
    public static final RegistryObject<Item> BLEWIT = ITEMS.register("blewit",
            () -> new ItemNameBlockItem(MEBlocks.BLEWIT.get(), (new Item.Properties())));
    public static final RegistryObject<Item> HONEY = ITEMS.register("honey",
            () -> new ItemNameBlockItem(MEBlocks.HONEY.get(), (new Item.Properties())));
    public static final RegistryObject<Item> KING = ITEMS.register("king",
            () -> new ItemNameBlockItem(MEBlocks.KING.get(), (new Item.Properties())));
    public static final RegistryObject<Item> MATSUTAKE = ITEMS.register("matsutake",
            () -> new ItemNameBlockItem(MEBlocks.MATSUTAKE.get(), (new Item.Properties())));
    public static final RegistryObject<Item> OYSTER = ITEMS.register("oyster",
            () -> new ItemNameBlockItem(MEBlocks.OYSTER.get(), (new Item.Properties())));
    public static final RegistryObject<Item> PORCINI = ITEMS.register("porcini",
            () -> new ItemNameBlockItem(MEBlocks.PORCINI.get(), (new Item.Properties())));
    public static final RegistryObject<Item> YELLOWFOOT = ITEMS.register("yellowfoot",
            () -> new ItemNameBlockItem(MEBlocks.YELLOWFOOT.get(), (new Item.Properties())));
    public static final RegistryObject<Item> WOODSCHICKEN = ITEMS.register("woodschicken",
            () -> new ItemNameBlockItem(MEBlocks.WOODSCHICKEN.get(), (new Item.Properties())));

    public static final RegistryObject<Item> BLEWIT_SPORES = ITEMS.register("blewit_spores",
            () -> new ItemNameBlockItem(MEBlocks.BLEWIT_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> HONEY_SPORES = ITEMS.register("honey_spores",
            () -> new ItemNameBlockItem(MEBlocks.HONEY_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> KING_SPORES = ITEMS.register("king_spores",
            () -> new ItemNameBlockItem(MEBlocks.KING_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> MATSUTAKE_SPORES = ITEMS.register("matsutake_spores",
            () -> new ItemNameBlockItem(MEBlocks.MATSUTAKE_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> OYSTER_SPORES = ITEMS.register("oyster_spores",
            () -> new ItemNameBlockItem(MEBlocks.OYSTER_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> PORCINI_SPORES = ITEMS.register("porcini_spores",
            () -> new ItemNameBlockItem(MEBlocks.PORCINI_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> YELLOWFOOT_SPORES = ITEMS.register("yellowfoot_spores",
            () -> new ItemNameBlockItem(MEBlocks.YELLOWFOOT_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> WOODSCHICKEN_SPORES = ITEMS.register("woodschicken_spores",
            () -> new ItemNameBlockItem(MEBlocks.WOODSCHICKEN_CROP.get(), (new Item.Properties())));

    public static final RegistryObject<Item> COOKED_BLEWIT = ITEMS.register("cooked_blewit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> COOKED_HONEY = ITEMS.register("cooked_honey",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> COOKED_KING = ITEMS.register("cooked_king",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> COOKED_MATSUTAKE = ITEMS.register("cooked_matsutake",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> COOKED_OYSTER = ITEMS.register("cooked_oyster",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> COOKED_PORCINI = ITEMS.register("cooked_porcini",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> COOKED_YELLOWFOOT = ITEMS.register("cooked_yellowfoot",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));
    public static final RegistryObject<Item> COOKED_WOODSCHICKEN = ITEMS.register("cooked_woodschicken",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build())));

    public static final RegistryObject<Item> SEASONED_BLEWIT = ITEMS.register("seasoned_blewit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).build())));
    public static final RegistryObject<Item> SEASONED_HONEY = ITEMS.register("seasoned_honey",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).build())));
    public static final RegistryObject<Item> SEASONED_KING = ITEMS.register("seasoned_king",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).build())));
    public static final RegistryObject<Item> SEASONED_MATSUTAKE = ITEMS.register("seasoned_matsutake",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).build())));
    public static final RegistryObject<Item> SEASONED_OYSTER = ITEMS.register("seasoned_oyster",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).build())));
    public static final RegistryObject<Item> SEASONED_PORCINI = ITEMS.register("seasoned_porcini",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).build())));
    public static final RegistryObject<Item> SEASONED_YELLOWFOOT = ITEMS.register("seasoned_yellowfoot",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).build())));
    public static final RegistryObject<Item> SEASONED_WOODSCHICKEN = ITEMS.register("seasoned_woodschicken",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).build())));



    //TODO; Herbs
    public static final RegistryObject<Item> HENVEN = ITEMS.register("henven",
            () -> new ItemNameBlockItem(MEBlocks.HENVEN_PLANT.get(), (new Item.Properties())));
    public static final RegistryObject<Item> CANNAAN = ITEMS.register("cannaan",
            () -> new ItemNameBlockItem(MEBlocks.CANNAAN_PLANT.get(), (new Item.Properties())));
    public static final RegistryObject<Item> DRAGONEYE = ITEMS.register("dragoneye",
            () -> new ItemNameBlockItem(MEBlocks.DRAGONEYE_PLANT.get(), (new Item.Properties())));
    public static final RegistryObject<Item> SPRINNAN = ITEMS.register("sprinnan",
            () -> new ItemNameBlockItem(MEBlocks.SPRINNAN_PLANT.get(), (new Item.Properties())));
    public static final RegistryObject<Item> VIRENNES = ITEMS.register("virennes",
            () -> new ItemNameBlockItem(MEBlocks.VIRENNES_PLANT.get(), (new Item.Properties())));
    public static final RegistryObject<Item> BRUTEFLOWER = ITEMS.register("bruteflower",
            () -> new ItemNameBlockItem(MEBlocks.BRUTEFLOWER_PLANT.get(), (new Item.Properties())));
    public static final RegistryObject<Item> GRANGIN = ITEMS.register("grangin",
            () -> new ItemNameBlockItem(MEBlocks.GRANGIN_PLANT.get(), (new Item.Properties())));
    public static final RegistryObject<Item> FAIRYFLOWER = ITEMS.register("fairyflower",
            () -> new ItemNameBlockItem(MEBlocks.FAIRYFLOWER_PLANT.get(), (new Item.Properties())));
    public static final RegistryObject<Item> CACHEN = ITEMS.register("cachen",
            () -> new ItemNameBlockItem(MEBlocks.CACHEN_PLANT.get(), (new Item.Properties())));
    public static final RegistryObject<Item> LADYRIVER = ITEMS.register("ladyriver",
            () -> new ItemNameBlockItem(MEBlocks.LADYRIVER_PLANT.get(), (new Item.Properties())));


    //TODO; Potions
    public static final RegistryObject<Item> DRAGONPOTION = ITEMS.register("dragonpotion",
            () -> new CustomPotionItem(
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 5, true, false)
            ));
    public static final RegistryObject<Item> DEERPOTION = ITEMS.register("deerpotion",
            () -> new CustomPotionItem(
                    new MobEffectInstance(MobEffects.JUMP, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 5, true, false)
            ));
    public static final RegistryObject<Item> BUTTERFLYPOTION = ITEMS.register("butterflypotion",
            () -> new CustomPotionItem(
                    new MobEffectInstance(MobEffects.SLOW_FALLING, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 5, true, false)
            ));
    public static final RegistryObject<Item> ELKPOTION = ITEMS.register("elkpotion",
            () -> new CustomPotionItem(
                    new MobEffectInstance(MobEffects.JUMP, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 5, true, false)
            ));
    public static final RegistryObject<Item> SEASTRIDERPOTION = ITEMS.register("seastriderpotion",
            () -> new CustomPotionItem(
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 2880, 5, true, false)
            ));
    public static final RegistryObject<Item> WARMTHPOTION = ITEMS.register("warmthpotion",
            () -> new CustomPotionItem(
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 3,true, false)
            ));
    public static final RegistryObject<Item> HASTEPOTION = ITEMS.register("hastepotion",
            () -> new CustomPotionItem(
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 3,true, false)
            ));
    public static final RegistryObject<Item> LUCKPOTION = ITEMS.register("luckpotion",
            () -> new CustomPotionItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 3,true, false)
            ));
    public static final RegistryObject<Item> HARVESTINGPOTION = ITEMS.register("harvestingpotion",
            () -> new CustomPotionItem(
                    new MobEffectInstance(MobEffects.CONFUSION, 2880, 3,true, false)
            ));
    public static final RegistryObject<Item> SPOTTINGPOTION = ITEMS.register("spottingpotion",
            () -> new CustomPotionItem(
                    new MobEffectInstance(MobEffects.CONFUSION, 2880, 3,true, false)
            ));
    public static final RegistryObject<Item> FLYINGPOTION = ITEMS.register("flyingpotion",
            () -> new CustomPotionItem(
                    new MobEffectInstance(MobEffects.CONFUSION, 2880, 3,true, false)
            ));
    public static final RegistryObject<Item> KINDNESSPOTION = ITEMS.register("kindnesspotion",
            () -> new CustomPotionItem(
                    new MobEffectInstance(MobEffects.CONFUSION, 2880, 3,true, false)
            ));


    //TODO; Grimoire
    public static final RegistryObject<GrimoireItem> GRIMOIRE = ITEMS.register("grimoire",
            () -> new GrimoireItem(new Item.Properties()));


    //TODO; Tool Ingredients
    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_SHARD = ITEMS.register("crying_obsidian_shard",
            () -> new Item(new Item.Properties()));

//    public static final RegistryObject<Item> SPECTRAL_DUST = ITEMS.register("spectral_dust",
//            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YAK_WOOL = ITEMS.register("yak_wool",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIREWOLF_FUR = ITEMS.register("direwolf_fur",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOAR_FUR = ITEMS.register("boar_fur",
            () -> new Item(new Item.Properties()));


    //TODO; Tools
    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new SwordItem(MEItemTier.OBSIDIAN, 3, -1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",
            () -> new PickaxeItem(MEItemTier.OBSIDIAN, 1, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe",
            () -> new AxeItem(MEItemTier.OBSIDIAN, 4, -2.5f,
                    new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel",
            () -> new ShovelItem(MEItemTier.OBSIDIAN, 1, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe",
            () -> new HoeItem(MEItemTier.OBSIDIAN, 1, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_BATTLEAXE = ITEMS.register("obsidian_battleaxe",
            () -> new AxeItem(MEItemTier.OBSIDIAN, 6.5f, -3f,
                    new Item.Properties()));

    //TODO;
//    public static final RegistryObject<Item> SPECTRAL_SWORD = ITEMS.register("spectral_sword",
//            () -> new SwordItem(MEItemTier.SPECTRAL, -1, -1f,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> SPECTRAL_PICKAXE = ITEMS.register("spectral_pickaxe",
//            () -> new PickaxeItem(MEItemTier.SPECTRAL, -2, 1f,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> SPECTRAL_AXE = ITEMS.register("spectral_axe",
//            () -> new AxeItem(MEItemTier.SPECTRAL, 1, -2.5f,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> SPECTRAL_SHOVEL = ITEMS.register("spectral_shovel",
//            () -> new ShovelItem(MEItemTier.SPECTRAL, -3, 1f,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> SPECTRAL_HOE = ITEMS.register("spectral_hoe",
//            () -> new HoeItem(MEItemTier.SPECTRAL, -3, 1f,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> SPECTRAL_BATTLEAXE = ITEMS.register("spectral_battleaxe",
//            () -> new AxeItem(MEItemTier.SPECTRAL, 6.5f, -3,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> SPECTRAL_SCYTHE = ITEMS.register("spectral_scythe",
//            () -> new SwordItem(MEItemTier.SPECTRAL, 4, -1.5f,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> SPECTRAL_DOUBLE_BLADE = ITEMS.register("spectral_double_blade",
//            () -> new SwordItem(MEItemTier.SPECTRAL, 5, -2.5f,
//                    new Item.Properties()));

//    public static final RegistryObject<Item> YAK_WOOL_HELMET = ITEMS.register("yak_wool_helmet",
//            () -> new ArmorItem(MEArmorTier.YAK_WOOL, EquipmentSlot.HEAD,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> YAK_WOOL_CHESTPLATE = ITEMS.register("yak_wool_chestplate",
//            () -> new ArmorItem(MEArmorTier.YAK_WOOL, EquipmentSlot.CHEST,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> YAK_WOOL_LEGGINGS = ITEMS.register("yak_wool_leggings",
//            () -> new ArmorItem(MEArmorTier.YAK_WOOL, EquipmentSlot.LEGS,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> YAK_WOOL_BOOTS = ITEMS.register("yak_wool_boots",
//            () -> new ArmorItem(MEArmorTier.YAK_WOOL, EquipmentSlot.FEET,
//                    new Item.Properties()));
//
//    public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
//            () -> new ArmorItem(MEArmorTier.OBSIDIAN, EquipmentSlot.HEAD,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",
//            () -> new ArmorItem(MEArmorTier.OBSIDIAN, EquipmentSlot.CHEST,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings",
//            () -> new ArmorItem(MEArmorTier.OBSIDIAN, EquipmentSlot.LEGS,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",
//            () -> new ArmorItem(MEArmorTier.OBSIDIAN, EquipmentSlot.FEET,
//                    new Item.Properties()));
//
//    public static final RegistryObject<Item> FANGED_ELK_HELMET = ITEMS.register("fanged_elk_helmet",
//            () -> new FangedElkArmorItem(MEArmorTier.FANGED_ELK_SKULL, EquipmentSlot.HEAD,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> FANGED_ELK_HELMET_IRON = ITEMS.register("fanged_elk_helmet_iron",
//            () -> new FangedElkIronArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> FANGED_ELK_HELMET_GOLD = ITEMS.register("fanged_elk_helmet_gold",
//            () -> new FangedElkGoldArmorItem(ArmorMaterials.GOLD, EquipmentSlot.HEAD,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> FANGED_ELK_HELMET_DIAMOND = ITEMS.register("fanged_elk_helmet_diamond",
//            () -> new FangedElkDiamondArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> FANGED_ELK_HELMET_NETHERITE = ITEMS.register("fanged_elk_helmet_netherite",
//            () -> new FangedElkNetheriteArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> FANGED_ELK_HELMET_OBSIDIAN = ITEMS.register("fanged_elk_helmet_obsidian",
//            () -> new FangedElkObsidianArmorItem(MEArmorTier.OBSIDIAN, EquipmentSlot.HEAD,
//                    new Item.Properties()));
//
//
//    public static final RegistryObject<Item> DIREWOLF_HELMET = ITEMS.register("direwolf_helmet",
//            () -> new DirewolfArmorItem(MEArmorTier.DIREWOLF, EquipmentSlot.HEAD,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> DIREWOLF_CHESTPLATE = ITEMS.register("direwolf_chestplate",
//            () -> new DirewolfArmorItem(MEArmorTier.DIREWOLF, EquipmentSlot.CHEST,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> DIREWOLF_LEGGINGS = ITEMS.register("direwolf_leggings",
//            () -> new DirewolfArmorItem(MEArmorTier.DIREWOLF, EquipmentSlot.LEGS,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> DIREWOLF_BOOTS = ITEMS.register("direwolf_boots",
//            () -> new DirewolfArmorItem(MEArmorTier.DIREWOLF, EquipmentSlot.FEET,
//                    new Item.Properties()));
//
//
//    public static final RegistryObject<Item> BOAR_HELMET = ITEMS.register("boar_helmet",
//            () -> new BoarArmorItem(MEArmorTier.BOAR, EquipmentSlot.HEAD,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> BOAR_CHESTPLATE = ITEMS.register("boar_chestplate",
//            () -> new BoarArmorItem(MEArmorTier.BOAR, EquipmentSlot.CHEST,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> BOAR_LEGGINGS = ITEMS.register("boar_leggings",
//            () -> new BoarArmorItem(MEArmorTier.BOAR, EquipmentSlot.LEGS,
//                    new Item.Properties()));
//    public static final RegistryObject<Item> BOAR_BOOTS = ITEMS.register("boar_boots",
//            () -> new BoarArmorItem(MEArmorTier.BOAR, EquipmentSlot.FEET,
//                    new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}