package net.prehistoricraft.mod.client.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.prehistoricraft.mod.PrehistoriCraft;
import net.prehistoricraft.mod.client.entity.hostile.EntityMElasmotherium;
import net.prehistoricraft.mod.client.model.ModelMElasmotherium;

public class RenderMElasmotherium extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(PrehistoriCraft.modid + ":" + "textures/model/MElasmotherium.png");
	
	protected ModelMElasmotherium modelEntity;
	
	public RenderMElasmotherium(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
		
		modelEntity = ((ModelMElasmotherium) mainModel);
		
	}
	
	public void renderMElasmotherium(EntityMElasmotherium entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
				
	}
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v){
		renderMElasmotherium((EntityMElasmotherium)entityLiving, x, y, z, u, v);
		
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v){
		renderMElasmotherium((EntityMElasmotherium)entity, x, y, z, u, v);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
	
	@Override
	public void preRenderCallback(EntityLivingBase entitylivingbase, float partialTick) {
		GL11.glScalef(0.8F, 0.8F, 0.8F);
	}
}
