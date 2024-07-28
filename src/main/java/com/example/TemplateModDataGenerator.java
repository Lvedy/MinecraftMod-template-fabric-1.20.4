package com.example;

import com.example.datagen.ModWorldGenerator;
import com.example.registry.ModDimension;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class TemplateModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		//FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		//pack.addProvider(ModWorldGenerator::new);
	}

	public void buildRegistry(RegistryBuilder registryBuilder) {
		//registryBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, ModDimension::bootstrapType);
	}
}
