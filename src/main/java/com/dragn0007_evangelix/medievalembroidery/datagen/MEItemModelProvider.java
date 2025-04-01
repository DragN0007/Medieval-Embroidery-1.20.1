package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocksDataGen;
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