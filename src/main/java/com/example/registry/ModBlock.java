package com.example.registry;

import com.example.TemplateMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import special.Block.Qishui_Block;
import special.Block.Shixiang;

public class ModBlock {
    public static final Block Aloearth = registerBlock("aloearth",new Block(FabricBlockSettings.create().strength(2.0f,2.0f)));
    public static final Qishui_Block qishui_block = registerBlock("qishui_block",new Qishui_Block(FabricBlockSettings.create().strength(2.0f,5.0f),false,false));
    public static final Qishui_Block full_qishui = registerBlock("full_qishui",new Qishui_Block(FabricBlockSettings.create().strength(2.0f,5.0f),true,false));
    public static final Qishui_Block empty_qishui = registerBlock("empty_qishui",new Qishui_Block(FabricBlockSettings.create().strength(2.0f,5.0f),true,true));
    public static final Shixiang shixiang = registerBlock("shixiang",new Shixiang(FabricBlockSettings.create().strength(2.0f,5.0f)));
    public static Block registerBlock(String name, Block block){
        Block registerBlock;
        registerBlock = Registry.register(Registries.BLOCK, new Identifier(TemplateMod.MOD_ID, name), block);
        return registerBlock;
    };
    public static Qishui_Block registerBlock(String name, Qishui_Block block){
        Qishui_Block registerBlock;
        registerBlock = Registry.register(Registries.BLOCK, new Identifier(TemplateMod.MOD_ID, name), block);
        return registerBlock;
    };
    public static Shixiang registerBlock(String name, Shixiang block){
        Shixiang registerBlock;
        registerBlock = Registry.register(Registries.BLOCK, new Identifier(TemplateMod.MOD_ID, name), block);
        return registerBlock;
    };
    public static void main_registerBlock(){

    }
}
