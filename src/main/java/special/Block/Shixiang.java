package special.Block;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import special.BlockType.FacingAndWaterBlock;

public class Shixiang extends FacingAndWaterBlock {

    public Shixiang(Settings settings) {
        super(settings);
    }
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
        SHAPE = Block.createCuboidShape(6, 0, 6, 10, 10, 10);
        return SHAPE;
    }
}
