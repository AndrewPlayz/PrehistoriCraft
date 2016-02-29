package net.andrewplayz.prehistoricraft.server.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.creativetab.PhCCreativeTabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemAluminiumIngot extends Item {

    public ItemAluminiumIngot() {
        this.setCreativeTab(PhCCreativeTabs.prehistoricraftTab);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(PrehistoriCraft.MODID + ":" + this.getUnlocalizedName().substring(5));

    }
}
