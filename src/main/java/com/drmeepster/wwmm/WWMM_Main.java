package com.drmeepster.wwmm;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.drmeepster.wwmm.block.HardTaffy;

@Mod(modid = WWMM_Main.MODID, version = WWMM_Main.VERSION)
public class WWMM_Main{
	
    public static final String MODID = "WWMM";
    public static final String VERSION = "Alpha Build 1";
    public static Block HardTaffy = new HardTaffy();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	GameRegistry.registerBlock(HardTaffy);
    }
    
    @EventHandler
    public void Init(FMLPreInitializationEvent event){ 

    }
}

