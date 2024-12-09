package com.dragn0007_evangelix.medievalembroidery.event;


import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)

public class ForgeEvent {

    //Right-Click Harvest Crops
    @SubscribeEvent
    public static void onBlockUse(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);
        InteractionHand hand = event.getHand();
        Player player = event.getPlayer();
        player.swing(hand);
        ItemStack itemStack = player.getItemInHand(hand);

        if(state.getBlock() instanceof CropBlock cropBlock && level instanceof ServerLevel serverLevel) {
            IntegerProperty property = cropBlock.getAgeProperty();
            int maxAge = cropBlock.getMaxAge();

            if(itemStack.isEmpty() && state.getValue(property) == maxAge) {
                level.setBlockAndUpdate(pos, state.setValue(property, 0));

                cropBlock.getDrops(state, serverLevel, pos, null).forEach(stack -> {
                    serverLevel.addFreshEntity(new ItemEntity(level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, stack));
                });

                event.setCanceled(true);
            }
        }
    }
}