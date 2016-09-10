package drmeepster.wwmm.block;

import java.util.Random;

import drmeepster.wwmm.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockHardTaffy extends Block {
	public static final String NAME = "hard_taffy";
	public static final PropertyInteger META = PropertyInteger.create(NAME, 0, 1);
	public static final ResourceLocation RESLOC = new ResourceLocation(Main.MODID, NAME);
	public ItemBlock itemForm;
    public BlockHardTaffy(){
        super(Material.ROCK);
        this.setRegistryName(RESLOC);
        
        itemForm = new ItemBlock(this);
        itemForm.setRegistryName(RESLOC);
        
        GameRegistry.register(itemForm);
        GameRegistry.register(this);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setUnlocalizedName(NAME);
    }   
}