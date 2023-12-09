
package net.mcreator.energeticsofminecraft.world.features.treedecorators;

import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.core.BlockPos;

import net.mcreator.energeticsofminecraft.init.EnergeticsOfMinecraftModBlocks;

import com.mojang.serialization.Codec;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThunderStruckForestLeaveDecorator extends LeaveVineDecorator {
	public static Codec<LeaveVineDecorator> CODEC = Codec.unit(ThunderStruckForestLeaveDecorator::new);
	public static TreeDecoratorType<?> DECORATOR_TYPE = new TreeDecoratorType<>(CODEC);

	@SubscribeEvent
	public static void registerPointOfInterest(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.TREE_DECORATOR_TYPES, registerHelper -> registerHelper.register("thunder_struck_forest_tree_leave_decorator", DECORATOR_TYPE));
	}

	public ThunderStruckForestLeaveDecorator() {
		super(0.25f);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return DECORATOR_TYPE;
	}

	@Override
	public void place(TreeDecorator.Context context) {
		context.leaves().forEach((blockpos) -> {
			if (context.random().nextFloat() < 0.25f) {
				BlockPos pos = blockpos.west();
				if (context.isAir(pos)) {
					addVine(pos, context);
				}
			}
			if (context.random().nextFloat() < 0.25f) {
				BlockPos pos = blockpos.east();
				if (context.isAir(pos)) {
					addVine(pos, context);
				}
			}
			if (context.random().nextFloat() < 0.25f) {
				BlockPos pos = blockpos.north();
				if (context.isAir(pos)) {
					addVine(pos, context);
				}
			}
			if (context.random().nextFloat() < 0.25f) {
				BlockPos pos = blockpos.south();
				if (context.isAir(pos)) {
					addVine(pos, context);
				}
			}
		});
	}

	private static void addVine(BlockPos pos, TreeDecorator.Context context) {
		context.setBlock(pos, EnergeticsOfMinecraftModBlocks.ENERGETIC_LEAVES.get().defaultBlockState());
		int i = 4;
		for (BlockPos blockpos = pos.below(); context.isAir(blockpos) && i > 0; --i) {
			context.setBlock(blockpos, EnergeticsOfMinecraftModBlocks.ENERGETIC_LEAVES.get().defaultBlockState());
			blockpos = blockpos.below();
		}
	}
}
