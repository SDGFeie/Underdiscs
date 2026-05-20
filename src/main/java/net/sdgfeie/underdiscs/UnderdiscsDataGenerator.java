package net.sdgfeie.underdiscs;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.sdgfeie.underdiscs.datagen.UDLangGen;
import net.sdgfeie.underdiscs.datagen.UDRecipeGen;
import net.sdgfeie.underdiscs.datagen.UDTagGen;
import net.sdgfeie.underdiscs.datagen.UdModelGen;

public class UnderdiscsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(UDLangGen::new);
        pack.addProvider(UDRecipeGen::new);
        pack.addProvider(UDTagGen::new);
        pack.addProvider(UdModelGen::new);
	}
}
