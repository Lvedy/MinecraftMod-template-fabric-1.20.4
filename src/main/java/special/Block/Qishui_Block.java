package special.Block;

import com.example.registry.ModItems;
import com.example.registry.ModStatusEffect;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import special.BlockType.FacingBlock;

public class Qishui_Block extends FacingBlock {
    public Qishui_Block(Settings settings,boolean open,boolean straw){
        super(settings);
        setDefaultState(getDefaultState().with(OPEN, open));
        setDefaultState(getDefaultState().with(STRAW, straw));
    }
    public static final BooleanProperty OPEN = BooleanProperty.of("open");
    public static final BooleanProperty STRAW = BooleanProperty.of("straw");

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit){
        if(world.getBlockState(pos).get(OPEN) && (player.getStackInHand(hand).getItem() == ModItems.straw) && !world.getBlockState(pos).get(STRAW)) {
            world.setBlockState(pos, state.with(STRAW, true));
            player.addStatusEffect(new StatusEffectInstance(ModStatusEffect.qishui_effect, 100));
        }
        else
            world.setBlockState(pos, state.cycle(OPEN));
        return ActionResult.SUCCESS;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
        SHAPE = Block.createCuboidShape(6, 0, 6, 10, 6, 10);
        return SHAPE;
    }
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
        builder.add(OPEN);
        builder.add(STRAW);
    }
}

