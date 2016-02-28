package net.prehistoricraft.mod.server.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.prehistoricraft.mod.PrehistoriCraft;

public class BlockAluminiumOre extends Block {

	public BlockAluminiumOre(Material material) {
		super(material);
		
		this.setHardness(3.0f);
		this.setResistance(15.0f);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(PrehistoriCraft.prehistoricraftTab);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(PrehistoriCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
