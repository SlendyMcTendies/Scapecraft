package net.slendymctendies.scapecraft.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.slendymctendies.scapecraft.ScapeCraft;
import net.slendymctendies.scapecraft.item.advanced.ModArmorItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ScapeCraft.MOD_ID);

    //Ingots
    public static final DeferredItem<Item> RUNITE_INGOT = ITEMS.register("runite_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ADAMANTITE_INGOT = ITEMS.register("adamantite_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));

    //Scrap
    public static final DeferredItem<Item> RUNITE_SCRAP = ITEMS.register("runite_scrap", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ADAMANTITE_SCRAP = ITEMS.register("adamantite_scrap", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MITHRIL_SCRAP = ITEMS.register("mithril_scrap", () -> new Item(new Item.Properties()));

    //Raw Materials
    public static final DeferredItem<Item> RAW_RUNITE = ITEMS.register("raw_runite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ADAMANTITE = ITEMS.register("raw_adamantite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MITHRIL = ITEMS.register("raw_mithril", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));

    //Food
    public static final DeferredItem<Item> MANTA_RAY = ITEMS.register("manta_ray", () -> new Item(new Item.Properties().food(ModFoodProperties.MANTA_RAY)));
    public static final DeferredItem<Item> ANGLERFISH = ITEMS.register("anglerfish", () -> new Item(new Item.Properties().food(ModFoodProperties.ANGLERFISH)));
    public static final DeferredItem<Item> RAW_MANTA_RAY = ITEMS.register("raw_manta_ray", () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_MANTA_RAY)));
    public static final DeferredItem<Item> RAW_ANGLERFISH = ITEMS.register("raw_anglerfish", () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_ANGLERFISH)));

    //Fuel
    //public static final DeferredItem<Item> WILLOW_LOG = ITEMS.register("willow_log", () -> new FuelItem(new Item.Properties(), 300));

    //Weapons
    public static final DeferredItem<SwordItem> RUNE_SWORD = ITEMS.register("rune_sword",
            () -> new SwordItem(ModToolTiers.RUNE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.RUNE, 3, -2.4f))));
    public static final DeferredItem<SwordItem> ADAMANT_SWORD = ITEMS.register("adamant_sword",
            () -> new SwordItem(ModToolTiers.ADAMANT, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADAMANT, 3, -2.4f))));
    public static final DeferredItem<SwordItem> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.MITHRIL, 3, -2.4f))));
    public static final DeferredItem<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.STEEL, 3, -2.4f))));
    public static final DeferredItem<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword",
            () -> new SwordItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.BRONZE, 3, -2.4f))));

    //Armor
    public static final DeferredItem<ArmorItem> RUNE_HELMET = ITEMS.register("rune_helmet",
            () -> new ModArmorItem(ModArmorMaterials.RUNE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(35))));
    public static final DeferredItem<ArmorItem> RUNE_CHESTPLATE = ITEMS.register("rune_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.RUNE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));
    public static final DeferredItem<ArmorItem> RUNE_LEGGINGS = ITEMS.register("rune_leggings",
            () -> new ModArmorItem(ModArmorMaterials.RUNE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(35))));
    public static final DeferredItem<ArmorItem> RUNE_BOOTS = ITEMS.register("rune_boots",
            () -> new ModArmorItem(ModArmorMaterials.RUNE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(ArmorItem.Type.BOOTS.getDurability(35))));

    public static final DeferredItem<ArmorItem> ADAMANT_HELMET = ITEMS.register("adamant_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ADAMANT_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(35))));
    public static final DeferredItem<ArmorItem> ADAMANT_CHESTPLATE = ITEMS.register("adamant_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.ADAMANT_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));
    public static final DeferredItem<ArmorItem> ADAMANT_LEGGINGS = ITEMS.register("adamant_leggings",
            () -> new ModArmorItem(ModArmorMaterials.ADAMANT_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(35))));
    public static final DeferredItem<ArmorItem> ADAMANT_BOOTS = ITEMS.register("adamant_boots",
            () -> new ModArmorItem(ModArmorMaterials.ADAMANT_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(ArmorItem.Type.BOOTS.getDurability(35))));

    public static final DeferredItem<ArmorItem> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
            () -> new ModArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(35))));
    public static final DeferredItem<ArmorItem> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));
    public static final DeferredItem<ArmorItem> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
            () -> new ModArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(35))));
    public static final DeferredItem<ArmorItem> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
            () -> new ModArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(ArmorItem.Type.BOOTS.getDurability(35))));

    public static final DeferredItem<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ModArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(35))));
    public static final DeferredItem<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));
    public static final DeferredItem<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ModArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(35))));
    public static final DeferredItem<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ModArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(ArmorItem.Type.BOOTS.getDurability(35))));

    public static final DeferredItem<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet",
            () -> new ModArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(35))));
    public static final DeferredItem<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));
    public static final DeferredItem<ArmorItem> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings",
            () -> new ModArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(35))));
    public static final DeferredItem<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots",
            () -> new ModArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(ArmorItem.Type.BOOTS.getDurability(35))));

    //Armor Trims (Smithing Templates)
    public static final DeferredItem<Item> EXPERIMENTAL_TRIM_PATTERN = ITEMS.register("experimental_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(ScapeCraft.MOD_ID, "experimental")));

    //Horse Armor
    public static final DeferredItem<Item> RUNE_HORSE_ARMOR = ITEMS.register("rune_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.RUNE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false,
                    new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> ADAMANT_HORSE_ARMOR = ITEMS.register("adamant_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.ADAMANT_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false,
                    new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> MITHRIL_HORSE_ARMOR = ITEMS.register("mithril_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false,
                    new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> STEEL_HORSE_ARMOR = ITEMS.register("steel_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false,
                    new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> BRONZE_HORSE_ARMOR = ITEMS.register("bronze_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false,
                    new Item.Properties().stacksTo(1)));

    //Tools
    public static final DeferredItem<PickaxeItem> RUNE_PICKAXE = ITEMS.register("rune_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUNE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.RUNE, 1, -2.8f))));
    public static final DeferredItem<ShovelItem> RUNE_SHOVEL = ITEMS.register("rune_shovel",
            () -> new ShovelItem(ModToolTiers.RUNE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.RUNE, 1.5f, -3.0f))));
    public static final DeferredItem<HoeItem> RUNE_HOE = ITEMS.register("rune_hoe",
            () -> new HoeItem(ModToolTiers.RUNE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.RUNE, 0, -3.0f))));
    public static final DeferredItem<AxeItem> RUNE_AXE = ITEMS.register("rune_axe",
            () -> new AxeItem(ModToolTiers.RUNE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.RUNE, 6, -3.2f))));

    public static final DeferredItem<PickaxeItem> ADAMANT_PICKAXE = ITEMS.register("adamant_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ADAMANT, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ADAMANT, 1, -2.8f))));
    public static final DeferredItem<ShovelItem> ADAMANT_SHOVEL = ITEMS.register("adamant_shovel",
            () -> new ShovelItem(ModToolTiers.ADAMANT, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ADAMANT, 1.5f, -3.0f))));
    public static final DeferredItem<HoeItem> ADAMANT_HOE = ITEMS.register("adamant_hoe",
            () -> new HoeItem(ModToolTiers.ADAMANT, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ADAMANT, 0, -3.0f))));
    public static final DeferredItem<AxeItem> ADAMANT_AXE = ITEMS.register("adamant_axe",
            () -> new AxeItem(ModToolTiers.ADAMANT, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ADAMANT, 6, -3.2f))));

    public static final DeferredItem<PickaxeItem> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.MITHRIL, 1, -2.8f))));
    public static final DeferredItem<ShovelItem> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.MITHRIL, 1.5f, -3.0f))));
    public static final DeferredItem<HoeItem> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.MITHRIL, 0, -3.0f))));
    public static final DeferredItem<AxeItem> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.MITHRIL, 6, -3.2f))));

    public static final DeferredItem<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.STEEL, 1, -2.8f))));
    public static final DeferredItem<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.STEEL, 1.5f, -3.0f))));
    public static final DeferredItem<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.STEEL, 0, -3.0f))));
    public static final DeferredItem<AxeItem> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.STEEL, 6, -3.2f))));

    public static final DeferredItem<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.BRONZE, 1, -2.8f))));
    public static final DeferredItem<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new ShovelItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.BRONZE, 1.5f, -3.0f))));
    public static final DeferredItem<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe",
            () -> new HoeItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.BRONZE, 0, -3.0f))));
    public static final DeferredItem<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new AxeItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.BRONZE, 6, -3.2f))));

    //Runes
    public static final DeferredItem<Item> RUNE_ESSENCE = ITEMS.register("rune_essence", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PURE_RUNE_ESSENCE = ITEMS.register("pure_rune_essence", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FIRE_RUNE = ITEMS.register("fire_rune", () -> new Item(new Item.Properties()));

    //Skill Icon Items - Used for Creative Mode Tabs
    public static final DeferredItem<Item> ATTACK_ICON = ITEMS.register("attack_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRENGTH_ICON = ITEMS.register("strength_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEFENCE_ICON = ITEMS.register("defence_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HITPOINTS_ICON = ITEMS.register("hitpoints_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RANGED_ICON = ITEMS.register("ranged_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGIC_ICON = ITEMS.register("magic_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRAYER_ICON = ITEMS.register("prayer_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUNECRAFTING_ICON = ITEMS.register("runecrafting_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRAFTING_ICON = ITEMS.register("crafting_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MINING_ICON = ITEMS.register("mining_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMITHING_ICON = ITEMS.register("smithing_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FISHING_ICON = ITEMS.register("fishing_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COOKING_ICON = ITEMS.register("cooking_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOODCUTTING_ICON = ITEMS.register("woodcutting_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIREMAKING_ICON = ITEMS.register("firemaking_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AGILITY_ICON = ITEMS.register("agility_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HERBLORE_ICON = ITEMS.register("herblore_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THIEVING_ICON = ITEMS.register("thieving_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLETCHING_ICON = ITEMS.register("fletching_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SLAYER_ICON = ITEMS.register("slayer_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FARMING_ICON = ITEMS.register("farming_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CONSTRUCTION_ICON = ITEMS.register("construction_icon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HUNTER_ICON = ITEMS.register("hunter_icon", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
