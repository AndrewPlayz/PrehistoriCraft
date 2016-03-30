package net.andrewplayz.prehistoricraft.server.item;

import net.andrewplayz.prehistoricraft.server.content.IContentHandler;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PhCItemRegistry implements IContentHandler {
    public static Item itemAluminiumIngot;
    public static Item itemChronositeDust;
    public static Item itemTreeTinder;

    @Override
    public void init() {
        itemAluminiumIngot = new ItemAluminiumIngot().setUnlocalizedName("itemaluminiumingot");
        itemChronositeDust = new ItemChronositeDust().setUnlocalizedName("itemchronositedust");
        itemTreeTinder = new ItemTreeTinder().setUnlocalizedName("itemtreetinder");
    }

    @Override
    public void gameRegistry() throws Exception {
        GameRegistry.registerItem(itemAluminiumIngot, "itemaluminiumingot");
        GameRegistry.registerItem(itemChronositeDust, "itemchronositedust");
        GameRegistry.registerItem(itemTreeTinder, "itemtreetinder");
    }
}
