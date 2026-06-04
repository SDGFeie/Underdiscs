package net.sdgfeie.underdiscs.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.sdgfeie.underdiscs.Underdiscs;

public class UDCreativeMenu {
    public static final ItemGroup UD_MUSIC_DISCS = Registry.register(Registries.ITEM_GROUP,
            Underdiscs.id("discs"),
            FabricItemGroup.builder().displayName(Text.translatable("menu.creative.underdiscs.discs"))
                    .icon(() -> new ItemStack(UDItems.disc_base.asItem())).entries(((displayContext, entries) -> {
                        entries.add(Items.JUKEBOX.getDefaultStack());
                        entries.addAll(UDItems.DISCS);
                    })).build());


    public static void register() {

    }
}
