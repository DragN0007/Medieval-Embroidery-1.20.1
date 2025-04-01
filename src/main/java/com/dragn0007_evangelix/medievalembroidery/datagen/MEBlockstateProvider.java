package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MEBlockstateProvider extends BlockStateProvider {
    public MEBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MedievalEmbroidery.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {

    }

}
