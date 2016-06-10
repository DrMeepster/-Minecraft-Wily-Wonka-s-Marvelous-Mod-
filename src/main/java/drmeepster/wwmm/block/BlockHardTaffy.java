package drmeepster.wwmm.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
/**
 * Yes, this is a modified clay block file.
 * @author DrMeepster
 *
 */
public class BlockHardTaffy extends Block
{
    public BlockHardTaffy()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setRegistryName("wwmm", "hard_taffy");
        this.setUnlocalizedName("hardtaffy");
        this.setStepSound(soundTypeStone);
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Items.clay_ball;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return 4;
    }
}