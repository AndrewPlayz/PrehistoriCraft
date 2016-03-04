package net.andrewplayz.prehistoricraft.client;

import net.andrewplayz.prehistoricraft.server.block.BlockAluminiumOre;
import net.andrewplayz.prehistoricraft.server.block.PhCBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegistry {
    public static void registerBlockRenderer(){
        reg(PhCBlockRegistry.oreAluminiumOre);
    }

    public static void reg(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.oreAluminiumOre), 0, new ModelResourceLocation("prehistoricraft:blocks/block_aluminium_ore.png", "inventory"));
    }
}
