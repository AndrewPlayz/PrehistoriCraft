package net.prehistoricraft.mod.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.prehistoricraft.mod.PrehistoriCraft;
import net.prehistoricraft.mod.entity.EntityFAcrocanthosaurus;
import net.prehistoricraft.mod.entity.EntityFElasmotherium;
import net.prehistoricraft.mod.entity.EntityFHyena;
import net.prehistoricraft.mod.entity.EntityFTenontosaurus;
import net.prehistoricraft.mod.entity.EntityFTitanoceratops;
import net.prehistoricraft.mod.entity.EntityMAcrocanthosaurus;
import net.prehistoricraft.mod.entity.EntityMElasmotherium;
import net.prehistoricraft.mod.entity.EntityMHyena;
import net.prehistoricraft.mod.entity.EntityMTenontosaurus;
import net.prehistoricraft.mod.entity.EntityMTitanoceratops;
import net.prehistoricraft.mod.model.ModelFAcrocanthosaurus;
import net.prehistoricraft.mod.model.ModelFElasmotherium;
import net.prehistoricraft.mod.model.ModelFHyena;
import net.prehistoricraft.mod.model.ModelFTenontosaurus;
import net.prehistoricraft.mod.model.ModelFTitanoceratops;
import net.prehistoricraft.mod.model.ModelMAcrocanthosaurus;
import net.prehistoricraft.mod.model.ModelMElasmotherium;
import net.prehistoricraft.mod.model.ModelMHyena;
import net.prehistoricraft.mod.model.ModelMTenontosaurus;
import net.prehistoricraft.mod.model.ModelMTitanoceratops;
import net.prehistoricraft.mod.renderer.ItemRenderLaptopBlock;
import net.prehistoricraft.mod.renderer.RenderFAcrocanthosaurus;
import net.prehistoricraft.mod.renderer.RenderFElasmotherium;
import net.prehistoricraft.mod.renderer.RenderFHyena;
import net.prehistoricraft.mod.renderer.RenderFTenontosaurus;
import net.prehistoricraft.mod.renderer.RenderFTitanoceratops;
import net.prehistoricraft.mod.renderer.RenderLaptop;
import net.prehistoricraft.mod.renderer.RenderMAcrocanthosaurus;
import net.prehistoricraft.mod.renderer.RenderMElasmotherium;
import net.prehistoricraft.mod.renderer.RenderMHyena;
import net.prehistoricraft.mod.renderer.RenderMTenontosaurus;
import net.prehistoricraft.mod.renderer.RenderMTitanoceratops;
import net.prehistoricraft.mod.tileentity.TileEntityLaptopBlock;

public class ClientProxy extends CommonProxy{

	public void registerRender(){
		//Laptop Rendering
		TileEntitySpecialRenderer render = new RenderLaptop();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLaptopBlock.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(PrehistoriCraft.blockLaptop), new ItemRenderLaptopBlock(render, new TileEntityLaptopBlock()));
		
		//PrehistoriCraft Entities
		RenderingRegistry.registerEntityRenderingHandler(EntityMHyena.class, new RenderMHyena(new ModelMHyena(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFHyena.class, new RenderFHyena(new ModelFHyena(), 0.3F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMElasmotherium.class, new RenderMElasmotherium(new ModelMElasmotherium(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFElasmotherium.class, new RenderFElasmotherium(new ModelFElasmotherium(), 0.3F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMAcrocanthosaurus.class, new RenderMAcrocanthosaurus(new ModelMAcrocanthosaurus(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFAcrocanthosaurus.class, new RenderFAcrocanthosaurus(new ModelFAcrocanthosaurus(), 0.3F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMTitanoceratops.class, new RenderMTitanoceratops(new ModelMTitanoceratops(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFTitanoceratops.class, new RenderFTitanoceratops(new ModelFTitanoceratops(), 0.3F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMTenontosaurus.class, new RenderMTenontosaurus(new ModelMTenontosaurus(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFTenontosaurus.class, new RenderFTenontosaurus(new ModelFTenontosaurus(), 0.3F));
	}
	
	public void registerTileEntitySpecialRenderer(){
		
	}
}
