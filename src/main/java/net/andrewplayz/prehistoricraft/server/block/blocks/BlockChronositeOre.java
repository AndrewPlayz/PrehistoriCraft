package net.andrewplayz.prehistoricraft.server.block.blocks;

import net.andrewplayz.prehistoricraft.server.block.PhCBlockRegistryHandler;
import net.andrewplayz.prehistoricraft.server.creativetab.PhCCreativeTabHandler;
import net.andrewplayz.prehistoricraft.server.item.PhCItemHandler;
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
        this.setCreativeTab(PhCCreativeTabHandler.prehistoricraftTab);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this == PhCBlockRegistryHandler.oreChronositeOre ? PhCItemHandler.itemChronositeDust : Item.getItemFromBlock(this);
    }

    public int quantityDropped(Random random) {
        return this == PhCBlockRegistryHandler.oreChronositeOre ? 1 + random.nextInt(2) : 2;
    }
}
