package net.andrewplayz.prehistoricraft.server.block;

import net.andrewplayz.prehistoricraft.server.creativetab.PhCCreativeTabs;
import net.andrewplayz.prehistoricraft.server.item.PhCItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockChronositeOre extends Block {
    public BlockChronositeOre(Material material) {
        super(material);

        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setCreativeTab(PhCCreativeTabs.prehistoricraftTab);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this == PhCBlockRegistry.oreChronositeOre ? PhCItemRegistry.itemChronositeDust : Item.getItemFromBlock(this);
    }

    public int quantityDropped(Random random) {
        return this == PhCBlockRegistry.oreChronositeOre ? 1 + random.nextInt(2) : 2;
    }
}
