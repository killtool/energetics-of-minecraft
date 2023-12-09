
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.energeticsofminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.energeticsofminecraft.item.ElectriteIngotItem;
import net.mcreator.energeticsofminecraft.EnergeticsOfMinecraftMod;

public class EnergeticsOfMinecraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EnergeticsOfMinecraftMod.MODID);
	public static final RegistryObject<Item> THUNDER_WOOD = block(EnergeticsOfMinecraftModBlocks.THUNDER_WOOD);
	public static final RegistryObject<Item> ENERGETIC_LEAVES = block(EnergeticsOfMinecraftModBlocks.ENERGETIC_LEAVES);
	public static final RegistryObject<Item> ELECTRITE_ORE = block(EnergeticsOfMinecraftModBlocks.ELECTRITE_ORE);
	public static final RegistryObject<Item> ELECTRITE_INGOT = REGISTRY.register("electrite_ingot", () -> new ElectriteIngotItem());
	public static final RegistryObject<Item> ELECTRITE_BLOCK = block(EnergeticsOfMinecraftModBlocks.ELECTRITE_BLOCK);
	public static final RegistryObject<Item> ELECTRITECRAFTINGTABLE = block(EnergeticsOfMinecraftModBlocks.ELECTRITECRAFTINGTABLE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
