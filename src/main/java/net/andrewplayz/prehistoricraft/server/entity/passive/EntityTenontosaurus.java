package net.andrewplayz.prehistoricraft.server.entity.passive;

import net.andrewplayz.prehistoricraft.server.entity.EntityPrehistoric;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityTenontosaurus extends EntityPrehistoric {
    public EntityTenontosaurus(World world) {
        super(world);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 12.0F));
        this.tasks.addTask(3, new EntityAILookIdle(this));
    }
}
