package net.andrewplayz.prehistoricraft.server.core;

import net.andrewplayz.prehistoricraft.server.item.ItemFossil;
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

    //Fossils
    public static Item item_plesiosaurus_tooth_fossil;
    public static Item item_mosasaur_tooth_fossil;
    public static Item item_ammonite_shell_fossil;

    public static void init() {
        //Ingots
        item_aluminium_ingot = new ItemIngots("item_aluminium_ingot");

        //Nuggets
        item_aluminium_nugget = new ItemDusts("item_aluminium_nugget");

        //Dusts
        item_chronosite_dust = new ItemDusts("item_chronosite_dust");

        //Fossils
        item_plesiosaurus_tooth_fossil = new ItemFossil("item_plesiosaurus_tooth_fossil");
        item_mosasaur_tooth_fossil = new ItemFossil("item_mosasaur_tooth_fossil");
        item_ammonite_shell_fossil = new ItemFossil("item_ammonite_shell_fossil");
    }
}
