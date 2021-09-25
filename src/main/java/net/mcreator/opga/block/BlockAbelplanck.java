
package net.mcreator.opga.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.opga.creativetab.TabOPGA;
import net.mcreator.opga.ElementsOpgaMod;

@ElementsOpgaMod.ModElement.Tag
public class BlockAbelplanck extends ElementsOpgaMod.ModElement {
	@GameRegistry.ObjectHolder("opga:abelplanck")
	public static final Block block = null;
	public BlockAbelplanck(ElementsOpgaMod instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("abelplanck"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("opga:abelplanck", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.WOOD);
			setUnlocalizedName("abelplanck");
			setSoundType(SoundType.WOOD);
			setHarvestLevel("axe", 1);
			setHardness(20F);
			setResistance(15F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabOPGA.tab);
		}
	}
}
