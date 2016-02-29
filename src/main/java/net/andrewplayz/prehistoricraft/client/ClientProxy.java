package net.andrewplayz.prehistoricraft.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.andrewplayz.prehistoricraft.client.model.*;
import net.andrewplayz.prehistoricraft.client.renderer.ItemRenderLaptopBlock;
import net.andrewplayz.prehistoricraft.client.renderer.RenderLaptop;
import net.andrewplayz.prehistoricraft.client.renderer.RenderPrehistoric;
import net.andrewplayz.prehistoricraft.server.ServerProxy;
import net.andrewplayz.prehistoricraft.server.block.PhCBlockRegistry;
import net.andrewplayz.prehistoricraft.server.block.entity.TileEntityLaptopBlock;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityAcrocanthosaurus;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityElasmotherium;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityHyena;
import net.andrewplayz.prehistoricraft.server.entity.neutral.EntityTitanoceratops;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityTenontosaurus;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends ServerProxy {
    @Override
    public void onPreInit() {
        TileEntitySpecialRenderer render = new RenderLaptop();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLaptopBlock.class, render);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(PhCBlockRegistry.blockLaptop), new ItemRenderLaptopBlock(render, new TileEntityLaptopBlock()));

        RenderingRegistry.registerEntityRenderingHandler(EntityHyena.class, new RenderPrehistoric(new ModelMHyena(), "MHyena", "FHyena", 0.3F));
        RenderingRegistry.registerEntityRenderingHandler(EntityElasmotherium.class, new RenderPrehistoric(new ModelMElasmotherium(), "MElasmotherium", "FElasmotherium", 0.3F, 0.8F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAcrocanthosaurus.class, new RenderPrehistoric(new ModelMAcrocanthosaurus(), "MAcrocanthosaurus", "FAcrocanthosaurus", 0.3F, 1.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTitanoceratops.class, new RenderPrehistoric(new ModelMTitanoceratops(), "MTitanoceratops", "FTitanoceratops", 0.3F, 1.2F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTenontosaurus.class, new RenderPrehistoric(new ModelMTenontosaurus(), "MTenontosaurus", "FTenontosaurus", 0.3F, 1.2F));
    }

    @Override
    public void onInit() {

    }

    @Override
    public void onPostInit() {

    }
}
