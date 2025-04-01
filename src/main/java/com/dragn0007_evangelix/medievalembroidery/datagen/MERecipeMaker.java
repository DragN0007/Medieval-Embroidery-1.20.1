package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
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