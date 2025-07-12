package com.dragn0007_evangelix.medievalembroidery.magic;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GrimoireModel extends Model {
    public final ModelPart root;
    public final ModelPart frontCover;
    public final ModelPart backCover;
    public final ModelPart spine;

    public GrimoireModel(ModelPart root) {
        super(RenderType::entitySolid);
        this.root = root;
        this.frontCover = root.getChild("front_cover");
        this.backCover = root.getChild("back_cover");
        this.spine = root.getChild("spine");
    }

    public static LayerDefinition createLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();
        partDefinition.addOrReplaceChild("front_cover", CubeListBuilder.create().addBox(1.5f, 6.33f, 3, 6, 0.25f, 8), PartPose.ZERO);
        partDefinition.addOrReplaceChild("back_cover", CubeListBuilder.create().addBox(8.5f, 6.33f, 3, 6, 0.25f, 8), PartPose.ZERO);
        partDefinition.addOrReplaceChild("spine", CubeListBuilder.create().addBox(7.5f, 6, 3, 1, 0.33f, 8), PartPose.ZERO);

        return LayerDefinition.create(meshDefinition, 16, 16);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float r, float g, float b, float a) {
        this.root.render(poseStack, vertexConsumer, packedLight, packedOverlay, r, g, b, a);
    }
}
