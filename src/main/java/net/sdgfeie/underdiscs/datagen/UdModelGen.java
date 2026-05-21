package net.sdgfeie.underdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ItemStack;
import net.sdgfeie.underdiscs.init.UDItems;

public class UdModelGen extends FabricModelProvider {
    public UdModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (ItemStack discStack : UDItems.DISCS) {
            itemModelGenerator.register(discStack.getItem(), Models.GENERATED);
        }
    }
}
