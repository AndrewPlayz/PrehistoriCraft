package net.andrewplayz.prehistoricraft.client.renderer;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.entity.EntityGender;
import net.andrewplayz.prehistoricraft.server.entity.EntityPrehistoric;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPrehistoric<T extends EntityPrehistoric> extends RenderLiving<T> {
    private ResourceLocation maleTexture;
    private ResourceLocation femaleTexture;
    private float scale;

    public RenderPrehistoric(RenderManager manager, ModelBase model, String maleTexture, String femaleTexture, float shadow, float scale) {
        super(manager, model, shadow);
        this.maleTexture = new ResourceLocation(PrehistoriCraft.MODID, "textures/entities/" + maleTexture);
        this.femaleTexture = new ResourceLocation(PrehistoriCraft.MODID, "textures/entities/" + femaleTexture);
        this.scale = scale;
    }

    @Override
    protected ResourceLocation getEntityTexture(T entity) {
        EntityGender gender = entity.getGender();
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
        EntityPrehistoric prehistoric = (EntityPrehistoric) entity;
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
    }
}
