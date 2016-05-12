package net.andrewplayz.prehistoricraft.server.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class EntityPrehistoric extends EntityCreature {

    public EntityPrehistoric(World world) {
        super(world);
    }

    private static final DataParameter<Boolean> y = EntityDataManager.createKey(EntityPrehistoric.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Integer> x = EntityDataManager.createKey(EntityPrehistoric.class, DataSerializers.VARINT);

    @Override
    public void entityInit() {
        super.entityInit();
        dataWatcher.register(y, false);
        this.getDataManager().register(x, 1);
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

