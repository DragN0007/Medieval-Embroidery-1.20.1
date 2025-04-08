package com.dragn0007_evangelix.medievalembroidery.item;


import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.item.custom.JuiceItem;
import com.dragn0007_evangelix.medievalembroidery.item.custom.MEAlcoholItem;
import com.dragn0007_evangelix.medievalembroidery.item.custom.MortarAndPestleItem;
import com.dragn0007_evangelix.medievalembroidery.item.custom.TeaItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class MEItems {

    //please don't rearrange categories, i have them set up in a specific way (adhd meltdown style) -dragoon

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MedievalEmbroidery.MODID);

    //Crafting Ingredients
    public static final RegistryObject<Item> MORTAR_AND_PESTLE = ITEMS.register("mortar_and_pestle",
            () -> new MortarAndPestleItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FAIRY_DUST = ITEMS.register("fairy_dust",
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

//    public static final RegistryObject<Item> APPLE_SEED = ITEMS.register("apple_seed",
//            () -> new ItemNameBlockItem(MEBlocks.APPLE_SAPLING.get(), (new Item.Properties())));
//    public static final RegistryObject<Item> APRICOT_PIT = ITEMS.register("apricot_pit",
//            () -> new ItemNameBlockItem(MEBlocks.APRICOT_SAPLING.get(), (new Item.Properties())));
//    public static final RegistryObject<Item> LEMON_SEED = ITEMS.register("lemon_seed",
//            () -> new ItemNameBlockItem(MEBlocks.LEMON_SAPLING.get(), (new Item.Properties())));

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



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}