package net.slendymctendies.scapecraft.util;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.slendymctendies.scapecraft.ScapeCraft;
import net.slendymctendies.scapecraft.item.ModItems;

public class ModItemProperties {
    //Usable for Charged items, such as the Scythe of Vitur, among other things
    public static void addCustomProperties() {
        ItemProperties.register(ModItems.RUNE_PICKAXE.get(), ResourceLocation.fromNamespaceAndPath(ScapeCraft.MOD_ID, "charged"),
                (itemStack, clientLevel, livingEntity, seed) -> livingEntity.getArmorValue() == 0 ? 1f : 0f);
    }
}
