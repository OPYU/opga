
package net.mcreator.opga.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.opga.block.BlockOpeblock;
import net.mcreator.opga.ElementsOpgaMod;

@ElementsOpgaMod.ModElement.Tag
public class TabOPGA extends ElementsOpgaMod.ModElement {
	public TabOPGA(ElementsOpgaMod instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabopga") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockOpeblock.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
