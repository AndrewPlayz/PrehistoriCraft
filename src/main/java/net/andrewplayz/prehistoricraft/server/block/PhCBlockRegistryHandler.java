package net.andrewplayz.prehistoricraft.server.block;

import net.andrewplayz.prehistoricraft.server.block.blocks.*;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityLaptopBlock;
import net.andrewplayz.prehistoricraft.server.content.IContentHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PhCBlockRegistryHandler implements IContentHandler {
    public static Block oreAluminiumOre;
    public static Block oreChronositeOre;
    public static Block blockAluminiumBlock;
    public static Block blockChronositeBlock;
    public static Block blockVolcanicAsh;
    public static Block blockVolcanicRock;
    public static Block blockVolcanicSoil;

    public static Block blockLaptop;

    @Override
    public void init() {
        oreAluminiumOre = new BlockAluminiumOre(Material.ROCK).setUnlocalizedName("blockaluminiumore");
        oreChronositeOre = new BlockChronositeOre(Material.ROCK).setUnlocalizedName("blockchronositeore");
        blockAluminiumBlock = new BlockAluminiumBlock(Material.IRON).setUnlocalizedName("blockaluminiumblock");
        blockChronositeBlock = new BlockChronositeBlock(Material.IRON).setUnlocalizedName("blockchronositeblock");
        blockVolcanicAsh = new BlockVolcanic(Material.SNOW).setUnlocalizedName("blockvolcanicash");
        blockVolcanicRock = new BlockVolcanic(Material.ROCK).setUnlocalizedName("blockvolcanicrock");
        blockVolcanicSoil = new BlockVolcanic(Material.GRASS).setUnlocalizedName("blockvolcanicsoil");
        blockLaptop = new BlockLaptop(false, false).setUnlocalizedName("blocklaptop");
    }

    @Override
    public void gameRegistry() throws Exception {
        GameRegistry.registerBlock(oreAluminiumOre, "blockaluminiumore");
        GameRegistry.registerBlock(oreChronositeOre, "blockchronositeore");
        GameRegistry.registerBlock(blockAluminiumBlock, "blockaluminiumblock");
        GameRegistry.registerBlock(blockChronositeBlock, "blockchronositeblock");
        GameRegistry.registerBlock(blockVolcanicAsh, "blockvolcanicash");
        GameRegistry.registerBlock(blockVolcanicRock, "blockvolcanicrock");
        GameRegistry.registerBlock(blockVolcanicSoil, "blockvolcanicsoil");
        GameRegistry.registerBlock(blockLaptop, "blocklaptop");
        GameRegistry.registerTileEntity(TileEntityLaptopBlock.class, "entitylaptop");
    }
}