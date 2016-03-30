package net.andrewplayz.prehistoricraft.server.entity.passive;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.entity.EntityPrehistoric;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.init.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityOrnithomimus extends EntityPrehistoric {
    public EntityOrnithomimus(World worldIn){
        super(worldIn);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(3, new EntityAIEatGrass(this));
        this.tasks.addTask(4, new EntityAITempt(this, 1.25D, Items.pumpkin_seeds, false));
        this.setSize(2.0F, 2.0F);
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        //this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
        //this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.46D);
    }

    public EntityOrnithomimus createChild(EntityAgeable ageable)
    {
        return new EntityOrnithomimus(this.worldObj);
    }
}
