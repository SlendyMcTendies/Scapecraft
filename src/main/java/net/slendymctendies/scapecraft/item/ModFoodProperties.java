package net.slendymctendies.scapecraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.slendymctendies.scapecraft.effects.ModEffects;

public class ModFoodProperties {
    //static float dynamicAmplifier = Math.floor(playerHitpointsLevel * 0.23);
    public static final FoodProperties ANGLERFISH = new FoodProperties.Builder().nutrition(16).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200, 1), 1.0f)
            .effect(() -> new MobEffectInstance(ModEffects.HEAL_EFFECT, 1, 22), 1.0f)
            .build();

    public static final FoodProperties RAW_ANGLERFISH = new FoodProperties.Builder().nutrition(5).saturationModifier(0.25f).build();

    public static final FoodProperties MANTA_RAY = new FoodProperties.Builder().nutrition(12).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(ModEffects.HEAL_EFFECT, 1, 22), 1.0f)
            .build();

    public static final FoodProperties RAW_MANTA_RAY = new FoodProperties.Builder().nutrition(4).saturationModifier(0.25f).build();
}
