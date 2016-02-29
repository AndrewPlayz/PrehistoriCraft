package net.andrewplayz.prehistoricraft.server.entity;

import net.andrewplayz.prehistoricraft.server.world.breeding.PermanentPartner;
import net.andrewplayz.prehistoricraft.server.world.seasons.SeasonBreeding;
import net.minecraft.entity.EntityCreature;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityPrehistoric extends EntityCreature {
    //Yet to be implemented
    private int inLove;
    private int mating;

    //Yet to be implemented
    private SeasonBreeding breeding;

    //Yet to be implemented
    private PermanentPartner partner;

    public EntityPrehistoric(World world) {
        super(world);
    }

    protected void entityInit() {
        super.entityInit();
        getDataWatcher().addObject(23, rand.nextInt(2));
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
