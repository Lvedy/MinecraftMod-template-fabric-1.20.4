package special.Entity.client;

import com.example.TemplateMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;
import special.Entity.custom.Horizon_ArcEntity;

public class Horizon_ArcModel extends GeoModel<Horizon_ArcEntity> {
    @Override
    public Identifier getModelResource(Horizon_ArcEntity animatable) {
        return new Identifier(TemplateMod.MOD_ID,"geo/horizon_arc.geo.json");
    }

    @Override
    public Identifier getTextureResource(Horizon_ArcEntity animatable) {
        return new Identifier(TemplateMod.MOD_ID,"textures/entity/horizon_arc.png");
    }

    @Override
    public Identifier getAnimationResource(Horizon_ArcEntity animatable) {
        return new Identifier(TemplateMod.MOD_ID,"animations/horizon_arc.animation.json");
    }

    @Override
    public void setCustomAnimations(Horizon_ArcEntity animatable, long instanceId, AnimationState<Horizon_ArcEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");
        if(head != null){
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
