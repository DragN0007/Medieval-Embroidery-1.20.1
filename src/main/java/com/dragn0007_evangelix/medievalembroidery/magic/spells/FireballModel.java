package com.dragn0007_evangelix.medievalembroidery.magic.spells;

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

public class FireballModel extends Model {
    public final ModelPart root;
    public final ModelPart cube1;
    //public final ModelPart cube2;

    public static class HyperCube {

        public static class V4 {
            public float x, y, z, w;
        }

        public V4[] vectors;

        public HyperCube() {
            this.vectors = new V4[64];

            for(int x = 0; x < 4; x++) {
                for(int y = 0; y < 4; y++) {
                    for(int z = 0; z < 4; z++) {
                        for(int w = 0; w < 4; w++) {
                            int i = w * 4 + x * 4 + y * 4 + z * 4;
                            this.vectors[i].x = x;
                            this.vectors[i].y = y;
                            this.vectors[i].z = z;
                            this.vectors[i].w = w;
                        }
                    }
                }
            }
        }
    }

    public FireballModel(ModelPart root) {
        super(RenderType::entityTranslucent);
        this.root = root;
        this.cube1 = root.getChild("cube1");
        //this.cube2 = root.getChild("cube2");
    }

    public static LayerDefinition createLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();
        partDefinition.addOrReplaceChild("cube1", CubeListBuilder.create().addBox(5, 11, 5, 6, 6, 6), PartPose.ZERO);
        //partDefinition.addOrReplaceChild("cube2", CubeListBuilder.create().addBox(2, 8, 2, 12, 12, 12), PartPose.ZERO);
        return LayerDefinition.create(meshDefinition, 64, 64);
    }


    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float r, float g, float b, float a) {
        this.root.render(poseStack, vertexConsumer, packedLight, packedOverlay, r, g, b, a);


    }
}
