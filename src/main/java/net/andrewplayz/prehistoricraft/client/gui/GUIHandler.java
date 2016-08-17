package net.andrewplayz.prehistoricraft.client.gui;

import net.andrewplayz.prehistoricraft.client.container.ContainerLaptop;
import net.andrewplayz.prehistoricraft.client.gui.GUILaptop;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityLaptopBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileentity = world.getTileEntity(new BlockPos(x, y, z));
        switch (ID) {
            case 0 :
                return new ContainerLaptop(player.inventory, (TileEntityLaptopBlock) tileentity);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileentity = world.getTileEntity(new BlockPos(x, y, z));
        switch (ID) {
            case 0 :
                return new GUILaptop(player.inventory, (TileEntityLaptopBlock) tileentity);
        }
        return null;
    }
}