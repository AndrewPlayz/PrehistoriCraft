package net.andrewplayz.prehistoricraft.server.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
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

    private static final DataParameter<Boolean> y = EntityDataManager.createKey(EntityPrehistoric.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Integer> x = EntityDataManager.createKey(EntityPrehistoric.class, DataSerializers.VARINT);

    @Override
    public void entityInit() {
        super.entityInit();
        dataWatcher.register(y, false);
        this.getDataManager().register(x, 0);
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
        return this.getDataManager().get(x) == 0 ? EntityGender.FEMALE : EntityGender.MALE;
    }

    public static <T extends EntityLiving> EntityGender getGender(T entity) {
        return null;
    }
}

