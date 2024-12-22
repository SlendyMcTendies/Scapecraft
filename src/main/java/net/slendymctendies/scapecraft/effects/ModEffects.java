package net.slendymctendies.scapecraft.effects;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.slendymctendies.scapecraft.ScapeCraft;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, ScapeCraft.MOD_ID);

    public static final Holder<MobEffect> HEAL_EFFECT = MOB_EFFECTS.register("heal_effect",
            () -> new HealEffect(MobEffectCategory.BENEFICIAL, 0));

    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}
