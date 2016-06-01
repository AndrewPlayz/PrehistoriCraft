package net.andrewplayz.prehistoricraft.server.creativetab;

import net.andrewplayz.prehistoricraft.server.block.PhCBlockRegistryHandler;
import net.andrewplayz.prehistoricraft.server.content.IContentHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PhCCreativeTabHandler implements IContentHandler {
    public static CreativeTabs prehistoricraftTab;
    public static CreativeTabs prehistoricraftCretaceousTab;

    @Override
    public void init() {
        prehistoricraftTab = new CreativeTabs("prehistoricraft") {
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return Item.getItemFromBlock(PhCBlockRegistryHandler.oreChronositeOre);
            }
        };
        prehistoricraftCretaceousTab = new CreativeTabs("prehistoricraftcretaceous") {
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return Item.getItemFromBlock(PhCBlockRegistryHandler.blockVolcanicSoil);
            }
        };
    }

    @Override
    public void gameRegistry() throws Exception {

    }
}
