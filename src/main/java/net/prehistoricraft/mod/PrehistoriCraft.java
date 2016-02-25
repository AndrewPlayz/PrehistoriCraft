package net.prehistoricraft.mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.prehistoricraft.mod.blocks.BlockAluminium;
import net.prehistoricraft.mod.blocks.BlockAluminiumOre;
import net.prehistoricraft.mod.blocks.BlockChronosite;
import net.prehistoricraft.mod.blocks.BlockChronositeOre;
import net.prehistoricraft.mod.blocks.BlockLaptop;
import net.prehistoricraft.mod.blocks.BlockVolcanic;
import net.prehistoricraft.mod.entity.EntityFAcrocanthosaurus;
import net.prehistoricraft.mod.entity.EntityFElasmotherium;
import net.prehistoricraft.mod.entity.EntityFHyena;
import net.prehistoricraft.mod.entity.EntityFTenontosaurus;
import net.prehistoricraft.mod.entity.EntityFTitanoceratops;
import net.prehistoricraft.mod.entity.EntityMAcrocanthosaurus;
import net.prehistoricraft.mod.entity.EntityMElasmotherium;
import net.prehistoricraft.mod.entity.EntityMHyena;
import net.prehistoricraft.mod.entity.EntityMTenontosaurus;
import net.prehistoricraft.mod.entity.EntityMTitanoceratops;
import net.prehistoricraft.mod.entityhandler.EntityHandlerAcrocanthosaurus;
import net.prehistoricraft.mod.entityhandler.EntityHandlerElasmotherium;
import net.prehistoricraft.mod.entityhandler.EntityHandlerHyena;
import net.prehistoricraft.mod.entityhandler.EntityHandlerTenontosaurus;
import net.prehistoricraft.mod.entityhandler.EntityHandlerTitanoceratops;
import net.prehistoricraft.mod.items.ItemAluminiumIngot;
import net.prehistoricraft.mod.items.ItemChronositeDust;
import net.prehistoricraft.mod.items.ItemTreeTinder;
import net.prehistoricraft.mod.proxy.CommonProxy;

@Mod(modid = PrehistoriCraft.modid, dependencies = "required-after:llibrary@[0.7.2,)", version = PrehistoriCraft.version)

public class PrehistoriCraft {

	//PrehistoriCraft Main IDs
	public static final String modid = "PrehistoriCraft";
	public static final String version = "v0.1.0";
	
	@Instance(modid)
	public static PrehistoriCraft Instance;
	
	//PrehistoriCraft WorldGen
	PrehistoriCraftWorldGen eventWorldGen = new PrehistoriCraftWorldGen();
	
	//PrehistoriCraft Items
	public static Item itemAluminiumIngot;
	public static Item itemChronositeDust;
	public static Item itemTreeTinder;
	
	//PrehistoriCraft Blocks
	public static Block oreAluminiumOre;
	public static Block oreChronositeOre;
	public static Block blockAluminiumBlock;
	public static Block blockChronositeBlock;
	public static Block blockVolcanicAsh;
	public static Block blockVolcanicRock;
	public static Block blockVolcanicSoil;
	
	//PrehistoriCraft Block Models
	public static Block blockLaptop;
	public static Block blockLaptopActive;
	public static Block blockLaptopIdle;	
	
	//PrehistoriCraft Creative Tabs
	public static CreativeTabs prehistoricraftTab;
	public static CreativeTabs prehistoricraftQuaternaryTab;
	public static CreativeTabs prehistoricraftCretaceousTab;
	
	@SidedProxy(clientSide = "net.prehistoricraft.mod.proxy.ClientProxy", serverSide = "net.prehistoricraft.mod.proxy.CommonProxy")
	public static CommonProxy Proxy;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
		
