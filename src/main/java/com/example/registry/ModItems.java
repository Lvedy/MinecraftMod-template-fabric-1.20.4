package com.example.registry;

import com.example.TemplateMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import special.ItemType.CommonBlockItem;
import special.ItemType.CommonItem;

public class ModItems {
    public static final CommonItem qishui_item = registerItem("qishui_item",new CommonItem(new FabricItemSettings(),"qishuiing.qishui_item.introduce", Formatting.GRAY));
    public static final CommonBlockItem aloearth = registerItem("aloearth",new CommonBlockItem(ModBlock.Aloearth,new FabricItemSettings()));
    public static final CommonItem straw = registerItem("straw",new CommonItem(new FabricItemSettings(),"可以用于喝汽水",Formatting.GRAY));
    public static final CommonBlockItem qishui_block = registerItem("qishui_block",new CommonBlockItem(ModBlock.qishui_block,new FabricItemSettings(),"qishuiing.qishui_block.introduce",Formatting.GRAY));
    public static final CommonBlockItem full_qishui = registerItem("full_qishui",new CommonBlockItem(ModBlock.full_qishui,new FabricItemSettings()));
    public static final CommonBlockItem empty_qishui = registerItem("empty_qishui",new CommonBlockItem(ModBlock.empty_qishui,new FabricItemSettings()));
    public static final CommonBlockItem shixiang = registerItem("shixiang",new CommonBlockItem(ModBlock.shixiang,new FabricItemSettings()));
    public static final Item aloearth_spawn_egg = registerItem("aloearth_spawn_egg",new SpawnEggItem(ModEntity.ALOEARTH,0xa86518,0x3b260f,new FabricItemSettings()));
    public static CommonItem registerItem(String name, CommonItem item){
        CommonItem registerItem;
        registerItem = Registry.register(Registries.ITEM, new Identifier(TemplateMod.MOD_ID, name), item);
        return registerItem;
    };
    public static CommonBlockItem registerItem(String name, CommonBlockItem item){
        CommonBlockItem registerItem;
        registerItem = Registry.register(Registries.ITEM, new Identifier(TemplateMod.MOD_ID, name), item);
        return registerItem;
    };
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TemplateMod.MOD_ID, name), item);
    };
    public static void main_registerItem(){

    }
}
