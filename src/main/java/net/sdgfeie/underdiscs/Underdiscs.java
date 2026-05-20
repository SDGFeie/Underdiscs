package net.sdgfeie.underdiscs;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import net.sdgfeie.underdiscs.init.UDCreativeMenu;
import net.sdgfeie.underdiscs.init.UDItemTags;
import net.sdgfeie.underdiscs.init.UDItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Underdiscs implements ModInitializer {
    public static final String MOD_ID = "underdiscs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        UDItems.resister();
        UDItemTags.register();
        UDCreativeMenu.register();
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}