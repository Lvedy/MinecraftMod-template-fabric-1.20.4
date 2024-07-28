package special.Entity.client;

import com.example.TemplateMod;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import special.Entity.custom.Horizon_ArcEntity;

public class Horizon_ArcRender extends GeoEntityRenderer<Horizon_ArcEntity> {
    public Horizon_ArcRender(EntityRendererFactory.Context renderManager) {
        super(renderManager, new Horizon_ArcModel());
    }

    @Override
    public Identifier getTextureLocation(Horizon_ArcEntity animatable) {
        return new Identifier(TemplateMod.MOD_ID,"textures/entity/horizon_arc.png");
    }

    @Override
    public void render(Horizon_ArcEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()){
            poseStack.scale(0.5f,0.5f,0.5f);
        }
        else
            poseStack.scale(1f,1f,1f);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
