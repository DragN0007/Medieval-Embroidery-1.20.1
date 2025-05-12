package com.dragn0007_evangelix.medievalembroidery.entity;

import com.dragn0007_evangelix.medievalembroidery.entity.direwolf.Direwolf;
import com.dragn0007_evangelix.medievalembroidery.entity.fairy.Fairy;
import com.dragn0007_evangelix.medievalembroidery.entity.fanged_elk.FangedElk;
import com.dragn0007_evangelix.medievalembroidery.entity.griffin.Griffin;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery.MODID;

public class EntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);


    public static final RegistryObject<EntityType<FangedElk>> FANGED_ELK_ENTITY = ENTITY_TYPES.register("fanged_elk",
            () -> EntityType.Builder.of(FangedElk::new,
                            MobCategory.CREATURE)
                    .sized(1f,2.8f)
                    .build(new ResourceLocation(MODID,"fanged_elk").toString()));

    public static final RegistryObject<EntityType<Griffin>> GRIFFIN_ENTITY = ENTITY_TYPES.register("griffin",
            () -> EntityType.Builder.of(Griffin::new,
                            MobCategory.CREATURE)
                    .sized(1f,2f)
                    .build(new ResourceLocation(MODID,"griffin").toString()));

//    public static final RegistryObject<EntityType<SwampYak>> SWAMPYAK_ENTITY = ENTITY_TYPES.register("swampyak",
//            () -> EntityType.Builder.of(SwampYak::new,
//                            MobCategory.CREATURE)
//                    .sized(1.4f,3.1f)
//                    .build(new ResourceLocation(MODID,"swampyak").toString()));

    public static final RegistryObject<EntityType<Fairy>> FAIRY_ENTITY = ENTITY_TYPES.register("fairy",
            () -> EntityType.Builder.of(Fairy::new,
                            MobCategory.CREATURE)
                    .sized(0.2f,0.2f)
                    .build(new ResourceLocation(MODID,"fairy").toString()));

    public static final RegistryObject<EntityType<Direwolf>> DIREWOLF_ENTITY = ENTITY_TYPES.register("direwolf",
            () -> EntityType.Builder.of(Direwolf::new,
                            MobCategory.CREATURE)
                    .sized(1f,2f)
                    .build(new ResourceLocation(MODID,"direwolf").toString()));
//
//    public static final RegistryObject<EntityType<WoollyBoar>> WOOLLYBOAR_ENTITY = ENTITY_TYPES.register("woollyboar",
//            () -> EntityType.Builder.of(WoollyBoar::new,
//                            MobCategory.CREATURE)
//                    .sized(1f,2f)
//                    .build(new ResourceLocation(MODID,"woolly_boar").toString()));
//
//    public static final RegistryObject<EntityType<Raven>> RAVEN_ENTITY = ENTITY_TYPES.register("raven",
//            () -> EntityType.Builder.of(Raven::new,
//                            MobCategory.CREATURE)
//                    .sized(0.5f,0.5f)
//                    .build(new ResourceLocation(MODID,"raven").toString()));
}

