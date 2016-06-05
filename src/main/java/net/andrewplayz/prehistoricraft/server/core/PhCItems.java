package net.andrewplayz.prehistoricraft.server.core;

import net.andrewplayz.prehistoricraft.server.item.ItemIngots;
import net.andrewplayz.prehistoricraft.server.item.ItemDusts;
import net.minecraft.item.Item;

public class PhCItems {
    //Ingots
    public static Item item_aluminium_ingot;

    //Nuggets
    public static Item item_aluminium_nugget;

    //Dusts
    public static Item item_chronosite_dust;

    public static void init() {
        //Ingots
        item_aluminium_ingot = new ItemIngots("item_aluminium_ingot");

        //Nuggets
        item_aluminium_nugget = new ItemDusts("item_aluminium_nugget");

        //Dusts
        item_chronosite_dust = new ItemDusts("item_chronosite_dust");
    }
}
