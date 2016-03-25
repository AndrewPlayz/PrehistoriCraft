package net.andrewplayz.prehistoricraft.server.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class PhCItemRenderer {

    public static void registerItemRender(){

        //Items
        registerItem(PhCItemRegistry.itemAluminiumIngot);
        registerItem(PhCItemRegistry.itemChronositeDust);
        registerItem(PhCItemRegistry.itemTreeTinder);

    }
    public static void registerItem(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(PhCItemRegistry.itemAluminiumIngot, 0, new ModelResourceLocation("prehistoricraft:itemaluminiumingot", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(PhCItemRegistry.itemChronositeDust, 0, new ModelResourceLocation("prehistoricraft:itemchronositedust", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(PhCItemRegistry.itemTreeTinder, 0, new ModelResourceLocation("prehistoricraft:itemtreetinder", "inventory"));
    }
}
