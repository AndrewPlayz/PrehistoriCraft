package net.andrewplayz.prehistoricraft.server.block;

import net.andrewplayz.prehistoricraft.server.creativetab.PhCCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAluminiumOre extends Block {
    public BlockAluminiumOre(Material material) {
        super(material);

        this.setUnlocalizedName("BlockAluminiumOre");
        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(PhCCreativeTabs.prehistoricraftTab);
    }
}
