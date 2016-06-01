package net.andrewplayz.prehistoricraft.server.block.blocks;

import net.andrewplayz.prehistoricraft.server.creativetab.PhCCreativeTabHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAluminiumOre extends Block {
    public BlockAluminiumOre(Material material) {
        super(material);

        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setCreativeTab(PhCCreativeTabHandler.prehistoricraftTab);
    }
}
