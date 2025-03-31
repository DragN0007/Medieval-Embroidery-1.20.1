package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocksDataGen;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class MEItemModelProvider extends ItemModelProvider {
    public MEItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MedievalEmbroidery.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(MEItems.CRYSTAL_DUST);

        simpleSpriteBlockItem(MEBlocks.VIOLET_DRAGON);
        simpleSpriteBlockItem(MEBlocks.BLUE_DRAGON);
        simpleSpriteBlockItem(MEBlocks.FIRE_DAISY);

        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_1);
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_2);
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_3);
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_4);
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_5);
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_6);
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_7);
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_8);
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_9);
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_10);

        simpleItem(MEItems.IRON_DRAGON_ARMOR);
        simpleItem(MEItems.GOLD_DRAGON_ARMOR);
        simpleItem(MEItems.DIAMOND_DRAGON_ARMOR);
        simpleItem(MEItems.NETHERITE_DRAGON_ARMOR);
        simpleItem(MEItems.OBSIDIAN_DRAGON_ARMOR);

        simpleItem(MEItems.BLACK_DRAGON_BANNER);
        simpleItem(MEItems.BLUE_DRAGON_BANNER);
        simpleItem(MEItems.BROWN_DRAGON_BANNER);
        simpleItem(MEItems.CYAN_DRAGON_BANNER);
        simpleItem(MEItems.GREEN_DRAGON_BANNER);
        simpleItem(MEItems.GREY_DRAGON_BANNER);
        simpleItem(MEItems.LIGHT_BLUE_DRAGON_BANNER);
        simpleItem(MEItems.LIGHT_GREY_DRAGON_BANNER);
        simpleItem(MEItems.LIME_DRAGON_BANNER);
        simpleItem(MEItems.MAGENTA_DRAGON_BANNER);
        simpleItem(MEItems.ORANGE_DRAGON_BANNER);
        simpleItem(MEItems.PINK_DRAGON_BANNER);
        simpleItem(MEItems.PURPLE_DRAGON_BANNER);
        simpleItem(MEItems.RED_DRAGON_BANNER);
        simpleItem(MEItems.WHITE_DRAGON_BANNER);
        simpleItem(MEItems.YELLOW_DRAGON_BANNER);

        //TODO;
//        handheldItem(MEItems.SPECTRAL_AXE);
//        handheldItem(MEItems.SPECTRAL_HOE);
//        handheldItem(MEItems.SPECTRAL_PICKAXE);
//        handheldItem(MEItems.SPECTRAL_SHOVEL);
//        handheldItem(MEItems.SPECTRAL_SWORD);

        handheldItem(MEItems.OBSIDIAN_AXE);
        handheldItem(MEItems.OBSIDIAN_HOE);
        handheldItem(MEItems.OBSIDIAN_PICKAXE);
        handheldItem(MEItems.OBSIDIAN_SHOVEL);
        handheldItem(MEItems.OBSIDIAN_SWORD);

