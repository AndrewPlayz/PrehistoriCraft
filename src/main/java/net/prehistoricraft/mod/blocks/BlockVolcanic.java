package net.prehistoricraft.mod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.prehistoricraft.mod.PrehistoriCraft;

public class BlockVolcanic extends Block {

	public BlockVolcanic(Material material) {
		super(material);
		
		this.setHardness(5.0f);
		this.setResistance(30.0f);
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(PrehistoriCraft.prehistoricraftCretaceousTab);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(PrehistoriCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
