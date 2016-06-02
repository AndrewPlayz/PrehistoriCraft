package net.andrewplayz.prehistoricraft.client.renderer;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.client.model.blocks.ModelLaptop;
import net.andrewplayz.prehistoricraft.server.block.blocks.BlockLaptop;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityLaptopBlock;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderLaptop extends TileEntitySpecialRenderer<TileEntityLaptopBlock> {
    private static final ResourceLocation texture = new ResourceLocation(PrehistoriCraft.MODID + ":" + "textures/blocks/blocklaptopinactive.png");
    private ModelLaptop model;

    public RenderLaptop() {
        this.model = new ModelLaptop();
    }

<<<<<<< HEAD
    private float getRotation(TileEntityLaptopBlock tile) {
        switch(tile.getBlockMetadata()){
            default: return 90;
            case 1: return 270;
            case 2: return -180;
            case 3: return 270;
        }
    }

    @Override
    public void renderTileEntityAt(TileEntityLaptopBlock tileentity, double x, double y, double z, float u, int v) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0f, 0f,0f);
        GL11.glTranslated((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
        GL11.glRotatef(180, 0F, 0F, 1F);
        GL11.glRotatef(this.getRotation(tileentity), 0.0F, 2.0F, 0.0F);
        GL11.glPushMatrix();
=======
    @Override
    public void renderTileEntityAt(TileEntityLaptopBlock laptopBlock, double x, double y, double z, float u, int v) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(0f, 0f, 0f);
        GlStateManager.translate((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(laptopBlock.getWorld().getBlockState(laptopBlock.getPos()).getValue(BlockLaptop.FACING).getHorizontalIndex() * 90, 0, 1, 0);
>>>>>>> 08163be334d21fa09d1e96be939a002298aa4038
        this.bindTexture(texture);
        this.model.render(null, 0, 0, 0, 0, 0, 0.0625F);
        GlStateManager.popMatrix();
    }
}