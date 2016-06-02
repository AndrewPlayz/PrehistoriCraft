package net.andrewplayz.prehistoricraft.server.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

import java.util.Random;

public class EntityPrehistoric extends EntityCreature {

    public static final DataParameter<Integer> x = EntityDataManager.createKey(EntityPrehistoric.class, DataSerializers.VARINT);
    private static final DataParameter<Boolean> y = EntityDataManager.createKey(EntityPrehistoric.class, DataSerializers.BOOLEAN);
    public EntityPrehistoric(World world) {
        super(world);
    }

    @Override
    public void entityInit() {
        super.entityInit();
        this.getDataManager().register(y, false);
        this.getDataManager().register(x, new Random().nextInt(2) - 1);
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setInteger("Gender", this.getDataManager().get(x));
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.getDataManager().set(x, compound.hasKey("Gender") ? compound.getInteger("Gender") : 0);
    }

    public EntityGender getGender() {
        return this.getDataManager().get(x) == 0 ? EntityGender.MALE : EntityGender.FEMALE;
    }
}

