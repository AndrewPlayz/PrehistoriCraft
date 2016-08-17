package net.andrewplayz.prehistoricraft.client.renderer.fossils;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.client.model.blocks.ModelIchthyosaurusFossil;
import net.andrewplayz.prehistoricraft.server.block.blocks.fossils.BlockIchthyosaurusFossil;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityIchthyosaurusFossilBlock;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderIchthyosaurusFossil extends TileEntitySpecialRenderer<TileEntityIchthyosaurusFossilBlock> {
    private static final ResourceLocation texture = new ResourceLocation(PrehistoriCraft.MODID + ":" + "textures/blocks/block_ichthyosaurus_fossil_block.png");
    private ModelIchthyosaurusFossil model;

    public RenderIchthyosaurusFossil() {
        this.model = new ModelIchthyosaurusFossil();
    }

    private float getRotation(TileEntityIchthyosaurusFossilBlock tile) {
        switch(tile.getBlockMetadata()){
            default: return 90;
            case 1: return 270;
            case 2: return -180;
            case 3: return 270;
        }
    }

    @Override
    public void renderTileEntityAt(TileEntityIchthyosaurusFossilBlock block_ichthyosaurus_fossil_block, double x, double y, double z, float u, int v) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(0f, 0f, 0f);
        GlStateManager.translate((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(block_ichthyosaurus_fossil_block.getWorld().getBlockState(block_ichthyosaurus_fossil_block.getPos()).getValue(BlockIchthyosaurusFossil.FACING).getHorizontalIndex() * 90, 0, 1, 0);
        this.bindTexture(texture);
        this.model.render(null, 0, 0, 0, 0, 0, 0.0625F);
        GlStateManager.popMatrix();
    }
}