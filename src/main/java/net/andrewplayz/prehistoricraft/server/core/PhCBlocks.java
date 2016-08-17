package net.andrewplayz.prehistoricraft.server.core;

import net.andrewplayz.prehistoricraft.server.block.blocks.*;
import net.andrewplayz.prehistoricraft.server.block.blocks.fossils.BlockIchthyosaurusFossil;
import net.andrewplayz.prehistoricraft.server.block.blocks.fossils.BlockPlesiosaurFossil;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityIchthyosaurusFossilBlock;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityLaptopBlock;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityPlesiosaurFossilBlock;
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
    public static Block block_limestone_cliff_block;

    //Fossil Blocks
    public static Block block_limestone_tooth_fossil_block;
    public static Block block_limestone_shell_fossil_block;

    //Custom Rendered in Blocks
    public static Block block_laptop_block;

    //Custom Rendered Fossils
    public static Block block_ichthyosaurus_fossil_block;
    public static Block block_plesiosaur_fossil_block;

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
        block_limestone_cliff_block = new BlockLimestone("block_limestone_cliff_block");

        //Fossil Blocks
        block_limestone_tooth_fossil_block = new BlockFossil("block_limestone_tooth_fossil_block");
        block_limestone_shell_fossil_block = new BlockFossil("block_limestone_shell_fossil_block");

        //Custom Rendered in Blocks
        block_laptop_block = new BlockLaptop("block_laptop_block", true);

        GameRegistry.registerTileEntity(TileEntityLaptopBlock.class, "entitylaptop");

        //Custom Rendered Fossils
        block_ichthyosaurus_fossil_block = new BlockIchthyosaurusFossil("block_ichthyosaurus_fossil_block");
        block_plesiosaur_fossil_block = new BlockPlesiosaurFossil("block_plesiosaur_fossil_block");

        GameRegistry.registerTileEntity(TileEntityIchthyosaurusFossilBlock.class, "entityichthyosaurusfossil");
        GameRegistry.registerTileEntity(TileEntityPlesiosaurFossilBlock.class, "entityplesiosaurfossil");
    }
}