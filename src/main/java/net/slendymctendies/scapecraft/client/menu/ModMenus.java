package net.slendymctendies.scapecraft.client.menu;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.slendymctendies.scapecraft.ScapeCraft;

public class ModMenus {
    public static final DeferredRegister<MenuType<?>> MOD_MENUS = DeferredRegister.create(BuiltInRegistries.MENU, ScapeCraft.MOD_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<SkillMenu>> SKILL_MENU =
            registerMenuType("skill_menu", SkillMenu::new);



    private static <T extends AbstractContainerMenu> DeferredHolder<MenuType<?>, MenuType<T>> registerMenuType(String menuName, IContainerFactory<T> factory) {
        return MOD_MENUS.register(menuName, () -> IMenuTypeExtension.create(factory));
    }

    public static void register(IEventBus eventBus){
        MOD_MENUS.register(eventBus);
    }
}
