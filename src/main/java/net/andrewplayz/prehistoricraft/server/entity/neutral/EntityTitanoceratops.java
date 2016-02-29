package net.andrewplayz.prehistoricraft.server.entity.neutral;

import net.andrewplayz.prehistoricraft.server.entity.EntityPrehistoric;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityTitanoceratops extends EntityPrehistoric {
    public EntityTitanoceratops(World world) {
        super(world);
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0D);
        //this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(15.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D);
    }
}
