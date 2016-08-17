package net.andrewplayz.prehistoricraft.client.renderer.fossils;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.client.model.blocks.ModelLaptop;
import net.andrewplayz.prehistoricraft.client.model.blocks.ModelPlesiosaurFossil;
import net.andrewplayz.prehistoricraft.server.block.blocks.BlockLaptop;
import net.andrewplayz.prehistoricraft.server.block.blocks.fossils.BlockPlesiosaurFossil;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityLaptopBlock;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityPlesiosaurFossilBlock;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderPlesiosaurFossil extends TileEntitySpecialRenderer<TileEntityPlesiosaurFossilBlock> {
    private static final ResourceLocation texture = new ResourceLocation(PrehistoriCraft.MODID + ":" + "textures/blocks/block_plesiosaur_fossil_block.png");
    private ModelPlesiosaurFossil model;

    public RenderPlesiosaurFossil() {
        this.model = new ModelPlesiosaurFossil();
    }

    private float getRotation(TileEntityPlesiosaurFossilBlock tile) {
        switch(tile.getBlockMetadata()){
            default: return 90;
            case 1: return 270;
            case 2: return -180;
            case 3: return 270;
        }
    }

    @Override
    public void renderTileEntityAt(TileEntityPlesiosaurFossilBlock block_plesiosaur_fossil_block, double x, double y, double z, float u, int v) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(0f, 0f, 0f);
        GlStateManager.translate((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(block_plesiosaur_fossil_block.getWorld().getBlockState(block_plesiosaur_fossil_block.getPos()).getValue(BlockPlesiosaurFossil.FACING).getHorizontalIndex() * 90, 0, 1, 0);
        this.bindTexture(texture);
        this.model.render(null, 0, 0, 0, 0, 0, 0.0625F);
        GlStateManager.popMatrix();
    }
}