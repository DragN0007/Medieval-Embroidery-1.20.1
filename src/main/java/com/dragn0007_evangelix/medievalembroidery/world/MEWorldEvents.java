package com.dragn0007_evangelix.medievalembroidery.world;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import com.dragn0007.medievalembroidery.world.gen.CreatureSpawnGeneration;
import com.dragn0007.medievalembroidery.world.gen.MEFlowerGeneration;
import com.dragn0007.medievalembroidery.world.gen.MEOreGeneration;
import com.dragn0007.medievalembroidery.world.gen.METreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber (modid = MedievalEmbroideryMain.MODID)
public class MEWorldEvents {
    @SubscribeEvent
            public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
    MEOreGeneration.generateOres(event);
    MEFlowerGeneration.generateFlowers(event);
    METreeGeneration.generateTrees(event);
    CreatureSpawnGeneration.onEntitySpawn(event);
    }
}
