package net.andrewplayz.prehistoricraft.server.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class PhCItemRenderer {

    public static void registerItemRender() {

        //Items
        registerItem(PhCItemHandler.itemAluminiumIngot);
        registerItem(PhCItemHandler.itemChronositeDust);
        registerItem(PhCItemHandler.itemTreeTinder);

    }

    public static void registerItem(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(PhCItemHandler.itemAluminiumIngot, 0, new ModelResourceLocation("prehistoricraft:itemaluminiumingot", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(PhCItemHandler.itemChronositeDust, 0, new ModelResourceLocation("prehistoricraft:itemchronositedust", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(PhCItemHandler.itemTreeTinder, 0, new ModelResourceLocation("prehistoricraft:itemtreetinder", "inventory"));
    }
}
