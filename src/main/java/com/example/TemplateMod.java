package com.example;

import com.example.registry.*;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import special.Entity.client.Aloearth;
import special.Entity.client.AloearthRender;
import special.Entity.custom.AloearthEntity;

public class TemplateMod implements ModInitializer {
	public static final String MOD_ID = "qishuiing";
    public static final Logger LOGGER = LoggerFactory.getLogger("qishuiing-mod");

	@Override
	public void onInitialize() {
		ModBlock.main_registerBlock();
		ModItems.main_registerItem();
		ModItemGroup.main_registerItemGroup();
		ModStatusEffect.main_registerStatusEffect();
		ModEntity.main_registerEntity();
		ModDimension.main_registerDimensionDoor();
		LOGGER.info("Hello Fabric world!");
	}
}