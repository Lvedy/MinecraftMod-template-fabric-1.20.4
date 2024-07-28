package com.example.registry;

import com.example.TemplateMod;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import special.StatusEffect.QishuiStatusEffect;

public class ModStatusEffect {
    public static final StatusEffect qishui_effect = Registry.register(Registries.STATUS_EFFECT,new Identifier(TemplateMod.MOD_ID,"qishui_effect"),new QishuiStatusEffect());
    public static void main_registerStatusEffect(){

    }
}
