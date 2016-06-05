package net.andrewplayz.prehistoricraft.server.block.blocks;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.core.PhCCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockUnrefinedMetal extends Block {
    public BlockUnrefinedMetal(String name) {
        super(Material.ROCK);
        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setCreativeTab(PhCCreativeTabs.creativetab_prehistoricraft_main);
        this.setUnlocalizedName("prehistoricraft." + name);
        GameRegistry.registerBlock(this, name);
        PrehistoriCraft.PROXY.addItemRender(Item.getItemFromBlock(this), name);
    }
}
