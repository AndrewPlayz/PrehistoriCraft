package net.andrewplayz.prehistoricraft.server.entity.hostile;

import net.andrewplayz.prehistoricraft.server.entity.EntityPrehistoric;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAcrocanthosaurus extends EntityPrehistoric {

    public EntityAcrocanthosaurus(World worldIn, String male, String female) {
        super(worldIn);
        //this.tasks.addTask(0, new EntityAISwimming(this));
        //this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        //this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        //this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
    }
}
