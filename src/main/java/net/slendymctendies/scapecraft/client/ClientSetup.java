package net.slendymctendies.scapecraft.client;

import net.minecraft.client.KeyMapping;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.slendymctendies.scapecraft.ScapeCraft;
import net.slendymctendies.scapecraft.datagen.ModLangProvider;
import org.lwjgl.glfw.GLFW;

@EventBusSubscriber(modid = ScapeCraft.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    //Need to figure out how to get the menu to actually open. Key is registered? Menu and screen are registered?

    public static final KeyMapping OPEN_SKILL_OVERVIEW = new KeyMapping(ModLangProvider.OPEN_SKILL_OVERVIEW.key(), GLFW.GLFW_KEY_K, ModLangProvider.KEYBIND_CATEGORY.key());

    @SubscribeEvent
    public static void init(RegisterKeyMappingsEvent event) {
        event.register(OPEN_SKILL_OVERVIEW);
    }
}
