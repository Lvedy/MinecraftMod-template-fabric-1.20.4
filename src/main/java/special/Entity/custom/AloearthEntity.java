package special.Entity.custom;

import com.example.registry.ModEntity;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class AloearthEntity extends AnimalEntity {
    public final AnimationState idleAnimationState =new AnimationState();
    private int idleAnimationTimeout = 0;
    public AloearthEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    private void setupAnimationStates(){
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    protected void updateLimbs(float posDelta) {
        float f;
        if (this.getPose() == EntityPose.STANDING) {
            f = Math.min(posDelta * 6.0F, 1.0F);
        } else {
            f = 0.0F;
        }

        this.limbAnimator.updateLimbs(f, 0.2F);
    }

    @Override
    public void tick() {
        super.tick();
        if(this.getWorld().isClient){
            setupAnimationStates();
        }
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0,new SwimGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 1.25));
        this.goalSelector.add(2,new AnimalMateGoal(this,1.15D));
        this.goalSelector.add(3,new TemptGoal(this,1.15D, Ingredient.ofItems(Items.POTATO),false));
        this.goalSelector.add(4,new TemptGoal(this,1.15D, Ingredient.ofItems(Items.CARROT),false));
        this.goalSelector.add(5,new FollowParentGoal(this,1.15D));
        this.goalSelector.add(6,new WanderAroundFarGoal(this,1D));
        this.goalSelector.add(7,new LookAtEntityGoal(this, PlayerEntity.class,6.0F));
        this.goalSelector.add(8,new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createrAloearthEntity(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,10)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.2f)
                .add(EntityAttributes.GENERIC_ARMOR,0.5f);

    }
    public boolean isBreedingItem(ItemStack stack){
        return stack.isOf(Items.POTATO) || stack.isOf(Items.CARROT);
    }
    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntity.ALOEARTH.create(world);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_PIG_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_PIG_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_PIG_DEATH;
    }
}
