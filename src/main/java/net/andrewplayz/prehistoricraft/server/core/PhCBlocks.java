package net.andrewplayz.prehistoricraft.server.core;

import net.andrewplayz.prehistoricraft.server.block.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PhCBlocks {
    //Metal Blocks
    public static Block block_aluminium_block;
    public static Block block_chronosite_block;

    //Metal Ores
    public static Block block_aluminium_ore_block;
    public static Block block_chronosite_ore_block;

    //Terrain Blocks
    public static Block block_volcanic_ash_block;
    public static Block block_volcanic_rock_block;
    public static Block block_volcanic_soil_block;

    //Custom Rendered in Blocks
    public static Block block_laptop_block;

    public static void init() {
        //Metal Blocks
        block_aluminium_block = new BlockUnrefinedMetal(Material.ROCK).setUnlocalizedName("block_aluminium_block");
        block_chronosite_block = new BlockUnrefinedMetal(Material.ROCK).setUnlocalizedName("block_chronosite_block");

        //Metal Ores
        block_aluminium_ore_block = new BlockRefinedMetal(Material.IRON).setUnlocalizedName("block_aluminium_ore_block");
        block_chronosite_ore_block = new BlockRefinedMetal(Material.IRON).setUnlocalizedName("block_chronosite_ore_block");

        //Terrain Blocks
        block_volcanic_ash_block = new BlockVolcanic(Material.SNOW).setUnlocalizedName("block_volcanic_ash_block");
        block_volcanic_rock_block = new BlockVolcanic(Material.ROCK).setUnlocalizedName("block_volcanic_rock_block");
        block_volcanic_soil_block = new BlockVolcanic(Material.GRASS).setUnlocalizedName("block_volcanic_soil_block");

        //Cusomt Rendered in Blocks
        block_laptop_block = new BlockLaptop(false, false).setUnlocalizedName("block_laptop_block");
    }
}