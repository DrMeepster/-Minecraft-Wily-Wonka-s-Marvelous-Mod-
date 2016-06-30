package drmeepster.wwmm.block;

import java.util.Random;

import drmeepster.wwmm.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockHardTaffy extends Block {
	private static final String name = "hard_taffy";
    public BlockHardTaffy()
    {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setUnlocalizedName("hard_taffy");
        this.setStepSound(soundTypeStone);
    }
    public static String getName(){
    	return name;
    }
}