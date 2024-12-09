package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import com.dragn0007.medievalembroidery.block.MEBlocks;
import com.dragn0007.medievalembroidery.block.MEBlocksDataGen;
import com.dragn0007.medievalembroidery.item.MEItemGroup;
import com.dragn0007.medievalembroidery.item.MEItems;
import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocksDataGen;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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
        simpleItem(MEItems.CRYSTAL_DUST.get());

        simpleSpriteBlockItem(MEBlocks.VIOLET_DRAGON.get());
        simpleSpriteBlockItem(MEBlocks.BLUE_DRAGON.get());
        simpleSpriteBlockItem(MEBlocks.FIRE_DAISY.get());

        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_1.get());
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_2.get());
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_3.get());
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_4.get());
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_5.get());
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_6.get());
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_7.get());
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_8.get());
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_9.get());
        simpleSpriteBlockItem(MEBlocksDataGen.FRAMED_GLASS_PANE_10.get());

        simpleItem(MEItems.IRON_DRAGON_ARMOR.get());
        simpleItem(MEItems.GOLD_DRAGON_ARMOR.get());
        simpleItem(MEItems.DIAMOND_DRAGON_ARMOR.get());
        simpleItem(MEItems.NETHERITE_DRAGON_ARMOR.get());
        simpleItem(MEItems.OBSIDIAN_DRAGON_ARMOR.get());

        simpleItem(MEItems.BLACK_DRAGON_BANNER.get());
        simpleItem(MEItems.BLUE_DRAGON_BANNER.get());
        simpleItem(MEItems.BROWN_DRAGON_BANNER.get());
        simpleItem(MEItems.CYAN_DRAGON_BANNER.get());
        simpleItem(MEItems.GREEN_DRAGON_BANNER.get());
        simpleItem(MEItems.GREY_DRAGON_BANNER.get());
        simpleItem(MEItems.LIGHT_BLUE_DRAGON_BANNER.get());
        simpleItem(MEItems.LIGHT_GREY_DRAGON_BANNER.get());
        simpleItem(MEItems.LIME_DRAGON_BANNER.get());
        simpleItem(MEItems.MAGENTA_DRAGON_BANNER.get());
        simpleItem(MEItems.ORANGE_DRAGON_BANNER.get());
        simpleItem(MEItems.PINK_DRAGON_BANNER.get());
        simpleItem(MEItems.PURPLE_DRAGON_BANNER.get());
        simpleItem(MEItems.RED_DRAGON_BANNER.get());
        simpleItem(MEItems.WHITE_DRAGON_BANNER.get());
        simpleItem(MEItems.YELLOW_DRAGON_BANNER.get());

        //TODO;
