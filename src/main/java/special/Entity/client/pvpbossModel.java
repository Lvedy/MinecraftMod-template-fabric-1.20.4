package special.Entity.client;

import com.example.TemplateMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;
import special.Entity.custom.pvpbossEntity;

public class pvpbossModel extends GeoModel<pvpbossEntity> {
    public Identifier getModelResource(pvpbossEntity animatable) {
        return new Identifier(TemplateMod.MOD_ID,"geo/pvpboss.geo.json");
    }

    @Override
    public Identifier getTextureResource(pvpbossEntity animatable) {
        return new Identifier(TemplateMod.MOD_ID,"textures/entity/pvpboss.png");
    }

    @Override
    public Identifier getAnimationResource(pvpbossEntity animatable) {
        return new Identifier(TemplateMod.MOD_ID,"animations/pvpboss.animation.json");
    }

    @Override
    public void setCustomAnimations(pvpbossEntity animatable, long instanceId, AnimationState<pvpbossEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");
        if((head != null) && (!animatable.isAttacking2())){
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
