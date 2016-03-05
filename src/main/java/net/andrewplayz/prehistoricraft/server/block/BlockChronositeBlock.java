package net.andrewplayz.prehistoricraft.server.block;

import net.andrewplayz.prehistoricraft.server.creativetab.PhCCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockChronositeBlock extends Block {
    public BlockChronositeBlock(Material material) {
        super(material);

        this.setHardness(5.0f);
        this.setResistance(30.0f);
        this.setStepSound(soundTypeMetal);
        this.setCreativeTab(PhCCreativeTabs.prehistoricraftTab);
    }
}
