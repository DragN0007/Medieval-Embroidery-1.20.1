package com.dragn0007_evangelix.medievalembroidery.gui.dev;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.nbt.CollectionTag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;

public class NBTenksScreen extends Screen {
    public CompoundTag root;
    public int currentScroll = 0;

    public NBTenksScreen(CompoundTag root) {
        super(Component.empty());
        this.root = root;
    }

    public void genBoxes(Tag root, String label, int x, int y) {
        if(root instanceof CompoundTag) {
            for(String key : ((CompoundTag) root).getAllKeys()) {
                this.genBoxes(((CompoundTag) root).get(key), key, x + 5, y);
                y += 25;
            }
        } else if(root instanceof CollectionTag<?>) {
            for(int i = 0; i < ((CollectionTag<?>) root).size(); i++) {
                this.genBoxes(((CollectionTag<?>) root).get(i), String.valueOf(i), x + 5, y);
                y += 25;
            }
        } else {
            EditBox editBox = new EditBox(this.font, x, y, (this.width - 10) - x, 20, Component.empty());
            editBox.setValue(label + ": " + root.getAsString());
            editBox.setMaxLength(32500);

            this.addRenderableWidget(editBox);
        }
    }

    @Override
    public void init() {
        super.init();
        this.genBoxes(this.root, "root", 5, 5);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mx, int my, float partialTick) {
        this.renderBackground(guiGraphics);
        super.render(guiGraphics, mx, my, partialTick);
    }

    @Override
    public boolean mouseScrolled(double mx, double my, double dir) {
        for(int i = 0; i < this.renderables.size(); i++) {
            EditBox editBox = (EditBox)this.renderables.get(i);
            editBox.setY(editBox.getY() + (int)(dir) * 25);
        }
        return super.mouseScrolled(mx, my, dir);
    }
}
