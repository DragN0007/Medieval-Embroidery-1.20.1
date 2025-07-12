package com.dragn0007_evangelix.medievalembroidery.magic;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.saveddata.SavedData;

public class PlayerMagicSavedData extends SavedData {
    @Override
    public CompoundTag save(CompoundTag compoundTag) {
        return new CompoundTag();
    }
}
