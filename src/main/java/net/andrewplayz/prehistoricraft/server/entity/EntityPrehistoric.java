package net.andrewplayz.prehistoricraft.server.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

import java.util.Random;

public class EntityPrehistoric extends EntityCreature {
    public float randomMobScale = new Random().nextFloat() + 1;

    public EntityPrehistoric(World world) {
        super(world);
    }

    protected void entityInit() {
        super.entityInit();
        getDataManager().addObject(23, rand.nextInt(2));
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        getGender().writeToNBT(this, compound);
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        EntityGender.readFromNBT(this, compound);
    }
    
    public EntityGender getGender() {
        return EntityGender.getGender(this);
    }
}
