package com.dragn0007_evangelix.medievalembroidery.gui;

import com.dragn0007_evangelix.medievalembroidery.entity.util.AbstractMount;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class MountMenu extends AbstractContainerMenu {

    public Container container;
    public AbstractMount mount;

    public MountMenu(int containerId, Inventory inventory, FriendlyByteBuf extraData) {
        this(containerId, inventory, new SimpleContainer(extraData.readInt()), (AbstractMount) inventory.player.level().getEntity(extraData.readInt()));
    }

    public MountMenu(int containerId, Inventory inventory, Container container, AbstractMount abstractOMount) {
        super(MEMenuTypes.MOUNT_MENU.get(), containerId);
        this.container = container;
        this.mount = abstractOMount;

        int oMountSlots = 0;
        this.addSlot(new Slot(this.container, oMountSlots++, 8, 18) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return itemStack.is(Items.SADDLE) && !this.hasItem() && MountMenu.this.mount.isSaddleable();
            }

            @Override
            public boolean isActive() {
                return MountMenu.this.mount.isSaddleable();
            }
        });

        this.addSlot(new Slot(this.container, oMountSlots++, 8, 36) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                if (itemStack.getItem() instanceof HorseArmorItem) {
                    return !this.hasItem() && MountMenu.this.mount.canWearArmor();
                } else if (itemStack.is(ItemTags.WOOL_CARPETS)) {
                    return !this.hasItem() && MountMenu.this.mount.canWearArmor();
                }
                return false;
            }

            @Override
            public boolean isActive() {
                return MountMenu.this.mount.canWearArmor();
            }
        });

        if(this.mount.hasChest()) {
            for(int y = 0; y < 3; y++) {
                for(int x = 0; x < 5; x++) {
                    this.addSlot(new Slot(this.container, oMountSlots++, 80 + x * 18, 18 + y * 18));
                }
            }
        }

        int playerSlots = 0;
        for(int x = 0; x < 9; x++) {
            this.addSlot(new Slot(inventory, playerSlots++, 8 + x * 18, 142));
        }

        for(int y = 0; y < 3; y++) {
            for(int x = 0; x < 9; x++) {
                this.addSlot(new Slot(inventory, playerSlots++, 8 + x * 18, 84 + y * 18));
            }
        }
    }

    public boolean stillValid(Player player) {
        return !this.mount.hasInventoryChanged(this.container) && this.container.stillValid(player) && this.mount.isAlive() && this.mount.distanceTo(player) < 8.0F;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int slotId) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(slotId);
        if(slot.hasItem()) {
            itemStack = slot.getItem().copy();
            int containerSize = this.container.getContainerSize();

            if(slotId < containerSize) {
                if(!this.moveItemStackTo(itemStack, containerSize, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if(!this.moveItemStackTo(itemStack, 0, containerSize, false)) {
                return ItemStack.EMPTY;
            }

            if(itemStack.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }
        return itemStack;
    }
}