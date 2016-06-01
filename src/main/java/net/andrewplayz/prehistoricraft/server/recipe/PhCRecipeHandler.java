package net.andrewplayz.prehistoricraft.server.recipe;

import net.andrewplayz.prehistoricraft.client.FuelHandler;
import net.andrewplayz.prehistoricraft.server.block.PhCBlockRegistryHandler;
import net.andrewplayz.prehistoricraft.server.content.IContentHandler;
import net.andrewplayz.prehistoricraft.server.item.PhCItemHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PhCRecipeHandler implements IContentHandler {
    @Override
    public void init() {
        GameRegistry.addSmelting(PhCBlockRegistryHandler.oreAluminiumOre, new ItemStack(PhCItemHandler.itemAluminiumIngot), 3);

        GameRegistry.addRecipe(new ItemStack(PhCBlockRegistryHandler.blockAluminiumBlock), "CCC", "CCC", "CCC", 'C', PhCItemHandler.itemAluminiumIngot);
        GameRegistry.addRecipe(new ItemStack(PhCBlockRegistryHandler.blockChronositeBlock), "CCC", "CCC", "CCC", 'C', PhCItemHandler.itemChronositeDust);

        GameRegistry.addShapelessRecipe(new ItemStack(PhCItemHandler.itemAluminiumIngot, 9), PhCBlockRegistryHandler.blockAluminiumBlock);
        GameRegistry.addShapelessRecipe(new ItemStack(PhCItemHandler.itemChronositeDust, 9), PhCBlockRegistryHandler.blockChronositeBlock);

        GameRegistry.registerFuelHandler(new FuelHandler());
    }

    @Override
    public void gameRegistry() throws Exception {

    }
}
