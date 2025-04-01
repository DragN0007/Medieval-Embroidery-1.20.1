package com.dragn0007_evangelix.medievalembroidery.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery.MODID;

public class EntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);


//    public static final RegistryObject<EntityType<FangedElk>> FANGEDELK_ENTITY = ENTITY_TYPES.register("fangedelk_entity",
//            () -> EntityType.Builder.of(FangedElk::new,
//                            MobCategory.CREATURE)
//                    .sized(1f,2.8f)
//                    .build(new ResourceLocation(MODID,"fangedelk").toString()));
//
//    public static final RegistryObject<EntityType<SwampYak>> SWAMPYAK_ENTITY = ENTITY_TYPES.register("swampyak_entity",
//            () -> EntityType.Builder.of(SwampYak::new,
//                            MobCategory.CREATURE)
//                    .sized(1.4f,3.1f)
//                    .build(new ResourceLocation(MODID,"swampyak").toString()));
//
//    public static final RegistryObject<EntityType<Fairy>> FAIRY_ENTITY = ENTITY_TYPES.register("fairy_entity",
//            () -> EntityType.Builder.of(Fairy::new,
//                            MobCategory.CREATURE)
//                    .sized(0.2f,0.2f)
//                    .build(new ResourceLocation(MODID,"fairy").toString()));
//
//    public static final RegistryObject<EntityType<DireWolf>> DIREWOLF_ENTITY = ENTITY_TYPES.register("direwolf_entity",
//            () -> EntityType.Builder.of(DireWolf::new,
//                            MobCategory.CREATURE)
//                    .sized(1f,2f)
//                    .build(new ResourceLocation(MODID,"direwolf").toString()));
//
//    public static final RegistryObject<EntityType<WoollyBoar>> WOOLLYBOAR_ENTITY = ENTITY_TYPES.register("woollyboar_entity",
//            () -> EntityType.Builder.of(WoollyBoar::new,
//                            MobCategory.CREATURE)
//                    .sized(1f,2f)
//                    .build(new ResourceLocation(MODID,"woollyboar").toString()));
//
//    public static final RegistryObject<EntityType<Raven>> RAVEN_ENTITY = ENTITY_TYPES.register("raven_entity",
//            () -> EntityType.Builder.of(Raven::new,
//                            MobCategory.CREATURE)
//                    .sized(0.5f,0.5f)
//                    .build(new ResourceLocation(MODID,"raven").toString()));
}

