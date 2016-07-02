package drmeepster.wwmm;

import drmeepster.wwmm.block.BlockGroundCocoa;
import drmeepster.wwmm.block.BlockHardTaffy;
import drmeepster.wwmm.block.BlockSugarGrass;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main{
	
    public static final String MODID = "wwmm";
    public static final String VERSION = "0.0.2.0";
    public static Block blockHardTaffy;
    public static Block blockGroundCocoa;
    public static Block blockSugarGrass;
   
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event){
    	//Blocks
    	blockHardTaffy = new BlockHardTaffy();
    	blockGroundCocoa = new BlockGroundCocoa();
    	blockSugarGrass = new BlockSugarGrass();
    }
    @EventHandler
    public void Init(FMLInitializationEvent event){
    	
        if(event.getSide() == Side.CLIENT){
        	
        	ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
     		String baseLocation = "wwmm:";

    		itemModelMesher.register(Item.getItemFromBlock(blockHardTaffy), 0, new ModelResourceLocation(baseLocation + BlockHardTaffy.getName(), "inventory"));
    		itemModelMesher.register(Item.getItemFromBlock(blockGroundCocoa), 0, new ModelResourceLocation(baseLocation + BlockGroundCocoa.getName(), "inventory"));
    		
    	
        }
    }
    
    @EventHandler
    public void PostInit(FMLPostInitializationEvent event){
    	//TODO: Create TE Grinder recipe for Ground Dirt
    }
}
    

