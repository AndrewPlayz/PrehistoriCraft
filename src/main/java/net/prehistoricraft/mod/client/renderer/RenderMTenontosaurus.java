package net.prehistoricraft.mod.client.renderer;

import net.prehistoricraft.mod.client.entity.passive.EntityTenontosaurus;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.prehistoricraft.mod.PrehistoriCraft;
import net.prehistoricraft.mod.client.model.ModelMTenontosaurus;

public class RenderMTenontosaurus extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(PrehistoriCraft.modid + ":" + "textures/model/MTenontosaurus.png");
	
	protected ModelMTenontosaurus modelEntity;
	
	public RenderMTenontosaurus(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
		
		modelEntity = ((ModelMTenontosaurus) mainModel);
		
	}
	
	public void renderMTenontosaurus(EntityTenontosaurus entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
				
	}
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v){
		renderMTenontosaurus((EntityTenontosaurus)entityLiving, x, y, z, u, v);
		
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v){
		renderMTenontosaurus((EntityTenontosaurus)entity, x, y, z, u, v);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
	
	@Override
	public void preRenderCallback(EntityLivingBase entitylivingbase, float partialTick) {
		GL11.glScalef(1.2F, 1.2F, 1.2F);
	}
}
