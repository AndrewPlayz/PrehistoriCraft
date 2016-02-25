package net.prehistoricraft.mod.biome.features;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class PhCLog extends BlockLog{
	public static final String[] logs = new String[]{"pine"};
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks (Item item, CreativeTabs tabs, List list)
	{
		for (int i = 0; i < logs.length; i++)
		{
			//list.add(new ItemStack(item, 1, i));
			
		}
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister){
		this.field_150167_a = new IIcon[logs.length];
		
	}
}
