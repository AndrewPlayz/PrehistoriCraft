package net.andrewplayz.prehistoricraft.client;

import net.andrewplayz.prehistoricraft.client.model.acrocanthosaurus.AcrocanthosaurusMale;
import net.andrewplayz.prehistoricraft.client.model.ornithomimus.OrnithomimusMale;
import net.andrewplayz.prehistoricraft.client.model.rugocaudia.RugocaudiaMale;
import net.andrewplayz.prehistoricraft.client.model.sauropelta.SauropeltaMale;
import net.andrewplayz.prehistoricraft.client.model.sauroposeidon.SauroposeidonMale;
import net.andrewplayz.prehistoricraft.client.model.tenontosaurus.TenontosaurusMale;
import net.andrewplayz.prehistoricraft.client.renderer.RenderLaptop;
import net.andrewplayz.prehistoricraft.client.renderer.RenderPrehistoric;
import net.andrewplayz.prehistoricraft.server.ServerProxy;
import net.andrewplayz.prehistoricraft.server.block.PhCBlockRegistry;
import net.andrewplayz.prehistoricraft.server.block.entity.TileEntityLaptopBlock;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityAcrocanthosaurus;
import net.andrewplayz.prehistoricraft.server.entity.neutral.EntityRugocaudia;
import net.andrewplayz.prehistoricraft.server.entity.neutral.EntitySauropelta;
import net.andrewplayz.prehistoricraft.server.entity.neutral.EntitySauroposeidon;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityOrnithomimus;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityTenontosaurus;
import net.andrewplayz.prehistoricraft.server.item.PhCItemRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy {
    @Override
    public void onPreInit() {
        //3D Rendered Blocks
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLaptopBlock.class, new RenderLaptop());
    }

    @Override
    public void onInit() {
        //Items Renderer
        PhCItemRenderer.registerItemRender();

        //Mobs Renderer
        RenderingRegistry.registerEntityRenderingHandler(EntityAcrocanthosaurus.class, new RenderPrehistoric<EntityAcrocanthosaurus>(new AcrocanthosaurusMale(), "acrocanthosaurusmale", "acrocanthosaurusfemale", 0.3F, 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityOrnithomimus.class, new RenderPrehistoric<EntityOrnithomimus>(new OrnithomimusMale(), "ornithomimusmale", "ornithomimusfemale", 0.3F, 0.8F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRugocaudia.class, new RenderPrehistoric<EntityRugocaudia>(new RugocaudiaMale(), "rugocaudiamale", "rugocaudiafemale", 0.3F, 1.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySauropelta.class, new RenderPrehistoric<EntitySauropelta>(new SauropeltaMale(), "sauropeltamale", "sauropeltafemale", 0.3F, 1.2F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySauroposeidon.class, new RenderPrehistoric<EntitySauroposeidon>(new SauroposeidonMale(), "sauroposeidonmale", "sauroposeidonfemale", 0.3F, 1.2F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTenontosaurus.class, new RenderPrehistoric<EntityTenontosaurus>(new TenontosaurusMale(), "tenontosaurusmale", "tenontosaurusfemale", 0.3F, 1.2F));
    }

    @Override
    public void onPostInit() {
        //Block Renderer
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.oreAluminiumOre), 0, new ModelResourceLocation("prehistoricraft:blockaluminiumore", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.oreChronositeOre), 0, new ModelResourceLocation("prehistoricraft:blockchronositeore", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockAluminiumBlock), 0, new ModelResourceLocation("prehistoricraft:blockaluminiumblock", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockChronositeBlock), 0, new ModelResourceLocation("prehistoricraft:blockchronositeblock", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockVolcanicAsh), 0, new ModelResourceLocation("prehistoricraft:blockvolcanicash", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockVolcanicRock), 0, new ModelResourceLocation("prehistoricraft:blockvolcanicrock", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockVolcanicSoil), 0, new ModelResourceLocation("prehistoricraft:blockvolcanicsoil", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockLaptop), 0, new ModelResourceLocation("prehistoricraft:blocklaptop", "inventory"));
    }
}