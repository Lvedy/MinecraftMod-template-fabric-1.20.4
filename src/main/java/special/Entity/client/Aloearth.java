package special.Entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import special.Entity.animation.ModAnimations;
import special.Entity.custom.AloearthEntity;

public class Aloearth<T extends AloearthEntity> extends SinglePartEntityModel<T> {
	private final ModelPart Aloearth;
	private final ModelPart head;
	public Aloearth(ModelPart root) {
		this.Aloearth = root.getChild("Aloearth");
		this.head = Aloearth.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Aloearth = modelPartData.addChild("Aloearth", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData feet11 = Aloearth.addChild("feet11", ModelPartBuilder.create().uv(32, 33).cuboid(-5.0F, 3.0F, -1.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, 6.0F));

		ModelPartData feet01 = Aloearth.addChild("feet01", ModelPartBuilder.create().uv(0, 8).cuboid(-5.0F, 3.0F, -1.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, -6.0F));

		ModelPartData feet10 = Aloearth.addChild("feet10", ModelPartBuilder.create().uv(0, 0).cuboid(1.0F, 3.0F, -1.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, 6.0F));

		ModelPartData feet00 = Aloearth.addChild("feet00", ModelPartBuilder.create().uv(24, 25).cuboid(1.0F, 3.0F, -1.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, -6.0F));

		ModelPartData body = Aloearth.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -13.0F, -8.0F, 10.0F, 9.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = Aloearth.addChild("head", ModelPartBuilder.create().uv(0, 25).cuboid(-4.0F, -6.0F, -6.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -11.0F, -6.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(AloearthEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw,headPitch);
		this.animateMovement(ModAnimations.WALKER,limbSwing,limbSwingAmount,2f,2.5f);
		this.updateAnimation(entity.idleAnimationState,ModAnimations.IDLE,ageInTicks,1f);
	}
	private void setHeadAngles(float headYaw,float headPitch){
		headYaw = MathHelper.clamp(headYaw,-30F,30F);
		headPitch = MathHelper.clamp(headYaw,-25F,45F);
		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Aloearth.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return Aloearth;
	}
}