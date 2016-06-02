package net.andrewplayz.prehistoricraft.client.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class PrehistoricRenderFactory<E> implements IRenderFactory {

    public ModelBase model;
    public String maleTexture;
    public String femaleTexture;
    public float shadow;
    public float scale;

    public PrehistoricRenderFactory(ModelBase model, String maleTexture, String femaleTexture, float shadow, float scale) {
        this.model = model;
        this.maleTexture = maleTexture;
        this.femaleTexture = femaleTexture;
        this.shadow = shadow;
        this.scale = scale;
    }

    @Override
    public Render createRenderFor(RenderManager manager) {
        RenderPrehistoric phcrender = new RenderPrehistoric(manager, model, maleTexture, femaleTexture, shadow, scale);
        return phcrender;
    }
}
