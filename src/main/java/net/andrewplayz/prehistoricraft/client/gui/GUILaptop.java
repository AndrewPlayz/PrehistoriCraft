package net.andrewplayz.prehistoricraft.client.gui;

import net.andrewplayz.prehistoricraft.client.container.ContainerLaptop;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class GUILaptop extends GuiContainer
{
    /*private static final ResourceLocation LAPTOP_TEXTURE = new ResourceLocation("prehistoricraft:textures/gui/block_laptop_gui.png");
    private IInventory tileInvententory;

    public GUILaptop(InventoryPlayer playerInventory, IInventory tileIn)
    {
        super(new ContainerLaptop(playerInventory, tileIn));
        this.tileInvententory = tileIn;
        this.xSize = 230;
        this.ySize = 219;
    }*/

    private static final ResourceLocation LAPTOP_TEXTURE = new ResourceLocation("prehistoricraft:textures/gui/block_laptop_gui.png");
    private IInventory tileLaptop;

    public GUILaptop(InventoryPlayer playerInv, IInventory laptopInv)
    {
        super(new ContainerLaptop(playerInv, laptopInv));
        this.tileLaptop = laptopInv;
        this.xSize = 230;
        this.ySize = 219;
    }

    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        RenderHelper.disableStandardItemLighting();

        for (GuiButton guibutton : this.buttonList)
        {
            if (guibutton.isMouseOver())
            {
                guibutton.drawButtonForegroundLayer(mouseX - this.guiLeft, mouseY - this.guiTop);
                break;
            }
        }

        RenderHelper.enableGUIStandardItemLighting();
    }

    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(LAPTOP_TEXTURE);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
        this.itemRender.zLevel = 100.0F;
        this.itemRender.zLevel = 0.0F;
    }
}