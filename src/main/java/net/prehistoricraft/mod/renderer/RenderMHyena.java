package net.prehistoricraft.mod.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.prehistoricraft.mod.PrehistoriCraft;
import net.prehistoricraft.mod.entity.EntityMHyena;
import net.prehistoricraft.mod.model.ModelMHyena;

public class RenderMHyena extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(PrehistoriCraft.modid + ":" + "textures/model/MHyena.png");
	
	protected ModelMHyena modelEntity;
	
	public RenderMHyena(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
		
		modelEntity = ((ModelMHyena) mainModel);
		
	}
	
	public void renderMHyena(EntityMHyena entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
		
	}
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v){
		renderMHyena((EntityMHyena)entityLiving, x, y, z, u, v);
		
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v){
		renderMHyena((EntityMHyena) entity, x, y, z, u, v);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return texture;
	}
}
