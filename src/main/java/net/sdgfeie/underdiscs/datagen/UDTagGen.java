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
import net.sdgfeie.underdiscs.init.UDItems;
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

        this.getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(UDItems.disc_001)
                .add(UDItems.disc_002)
                .add(UDItems.disc_003)
                .add(UDItems.disc_004)
                .add(UDItems.disc_005)
                .add(UDItems.disc_006)
                .add(UDItems.disc_007)
                .add(UDItems.disc_008)
                .add(UDItems.disc_009)
                .add(UDItems.disc_010)
                .add(UDItems.disc_011)
                .add(UDItems.disc_012)
                .add(UDItems.disc_013)
                .add(UDItems.disc_014)
                .add(UDItems.disc_015)
                .add(UDItems.disc_016)
                .add(UDItems.disc_017)
                .add(UDItems.disc_018)
                .add(UDItems.disc_019)
                .add(UDItems.disc_020)
                .add(UDItems.disc_021)
                .add(UDItems.disc_022)
                .add(UDItems.disc_023)
                .add(UDItems.disc_024)
                .add(UDItems.disc_025)
                .add(UDItems.disc_026)
                .add(UDItems.disc_027)
                .add(UDItems.disc_028)
                .add(UDItems.disc_029)
                .add(UDItems.disc_030)
                .add(UDItems.disc_031)
                .add(UDItems.disc_032)
                .add(UDItems.disc_033)
                .add(UDItems.disc_034)
                .add(UDItems.disc_035)
                .add(UDItems.disc_036)
                .add(UDItems.disc_037)
                .add(UDItems.disc_038)
                .add(UDItems.disc_039)
                .add(UDItems.disc_040)
                .add(UDItems.disc_041)
                .add(UDItems.disc_042)
                .add(UDItems.disc_043)
                .add(UDItems.disc_044)
                .add(UDItems.disc_045)
                .add(UDItems.disc_046)
                .add(UDItems.disc_047)
                .add(UDItems.disc_048)
                .add(UDItems.disc_049)
                .add(UDItems.disc_050)
                .add(UDItems.disc_051)
                .add(UDItems.disc_052)
                .add(UDItems.disc_053)
                .add(UDItems.disc_054)
                .add(UDItems.disc_055)
                .add(UDItems.disc_056)
                .add(UDItems.disc_057)
                .add(UDItems.disc_058)
                .add(UDItems.disc_059)
                .add(UDItems.disc_060)
                .add(UDItems.disc_061)
                .add(UDItems.disc_062)
                .add(UDItems.disc_063)
                .add(UDItems.disc_064)
                .add(UDItems.disc_065)
                .add(UDItems.disc_066)
                .add(UDItems.disc_067)
                .add(UDItems.disc_068)
                .add(UDItems.disc_069)
                .add(UDItems.disc_070)
                .add(UDItems.disc_071)
                .add(UDItems.disc_072)
                .add(UDItems.disc_073)
                .add(UDItems.disc_074)
                .add(UDItems.disc_075)
                .add(UDItems.disc_076)
                .add(UDItems.disc_077)
                .add(UDItems.disc_078)
                .add(UDItems.disc_079)
                .add(UDItems.disc_080)
                .add(UDItems.disc_081)
                .add(UDItems.disc_082)
                .add(UDItems.disc_083)
                .add(UDItems.disc_084)
                .add(UDItems.disc_085)
                .add(UDItems.disc_086)
                .add(UDItems.disc_087)
                .add(UDItems.disc_088)
                .add(UDItems.disc_089)
                .add(UDItems.disc_090)
                .add(UDItems.disc_091)
                .add(UDItems.disc_092)
                .add(UDItems.disc_093)
                .add(UDItems.disc_094)
                .add(UDItems.disc_095)
                .add(UDItems.disc_096)
                .add(UDItems.disc_097)
                .add(UDItems.disc_098)
                .add(UDItems.disc_099)
                .add(UDItems.disc_100)
                .add(UDItems.disc_101);
    }
}
