package net.andrewplayz.prehistoricraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.andrewplayz.prehistoricraft.server.ServerProxy;
import net.andrewplayz.prehistoricraft.server.block.PhCBlockRegistry;
import net.andrewplayz.prehistoricraft.server.creativetab.PhCCreativeTabs;
import net.andrewplayz.prehistoricraft.server.entity.PhCEntityRegistry;
import net.andrewplayz.prehistoricraft.server.item.PhCItemRegistry;
import net.andrewplayz.prehistoricraft.server.recipe.PhCRecipes;
import net.andrewplayz.prehistoricraft.server.world.PrehistoriCraftWorldGen;
import net.ilexiconn.llibrary.common.content.ContentHelper;

@Mod(modid = PrehistoriCraft.MODID, name = "PrehistoriCraft", version = PrehistoriCraft.VERSION, dependencies = "required-after:llibrary@[" + PrehistoriCraft.LLIBRARY_VERSION + ",)")
public class PrehistoriCraft {
    public static final String MODID = "prehistoricraft";
    public static final String VERSION = "0.1.0";
    public static final String LLIBRARY_VERSION = "0.7.2";

    @Instance(MODID)
    public static PrehistoriCraft instance;
    @SidedProxy(serverSide = "net.andrewplayz.prehistoricraft.server.ServerProxy", clientSide = "net.andrewplayz.prehistoricraft.client.ClientProxy")
    public static ServerProxy proxy;

    @EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        ContentHelper.init(new PhCCreativeTabs(), new PhCItemRegistry(), new PhCBlockRegistry(), new PhCRecipes(), new PhCEntityRegistry());
        proxy.onPreInit();
    }

    @EventHandler
    public void onInit(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new PrehistoriCraftWorldGen(), 0);
        proxy.onInit();
    }

    @EventHandler
    public void onPostInit(FMLPostInitializationEvent event) {
        proxy.onPostInit();
    }
}
