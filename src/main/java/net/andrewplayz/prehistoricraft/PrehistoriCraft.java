package net.andrewplayz.prehistoricraft;

import net.andrewplayz.prehistoricraft.server.ServerProxy;
import net.andrewplayz.prehistoricraft.server.block.PhCBlockRegistry;
import net.andrewplayz.prehistoricraft.server.content.ContentHelper;
import net.andrewplayz.prehistoricraft.server.creativetab.PhCCreativeTabs;
import net.andrewplayz.prehistoricraft.server.entity.PhCEntityRegistry;
import net.andrewplayz.prehistoricraft.server.item.PhCItemRegistry;
import net.andrewplayz.prehistoricraft.server.recipe.PhCRecipes;
import net.andrewplayz.prehistoricraft.server.world.PrehistoriCraftWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = PrehistoriCraft.MODID, name = "PrehistoriCraft", version = PrehistoriCraft.VERSION, dependencies = "required-after:llibrary@[" + PrehistoriCraft.LLIBRARY_VERSION + ",)")
public class PrehistoriCraft {
    public static final String MODID = "prehistoricraft";
    public static final String VERSION = "0.1.1";
    public static final String LLIBRARY_VERSION = "1.3.0";

    @Mod.Instance(MODID)
    public static PrehistoriCraft instance;
    @SidedProxy(serverSide = "net.andrewplayz.prehistoricraft.server.ServerProxy", clientSide = "net.andrewplayz.prehistoricraft.client.ClientProxy")
    public static ServerProxy proxy;

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        ContentHelper.init(new PhCCreativeTabs(), new PhCItemRegistry(), new PhCBlockRegistry(), new PhCRecipes(), new PhCEntityRegistry());
        proxy.onPreInit();
    }

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new PrehistoriCraftWorldGen(), 0);
        proxy.onInit();
    }

    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event) {
        proxy.onPostInit();
    }
}
