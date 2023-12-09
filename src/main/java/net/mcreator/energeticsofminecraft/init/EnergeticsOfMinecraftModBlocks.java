
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.energeticsofminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.energeticsofminecraft.block.ThunderWoodBlock;
import net.mcreator.energeticsofminecraft.block.EnergeticLeavesBlock;
import net.mcreator.energeticsofminecraft.block.ElectritecraftingtableBlock;
import net.mcreator.energeticsofminecraft.block.ElectriteOreBlock;
import net.mcreator.energeticsofminecraft.block.ElectriteBlockBlock;
import net.mcreator.energeticsofminecraft.EnergeticsOfMinecraftMod;

public class EnergeticsOfMinecraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EnergeticsOfMinecraftMod.MODID);
	public static final RegistryObject<Block> THUNDER_WOOD = REGISTRY.register("thunder_wood", () -> new ThunderWoodBlock());
	public static final RegistryObject<Block> ENERGETIC_LEAVES = REGISTRY.register("energetic_leaves", () -> new EnergeticLeavesBlock());
	public static final RegistryObject<Block> ELECTRITE_ORE = REGISTRY.register("electrite_ore", () -> new ElectriteOreBlock());
	public static final RegistryObject<Block> ELECTRITE_BLOCK = REGISTRY.register("electrite_block", () -> new ElectriteBlockBlock());
	public static final RegistryObject<Block> ELECTRITECRAFTINGTABLE = REGISTRY.register("electritecraftingtable", () -> new ElectritecraftingtableBlock());
}
