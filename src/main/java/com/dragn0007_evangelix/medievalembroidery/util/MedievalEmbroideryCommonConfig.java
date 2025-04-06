package com.dragn0007_evangelix.medievalembroidery.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class MedievalEmbroideryCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

//    public static final ForgeConfigSpec.BooleanValue DRAGONS_CAN_BREED;
//    public static final ForgeConfigSpec.ConfigValue<Float> DRAGON_SPEED;
//    public static final ForgeConfigSpec.ConfigValue<Integer> MAX_DRAGONS_OWNED;


    static {
        BUILDER.push("Common Configs");

//        DRAGONS_CAN_BREED = BUILDER.comment("Should dragons be able to breed?")
//                .define("Dragons Can Breed", true);
//
//        DRAGON_SPEED = BUILDER.comment("Base dragon speed. Default is 0.26F. Lower values may relieve server lag when flying.")
//                .define("Dragon Speed", 0.26F);
//
//        MAX_DRAGONS_OWNED = BUILDER.comment("Maximum amount of dragons players can own. Default is 3. Also applies to OPs/ Admins.")
//                .define("Max Dragons Owned", 3);

        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
