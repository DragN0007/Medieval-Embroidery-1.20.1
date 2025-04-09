package com.dragn0007_evangelix.medievalembroidery.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class MedievalEmbroideryClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.BooleanValue DIREWOLF_SADDLES;

    static {
        BUILDER.push("Client");

        DIREWOLF_SADDLES = BUILDER.comment("Should Direwolf saddles render?")
                .define("Visible Direwolf Saddles", true);

        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
