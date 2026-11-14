package io.github.Eyoshi3332.modestmagicindividualized.item;

import io.github.Eyoshi3332.modestmagicindividualized.ModestMagicIndividualized;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModestMagicIndividualized.MODID);

    // "TESTING_TABLET" (all caps) is used in coding for stuffs!
    // "testing_tablet" (all lowercase) is the in-game name used in "/give", advanced tooltips, etc.!
    public static final DeferredItem<Item> TESTING_TABLET = ITEMS.register("testing_tablet",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TESTING_SLATE = ITEMS.register("testing_slate",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}