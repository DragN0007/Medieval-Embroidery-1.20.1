package com.dragn0007_evangelix.medievalembroidery.event;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocksDataGen;
import com.dragn0007_evangelix.medievalembroidery.block.pixel_placement.util.PixelPlacerEntityRenderer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = MedievalEmbroidery.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MedievalEmbroideryBlockEvents {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {

        //Food - Placed
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.SWEET_BREAD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.SWEET_BREAD_CREAM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.SWEET_BREAD_HONEY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.SWEET_BREAD_REDCURRANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.SWEET_BREAD_BILBERRY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.SWEET_BREAD_COWBERRY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.SWEET_BREAD_HAWTHORN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.SWEET_BREAD_ELDERBERRY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.SWEET_BREAD_FRUIT.get(), RenderType.cutout());

        //Blocks
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.APPLE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.APRICOT_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.LEMON_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.APPLE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.APRICOT_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.LEMON_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.HEALING_CRYSTAL_ORE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.CONJURING_CRYSTAL_ORE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.ASSISTIVE_CRYSTAL_ORE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.DESTRUCTIVE_CRYSTAL_ORE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.PROTECTIVE_CRYSTAL_ORE.get(), RenderType.translucent());

        // decor
        ResourceLocation resourceLocation = new ResourceLocation(MedievalEmbroidery.MODID, "null");
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.PIXEL_PLACER_CONTAINER.get(), RenderType.lineStrip());

//        ItemBlockRenderTypes.setRenderLayer(MEBlocks.BIG_TAVERNTABLE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.MED_TAVERNTABLE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.SML_TAVERNTABLE.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(MEBlocks.POTION_CAULDRON.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_6.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_7.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_8.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_9.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_10.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_PANE_1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_PANE_2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_PANE_3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_PANE_4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_PANE_5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_PANE_6.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_PANE_7.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_PANE_8.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_PANE_9.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocksDataGen.FRAMED_GLASS_PANE_10.get(), RenderType.cutout());

        //Fungi
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.BLEWIT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.HONEY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.KING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.MATSUTAKE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.OYSTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.PORCINI.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.YELLOWFOOT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.WOODSCHICKEN.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(MEBlocks.BLEWIT_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.HONEY_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.KING_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.MATSUTAKE_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.OYSTER_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.PORCINI_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.YELLOWFOOT_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.WOODSCHICKEN_CROP.get(), RenderType.cutout());

        //Plants
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.BLUE_DRAGON.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.VIOLET_DRAGON.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.PINK_MAGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.PURPLE_MAGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.GROUND_VINE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.FIRE_DAISY.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(MEBlocks.POTTED_BLUE_DRAGON.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.POTTED_VIOLET_DRAGON.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.POTTED_PINK_MAGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.POTTED_PURPLE_MAGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.POTTED_FIRE_DAISY.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(MEBlocks.ELDERBERRY_BUSH_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.BILBERRY_BUSH_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.COWBERRY_BUSH_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.REDCURRANT_BUSH_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.HAWTHORN_BUSH_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(MEBlocks.HENVEN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.WILD_HENVEN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.CANNAAN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.WILD_CANNAAN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.DRAGONEYE_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.WILD_DRAGONEYE_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.SPRINNAN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.WILD_SPRINNAN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.VIRENNES_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.WILD_VIRENNES_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.BRUTEFLOWER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.WILD_BRUTEFLOWER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.GRANGIN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.WILD_GRANGIN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.CACHEN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.WILD_CACHEN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.LADYRIVER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.WILD_LADYRIVER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.FAIRYFLOWER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(MEBlocks.WILD_FAIRYFLOWER_PLANT.get(), RenderType.cutout());
    }

    @SubscribeEvent
    public static void entityRendererEvent(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(MEBlocks.PIXEL_PLACER_ENTITY.get(), PixelPlacerEntityRenderer::new);
    }
}




