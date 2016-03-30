package net.andrewplayz.prehistoricraft.client.renderer;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.client.model.blocks.ModelLaptop;
import net.andrewplayz.prehistoricraft.server.block.entity.TileEntityLaptopBlock;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderLaptop extends TileEntitySpecialRenderer<TileEntityLaptopBlock> {
    private static final ResourceLocation texture = new ResourceLocation(PrehistoriCraft.MODID + ":" + "textures/blocks/blocklaptopinactive.png");
    private ModelLaptop model;

    public RenderLaptop() {
        this.model = new ModelLaptop();
    }

    public static void render(){
    }

    @Override
    public void renderTileEntityAt(TileEntityLaptopBlock tileentity, double x, double y, double z, float u, int v) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0f, 0f,0f);
        GL11.glTranslated((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
        GL11.glRotatef(180, 0F, 0F, 1F);
        GL11.glPushMatrix();
        this.bindTexture(texture);
        this.model.render(null, 0, 0, 0, 0, 0, 0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
