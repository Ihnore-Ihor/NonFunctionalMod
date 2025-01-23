package net.ihnore_ihor.paperlantern.item;

import net.ihnore_ihor.paperlantern.PaperLantern;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PaperLantern.MODID);

    public static final RegistryObject<Item> LANTERN = ITEMS.register("lantern",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_LANTERN = ITEMS.register("blue_lantern",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
