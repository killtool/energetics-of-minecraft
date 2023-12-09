
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.energeticsofminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.energeticsofminecraft.block.entity.ElectritecraftingtableBlockEntity;
import net.mcreator.energeticsofminecraft.EnergeticsOfMinecraftMod;

public class EnergeticsOfMinecraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, EnergeticsOfMinecraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ELECTRITECRAFTINGTABLE = register("electritecraftingtable", EnergeticsOfMinecraftModBlocks.ELECTRITECRAFTINGTABLE, ElectritecraftingtableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
