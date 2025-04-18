package com.dragn0007_evangelix.medievalembroidery.item.dev;

import com.dragn0007_evangelix.medievalembroidery.gui.dev.NBTenksScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.entity.BlockEntity;

public class NBTenksItem extends Item {

    public NBTenksItem() {
        super(new Properties().stacksTo(1));
    }

    public void openNBTGUI(CompoundTag nbt) {
        Minecraft.getInstance().setScreen(new NBTenksScreen(nbt));
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack itemStack, Player player, LivingEntity livingEntity, InteractionHand interactionHand) {
        if(player.level().isClientSide()) {
            this.openNBTGUI(livingEntity.serializeNBT());
        }
        //
        return InteractionResult.PASS;
    }

    @Override
    public InteractionResult useOn(UseOnContext useOnContext) {
        if(useOnContext.getLevel().isClientSide()) {
            BlockEntity blockEntity = useOnContext.getLevel().getBlockEntity(useOnContext.getClickedPos());
            this.openNBTGUI(blockEntity.serializeNBT());
        }
        return InteractionResult.PASS;
    }
}
