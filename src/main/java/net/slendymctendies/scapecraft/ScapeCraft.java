package net.slendymctendies.scapecraft;

import net.minecraft.client.KeyMapping;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.common.extensions.IPlayerExtension;
import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.slendymctendies.scapecraft.attribute.ModAttributes;
import net.slendymctendies.scapecraft.block.ModBlocks;
import net.slendymctendies.scapecraft.client.ClientSetup;
import net.slendymctendies.scapecraft.client.ModKeybinds;
import net.slendymctendies.scapecraft.client.menu.ModMenus;
import net.slendymctendies.scapecraft.client.screen.SkillScreen;
import net.slendymctendies.scapecraft.datagen.ModLangProvider;
import net.slendymctendies.scapecraft.effects.ModEffects;
import net.slendymctendies.scapecraft.item.ModCreativeModeTabs;
import net.slendymctendies.scapecraft.item.ModItems;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(ScapeCraft.MOD_ID)
public class ScapeCraft
{
    public static final String MOD_ID = "scapecraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public ScapeCraft(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        //modEventBus.addListener(ScapeCraft::onSmeltingEvent);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEffects.register(modEventBus);

        ModAttributes.register(modEventBus);

        ModMenus.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    //private static void onSmeltingEvent();

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.RUNITE_INGOT);
            event.accept(ModItems.RUNITE_SCRAP);
            event.accept(ModItems.RAW_RUNITE);

            event.accept(ModItems.ADAMANTITE_INGOT);
            event.accept(ModItems.ADAMANTITE_SCRAP);
            event.accept(ModItems.RAW_ADAMANTITE);

            event.accept(ModItems.MITHRIL_INGOT);
            event.accept(ModItems.MITHRIL_SCRAP);
            event.accept(ModItems.RAW_MITHRIL);

            event.accept(ModItems.SILVER_INGOT);
            event.accept(ModItems.RAW_SILVER);

            event.accept(ModItems.TIN_INGOT);
            event.accept(ModItems.RAW_TIN);

            event.accept(ModItems.STEEL_INGOT);

            event.accept(ModItems.BRONZE_INGOT);

            event.accept(ModItems.EXPERIMENTAL_TRIM_PATTERN);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.RUNITE_BLOCK);
            event.accept(ModBlocks.ADAMANTITE_BLOCK);
            event.accept(ModBlocks.MITHRIL_BLOCK);
            event.accept(ModBlocks.SILVER_BLOCK);
            event.accept(ModBlocks.STEEL_BLOCK);
            event.accept(ModBlocks.BRONZE_BLOCK);
            event.accept(ModBlocks.TIN_BLOCK);

            event.accept(ModBlocks.RAW_RUNITE_BLOCK);
            event.accept(ModBlocks.RAW_ADAMANTITE_BLOCK);
            event.accept(ModBlocks.RAW_MITHRIL_BLOCK);
            event.accept(ModBlocks.RAW_SILVER_BLOCK);
            event.accept(ModBlocks.RAW_TIN_BLOCK);
        }

        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS){
            event.accept(ModBlocks.RUNITE_ORE);

            event.accept(ModBlocks.DEEPSLATE_ADAMANTITE_ORE);
            event.accept(ModBlocks.ADAMANTITE_ORE);

            event.accept(ModBlocks.DEEPSLATE_MITHRIL_ORE);
            event.accept(ModBlocks.MITHRIL_ORE);

            event.accept(ModBlocks.DEEPSLATE_SILVER_ORE);
            event.accept(ModBlocks.SILVER_ORE);

            event.accept(ModBlocks.DEEPSLATE_TIN_ORE);
            event.accept(ModBlocks.TIN_ORE);

            //event.accept(ModBlocks.WILLOW_LOG);
        }

        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ModItems.MANTA_RAY);
            event.accept(ModItems.RAW_MANTA_RAY);
            event.accept(ModItems.ANGLERFISH);
            event.accept(ModItems.RAW_ANGLERFISH);
        }

        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModItems.RUNE_PICKAXE);
            event.accept(ModItems.RUNE_SHOVEL);
            event.accept(ModItems.RUNE_HOE);
            event.accept(ModItems.RUNE_AXE);

            event.accept(ModItems.ADAMANT_PICKAXE);
            event.accept(ModItems.ADAMANT_SHOVEL);
            event.accept(ModItems.ADAMANT_HOE);
            event.accept(ModItems.ADAMANT_AXE);

            event.accept(ModItems.MITHRIL_PICKAXE);
            event.accept(ModItems.MITHRIL_SHOVEL);
            event.accept(ModItems.MITHRIL_HOE);
            event.accept(ModItems.MITHRIL_AXE);

            event.accept(ModItems.STEEL_PICKAXE);
            event.accept(ModItems.STEEL_SHOVEL);
            event.accept(ModItems.STEEL_HOE);
            event.accept(ModItems.STEEL_AXE);

            event.accept(ModItems.BRONZE_PICKAXE);
            event.accept(ModItems.BRONZE_SHOVEL);
            event.accept(ModItems.BRONZE_HOE);
            event.accept(ModItems.BRONZE_AXE);
        }

        if(event.getTabKey() == CreativeModeTabs.COMBAT){
            event.accept(ModItems.RUNE_SWORD);
            event.accept(ModItems.RUNE_HELMET);
            event.accept(ModItems.RUNE_CHESTPLATE);
            event.accept(ModItems.RUNE_LEGGINGS);
            event.accept(ModItems.RUNE_BOOTS);
            event.accept(ModItems.RUNE_HORSE_ARMOR);

            event.accept(ModItems.ADAMANT_SWORD);
            event.accept(ModItems.ADAMANT_HELMET);
            event.accept(ModItems.ADAMANT_CHESTPLATE);
            event.accept(ModItems.ADAMANT_LEGGINGS);
            event.accept(ModItems.ADAMANT_BOOTS);
            event.accept(ModItems.ADAMANT_HORSE_ARMOR);

            event.accept(ModItems.MITHRIL_SWORD);
            event.accept(ModItems.MITHRIL_HELMET);
            event.accept(ModItems.MITHRIL_CHESTPLATE);
            event.accept(ModItems.MITHRIL_LEGGINGS);
            event.accept(ModItems.MITHRIL_BOOTS);
            event.accept(ModItems.MITHRIL_HORSE_ARMOR);

            event.accept(ModItems.STEEL_SWORD);
            event.accept(ModItems.STEEL_HELMET);
            event.accept(ModItems.STEEL_CHESTPLATE);
            event.accept(ModItems.STEEL_LEGGINGS);
            event.accept(ModItems.STEEL_BOOTS);
            event.accept(ModItems.STEEL_HORSE_ARMOR);

            event.accept(ModItems.BRONZE_SWORD);
            event.accept(ModItems.BRONZE_HELMET);
            event.accept(ModItems.BRONZE_CHESTPLATE);
            event.accept(ModItems.BRONZE_LEGGINGS);
            event.accept(ModItems.BRONZE_BOOTS);
            event.accept(ModItems.BRONZE_HORSE_ARMOR);

        }

        //if(event.getTabKey() == CreativeModeTabs.)
    }



    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }

        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event) {
            event.register(ModMenus.SKILL_MENU.get(), SkillScreen::new);
        }
    }
}
