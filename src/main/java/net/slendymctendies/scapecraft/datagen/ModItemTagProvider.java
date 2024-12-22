package net.slendymctendies.scapecraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.slendymctendies.scapecraft.ScapeCraft;
import net.slendymctendies.scapecraft.item.ModItems;
import net.slendymctendies.scapecraft.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, ScapeCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.SMITHING_SKILL_ITEMS)
                .add(ModItems.RUNITE_INGOT.get())
                .add(ModItems.RAW_RUNITE.get())
                .add(ModItems.RUNE_SWORD.get())
                .add(ModItems.RUNE_SHOVEL.get())
                .add(ModItems.RUNE_PICKAXE.get())
                .add(ModItems.RUNE_AXE.get())
                .add(ModItems.RUNE_HOE.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.RUNE_SWORD.get())
                .add(ModItems.ADAMANT_SWORD.get())
                .add(ModItems.MITHRIL_SWORD.get())
                .add(ModItems.STEEL_SWORD.get())
                .add(ModItems.BRONZE_SWORD.get());

        tag(ItemTags.PICKAXES)
                .add(ModItems.RUNE_PICKAXE.get());

        tag(ItemTags.AXES)
                .add(ModItems.RUNE_AXE.get());

        tag(ItemTags.HOES)
                .add(ModItems.RUNE_HOE.get());

        tag(ItemTags.SHOVELS)
                .add(ModItems.RUNE_SHOVEL.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUNE_HELMET.get())
                .add(ModItems.RUNE_CHESTPLATE.get())
                .add(ModItems.RUNE_LEGGINGS.get())
                .add(ModItems.RUNE_BOOTS.get())

                .add(ModItems.ADAMANT_HELMET.get())
                .add(ModItems.ADAMANT_CHESTPLATE.get())
                .add(ModItems.ADAMANT_LEGGINGS.get())
                .add(ModItems.ADAMANT_BOOTS.get())

                .add(ModItems.MITHRIL_HELMET.get())
                .add(ModItems.MITHRIL_CHESTPLATE.get())
                .add(ModItems.MITHRIL_LEGGINGS.get())
                .add(ModItems.MITHRIL_BOOTS.get())

                .add(ModItems.STEEL_HELMET.get())
                .add(ModItems.STEEL_CHESTPLATE.get())
                .add(ModItems.STEEL_LEGGINGS.get())
                .add(ModItems.STEEL_BOOTS.get())

                .add(ModItems.BRONZE_HELMET.get())
                .add(ModItems.BRONZE_CHESTPLATE.get())
                .add(ModItems.BRONZE_LEGGINGS.get())
                .add(ModItems.BRONZE_BOOTS.get());

        this.tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.RUNITE_INGOT.get());

        this.tag(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.EXPERIMENTAL_TRIM_PATTERN.get());
    }
}
