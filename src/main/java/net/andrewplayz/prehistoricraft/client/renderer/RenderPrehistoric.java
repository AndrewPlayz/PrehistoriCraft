package net.andrewplayz.prehistoricraft.client.renderer;

import net.andrewplayz.prehistoricraft.PrehistoriCraft;
import net.andrewplayz.prehistoricraft.server.entity.EntityGender;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderPrehistoric extends RenderLiving {
    private ResourceLocation maleTexture;
    private ResourceLocation femaleTexture;
    private float scale;

    public RenderPrehistoric(ModelBase model, String maleTexture, String femaleTexture, float shadow) {
        this(model, maleTexture, femaleTexture, shadow, 1.0F);
    }

    public RenderPrehistoric(ModelBase model, String maleTexture, String femaleTexture, float shadow, float scale) {
        super(model, shadow);
        this.maleTexture = new ResourceLocation(PrehistoriCraft.MODID, "textures/model/" + maleTexture + ".png");
        this.femaleTexture = new ResourceLocation(PrehistoriCraft.MODID, "textures/model/" + femaleTexture + ".png");
        this.scale = scale;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        EntityGender gender = EntityGender.getGender(entity);
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
    protected void preRenderCallback(EntityLivingBase entitylivingbase, float partialTick) {
        GL11.glScalef(scale, scale, scale);
    }
}
