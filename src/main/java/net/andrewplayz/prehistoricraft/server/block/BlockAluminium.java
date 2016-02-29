package net.andrewplayz.prehistoricraft.server.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.creativetab.PhCCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockAluminium extends Block {

    public BlockAluminium(Material material) {
        super(material);

        this.setHardness(5.0f);
        this.setResistance(30.0f);
        this.setStepSound(soundTypeMetal);
        this.setCreativeTab(PhCCreativeTabs.prehistoricraftTab);

    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(PrehistoriCraft.MODID + ":" + this.getUnlocalizedName().substring(5));
    }
}
