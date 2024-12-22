package net.slendymctendies.scapecraft.client;

import net.minecraft.client.KeyMapping;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.common.util.Lazy;

public class ModKeybinds {
    public static final Lazy<KeyMapping> MOD_KEYMAPPING = Lazy.of(() -> {
        return null;
    });

    @SubscribeEvent
    public void registerBindings(RegisterKeyMappingsEvent event) {
        event.register(MOD_KEYMAPPING.get());
    }
}
