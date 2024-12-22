package net.slendymctendies.scapecraft.client.menu;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.slendymctendies.scapecraft.client.ModKeybinds;
import org.jetbrains.annotations.Nullable;

public class SkillMenu extends AbstractContainerMenu{

    public SkillMenu(int containerId, Inventory playerInventory, RegistryFriendlyByteBuf extraData) {
        super(ModMenus.SKILL_MENU.get(), containerId);
    }

    public void onClientTick(ClientTickEvent.Post event, ServerPlayer serverPlayer) {
        while (ModKeybinds.MOD_KEYMAPPING.get().consumeClick()) {
            serverPlayer.openMenu(new SimpleMenuProvider(
                    (containerId, playerInventory, player) -> new SkillMenu(containerId, playerInventory, null),
                    Component.translatable("menu.skillmenu.scapecraft.skilloverview")
            ));
        }
    }

    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return false;
    }
}
