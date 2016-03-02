package net.andrewplayz.prehistoricraft.server.item;

import net.ilexiconn.llibrary.common.content.IContentHandler;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PhCItemRegistry implements IContentHandler {
    public static Item itemAluminiumIngot;
    public static Item itemChronositeDust;
    public static Item itemTreeTinder;

    @Override
    public void init() {
        itemAluminiumIngot = new ItemAluminiumIngot().setUnlocalizedName("ItemAluminiumIngot");
        itemChronositeDust = new ItemChronositeDust().setUnlocalizedName("ItemChronositeDust");
        itemTreeTinder = new ItemTreeTinder().setUnlocalizedName("ItemTreeTinder");
    }

    @Override
    public void gameRegistry() throws Exception {
        GameRegistry.registerItem(itemAluminiumIngot, "ItemAluminiumIngot");
        GameRegistry.registerItem(itemChronositeDust, "ItemChronositeDust");
        GameRegistry.registerItem(itemTreeTinder, "ItemTreeTinder");
    }
}
