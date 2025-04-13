package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
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
        simpleItem(MEItems.MORTAR_AND_PESTLE);

        simpleItem(MEItems.FIRESTONE);
        simpleItem(MEItems.SEASTONE);
        simpleItem(MEItems.FROSTSTONE);
        simpleItem(MEItems.MOSSTONE);
        simpleItem(MEItems.ASTROSTONE);
        simpleItem(MEItems.DEPTHSTONE);
        simpleItem(MEItems.SKYSTONE);
        simpleItem(MEItems.SALT);

        simpleItem(MEItems.DIREWOLF_EYE);
        simpleItem(MEItems.FAIRY_DUST);
        simpleItem(MEItems.OBSIDIAN_SHARD);
        simpleItem(MEItems.CRYING_OBSIDIAN_SHARD);
        simpleItem(MEItems.CRYSTAL_DUST);

        simpleItem(MEItems.ASSISTIVE_CRYSTAL_SHARD);
        simpleItem(MEItems.CONJURING_CRYSTAL_SHARD);
        simpleItem(MEItems.DESTRUCTIVE_CRYSTAL_SHARD);
        simpleItem(MEItems.HEALING_CRYSTAL_SHARD);
        simpleItem(MEItems.PROTECTIVE_CRYSTAL_SHARD);

        simpleSpriteBlockItem(MEBlocks.ASSISTIVE_CRYSTAL_BALL);
        simpleSpriteBlockItem(MEBlocks.CONJURING_CRYSTAL_BALL);
        simpleSpriteBlockItem(MEBlocks.DESTRUCTIVE_CRYSTAL_BALL);
        simpleSpriteBlockItem(MEBlocks.HEALING_CRYSTAL_BALL);
        simpleSpriteBlockItem(MEBlocks.PROTECTIVE_CRYSTAL_BALL);

        simpleItem(MEItems.SWEET_BREAD);
        simpleItem(MEItems.SWEET_BREAD_CREAM);
        simpleItem(MEItems.SWEET_BREAD_HONEY);
        simpleItem(MEItems.BILBERRY_SWEET_BREAD_CREAM);
        simpleItem(MEItems.COWBERRY_SWEET_BREAD_CREAM);
        simpleItem(MEItems.ELDERBERRY_SWEET_BREAD_CREAM);
        simpleItem(MEItems.HAWTHORN_SWEET_BREAD_CREAM);
        simpleItem(MEItems.REDCURRANT_SWEET_BREAD_CREAM);
        simpleItem(MEItems.FRUIT_SWEET_BREAD_CREAM);
        simpleItem(MEItems.BILBERRY_GLAZE);
        simpleItem(MEItems.COWBERRY_GLAZE);
        simpleItem(MEItems.ELDERBERRY_GLAZE);
        simpleItem(MEItems.HAWTHORN_GLAZE);
        simpleItem(MEItems.REDCURRANT_GLAZE);
        simpleItem(MEItems.FRUIT_GLAZE);
        simpleItem(MEItems.BILBERRY_PIE);
        simpleItem(MEItems.COWBERRY_PIE);
        simpleItem(MEItems.ELDERBERRY_PIE);
        simpleItem(MEItems.HAWTHORN_PIE);
        simpleItem(MEItems.REDCURRANT_PIE);
        simpleItem(MEItems.MIXEDBERRY_PIE);

        simpleItem(MEItems.BILBERRY);
        simpleItem(MEItems.COWBERRY);
        simpleItem(MEItems.ELDERBERRY);
        simpleItem(MEItems.HAWTHORNBERRY);
        simpleItem(MEItems.REDCURRANT);

        simpleItem(MEItems.HENVEN);
        simpleItem(MEItems.CANNAAN);
        simpleItem(MEItems.DRAGONEYE);
        simpleItem(MEItems.SPRINNAN);
        simpleItem(MEItems.VIRENNES);
        simpleItem(MEItems.BRUTEFLOWER);
        simpleItem(MEItems.GRANGIN);
        simpleItem(MEItems.FAIRYFLOWER);
        simpleItem(MEItems.CACHEN);
        simpleItem(MEItems.LADYRIVER);

        simpleSpriteBlock(MEBlocks.BLUE_DRAGON);
        simpleSpriteBlock(MEBlocks.VIOLET_DRAGON);
        simpleSpriteBlock(MEBlocks.PINK_MAGE);
        simpleSpriteBlock(MEBlocks.PURPLE_MAGE);
        simpleSpriteBlock(MEBlocks.FIRE_DAISY);
        simpleSpriteBlock(MEBlocks.GROUND_VINE);
        simpleItem(MEItems.LEMON_SEED);
        simpleItem(MEItems.APRICOT_PIT);
        simpleItem(MEItems.APPLE_SEED);

        simpleItem(MEItems.FLOUR);
        simpleItem(MEItems.SALT_BRINE);
        simpleItem(MEItems.MALTED_GRAIN);
        simpleItem(MEItems.WATER);

        simpleItem(MEItems.ALE);
        simpleItem(MEItems.FAIRY_ALE);
        simpleItem(MEItems.BILBERRY_MEAD);
        simpleItem(MEItems.COWBERRY_MEAD);
        simpleItem(MEItems.ELDERBERRY_MEAD);
        simpleItem(MEItems.HAWTHORN_MEAD);
        simpleItem(MEItems.REDCURRANT_MEAD);
        simpleItem(MEItems.HONEY_MEAD);
        simpleItem(MEItems.HERBAL_MEAD);

        simpleItem(MEItems.PICKLED_EGG);
        simpleItem(MEItems.PICKLED_MEAT);
        simpleItem(MEItems.PICKLED_MUSHROOMS);
        simpleItem(MEItems.PICKLED_VEGGIES);
        simpleItem(MEItems.SOUP_JARRED);
        simpleItem(MEItems.STEW_JARRED);

        simpleItem(MEItems.BLEWIT);
        simpleItem(MEItems.COOKED_BLEWIT);
        simpleItem(MEItems.SEASONED_BLEWIT);
        simpleItem(MEItems.HONEY);
        simpleItem(MEItems.COOKED_HONEY);
        simpleItem(MEItems.SEASONED_HONEY);
        simpleItem(MEItems.KING);
        simpleItem(MEItems.COOKED_KING);
        simpleItem(MEItems.SEASONED_KING);
        simpleItem(MEItems.OYSTER);
        simpleItem(MEItems.COOKED_OYSTER);
        simpleItem(MEItems.SEASONED_OYSTER);
        simpleItem(MEItems.MATSUTAKE);
        simpleItem(MEItems.COOKED_MATSUTAKE);
        simpleItem(MEItems.SEASONED_MATSUTAKE);
        simpleItem(MEItems.PORCINI);
        simpleItem(MEItems.COOKED_PORCINI);
        simpleItem(MEItems.SEASONED_PORCINI);
        simpleItem(MEItems.YELLOWFOOT);
        simpleItem(MEItems.COOKED_YELLOWFOOT);
        simpleItem(MEItems.SEASONED_YELLOWFOOT);
        simpleItem(MEItems.WOODS_CHICKEN);
        simpleItem(MEItems.COOKED_WOODS_CHICKEN);
        simpleItem(MEItems.SEASONED_WOODS_CHICKEN);

        simpleItem(MEItems.ELK);
        simpleItem(MEItems.COOKED_ELK);
        simpleItem(MEItems.SEASONED_ELK);
        simpleItem(MEItems.YAK);
        simpleItem(MEItems.COOKED_YAK);
        simpleItem(MEItems.SEASONED_YAK);
        simpleItem(MEItems.DIREWOLF);
        simpleItem(MEItems.COOKED_DIREWOLF);
        simpleItem(MEItems.SEASONED_DIREWOLF);

        simpleItem(MEItems.APPLE_CIDER);
        simpleItem(MEItems.APPLE_JUICE);
        simpleItem(MEItems.APPLE_PIE);
        simpleItem(MEItems.APRICOT);
        simpleItem(MEItems.APRICOT_TEA);
        simpleItem(MEItems.APRICOT_JUICE);
        simpleItem(MEItems.APRICOT_PIE);
        simpleItem(MEItems.LEMON);
        simpleItem(MEItems.LEMON_TEA);
        simpleItem(MEItems.LEMON_JUICE);
        simpleItem(MEItems.LEMON_PIE);

        handheldItem(MEItems.OBSIDIAN_SWORD);
        handheldItem(MEItems.OBSIDIAN_PICKAXE);
        handheldItem(MEItems.OBSIDIAN_SHOVEL);
        handheldItem(MEItems.OBSIDIAN_AXE);
        handheldItem(MEItems.OBSIDIAN_HOE);
        handheldItem(MEItems.OBSIDIAN_DAGGER);
        handheldItem(MEItems.OBSIDIAN_HELMET);
        handheldItem(MEItems.OBSIDIAN_CHESTPLATE);
        handheldItem(MEItems.OBSIDIAN_LEGGING);
        handheldItem(MEItems.OBSIDIAN_BOOTS);

        handheldItem(MEItems.EMERALD_SWORD);
        handheldItem(MEItems.EMERALD_PICKAXE);
        handheldItem(MEItems.EMERALD_SHOVEL);
        handheldItem(MEItems.EMERALD_AXE);
        handheldItem(MEItems.EMERALD_HOE);
        handheldItem(MEItems.EMERALD_DAGGER);
        handheldItem(MEItems.EMERALD_HELMET);
        handheldItem(MEItems.EMERALD_CHESTPLATE);
        handheldItem(MEItems.EMERALD_LEGGING);
        handheldItem(MEItems.EMERALD_BOOTS);

        handheldItem(MEItems.ASTROSTONE_SWORD);
        handheldItem(MEItems.ASTROSTONE_PICKAXE);
        handheldItem(MEItems.ASTROSTONE_SHOVEL);
        handheldItem(MEItems.ASTROSTONE_AXE);
        handheldItem(MEItems.ASTROSTONE_HOE);
        handheldItem(MEItems.ASTROSTONE_DAGGER);
        handheldItem(MEItems.ASTROSTONE_HELMET);
        handheldItem(MEItems.ASTROSTONE_CHESTPLATE);
        handheldItem(MEItems.ASTROSTONE_LEGGING);
        handheldItem(MEItems.ASTROSTONE_BOOTS);

        handheldItem(MEItems.DEPTHSTONE_SWORD);
        handheldItem(MEItems.DEPTHSTONE_PICKAXE);
        handheldItem(MEItems.DEPTHSTONE_SHOVEL);
        handheldItem(MEItems.DEPTHSTONE_AXE);
        handheldItem(MEItems.DEPTHSTONE_HOE);
        handheldItem(MEItems.DEPTHSTONE_DAGGER);
        handheldItem(MEItems.DEPTHSTONE_HELMET);
        handheldItem(MEItems.DEPTHSTONE_CHESTPLATE);
        handheldItem(MEItems.DEPTHSTONE_LEGGING);
        handheldItem(MEItems.DEPTHSTONE_BOOTS);

        handheldItem(MEItems.FIRESTONE_SWORD);
        handheldItem(MEItems.FIRESTONE_PICKAXE);
        handheldItem(MEItems.FIRESTONE_SHOVEL);
        handheldItem(MEItems.FIRESTONE_AXE);
        handheldItem(MEItems.FIRESTONE_HOE);
        handheldItem(MEItems.FIRESTONE_DAGGER);
        handheldItem(MEItems.FIRESTONE_HELMET);
        handheldItem(MEItems.FIRESTONE_CHESTPLATE);
        handheldItem(MEItems.FIRESTONE_LEGGING);
        handheldItem(MEItems.FIRESTONE_BOOTS);

        handheldItem(MEItems.FROSTSTONE_SWORD);
        handheldItem(MEItems.FROSTSTONE_PICKAXE);
        handheldItem(MEItems.FROSTSTONE_SHOVEL);
        handheldItem(MEItems.FROSTSTONE_AXE);
        handheldItem(MEItems.FROSTSTONE_HOE);
        handheldItem(MEItems.FROSTSTONE_DAGGER);
        handheldItem(MEItems.FROSTSTONE_HELMET);
        handheldItem(MEItems.FROSTSTONE_CHESTPLATE);
        handheldItem(MEItems.FROSTSTONE_LEGGING);
        handheldItem(MEItems.FROSTSTONE_BOOTS);

        handheldItem(MEItems.MOSSTONE_SWORD);
        handheldItem(MEItems.MOSSTONE_PICKAXE);
        handheldItem(MEItems.MOSSTONE_SHOVEL);
        handheldItem(MEItems.MOSSTONE_AXE);
        handheldItem(MEItems.MOSSTONE_HOE);
        handheldItem(MEItems.MOSSTONE_DAGGER);
        handheldItem(MEItems.MOSSTONE_HELMET);
        handheldItem(MEItems.MOSSTONE_CHESTPLATE);
        handheldItem(MEItems.MOSSTONE_LEGGING);
        handheldItem(MEItems.MOSSTONE_BOOTS);

        handheldItem(MEItems.SEASTONE_SWORD);
        handheldItem(MEItems.SEASTONE_PICKAXE);
        handheldItem(MEItems.SEASTONE_SHOVEL);
        handheldItem(MEItems.SEASTONE_AXE);
        handheldItem(MEItems.SEASTONE_HOE);
        handheldItem(MEItems.SEASTONE_DAGGER);
        handheldItem(MEItems.SEASTONE_HELMET);
        handheldItem(MEItems.SEASTONE_CHESTPLATE);
        handheldItem(MEItems.SEASTONE_LEGGING);
        handheldItem(MEItems.SEASTONE_BOOTS);

        handheldItem(MEItems.SKYSTONE_SWORD);
        handheldItem(MEItems.SKYSTONE_PICKAXE);
        handheldItem(MEItems.SKYSTONE_SHOVEL);
        handheldItem(MEItems.SKYSTONE_AXE);
        handheldItem(MEItems.SKYSTONE_HOE);
        handheldItem(MEItems.SKYSTONE_DAGGER);
        handheldItem(MEItems.SKYSTONE_HELMET);
        handheldItem(MEItems.SKYSTONE_CHESTPLATE);
        handheldItem(MEItems.SKYSTONE_LEGGING);
        handheldItem(MEItems.SKYSTONE_BOOTS);
    }

    private ItemModelBuilder simpleSpriteBlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MedievalEmbroidery.MODID,"item/" + block.getId().getPath()));
    }

    private ItemModelBuilder simpleSpriteBlock(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MedievalEmbroidery.MODID,"block/" + block.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MedievalEmbroidery.MODID,"item/" + item.getId().getPath()));
    }

    public ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MedievalEmbroidery.MODID,"item/" + item.getId().getPath()));
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