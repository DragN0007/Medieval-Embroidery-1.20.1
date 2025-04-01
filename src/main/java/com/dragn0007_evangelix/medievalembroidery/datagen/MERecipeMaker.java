package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocksDataGen;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class MERecipeMaker extends RecipeProvider implements IConditionBuilder {
    public MERecipeMaker(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.IRON_GROUNDED_SWORD.get())
                .requires(Items.IRON_SWORD)
                .unlockedBy("has_sword", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_SWORD)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.GOLDEN_GROUNDED_SWORD.get())
                .requires(Items.GOLDEN_SWORD)
                .unlockedBy("has_sword", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLDEN_SWORD)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.DIAMOND_GROUNDED_SWORD.get())
                .requires(Items.DIAMOND_SWORD)
                .unlockedBy("has_sword", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIAMOND_SWORD)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.NETHERITE_GROUNDED_SWORD.get())
                .requires(Items.NETHERITE_SWORD)
                .unlockedBy("has_sword", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_SWORD)
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.HERB_JAR.get())
                .define('A', Items.GLASS)
                .pattern(" A ")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_table", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS).build()))
                .save(pFinishedRecipeConsumer);

//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BIG_TAVERNTABLE.get())
//                .define('A', Items.SPRUCE_PLANKS)
//                .define('B', Items.IRON_INGOT)
//                .pattern("AAA")
//                .pattern("BBB")
//                .pattern("A A")
//                .unlockedBy("has_table", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.SPRUCE_PLANKS).build()))
//                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.MED_TAVERNTABLE.get())
                .define('A', Items.SPRUCE_PLANKS)
                .define('B', Items.IRON_INGOT)
                .pattern("AAA")
                .pattern("B B")
                .pattern("A A")
                .unlockedBy("has_table", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SPRUCE_PLANKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.SML_TAVERNTABLE.get())
                .define('A', Items.SPRUCE_PLANKS)
                .define('B', Items.IRON_INGOT)
                .pattern("AAA")
                .pattern("B B")
                .unlockedBy("has_table", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SPRUCE_PLANKS).build()))
                .save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_PANE_10.get(), 16)
                .define('A', MEBlocksDataGen.FRAMED_GLASS_10.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_PANE_9.get(), 16)
                .define('A', MEBlocksDataGen.FRAMED_GLASS_9.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_PANE_8.get(), 16)
                .define('A', MEBlocksDataGen.FRAMED_GLASS_8.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_PANE_7.get(), 16)
                .define('A', MEBlocksDataGen.FRAMED_GLASS_7.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_PANE_6.get(), 16)
                .define('A', MEBlocksDataGen.FRAMED_GLASS_6.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_PANE_5.get(), 16)
                .define('A', MEBlocksDataGen.FRAMED_GLASS_5.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_PANE_4.get(), 16)
                .define('A', MEBlocksDataGen.FRAMED_GLASS_4.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_PANE_3.get(), 16)
                .define('A', MEBlocksDataGen.FRAMED_GLASS_3.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_PANE_2.get(), 16)
                .define('A', MEBlocksDataGen.FRAMED_GLASS_2.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_PANE_1.get(), 16)
                .define('A', MEBlocksDataGen.FRAMED_GLASS_1.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_10.get(), 4)
                .define('A', Blocks.GLASS)
                .define('B', Items.IRON_NUGGET)
                .pattern("ABA")
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_9.get(), 4)
                .define('A', Blocks.GLASS)
                .define('B', Items.IRON_NUGGET)
                .pattern("BAB")
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_8.get(), 4)
                .define('A', Blocks.GLASS)
                .define('B', Items.IRON_NUGGET)
                .pattern("BAB")
                .pattern("ABA")
                .pattern("BAB")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_7.get(), 4)
                .define('A', Blocks.GLASS)
                .define('B', Items.IRON_NUGGET)
                .pattern("BAB")
                .pattern("BAB")
                .pattern("ABA")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_6.get(), 4)
                .define('A', Blocks.GLASS)
                .define('B', Items.IRON_NUGGET)
                .pattern("BAB")
                .pattern("BBB")
                .pattern("BAB")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_5.get(), 4)
                .define('A', Blocks.GLASS)
                .define('B', Items.IRON_NUGGET)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BAB")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_4.get(), 4)
                .define('A', Blocks.GLASS)
                .define('B', Items.IRON_NUGGET)
                .pattern("BAB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_3.get(), 4)
                .define('A', Blocks.GLASS)
                .define('B', Items.IRON_NUGGET)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_2.get(), 4)
                .define('A', Blocks.GLASS)
                .define('B', Items.IRON_NUGGET)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FRAMED_GLASS_1.get(), 4)
                .define('A', Blocks.GLASS)
                .define('B', Items.IRON_NUGGET)
                .pattern("BAB")
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS).build()))
                .save(pFinishedRecipeConsumer);




        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.YELLOW_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.YELLOW_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.WHITE_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.WHITE_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.SWAMPY_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.SWAMPY_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.RED_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.RED_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PURPLE_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.PURPLE_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PINK_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.PINK_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PALE_BLUE_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.PALE_BLUE_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.ORANGE_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.ORANGE_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.NAVY_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.NAVY_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.MAROON_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.MAROON_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.GREY_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.GREY_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.GREEN_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.GREEN_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FADED_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.FADED_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BROWN_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.BROWN_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BLUE_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.BLUE_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BLACK_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.BLACK_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BEIGE_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocksDataGen.BEIGE_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.YELLOW_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.WHITE_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.WHITE_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.SWAMPY_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.RED_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.RED_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PURPLE_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PINK_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.PINK_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PALE_BLUE_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.ORANGE_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.NAVY_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.NAVY_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.MAROON_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.MAROON_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.GREY_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.GREY_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.GREEN_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.GREEN_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FADED_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.FADED_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BROWN_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.BROWN_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BLUE_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.BLUE_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BLACK_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.BLACK_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BEIGE_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);





        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.YELLOW_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.YELLOW_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.WHITE_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.WHITE_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.SWAMPY_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.SWAMPY_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.RED_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.RED_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PURPLE_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.PURPLE_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PINK_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.PINK_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PALE_BLUE_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.PALE_BLUE_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.ORANGE_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.ORANGE_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.NAVY_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.NAVY_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.MAROON_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.MAROON_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.GREY_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.GREY_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.GREEN_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.GREEN_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FADED_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.FADED_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BROWN_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.BROWN_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BLUE_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.BLUE_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BLACK_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.BLACK_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BEIGE_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocksDataGen.BEIGE_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);






        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.YELLOW_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.YELLOW_DYE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.WHITE_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.WHITE_DYE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.SWAMPY_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.VINE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.RED_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.RED_DYE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PURPLE_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.PURPLE_DYE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PINK_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.PINK_DYE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PALE_BLUE_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.LIGHT_BLUE_DYE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.ORANGE_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.ORANGE_DYE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.NAVY_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.LAPIS_LAZULI)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.MAROON_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.RED_DYE)
                .define('C', Items.BROWN_DYE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" DC")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.GREY_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.GRAY_DYE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.GREEN_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.GREEN_DYE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FADED_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.DIRT)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BROWN_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.BROWN_DYE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BLACK_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.BLACK_DYE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BLUE_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.BLUE_DYE)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BEIGE_BRICKS_MOSSY.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Blocks.SAND)
                .define('D', Blocks.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern(" D ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.YELLOW_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.YELLOW_DYE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.WHITE_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.WHITE_DYE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.SWAMPY_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.VINE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.RED_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.RED_DYE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PURPLE_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.PURPLE_DYE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PINK_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.PINK_DYE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.PALE_BLUE_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.LIGHT_BLUE_DYE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.ORANGE_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.ORANGE_DYE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.NAVY_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.LAPIS_LAZULI)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.MAROON_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.RED_DYE)
                .define('C', Items.BROWN_DYE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("  C")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.GREY_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.GRAY_DYE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.GREEN_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.GREEN_DYE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.FADED_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.DIRT)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BROWN_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.BROWN_DYE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BLACK_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.BLACK_DYE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BLUE_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Items.BLUE_DYE)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocksDataGen.BEIGE_BRICKS.get(), 4)
                .define('A', Blocks.BRICKS)
                .define('B', Blocks.SAND)
                .pattern("   ")
                .pattern(" AB")
                .pattern("   ")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GREEN_DYE)
                .requires(MEBlocks.GROUND_VINE.get())
                .unlockedBy("has_ground_vine", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEBlocks.GROUND_VINE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RED_DYE)
                .requires(MEBlocks.FIRE_DAISY.get())
                .unlockedBy("has_fire_daisy", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEBlocks.FIRE_DAISY.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PINK_DYE)
                .requires(MEBlocks.PINK_MAGE.get())
                .unlockedBy("has_pink_mage", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEBlocks.PINK_MAGE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLUE_DYE)
                .requires(MEBlocks.BLUE_DRAGON.get())
                .unlockedBy("has_blue_dragon", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEBlocks.BLUE_DRAGON.get())
                        .build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.BOOK_CLOSED.get())
                .requires(Items.BOOK)
                .unlockedBy("has_book", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BOOK).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.OPEN_BOOK.get())
                .define('A', Items.BOOK)
                .define('B', Items.PAPER)
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_book", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BOOK).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.OPEN_BOOK_FLAT.get())
                .define('A', Items.BOOK)
                .define('B', Items.PAPER)
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_book", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BOOK).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.LARGE_POTION_JAR_RED.get())
                .define('A', Items.GLASS_BOTTLE)
                .define('B', Items.RED_DYE)
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.LARGE_POTION_JAR_GREEN.get())
                .define('A', Items.GLASS_BOTTLE)
                .define('B', Items.GREEN_DYE)
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.LARGE_POTION_JAR_PINK.get())
                .define('A', Items.GLASS_BOTTLE)
                .define('B', Items.PINK_DYE)
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.LARGE_POTION_JAR_PURPLE.get())
                .define('A', Items.GLASS_BOTTLE)
                .define('B', Items.PURPLE_DYE)
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.LARGE_POTION_JAR_CYAN.get())
                .define('A', Items.GLASS_BOTTLE)
                .define('B', Items.CYAN_DYE)
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.PLATE.get())
                .define('A', Items.OAK_PLANKS)
                .pattern(" A ")
                .pattern("AAA")
                .pattern(" A ")
                .unlockedBy("has_plate", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.UTENSIL_METAL.get())
                .define('A', Items.IRON_INGOT)
                .pattern("AAA")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_uten_metal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.UTENSIL_WOODEN.get())
                .define('A', Items.OAK_PLANKS)
                .pattern("AAA")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_uten_wooden", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.TANKARD.get())
                .define('A', Items.SPRUCE_PLANKS)
                .define('B', Items.IRON_INGOT)
                .pattern("A A")
                .pattern("A B")
                .pattern("AAA")
                .unlockedBy("has_tankard", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SPRUCE_PLANKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.CUP_CLAY.get())
                .define('A', Items.CLAY)
                .pattern("   ")
                .pattern("A A")
                .pattern("AAA")
                .unlockedBy("has_cup_clay", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CLAY).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.CUP_METAL.get())
                .define('A', Items.IRON_INGOT)
                .pattern("   ")
                .pattern("A A")
                .pattern("AAA")
                .unlockedBy("has_cup_metal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.GOBLET.get())
                .define('A', Items.IRON_INGOT)
                .pattern("A A")
                .pattern("AAA")
                .pattern(" A ")
                .unlockedBy("has_goblet", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);
    }

}