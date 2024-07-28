package special.Entity.client;

import com.example.TemplateMod;
import com.example.registry.ModModelLayers;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import special.Entity.custom.AloearthEntity;

public class AloearthRender extends MobEntityRenderer<AloearthEntity, Aloearth<AloearthEntity>> {
    private static final Identifier TEXTURE = new Identifier(TemplateMod.MOD_ID,"textures/entity/aloearth.png");
    public AloearthRender(EntityRendererFactory.Context context) {
        super(context, new Aloearth<>(context.getPart(ModModelLayers.ALOEARTH)),0.6f);
    }

    @Override
    public Identifier getTexture(AloearthEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(AloearthEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()){
            matrixStack.scale(0.5f,0.5f,0.5f);
        }
        else{
            matrixStack.scale(1f,1f,1f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

}
