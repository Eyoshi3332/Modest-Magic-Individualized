package io.github.Eyoshi3332.modestmagicindividualized.item;

import io.github.Eyoshi3332.modestmagicindividualized.ModestMagicIndividualized;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModestMagicIndividualized.MODID);

    // "TESTING_TABLET" (all caps) is used in coding for stuffs!
    // "testing_tablet" (all lowercase) is the in-game name used in "/give", advanced tooltips, etc.!
    // Adding an Item Property goes "Item.Properties().[thing you want to add]".

    // Base Tablets
    public static final DeferredItem<Item> BLESSED_ENCHANTING_TABLET = ITEMS.register("blessed_enchanting_tablet",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CURSED_ENCHANTING_TABLET = ITEMS.register("cursed_enchanting_tablet",
            () -> new Item(new Item.Properties()));

    // Regular Tablets


    // Slates
    public static final DeferredItem<Item> SPRAYING_SLATE = ITEMS.register("spraying_slate",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.UNCOMMON)));

    // Blessed Tablets
    public static final DeferredItem<Item> LIMITLESS_TABLET = ITEMS.register("limitless_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.RARE)));
    public static final DeferredItem<Item> SOLARIZING_TABLET = ITEMS.register("solarizing_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.RARE)));
    public static final DeferredItem<Item> EVERLASTING_TABLET = ITEMS.register("everlasting_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.RARE)));
    public static final DeferredItem<Item> ENDURING_TABLET = ITEMS.register("enduring_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.RARE)));
    public static final DeferredItem<Item> PRESERVATION_TABLET = ITEMS.register("preservation_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.RARE)));
    public static final DeferredItem<Item> INNER_EYE_TABLET = ITEMS.register("inner_eye_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.RARE)));
    public static final DeferredItem<Item> TOLERANCE_TABLET = ITEMS.register("tolerance_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.RARE)));
    public static final DeferredItem<Item> REST_WINGS_TABLET = ITEMS.register("rest_wings_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.RARE)));
    public static final DeferredItem<Item> IMPERVIOUS_TABLET = ITEMS.register("impervious_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.RARE)));


    // Cursed Tablets
    public static final DeferredItem<Item> FAMINE_TABLET = ITEMS.register("famine_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> SUFFOCATION_TABLET = ITEMS.register("suffocation_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> UWUFYING_TABLET = ITEMS.register("uwufying_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> CONDUCTIVITY_TABLET = ITEMS.register("conductivity_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> VANISHING_TABLET = ITEMS.register("vanishing_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> BINDING_TABLET = ITEMS.register("binding_tablet",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.UNCOMMON)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}