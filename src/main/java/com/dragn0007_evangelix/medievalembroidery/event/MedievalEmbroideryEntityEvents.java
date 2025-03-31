package com.dragn0007_evangelix.medievalembroidery.event;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.entity.EntityTypes;
import com.dragn0007_evangelix.medievalembroidery.entity.butterfly.ButterflyEntity;
import com.dragn0007_evangelix.medievalembroidery.entity.butterfly.ButterflyRender;
import com.dragn0007_evangelix.medievalembroidery.entity.crestedlizard.CrestedLizardRender;
import com.dragn0007_evangelix.medievalembroidery.entity.direwolf.DireWolf;
import com.dragn0007_evangelix.medievalembroidery.entity.direwolf.DireWolfRender;
import com.dragn0007_evangelix.medievalembroidery.entity.fairy.Fairy;
import com.dragn0007_evangelix.medievalembroidery.entity.fairy.FairyRender;
import com.dragn0007_evangelix.medievalembroidery.entity.fangedelk.FangedElk;
import com.dragn0007_evangelix.medievalembroidery.entity.fangedelk.FangedElkRender;
import com.dragn0007_evangelix.medievalembroidery.entity.gamehen.GameHenEntity;
import com.dragn0007_evangelix.medievalembroidery.entity.gamehen.GameHenRender;
import com.dragn0007_evangelix.medievalembroidery.entity.lightningbug.LightningBugEntity;
import com.dragn0007_evangelix.medievalembroidery.entity.lightningbug.LightningBugRender;
import com.dragn0007_evangelix.medievalembroidery.entity.mammoth.Mammoth;
import com.dragn0007_evangelix.medievalembroidery.entity.mammoth.MammothRender;
import com.dragn0007_evangelix.medievalembroidery.entity.raven.Raven;
import com.dragn0007_evangelix.medievalembroidery.entity.raven.RavenRender;
import com.dragn0007_evangelix.medievalembroidery.entity.swampyak.SwampYak;
import com.dragn0007_evangelix.medievalembroidery.entity.swampyak.SwampYakRender;
import com.dragn0007_evangelix.medievalembroidery.entity.swampyak.SwampYakScreen;
import com.dragn0007_evangelix.medievalembroidery.entity.turkey.TurkeyEntity;
import com.dragn0007_evangelix.medievalembroidery.entity.turkey.TurkeyRender;
import com.dragn0007_evangelix.medievalembroidery.entity.woollyboar.WoollyBoar;
import com.dragn0007_evangelix.medievalembroidery.entity.woollyboar.WoollyBoarRender;
import com.dragn0007_evangelix.medievalembroidery.gui.MEMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = MedievalEmbroidery.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MedievalEmbroideryEntityEvents {

    @SubscribeEvent
    public static void entityAttrbiuteCreationEvent(EntityAttributeCreationEvent event) {

        event.put(EntityTypes.BUTTERFLY_ENTITY.get(), ButterflyEntity.createAttributes().build());
        SpawnPlacements.register
                (EntityTypes.BUTTERFLY_ENTITY.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);

        event.put(EntityTypes.TURKEY_ENTITY.get(), TurkeyEntity.createAttributes().build());
        SpawnPlacements.register
                (EntityTypes.TURKEY_ENTITY.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);

        event.put(EntityTypes.CRESTEDLIZARD_ENTITY.get(), TurkeyEntity.createAttributes().build());
        SpawnPlacements.register
                (EntityTypes.CRESTEDLIZARD_ENTITY.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);

        event.put(EntityTypes.GAMEHEN_ENTITY.get(), GameHenEntity.createAttributes().build());
        SpawnPlacements.register
                (EntityTypes.GAMEHEN_ENTITY.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, GameHenEntity::checkAnimalSpawnRules);

        event.put(EntityTypes.LIGHTNING_BUG_ENTITY.get(), LightningBugEntity.createAttributes().build());
        SpawnPlacements.register
                (EntityTypes.LIGHTNING_BUG_ENTITY.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);

        event.put(EntityTypes.FANGEDELK_ENTITY.get(), FangedElk.createAttributes().build());
        SpawnPlacements.register
                (EntityTypes.FANGEDELK_ENTITY.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);

        event.put(EntityTypes.SWAMPYAK_ENTITY.get(), SwampYak.createAttributes().build());
        SpawnPlacements.register
                (EntityTypes.SWAMPYAK_ENTITY.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);

        event.put(EntityTypes.FAIRY_ENTITY.get(), Fairy.createAttributes().build());
        SpawnPlacements.register
                (EntityTypes.FAIRY_ENTITY.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);

        event.put(EntityTypes.DIREWOLF_ENTITY.get(), DireWolf.createAttributes().build());
        SpawnPlacements.register
                (EntityTypes.DIREWOLF_ENTITY.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);

        event.put(EntityTypes.WOOLLYBOAR_ENTITY.get(), WoollyBoar.createAttributes().build());
        SpawnPlacements.register
                (EntityTypes.WOOLLYBOAR_ENTITY.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);

        event.put(EntityTypes.RAVEN_ENTITY.get(), Raven.createAttributes().build());
        SpawnPlacements.register
                (EntityTypes.RAVEN_ENTITY.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);

        event.put(EntityTypes.MAMMOTH_ENTITY.get(), Mammoth.createAttributes().build());
        SpawnPlacements.register
                (EntityTypes.MAMMOTH_ENTITY.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);
    }

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {

        EntityRenderers.register(EntityTypes.BUTTERFLY_ENTITY.get(), ButterflyRender::new);
        EntityRenderers.register(EntityTypes.TURKEY_ENTITY.get(), TurkeyRender::new);
        EntityRenderers.register(EntityTypes.CRESTEDLIZARD_ENTITY.get(), CrestedLizardRender::new);
        EntityRenderers.register(EntityTypes.GAMEHEN_ENTITY.get(), GameHenRender::new);
        EntityRenderers.register(EntityTypes.LIGHTNING_BUG_ENTITY.get(), LightningBugRender::new);
        EntityRenderers.register(EntityTypes.FANGEDELK_ENTITY.get(), FangedElkRender::new);
        EntityRenderers.register(EntityTypes.SWAMPYAK_ENTITY.get(), SwampYakRender::new);
        EntityRenderers.register(EntityTypes.FAIRY_ENTITY.get(), FairyRender::new);
        EntityRenderers.register(EntityTypes.DIREWOLF_ENTITY.get(), DireWolfRender::new);
        EntityRenderers.register(EntityTypes.WOOLLYBOAR_ENTITY.get(), WoollyBoarRender::new);
        EntityRenderers.register(EntityTypes.RAVEN_ENTITY.get(), RavenRender::new);
        EntityRenderers.register(EntityTypes.MAMMOTH_ENTITY.get(), MammothRender::new);

        MenuScreens.register(MEMenuTypes.SWAMP_YAK_MENU.get(), SwampYakScreen::new);
    }
}




