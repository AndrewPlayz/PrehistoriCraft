package net.andrewplayz.prehistoricraft.server.world;

import net.andrewplayz.prehistoricraft.server.block.PhCBlockRegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class PrehistoriCraftWorldGen implements IWorldGenerator {

    private void generateSurface(World world, Random random, int x, int z) {
        //this.addOreSpawn(PrehistoriCraft.Ore/Block, world, random, blockXPos, blockZPos, maxX, maxZ, maxVeinSize, ChanceToSpawn, minY, MaxY);
        this.addOreSpawn(PhCBlockRegistryHandler.oreAluminiumOre, world, random, x, z, 16, 16, 3 + random.nextInt(6), 25, 1, 63);
        this.addOreSpawn(PhCBlockRegistryHandler.oreChronositeOre, world, random, x, z, 16, 16, 2 + random.nextInt(4), 10, 1, 24);

    }

    private void generateNether(World world, Random random, int i, int j) {

    }

    private void generateEnd(World world, Random random, int i, int j) {

    }

    private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int MaxY) {
        for (int i = 0; i < chanceToSpawn; i++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(MaxY - minY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block.getDefaultState(), maxVeinSize)).generate(world, random, new BlockPos(posX, posY, posZ));
        }
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case 0:
                //Generate the Over World
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case -1:
                //Generate the Nether
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 1:
                //Generate the End
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
    }
}