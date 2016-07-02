package drmeepster.wwmm.block;

import java.util.Random;
import drmeepster.wwmm.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockSugarGrass extends BlockGrass implements IGrowable{
	
	private static final String name = "sugar_grass";
    public BlockSugarGrass()
    {
        super();
        GameRegistry.registerBlock(this, name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setUnlocalizedName(name);
        this.setStepSound(Block.soundTypeGravel);
    }
    public static String getName(){
    	return name;
    }
    
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            if (worldIn.getLightFromNeighbors(pos.up()) < 4 && worldIn.getBlockState(pos.up()).getBlock().getLightOpacity(worldIn, pos.up()) > 2)
            {
                worldIn.setBlockState(pos, Main.blockGroundCocoa.getDefaultState());
            }
            else
            {
                if (worldIn.getLightFromNeighbors(pos.up()) >= 9)
                {
                    for (int i = 0; i < 4; ++i)
                    {
                        BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);
                        Block block = worldIn.getBlockState(blockpos.up()).getBlock();
                        IBlockState iblockstate = worldIn.getBlockState(blockpos);

                        if (iblockstate.getBlock() == Main.blockGroundCocoa && worldIn.getLightFromNeighbors(blockpos.up()) >= 4 && block.getLightOpacity(worldIn, blockpos.up()) <= 2)
                        {
                            worldIn.setBlockState(blockpos, Main.blockSugarGrass.getDefaultState());
                        }
                    }
                }
            }
        }
    }
}

