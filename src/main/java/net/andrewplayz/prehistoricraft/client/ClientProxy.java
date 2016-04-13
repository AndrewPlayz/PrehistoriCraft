package net.andrewplayz.prehistoricraft.client;

import net.andrewplayz.prehistoricraft.client.model.entities.acrocanthosaurus.AcrocanthosaurusMale;
import net.andrewplayz.prehistoricraft.client.model.entities.anodontosaurus.AnodontosaurusMale;
import net.andrewplayz.prehistoricraft.client.model.entities.daspletosaurus.DaspletosaurusMale;
import net.andrewplayz.prehistoricraft.client.model.entities.edmontonia.EdmontoniaMale;
import net.andrewplayz.prehistoricraft.client.model.entities.hypacrosaurus.HypacrosaurusMale;
import net.andrewplayz.prehistoricraft.client.model.entities.ornithomimus.OrnithomimusMale;
import net.andrewplayz.prehistoricraft.client.model.entities.pachyrhinosauruscanadensis.PachyrhinosaurusCanadensisMale;
import net.andrewplayz.prehistoricraft.client.model.entities.pachyrhinosauruslakustai.PachyrhinosaurusLakustaiMale;
import net.andrewplayz.prehistoricraft.client.model.entities.rugocaudia.RugocaudiaMale;
import net.andrewplayz.prehistoricraft.client.model.entities.sauropelta.SauropeltaMale;
import net.andrewplayz.prehistoricraft.client.model.entities.sauroposeidon.SauroposeidonMale;
import net.andrewplayz.prehistoricraft.client.model.entities.tenontosaurus.TenontosaurusMale;
import net.andrewplayz.prehistoricraft.client.model.entities.troodon.TroodonMale;
import net.andrewplayz.prehistoricraft.client.renderer.PrehistoricRenderFactory;
import net.andrewplayz.prehistoricraft.client.renderer.RenderLaptop;
import net.andrewplayz.prehistoricraft.server.ServerProxy;
import net.andrewplayz.prehistoricraft.server.block.PhCBlockRegistry;
import net.andrewplayz.prehistoricraft.server.block.entity.TileEntityLaptopBlock;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityAcrocanthosaurus;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityDaspletosaurus;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityTroodon;
import net.andrewplayz.prehistoricraft.server.entity.neutral.*;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityHypacrosaurus;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityOrnithomimus;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityTenontosaurus;
import net.andrewplayz.prehistoricraft.server.item.PhCItemRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy implements IRenderFactory {
    @Override
    public void onPreInit() {
        //3D Rendered Blocks
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLaptopBlock.class, new RenderLaptop());

        //Mobs
        RenderingRegistry.registerEntityRenderingHandler(EntityAcrocanthosaurus.class, new PrehistoricRenderFactory<EntityAcrocanthosaurus>(new AcrocanthosaurusMale(), "acrocanthosaurusmale", "acrocanthosaurusfemale", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityOrnithomimus.class, new PrehistoricRenderFactory<EntityOrnithomimus>(new OrnithomimusMale(), "ornithomimusmale", "ornithomimusfemale", 0.1F, 0.1F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRugocaudia.class, new PrehistoricRenderFactory<EntityRugocaudia>(new RugocaudiaMale(), "rugocaudiamale", "rugocaudiafemale", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySauropelta.class, new PrehistoricRenderFactory<EntitySauropelta>(new SauropeltaMale(), "sauropeltamale", "sauropeltafemale", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySauroposeidon.class, new PrehistoricRenderFactory<EntitySauroposeidon>(new SauroposeidonMale(), "sauroposeidonmale", "sauroposeidonfemale", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTenontosaurus.class, new PrehistoricRenderFactory<EntityTenontosaurus>(new TenontosaurusMale(), "tenontosaurusmale", "tenontosaurusfemale", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAnodontosaurus.class, new PrehistoricRenderFactory<EntityAnodontosaurus>(new AnodontosaurusMale(), "anodontosaurusmale", "anodontosaurusfemale", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDaspletosaurus.class, new PrehistoricRenderFactory<EntityDaspletosaurus>(new DaspletosaurusMale(), "daspletosaurusmale", "daspletosaurusfemale", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEdmontonia.class, new PrehistoricRenderFactory<EntityEdmontonia>(new EdmontoniaMale(), "edmontoniamale", "edmontoniafemale", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHypacrosaurus.class, new PrehistoricRenderFactory<EntityHypacrosaurus>(new HypacrosaurusMale(), "hypacrosaurusmale", "hypacrosaurusfemale", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPachyrhinosaurusCanadensis.class, new PrehistoricRenderFactory<EntityPachyrhinosaurusCanadensis>(new PachyrhinosaurusCanadensisMale(), "pachyrhinosauruscanadensismale", "pachyrhinosauruscanadensisfemale", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPachyrhinosaurusLakustai.class, new PrehistoricRenderFactory<EntityPachyrhinosaurusLakustai>(new PachyrhinosaurusLakustaiMale(), "pachyrhinosauruslakustaimale", "pachyrhinosauruslakustaifemale", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTroodon.class, new PrehistoricRenderFactory<EntityTroodon>(new TroodonMale(), "troodonmale", "troodonfemale", 1.0F, 1.0F));
    }

    @Override
    public void onInit() {
        //Items Renderer
        PhCItemRenderer.registerItemRender();
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

    @Override
    public Render createRenderFor(RenderManager manager) {
        return null;
    }
}