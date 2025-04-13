package com.dragn0007_evangelix.medievalembroidery.item;


import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.entity.EntityTypes;
import com.dragn0007_evangelix.medievalembroidery.item.custom.JuiceItem;
import com.dragn0007_evangelix.medievalembroidery.item.custom.MEAlcoholItem;
import com.dragn0007_evangelix.medievalembroidery.item.custom.MortarAndPestleItem;
import com.dragn0007_evangelix.medievalembroidery.item.custom.TeaItem;
import com.dragn0007_evangelix.medievalembroidery.item.custom.armor.*;
import com.dragn0007_evangelix.medievalembroidery.item.custom.weapon.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class MEItems {

    //please don't rearrange categories, i have them set up in a specific way (adhd meltdown style) -dragoon

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MedievalEmbroidery.MODID);

    //Spawneggs
    public static final RegistryObject<Item> DIREWOLF_SPAWN_EGG = ITEMS.register("direwolf_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.DIREWOLF_ENTITY, 0xbfbfbf, 0x848484, new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> FAIRY_SPAWN_EGG = ITEMS.register("fairy_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.FAIRY_ENTITY, 0x775f70, 0x524256, new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> FANGED_ELK_SPAWN_EGG = ITEMS.register("fanged_elk_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.FANGED_ELK_ENTITY, 0x7b3213, 0x2f1202, new Item.Properties().stacksTo(64)));


    //Crafting Ingredients
    public static final RegistryObject<Item> MORTAR_AND_PESTLE = ITEMS.register("mortar_and_pestle",
            () -> new MortarAndPestleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FAIRY_DUST = ITEMS.register("fairy_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_SHARD = ITEMS.register("crying_obsidian_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIREWOLF_EYE = ITEMS.register("direwolf_eye",
            () -> new Item(new Item.Properties()));


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
    public static final RegistryObject<Item> SALT_BRINE = ITEMS.register("salt_brine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MALTED_GRAIN = ITEMS.register("malted_grain",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WATER = ITEMS.register("water",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PICKLED_EGG = ITEMS.register("pickled_egg",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build())));
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
    public static final RegistryObject<Item> ELK = ITEMS.register("elk",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build())));
    public static final RegistryObject<Item> COOKED_ELK = ITEMS.register("cooked_elk",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(8).saturationMod(1).build())));
    public static final RegistryObject<Item> SEASONED_ELK = ITEMS.register("seasoned_elk",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(12).saturationMod(1).build())));
    public static final RegistryObject<Item> DIREWOLF = ITEMS.register("direwolf",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build())));
    public static final RegistryObject<Item> COOKED_DIREWOLF = ITEMS.register("cooked_direwolf",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(8).saturationMod(1).build())));
    public static final RegistryObject<Item> SEASONED_DIREWOLF = ITEMS.register("seasoned_direwolf",
            () -> new Item (new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(12).saturationMod(1).build())));

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

    public static final RegistryObject<Item> ELDERBERRY = ITEMS.register("elderberry",
            () -> new ItemNameBlockItem(MEBlocks.ELDERBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()))));
    public static final RegistryObject<Item> BILBERRY = ITEMS.register("bilberry",
            () -> new ItemNameBlockItem(MEBlocks.BILBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()))));
    public static final RegistryObject<Item> COWBERRY = ITEMS.register("cowberry",
            () -> new ItemNameBlockItem(MEBlocks.COWBERRY_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()))));
    public static final RegistryObject<Item> REDCURRANT = ITEMS.register("redcurrant",
            () -> new ItemNameBlockItem(MEBlocks.REDCURRANT_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()))));
    public static final RegistryObject<Item> HAWTHORNBERRY = ITEMS.register("hawthornberry",
            () -> new ItemNameBlockItem(MEBlocks.HAWTHORN_BUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()))));

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
    public static final RegistryObject<Item> WOODS_CHICKEN = ITEMS.register("woods_chicken",
            () -> new ItemNameBlockItem(MEBlocks.WOODS_CHICKEN.get(), (new Item.Properties())));

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
    public static final RegistryObject<Item> COOKED_WOODS_CHICKEN = ITEMS.register("cooked_woods_chicken",
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
    public static final RegistryObject<Item> SEASONED_WOODS_CHICKEN = ITEMS.register("seasoned_woods_chicken",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).build())));

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


    //Plants & Herbs
    public static final RegistryObject<Item> HENVEN = ITEMS.register("henven",
            () -> new ItemNameBlockItem(MEBlocks.HENVEN.get(), (new Item.Properties())));
    public static final RegistryObject<Item> CANNAAN = ITEMS.register("cannaan",
            () -> new ItemNameBlockItem(MEBlocks.CANNAAN.get(), (new Item.Properties())));
    public static final RegistryObject<Item> DRAGONEYE = ITEMS.register("dragoneye",
            () -> new ItemNameBlockItem(MEBlocks.DRAGONEYE.get(), (new Item.Properties())));
    public static final RegistryObject<Item> SPRINNAN = ITEMS.register("sprinnan",
            () -> new ItemNameBlockItem(MEBlocks.SPRINNAN.get(), (new Item.Properties())));
    public static final RegistryObject<Item> VIRENNES = ITEMS.register("virennes",
            () -> new ItemNameBlockItem(MEBlocks.VIRENNES.get(), (new Item.Properties())));
    public static final RegistryObject<Item> BRUTEFLOWER = ITEMS.register("bruteflower",
            () -> new ItemNameBlockItem(MEBlocks.BRUTEFLOWER.get(), (new Item.Properties())));
    public static final RegistryObject<Item> GRANGIN = ITEMS.register("grangin",
            () -> new ItemNameBlockItem(MEBlocks.GRANGIN.get(), (new Item.Properties())));
    public static final RegistryObject<Item> FAIRYFLOWER = ITEMS.register("fairyflower",
            () -> new ItemNameBlockItem(MEBlocks.FAIRYFLOWER.get(), (new Item.Properties())));
    public static final RegistryObject<Item> CACHEN = ITEMS.register("cachen",
            () -> new ItemNameBlockItem(MEBlocks.CACHEN.get(), (new Item.Properties())));
    public static final RegistryObject<Item> LADYRIVER = ITEMS.register("ladyriver",
            () -> new ItemNameBlockItem(MEBlocks.LADYRIVER.get(), (new Item.Properties())));


    //Tools & Weapons
    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new SwordItem(METoolTiers.OBSIDIAN, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",
            () -> new PickaxeItem(METoolTiers.OBSIDIAN, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel",
            () -> new ShovelItem(METoolTiers.OBSIDIAN, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe",
            () -> new AxeItem(METoolTiers.OBSIDIAN, 6, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe",
            () -> new HoeItem(METoolTiers.OBSIDIAN, -2, -1.0F, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_DAGGER = ITEMS.register("obsidian_dagger",
            () -> new SwordItem(METoolTiers.OBSIDIAN, 1, -1.4F, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_GREATSWORD = ITEMS.register("obsidian_greatsword",
            () -> new SwordItem(METoolTiers.OBSIDIAN, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_BATTLEAXE = ITEMS.register("obsidian_battleaxe",
            () -> new AxeItem(METoolTiers.OBSIDIAN, 7, -3.3F, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_WARHAMMER = ITEMS.register("obsidian_warhammer",
            () -> new SwordItem(METoolTiers.OBSIDIAN, 9, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
            () -> new ObsidianArmorItem(MEArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",
            () -> new ObsidianArmorItem(MEArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_LEGGING = ITEMS.register("obsidian_leggings",
            () -> new ObsidianArmorItem(MEArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",
            () -> new ObsidianArmorItem(MEArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(METoolTiers.EMERALD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(METoolTiers.EMERALD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(METoolTiers.EMERALD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(METoolTiers.EMERALD, 6, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(METoolTiers.EMERALD, -2, -1.0F, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_DAGGER = ITEMS.register("emerald_dagger",
            () -> new SwordItem(METoolTiers.EMERALD, 1, -1.4F, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_GREATSWORD = ITEMS.register("emerald_greatsword",
            () -> new SwordItem(METoolTiers.EMERALD, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_BATTLEAXE = ITEMS.register("emerald_battleaxe",
            () -> new AxeItem(METoolTiers.EMERALD, 7, -3.3F, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_WARHAMMER = ITEMS.register("emerald_warhammer",
            () -> new SwordItem(METoolTiers.EMERALD, 9, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new EmeraldArmorItem(MEArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new EmeraldArmorItem(MEArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_LEGGING = ITEMS.register("emerald_leggings",
            () -> new EmeraldArmorItem(MEArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new EmeraldArmorItem(MEArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ASTROSTONE_SWORD = ITEMS.register("astrostone_sword",
            () -> new AstrostoneSwordItem(METoolTiers.ASTROSTONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> ASTROSTONE_PICKAXE = ITEMS.register("astrostone_pickaxe",
            () -> new PickaxeItem(METoolTiers.ASTROSTONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> ASTROSTONE_SHOVEL = ITEMS.register("astrostone_shovel",
            () -> new ShovelItem(METoolTiers.ASTROSTONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> ASTROSTONE_AXE = ITEMS.register("astrostone_axe",
            () -> new AstrostoneAxeItem(METoolTiers.ASTROSTONE, 6, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> ASTROSTONE_HOE = ITEMS.register("astrostone_hoe",
            () -> new HoeItem(METoolTiers.ASTROSTONE, -2, -1.0F, new Item.Properties()));
    public static final RegistryObject<Item> ASTROSTONE_DAGGER = ITEMS.register("astrostone_dagger",
            () -> new AstrostoneSwordItem(METoolTiers.ASTROSTONE, 1, -1.4F, new Item.Properties()));
    public static final RegistryObject<Item> ASTROSTONE_GREATSWORD = ITEMS.register("astrostone_greatsword",
            () -> new AstrostoneSwordItem(METoolTiers.ASTROSTONE, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> ASTROSTONE_BATTLEAXE = ITEMS.register("astrostone_battleaxe",
            () -> new AstrostoneAxeItem(METoolTiers.ASTROSTONE, 7, -3.3F, new Item.Properties()));
    public static final RegistryObject<Item> ASTROSTONE_WARHAMMER = ITEMS.register("astrostone_warhammer",
            () -> new AstrostoneSwordItem(METoolTiers.ASTROSTONE, 9, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> ASTROSTONE_HELMET = ITEMS.register("astrostone_helmet",
            () -> new AstrostoneArmorItem(MEArmorMaterials.ASTROSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ASTROSTONE_CHESTPLATE = ITEMS.register("astrostone_chestplate",
            () -> new AstrostoneArmorItem(MEArmorMaterials.ASTROSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ASTROSTONE_LEGGING = ITEMS.register("astrostone_leggings",
            () -> new AstrostoneArmorItem(MEArmorMaterials.ASTROSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ASTROSTONE_BOOTS = ITEMS.register("astrostone_boots",
            () -> new AstrostoneArmorItem(MEArmorMaterials.ASTROSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> DEPTHSTONE_SWORD = ITEMS.register("depthstone_sword",
            () -> new DepthstoneSwordItem(METoolTiers.DEPTHSTONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> DEPTHSTONE_PICKAXE = ITEMS.register("depthstone_pickaxe",
            () -> new PickaxeItem(METoolTiers.DEPTHSTONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> DEPTHSTONE_SHOVEL = ITEMS.register("depthstone_shovel",
            () -> new ShovelItem(METoolTiers.DEPTHSTONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> DEPTHSTONE_AXE = ITEMS.register("depthstone_axe",
            () -> new DepthstoneAxeItem(METoolTiers.DEPTHSTONE, 6, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> DEPTHSTONE_HOE = ITEMS.register("depthstone_hoe",
            () -> new HoeItem(METoolTiers.DEPTHSTONE, -2, -1.0F, new Item.Properties()));
    public static final RegistryObject<Item> DEPTHSTONE_DAGGER = ITEMS.register("depthstone_dagger",
            () -> new DepthstoneSwordItem(METoolTiers.DEPTHSTONE, 1, -1.4F, new Item.Properties()));
    public static final RegistryObject<Item> DEPTHSTONE_GREATSWORD = ITEMS.register("depthstone_greatsword",
            () -> new DepthstoneSwordItem(METoolTiers.DEPTHSTONE, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> DEPTHSTONE_BATTLEAXE = ITEMS.register("depthstone_battleaxe",
            () -> new DepthstoneAxeItem(METoolTiers.DEPTHSTONE, 7, -3.3F, new Item.Properties()));
    public static final RegistryObject<Item> DEPTHSTONE_WARHAMMER = ITEMS.register("depthstone_warhammer",
            () -> new DepthstoneSwordItem(METoolTiers.DEPTHSTONE, 9, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> DEPTHSTONE_HELMET = ITEMS.register("depthstone_helmet",
            () -> new DepthstoneArmorItem(MEArmorMaterials.DEPTHSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DEPTHSTONE_CHESTPLATE = ITEMS.register("depthstone_chestplate",
            () -> new DepthstoneArmorItem(MEArmorMaterials.DEPTHSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DEPTHSTONE_LEGGING = ITEMS.register("depthstone_leggings",
            () -> new DepthstoneArmorItem(MEArmorMaterials.DEPTHSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DEPTHSTONE_BOOTS = ITEMS.register("depthstone_boots",
            () -> new DepthstoneArmorItem(MEArmorMaterials.DEPTHSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> FIRESTONE_SWORD = ITEMS.register("firestone_sword",
            () -> new FirestoneSwordItem(METoolTiers.FIRESTONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> FIRESTONE_PICKAXE = ITEMS.register("firestone_pickaxe",
            () -> new PickaxeItem(METoolTiers.FIRESTONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> FIRESTONE_SHOVEL = ITEMS.register("firestone_shovel",
            () -> new ShovelItem(METoolTiers.FIRESTONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> FIRESTONE_AXE = ITEMS.register("firestone_axe",
            () -> new FirestoneAxeItem(METoolTiers.FIRESTONE, 6, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> FIRESTONE_HOE = ITEMS.register("firestone_hoe",
            () -> new HoeItem(METoolTiers.FIRESTONE, -2, -1.0F, new Item.Properties()));
    public static final RegistryObject<Item> FIRESTONE_DAGGER = ITEMS.register("firestone_dagger",
            () -> new FirestoneSwordItem(METoolTiers.FIRESTONE, 1, -1.4F, new Item.Properties()));
    public static final RegistryObject<Item> FIRESTONE_GREATSWORD = ITEMS.register("firestone_greatsword",
            () -> new FirestoneSwordItem(METoolTiers.FIRESTONE, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> FIRESTONE_BATTLEAXE = ITEMS.register("firestone_battleaxe",
            () -> new FirestoneAxeItem(METoolTiers.FIRESTONE, 7, -3.3F, new Item.Properties()));
    public static final RegistryObject<Item> FIRESTONE_WARHAMMER = ITEMS.register("firestone_warhammer",
            () -> new FirestoneSwordItem(METoolTiers.FIRESTONE, 9, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> FIRESTONE_HELMET = ITEMS.register("firestone_helmet",
            () -> new FirestoneArmorItem(MEArmorMaterials.FIRESTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FIRESTONE_CHESTPLATE = ITEMS.register("firestone_chestplate",
            () -> new FirestoneArmorItem(MEArmorMaterials.FIRESTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> FIRESTONE_LEGGING = ITEMS.register("firestone_leggings",
            () -> new FirestoneArmorItem(MEArmorMaterials.FIRESTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> FIRESTONE_BOOTS = ITEMS.register("firestone_boots",
            () -> new FirestoneArmorItem(MEArmorMaterials.FIRESTONE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> FROSTSTONE_SWORD = ITEMS.register("froststone_sword",
            () -> new FroststoneSwordItem(METoolTiers.FROSTSTONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> FROSTSTONE_PICKAXE = ITEMS.register("froststone_pickaxe",
            () -> new PickaxeItem(METoolTiers.FROSTSTONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> FROSTSTONE_SHOVEL = ITEMS.register("froststone_shovel",
            () -> new ShovelItem(METoolTiers.FROSTSTONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> FROSTSTONE_AXE = ITEMS.register("froststone_axe",
            () -> new FroststoneAxeItem(METoolTiers.FROSTSTONE, 6, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> FROSTSTONE_HOE = ITEMS.register("froststone_hoe",
            () -> new HoeItem(METoolTiers.FROSTSTONE, -2, -1.0F, new Item.Properties()));
    public static final RegistryObject<Item> FROSTSTONE_DAGGER = ITEMS.register("froststone_dagger",
            () -> new FroststoneSwordItem(METoolTiers.FROSTSTONE, 1, -1.4F, new Item.Properties()));
    public static final RegistryObject<Item> FROSTSTONE_GREATSWORD = ITEMS.register("froststone_greatsword",
            () -> new FroststoneSwordItem(METoolTiers.FROSTSTONE, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> FROSTSTONE_BATTLEAXE = ITEMS.register("froststone_battleaxe",
            () -> new FroststoneAxeItem(METoolTiers.FROSTSTONE, 7, -3.3F, new Item.Properties()));
    public static final RegistryObject<Item> FROSTSTONE_WARHAMMER = ITEMS.register("froststone_warhammer",
            () -> new FroststoneSwordItem(METoolTiers.FROSTSTONE, 9, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> FROSTSTONE_HELMET = ITEMS.register("froststone_helmet",
            () -> new FroststoneArmorItem(MEArmorMaterials.FROSTSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FROSTSTONE_CHESTPLATE = ITEMS.register("froststone_chestplate",
            () -> new FroststoneArmorItem(MEArmorMaterials.FROSTSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> FROSTSTONE_LEGGING = ITEMS.register("froststone_leggings",
            () -> new FroststoneArmorItem(MEArmorMaterials.FROSTSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> FROSTSTONE_BOOTS = ITEMS.register("froststone_boots",
            () -> new FroststoneArmorItem(MEArmorMaterials.FROSTSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> MOSSTONE_SWORD = ITEMS.register("mosstone_sword",
            () -> new MosstoneSwordItem(METoolTiers.MOSSTONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> MOSSTONE_PICKAXE = ITEMS.register("mosstone_pickaxe",
            () -> new PickaxeItem(METoolTiers.MOSSTONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> MOSSTONE_SHOVEL = ITEMS.register("mosstone_shovel",
            () -> new ShovelItem(METoolTiers.MOSSTONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> MOSSTONE_AXE = ITEMS.register("mosstone_axe",
            () -> new MosstoneAxeItem(METoolTiers.MOSSTONE, 6, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> MOSSTONE_HOE = ITEMS.register("mosstone_hoe",
            () -> new HoeItem(METoolTiers.MOSSTONE, -2, -1.0F, new Item.Properties()));
    public static final RegistryObject<Item> MOSSTONE_DAGGER = ITEMS.register("mosstone_dagger",
            () -> new MosstoneSwordItem(METoolTiers.MOSSTONE, 1, -1.4F, new Item.Properties()));
    public static final RegistryObject<Item> MOSSTONE_GREATSWORD = ITEMS.register("mosstone_greatsword",
            () -> new MosstoneSwordItem(METoolTiers.MOSSTONE, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> MOSSTONE_BATTLEAXE = ITEMS.register("mosstone_battleaxe",
            () -> new MosstoneAxeItem(METoolTiers.MOSSTONE, 7, -3.3F, new Item.Properties()));
    public static final RegistryObject<Item> MOSSTONE_WARHAMMER = ITEMS.register("mosstone_warhammer",
            () -> new MosstoneSwordItem(METoolTiers.MOSSTONE, 9, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> MOSSTONE_HELMET = ITEMS.register("mosstone_helmet",
            () -> new MosstoneArmorItem(MEArmorMaterials.MOSSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MOSSTONE_CHESTPLATE = ITEMS.register("mosstone_chestplate",
            () -> new MosstoneArmorItem(MEArmorMaterials.MOSSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MOSSTONE_LEGGING = ITEMS.register("mosstone_leggings",
            () -> new MosstoneArmorItem(MEArmorMaterials.MOSSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MOSSTONE_BOOTS = ITEMS.register("mosstone_boots",
            () -> new MosstoneArmorItem(MEArmorMaterials.MOSSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_SWORD = ITEMS.register("seastone_sword",
            () -> new SeastoneSwordItem(METoolTiers.SEASTONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> SEASTONE_PICKAXE = ITEMS.register("seastone_pickaxe",
            () -> new PickaxeItem(METoolTiers.SEASTONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> SEASTONE_SHOVEL = ITEMS.register("seastone_shovel",
            () -> new ShovelItem(METoolTiers.SEASTONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> SEASTONE_AXE = ITEMS.register("seastone_axe",
            () -> new SeastoneAxeItem(METoolTiers.SEASTONE, 6, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> SEASTONE_HOE = ITEMS.register("seastone_hoe",
            () -> new HoeItem(METoolTiers.SEASTONE, -2, -1.0F, new Item.Properties()));
    public static final RegistryObject<Item> SEASTONE_DAGGER = ITEMS.register("seastone_dagger",
            () -> new SeastoneSwordItem(METoolTiers.SEASTONE, 1, -1.4F, new Item.Properties()));
    public static final RegistryObject<Item> SEASTONE_GREATSWORD = ITEMS.register("seastone_greatsword",
            () -> new SeastoneSwordItem(METoolTiers.SEASTONE, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> SEASTONE_BATTLEAXE = ITEMS.register("seastone_battleaxe",
            () -> new SeastoneAxeItem(METoolTiers.SEASTONE, 7, -3.3F, new Item.Properties()));
    public static final RegistryObject<Item> SEASTONE_WARHAMMER = ITEMS.register("seastone_warhammer",
            () -> new SeastoneSwordItem(METoolTiers.SEASTONE, 9, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> SEASTONE_HELMET = ITEMS.register("seastone_helmet",
            () -> new SeastoneArmorItem(MEArmorMaterials.SEASTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SEASTONE_CHESTPLATE = ITEMS.register("seastone_chestplate",
            () -> new SeastoneArmorItem(MEArmorMaterials.SEASTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SEASTONE_LEGGING = ITEMS.register("seastone_leggings",
            () -> new SeastoneArmorItem(MEArmorMaterials.SEASTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SEASTONE_BOOTS = ITEMS.register("seastone_boots",
            () -> new SeastoneArmorItem(MEArmorMaterials.SEASTONE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SKYSTONE_SWORD = ITEMS.register("skystone_sword",
            () -> new SkystoneSwordItem(METoolTiers.SKYSTONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> SKYSTONE_PICKAXE = ITEMS.register("skystone_pickaxe",
            () -> new PickaxeItem(METoolTiers.SKYSTONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> SKYSTONE_SHOVEL = ITEMS.register("skystone_shovel",
            () -> new ShovelItem(METoolTiers.SKYSTONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> SKYSTONE_AXE = ITEMS.register("skystone_axe",
            () -> new SkystoneAxeItem(METoolTiers.SKYSTONE, 6, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> SKYSTONE_HOE = ITEMS.register("skystone_hoe",
            () -> new HoeItem(METoolTiers.SKYSTONE, -2, -1.0F, new Item.Properties()));
    public static final RegistryObject<Item> SKYSTONE_DAGGER = ITEMS.register("skystone_dagger",
            () -> new SkystoneSwordItem(METoolTiers.SKYSTONE, 1, -1.4F, new Item.Properties()));
    public static final RegistryObject<Item> SKYSTONE_GREATSWORD = ITEMS.register("skystone_greatsword",
            () -> new SkystoneSwordItem(METoolTiers.SKYSTONE, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> SKYSTONE_BATTLEAXE = ITEMS.register("skystone_battleaxe",
            () -> new SkystoneAxeItem(METoolTiers.SKYSTONE, 7, -3.3F, new Item.Properties()));
    public static final RegistryObject<Item> SKYSTONE_WARHAMMER = ITEMS.register("skystone_warhammer",
            () -> new SkystoneSwordItem(METoolTiers.SKYSTONE, 9, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> SKYSTONE_HELMET = ITEMS.register("skystone_helmet",
            () -> new SkystoneArmorItem(MEArmorMaterials.SKYSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SKYSTONE_CHESTPLATE = ITEMS.register("skystone_chestplate",
            () -> new SkystoneArmorItem(MEArmorMaterials.SKYSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SKYSTONE_LEGGING = ITEMS.register("skystone_leggings",
            () -> new SkystoneArmorItem(MEArmorMaterials.SKYSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SKYSTONE_BOOTS = ITEMS.register("skystone_boots",
            () -> new SkystoneArmorItem(MEArmorMaterials.SKYSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}