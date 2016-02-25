package net.prehistoricraft.mod.entityhandler;

import java.util.Random;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.prehistoricraft.mod.PrehistoriCraft;

public class EntityHandlerElasmotherium {

	public static void registerMonsters(Class entityClass, String name){
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);
		int mainColor = random.nextInt() * 21;
		int subColor = random.nextInt() * 69;
		
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.addSpawn(entityClass, 50, 2, 3, EnumCreatureType.ambient);
		EntityRegistry.registerModEntity(entityClass, name, entityId, PrehistoriCraft.Instance, 48, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, mainColor, subColor));
		
	}
}
