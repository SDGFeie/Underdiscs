package net.sdgfeie.underdiscs;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.sdgfeie.datagen.UDLangGen;
import net.sdgfeie.datagen.UDRecipeGen;

public class UnderdiscsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(UDLangGen::new);
        pack.addProvider(UDRecipeGen::new);
	}
}
