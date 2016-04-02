package net.andrewplayz.prehistoricraft.server.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;
import java.util.Random;

public class EntityPrehistoric extends EntityCreature {
    public float randomMobScale = new Random().nextFloat() + 0.3F;

    public EntityPrehistoric(World world) {
        super(world);
    }

    private static final DataParameter<Boolean> x = EntityDataManager.createKey(EntityPrehistoric.class, DataSerializers.BOOLEAN);

    @Override
    protected void entityInit() {
        super.entityInit();
        dataWatcher.register(x, false);
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

