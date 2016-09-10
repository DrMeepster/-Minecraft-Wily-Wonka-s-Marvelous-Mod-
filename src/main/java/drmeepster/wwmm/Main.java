package drmeepster.wwmm;

import drmeepster.wwmm.block.BlockGroundCocoa;
import drmeepster.wwmm.block.BlockHardTaffy;
import drmeepster.wwmm.block.BlockHarderTaffy;
import drmeepster.wwmm.block.BlockSugarGrass;
import drmeepster.wwmm.proxy.ClientProxy;
import drmeepster.wwmm.utill.WonkaBlockList;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLStateEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main{
	
    public static final String MODID = "wwmm";
    public static final String VERSION = "0.0.2.0";
   
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event){
    	//Blocks
     	WonkaBlockList.Init();
     	//Items/ItemBlocks
     	ClientProxy.registerItemModels();
    }
    @EventHandler
    public void Init(FMLInitializationEvent event){
    	
    }
    
    @EventHandler
    public void PostInit(FMLPostInitializationEvent event){
    	
    }
}
    

