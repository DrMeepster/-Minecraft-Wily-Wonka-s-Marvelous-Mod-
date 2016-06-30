package drmeepster.wwmm;

import drmeepster.wwmm.block.BlockHardTaffy;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = WWMM_Main.MODID, version = WWMM_Main.VERSION)
public class WWMM_Main{
	
    public static final String MODID = "WWMM";
    public static final String VERSION = "0.0.1.1";
    public static Block HardTaffy = new BlockHardTaffy();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	GameRegistry.registerBlock(HardTaffy);
    }
    
    @EventHandler
    public void Init(FMLPreInitializationEvent event){ 

    }
}

