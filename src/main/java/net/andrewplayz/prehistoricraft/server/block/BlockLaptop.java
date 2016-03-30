package net.andrewplayz.prehistoricraft.server.block;

import net.andrewplayz.prehistoricraft.server.block.entity.TileEntityLaptopBlock;
import net.andrewplayz.prehistoricraft.server.creativetab.PhCCreativeTabs;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.Random;

public class BlockLaptop extends BlockContainer {

    public BlockLaptop(Material material) {
        super(material);

        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.setCreativeTab(PhCCreativeTabs.prehistoricraftTab);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(Blocks.cobblestone);
    }

    public int getRenderType() {
        return -1;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public TileEntity createNewTileEntity(World world, int var2) {
        return new TileEntityLaptopBlock();
    }
}


