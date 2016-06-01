package net.andrewplayz.prehistoricraft.client;

import net.andrewplayz.prehistoricraft.server.item.PhCItemHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {
        if (fuel.getItem() == PhCItemHandler.itemTreeTinder) {
            return 200;
        }
        return 0;
    }
}
