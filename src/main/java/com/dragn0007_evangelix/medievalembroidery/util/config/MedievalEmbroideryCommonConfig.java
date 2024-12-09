package com.dragn0007_evangelix.medievalembroidery.util.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MedievalEmbroideryCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> TURKEY_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> BUTTERFLY_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> CRESTEDLIZARD_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> GAMEHEN_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> LIGHTNINGBUG_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ELK_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> YAK_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> FAIRY_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> DIREWOLF_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> WOOLLY_BOAR_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> RAVEN_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> MAMMOTH_WEIGHT;

    public static final ForgeConfigSpec.ConfigValue<Integer> CRYSTALPERCHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> GEMPERCHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> SALTPERCHUNK;

    public static final ForgeConfigSpec.ConfigValue<Integer> PLANTTRIES;
    public static final ForgeConfigSpec.ConfigValue<Integer> BUSHTRIES;
    public static final ForgeConfigSpec.ConfigValue<Integer> HERBTRIES;
    public static final ForgeConfigSpec.ConfigValue<Integer> MUSHROOMTRIES;
    public static final ForgeConfigSpec.ConfigValue<Float> TREETRIES;

    static {
        BUILDER.push("Medieval Embroidery");

        BUILDER.push("Creature Spawn Configs");
        TURKEY_WEIGHT = BUILDER.comment("How often should this creature spawn? Default is 5.")
                .define("Turkey Spawn Weight", 5);
        BUTTERFLY_WEIGHT = BUILDER.comment("How often should this creature spawn? Default is 4.")
                .define("Butterfly Spawn Weight", 4);
        CRESTEDLIZARD_WEIGHT = BUILDER.comment("How often should this creature spawn? Default is 4.")
                .define("Crested Lizard Spawn Weight", 4);
        GAMEHEN_WEIGHT = BUILDER.comment("How often should this creature spawn? Default is 5.")
                .define("Cornish Hen Spawn Weight", 5);
        LIGHTNINGBUG_WEIGHT = BUILDER.comment("How often should this creature spawn? Default is 4.")
                .define("Lightning Bug Spawn Weight", 4);
        ELK_WEIGHT = BUILDER.comment("How often should this creature spawn? Default is 4.")
                .define("Fanged Elk Spawn Weight", 4);
        YAK_WEIGHT = BUILDER.comment("How often should this creature spawn? Default is 2.")
                .define("Swamp Yak Spawn Weight", 2);
        FAIRY_WEIGHT = BUILDER.comment("How often should this creature spawn? Default is 5.")
                .define("Fairy Spawn Weight", 5);
        DIREWOLF_WEIGHT = BUILDER.comment("How often should this creature spawn? Default is 4.")
                .define("Direwolf Spawn Weight", 4);
        WOOLLY_BOAR_WEIGHT = BUILDER.comment("How often should this creature spawn? Default is 4.")
                .define("Woolly Boar Spawn Weight", 4);
        RAVEN_WEIGHT = BUILDER.comment("How often should this creature spawn? Default is 4.")
                .define("Raven Spawn Weight", 4);
        MAMMOTH_WEIGHT = BUILDER.comment("How often should this creature spawn? Default is 3.")
                .define("Mammoth Spawn Weight", 4);
        BUILDER.pop();
    }

    static {
        BUILDER.push("Ore Spawn Configs");
        CRYSTALPERCHUNK = BUILDER.comment("How many veins per chunk? Default is 3.")
                .define("Crystal Veins Per Chunk", 3);
        GEMPERCHUNK = BUILDER.comment("How many veins per chunk? Default is 5.")
                .define("Gem Veins Per Chunk", 5);
        SALTPERCHUNK = BUILDER.comment("How many veins per chunk? Default is 5.")
                .define("Salt Veins Per Chunk", 5);
        BUILDER.pop();
    }

    static {
        BUILDER.push("Flora Spawn Configs");
        BUSHTRIES = BUILDER.comment("How many times should I try to spawn in one area? Default is 12.")
                .define("Berry Bush Tries", 12);
        HERBTRIES = BUILDER.comment("How many times should I try to spawn in one area? Default is 10.")
                .define("Herb Plant Tries", 10);
        MUSHROOMTRIES = BUILDER.comment("How many times should I try to spawn in one area? Default is 10.")
                .define("Mushroom Tries", 10);
        PLANTTRIES = BUILDER.comment("How many times should I try to spawn in one area? Default is 10.")
                .define("Plant/ Flower Tries", 10);
        TREETRIES = BUILDER.comment("How many times should I try to spawn in one area? Default is 0.01F.")
                .define("Tree Tries", 0.01F);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
