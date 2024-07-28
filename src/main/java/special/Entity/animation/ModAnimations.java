package special.Entity.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class ModAnimations { //传统动画

    public static final Animation WALKER = Animation.Builder.create(1.4167667f).looping()
            .addBoneAnimation("feet00",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.4167667f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.0834333f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.4167667f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("feet01",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.4167667f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.0834333f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.4167667f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("feet10",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.4167667f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.0834333f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.4167667f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("feet11",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.4167667f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.0834333f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.4167667f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR))).build();
    public static final Animation IDLE = Animation.Builder.create(1f)
            .addBoneAnimation("body",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createTranslationalVector(0f, -1f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR))).build();
}
