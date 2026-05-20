package net.sdgfeie.underdiscs.init;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.sdgfeie.underdiscs.Underdiscs;

public class UDItemTags {

    public static TagKey<Item> ICE = of("ice");
    public static TagKey<Item> BLACK_WHITE_BANNER = of("black_white_banner");
    public static TagKey<Item> BARRIER = of("barrier");

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Underdiscs.id(id));
    }

    public static void register() {
    }
}
