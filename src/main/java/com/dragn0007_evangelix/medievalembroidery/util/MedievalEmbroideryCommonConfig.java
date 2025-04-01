package com.dragn0007_evangelix.medievalembroidery.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class MedievalEmbroideryCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;


    static {
        BUILDER.push("Common Configs");

        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
