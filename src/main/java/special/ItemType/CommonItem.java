package special.ItemType;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CommonItem extends Item {
    protected String ItemIntroduce = "default";
    protected Formatting color = Formatting.GRAY;
    public CommonItem(Settings settings,String introduce,Formatting formatting) {
        super(settings);
        ItemIntroduce = introduce;
        color = formatting;
    }
    public CommonItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (!ItemIntroduce.equals("default")) {
            tooltip.add(Text.translatable(ItemIntroduce).formatted(color));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
