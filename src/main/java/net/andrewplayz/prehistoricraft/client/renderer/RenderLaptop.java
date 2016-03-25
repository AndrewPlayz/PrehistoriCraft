package net.andrewplayz.prehistoricraft.client.renderer;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.client.model.ModelLaptop;
import net.andrewplayz.prehistoricraft.server.block.entity.TileEntityLaptopBlock;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderLaptop extends TileEntitySpecialRenderer<TileEntityLaptopBlock> {
    private static final ResourceLocation texture = new ResourceLocation(PrehistoriCraft.MODID + ":" + "assets/prehistoricraft/textures/blocks/blocklaptop.png");

    private ModelLaptop model;

    public RenderLaptop() {
        this.model = new ModelLaptop();
    }

    @Override
    public void renderTileEntityAt(TileEntityLaptopBlock te, double x, double y, double z, float partialTicks, int destroyStage) {
        GL11.glPushMatrix();

        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        GL11.glRotatef(180, 0F, 0F, 1F);

        this.bindTexture(texture);

        GL11.glPushMatrix();
        this.model.renderModel(0.0625F);
        GL11.glPopMatrix();

        GL11.glPopMatrix();
    }
}
