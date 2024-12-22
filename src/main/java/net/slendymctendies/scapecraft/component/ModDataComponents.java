package net.slendymctendies.scapecraft.component;

import net.minecraft.core.component.DataComponentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.slendymctendies.scapecraft.ScapeCraft;

public class ModDataComponents {
    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_TYPES =
            DeferredRegister.createDataComponents(ScapeCraft.MOD_ID);
}
