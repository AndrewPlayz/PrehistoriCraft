package net.prehistoricraft.mod.client;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;
import net.prehistoricraft.mod.PrehistoriCraft;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel){
		
		if(fuel.getItem() == PrehistoriCraft.itemTreeTinder) return 200;
		
		return 0;
		
	}
}
