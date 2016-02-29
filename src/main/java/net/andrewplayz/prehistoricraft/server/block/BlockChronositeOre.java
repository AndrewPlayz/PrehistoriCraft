package net.andrewplayz.prehistoricraft.server.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.creativetab.PhCCreativeTabs;
import net.andrewplayz.prehistoricraft.server.item.PhCItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockChronositeOre extends Block {

    public BlockChronositeOre(Material material) {
        super(material);

        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(PhCCreativeTabs.prehistoricraftTab);

    }

    public Item getItemDropped(int i, Random random, int j) {
        return this == PhCBlockRegistry.oreChronositeOre ? PhCItemRegistry.itemChronositeDust : Item.getItemFromBlock(this);
    }

    public int quantityDropped(Random random) {
        return this == PhCBlockRegistry.oreChronositeOre ? 1 + random.nextInt(2) : 2;

    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(PrehistoriCraft.MODID + ":" + this.getUnlocalizedName().substring(5));
    }
}
