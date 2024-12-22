package net.slendymctendies.scapecraft.events;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.slendymctendies.scapecraft.ScapeCraft;
import net.slendymctendies.scapecraft.util.ModTags;

@EventBusSubscriber(modid = ScapeCraft.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void onSmeltingEvent(PlayerEvent.ItemSmeltedEvent smeltingEvent) {
        if(smeltingEvent.getSmelting().is(ModTags.Items.SMITHING_SKILL_ITEMS)) {
            ResourceLocation resourceLocation = ResourceLocation.withDefaultNamespace("scapecraft.smithing_xp");
            new AttributeModifier(resourceLocation, 60, AttributeModifier.Operation.ADD_VALUE);
        }
    }
}
