package net.andrewplayz.prehistoricraft.server.item;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.core.PhCCreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemFossil extends Item {
    public ItemFossil(String name) {
        this.setUnlocalizedName("prehistoricraft." + name);
        this.setCreativeTab(PhCCreativeTabs.creativetab_prehistoricraft_main);
        GameRegistry.registerItem(this, name);
        PrehistoriCraft.PROXY.addItemRender(this, name);
    }
}
