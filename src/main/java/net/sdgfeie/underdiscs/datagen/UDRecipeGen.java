package net.sdgfeie.underdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.sdgfeie.underdiscs.init.UDItemTags;
import net.sdgfeie.underdiscs.init.UDItems;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.function.Consumer;

public class UDRecipeGen extends FabricRecipeProvider {
    public UDRecipeGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_001)
                .input(UDItems.disc_base)
                .input(Items.WRITTEN_BOOK)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_002)
                .input(UDItems.disc_001)
                .criterion("has_disc_001", conditionsFromItem(UDItems.disc_001))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_003)
                .input(UDItems.disc_base)
                .input(Items.SUNFLOWER)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_004)
                .input(UDItems.disc_base)
                .input(Items.GOAT_HORN)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_005)
                .input(UDItems.disc_base)
                .input(Blocks.STONE_BRICKS.asItem())
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_006)
                .input(UDItems.disc_base)
                .input(ItemTags.LEAVES)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_007)
                .input(UDItems.disc_009)
                .criterion("has_disc_009", conditionsFromItem(UDItems.disc_009))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_008)
                .input(UDItems.disc_base)
                .input(Items.SUGAR)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_009)
                .input(UDItems.disc_base)
                .input(Items.IRON_SWORD)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_010)
                .input(UDItems.disc_base)
                .input(Items.GHAST_TEAR)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_011)
                .input(UDItems.disc_base)
                .input(Items.PLAYER_HEAD)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_012)
                .input(UDItems.disc_base)
                .input(ItemTags.BEDS)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_013)
                .input(UDItems.disc_012)
                .criterion("has_disc_012", conditionsFromItem(UDItems.disc_012))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_014)
                .input(UDItems.disc_009)
                .input(Items.GOAT_HORN)
                .criterion("has_disc_009", conditionsFromItem(UDItems.disc_009))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_015)
                .input(UDItems.disc_base)
                .input(Items.SKELETON_SKULL)
                .input(Items.BONE)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_016)
                .input(UDItems.disc_base)
                .input(Items.SKELETON_SKULL)
                .input(ModItems.PASTA_WITH_MEATBALLS.get())
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_017)
                .input(UDItems.disc_base)
                .input(Items.SNOWBALL)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_018)
                .input(UDItems.disc_006)
                .criterion("has_disc_006", conditionsFromItem(UDItems.disc_006))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_020)
                .input(UDItems.disc_base)
                .input(Items.SPYGLASS)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_021)
                .input(UDItems.disc_base)
                .input(Items.BONE)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_022)
                .input(UDItems.disc_base)
                .input(UDItemTags.ICE)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_023)
                .input(UDItems.disc_base)
                .input(Items.EMERALD)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_024)
                .input(UDItems.disc_016)
                .criterion("has_disc_016", conditionsFromItem(UDItems.disc_016))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_025)
                .input(UDItems.disc_base)
                .input(Items.RED_TULIP)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_026)
                .input(UDItems.disc_025)
                .criterion("has_disc_025", conditionsFromItem(UDItems.disc_025))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_027)
                .input(UDItems.disc_025)
                .criterion("has_disc_025", conditionsFromItem(UDItems.disc_025))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_028)
                .input(UDItems.disc_base)
                .input(Items.BLUE_ORCHID)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_029)
                .input(UDItems.disc_030)
                .criterion("has_disc_030", conditionsFromItem(UDItems.disc_030))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_030)
                .input(UDItems.disc_base)
                .input(Items.IRON_CHESTPLATE)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_031)
                .input(UDItems.disc_base)
                .input(Items.WATER_BUCKET)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_032)
                .input(UDItems.disc_030)
                .criterion("has_disc_030", conditionsFromItem(UDItems.disc_030))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_033)
                .input(UDItems.disc_base)
                .input(Items.POTION)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_034)
                .input(UDItems.disc_090)
                .criterion("has_disc_090", conditionsFromItem(UDItems.disc_090))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_035)
                .input(UDItems.disc_base)
                .input(Items.FEATHER)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_036)
                .input(UDItems.disc_base)
                .input(Items.ARMOR_STAND)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_037)
                .input(UDItems.disc_010)
                .criterion("has_disc_010", conditionsFromItem(UDItems.disc_010))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_038)
                .input(UDItems.disc_010)
                .criterion("has_disc_010", conditionsFromItem(UDItems.disc_010))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_039)
                .input(UDItems.disc_010)
                .criterion("has_disc_010", conditionsFromItem(UDItems.disc_010))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_040)
                .input(UDItems.disc_010)
                .criterion("has_disc_010", conditionsFromItem(UDItems.disc_010))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_041)
                .input(UDItems.disc_010)
                .criterion("has_disc_010", conditionsFromItem(UDItems.disc_010))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_042)
                .input(UDItems.disc_base)
                .input(UDItemTags.BLACK_WHITE_BANNER)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_043)
                .input(UDItems.disc_023)
                .input(Items.BONE)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_044)
                .input(UDItems.disc_043)
                .criterion("has_disc_043", conditionsFromItem(UDItems.disc_043))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_045)
                .input(UDItems.disc_base)
                .input(Items.TRIDENT)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_046)
                .input(UDItems.disc_045)
                .criterion("has_disc_045", conditionsFromItem(UDItems.disc_045))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_047)
                .input(UDItems.disc_base)
                .input(ItemTags.TERRACOTTA)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_048)
                .input(UDItems.disc_base)
                .input(Items.GLASS_PANE)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_049)
                .input(UDItems.disc_base)
                .input(Items.IRON_INGOT)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_050)
                .input(UDItems.disc_049)
                .criterion("has_disc_049", conditionsFromItem(UDItems.disc_049))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_051)
                .input(UDItems.disc_base)
                .input(Items.FLINT_AND_STEEL)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_052)
                .input(UDItems.disc_006)
                .criterion("has_disc_006", conditionsFromItem(UDItems.disc_006))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_053)
                .input(UDItems.disc_base)
                .input(Items.DIAMOND_SWORD)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_054)
                .input(UDItems.disc_base)
                .input(Items.BELL)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_055)
                .input(UDItems.disc_054)
                .criterion("has_disc_054", conditionsFromItem(UDItems.disc_054))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_056)
                .input(UDItems.disc_base)
                .input(Items.WHITE_TULIP)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_057)
                .input(UDItems.disc_base)
                .input(Items.OBSERVER)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_058)
                .input(UDItems.disc_057)
                .criterion("has_disc_057", conditionsFromItem(UDItems.disc_057))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_059)
                .input(UDItems.disc_base)
                .input(Items.SPIDER_EYE)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_060)
                .input(UDItems.disc_009)
                .criterion("has_disc_009", conditionsFromItem(UDItems.disc_009))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_061)
                .input(UDItems.disc_049)
                .input(Items.AMETHYST_SHARD)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_062)
                .input(UDItems.disc_061)
                .criterion("has_disc_061", conditionsFromItem(UDItems.disc_061))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_063)
                .input(UDItems.disc_033)
                .criterion("has_disc_033", conditionsFromItem(UDItems.disc_033))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_064)
                .input(UDItems.disc_065)
                .criterion("has_disc_065", conditionsFromItem(UDItems.disc_065))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_065)
                .input(UDItems.disc_base)
                .input(Items.NOTE_BLOCK)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_066)
                .input(UDItems.disc_049)
                .criterion("has_disc_049", conditionsFromItem(UDItems.disc_049))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_067)
                .input(UDItems.disc_049)
                .criterion("has_disc_049", conditionsFromItem(UDItems.disc_049))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_068)
                .input(UDItems.disc_base)
                .input(Items.JUKEBOX)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_069)
                .input(UDItems.disc_061)
                .criterion("has_disc_061", conditionsFromItem(UDItems.disc_061))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_070)
                .input(UDItems.disc_base)
                .input(Items.PISTON)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_071)
                .input(UDItems.disc_base)
                .input(Items.STRING)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_072)
                .input(UDItems.disc_015)
                .input(Items.WOODEN_SWORD)
                .criterion("has_disc_015", conditionsFromItem(UDItems.disc_015))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_073)
                .input(UDItems.disc_071)
                .criterion("has_disc_071", conditionsFromItem(UDItems.disc_071))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_074)
                .input(UDItems.disc_076)
                .criterion("has_disc_076", conditionsFromItem(UDItems.disc_076))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_075)
                .input(UDItems.disc_base)
                .input(UDItemTags.BARRIER)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_076)
                .input(UDItems.disc_base)
                .input(Items.DANDELION)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_077)
                .input(UDItems.disc_076)
                .input(UDItems.disc_009)
                .criterion("has_disc_076", conditionsFromItem(UDItems.disc_076))
                .criterion("has_disc_009", conditionsFromItem(UDItems.disc_009))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_078)
                .input(UDItems.disc_003)
                .criterion("has_disc_003", conditionsFromItem(UDItems.disc_003))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_079)
                .input(UDItems.disc_003)
                .input(UDItems.disc_009)
                .criterion("has_disc_003", conditionsFromItem(UDItems.disc_003))
                .criterion("has_disc_009", conditionsFromItem(UDItems.disc_009))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_080)
                .input(UDItems.disc_079)
                .input(Items.NETHER_STAR)
                .criterion("has_disc_079", conditionsFromItem(UDItems.disc_079))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_081)
                .input(UDItems.disc_005)
                .criterion("has_disc_005", conditionsFromItem(UDItems.disc_005))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_082)
                .input(UDItems.disc_030)
                .input(ItemTags.BEDS)
                .criterion("has_disc_030", conditionsFromItem(UDItems.disc_030))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_083)
                .input(UDItems.disc_048)
                .criterion("has_disc_048", conditionsFromItem(UDItems.disc_048))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_084)
                .input(UDItems.disc_009)
                .input(UDItems.disc_048)
                .criterion("has_disc_009", conditionsFromItem(UDItems.disc_009))
                .criterion("has_disc_048", conditionsFromItem(UDItems.disc_048))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_085)
                .input(UDItems.disc_004)
                .input(Items.DIAMOND)
                .criterion("has_disc_004", conditionsFromItem(UDItems.disc_004))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_086)
                .input(UDItems.disc_085)
                .input(UDItems.disc_015)
                .input(UDItems.disc_016)
                .input(UDItems.disc_045)
                .input(UDItems.disc_048)
                .input(UDItems.disc_059)
                .criterion("has_disc_085", conditionsFromItem(UDItems.disc_085))
                .criterion("has_disc_015", conditionsFromItem(UDItems.disc_015))
                .criterion("has_disc_016", conditionsFromItem(UDItems.disc_016))
                .criterion("has_disc_045", conditionsFromItem(UDItems.disc_045))
                .criterion("has_disc_048", conditionsFromItem(UDItems.disc_048))
                .criterion("has_disc_059", conditionsFromItem(UDItems.disc_059))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_087)
                .input(UDItems.disc_086)
                .input(Items.DIAMOND_SWORD)
                .criterion("has_disc_086", conditionsFromItem(UDItems.disc_086))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_088)
                .input(UDItems.disc_086)
                .input(Items.NETHERITE_SWORD)
                .criterion("has_disc_086", conditionsFromItem(UDItems.disc_086))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_089)
                .input(UDItems.disc_096)
                .criterion("has_disc_096", conditionsFromItem(UDItems.disc_096))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_090)
                .input(UDItems.disc_base)
                .input(Items.NETHER_STAR)
                .criterion("has_disc_base", conditionsFromItem(UDItems.disc_base))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_091)
                .input(UDItems.disc_075)
                .input(UDItems.disc_090)
                .criterion("has_disc_075", conditionsFromItem(UDItems.disc_075))
                .criterion("has_disc_090", conditionsFromItem(UDItems.disc_090))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_092)
                .input(UDItems.disc_071)
                .input(UDItems.disc_086)
                .criterion("has_disc_071", conditionsFromItem(UDItems.disc_071))
                .criterion("has_disc_086", conditionsFromItem(UDItems.disc_068))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_093)
                .input(UDItems.disc_071)
                .input(UDItems.disc_002)
                .criterion("has_disc_071", conditionsFromItem(UDItems.disc_071))
                .criterion("has_disc_002", conditionsFromItem(UDItems.disc_002))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_094)
                .input(UDItems.disc_071)
                .input(UDItems.disc_001)
                .criterion("has_disc_071", conditionsFromItem(UDItems.disc_071))
                .criterion("has_disc_001", conditionsFromItem(UDItems.disc_001))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_095)
                .input(UDItems.disc_071)
                .input(UDItems.disc_009)
                .criterion("has_disc_071", conditionsFromItem(UDItems.disc_071))
                .criterion("has_disc_009", conditionsFromItem(UDItems.disc_009))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_096)
                .input(UDItems.disc_071)
                .criterion("has_disc_071", conditionsFromItem(UDItems.disc_071))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_097)
                .input(UDItems.disc_045)
                .input(Items.TOTEM_OF_UNDYING)
                .criterion("has_disc_045", conditionsFromItem(UDItems.disc_045))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_098)
                .input(UDItems.disc_045)
                .input(Items.NETHERITE_SWORD)
                .criterion("has_disc_045", conditionsFromItem(UDItems.disc_045))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_099)
                .input(UDItems.disc_068)
                .input(Items.NETHERITE_SWORD)
                .criterion("has_disc_068", conditionsFromItem(UDItems.disc_068))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_100)
                .input(UDItems.disc_015)
                .input(Items.NETHERITE_SWORD)
                .criterion("has_disc_015", conditionsFromItem(UDItems.disc_015))
                .offerTo(consumer);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, UDItems.disc_101)
                .input(UDItems.disc_071)
                .input(ItemTags.BEDS)
                .criterion("has_disc_071", conditionsFromItem(UDItems.disc_071))
                .offerTo(consumer);
    }
}
