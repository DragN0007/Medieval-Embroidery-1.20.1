package com.dragn0007_evangelix.medievalembroidery.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class MedievalEmbroideryCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

//    public static final ForgeConfigSpec.BooleanValue DRAGONS_CAN_BREED;
//    public static final ForgeConfigSpec.ConfigValue<Float> DRAGON_SPEED;
//    public static final ForgeConfigSpec.ConfigValue<Integer> MAX_DRAGON_EGGS;
//    public static final ForgeConfigSpec.ConfigValue<Integer> MAX_DRAGONS_OWNED;
    public static final ForgeConfigSpec.ConfigValue<Integer> EGG_LAY_TIME;
    public static final ForgeConfigSpec.ConfigValue<Integer> MILKING_COOLDOWN;
    public static final ForgeConfigSpec.BooleanValue GROUND_TIE;
    public static final ForgeConfigSpec.BooleanValue ANIMALS_HERDING_ENABLED;
    public static final ForgeConfigSpec.BooleanValue GENDERS_AFFECT_BIPRODUCTS;
    public static final ForgeConfigSpec.BooleanValue GENDERS_AFFECT_BREEDING;
    public static final ForgeConfigSpec.ConfigValue<Integer> DIREWOLF_MAX_PACK_COUNT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ELK_MAX_HERD_COUNT;
    public static final ForgeConfigSpec.ConfigValue<Double> MAX_GRIFFIN_SPEED_MULTIPLIER;

    static {
        BUILDER.push("Common Configs");

        GENDERS_AFFECT_BIPRODUCTS = BUILDER.comment("Should an animal's gender affect the ability to get bi-products from it?")
                .define("Genders Affect Bi-Products", true);

        GENDERS_AFFECT_BREEDING = BUILDER.comment("Should an animal's gender affect how it breeds?")
                .define("Genders Affect Breeding", true);

        ANIMALS_HERDING_ENABLED = BUILDER.comment("Should animals, like Elk and Direwolves, herd or pack up together?")
                .define("Animals Herd & Pack Together", true);

        EGG_LAY_TIME = BUILDER.comment("Minimum amount of time, in ticks, that an egg-laying animal can lay an unfertilized egg. Default is 12000 ticks, or 10 minutes.")
                .define("Egg Lay Cooldown", 12000);

        MILKING_COOLDOWN = BUILDER.comment("Amount of time, in ticks, that you must wait to milk a milk-able animal. Default is 12000 ticks, or 10 minutes")
                .define("Milking Cooldown", 12000);

        GROUND_TIE = BUILDER.comment("Should ME mounts \"ground tie\", or stop moving around, when saddled & dismounted?")
                .define("Ground Tie When Dismounted", true);

        DIREWOLF_MAX_PACK_COUNT = BUILDER.comment("Maximum amount of Direwolves that can pack up at once.")
                .define("Max Direwolf Pack Count", 5);

        ELK_MAX_HERD_COUNT = BUILDER.comment("Maximum amount of Fanged Elk that can herd up at once.")
                .define("Max Fanged Elk Herd Count", 3);

        MAX_GRIFFIN_SPEED_MULTIPLIER = BUILDER.comment("Maximum Griffin speed multiplier. Default is 2.0D.")
                .define("Max Griffin Flying Speed Multiplier", 2.0D);

//        DRAGONS_CAN_BREED = BUILDER.comment("Should dragons be able to breed?")
//                .define("Dragons Can Breed", true);
//
//        DRAGON_SPEED = BUILDER.comment("Base dragon speed. Default is 0.26F. Lower values may relieve server lag when flying.")
//                .define("Dragon Speed", 0.26F);
//
//        MAX_DRAGONS_OWNED = BUILDER.comment("Maximum amount of eggs dragons can lay in their life. Default is 3.")
//                .define("Max Dragon Eggs Per Female", 3);
//
//        MAX_DRAGONS_OWNED = BUILDER.comment("Maximum amount of dragons players can own. Default is 3. Also applies to OPs/ Admins.")
//                .define("Max Dragons Owned", 3);

        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
