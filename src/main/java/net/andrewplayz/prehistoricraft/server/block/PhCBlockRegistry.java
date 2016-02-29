package net.andrewplayz.prehistoricraft.server.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.ilexiconn.llibrary.common.content.IContentHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PhCBlockRegistry implements IContentHandler {
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
        oreAluminiumOre = new BlockAluminiumOre(Material.rock).setBlockName("BlockAluminiumOre");
        oreChronositeOre = new BlockChronositeOre(Material.rock).setBlockName("BlockChronositeOre");
        blockAluminiumBlock = new BlockAluminium(Material.iron).setBlockName("BlockAluminium");
        blockChronositeBlock = new BlockChronosite(Material.iron).setBlockName("BlockChronosite");
        blockVolcanicAsh = new BlockVolcanic(Material.snow).setBlockName("BlockVolcanicAsh");
        blockVolcanicRock = new BlockVolcanic(Material.rock).setBlockName("BlockVolcanicRock");
        blockVolcanicSoil = new BlockVolcanic(Material.grass).setBlockName("BlockVolcanicSoil");
        blockLaptop = new BlockLaptop(Material.anvil).setBlockName("LaptopBlock").setBlockTextureName("LaptopBlock.png");
    }

    @Override
    public void gameRegistry() throws Exception {
        GameRegistry.registerBlock(oreAluminiumOre, "BlockAluminiumOre");
        GameRegistry.registerBlock(oreChronositeOre, "BlockChronositeOre");
        GameRegistry.registerBlock(blockAluminiumBlock, "BlockAluminium");
        GameRegistry.registerBlock(blockChronositeBlock, "BlockChronosite");
        GameRegistry.registerBlock(blockVolcanicAsh, "BlockVolcanicAsh");
        GameRegistry.registerBlock(blockVolcanicRock, "BlockVolcanicRock");
        GameRegistry.registerBlock(blockVolcanicSoil, "BlockVolcanicSoil");
        GameRegistry.registerBlock(blockLaptop, "LaptopBlock");
    }
}
