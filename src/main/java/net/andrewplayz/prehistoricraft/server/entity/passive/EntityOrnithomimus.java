package net.andrewplayz.prehistoricraft.server.entity.passive;

import net.andrewplayz.prehistoricraft.server.entity.EntityPrehistoric;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.world.World;

public class EntityOrnithomimus extends EntityPrehistoric {
    public EntityOrnithomimus(World worldIn){
        super(worldIn);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.46D);
    }

    public EntityOrnithomimus createChild(EntityAgeable ageable)
    {
        return new EntityOrnithomimus(this.worldObj);
    }
}