//        simpleItem(MEItems.YAK_WOOL_HELMET);
//        simpleItem(MEItems.YAK_WOOL_CHESTPLATE);
//        simpleItem(MEItems.YAK_WOOL_LEGGINGS);
//        simpleItem(MEItems.YAK_WOOL_BOOTS);
//
//        simpleItem(MEItems.OBSIDIAN_HELMET);
//        simpleItem(MEItems.OBSIDIAN_CHESTPLATE);
//        simpleItem(MEItems.OBSIDIAN_LEGGINGS);
//        simpleItem(MEItems.OBSIDIAN_BOOTS);
//
//        simpleItem(MEItems.DIREWOLF_HELMET);
//        simpleItem(MEItems.DIREWOLF_CHESTPLATE);
//        simpleItem(MEItems.DIREWOLF_LEGGINGS);
//        simpleItem(MEItems.DIREWOLF_BOOTS);
//
//        simpleItem(MEItems.BOAR_HELMET);
//        simpleItem(MEItems.BOAR_CHESTPLATE);
//        simpleItem(MEItems.BOAR_LEGGINGS);
//        simpleItem(MEItems.BOAR_BOOTS);

        simpleItem(MEItems.ATTUNED_SCROLL);

        simpleItem(MEItems.ELK);
        simpleItem(MEItems.COOKED_ELK);
        simpleItem(MEItems.SEASONED_ELK);

        simpleItem(MEItems.YAK);
        simpleItem(MEItems.COOKED_YAK);
        simpleItem(MEItems.SEASONED_YAK);

        simpleItem(MEItems.YAK_WOOL);
        simpleItem(MEItems.DIREWOLF_FUR);
        simpleItem(MEItems.BOAR_FUR);

        simpleItem(MEItems.APPLE_CIDER);

        simpleItem(MEItems.PICKLED_MEAT);
        simpleItem(MEItems.PICKLED_MUSHROOMS);
        simpleItem(MEItems.PICKLED_VEGGIES);
        simpleItem(MEItems.SOUP_JARRED);
        simpleItem(MEItems.STEW_JARRED);

        simpleItem(MEItems.BLEWIT_SPORES);
        simpleItem(MEItems.KING_SPORES);
        simpleItem(MEItems.HONEY_SPORES);
        simpleItem(MEItems.OYSTER_SPORES);
        simpleItem(MEItems.MATSUTAKE_SPORES);
        simpleItem(MEItems.PORCINI_SPORES);
        simpleItem(MEItems.WOODSCHICKEN_SPORES);
        simpleItem(MEItems.YELLOWFOOT_SPORES);

        simpleItem(MEItems.COOKED_BLEWIT);
        simpleItem(MEItems.COOKED_KING);
        simpleItem(MEItems.COOKED_HONEY);
        simpleItem(MEItems.COOKED_OYSTER);
        simpleItem(MEItems.COOKED_MATSUTAKE);
        simpleItem(MEItems.COOKED_PORCINI);
        simpleItem(MEItems.COOKED_WOODSCHICKEN);
        simpleItem(MEItems.COOKED_YELLOWFOOT);

        simpleItem(MEItems.SEASONED_BLEWIT);
        simpleItem(MEItems.SEASONED_KING);
        simpleItem(MEItems.SEASONED_HONEY);
        simpleItem(MEItems.SEASONED_OYSTER);
        simpleItem(MEItems.SEASONED_MATSUTAKE);
        simpleItem(MEItems.SEASONED_PORCINI);
        simpleItem(MEItems.SEASONED_WOODSCHICKEN);
        simpleItem(MEItems.SEASONED_YELLOWFOOT);

        //TODO;
        simpleItem(MEItems.ASSISTIVE_SPELL);
        simpleItem(MEItems.ASSISTIVE_SPELL_FIRE);
        simpleItem(MEItems.ASSISTIVE_SPELL_WATER);
        simpleItem(MEItems.ASSISTIVE_SPELL_ICE);
        simpleItem(MEItems.ASSISTIVE_SPELL_NATURE);
        simpleItem(MEItems.ASSISTIVE_SPELL_DEPTHS);
        simpleItem(MEItems.ASSISTIVE_SPELL_ASTRO);
        simpleItem(MEItems.ASSISTIVE_SPELL_WEATHER);

        simpleItem(MEItems.DEFENSIVE_SPELL);
        simpleItem(MEItems.DEFENSIVE_SPELL_FIRE);
        simpleItem(MEItems.DEFENSIVE_SPELL_WATER);
        simpleItem(MEItems.DEFENSIVE_SPELL_ICE);
        simpleItem(MEItems.DEFENSIVE_SPELL_NATURE);
        simpleItem(MEItems.DEFENSIVE_SPELL_DEPTHS);
        simpleItem(MEItems.DEFENSIVE_SPELL_ASTRO);
        simpleItem(MEItems.DEFENSIVE_SPELL_WEATHER);

        simpleItem(MEItems.HEALING_SPELL);
        simpleItem(MEItems.HEALING_SPELL_FIRE);
        simpleItem(MEItems.HEALING_SPELL_WATER);
        simpleItem(MEItems.HEALING_SPELL_ICE);
        simpleItem(MEItems.HEALING_SPELL_NATURE);
        simpleItem(MEItems.HEALING_SPELL_DEPTHS);
        simpleItem(MEItems.HEALING_SPELL_ASTRO);
        simpleItem(MEItems.HEALING_SPELL_WEATHER);

        simpleItem(MEItems.OFFENSIVE_SPELL);
        simpleItem(MEItems.OFFENSIVE_SPELL_FIRE);
        simpleItem(MEItems.OFFENSIVE_SPELL_WATER);
        simpleItem(MEItems.OFFENSIVE_SPELL_ICE);
        simpleItem(MEItems.OFFENSIVE_SPELL_NATURE);
        simpleItem(MEItems.OFFENSIVE_SPELL_DEPTHS);
        simpleItem(MEItems.OFFENSIVE_SPELL_ASTRO);
        simpleItem(MEItems.OFFENSIVE_SPELL_WEATHER);

        simpleItem(MEItems.SUMMONING_SPELL);
        simpleItem(MEItems.SUMMONING_SPELL_FIRE);
        simpleItem(MEItems.SUMMONING_SPELL_WATER);
        simpleItem(MEItems.SUMMONING_SPELL_ICE);
        simpleItem(MEItems.SUMMONING_SPELL_NATURE);
        simpleItem(MEItems.SUMMONING_SPELL_DEPTHS);
        simpleItem(MEItems.SUMMONING_SPELL_ASTRO);
        simpleItem(MEItems.SUMMONING_SPELL_WEATHER);

        simpleItem(MEItems.RIBBON);

        simpleItem(MEItems.FIRE_RIBBON);
        simpleItem(MEItems.WATER_RIBBON);
        simpleItem(MEItems.ICE_RIBBON);
        simpleItem(MEItems.NATURE_RIBBON);
        simpleItem(MEItems.DEPTHS_RIBBON);
        simpleItem(MEItems.ASTRO_RIBBON);
        simpleItem(MEItems.WEATHER_RIBBON);
    }

     private ItemModelBuilder simpleSpriteBlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MedievalEmbroidery.MODID,"block/" + block.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MedievalEmbroidery.MODID,"items/" + item.getId().getPath()));
    }

    public ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MedievalEmbroidery.MODID,"item/" + item.getId().getPath()));
    }

    public ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MedievalEmbroidery.MODID,"block/" + item.getId().getPath()));
    }

    public ItemModelBuilder parentRotatedBlockItem(RegistryObject<RotatedPillarBlock> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation(MedievalEmbroidery.MODID,"block/" + item.getId().getPath()));
    }

    public ItemModelBuilder advancedItem(RegistryObject<Item> item, String getTextureName) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MedievalEmbroidery.MODID,"item/" + getTextureName));
    }
}