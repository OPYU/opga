package net.mcreator.opga.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.opga.ElementsOPGA;

@ElementsOPGA.ModElement.Tag
public class ProcedurePlatcurryFoodEaten extends ElementsOPGA.ModElement {
	public ProcedurePlatcurryFoodEaten(ElementsOPGA instance) {
		super(instance, 25);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PlatcurryFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HASTE, (int) 2400, (int) 1));
	}
}
