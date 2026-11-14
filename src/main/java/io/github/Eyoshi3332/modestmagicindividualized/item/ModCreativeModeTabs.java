package io.github.Eyoshi3332.modestmagicindividualized.item;

import io.github.Eyoshi3332.modestmagicindividualized.ModestMagicIndividualized;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

// "Modest Magic Individualized" Creative Mode Tab
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModestMagicIndividualized.MODID);

    public static final Supplier<CreativeModeTab> MODEST_MAGIC_INDIVIDUALIZED_TAB = CREATIVE_MODE_TAB.register("modest_magic_individualized_tab",
            // Icon for the Creative Mode Tab. "TESTING_TABLET" is the icon.
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TESTING_TABLET.get()))
                    // Translation Key for en_us.json
                    .title(Component.translatable("creativetab.modestmagicindividualized.modest_magic_individualized"))
                    .displayItems((itemDisplayParameters, output) -> {

                        // Items displayed in the "Modest Magic Individualized" Creative Mode Tab
                        output.accept(ModItems.TESTING_TABLET);
                        output.accept(ModItems.TESTING_SLATE);
                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
