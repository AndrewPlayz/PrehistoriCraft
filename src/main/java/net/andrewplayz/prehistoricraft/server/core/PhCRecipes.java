package net.andrewplayz.prehistoricraft.server.core;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class PhCRecipes{
    public static void init() {
        //Ore Dictionary
        OreDictionary.registerOre("block_aluminium_ore_block", new ItemStack(PhCBlocks.block_aluminium_ore_block));

        //Ores -> Ingots
        GameRegistry.addSmelting(PhCBlocks.block_aluminium_ore_block, new ItemStack(PhCItems.item_aluminium_ingot), 3);

        //Ingots/Dusts -> Blocks
        GameRegistry.addRecipe(new ItemStack(PhCBlocks.block_aluminium_block), "CCC", "CCC", "CCC", 'C', PhCItems.item_aluminium_ingot);
        GameRegistry.addRecipe(new ItemStack(PhCBlocks.block_chronosite_block), "CCC", "CCC", "CCC", 'C', PhCItems.item_chronosite_dust);

        //Blocks -> Ingots
        GameRegistry.addShapelessRecipe(new ItemStack(PhCItems.item_aluminium_ingot, 9), PhCBlocks.block_aluminium_block);
        GameRegistry.addShapelessRecipe(new ItemStack(PhCItems.item_chronosite_dust, 9), PhCBlocks.block_chronosite_block);

        //Ingots -> Nuggets
        GameRegistry.addShapelessRecipe(new ItemStack(PhCItems.item_aluminium_nugget, 9), PhCItems.item_aluminium_ingot);

        //Nuggets -> Ingots
        GameRegistry.addRecipe(new ItemStack(PhCBlocks.block_aluminium_block), "CCC", "CCC", "CCC", 'C', PhCItems.item_aluminium_nugget);
        GameRegistry.addRecipe(new ItemStack(PhCBlocks.block_chronosite_block), "CCC", "CCC", "CCC", 'C', PhCItems.item_chronosite_dust);
    }
}