package special.Entity.client;

import com.example.TemplateMod;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import special.Entity.custom.pvpbossEntity;

public class pvpbossRender extends GeoEntityRenderer<pvpbossEntity> {
    public pvpbossRender(EntityRendererFactory.Context renderManager) {
        super(renderManager, new pvpbossModel());
    }

    @Override
    public Identifier getTextureLocation(pvpbossEntity animatable) {
        return new Identifier(TemplateMod.MOD_ID,"textures/entity/pvpboss.png");
    }

    @Override
    public void render(pvpbossEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
            poseStack.scale(1.8f,1.8f,1.8f);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
