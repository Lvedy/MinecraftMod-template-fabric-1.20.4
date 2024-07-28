package com.example.registry;

import com.example.TemplateMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup test_ItemGroup = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TemplateMod.MOD_ID,"qishui_item_group"),FabricItemGroup.builder().displayName(Text.translatable("itemgroup.qishuiing")).
                    icon(()->new ItemStack(ModItems.qishui_item)).entries((displayContext, entries) -> {
                        entries.add(ModItems.qishui_item); //从这里添加该选项卡所拥有的物品
                        entries.add(ModItems.qishui_block);
                        entries.add(ModItems.full_qishui);
                        entries.add(ModItems.empty_qishui);
                        entries.add(ModItems.aloearth);
                        entries.add(ModItems.straw);
                        entries.add(ModItems.aloearth_spawn_egg);
                    }).build());
    public static void main_registerItemGroup(){

    }
}
