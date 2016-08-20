package net.andrewplayz.prehistoricraft.server.item;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.core.PhCCreativeTabs;
import net.andrewplayz.prehistoricraft.server.core.PhCItems;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemArmor extends net.minecraft.item.ItemArmor{
    public ItemArmor(String name, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(PhCItems.adventurer_material, renderIndexIn, equipmentSlotIn);
        this.setUnlocalizedName("prehistoricraft." + name);
        this.setCreativeTab(PhCCreativeTabs.creativetab_prehistoricraft_main);
        GameRegistry.registerItem(this, name);
        PrehistoriCraft.PROXY.addItemRender(this, name);
    }

    /*@Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack){
        Multimap mods = HashMultimap.create();

        if(this == PhCItems.item_adventurer_helmet)
            mods.put(SharedMonsterAttributes.MAX_HEALTH.getAttributeUnlocalizedName(), new AttributeModifier(UUID.fromString("1bca943c-3cf5-42cc-a3df-2ed994ae0000"), "hp", 3.0D, 0));

        return mods;
    }*/
}