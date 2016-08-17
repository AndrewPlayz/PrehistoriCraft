package net.andrewplayz.prehistoricraft.server.block.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

public abstract class TileEntityLaptopBlock extends TileEntity implements ISidedInventory {
    private String laptopCustomName;

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return true;
    }

    @Override
    public void openInventory(EntityPlayer player) {
    }

    @Override
    public void closeInventory(EntityPlayer player) {
    }

    @Override
    public String getName() {
        return this.hasCustomName() ? this.laptopCustomName : "PrehistoriCraft Laptop";
    }

    @Override
    public boolean hasCustomName() {
        return this.laptopCustomName != null && !this.laptopCustomName.isEmpty();
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TextComponentTranslation(this.getName(), new Object[0]);
    }
}