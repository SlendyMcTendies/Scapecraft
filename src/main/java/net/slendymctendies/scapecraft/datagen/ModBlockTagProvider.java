package net.slendymctendies.scapecraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.slendymctendies.scapecraft.ScapeCraft;
import net.slendymctendies.scapecraft.block.ModBlocks;
import net.slendymctendies.scapecraft.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ScapeCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        /*
        =====================
        MINEABLE WITH PICKAXE
        =====================
        */
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUNITE_BLOCK.get())
                .add(ModBlocks.RUNITE_ORE.get())
                .add(ModBlocks.RAW_RUNITE_BLOCK.get())

                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_BLOCK.get())
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK.get())

                .add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_BLOCK.get())
                .add(ModBlocks.RAW_MITHRIL_BLOCK.get())

                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get())

                .add(ModBlocks.DEEPSLATE_TIN_ORE.get())
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.TIN_BLOCK.get())
                .add(ModBlocks.RAW_TIN_BLOCK.get())

                .add(ModBlocks.STEEL_BLOCK.get())

                .add(ModBlocks.BRONZE_BLOCK.get());

                /*
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())

                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())

                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.JADE_BLOCK.get())
                .add(ModBlocks.RED_TOPAZ_BLOCK.get());

                 */

        /*
        =============
        INCORRECT_FOR
        =============
        */
        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                //Netherite
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.NETHERITE_BLOCK)

                //Obsidian
                .add(Blocks.OBSIDIAN)
                .add(Blocks.CRYING_OBSIDIAN);

        tag(ModTags.Blocks.INCORRECT_FOR_ADAMANT_TOOL)
                //Runite
                .add(ModBlocks.RUNITE_BLOCK.get())
                .add(ModBlocks.RUNITE_ORE.get())
                .add(ModBlocks.RAW_RUNITE_BLOCK.get())

                //Netherite
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.NETHERITE_BLOCK)

                //Obsidian
                .add(Blocks.OBSIDIAN)
                .add(Blocks.CRYING_OBSIDIAN);

        tag(ModTags.Blocks.INCORRECT_FOR_MITHRIL_TOOL)
                //Diamond
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DIAMOND_BLOCK)

                //Runite
                .add(ModBlocks.RUNITE_BLOCK.get())
                .add(ModBlocks.RUNITE_ORE.get())
                .add(ModBlocks.RAW_RUNITE_BLOCK.get())

                //Netherite
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.NETHERITE_BLOCK)

                //Obsidian
                .add(Blocks.OBSIDIAN)
                .add(Blocks.CRYING_OBSIDIAN);

        tag(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL)
                //Adamant
                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_BLOCK.get())
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK.get())

                //Diamond
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DIAMOND_BLOCK)

                //Runite
                .add(ModBlocks.RUNITE_BLOCK.get())
                .add(ModBlocks.RUNITE_ORE.get())
                .add(ModBlocks.RAW_RUNITE_BLOCK.get())

                //Netherite
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.NETHERITE_BLOCK)

                //Obsidian
                .add(Blocks.OBSIDIAN)
                .add(Blocks.CRYING_OBSIDIAN);

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                //Steel
                .add(ModBlocks.STEEL_BLOCK.get())

                //Gold
                .add(Blocks.RAW_GOLD_BLOCK)
                .add(Blocks.GOLD_BLOCK)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)

                //Mithril
                .add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_BLOCK.get())
                .add(ModBlocks.RAW_MITHRIL_BLOCK.get())

                //Adamant
                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_BLOCK.get())
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK.get())

                //Diamond
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DIAMOND_BLOCK)

                //Runite
                .add(ModBlocks.RUNITE_BLOCK.get())
                .add(ModBlocks.RUNITE_ORE.get())
                .add(ModBlocks.RAW_RUNITE_BLOCK.get())

                //Netherite
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.NETHERITE_BLOCK)

                //Obsidian
                .add(Blocks.OBSIDIAN)
                .add(Blocks.CRYING_OBSIDIAN)

                //Gems
                .add(Blocks.EMERALD_BLOCK)
                .add(Blocks.EMERALD_ORE)
                .add(Blocks.DEEPSLATE_EMERALD_ORE)
                .add(Blocks.LAPIS_BLOCK)
                .add(Blocks.LAPIS_ORE)
                .add(Blocks.DEEPSLATE_LAPIS_ORE)

                /*
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())

                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())

                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.JADE_BLOCK.get())
                .add(ModBlocks.RED_TOPAZ_BLOCK.get())

                 */

                //Miscellaneous
                .add(Blocks.END_STONE)
                .add(Blocks.PURPUR_BLOCK);

        tag(ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL)
                //Silver
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get())

                //Coal
                .add(Blocks.COAL_BLOCK)
                .add(Blocks.COAL_ORE)
                .add(Blocks.DEEPSLATE_COAL_ORE)

                //Steel
                .add(ModBlocks.STEEL_BLOCK.get())

                //Gold
                .add(Blocks.RAW_GOLD_BLOCK)
                .add(Blocks.GOLD_BLOCK)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)

                //Mithril
                .add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_BLOCK.get())
                .add(ModBlocks.RAW_MITHRIL_BLOCK.get())

                //Adamant
                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_BLOCK.get())
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK.get())

                //Diamond
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DIAMOND_BLOCK)

                //Runite
                .add(ModBlocks.RUNITE_BLOCK.get())
                .add(ModBlocks.RUNITE_ORE.get())
                .add(ModBlocks.RAW_RUNITE_BLOCK.get())

                //Netherite
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.NETHERITE_BLOCK)

                //Obsidian
                .add(Blocks.OBSIDIAN)
                .add(Blocks.CRYING_OBSIDIAN)

                //Redstone
                .add(Blocks.REDSTONE_BLOCK)
                .add(Blocks.REDSTONE_ORE)
                .add(Blocks.DEEPSLATE_REDSTONE_ORE)

                //Gems
                .add(Blocks.EMERALD_BLOCK)
                .add(Blocks.EMERALD_ORE)
                .add(Blocks.DEEPSLATE_EMERALD_ORE)
                .add(Blocks.LAPIS_BLOCK)
                .add(Blocks.LAPIS_ORE)
                .add(Blocks.DEEPSLATE_LAPIS_ORE)

                /*
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())

                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())

                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.JADE_BLOCK.get())
                .add(ModBlocks.RED_TOPAZ_BLOCK.get())
                 */

                //Miscellaneous
                .add(Blocks.END_STONE)
                .add(Blocks.PURPUR_BLOCK);

        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                //Iron
                .add(Blocks.RAW_IRON_BLOCK)
                .add(Blocks.IRON_BLOCK)
                .add(Blocks.IRON_ORE)
                .add(Blocks.DEEPSLATE_IRON_ORE)

                //Silver
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get())

                //Coal
                .add(Blocks.COAL_BLOCK)
                .add(Blocks.COAL_ORE)
                .add(Blocks.DEEPSLATE_COAL_ORE)

                //Steel
                .add(ModBlocks.STEEL_BLOCK.get())

                //Gold
                .add(Blocks.RAW_GOLD_BLOCK)
                .add(Blocks.GOLD_BLOCK)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)

                //Mithril
                .add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_BLOCK.get())
                .add(ModBlocks.RAW_MITHRIL_BLOCK.get())

                //Adamant
                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_BLOCK.get())
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK.get())

                //Diamond
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DIAMOND_BLOCK)

                //Runite
                .add(ModBlocks.RUNITE_BLOCK.get())
                .add(ModBlocks.RUNITE_ORE.get())
                .add(ModBlocks.RAW_RUNITE_BLOCK.get())

                //Netherite
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.NETHERITE_BLOCK)

                //Obsidian
                .add(Blocks.OBSIDIAN)
                .add(Blocks.CRYING_OBSIDIAN)

                //Gems
                .add(Blocks.EMERALD_BLOCK)
                .add(Blocks.EMERALD_ORE)
                .add(Blocks.DEEPSLATE_EMERALD_ORE)
                .add(Blocks.LAPIS_BLOCK)
                .add(Blocks.LAPIS_ORE)
                .add(Blocks.DEEPSLATE_LAPIS_ORE)

                /*
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())

                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())

                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.JADE_BLOCK.get())
                .add(ModBlocks.RED_TOPAZ_BLOCK.get())

                 */

                //Miscellaneous
                .add(Blocks.END_STONE)
                .add(Blocks.PURPUR_BLOCK);

        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                //Bronze
                .add(ModBlocks.BRONZE_BLOCK.get())

                //Iron
                .add(Blocks.RAW_IRON_BLOCK)
                .add(Blocks.IRON_BLOCK)
                .add(Blocks.IRON_ORE)
                .add(Blocks.DEEPSLATE_IRON_ORE)

                //Silver
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get())

                //Coal
                .add(Blocks.COAL_BLOCK)
                .add(Blocks.COAL_ORE)
                .add(Blocks.DEEPSLATE_COAL_ORE)

                //Steel
                .add(ModBlocks.STEEL_BLOCK.get())

                //Gold
                .add(Blocks.RAW_GOLD_BLOCK)
                .add(Blocks.GOLD_BLOCK)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)

                //Mithril
                .add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_BLOCK.get())
                .add(ModBlocks.RAW_MITHRIL_BLOCK.get())

                //Adamant
                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_BLOCK.get())
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK.get())

                //Diamond
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DIAMOND_BLOCK)

                //Runite
                .add(ModBlocks.RUNITE_BLOCK.get())
                .add(ModBlocks.RUNITE_ORE.get())
                .add(ModBlocks.RAW_RUNITE_BLOCK.get())

                //Netherite
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.NETHERITE_BLOCK)

                //Obsidian
                .add(Blocks.OBSIDIAN)
                .add(Blocks.CRYING_OBSIDIAN)

                //Gems
                .add(Blocks.EMERALD_BLOCK)
                .add(Blocks.EMERALD_ORE)
                .add(Blocks.DEEPSLATE_EMERALD_ORE)
                .add(Blocks.LAPIS_BLOCK)
                .add(Blocks.LAPIS_ORE)
                .add(Blocks.DEEPSLATE_LAPIS_ORE)

                /*
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())

                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())

                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.JADE_BLOCK.get())
                .add(ModBlocks.RED_TOPAZ_BLOCK.get())

                 */

                //Miscellaneous
                .add(Blocks.END_STONE)
                .add(Blocks.PURPUR_BLOCK);

        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                //Bronze
                .add(ModBlocks.BRONZE_BLOCK.get())

                //Iron
                .add(Blocks.RAW_IRON_BLOCK)
                .add(Blocks.IRON_BLOCK)
                .add(Blocks.IRON_ORE)
                .add(Blocks.DEEPSLATE_IRON_ORE)

                //Silver
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get())

                //Coal
                .add(Blocks.COAL_BLOCK)
                .add(Blocks.COAL_ORE)
                .add(Blocks.DEEPSLATE_COAL_ORE)

                //Steel
                .add(ModBlocks.STEEL_BLOCK.get())

                //Gold
                .add(Blocks.RAW_GOLD_BLOCK)
                .add(Blocks.GOLD_BLOCK)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)

                //Mithril
                .add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_BLOCK.get())
                .add(ModBlocks.RAW_MITHRIL_BLOCK.get())

                //Adamant
                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_BLOCK.get())
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK.get())

                //Diamond
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DIAMOND_BLOCK)

                //Runite
                .add(ModBlocks.RUNITE_BLOCK.get())
                .add(ModBlocks.RUNITE_ORE.get())
                .add(ModBlocks.RAW_RUNITE_BLOCK.get())

                //Netherite
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.NETHERITE_BLOCK)

                //Obsidian
                .add(Blocks.OBSIDIAN)
                .add(Blocks.CRYING_OBSIDIAN)

                //Gems
                .add(Blocks.EMERALD_BLOCK)
                .add(Blocks.EMERALD_ORE)
                .add(Blocks.DEEPSLATE_EMERALD_ORE)
                .add(Blocks.LAPIS_BLOCK)
                .add(Blocks.LAPIS_ORE)
                .add(Blocks.DEEPSLATE_LAPIS_ORE)

                /*
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())

                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())

                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.JADE_BLOCK.get())
                .add(ModBlocks.RED_TOPAZ_BLOCK.get())
                */

                //Miscellaneous
                .add(Blocks.END_STONE)
                .add(Blocks.PURPUR_BLOCK);
    }
}
