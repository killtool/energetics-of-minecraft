
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.energeticsofminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.energeticsofminecraft.world.inventory.FourbyfourcraftingtableMenu;
import net.mcreator.energeticsofminecraft.world.inventory.FivebyfivecraftintableMenu;
import net.mcreator.energeticsofminecraft.EnergeticsOfMinecraftMod;

public class EnergeticsOfMinecraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EnergeticsOfMinecraftMod.MODID);
	public static final RegistryObject<MenuType<FivebyfivecraftintableMenu>> FIVEBYFIVECRAFTINTABLE = REGISTRY.register("fivebyfivecraftintable", () -> IForgeMenuType.create(FivebyfivecraftintableMenu::new));
	public static final RegistryObject<MenuType<FourbyfourcraftingtableMenu>> FOURBYFOURCRAFTINGTABLE = REGISTRY.register("fourbyfourcraftingtable", () -> IForgeMenuType.create(FourbyfourcraftingtableMenu::new));
}
