package net.prehistoricraft.mod.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.prehistoricraft.mod.PrehistoriCraft;
import net.prehistoricraft.mod.client.entity.hostile.EntityFAcrocanthosaurus;
import net.prehistoricraft.mod.client.entity.hostile.EntityFElasmotherium;
import net.prehistoricraft.mod.client.entity.hostile.EntityFHyena;
import net.prehistoricraft.mod.client.entity.neutral.EntityFTitanoceratops;
import net.prehistoricraft.mod.client.entity.hostile.EntityMAcrocanthosaurus;
import net.prehistoricraft.mod.client.entity.hostile.EntityMElasmotherium;
import net.prehistoricraft.mod.client.entity.hostile.EntityMHyena;
import net.prehistoricraft.mod.client.entity.neutral.EntityMTitanoceratops;
import net.prehistoricraft.mod.client.entity.passive.EntityTenontosaurus;
import net.prehistoricraft.mod.client.model.ModelFAcrocanthosaurus;
import net.prehistoricraft.mod.client.model.ModelFElasmotherium;
import net.prehistoricraft.mod.client.model.ModelFHyena;
import net.prehistoricraft.mod.client.model.ModelFTenontosaurus;
import net.prehistoricraft.mod.client.model.ModelFTitanoceratops;
import net.prehistoricraft.mod.client.model.ModelMAcrocanthosaurus;
import net.prehistoricraft.mod.client.model.ModelMElasmotherium;
import net.prehistoricraft.mod.client.model.ModelMHyena;
import net.prehistoricraft.mod.client.model.ModelMTenontosaurus;
import net.prehistoricraft.mod.client.model.ModelMTitanoceratops;
import net.prehistoricraft.mod.client.renderer.ItemRenderLaptopBlock;
import net.prehistoricraft.mod.client.renderer.RenderFAcrocanthosaurus;
import net.prehistoricraft.mod.client.renderer.RenderFElasmotherium;
import net.prehistoricraft.mod.client.renderer.RenderFHyena;
import net.prehistoricraft.mod.client.renderer.RenderFTenontosaurus;
import net.prehistoricraft.mod.client.renderer.RenderFTitanoceratops;
import net.prehistoricraft.mod.client.renderer.RenderLaptop;
import net.prehistoricraft.mod.client.renderer.RenderMAcrocanthosaurus;
import net.prehistoricraft.mod.client.renderer.RenderMElasmotherium;
import net.prehistoricraft.mod.client.renderer.RenderMHyena;
import net.prehistoricraft.mod.client.renderer.RenderMTenontosaurus;
import net.prehistoricraft.mod.client.renderer.RenderMTitanoceratops;
import net.prehistoricraft.mod.client.tileentity.TileEntityLaptopBlock;
import net.prehistoricraft.mod.server.CommonProxy;

public class ClientProxy extends CommonProxy {

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
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTenontosaurus.class, new RenderMTenontosaurus(new ModelMTenontosaurus(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTenontosaurus.class, new RenderFTenontosaurus(new ModelFTenontosaurus(), 0.3F));
	}
	
	public void registerTileEntitySpecialRenderer(){
		
	}
}
