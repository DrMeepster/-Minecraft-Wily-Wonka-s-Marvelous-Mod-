package drmeepster.wwmm.proxy;

import drmeepster.wwmm.block.BlockGroundCocoa;
import drmeepster.wwmm.block.BlockHardTaffy;
import drmeepster.wwmm.block.BlockHarderTaffy;
import drmeepster.wwmm.block.BlockSugarGrass;
import drmeepster.wwmm.utill.WonkaBlockList;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy {
	public static void registerItemModels(){
		ModelLoader.setCustomModelResourceLocation(WonkaBlockList.hardTaffy.itemForm, 0, new ModelResourceLocation(BlockHardTaffy.RESLOC, "inventory"));
    	ModelLoader.setCustomModelResourceLocation(WonkaBlockList.groundCocoa.itemForm, 0, new ModelResourceLocation(BlockGroundCocoa.RESLOC, ""));
    	ModelLoader.setCustomModelResourceLocation(WonkaBlockList.sugarGrass.itemForm, 0, new ModelResourceLocation(BlockSugarGrass.RESLOC, ""));
    	ModelLoader.setCustomModelResourceLocation(WonkaBlockList.harderTaffy.itemForm, 0, new ModelResourceLocation(BlockHarderTaffy.RESLOC, ""));
	}
}
