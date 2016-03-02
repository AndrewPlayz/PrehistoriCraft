package net.andrewplayz.prehistoricraft.server.block;

import net.ilexiconn.llibrary.common.content.IContentHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
        oreAluminiumOre = new BlockAluminiumOre(Material.rock).setUnlocalizedName("BlockAluminiumOre");
        oreChronositeOre = new BlockChronositeOre(Material.rock).setUnlocalizedName("BlockChronositeOre");
        blockAluminiumBlock = new BlockAluminium(Material.iron).setUnlocalizedName("BlockAluminium");
        blockChronositeBlock = new BlockChronosite(Material.iron).setUnlocalizedName("BlockChronosite");
        blockVolcanicAsh = new BlockVolcanic(Material.snow).setUnlocalizedName("BlockVolcanicAsh");
        blockVolcanicRock = new BlockVolcanic(Material.rock).setUnlocalizedName("BlockVolcanicRock");
        blockVolcanicSoil = new BlockVolcanic(Material.grass).setUnlocalizedName("BlockVolcanicSoil");
        blockLaptop = new BlockLaptop(Material.anvil).setUnlocalizedName("LaptopBlock");
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
