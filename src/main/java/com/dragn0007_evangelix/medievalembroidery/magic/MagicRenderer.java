package com.dragn0007_evangelix.medievalembroidery.magic;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import com.dragn0007_evangelix.medievalembroidery.magic.spells.FireballModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.MissingTextureAtlasSprite;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class MagicRenderer extends BlockEntityWithoutLevelRenderer {
    public static final MagicRenderer INSTANCE = new MagicRenderer();
    public static final ModelLayerLocation GRIMOIRE = new ModelLayerLocation(new ResourceLocation(MedievalEmbroidery.MODID, "grimoire"), "root");
    public static final ModelLayerLocation FIREBALL = new ModelLayerLocation(new ResourceLocation(MedievalEmbroidery.MODID, "fireball"), "root");

    public EntityModelSet entityModelSet;
    public LocalPlayer player;

    public GrimoireModel grimoireModel;
    public FireballModel fireballModel;


    public MagicRenderer() {
        super(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels());
        this.entityModelSet = Minecraft.getInstance().getEntityModels();
    }

    @Override
    public void onResourceManagerReload(ResourceManager resourceManager) {
        this.grimoireModel = new GrimoireModel(this.entityModelSet.bakeLayer(GRIMOIRE));
        this.fireballModel = new FireballModel(this.entityModelSet.bakeLayer(FIREBALL));
    }

    @Override
    public void renderByItem(ItemStack itemStack, @NotNull ItemDisplayContext itemDisplayContext, PoseStack poseStack, MultiBufferSource multiBufferSource, int packedLight, int packedOverlay) {
        if(itemStack.is(MEItems.GRIMOIRE.get())) {
            VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entitySolid(MissingTextureAtlasSprite.getLocation()));
            this.grimoireModel.renderToBuffer(poseStack, vertexConsumer, packedLight, packedOverlay, 1f, 1f, 1f, 1f);

            if(Minecraft.getInstance().player.getUseItem().is(MEItems.GRIMOIRE.get())) {
                VertexConsumer vertexConsumer1 = multiBufferSource.getBuffer(RenderType.entityTranslucent(new ResourceLocation(MedievalEmbroidery.MODID, "textures/item/grimoire/sided.png")));
                this.fireballModel.renderToBuffer(poseStack, vertexConsumer1, packedLight, packedOverlay, 1f, 1f, 1f, 1f);
            }
        }
    }
}
