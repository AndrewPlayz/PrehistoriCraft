package net.andrewplayz.prehistoricraft.client;

import net.andrewplayz.prehistoricraft.client.model.entity.dinosaur.ModelAnodontosaurus;
import net.andrewplayz.prehistoricraft.client.model.entity.dinosaur.ModelDaspletosaurus;
import net.andrewplayz.prehistoricraft.client.model.entity.dinosaur.ModelEdmontonia;
import net.andrewplayz.prehistoricraft.client.model.entity.dinosaur.ModelHypacrosaurus;
import net.andrewplayz.prehistoricraft.client.model.entity.dinosaur.ModelOrnithomimus;
import net.andrewplayz.prehistoricraft.client.model.entity.dinosaur.ModelPachyrhinosaurusCanadensis;
import net.andrewplayz.prehistoricraft.client.model.entity.dinosaur.ModelPachyrhinosaurusLakustai;
import net.andrewplayz.prehistoricraft.client.model.entity.dinosaur.ModelTroodon;
import net.andrewplayz.prehistoricraft.client.renderer.PrehistoricRenderFactory;
import net.andrewplayz.prehistoricraft.client.renderer.RenderLaptop;
import net.andrewplayz.prehistoricraft.client.renderer.fossils.RenderIchthyosaurusFossil;
import net.andrewplayz.prehistoricraft.client.renderer.fossils.RenderPlesiosaurFossil;
import net.andrewplayz.prehistoricraft.server.ServerProxy;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityIchthyosaurusFossilBlock;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityLaptopBlock;
import net.andrewplayz.prehistoricraft.server.block.tileentity.TileEntityPlesiosaurFossilBlock;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityDaspletosaurus;
import net.andrewplayz.prehistoricraft.server.entity.hostile.EntityTroodon;
import net.andrewplayz.prehistoricraft.server.entity.neutral.*;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityHypacrosaurus;
import net.andrewplayz.prehistoricraft.server.entity.passive.EntityOrnithomimus;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy {
    @Override
    public void onPreInit() {
        //Mobs [HorseShoe]
        RenderingRegistry.registerEntityRenderingHandler(EntityOrnithomimus.class, new PrehistoricRenderFactory<EntityOrnithomimus>(new ModelOrnithomimus(), "ornithomimusmale.png", "ornithomimusfemale.png", 0.1F, 0.1F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAnodontosaurus.class, new PrehistoricRenderFactory<EntityAnodontosaurus>(new ModelAnodontosaurus(), "anodontosaurusmale.png", "anodontosaurusfemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDaspletosaurus.class, new PrehistoricRenderFactory<EntityDaspletosaurus>(new ModelDaspletosaurus(), "daspletosaurusmale.png", "daspletosaurusfemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEdmontonia.class, new PrehistoricRenderFactory<EntityEdmontonia>(new ModelEdmontonia(), "edmontoniamale.png", "edmontoniafemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHypacrosaurus.class, new PrehistoricRenderFactory<EntityHypacrosaurus>(new ModelHypacrosaurus(), "hypacrosaurusmale.png", "hypacrosaurusfemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPachyrhinosaurusCanadensis.class, new PrehistoricRenderFactory<EntityPachyrhinosaurusCanadensis>(new ModelPachyrhinosaurusCanadensis(), "pachyrhinosauruscanadensismale.png", "pachyrhinosauruscanadensisfemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPachyrhinosaurusLakustai.class, new PrehistoricRenderFactory<EntityPachyrhinosaurusLakustai>(new ModelPachyrhinosaurusLakustai(), "pachyrhinosauruslakustaimale.png", "pachyrhinosauruslakustaifemale.png", 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTroodon.class, new PrehistoricRenderFactory<EntityTroodon>(new ModelTroodon(), "troodonmale.png", "troodonfemale.png", 1.0F, 1.0F));
    }

    @Override
    public void onInit() {
        //3D Rendered Blocks
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLaptopBlock.class, new RenderLaptop());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPlesiosaurFossilBlock.class, new RenderPlesiosaurFossil());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIchthyosaurusFossilBlock.class, new RenderIchthyosaurusFossil());
    }

    @Override
    public void onPostInit() {

    }

    public void addItemRender(Item item, String name) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation("prehistoricraft:" + name));
    }
}