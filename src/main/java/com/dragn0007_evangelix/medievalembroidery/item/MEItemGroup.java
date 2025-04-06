package com.dragn0007_evangelix.medievalembroidery.item;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MEItemGroup {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MedievalEmbroidery.MODID);

    public static final RegistryObject<CreativeModeTab> DECOR_GROUP = CREATIVE_MODE_TABS.register("decormodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.decormodtab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(MEBlocks.FIRESTONE_ORE.get());
                        output.accept(MEBlocks.FIRESTONE_BLOCK.get());
                        output.accept(MEBlocks.SEASTONE_ORE.get());
                        output.accept(MEBlocks.SEASTONE_BLOCK.get());
                        output.accept(MEBlocks.FROSTSTONE_ORE.get());
                        output.accept(MEBlocks.FROSTSTONE_BLOCK.get());
                        output.accept(MEBlocks.MOSSTONE_ORE.get());
                        output.accept(MEBlocks.MOSSTONE_BLOCK.get());
                        output.accept(MEBlocks.ASTROSTONE_ORE.get());
                        output.accept(MEBlocks.ASTROSTONE_BLOCK.get());
                        output.accept(MEBlocks.DEPTHSTONE_ORE.get());
                        output.accept(MEBlocks.DEPTHSTONE_BLOCK.get());
                        output.accept(MEBlocks.SKYSTONE_ORE.get());
                        output.accept(MEBlocks.SKYSTONE_BLOCK.get());
                        output.accept(MEBlocks.SALT_ORE.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> HERB_GROUP = CREATIVE_MODE_TABS.register("herbmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.herbmodtab"))
                    .displayItems((displayParameters, output) -> {


                    }).build());

    public static final RegistryObject<CreativeModeTab> FOOD_GROUP = CREATIVE_MODE_TABS.register("foodmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEItems.REDCURRANT_SWEET_BREAD.get())).title(Component.translatable("itemGroup.foodmodtab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(MEItems.FIRESTONE.get());
                        output.accept(MEItems.SEASTONE.get());
                        output.accept(MEItems.FROSTSTONE.get());
                        output.accept(MEItems.MOSSTONE.get());
                        output.accept(MEItems.ASTROSTONE.get());
                        output.accept(MEItems.DEPTHSTONE.get());
                        output.accept(MEItems.SKYSTONE.get());
                        output.accept(MEItems.SALT.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> POTION_GROUP = CREATIVE_MODE_TABS.register("potionmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.potionmodtab"))
                    .displayItems((displayParameters, output) -> {


                    }).build());

    public static final RegistryObject<CreativeModeTab> ENTITY_GROUP = CREATIVE_MODE_TABS.register("entitymodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.entitymodtab"))
                    .displayItems((displayParameters, output) -> {


                    }).build());

    public static final RegistryObject<CreativeModeTab> MAGIC_GROUP = CREATIVE_MODE_TABS.register("magicmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEItems.HEALING_CRYSTAL_SHARD.get())).title(Component.translatable("itemGroup.magicmodtab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(MEItems.FIRESTONE.get());
                        output.accept(MEItems.SEASTONE.get());
                        output.accept(MEItems.FROSTSTONE.get());
                        output.accept(MEItems.MOSSTONE.get());
                        output.accept(MEItems.ASTROSTONE.get());
                        output.accept(MEItems.DEPTHSTONE.get());
                        output.accept(MEItems.SKYSTONE.get());
                        output.accept(MEItems.SALT.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> EQUIPMENT_GROUP = CREATIVE_MODE_TABS.register("equipmentmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.equipmentmodtab"))
                    .displayItems((displayParameters, output) -> {


                    }).build());

    public static final RegistryObject<CreativeModeTab> DRAGON_GROUP = CREATIVE_MODE_TABS.register("dragonmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MEBlocks.CONJURING_CRYSTAL_ORE.get())).title(Component.translatable("itemGroup.dragonmodtab"))
                    .displayItems((displayParameters, output) -> {


                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
