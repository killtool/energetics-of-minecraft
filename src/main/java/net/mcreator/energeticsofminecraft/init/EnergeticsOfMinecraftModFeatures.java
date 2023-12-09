
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.energeticsofminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.energeticsofminecraft.world.features.ores.ElectriteOreFeature;
import net.mcreator.energeticsofminecraft.EnergeticsOfMinecraftMod;

@Mod.EventBusSubscriber
public class EnergeticsOfMinecraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EnergeticsOfMinecraftMod.MODID);
	public static final RegistryObject<Feature<?>> ELECTRITE_ORE = REGISTRY.register("electrite_ore", ElectriteOreFeature::new);
}
