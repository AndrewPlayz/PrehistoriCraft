package net.andrewplayz.prehistoricraft.server.block.blocks;

import net.andrewplayz.prehistoricraft.server.core.PhCCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockUnrefinedMetal extends Block {
    public BlockUnrefinedMetal(Material material) {
        super(material);

        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setCreativeTab(PhCCreativeTabs.creativetab_prehistoricraft_main);
    }
}
