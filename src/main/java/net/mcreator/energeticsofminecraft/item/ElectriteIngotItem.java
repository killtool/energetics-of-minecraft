
package net.mcreator.energeticsofminecraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ElectriteIngotItem extends Item {
	public ElectriteIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
