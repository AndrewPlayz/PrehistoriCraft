package net.andrewplayz.prehistoricraft.server.entity;

import net.andrewplayz.prehistoricraft.server.world.breeding.PermanentPartner;
import net.andrewplayz.prehistoricraft.server.world.seasons.SeasonBreeding;
import net.java.games.input.Component;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.util.Random;

public class EntityPrehistoric extends EntityCreature {
    //Yet to be implemented
    private int inLove;
    private int mating;

    //Yet to be implemented
    private SeasonBreeding breeding;

    //Yet to be implemented
    private PermanentPartner partner;

    public float randomMobScale = new Random().nextFloat() + 1;

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
