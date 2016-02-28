package net.prehistoricraft.mod.client;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.prehistoricraft.mod.PrehistoriCraft;

public class PrehistoriCraftWorldGen implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0 :
			//Generate the Over World
			generateSurface(world, random, chunkX*16, chunkZ*16);
		case -1 :
			//Generate the Nether
			generateNether(world, random, chunkX*16, chunkZ*16);
		case 1 :
			//Generate the End
			generateEnd(world, random, chunkX*16, chunkZ*16);
		}
	}

	private void generateSurface(World world, Random random, int x, int z) {
		//this.addOreSpawn(PrehistoriCraft.Ore/Block, world, random, blockXPos, blockZPos, maxX, maxZ, maxVeinSize, ChanceToSpawn, minY, MaxY);
		this.addOreSpawn(PrehistoriCraft.oreAluminiumOre, world, random, x, z, 16, 16, 3+random.nextInt(6), 25, 1, 63);
		this.addOreSpawn(PrehistoriCraft.oreChronositeOre, world, random, x, z, 16, 16, 2+random.nextInt(4), 10, 1, 24);

	}

	private void generateNether(World world, Random random, int i, int j) {
		
	}

	private void generateEnd(World world, Random random, int i, int j) {

	}
	
	private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int MaxY) {
		for(int i = 0; i < chanceToSpawn; i++){
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(MaxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}	
	}
}
