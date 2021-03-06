package enemeez.simplefarming.block.growable;

import java.util.Random;

import enemeez.simplefarming.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ForgeHooks;

public class BerryBushBlock extends BushBlock implements IGrowable {
	private String name;
	public static final IntegerProperty AGE = BlockStateProperties.AGE_0_3;
	protected static final VoxelShape SHAPE = VoxelShapes.or(Block.makeCuboidShape(1.0D, 2.0D, 1.0D, 15.0D, 16.0D, 15.0D), Block.makeCuboidShape(5.0D, 0.D, 5.0D, 11.0D, 2.0D, 11.0D));

	public BerryBushBlock(Block.Properties properties, String name) {
		super(properties);
		this.name = name;
		this.setDefaultState(this.stateContainer.getBaseState().with(AGE, Integer.valueOf(0)));
	}

	@Override
	public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
		switch (name) {
		case "blackberries":
			return new ItemStack(ModItems.blackberry_bush);
		case "blueberries":
			return new ItemStack(ModItems.blueberry_bush);
		case "raspberries":
			return new ItemStack(ModItems.raspberry_bush);
		default:
			return new ItemStack(ModItems.strawberry_bush);
		}
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}

	// Tick method
	@Override
	public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
		int i = state.get(AGE);

		if (i < 3 && worldIn.getLightSubtracted(pos.up(), 0) >= 9 && ForgeHooks.onCropsGrowPre(worldIn, pos, state, random.nextInt(5) == 0)) {
			worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(i + 1)), 2);
			ForgeHooks.onCropsGrowPost(worldIn, pos, state);
		}
	}

	public boolean isMaxAge(BlockState state) {
		return state.get(AGE) == 3;
	}

	@Override
	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
		if (entityIn instanceof LivingEntity) {
			entityIn.setMotionMultiplier(state, new Vec3d((double) 0.8F, 0.75D, (double) 0.8F));
		}
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(AGE);
	}

	@Override
	public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
		return state.get(AGE) < 3;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
		return true;
	}

	// Grow Method
	@Override
	public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
		int i = Math.min(3, state.get(AGE) + 1);
		worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(i)), 2);
	}

}