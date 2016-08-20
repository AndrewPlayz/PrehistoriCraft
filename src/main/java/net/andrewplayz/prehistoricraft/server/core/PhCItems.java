package net.andrewplayz.prehistoricraft.server.core;

import net.andrewplayz.prehistoricraft.server.item.ItemArmor;
import net.andrewplayz.prehistoricraft.server.item.ItemFossil;
import net.andrewplayz.prehistoricraft.server.item.ItemIngots;
import net.andrewplayz.prehistoricraft.server.item.ItemDusts;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class PhCItems {
    //Ingots
    public static Item item_aluminium_ingot;

    //Nuggets
    public static Item item_aluminium_nugget;

    //Dusts
    public static Item item_chronosite_dust;

    //Armor
    public static ItemArmor.ArmorMaterial adventurer_material = EnumHelper.addArmorMaterial("adventurer_material", "prehistoricraft:adventurer", 20, new int[]{ 3, 7, 5, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 8);

    public static Item item_adventurer_helmet;
    public static Item item_adventurer_chestplate;
    public static Item item_adventurer_leggings;
    public static Item item_adventurer_boots;

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

        //Armor
        item_adventurer_helmet = new ItemArmor("item_adventurer_helmet", 1, EntityEquipmentSlot.HEAD);
        item_adventurer_chestplate = new ItemArmor("item_adventurer_chestplate", 1, EntityEquipmentSlot.CHEST);
        item_adventurer_leggings = new ItemArmor("item_adventurer_leggings", 2, EntityEquipmentSlot.LEGS);
        item_adventurer_boots = new ItemArmor("item_adventurer_boots", 1, EntityEquipmentSlot.FEET);

        //Fossils
        item_plesiosaurus_tooth_fossil = new ItemFossil("item_plesiosaurus_tooth_fossil");
        item_mosasaur_tooth_fossil = new ItemFossil("item_mosasaur_tooth_fossil");
        item_ammonite_shell_fossil = new ItemFossil("item_ammonite_shell_fossil");
    }
}
