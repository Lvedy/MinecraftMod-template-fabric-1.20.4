package com.example.registry;

import com.example.TemplateMod;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import special.Entity.client.Aloearth;
import special.Entity.client.AloearthRender;
import special.Entity.client.Horizon_ArcRender;
import special.Entity.client.pvpbossRender;
import special.Entity.custom.AloearthEntity;
import special.Entity.custom.Horizon_ArcEntity;
import special.Entity.custom.pvpbossEntity;

public class ModEntity {
    public static final EntityType<AloearthEntity> ALOEARTH = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TemplateMod.MOD_ID,"aloearth"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,AloearthEntity::new).
                    dimensions(EntityDimensions.fixed(1f,1f)).build());

    public static final EntityType<Horizon_ArcEntity> HORIZON_ARC = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TemplateMod.MOD_ID,"horizon_arc"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,Horizon_ArcEntity::new).
                    dimensions(EntityDimensions.fixed(1f,0.8f)).build());

    public static final EntityType<pvpbossEntity> PVP_BOSS = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TemplateMod.MOD_ID,"pvp_boss"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,pvpbossEntity::new).
                    dimensions(EntityDimensions.fixed(1.0f,3.0f)).build());

    public static void main_registerEntity(){
        //Aloearth
        FabricDefaultAttributeRegistry.register(ModEntity.ALOEARTH, AloearthEntity.createrAloearthEntity());
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ALOEARTH, Aloearth::getTexturedModelData);
        EntityRendererRegistry.register(ModEntity.ALOEARTH, AloearthRender::new);
        //Horizon_Arc
        FabricDefaultAttributeRegistry.register(ModEntity.HORIZON_ARC,Horizon_ArcEntity.createrHorizon_ArcEntity());
        EntityRendererRegistry.register(ModEntity.HORIZON_ARC, Horizon_ArcRender::new);
        //pvp_boss
        FabricDefaultAttributeRegistry.register(ModEntity.PVP_BOSS,pvpbossEntity.createrpvpboss());
        EntityRendererRegistry.register(ModEntity.PVP_BOSS, pvpbossRender::new);
    }
}