		//PrehistoriCraft CreativeTabs
		prehistoricraftTab = new CreativeTabs("prehistoricraft"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(PrehistoriCraft.oreChronositeOre);
			}
		};
		prehistoricraftQuaternaryTab = new CreativeTabs("prehistoricraftquaternary"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(PrehistoriCraft.oreChronositeOre);
			}
		};
		prehistoricraftCretaceousTab = new CreativeTabs("prehistoricraftcretaceous"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(PrehistoriCraft.oreChronositeOre);
			}
		};
		
		//PrehistoriCraft Items
		itemAluminiumIngot = new ItemAluminiumIngot().setUnlocalizedName("ItemAluminiumIngot");
		GameRegistry.registerItem(itemAluminiumIngot, "ItemAluminiumIngot");
		itemChronositeDust = new ItemChronositeDust().setUnlocalizedName("ItemChronositeDust");
		GameRegistry.registerItem(itemChronositeDust, "ItemChronositeDust");
		itemTreeTinder = new ItemTreeTinder().setUnlocalizedName("ItemTreeTinder");
		GameRegistry.registerItem(itemTreeTinder, "ItemTreeTinder");
	
		//PrehistoriCraft Blocks
		oreAluminiumOre = new BlockAluminiumOre(Material.rock).setBlockName("BlockAluminiumOre");
		GameRegistry.registerBlock(oreAluminiumOre, "BlockAluminiumOre");
		oreChronositeOre = new BlockChronositeOre(Material.rock).setBlockName("BlockChronositeOre");
		GameRegistry.registerBlock(oreChronositeOre, "BlockChronositeOre");
		blockAluminiumBlock= new BlockAluminium(Material.iron).setBlockName("BlockAluminium");
		GameRegistry.registerBlock(blockAluminiumBlock, "BlockAluminium");
		blockChronositeBlock = new BlockChronosite(Material.iron).setBlockName("BlockChronosite");
		GameRegistry.registerBlock(blockChronositeBlock, "BlockChronosite");
		blockVolcanicAsh = new BlockVolcanic(Material.snow).setBlockName("BlockVolcanicAsh");
		GameRegistry.registerBlock(blockVolcanicAsh, "BlockVolcanicAsh");
		blockVolcanicRock = new BlockVolcanic(Material.rock).setBlockName("BlockVolcanicRock");
		GameRegistry.registerBlock(blockVolcanicRock, "BlockVolcanicRock");
		blockVolcanicSoil = new BlockVolcanic(Material.grass).setBlockName("BlockVolcanicSoil");
		GameRegistry.registerBlock(blockVolcanicSoil, "BlockVolcanicSoil");
		
		//PrehistoriCraft Mobs
		EntityHandlerHyena.registerMonsters(EntityMHyena.class, "MHyena");
		EntityHandlerHyena.registerMonsters(EntityFHyena.class, "FHyena");
		
		EntityHandlerElasmotherium.registerMonsters(EntityMElasmotherium.class, "MElasmotherium");
		EntityHandlerElasmotherium.registerMonsters(EntityFElasmotherium.class, "FElasmotherium");
		
		EntityHandlerAcrocanthosaurus.registerMonsters(EntityMAcrocanthosaurus.class, "MAcrocanthosaurus");
		EntityHandlerAcrocanthosaurus.registerMonsters(EntityFAcrocanthosaurus.class, "FAcrocanthosaurus");
		
		EntityHandlerTitanoceratops.registerMonsters(EntityMTitanoceratops.class, "MTitanoceratops");
		EntityHandlerTitanoceratops.registerMonsters(EntityFTitanoceratops.class, "FTitanoceratops");
		
		EntityHandlerTenontosaurus.registerMonsters(EntityMTenontosaurus.class, "MTenontosaurus");
		EntityHandlerTenontosaurus.registerMonsters(EntityFTenontosaurus.class, "FTenontosaurus");
		
		//PrehistoriCraft Block Models
		blockLaptop = new BlockLaptop(Material.anvil).setBlockName("LaptopBlock").setBlockTextureName("LaptopBlock.png");
		GameRegistry.registerBlock(blockLaptop, "LaptopBlock");
		Proxy.registerRender();
		
		//PrehistoriCraft WorldGen
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
		//PrehistoriCraft Smelting
		GameRegistry.addSmelting(oreAluminiumOre, new ItemStack(itemAluminiumIngot), 3);
		
		//PrehistoriCraft Crafting (Shaped)
		GameRegistry.addRecipe(new ItemStack(blockAluminiumBlock), new Object[]{"CCC", "CCC", "CCC", 'C', itemAluminiumIngot});
		GameRegistry.addRecipe(new ItemStack(blockChronositeBlock), new Object[]{"CCC", "CCC", "CCC", 'C', itemChronositeDust});
		
		//PrehistoriCraft Crafting (Shapeless)
		GameRegistry.addShapelessRecipe(new ItemStack(itemAluminiumIngot, 9), new Object[]{blockAluminiumBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(itemChronositeDust, 9), new Object[]{blockChronositeBlock});
		
		//Burnable Items/Blocks
		GameRegistry.registerFuelHandler(new FuelHandler());
		
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
}
