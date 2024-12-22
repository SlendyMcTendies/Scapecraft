package net.slendymctendies.scapecraft.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.slendymctendies.scapecraft.util.ModTags;

public class ModToolTiers {
    public static final Tier RUNE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_RUNE_TOOL, 1750, 8.5f, 4.0f, 12,
            () -> Ingredient.of(ModItems.RUNITE_INGOT));
    public static final Tier ADAMANT = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ADAMANT_TOOL, 1231, 7.5f, 3.0f, 13,
            () -> Ingredient.of(ModItems.ADAMANTITE_INGOT));
    public static final Tier MITHRIL = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_MITHRIL_TOOL, 904, 7f, 2.0f, 12,
            () -> Ingredient.of(ModItems.MITHRIL_INGOT));
    public static final Tier STEEL = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL, 577, 6.5f, 2.0f, 13,
            () -> Ingredient.of(ModItems.STEEL_INGOT));
    public static final Tier BRONZE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL, 191, 5f, 1.0f, 8,
            () -> Ingredient.of(ModItems.BRONZE_INGOT));
}
