package net.mcreator.opga.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.opga.ElementsOPGA;

@ElementsOPGA.ModElement.Tag
public class ProcedureFddEatend extends ElementsOPGA.ModElement {
	public ProcedureFddEatend(ElementsOPGA instance) {
		super(instance, 57);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FddEatend!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 180, (int) 5, (false), (false)));
	}
}
