package net.andrewplayz.prehistoricraft.server.recipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.andrewplayz.prehistoricraft.client.FuelHandler;
import net.andrewplayz.prehistoricraft.server.block.PhCBlockRegistry;
import net.andrewplayz.prehistoricraft.server.item.PhCItemRegistry;
import net.ilexiconn.llibrary.common.content.IContentHandler;
import net.minecraft.item.ItemStack;

public class PhCRecipes implements IContentHandler {
    @Override
    public void init() {
        GameRegistry.addSmelting(PhCBlockRegistry.oreAluminiumOre, new ItemStack(PhCItemRegistry.itemAluminiumIngot), 3);

        GameRegistry.addRecipe(new ItemStack(PhCBlockRegistry.blockAluminiumBlock), "CCC", "CCC", "CCC", 'C', PhCItemRegistry.itemAluminiumIngot);
        GameRegistry.addRecipe(new ItemStack(PhCBlockRegistry.blockChronositeBlock), "CCC", "CCC", "CCC", 'C', PhCItemRegistry.itemChronositeDust);

        GameRegistry.addShapelessRecipe(new ItemStack(PhCItemRegistry.itemAluminiumIngot, 9), PhCBlockRegistry.blockAluminiumBlock);
        GameRegistry.addShapelessRecipe(new ItemStack(PhCItemRegistry.itemChronositeDust, 9), PhCBlockRegistry.blockChronositeBlock);

        GameRegistry.registerFuelHandler(new FuelHandler());
    }

    @Override
    public void gameRegistry() throws Exception {

    }
}
