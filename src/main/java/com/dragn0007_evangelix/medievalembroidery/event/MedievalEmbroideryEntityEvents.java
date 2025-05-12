package com.dragn0007_evangelix.medievalembroidery.event;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.entity.EntityTypes;
import com.dragn0007_evangelix.medievalembroidery.entity.direwolf.Direwolf;
import com.dragn0007_evangelix.medievalembroidery.entity.direwolf.DirewolfRender;
import com.dragn0007_evangelix.medievalembroidery.entity.fairy.Fairy;
import com.dragn0007_evangelix.medievalembroidery.entity.fairy.FairyRender;
import com.dragn0007_evangelix.medievalembroidery.entity.fanged_elk.FangedElk;
import com.dragn0007_evangelix.medievalembroidery.entity.fanged_elk.FangedElkRender;
import com.dragn0007_evangelix.medievalembroidery.entity.griffin.Griffin;
import com.dragn0007_evangelix.medievalembroidery.entity.griffin.GriffinRender;
import com.dragn0007_evangelix.medievalembroidery.gui.MEMenuTypes;
import com.dragn0007_evangelix.medievalembroidery.gui.MountScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = MedievalEmbroidery.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MedievalEmbroideryEntityEvents {

    @SubscribeEvent
    public static void entityAttrbiuteCreationEvent(EntityAttributeCreationEvent event) {
        event.put(EntityTypes.DIREWOLF_ENTITY.get(), Direwolf.createAttributes().build());
        event.put(EntityTypes.FAIRY_ENTITY.get(), Fairy.createAttributes().build());
        event.put(EntityTypes.FANGED_ELK_ENTITY.get(), FangedElk.createBaseHorseAttributes().build());
        event.put(EntityTypes.GRIFFIN_ENTITY.get(), Griffin.createAttributes().build());
    }

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
        EntityRenderers.register(EntityTypes.DIREWOLF_ENTITY.get(), DirewolfRender::new);
        EntityRenderers.register(EntityTypes.FAIRY_ENTITY.get(), FairyRender::new);
        EntityRenderers.register(EntityTypes.FANGED_ELK_ENTITY.get(), FangedElkRender::new);
        EntityRenderers.register(EntityTypes.GRIFFIN_ENTITY.get(), GriffinRender::new);

        MenuScreens.register(MEMenuTypes.MOUNT_MENU.get(), MountScreen::new);
    }

    @SubscribeEvent
    public static void spawnPlacementRegisterEvent(SpawnPlacementRegisterEvent event) {
        event.register(EntityTypes.DIREWOLF_ENTITY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.AND);
        event.register(EntityTypes.FAIRY_ENTITY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.AND);
        event.register(EntityTypes.FANGED_ELK_ENTITY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.AND);
        event.register(EntityTypes.GRIFFIN_ENTITY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.AND);
    }
}




