package drmeepster.wwmm.block;

import java.util.Random;

import drmeepster.wwmm.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockGroundCocoa extends Block {
	public static final String NAME = "cocoa_grounds";
	public static final ResourceLocation RESLOC = new ResourceLocation(Main.MODID, NAME);
	public ItemBlock itemForm;
    public BlockGroundCocoa()
    {
        super(Material.GROUND);
        this.setRegistryName(RESLOC);
        
        itemForm = new ItemBlock(this);
        itemForm.setRegistryName(RESLOC);
        
        GameRegistry.register(itemForm);
        GameRegistry.register(this);
        this.setSoundType(SoundType.GROUND);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setUnlocalizedName(NAME);
    }
}

