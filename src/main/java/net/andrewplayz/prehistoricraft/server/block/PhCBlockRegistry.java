package net.andrewplayz.prehistoricraft.server.block;

import net.andrewplayz.prehistoricraft.server.content.IContentHandler;
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
        oreAluminiumOre = new BlockAluminiumOre(Material.rock).setUnlocalizedName("blockaluminiumore");
        oreChronositeOre = new BlockChronositeOre(Material.rock).setUnlocalizedName("blockchronositeore");
        blockAluminiumBlock = new BlockAluminiumBlock(Material.iron).setUnlocalizedName("blockaluminiumblock");
        blockChronositeBlock = new BlockChronositeBlock(Material.iron).setUnlocalizedName("blockchronositeblock");
        blockVolcanicAsh = new BlockVolcanic(Material.snow).setUnlocalizedName("blockvolcanicash");
        blockVolcanicRock = new BlockVolcanic(Material.rock).setUnlocalizedName("blockvolcanicrock");
        blockVolcanicSoil = new BlockVolcanic(Material.grass).setUnlocalizedName("blockvolcanicsoil");
        blockLaptop = new BlockLaptop(Material.anvil).setUnlocalizedName("blocklaptop");
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
    }
}
