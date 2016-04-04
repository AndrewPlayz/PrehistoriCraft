package net.andrewplayz.prehistoricraft.client.renderer;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.entity.EntityGender;
import net.andrewplayz.prehistoricraft.server.entity.EntityPrehistoric;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderPrehistoric<T extends EntityLiving> extends RenderLiving<T> {
    private ResourceLocation maleTexture;
    private ResourceLocation femaleTexture;
    private float scale;

    public RenderPrehistoric(ModelBase model, String maleTexture, String femaleTexture, float shadow, float scale) {
        super(Minecraft.getMinecraft().getRenderManager(), model, shadow);
        this.maleTexture = new ResourceLocation(PrehistoriCraft.MODID, "textures/entities/" + maleTexture + ".png");
        this.femaleTexture = new ResourceLocation(PrehistoriCraft.MODID, "textures/entities/" + femaleTexture + ".png");
        this.scale = scale;
    }

    @Override
    protected ResourceLocation getEntityTexture(T entity) {
        EntityGender gender = EntityPrehistoric.getGender(entity);
        switch (gender) {
            case MALE:
                return maleTexture;
            case FEMALE:
                return femaleTexture;
            default:
                return null;
        }
    }

    @Override
    protected void preRenderCallback(T entity, float partialTick) {
        EntityPrehistoric prehistoric = (EntityPrehistoric)entity;
        GL11.glScalef(prehistoric.randomMobScale, prehistoric.randomMobScale, prehistoric.randomMobScale);
    }
}
