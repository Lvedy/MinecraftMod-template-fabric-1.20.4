package special.StatusEffect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.text.Text;

public class QishuiStatusEffect extends StatusEffect {
    public QishuiStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x6a4097);
    }
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 40 >> amplifier;
        if (i > 0) {
            return duration % i == 0;
        }
        return true;
    }

    public void applyUpdateEffect(LivingEntity entity,int amplifier) {
        if ((entity instanceof PlayerEntity) && (entity.getWorld().isClient)) {
            ((PlayerEntity) entity).sendMessage(Text.of("还是建筑大佬"));
        }
    }
}
