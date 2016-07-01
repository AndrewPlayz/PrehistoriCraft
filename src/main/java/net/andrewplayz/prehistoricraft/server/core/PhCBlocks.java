package net.andrewplayz.prehistoricraft.server.core;

import net.andrewplayz.prehistoricraft.server.block.blocks.*;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityLaptopBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
        block_aluminium_block = new BlockUnrefinedMetal("block_aluminium_block");
        block_chronosite_block = new BlockUnrefinedMetal("block_chronosite_block");

        //Metal Ores
        block_aluminium_ore_block = new BlockRefinedMetal("block_aluminium_ore_block");
        block_chronosite_ore_block = new BlockRefinedMetal("block_chronosite_ore_block");

        //Terrain Blocks
        block_volcanic_ash_block = new BlockVolcanic("block_volcanic_ash_block");
        block_volcanic_rock_block = new BlockVolcanic("block_volcanic_rock_block");
        block_volcanic_soil_block = new BlockVolcanic("block_volcanic_soil_block");

        //Cusomt Rendered in Blocks
        block_laptop_block = new BlockLaptop(false, false, "block_laptop_block");

        GameRegistry.registerTileEntity(TileEntityLaptopBlock.class, "entitylaptop");
    }
}