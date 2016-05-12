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
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityLaptopBlock;
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
        RenderingRegistry.registerEntityRenderingHandler(EntityAcrocanthosaurus.class, new PrehistoricRenderFactory<EntityAcrocanthosaurus>(new AcrocanthosaurusMale(), "acrocanthosaurusmale.png", "acrocanthosaurusfemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityOrnithomimus.class, new PrehistoricRenderFactory<EntityOrnithomimus>(new OrnithomimusMale(), "ornithomimusmale.png", "ornithomimusfemale.png", 0.1F, 0.1F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRugocaudia.class, new PrehistoricRenderFactory<EntityRugocaudia>(new RugocaudiaMale(), "rugocaudiamale.png", "rugocaudiafemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySauropelta.class, new PrehistoricRenderFactory<EntitySauropelta>(new SauropeltaMale(), "sauropeltamale.png", "sauropeltafemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySauroposeidon.class, new PrehistoricRenderFactory<EntitySauroposeidon>(new SauroposeidonMale(), "sauroposeidonmale.png", "sauroposeidonfemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTenontosaurus.class, new PrehistoricRenderFactory<EntityTenontosaurus>(new TenontosaurusMale(), "tenontosaurusmale.png", "tenontosaurusfemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAnodontosaurus.class, new PrehistoricRenderFactory<EntityAnodontosaurus>(new AnodontosaurusMale(), "anodontosaurusmale.png", "anodontosaurusfemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDaspletosaurus.class, new PrehistoricRenderFactory<EntityDaspletosaurus>(new DaspletosaurusMale(), "daspletosaurusmale.png", "daspletosaurusfemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEdmontonia.class, new PrehistoricRenderFactory<EntityEdmontonia>(new EdmontoniaMale(), "edmontoniamale.png", "edmontoniafemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHypacrosaurus.class, new PrehistoricRenderFactory<EntityHypacrosaurus>(new HypacrosaurusMale(), "hypacrosaurusmale.png", "hypacrosaurusfemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPachyrhinosaurusCanadensis.class, new PrehistoricRenderFactory<EntityPachyrhinosaurusCanadensis>(new PachyrhinosaurusCanadensisMale(), "pachyrhinosauruscanadensismale.png", "pachyrhinosauruscanadensisfemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPachyrhinosaurusLakustai.class, new PrehistoricRenderFactory<EntityPachyrhinosaurusLakustai>(new PachyrhinosaurusLakustaiMale(), "pachyrhinosauruslakustaimale.png", "pachyrhinosauruslakustaifemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTroodon.class, new PrehistoricRenderFactory<EntityTroodon>(new TroodonMale(), "troodonmale.png", "troodonfemale.png", 1.0F, 1.0F));
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