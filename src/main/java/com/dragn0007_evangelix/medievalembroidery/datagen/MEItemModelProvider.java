package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
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