package net.andrewplayz.prehistoricraft.client;

import net.andrewplayz.prehistoricraft.client.model.*;
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
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy {
    @Override
    public void onPreInit() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLaptopBlock.class, new RenderLaptop());
    }

    @Override
    public void onInit() {
        RenderingRegistry.registerEntityRenderingHandler(EntityHyena.class, new RenderPrehistoric<EntityHyena>(new ModelMHyena(), "MHyena", "FHyena", 0.3F));
        RenderingRegistry.registerEntityRenderingHandler(EntityElasmotherium.class, new RenderPrehistoric<EntityElasmotherium>(new ModelMElasmotherium(), "MElasmotherium", "FElasmotherium", 0.3F, 0.8F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAcrocanthosaurus.class, new RenderPrehistoric<EntityAcrocanthosaurus>(new ModelMAcrocanthosaurus(), "MAcrocanthosaurus", "FAcrocanthosaurus", 0.3F, 1.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTitanoceratops.class, new RenderPrehistoric<EntityTitanoceratops>(new ModelMTitanoceratops(), "MTitanoceratops", "FTitanoceratops", 0.3F, 1.2F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTenontosaurus.class, new RenderPrehistoric<EntityTenontosaurus>(new ModelMTenontosaurus(), "MTenontosaurus", "FTenontosaurus", 0.3F, 1.2F));

    }

    @Override
    public void onPostInit() {
        //(PhCBlockRegistry.oreAluminiumOre);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.oreAluminiumOre), 0, new ModelResourceLocation("prehistoricraft:BlockAluminiumOre", "inventory"));
    }
}
