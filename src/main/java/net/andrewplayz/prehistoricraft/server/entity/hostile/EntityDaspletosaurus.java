package net.andrewplayz.prehistoricraft.server.entity.hostile;

import net.andrewplayz.prehistoricraft.server.entity.EntityPrehistoric;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.world.World;

public class EntityDaspletosaurus extends EntityPrehistoric{
    public EntityDaspletosaurus(World worldIn){
        super(worldIn);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.226D);
    }
}