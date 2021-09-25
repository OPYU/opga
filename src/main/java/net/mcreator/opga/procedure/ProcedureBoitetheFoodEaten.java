package net.mcreator.opga.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.opga.ElementsOPGA;

@ElementsOPGA.ModElement.Tag
public class ProcedureBoitetheFoodEaten extends ElementsOPGA.ModElement {
	public ProcedureBoitetheFoodEaten(ElementsOPGA instance) {
		super(instance, 26);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BoitetheFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 360, (int) 1));
	}
}
