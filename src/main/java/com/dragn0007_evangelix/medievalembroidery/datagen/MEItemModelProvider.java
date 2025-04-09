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
        simpleItem(MEItems.CRYSTAL_DUST);

        simpleItem(MEItems.DIREWOLF_EYE);

        simpleItem(MEItems.ASSISTIVE_CRYSTAL_SHARD);
        simpleItem(MEItems.CONJURING_CRYSTAL_SHARD);
        simpleItem(MEItems.DESTRUCTIVE_CRYSTAL_SHARD);
        simpleItem(MEItems.HEALING_CRYSTAL_SHARD);
        simpleItem(MEItems.PROTECTIVE_CRYSTAL_SHARD);

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

        simpleSpriteBlockItem(MEBlocks.BLUE_DRAGON);
        simpleSpriteBlockItem(MEBlocks.VIOLET_DRAGON);
        simpleSpriteBlockItem(MEBlocks.PINK_MAGE);
        simpleSpriteBlockItem(MEBlocks.PURPLE_MAGE);
        simpleSpriteBlockItem(MEBlocks.FIRE_DAISY);
        simpleSpriteBlockItem(MEBlocks.GROUND_VINE);

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