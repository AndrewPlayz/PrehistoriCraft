package net.andrewplayz.prehistoricraft.server.block.blocks;

import net.andrewplayz.prehistoricraft.server.core.PhCCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRefinedMetal extends Block {
    public BlockRefinedMetal(Material material) {
        super(material);

        this.setHardness(5.0f);
        this.setResistance(30.0f);
        this.setCreativeTab(PhCCreativeTabs.creativetab_prehistoricraft_main);
    }
}
