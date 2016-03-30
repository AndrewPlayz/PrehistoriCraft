package net.andrewplayz.prehistoricraft.server.creativetab;

import net.andrewplayz.prehistoricraft.server.block.PhCBlockRegistry;
import net.andrewplayz.prehistoricraft.server.content.IContentHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PhCCreativeTabs implements IContentHandler {
    public static CreativeTabs prehistoricraftTab;
    public static CreativeTabs prehistoricraftQuaternaryTab;
    public static CreativeTabs prehistoricraftCretaceousTab;

    @Override
    public void init() {
        prehistoricraftTab = new CreativeTabs("prehistoricraft") {
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return Item.getItemFromBlock(PhCBlockRegistry.oreChronositeOre);
            }
        };
        prehistoricraftQuaternaryTab = new CreativeTabs("prehistoricraftquaternary") {
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return Item.getItemFromBlock(PhCBlockRegistry.blockAluminiumBlock);
            }
        };
        prehistoricraftCretaceousTab = new CreativeTabs("prehistoricraftcretaceous") {
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return Item.getItemFromBlock(PhCBlockRegistry.blockVolcanicSoil);
            }
        };
    }

    @Override
    public void gameRegistry() throws Exception {

    }
}
