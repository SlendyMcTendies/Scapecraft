package net.slendymctendies.scapecraft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.slendymctendies.scapecraft.ScapeCraft;
import net.slendymctendies.scapecraft.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScapeCraft.MOD_ID);

    //TODO: Change Icons to Skill Icons. Create dummy items with skill icons??
    public static final Supplier<CreativeModeTab> SCAPECRAFT_SMITHING_TAB = CREATIVE_MODE_TAB.register("scapecraft_smithing_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SMITHING_ICON.get()))
                    .title(Component.translatable("creativetab.scapecraft.scapecraft_smithing"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SMITHING_ICON);
                        output.accept(ModItems.RUNITE_INGOT);
                        output.accept(ModItems.RAW_RUNITE);
                        output.accept(ModBlocks.RUNITE_BLOCK);
                        output.accept(ModBlocks.RUNITE_ORE);

                        output.accept(ModItems.RUNE_AXE);
                        output.accept(ModItems.RUNE_PICKAXE);
                        output.accept(ModItems.RUNE_SHOVEL);
                        output.accept(ModItems.RUNE_HOE);
                        output.accept(ModItems.RUNE_SWORD);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
