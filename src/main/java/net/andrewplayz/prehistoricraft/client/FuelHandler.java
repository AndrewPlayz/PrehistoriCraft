package net.andrewplayz.prehistoricraft.client;

import net.andrewplayz.prehistoricraft.server.item.PhCItemRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {
        if (fuel.getItem() == PhCItemRegistry.itemTreeTinder) {
            return 200;
        }
        return 0;
    }
}
