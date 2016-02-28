package net.prehistoricraft.mod.server.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.prehistoricraft.mod.PrehistoriCraft;
import net.prehistoricraft.mod.client.tileentity.TileEntityLaptopBlock;

public class BlockLaptop extends BlockContainer{

	public BlockLaptop(Material material) {
		super(material);
		
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		
		this.setCreativeTab(PrehistoriCraft.prehistoricraftTab);
		
	}
	
	public int getRenderType(){
		return -1;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	
	public boolean renderAsNormalBlock(){
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int var2) {
		return new TileEntityLaptopBlock();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(PrehistoriCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
