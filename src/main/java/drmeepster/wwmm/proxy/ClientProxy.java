package drmeepster.wwmm.proxy;

import com.sun.istack.internal.Nullable;

import drmeepster.wwmm.block.BlockGroundCocoa;
import drmeepster.wwmm.block.BlockHardTaffy;
import drmeepster.wwmm.block.BlockHarderTaffy;
import drmeepster.wwmm.block.BlockSugarGrass;
import drmeepster.wwmm.utill.WonkaBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy {
	public static void registerItemModels(){
		ModelLoader.setCustomModelResourceLocation(WonkaBlocks.hardTaffy.itemForm, 0, new ModelResourceLocation(BlockHardTaffy.RESLOC, "inventory"));
    	ModelLoader.setCustomModelResourceLocation(WonkaBlocks.groundCocoa.itemForm, 0, new ModelResourceLocation(BlockGroundCocoa.RESLOC, ""));
    	ModelLoader.setCustomModelResourceLocation(WonkaBlocks.sugarGrass.itemForm, 0, new ModelResourceLocation(BlockSugarGrass.RESLOC, ""));
    	ModelLoader.setCustomModelResourceLocation(WonkaBlocks.harderTaffy.itemForm, 0, new ModelResourceLocation(BlockHarderTaffy.RESLOC, ""));
	}
	
    public static void regColours(){
        FMLClientHandler.instance().getClient().getBlockColors().registerBlockColorHandler(new IBlockColor(){
            public int colorMultiplier(IBlockState state, @Nullable IBlockAccess worldIn, @Nullable BlockPos pos, int tintIndex){
                return worldIn != null && pos != null ? BiomeColorHelper.getGrassColorAtPos(worldIn, pos) : ColorizerGrass.getGrassColor(0.5D, 1.0D);
            }
        }, new Block[] {WonkaBlocks.sugarGrass});
        FMLClientHandler.instance().getClient().getItemColors().registerItemColorHandler(new IItemColor(){
            public int getColorFromItemstack(ItemStack stack, int tintIndex){
                return ColorizerGrass.getGrassColor(0.5D, 1.0D);
            }
        }, new Block[] {WonkaBlocks.sugarGrass});
    }
}
