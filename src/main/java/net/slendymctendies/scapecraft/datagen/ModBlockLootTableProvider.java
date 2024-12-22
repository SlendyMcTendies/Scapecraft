package net.slendymctendies.scapecraft.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.slendymctendies.scapecraft.block.ModBlocks;
import net.slendymctendies.scapecraft.item.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.RUNITE_BLOCK.get());
        dropSelf(ModBlocks.RAW_RUNITE_BLOCK.get());
        dropSelf(ModBlocks.ADAMANTITE_BLOCK.get());
        dropSelf(ModBlocks.RAW_ADAMANTITE_BLOCK.get());
        dropSelf(ModBlocks.MITHRIL_BLOCK.get());
        dropSelf(ModBlocks.RAW_MITHRIL_BLOCK.get());
        dropSelf(ModBlocks.SILVER_BLOCK.get());
        dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        dropSelf(ModBlocks.STEEL_BLOCK.get());
        dropSelf(ModBlocks.BRONZE_BLOCK.get());
        dropSelf(ModBlocks.TIN_BLOCK.get());
        dropSelf(ModBlocks.RAW_TIN_BLOCK.get());

        dropSelf(ModBlocks.WILLOW_LOG.get());

        add(ModBlocks.RUNITE_ORE.get(), block -> createOreDrop(ModBlocks.RUNITE_ORE.get(), ModItems.RAW_RUNITE.get()));

        add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get(), ModItems.RAW_ADAMANTITE.get()));
        add(ModBlocks.ADAMANTITE_ORE.get(), block -> createOreDrop(ModBlocks.ADAMANTITE_ORE.get(), ModItems.RAW_ADAMANTITE.get()));

        add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));
        add(ModBlocks.MITHRIL_ORE.get(), block -> createOreDrop(ModBlocks.MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));

        add(ModBlocks.DEEPSLATE_SILVER_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        add(ModBlocks.SILVER_ORE.get(), block -> createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));

        add(ModBlocks.DEEPSLATE_TIN_ORE.get(), block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get(), 2, 5));
        add(ModBlocks.TIN_ORE.get(), block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get(), 2, 5));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item pItem, float minDrops, float maxDrops){
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(pItem)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