//        handheldItem(MEItems.SPECTRAL_AXE.get());
//        handheldItem(MEItems.SPECTRAL_HOE.get());
//        handheldItem(MEItems.SPECTRAL_PICKAXE.get());
//        handheldItem(MEItems.SPECTRAL_SHOVEL.get());
//        handheldItem(MEItems.SPECTRAL_SWORD.get());

        handheldItem(MEItems.OBSIDIAN_AXE.get());
        handheldItem(MEItems.OBSIDIAN_HOE.get());
        handheldItem(MEItems.OBSIDIAN_PICKAXE.get());
        handheldItem(MEItems.OBSIDIAN_SHOVEL.get());
        handheldItem(MEItems.OBSIDIAN_SWORD.get());

        simpleItem(MEItems.YAK_WOOL_HELMET.get());
        simpleItem(MEItems.YAK_WOOL_CHESTPLATE.get());
        simpleItem(MEItems.YAK_WOOL_LEGGINGS.get());
        simpleItem(MEItems.YAK_WOOL_BOOTS.get());

        simpleItem(MEItems.OBSIDIAN_HELMET.get());
        simpleItem(MEItems.OBSIDIAN_CHESTPLATE.get());
        simpleItem(MEItems.OBSIDIAN_LEGGINGS.get());
        simpleItem(MEItems.OBSIDIAN_BOOTS.get());

        simpleItem(MEItems.DIREWOLF_HELMET.get());
        simpleItem(MEItems.DIREWOLF_CHESTPLATE.get());
        simpleItem(MEItems.DIREWOLF_LEGGINGS.get());
        simpleItem(MEItems.DIREWOLF_BOOTS.get());

        simpleItem(MEItems.BOAR_HELMET.get());
        simpleItem(MEItems.BOAR_CHESTPLATE.get());
        simpleItem(MEItems.BOAR_LEGGINGS.get());
        simpleItem(MEItems.BOAR_BOOTS.get());

        simpleItem(MEItems.ATTUNED_SCROLL.get());

        simpleItem(MEItems.ELK.get());
        simpleItem(MEItems.COOKED_ELK.get());
        simpleItem(MEItems.SEASONED_ELK.get());

        simpleItem(MEItems.YAK.get());
        simpleItem(MEItems.COOKED_YAK.get());
        simpleItem(MEItems.SEASONED_YAK.get());

        simpleItem(MEItems.YAK_WOOL.get());
        simpleItem(MEItems.DIREWOLF_FUR.get());
        simpleItem(MEItems.BOAR_FUR.get());

        simpleItem(MEItems.APPLE_CIDER.get());

        simpleItem(MEItems.PICKLED_MEAT.get());
        simpleItem(MEItems.PICKLED_MUSHROOMS.get());
        simpleItem(MEItems.PICKLED_VEGGIES.get());
        simpleItem(MEItems.SOUP_JARRED.get());
        simpleItem(MEItems.STEW_JARRED.get());

        simpleItem(MEItems.BLEWIT_SPORES.get());
        simpleItem(MEItems.KING_SPORES.get());
        simpleItem(MEItems.HONEY_SPORES.get());
        simpleItem(MEItems.OYSTER_SPORES.get());
        simpleItem(MEItems.MATSUTAKE_SPORES.get());
        simpleItem(MEItems.PORCINI_SPORES.get());
        simpleItem(MEItems.WOODSCHICKEN_SPORES.get());
        simpleItem(MEItems.YELLOWFOOT_SPORES.get());

        simpleItem(MEItems.COOKED_BLEWIT.get());
        simpleItem(MEItems.COOKED_KING.get());
        simpleItem(MEItems.COOKED_HONEY.get());
        simpleItem(MEItems.COOKED_OYSTER.get());
        simpleItem(MEItems.COOKED_MATSUTAKE.get());
        simpleItem(MEItems.COOKED_PORCINI.get());
        simpleItem(MEItems.COOKED_WOODSCHICKEN.get());
        simpleItem(MEItems.COOKED_YELLOWFOOT.get());

        simpleItem(MEItems.SEASONED_BLEWIT.get());
        simpleItem(MEItems.SEASONED_KING.get());
        simpleItem(MEItems.SEASONED_HONEY.get());
        simpleItem(MEItems.SEASONED_OYSTER.get());
        simpleItem(MEItems.SEASONED_MATSUTAKE.get());
        simpleItem(MEItems.SEASONED_PORCINI.get());
        simpleItem(MEItems.SEASONED_WOODSCHICKEN.get());
        simpleItem(MEItems.SEASONED_YELLOWFOOT.get());

        //TODO;
        simpleItem(MEItems.ASSISTIVE_SPELL.get());
        simpleItem(MEItems.ASSISTIVE_SPELL_FIRE.get());
        simpleItem(MEItems.ASSISTIVE_SPELL_WATER.get());
        simpleItem(MEItems.ASSISTIVE_SPELL_ICE.get());
        simpleItem(MEItems.ASSISTIVE_SPELL_NATURE.get());
        simpleItem(MEItems.ASSISTIVE_SPELL_DEPTHS.get());
        simpleItem(MEItems.ASSISTIVE_SPELL_ASTRO.get());
        simpleItem(MEItems.ASSISTIVE_SPELL_WEATHER.get());

        simpleItem(MEItems.DEFENSIVE_SPELL.get());
        simpleItem(MEItems.DEFENSIVE_SPELL_FIRE.get());
        simpleItem(MEItems.DEFENSIVE_SPELL_WATER.get());
        simpleItem(MEItems.DEFENSIVE_SPELL_ICE.get());
        simpleItem(MEItems.DEFENSIVE_SPELL_NATURE.get());
        simpleItem(MEItems.DEFENSIVE_SPELL_DEPTHS.get());
        simpleItem(MEItems.DEFENSIVE_SPELL_ASTRO.get());
        simpleItem(MEItems.DEFENSIVE_SPELL_WEATHER.get());

        simpleItem(MEItems.HEALING_SPELL.get());
        simpleItem(MEItems.HEALING_SPELL_FIRE.get());
        simpleItem(MEItems.HEALING_SPELL_WATER.get());
        simpleItem(MEItems.HEALING_SPELL_ICE.get());
        simpleItem(MEItems.HEALING_SPELL_NATURE.get());
        simpleItem(MEItems.HEALING_SPELL_DEPTHS.get());
        simpleItem(MEItems.HEALING_SPELL_ASTRO.get());
        simpleItem(MEItems.HEALING_SPELL_WEATHER.get());

        simpleItem(MEItems.OFFENSIVE_SPELL.get());
        simpleItem(MEItems.OFFENSIVE_SPELL_FIRE.get());
        simpleItem(MEItems.OFFENSIVE_SPELL_WATER.get());
        simpleItem(MEItems.OFFENSIVE_SPELL_ICE.get());
        simpleItem(MEItems.OFFENSIVE_SPELL_NATURE.get());
        simpleItem(MEItems.OFFENSIVE_SPELL_DEPTHS.get());
        simpleItem(MEItems.OFFENSIVE_SPELL_ASTRO.get());
        simpleItem(MEItems.OFFENSIVE_SPELL_WEATHER.get());

        simpleItem(MEItems.SUMMONING_SPELL.get());
        simpleItem(MEItems.SUMMONING_SPELL_FIRE.get());
        simpleItem(MEItems.SUMMONING_SPELL_WATER.get());
        simpleItem(MEItems.SUMMONING_SPELL_ICE.get());
        simpleItem(MEItems.SUMMONING_SPELL_NATURE.get());
        simpleItem(MEItems.SUMMONING_SPELL_DEPTHS.get());
        simpleItem(MEItems.SUMMONING_SPELL_ASTRO.get());
        simpleItem(MEItems.SUMMONING_SPELL_WEATHER.get());

        simpleItem(MEItems.RIBBON.get());

        simpleItem(MEItems.FIRE_RIBBON.get());
        simpleItem(MEItems.WATER_RIBBON.get());
        simpleItem(MEItems.ICE_RIBBON.get());
        simpleItem(MEItems.NATURE_RIBBON.get());
        simpleItem(MEItems.DEPTHS_RIBBON.get());
        simpleItem(MEItems.ASTRO_RIBBON.get());
        simpleItem(MEItems.WEATHER_RIBBON.get());
    }

    //hey tenks look at this cool thing i did to make blocks have simple item textures (primitive non-discord message)(dragn dunk discord day is going well)

    //DAY 73 OF DISCORD DUNK DAY
    //Dear Diary,
    //THE WALLS ARE SPEAKING THE WALLS ARE SPEAKING THE WALLS ARE SPEAKING THE WALLS ARE SPEAKING THE WALLS ARE SPEAKING THE WALLS ARE SPEAKING THE WALLS ARE SPEAKING THE WALLS ARE SPEAKING THE WALLS ARE SPEAKING THE WALLS ARE SPEAKING THE WALLS ARE SPEAKING THE WALLS ARE SPEAKING THE WALLS ARE SPEAKING
    private ItemModelBuilder simpleSpriteBlockItem(Block block) {
        return withExistingParent(block.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MedievalEmbroidery.MODID,"block/" + block.getRegistryName().getPath()));
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MedievalEmbroidery.MODID,"items/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MedievalEmbroidery.MODID,"items/" + item.getRegistryName().getPath()));
    }
}