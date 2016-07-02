package drmeepster.wwmm.block;

import java.util.Random;

import drmeepster.wwmm.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockGroundCocoa extends Block {
	
	private static final String name = "cocoa_grounds";
    public BlockGroundCocoa()
    {
        super(Material.ground);
        GameRegistry.registerBlock(this, name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setUnlocalizedName(name);
        this.setStepSound(Block.soundTypeGravel);
    }
    public static String getName(){
    	return name;
    }
    
    
}

