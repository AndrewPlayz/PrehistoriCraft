package net.andrewplayz.prehistoricraft.server.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PhCCreativeTabs {
    public static CreativeTabs creativetab_prehistoricraft_main;
    public static CreativeTabs creativetab_prehistoricraft_cretaceous;

    public static void init() {
        creativetab_prehistoricraft_main = new CreativeTabs("creativetab_prehistoricraft_main") {
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return PhCItems.item_chronosite_dust;
            }
        };
        creativetab_prehistoricraft_cretaceous = new CreativeTabs("creativetab_prehistoricraft_cretaceous") {
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return Item.getItemFromBlock(PhCBlocks.block_volcanic_soil_block);
            }
        };
    }
}
