package enemeez.simplefarming.init;

import javax.annotation.Nullable;

import enemeez.simplefarming.SimpleFarming;
import enemeez.simplefarming.blocks.CheeseBlock;
import enemeez.simplefarming.blocks.CustomBush;
import enemeez.simplefarming.blocks.CustomCactus;
import enemeez.simplefarming.blocks.CustomCake;
import enemeez.simplefarming.blocks.CustomCrop;
import enemeez.simplefarming.blocks.CustomSapling;
import enemeez.simplefarming.blocks.DoubleCrop;
import enemeez.simplefarming.blocks.FruitLeaves;
import enemeez.simplefarming.blocks.FruitLog;
import enemeez.simplefarming.blocks.WildCrop;
import net.minecraft.block.Block;
import net.minecraft.block.BushBlock;
import net.minecraft.block.HayBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks 
{
	//Bush
	public static BushBlock blackberry_bush;
	public static BushBlock blueberry_bush;
	public static BushBlock raspberry_bush;
	public static BushBlock strawberry_bush;
	
	//Gourds
	public static Block cantaloupe_block;
	public static Block honeydew_block;
	public static Block squash_block;
	
	//Cake-like blocks
	public static Block cheese_block;
	public static Block chocolate_cake;
	
	//Tree
	public static Block fruit_log;
	
	public static Block apple_sapling;
	public static Block apricot_sapling;
	public static Block banana_sapling;
	public static Block orange_sapling;
	public static Block plum_sapling;
	public static Block pear_sapling;
	
	//Leaves
	public static Block apple_leaves;
	public static Block apricot_leaves;
	public static Block banana_leaves;
	public static Block orange_leaves;
	public static Block plum_leaves;
	public static Block pear_leaves;
	
	//Crops
	public static Block cactus_crop;
	public static Block cantaloupe_crop;
	public static Block carrot_crop;
	public static Block cassava_crop;
	public static Block corn_crop;
	public static Block cucumber_crop;
	public static Block eggplant_crop;
	public static Block honeydew_crop;
	public static Block kenaf_crop;
	public static Block lettuce_crop;
	public static Block oat_crop;
	public static Block onion_crop;
	public static Block pepper_crop;
	public static Block potato_crop;
	public static Block radish_crop;
	public static Block rice_crop;
	public static Block rye_crop;
	public static Block soybean_crop;
	public static Block spinach_crop;
	public static Block squash_crop;
	public static Block tomato_crop;
	public static Block yam_crop;

	//Hay Bales
	public static Block oat_hay_block;
	public static Block rice_hay_block;
	public static Block rye_hay_block;
	
	
	//temp fix
	public static Block wild_crop;


	public static void registerAll(RegistryEvent.Register<Block> event)
	{ 
	  if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName())) return;
	  

		cantaloupe_block = register("cantaloupe_block", new Block(		//item
				Block.Properties.create(Material.GOURD)
				.sound(SoundType.WOOD)
				.hardnessAndResistance(1.0f)));
		honeydew_block = register("honeydew_block", new Block(		//item
				Block.Properties.create(Material.GOURD)
				.sound(SoundType.WOOD)
				.hardnessAndResistance(1.0f)));
		squash_block = register("squash_block", new Block(		//item
				Block.Properties.create(Material.GOURD)
				.sound(SoundType.WOOD)
				.hardnessAndResistance(1.0f)));
		
		apple_sapling = register("apple_sapling", new CustomSapling(		//item 
				Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0f)
				.sound(SoundType.PLANT), 1));
		apricot_sapling = register("apricot_sapling", new CustomSapling(		//item 
				Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0f)
				.sound(SoundType.PLANT), 2));
		banana_sapling = register("banana_sapling", new CustomSapling(		//item 
				Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0f)
				.sound(SoundType.PLANT), 3));
		orange_sapling = register("orange_sapling", new CustomSapling(		//item 
				Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0f)
				.sound(SoundType.PLANT), 5));
		pear_sapling = register("pear_sapling", new CustomSapling(		//item 
				Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0f)
				.sound(SoundType.PLANT), 6));
		plum_sapling = register("plum_sapling", new CustomSapling(		//item 
				Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0f)
				.sound(SoundType.PLANT), 4));
		
		apple_leaves = register("apple_leaves", new FruitLeaves(
				Block.Properties.create(Material.LEAVES)
				.hardnessAndResistance(0.2F)
				.tickRandomly()
				.sound(SoundType.PLANT), 1 ));
		apricot_leaves = register("apricot_leaves", new FruitLeaves(
				Block.Properties.create(Material.LEAVES)
				.hardnessAndResistance(0.2F)
				.tickRandomly()
				.sound(SoundType.PLANT), 2 ));
		banana_leaves = register("banana_leaves", new FruitLeaves(
				Block.Properties.create(Material.LEAVES)
				.hardnessAndResistance(0.2F)
				.tickRandomly()
				.sound(SoundType.PLANT), 3 ));
		orange_leaves = register("orange_leaves", new FruitLeaves(
				Block.Properties.create(Material.LEAVES)
				.hardnessAndResistance(0.2F)
				.tickRandomly()
				.sound(SoundType.PLANT), 5 ));
		pear_leaves = register("pear_leaves", new FruitLeaves(
				Block.Properties.create(Material.LEAVES)
				.hardnessAndResistance(0.2F)
				.tickRandomly()
				.sound(SoundType.PLANT), 6 ));
		plum_leaves = register("plum_leaves", new FruitLeaves(
				Block.Properties.create(Material.LEAVES)
				.hardnessAndResistance(0.2F)
				.tickRandomly()
				.sound(SoundType.PLANT), 4 ));
				
		fruit_log = register("fruit_log", new FruitLog(		
				Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN)
				.hardnessAndResistance(2.0F)
				.sound(SoundType.WOOD)));
		
		chocolate_cake = register("chocolate_cake", new CustomCake(		//item 
				Block.Properties.create(Material.CAKE)
				.hardnessAndResistance(0.5F)
				.sound(SoundType.CLOTH)));
	
		cheese_block = register("cheese_block", new CheeseBlock(		//item 
				Block.Properties.create(Material.CAKE)
				.hardnessAndResistance(0.5F)
				.sound(SoundType.CLOTH)));

		oat_hay_block = register("oat_hay_block", new HayBlock(				//item 
				Block.Properties.create(Material.ORGANIC, MaterialColor.YELLOW)
				.hardnessAndResistance(0.5F)
				.sound(SoundType.PLANT)));
		rice_hay_block = register("rice_hay_block", new HayBlock(				//item 
				Block.Properties.create(Material.ORGANIC, MaterialColor.GREEN)
				.hardnessAndResistance(0.5F)
				.sound(SoundType.PLANT)));
		rye_hay_block = register("rye_hay_block", new HayBlock(				//item 
				Block.Properties.create(Material.ORGANIC, MaterialColor.GREEN)
				.hardnessAndResistance(0.5F)
				.sound(SoundType.PLANT)));
		
		blackberry_bush = register("blackberry_bush", new CustomBush(				//item 
				(Block.Properties.create(Material.PLANTS)
				.tickRandomly()
				.doesNotBlockMovement()
				.hardnessAndResistance(0.2f)
				.sound(SoundType.SWEET_BERRY_BUSH)),1));
		blueberry_bush = register("blueberry_bush", new CustomBush(				//item 
				(Block.Properties.create(Material.PLANTS)
				.tickRandomly()
				.doesNotBlockMovement()
				.hardnessAndResistance(0.2f)
				.sound(SoundType.SWEET_BERRY_BUSH)),2));
		raspberry_bush = register("raspberry_bush", new CustomBush(				//item 
				(Block.Properties.create(Material.PLANTS)
				.tickRandomly()
				.doesNotBlockMovement()
				.hardnessAndResistance(0.2f)
				.sound(SoundType.SWEET_BERRY_BUSH)),3));
		strawberry_bush = register("strawberry_bush", new CustomBush(				//item 
				(Block.Properties.create(Material.PLANTS)
				.tickRandomly()
				.doesNotBlockMovement()
				.hardnessAndResistance(0.2f)
				.sound(SoundType.SWEET_BERRY_BUSH)),4));
		
		squash_crop = register("squash_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.STEM), 18));
		
		cactus_crop = register("cactus_crop", new CustomCactus(
				(Block.Properties.create(Material.PLANTS)
				.tickRandomly()
				.hardnessAndResistance(0.2f)
				.sound(SoundType.CLOTH))));
		
		cantaloupe_crop = register("cantaloupe_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.STEM), 19));
		
		carrot_crop = register("carrot_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 14));
		
		corn_crop = register("corn_crop", new DoubleCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), ModItems.corn_seeds, 1));
		
		cassava_crop = register("cassava_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 20));
				
		cucumber_crop = register("cucumber_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 1));
		
		eggplant_crop = register("eggplant_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 2));
		
		honeydew_crop = register("honeydew_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 21));
		
		kenaf_crop = register("kenaf_crop", new DoubleCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), ModItems.kenaf_seeds, 2));
		
		lettuce_crop = register("lettuce_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 3));
		
		oat_crop = register("oat_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 4));
		
		onion_crop = register("onion_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 5));
		
		pepper_crop = register("pepper_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 6));
		
		potato_crop = register("potato_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 15));
		
		radish_crop = register("radish_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 7));
		
		rice_crop = register("rice_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 8));
		
		rye_crop = register("rye_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 9));
		
		soybean_crop = register("soybean_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 10));
		
		spinach_crop = register("spinach_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 11));
		
		tomato_crop = register("tomato_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 12));
		
		yam_crop = register("yam_crop", new CustomCrop
				(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement()
				.tickRandomly()
				.hardnessAndResistance(0)
				.sound(SoundType.CROP), 13));
		
		wild_crop = register("wild_crop", new WildCrop(
				Block.Properties.create(Material.TALL_PLANTS)
				.doesNotBlockMovement()
				.hardnessAndResistance(0)
				.sound(SoundType.PLANT)));

	}
	
	   private static <T extends Block> T register(String name, T block) 
	   	{
	        BlockItem item = new BlockItem(block, new Item.Properties().group(SimpleFarming.ITEM_GROUP));
	        return register(name, block, item);
	    }
	
		private static <T extends Block> T register(String name, T block, @Nullable BlockItem item)
		{
			ResourceLocation id = SimpleFarming.getId(name);
			block.setRegistryName(id);
			ForgeRegistries.BLOCKS.register(block);
			return block;
		}

		

}