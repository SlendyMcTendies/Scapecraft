package net.slendymctendies.scapecraft.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.slendymctendies.scapecraft.ScapeCraft;

public class ModTags {
    public static class Blocks{
        //Needs ...
        public static final TagKey<Block> NEEDS_RUNE_TOOL = createTag("needs_rune_tool");
        public static final TagKey<Block> NEEDS_ADAMANT_TOOL = createTag("needs_adamant_tool");
        public static final TagKey<Block> NEEDS_MITHRIL_TOOL = createTag("needs_mithril_tool");
        public static final TagKey<Block> NEEDS_STEEL_TOOL = createTag("needs_steel_tool");
        public static final TagKey<Block> NEEDS_BRONZE_TOOL = createTag("needs_bronze_tool");

        //Incorrect for ...
        public static final TagKey<Block> INCORRECT_FOR_RUNE_TOOL = createTag("incorrect_for_rune_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADAMANT_TOOL = createTag("incorrect_for_adamant_tool");
        public static final TagKey<Block> INCORRECT_FOR_MITHRIL_TOOL = createTag("incorrect_for_mithril_tool");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = createTag("incorrect_for_steel_tool");
        public static final TagKey<Block> INCORRECT_FOR_BRONZE_TOOL = createTag("incorrect_for_bronze_tool");

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ScapeCraft.MOD_ID, name));
        }
    }

    public static class Items{
        public static final TagKey<Item> SMITHING_SKILL_ITEMS = createTag("smithing_skill_items");

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ScapeCraft.MOD_ID, name));
        }
    }
}
