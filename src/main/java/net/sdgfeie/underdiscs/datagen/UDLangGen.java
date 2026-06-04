package net.sdgfeie.underdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.data.client.Models;
import net.minecraft.item.ItemStack;
import net.sdgfeie.underdiscs.Underdiscs;
import net.sdgfeie.underdiscs.init.UDCreativeMenu;
import net.sdgfeie.underdiscs.init.UDItems;

public class UDLangGen extends FabricLanguageProvider {
    public UDLangGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        for (ItemStack discStack : UDItems.DISCS) {
            translationBuilder.add(discStack.getItem(), "Music Disc");
        }
        translationBuilder.add("menu.creative.underdiscs.discs", "Underlate Music Discs");

        translationBuilder.add(UDItems.disc_001.getTranslationKey() + ".desc", "Toby Fox - Once Upon A Time");
        translationBuilder.add(UDItems.disc_002.getTranslationKey() + ".desc", "Toby Fox - Start Menu");
        translationBuilder.add(UDItems.disc_003.getTranslationKey() + ".desc", "Toby Fox - Your Best Friend");
        translationBuilder.add(UDItems.disc_004.getTranslationKey() + ".desc", "Toby Fox - Fallen Down");
        translationBuilder.add(UDItems.disc_005.getTranslationKey() + ".desc", "Toby Fox - Ruins");
        translationBuilder.add(UDItems.disc_006.getTranslationKey() + ".desc", "Toby Fox - Uwa!! So Temperate");
        translationBuilder.add(UDItems.disc_007.getTranslationKey() + ".desc", "Toby Fox - Anticipation");
        translationBuilder.add(UDItems.disc_008.getTranslationKey() + ".desc", "Toby Fox - Unnecessary Tension");
        translationBuilder.add(UDItems.disc_009.getTranslationKey() + ".desc", "Toby Fox - Enemy Approaching");
        translationBuilder.add(UDItems.disc_010.getTranslationKey() + ".desc", "Toby Fox - Ghost Fight");
        translationBuilder.add(UDItems.disc_011.getTranslationKey() + ".desc", "Toby Fox - Determination");
        translationBuilder.add(UDItems.disc_012.getTranslationKey() + ".desc", "Toby Fox - Home");
        translationBuilder.add(UDItems.disc_013.getTranslationKey() + ".desc", "Toby Fox - Home (Music Box)");
        translationBuilder.add(UDItems.disc_014.getTranslationKey() + ".desc", "Toby Fox - Heartache");
        translationBuilder.add(UDItems.disc_015.getTranslationKey() + ".desc", "Toby Fox - sans.");
        translationBuilder.add(UDItems.disc_016.getTranslationKey() + ".desc", "Toby Fox - Nyeh Heh Heh!");
        translationBuilder.add(UDItems.disc_017.getTranslationKey() + ".desc", "Toby Fox - Snowy");
        translationBuilder.add(UDItems.disc_018.getTranslationKey() + ".desc", "Toby Fox - Uwa!! So Holiday");
        translationBuilder.add(UDItems.disc_019.getTranslationKey() + ".desc", "Toby Fox - Dogbass");
        translationBuilder.add(UDItems.disc_020.getTranslationKey() + ".desc", "Toby Fox - Mysterious Place");
        translationBuilder.add(UDItems.disc_021.getTranslationKey() + ".desc", "Toby Fox - Dogsong");
        translationBuilder.add(UDItems.disc_022.getTranslationKey() + ".desc", "Toby Fox - Snowdin Town");
        translationBuilder.add(UDItems.disc_023.getTranslationKey() + ".desc", "Toby Fox - Shop");
        translationBuilder.add(UDItems.disc_024.getTranslationKey() + ".desc", "Toby Fox - Bonetrousle");
        translationBuilder.add(UDItems.disc_025.getTranslationKey() + ".desc", "Toby Fox - Dating Start!");
        translationBuilder.add(UDItems.disc_026.getTranslationKey() + ".desc", "Toby Fox - Dating Tense!");
        translationBuilder.add(UDItems.disc_027.getTranslationKey() + ".desc", "Toby Fox - Dating Fight!");
        translationBuilder.add(UDItems.disc_028.getTranslationKey() + ".desc", "Toby Fox - Premonition");
        translationBuilder.add(UDItems.disc_029.getTranslationKey() + ".desc", "Toby Fox - Danger Mystery");
        translationBuilder.add(UDItems.disc_030.getTranslationKey() + ".desc", "Toby Fox - Undyne");
        translationBuilder.add(UDItems.disc_031.getTranslationKey() + ".desc", "Toby Fox - Waterfall");
        translationBuilder.add(UDItems.disc_032.getTranslationKey() + ".desc", "Toby Fox - Run!");
        translationBuilder.add(UDItems.disc_033.getTranslationKey() + ".desc", "Toby Fox - Quiet Water");
        translationBuilder.add(UDItems.disc_034.getTranslationKey() + ".desc", "Toby Fox - Memory");
        translationBuilder.add(UDItems.disc_035.getTranslationKey() + ".desc", "Toby Fox - Bird That Carries You Over A Disproportionately Small Gap");
        translationBuilder.add(UDItems.disc_036.getTranslationKey() + ".desc", "Toby Fox - Dummy!");
        translationBuilder.add(UDItems.disc_037.getTranslationKey() + ".desc", "Toby Fox - Pathetic House");
        translationBuilder.add(UDItems.disc_038.getTranslationKey() + ".desc", "Toby Fox - Spooktune");
        translationBuilder.add(UDItems.disc_039.getTranslationKey() + ".desc", "Toby Fox - Spookwave");
        translationBuilder.add(UDItems.disc_040.getTranslationKey() + ".desc", "Toby Fox - Ghouliday");
        translationBuilder.add(UDItems.disc_041.getTranslationKey() + ".desc", "Toby Fox - Chill");
        translationBuilder.add(UDItems.disc_042.getTranslationKey() + ".desc", "Toby Fox - Thundersnail");
        translationBuilder.add(UDItems.disc_043.getTranslationKey() + ".desc", "Toby Fox - Temmie Village");
        translationBuilder.add(UDItems.disc_044.getTranslationKey() + ".desc", "Toby Fox - Tem Shop");
        translationBuilder.add(UDItems.disc_045.getTranslationKey() + ".desc", "Toby Fox - NGAHHH!!");
        translationBuilder.add(UDItems.disc_046.getTranslationKey() + ".desc", "Toby Fox - Spear of Justice");
        translationBuilder.add(UDItems.disc_047.getTranslationKey() + ".desc", "Toby Fox - Ooo");
        translationBuilder.add(UDItems.disc_048.getTranslationKey() + ".desc", "Toby Fox - Alphys");
        translationBuilder.add(UDItems.disc_049.getTranslationKey() + ".desc", "Toby Fox - It's Showtime!");
        translationBuilder.add(UDItems.disc_050.getTranslationKey() + ".desc", "Toby Fox - Metal Crusher");
        translationBuilder.add(UDItems.disc_051.getTranslationKey() + ".desc", "Toby Fox - Another Medium");
        translationBuilder.add(UDItems.disc_052.getTranslationKey() + ".desc", "Toby Fox - Uwa!! So HEATS!!");
        translationBuilder.add(UDItems.disc_053.getTranslationKey() + ".desc", "Toby Fox - Stronger Monsters");
        translationBuilder.add(UDItems.disc_054.getTranslationKey() + ".desc", "Toby Fox - Hotel");
        translationBuilder.add(UDItems.disc_055.getTranslationKey() + ".desc", "Toby Fox - Can You Really Call This A Hotel, I Didn't Receive A Mint On My Pillow Or Anything");
        translationBuilder.add(UDItems.disc_056.getTranslationKey() + ".desc", "Toby Fox - Confession");
        translationBuilder.add(UDItems.disc_057.getTranslationKey() + ".desc", "Toby Fox - Live Report");
        translationBuilder.add(UDItems.disc_058.getTranslationKey() + ".desc", "Toby Fox - Death Report");
        translationBuilder.add(UDItems.disc_059.getTranslationKey() + ".desc", "Toby Fox - Spider Dance");
        translationBuilder.add(UDItems.disc_060.getTranslationKey() + ".desc", "Toby Fox - Wrong Enemy !?");
        translationBuilder.add(UDItems.disc_061.getTranslationKey() + ".desc", "Toby Fox - Oh! One True Love");
        translationBuilder.add(UDItems.disc_062.getTranslationKey() + ".desc", "Toby Fox - Oh! Dungeon");
        translationBuilder.add(UDItems.disc_063.getTranslationKey() + ".desc", "Toby Fox - It's Raining Somewhere Else");
        translationBuilder.add(UDItems.disc_064.getTranslationKey() + ".desc", "Toby Fox - CORE Approach");
        translationBuilder.add(UDItems.disc_065.getTranslationKey() + ".desc", "Toby Fox - CORE");
        translationBuilder.add(UDItems.disc_066.getTranslationKey() + ".desc", "Toby Fox - Last Episode!");
        translationBuilder.add(UDItems.disc_067.getTranslationKey() + ".desc", "Toby Fox - Oh My...");
        translationBuilder.add(UDItems.disc_068.getTranslationKey() + ".desc", "Toby Fox - Death By Glamour");
        translationBuilder.add(UDItems.disc_069.getTranslationKey() + ".desc", "Toby Fox - For the Fans");
        translationBuilder.add(UDItems.disc_070.getTranslationKey() + ".desc", "Toby Fox - Long Elevator");
        translationBuilder.add(UDItems.disc_071.getTranslationKey() + ".desc", "Toby Fox - Undertale");
        translationBuilder.add(UDItems.disc_072.getTranslationKey() + ".desc", "Toby Fox - Song That Might Play When You Fight Sans");
        translationBuilder.add(UDItems.disc_073.getTranslationKey() + ".desc", "Toby Fox - The Choice");
        translationBuilder.add(UDItems.disc_074.getTranslationKey() + ".desc", "Toby Fox - Small Shock");
        translationBuilder.add(UDItems.disc_075.getTranslationKey() + ".desc", "Toby Fox - Barrier");
        translationBuilder.add(UDItems.disc_076.getTranslationKey() + ".desc", "Toby Fox - Bergentrückung");
        translationBuilder.add(UDItems.disc_077.getTranslationKey() + ".desc", "Toby Fox - ASGORE");
        translationBuilder.add(UDItems.disc_078.getTranslationKey() + ".desc", "Toby Fox - You Idiot");
        translationBuilder.add(UDItems.disc_079.getTranslationKey() + ".desc", "Toby Fox - Your Best Nightmare");
        translationBuilder.add(UDItems.disc_080.getTranslationKey() + ".desc", "Toby Fox - Finale");
        translationBuilder.add(UDItems.disc_081.getTranslationKey() + ".desc", "Toby Fox - An Ending");
        translationBuilder.add(UDItems.disc_082.getTranslationKey() + ".desc", "Toby Fox - She's Playing Piano");
        translationBuilder.add(UDItems.disc_083.getTranslationKey() + ".desc", "Toby Fox - Here We Are");
        translationBuilder.add(UDItems.disc_084.getTranslationKey() + ".desc", "Toby Fox - Amalgam");
        translationBuilder.add(UDItems.disc_085.getTranslationKey() + ".desc", "Toby Fox - Fallen Down (Reprise)");
        translationBuilder.add(UDItems.disc_086.getTranslationKey() + ".desc", "Toby Fox - Don't Give Up");
        translationBuilder.add(UDItems.disc_087.getTranslationKey() + ".desc", "Toby Fox - Hopes And Dreams");
        translationBuilder.add(UDItems.disc_088.getTranslationKey() + ".desc", "Toby Fox - Burn In Despair!");
        translationBuilder.add(UDItems.disc_089.getTranslationKey() + ".desc", "Toby Fox - SAVE The World");
        translationBuilder.add(UDItems.disc_090.getTranslationKey() + ".desc", "Toby Fox - His Theme");
        translationBuilder.add(UDItems.disc_091.getTranslationKey() + ".desc", "Toby Fox - Final Power");
        translationBuilder.add(UDItems.disc_092.getTranslationKey() + ".desc", "Toby Fox - Reunited");
        translationBuilder.add(UDItems.disc_093.getTranslationKey() + ".desc", "Toby Fox - Menu (Full)");
        translationBuilder.add(UDItems.disc_094.getTranslationKey() + ".desc", "Toby Fox - Respite");
        translationBuilder.add(UDItems.disc_095.getTranslationKey() + ".desc", "Toby Fox - Bring It In, Guys!");
        translationBuilder.add(UDItems.disc_096.getTranslationKey() + ".desc", "Toby Fox - Last Goodbye");
        translationBuilder.add(UDItems.disc_097.getTranslationKey() + ".desc", "Toby Fox - But The Earth Refused To Die");
        translationBuilder.add(UDItems.disc_098.getTranslationKey() + ".desc", "Toby Fox - Battle Against A True Hero");
        translationBuilder.add(UDItems.disc_099.getTranslationKey() + ".desc", "Toby Fox - Power of \"NEO\"");
        translationBuilder.add(UDItems.disc_100.getTranslationKey() + ".desc", "Toby Fox - MEGALOVANIA");
        translationBuilder.add(UDItems.disc_101.getTranslationKey() + ".desc", "Toby Fox - Good Night");
    }
}
