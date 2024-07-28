package com.example.registry;

import com.example.TemplateMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {  //都什么年代，还在注册传统渲染
    public static final EntityModelLayer ALOEARTH =
            new EntityModelLayer(new Identifier(TemplateMod.MOD_ID,"aloearth"),"main");
}
