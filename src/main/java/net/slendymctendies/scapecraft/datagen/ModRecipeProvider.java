package net.slendymctendies.scapecraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.slendymctendies.scapecraft.ScapeCraft;
import net.slendymctendies.scapecraft.block.ModBlocks;
import net.slendymctendies.scapecraft.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> RUNITE_SMELTABLES = List.of(ModItems.RAW_RUNITE);
        List<ItemLike> ADAMANTITE_SMELTABLES = List.of(ModItems.RAW_ADAMANTITE);
        List<ItemLike> MITHIRL_SMELTABLES = List.of(ModItems.RAW_MITHRIL);
        List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER);
        List<ItemLike> STEEL_SMELTABLES = List.of(Items.RAW_IRON);

        /*
        =================
        RUNE ITEM RECIPES
        =================
         */

        //Runite Ingot from Runite Scrap & Netherite
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUNITE_INGOT.get())
                .pattern("BBB")
                .pattern("CCC")
                .define('B', ModItems.RUNITE_SCRAP.get())
                .define('C', Items.DIAMOND)
                .unlockedBy("has_raw_runite", has(ModItems.RAW_RUNITE)).save(recipeOutput);

        //Runite Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUNITE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.RUNITE_INGOT.get())
                .unlockedBy("has_runite_ingot", has(ModItems.RUNITE_INGOT)).save(recipeOutput);

        //Raw Runite Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RUNITE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.RAW_RUNITE.get())
                .unlockedBy("has_raw_runite", has(ModItems.RAW_RUNITE)).save(recipeOutput);

        //Runite Ingot from Runite Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUNITE_INGOT.get(), 9)
                .requires(ModBlocks.RUNITE_BLOCK)
                .unlockedBy("has_runite_block", has(ModBlocks.RUNITE_BLOCK)).save(recipeOutput, "scapecraft:runite_ingot_from_runite_block");

        //Runite Scrap from Smelting/Blasting
        oreSmelting(recipeOutput, RUNITE_SMELTABLES, RecipeCategory.MISC, ModItems.RUNITE_SCRAP.get(), 0.0f, 200, "runite");
        oreBlasting(recipeOutput, RUNITE_SMELTABLES, RecipeCategory.MISC, ModItems.RUNITE_SCRAP.get(), 0.0f, 100, "runite");

        /*
        ====================
        ADAMANT ITEM RECIPES
        ====================
         */

        //Adamantite Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ADAMANTITE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.ADAMANTITE_INGOT.get())
                .unlockedBy("has_adamantite_ingot", has(ModItems.ADAMANTITE_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 9)
                .requires(ModBlocks.ADAMANTITE_BLOCK)
                .unlockedBy("has_adamantite_block", has(ModBlocks.ADAMANTITE_BLOCK)).save(recipeOutput, "scapecraft:adamantite_ingot_from_adamantite_block");

        oreSmelting(recipeOutput, ADAMANTITE_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANTITE_SCRAP.get(), 0.0f, 200, "adamantite");
        oreBlasting(recipeOutput, ADAMANTITE_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANTITE_SCRAP.get(), 0.0f, 100, "adamantite");

        /*
        ====================
        MITHRIL ITEM RECIPES
        ====================
         */

        //Mithril Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MITHRIL_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.MITHRIL_INGOT.get())
                .unlockedBy("has_mithril_ingot", has(ModItems.MITHRIL_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 9)
                .requires(ModBlocks.MITHRIL_BLOCK)
                .unlockedBy("has_mithril_block", has(ModBlocks.MITHRIL_BLOCK)).save(recipeOutput, "scapecraft:mithril_ingot_from_mithril_block");

        oreSmelting(recipeOutput, MITHIRL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHRIL_SCRAP.get(), 0.0f, 200, "mithril");
        oreBlasting(recipeOutput, MITHIRL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHRIL_SCRAP.get(), 0.0f, 100, "mithril");

        /*
        ==================
        ARMOR TRIM RECIPES
        ==================
         */
        trimSmithing(recipeOutput, ModItems.EXPERIMENTAL_TRIM_PATTERN.get(), ResourceLocation.fromNamespaceAndPath(ScapeCraft.MOD_ID, "experimental"));
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup){
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup){
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName){
        for(ItemLike itemLike : pIngredients){
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemLike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemLike), has(itemLike))
                    .save(recipeOutput, ScapeCraft.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemLike));
        }
    }
}
