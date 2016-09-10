package drmeepster.wwmm.block;

import java.util.Random;

import drmeepster.wwmm.Main;
import drmeepster.wwmm.utill.WonkaBlockList;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockHarderTaffy extends Block {
	public static final String NAME = "harder_taffy";
	public static final ResourceLocation RESLOC = new ResourceLocation(Main.MODID, NAME);
	public ItemBlock itemForm;
    public BlockHarderTaffy()
    {
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