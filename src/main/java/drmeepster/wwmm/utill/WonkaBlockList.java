package drmeepster.wwmm.utill;

import drmeepster.wwmm.Main;
import drmeepster.wwmm.block.*;
import net.minecraft.block.Block;

public class WonkaBlockList {
	public static BlockHardTaffy hardTaffy;
	public static BlockGroundCocoa groundCocoa;
	public static BlockSugarGrass sugarGrass;
	public static BlockHarderTaffy harderTaffy;
	public static Block[] blockList = {hardTaffy, groundCocoa, sugarGrass, harderTaffy};
	
	public static void Init(){
		
	  	hardTaffy = new BlockHardTaffy();
    	groundCocoa = new BlockGroundCocoa();
    	sugarGrass = new BlockSugarGrass();
    	harderTaffy = new BlockHarderTaffy();
	}
}
