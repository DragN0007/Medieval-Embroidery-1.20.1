package com.dragn0007_evangelix.medievalembroidery.event;

import com.dragn0007.medievalembroidery.MedievalEmbroideryMain;
import com.dragn0007.medievalembroidery.magic.particle.MEParticleRegistry;
import com.dragn0007.medievalembroidery.magic.particle.spells.SpellFireParticles;
import com.dragn0007.medievalembroidery.magic.particle.spells.SpellIceParticles;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = MedievalEmbroideryMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MedievalEmbroideryMagicEvents {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event) {

        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_FIRE_PARTICLE_1.get(),
                SpellFireParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_ICE_PARTICLE_1.get(),
                SpellIceParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_ASTRO_PARTICLE_1.get(),
                SpellFireParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_DEPTHS_PARTICLE_1.get(),
                SpellIceParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_EARTH_PARTICLE_1.get(),
                SpellFireParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_WATER_PARTICLE_1.get(),
                SpellIceParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_WEATHER_PARTICLE_1.get(),
                SpellIceParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_FIRE_PARTICLE_2.get(),
                SpellFireParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_ICE_PARTICLE_2.get(),
                SpellIceParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_ASTRO_PARTICLE_2.get(),
                SpellFireParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_DEPTHS_PARTICLE_2.get(),
                SpellIceParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_EARTH_PARTICLE_2.get(),
                SpellFireParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_WATER_PARTICLE_2.get(),
                SpellIceParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(MEParticleRegistry.SPELL_WEATHER_PARTICLE_2.get(),
                SpellIceParticles.Provider::new);

    }

}




