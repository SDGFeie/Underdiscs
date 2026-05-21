package net.sdgfeie.underdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.sdgfeie.underdiscs.init.UDItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class UDTagGen extends FabricTagProvider.ItemTagProvider{


    public UDTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        this.getOrCreateTagBuilder(UDItemTags.ICE)
                .add(Items.ICE)
                .add(Items.BLUE_ICE)
                .add(Items.PACKED_ICE);

        this.getOrCreateTagBuilder(UDItemTags.BLACK_WHITE_BANNER)
                .add(Items.BLACK_BANNER)
                .add(Items.WHITE_BANNER);
    }
}
