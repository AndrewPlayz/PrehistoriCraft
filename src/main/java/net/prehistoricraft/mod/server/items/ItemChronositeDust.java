package net.prehistoricraft.mod.server.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.prehistoricraft.mod.PrehistoriCraft;

public class ItemChronositeDust extends Item{

	public ItemChronositeDust(){
		this.setCreativeTab(PrehistoriCraft.prehistoricraftTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(PrehistoriCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
