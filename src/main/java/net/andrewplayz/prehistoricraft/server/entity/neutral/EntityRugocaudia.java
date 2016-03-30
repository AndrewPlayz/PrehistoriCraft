package net.andrewplayz.prehistoricraft.server.entity.neutral;

import net.andrewplayz.prehistoricraft.server.entity.EntityPrehistoric;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityRugocaudia extends EntityPrehistoric{
    public EntityRugocaudia(World worldIn){
        super(worldIn);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(3, new EntityAIEatGrass(this));
        this.tasks.addTask(4, new EntityAITempt(this, 1.25D, Items.wheat, false));
        this.setSize(3.0F, 1.5F);
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        //this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60.0D);
        //this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.226D);
    }

    public EntityRugocaudia createChild(EntityAgeable ageable)
    {
        return new EntityRugocaudia(this.worldObj);
    }
}