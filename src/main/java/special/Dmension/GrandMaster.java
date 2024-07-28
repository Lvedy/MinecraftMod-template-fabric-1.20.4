package special.Dmension;

import com.example.TemplateMod;
import com.example.registry.ModBlock;
import com.example.registry.ModItems;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;

public class GrandMaster {
    public static void Door(){
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlock.Aloearth)
                .lightWithItem(ModItems.qishui_item)
                .destDimID(new Identifier(TemplateMod.MOD_ID, "grandmaster"))
                .tintColor(0xc76efa)
                .registerPortal();
    }
}
