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
       }

    @Override
    public void onPostInit() {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.oreAluminiumOre), 0, new ModelResourceLocation("prehistoricraft:blockaluminiumore", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.oreChronositeOre), 0, new ModelResourceLocation("prehistoricraft:blockchronositeore", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockAluminiumBlock), 0, new ModelResourceLocation("prehistoricraft:blockaluminiumblock", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockChronositeBlock), 0, new ModelResourceLocation("prehistoricraft:blockchronositeblock", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockVolcanicAsh), 0, new ModelResourceLocation("prehistoricraft:blockvolcanicash", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockVolcanicRock), 0, new ModelResourceLocation("prehistoricraft:blockvolcanicrock", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockVolcanicSoil), 0, new ModelResourceLocation("prehistoricraft:blockvolcanicsoil", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockLaptop), 0, new ModelResourceLocation("prehistoricraft:blocklaptop", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockLaptop), 0, new ModelResourceLocation("prehistoricraft:blocklaptop", "inventory"));Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockLaptop), 0, new ModelResourceLocation("prehistoricraft:blocklaptop", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockLaptop), 0, new ModelResourceLocation("prehistoricraft:blocklaptop", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(PhCBlockRegistry.blockLaptop), 0, new ModelResourceLocation("prehistoricraft:blocklaptop", "inventory"));
    }
}
