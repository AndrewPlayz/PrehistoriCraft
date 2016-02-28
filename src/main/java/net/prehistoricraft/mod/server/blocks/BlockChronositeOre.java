package net.prehistoricraft.mod.server.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.prehistoricraft.mod.PrehistoriCraft;

public class BlockChronositeOre extends Block {

	public BlockChronositeOre(Material material) {
		super(material);
		
		this.setHardness(3.0f);
		this.setResistance(15.0f);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(PrehistoriCraft.prehistoricraftTab);
		
	}
	
	public Item getItemDropped(int i, Random random, int j){
		return this == PrehistoriCraft.oreChronositeOre ? PrehistoriCraft.itemChronositeDust: Item.getItemFromBlock(this);
	}
	
	public int quantityDropped(Random random){
		return this == PrehistoriCraft.oreChronositeOre ? 1 + random.nextInt(2) : 2;
	
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(PrehistoriCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
