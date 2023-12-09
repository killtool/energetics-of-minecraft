
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.energeticsofminecraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.energeticsofminecraft.client.gui.FourbyfourcraftingtableScreen;
import net.mcreator.energeticsofminecraft.client.gui.FivebyfivecraftintableScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EnergeticsOfMinecraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(EnergeticsOfMinecraftModMenus.FIVEBYFIVECRAFTINTABLE.get(), FivebyfivecraftintableScreen::new);
			MenuScreens.register(EnergeticsOfMinecraftModMenus.FOURBYFOURCRAFTINGTABLE.get(), FourbyfourcraftingtableScreen::new);
		});
	}
}
