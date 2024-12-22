package net.slendymctendies.scapecraft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.slendymctendies.scapecraft.ScapeCraft;
import net.slendymctendies.scapecraft.item.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1f);
        trimMaterials.put(TrimMaterials.IRON, 0.2f);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3f);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4f);
        trimMaterials.put(TrimMaterials.COPPER, 0.5f);
        trimMaterials.put(TrimMaterials.GOLD, 0.6f);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7f);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8f);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9f);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0f);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ScapeCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RAW_RUNITE.get());
        basicItem(ModItems.RUNITE_INGOT.get());
        basicItem(ModItems.RUNITE_SCRAP.get());

        basicItem(ModItems.RAW_ADAMANTITE.get());
        basicItem(ModItems.ADAMANTITE_INGOT.get());
        basicItem(ModItems.ADAMANTITE_SCRAP.get());

        basicItem(ModItems.RAW_MITHRIL.get());
        basicItem(ModItems.MITHRIL_INGOT.get());
        basicItem(ModItems.MITHRIL_SCRAP.get());

        basicItem(ModItems.RAW_SILVER.get());
        basicItem(ModItems.SILVER_INGOT.get());

        basicItem(ModItems.RAW_TIN.get());
        basicItem(ModItems.TIN_INGOT.get());

        basicItem(ModItems.STEEL_INGOT.get());

        basicItem(ModItems.BRONZE_INGOT.get());

        //Food
        basicItem(ModItems.MANTA_RAY.get());
        basicItem(ModItems.RAW_MANTA_RAY.get());
        basicItem(ModItems.ANGLERFISH.get());
        basicItem(ModItems.RAW_ANGLERFISH.get());

        //Handheld Items
        handheldItem(ModItems.RUNE_SWORD);
        handheldItem(ModItems.RUNE_SHOVEL);
        handheldItem(ModItems.RUNE_AXE);
        handheldItem(ModItems.RUNE_PICKAXE);
        handheldItem(ModItems.RUNE_HOE);

        handheldItem(ModItems.ADAMANT_SWORD);
        handheldItem(ModItems.ADAMANT_SHOVEL);
        handheldItem(ModItems.ADAMANT_AXE);
        handheldItem(ModItems.ADAMANT_PICKAXE);
        handheldItem(ModItems.ADAMANT_HOE);

        handheldItem(ModItems.MITHRIL_SWORD);
        handheldItem(ModItems.MITHRIL_SHOVEL);
        handheldItem(ModItems.MITHRIL_AXE);
        handheldItem(ModItems.MITHRIL_PICKAXE);
        handheldItem(ModItems.MITHRIL_HOE);

        handheldItem(ModItems.STEEL_SWORD);
        handheldItem(ModItems.STEEL_SHOVEL);
        handheldItem(ModItems.STEEL_AXE);
        handheldItem(ModItems.STEEL_PICKAXE);
        handheldItem(ModItems.STEEL_HOE);

        handheldItem(ModItems.BRONZE_SWORD);
        handheldItem(ModItems.BRONZE_SHOVEL);
        handheldItem(ModItems.BRONZE_AXE);
        handheldItem(ModItems.BRONZE_PICKAXE);
        handheldItem(ModItems.BRONZE_HOE);

        //Armors
        trimmedArmorItem(ModItems.RUNE_HELMET);
        trimmedArmorItem(ModItems.RUNE_CHESTPLATE);
        trimmedArmorItem(ModItems.RUNE_LEGGINGS);
        trimmedArmorItem(ModItems.RUNE_BOOTS);

        trimmedArmorItem(ModItems.ADAMANT_HELMET);
        trimmedArmorItem(ModItems.ADAMANT_CHESTPLATE);
        trimmedArmorItem(ModItems.ADAMANT_LEGGINGS);
        trimmedArmorItem(ModItems.ADAMANT_BOOTS);

        trimmedArmorItem(ModItems.MITHRIL_HELMET);
        trimmedArmorItem(ModItems.MITHRIL_CHESTPLATE);
        trimmedArmorItem(ModItems.MITHRIL_LEGGINGS);
        trimmedArmorItem(ModItems.MITHRIL_BOOTS);

        trimmedArmorItem(ModItems.STEEL_HELMET);
        trimmedArmorItem(ModItems.STEEL_CHESTPLATE);
        trimmedArmorItem(ModItems.STEEL_LEGGINGS);
        trimmedArmorItem(ModItems.STEEL_BOOTS);

        trimmedArmorItem(ModItems.BRONZE_HELMET);
        trimmedArmorItem(ModItems.BRONZE_CHESTPLATE);
        trimmedArmorItem(ModItems.BRONZE_LEGGINGS);
        trimmedArmorItem(ModItems.BRONZE_BOOTS);

        //Armor Trim (Smithing Template)
        basicItem(ModItems.EXPERIMENTAL_TRIM_PATTERN.get());

        //Horse Armor
        basicItem(ModItems.RUNE_HORSE_ARMOR.get());
        basicItem(ModItems.ADAMANT_HORSE_ARMOR.get());
        basicItem(ModItems.MITHRIL_HORSE_ARMOR.get());
        basicItem(ModItems.STEEL_HORSE_ARMOR.get());
        basicItem(ModItems.BRONZE_HORSE_ARMOR.get());
    }

    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem){
        final String MOD_ID = ScapeCraft.MOD_ID;

        if(itemDeferredItem.get() instanceof ArmorItem armorItem){
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()){
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath);
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                this.withExistingParent(itemDeferredItem.getId().getPath(),
                        mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace() + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0", ResourceLocation.fromNamespaceAndPath(MOD_ID, "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(ScapeCraft.MOD_ID, "item/" + item.getId().getPath()));
    }
}
