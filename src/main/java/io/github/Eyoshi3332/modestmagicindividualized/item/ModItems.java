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
    // Slates
    public static final DeferredItem<Item> SPRAYING_SLATE = ITEMS.register("spraying_slate",
            () -> new Item(new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).rarity(Rarity.UNCOMMON)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}