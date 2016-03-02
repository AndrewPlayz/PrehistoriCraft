package net.andrewplayz.prehistoricraft.server.block;

import net.andrewplayz.prehistoricraft.server.block.entity.TileEntityLaptopBlock;
import net.andrewplayz.prehistoricraft.server.creativetab.PhCCreativeTabs;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockLaptop extends BlockContainer {
    public BlockLaptop(Material material) {
        super(material);

        this.setHardness(2.0F);
        this.setResistance(5.0F);

        this.setCreativeTab(PhCCreativeTabs.prehistoricraftTab);
    }

    public int getRenderType() {
        return -1;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int var2) {
        return new TileEntityLaptopBlock();
    }
}
