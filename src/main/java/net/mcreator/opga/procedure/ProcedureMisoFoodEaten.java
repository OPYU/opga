package net.mcreator.opga.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.opga.ElementsOpgaMod;

@ElementsOpgaMod.ModElement.Tag
public class ProcedureMisoFoodEaten extends ElementsOpgaMod.ModElement {
	public ProcedureMisoFoodEaten(ElementsOpgaMod instance) {
		super(instance, 27);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MisoFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 1200, (int) 0));
	}
}
