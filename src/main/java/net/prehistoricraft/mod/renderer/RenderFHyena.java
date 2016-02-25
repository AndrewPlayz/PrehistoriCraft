package net.prehistoricraft.mod.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.prehistoricraft.mod.PrehistoriCraft;
import net.prehistoricraft.mod.entity.EntityFHyena;
import net.prehistoricraft.mod.entity.EntityMHyena;
import net.prehistoricraft.mod.model.ModelFHyena;
import net.prehistoricraft.mod.model.ModelMHyena;

public class RenderFHyena extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(PrehistoriCraft.modid + ":" + "textures/model/FHyena.png");
	
	protected ModelFHyena modelEntity;
	
	public RenderFHyena(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
		
		modelEntity = ((ModelFHyena) mainModel);
		
	}
	
	public void renderFHyena(EntityFHyena entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
		
	}
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v){
		renderFHyena((EntityFHyena)entityLiving, x, y, z, u, v);
		
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v){
		renderFHyena((EntityFHyena) entity, x, y, z, u, v);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return texture;
	}
}
