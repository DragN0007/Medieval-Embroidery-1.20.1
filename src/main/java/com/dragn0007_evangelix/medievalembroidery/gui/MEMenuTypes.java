package com.dragn0007_evangelix.medievalembroidery.gui;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MEMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MedievalEmbroidery.MODID);



    public static void register(IEventBus eventBus) {
        MENU_TYPES.register(eventBus);
    }
}
