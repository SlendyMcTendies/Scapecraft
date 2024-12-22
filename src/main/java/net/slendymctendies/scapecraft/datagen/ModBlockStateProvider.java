package net.slendymctendies.scapecraft.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.slendymctendies.scapecraft.ScapeCraft;
import net.slendymctendies.scapecraft.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ScapeCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RUNITE_BLOCK);
        blockWithItem(ModBlocks.RAW_RUNITE_BLOCK);
        blockWithItem(ModBlocks.RUNITE_ORE);

        blockWithItem(ModBlocks.ADAMANTITE_BLOCK);
        blockWithItem(ModBlocks.RAW_ADAMANTITE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_ADAMANTITE_ORE);
        blockWithItem(ModBlocks.ADAMANTITE_ORE);

        blockWithItem(ModBlocks.MITHRIL_BLOCK);
        blockWithItem(ModBlocks.RAW_MITHRIL_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_MITHRIL_ORE);
        blockWithItem(ModBlocks.MITHRIL_ORE);

        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(ModBlocks.SILVER_ORE);

        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);
        blockWithItem(ModBlocks.TIN_ORE);

        blockWithItem(ModBlocks.STEEL_BLOCK);

        blockWithItem(ModBlocks.BRONZE_BLOCK);

        //blockWithItem(ModBlocks.WILLOW_LOG);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
