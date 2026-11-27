package io.github.Eyoshi3332.modestmagicindividualized;

import io.github.Eyoshi3332.modestmagicindividualized.item.ModCreativeModeTabs;
import io.github.Eyoshi3332.modestmagicindividualized.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// REMINDER TO SELF: IF THE "IMPORT" STUFF IS GRAYED OUT, THAT DOESN'T MEAN IT'S NOT WORKING!!! IT JUST MEANS THAT IT'S UNUSED IN THE CODE!!! USE IT SOMEWHERE TO UNGRAY IT OUT AND GIVE IT COLOR (paper mario: color splash reference)!!!

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(ModestMagicIndividualized.MODID)
public class ModestMagicIndividualized {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "modestmagicindividualized";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public ModestMagicIndividualized(IEventBus modEventBus, ModContainer modContainer) {

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Resource Pack stuff
        modEventBus.addListener(this::addPackFinders);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Creative Mode Tabs
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // Ingredients Tab
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

            // Base Tablets
            event.accept(ModItems.BLESSED_ENCHANTING_TABLET);
            event.accept(ModItems.CURSED_ENCHANTING_TABLET);

            // Slates
            event.accept(ModItems.SPRAYING_SLATE);

            // Blessed Tablets
            event.accept(ModItems.LIMITLESS_TABLET);
            event.accept(ModItems.SOLARIZING_TABLET);
            event.accept(ModItems.EVERLASTING_TABLET);
            event.accept(ModItems.ENDURING_TABLET);
            event.accept(ModItems.PRESERVATION_TABLET);
            event.accept(ModItems.INNER_EYE_TABLET);
            event.accept(ModItems.TOLERANCE_TABLET);
            event.accept(ModItems.REST_WINGS_TABLET);
            event.accept(ModItems.IMPERVIOUS_TABLET);

            // Cursed Tablets
            event.accept(ModItems.FAMINE_TABLET);
            event.accept(ModItems.SUFFOCATION_TABLET);
            event.accept(ModItems.UWUFYING_TABLET);
            event.accept(ModItems.CONDUCTIVITY_TABLET);
            event.accept(ModItems.VANISHING_TABLET);
            event.accept(ModItems.BINDING_TABLET);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    public void addPackFinders(AddPackFindersEvent event) {
        if (event.getPackType() == PackType.CLIENT_RESOURCES) {
            // File path
            event.addPackFinders(ResourceLocation.fromNamespaceAndPath(MODID, "resourcepacks/rebranded_tablets"),
                    // Actual name of the Resource Pack
                    PackType.CLIENT_RESOURCES, Component.literal("Rebranded Tablets"), PackSource.BUILT_IN, false, Pack.Position.TOP);
        }
    }
}