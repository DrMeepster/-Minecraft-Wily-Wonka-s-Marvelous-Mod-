package drmeepster.wwmm;

import drmeepster.wwmm.block.BlockHardTaffy;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
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
    public static Block hardTaffy;
   
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event){
    	//Blocks
    	hardTaffy = new BlockHardTaffy();
    }
    @EventHandler
    public void Init(FMLInitializationEvent event){
    	
        if(event.getSide() == Side.CLIENT){
        	
        	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
     		String baseLocation = "wwmm:";
     		



    		renderItem
    		.getItemModelMesher()
    		.register(Item.getItemFromBlock(hardTaffy), 
    		0, 
    		new ModelResourceLocation
    		("wwmm:hard_taffy", "inventory"));
    		
    		
    	
        }
    }
}
    

