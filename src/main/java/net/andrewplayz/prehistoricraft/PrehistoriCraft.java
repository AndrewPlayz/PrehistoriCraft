package net.andrewplayz.prehistoricraft;

import net.andrewplayz.prehistoricraft.client.gui.GUIHandler;
import net.andrewplayz.prehistoricraft.server.ServerProxy;
import net.andrewplayz.prehistoricraft.server.core.*;
import net.andrewplayz.prehistoricraft.server.world.PhCWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = PrehistoriCraft.MODID, name = "PrehistoriCraft", version = PrehistoriCraft.VERSION, dependencies = "required-after:llibrary@[" + PrehistoriCraft.LLIBRARY_VERSION + ",)")
public class PrehistoriCraft {
    public static final String MODID = "prehistoricraft";
    public static final String VERSION = "0.2.0";
    public static final String LLIBRARY_VERSION = "1.4.2";

    @Mod.Instance(MODID)
    public static PrehistoriCraft INSTANCE;

    @SidedProxy(serverSide = "net.andrewplayz.prehistoricraft.server.ServerProxy", clientSide = "net.andrewplayz.prehistoricraft.client.ClientProxy")
    public static ServerProxy PROXY;

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        PROXY.onPreInit();
        PhCCreativeTabs.init();
        PhCItems.init();
        PhCBlocks.init();
        PhCRecipes.init();
        PhCEntities.init();
    }

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        PROXY.onInit();
        GameRegistry.registerWorldGenerator(new PhCWorldGen(), 0);
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GUIHandler());
    }

    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event) {
        PROXY.onPostInit();
    }
}