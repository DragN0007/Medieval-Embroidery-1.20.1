package com.dragn0007_evangelix.medievalembroidery.item;


import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class MEItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MedievalEmbroidery.MODID);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}