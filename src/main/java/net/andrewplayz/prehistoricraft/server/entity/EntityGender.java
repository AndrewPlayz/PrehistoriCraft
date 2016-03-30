package net.andrewplayz.prehistoricraft.server.entity;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;

public enum EntityGender {
    MALE,
    FEMALE;

    public void writeToNBT(Entity entity, NBTTagCompound compound) {
        compound.setInteger("Gender", entity.EntityDataManager().getWatchableObjectInt(23));
    }

    public static void readFromNBT(Entity entity, NBTTagCompound compound) {
        entity.EntityDataManager().updateObject(23, compound.getInteger("Gender"));
    }

    public static EntityGender getGender(Entity entity) {
        return entity.EntityDataManager().getWatchableObjectInt(23) == 0 ? MALE : FEMALE;
    }
}
