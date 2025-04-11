package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007_evangelix.medievalembroidery.MedievalEmbroidery;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.PixelPlacementBlocks;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import com.dragn0007_evangelix.medievalembroidery.util.METags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class MERecipeMaker extends RecipeProvider implements IConditionBuilder {
    public MERecipeMaker(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.CONJURING_CRYSTAL_BALL.get())
                .define('A', MEItems.CONJURING_CRYSTAL_SHARD.get())
                .define('B', Items.GOLD_INGOT)
                .define('C', Items.GOLD_NUGGET)
                .pattern(" A ")
                .pattern("ABA")
                .pattern("C C")
                .unlockedBy("has_gold", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT)
                        .build())).save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.BLEWIT.get())
                .requires(MEBlocks.WILD_BLEWIT.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.MUSHROOMS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HONEY.get())
                .requires(MEBlocks.WILD_HONEY.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.MUSHROOMS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.KING.get())
                .requires(MEBlocks.WILD_KING.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.MUSHROOMS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.MATSUTAKE.get())
                .requires(MEBlocks.WILD_MATSUTAKE.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.MUSHROOMS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.OYSTER.get())
                .requires(MEBlocks.WILD_OYSTER.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.MUSHROOMS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.WOODS_CHICKEN.get())
                .requires(MEBlocks.WILD_WOODS_CHICKEN.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.MUSHROOMS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.YELLOWFOOT.get())
                .requires(MEBlocks.WILD_YELLOWFOOT.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.MUSHROOMS)
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.FAIRY_ALE.get())
                .requires(METags.Items.WATER)
                .requires(MEItems.MALTED_GRAIN.get())
                .requires(MEItems.FAIRY_DUST.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ALE.get())
                .requires(METags.Items.WATER)
                .requires(MEItems.MALTED_GRAIN.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HERBAL_MEAD.get())
                .requires(METags.Items.WATER)
                .requires(MEItems.MALTED_GRAIN.get())
                .requires(METags.Items.HERBS)
                .requires(Items.SUGAR)
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HONEY_MEAD.get())
                .requires(METags.Items.WATER)
                .requires(MEItems.MALTED_GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .requires(Items.SUGAR)
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.REDCURRANT_MEAD.get())
                .requires(METags.Items.WATER)
                .requires(MEItems.MALTED_GRAIN.get())
                .requires(MEItems.REDCURRANT_GLAZE.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HAWTHORN_MEAD.get())
                .requires(METags.Items.WATER)
                .requires(MEItems.MALTED_GRAIN.get())
                .requires(MEItems.HAWTHORN_GLAZE.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ELDERBERRY_MEAD.get())
                .requires(METags.Items.WATER)
                .requires(MEItems.MALTED_GRAIN.get())
                .requires(MEItems.ELDERBERRY_GLAZE.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.COWBERRY_MEAD.get())
                .requires(METags.Items.WATER)
                .requires(MEItems.MALTED_GRAIN.get())
                .requires(MEItems.COWBERRY_GLAZE.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.BILBERRY_MEAD.get())
                .requires(METags.Items.WATER)
                .requires(MEItems.MALTED_GRAIN.get())
                .requires(MEItems.BILBERRY_GLAZE.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.WATER.get(), 3)
                .requires(Items.WATER_BUCKET)
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WATER_BUCKET)
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.APPLE_CIDER.get())
                .requires(MEItems.APPLE_JUICE.get())
                .requires(Items.SUGAR)
                .requires(METags.Items.WATER)
                .requires(METags.Items.HERBS)
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.APRICOT_TEA.get())
                .requires(MEItems.LEMON_JUICE.get())
                .requires(Items.SUGAR)
                .requires(METags.Items.WATER)
                .requires(METags.Items.HERBS)
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.LEMON_TEA.get())
                .requires(MEItems.LEMON_JUICE.get())
                .requires(Items.SUGAR)
                .requires(METags.Items.WATER)
                .requires(METags.Items.HERBS)
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.APPLE_JUICE.get())
                .requires(Items.APPLE)
                .requires(Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.APRICOT_JUICE.get())
                .requires(MEItems.APRICOT.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.LEMON_JUICE.get())
                .requires(MEItems.LEMON.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);


        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MEItems.YAK.get()), RecipeCategory.MISC, MEItems.COOKED_YAK.get(), 0.35F, 100)
                .unlockedBy("has_yak", has(MEItems.YAK.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_yak_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.YAK.get()), RecipeCategory.MISC, MEItems.COOKED_YAK.get(), 0.35F, 200)
                .unlockedBy("has_yak", has(MEItems.YAK.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_yak_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(MEItems.YAK.get()), RecipeCategory.MISC, MEItems.COOKED_YAK.get(), 0.35F, 600)
                .unlockedBy("has_yak", has(MEItems.YAK.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_yak_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MEItems.ELK.get()), RecipeCategory.MISC, MEItems.COOKED_ELK.get(), 0.35F, 100)
                .unlockedBy("has_elk", has(MEItems.ELK.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_elk_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.ELK.get()), RecipeCategory.MISC, MEItems.COOKED_ELK.get(), 0.35F, 200)
                .unlockedBy("has_elk", has(MEItems.ELK.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_elk_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(MEItems.ELK.get()), RecipeCategory.MISC, MEItems.COOKED_ELK.get(), 0.35F, 600)
                .unlockedBy("has_elk", has(MEItems.ELK.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_elk_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MEItems.DIREWOLF.get()), RecipeCategory.MISC, MEItems.COOKED_DIREWOLF.get(), 0.35F, 100)
                .unlockedBy("has_direwolf", has(MEItems.DIREWOLF.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_direwolf_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.DIREWOLF.get()), RecipeCategory.MISC, MEItems.COOKED_DIREWOLF.get(), 0.35F, 200)
                .unlockedBy("has_direwolf", has(MEItems.DIREWOLF.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_direwolf_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(MEItems.DIREWOLF.get()), RecipeCategory.MISC, MEItems.COOKED_DIREWOLF.get(), 0.35F, 600)
                .unlockedBy("has_direwolf", has(MEItems.DIREWOLF.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_direwolf_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SEASONED_YAK.get())
                .requires(MEItems.COOKED_YAK.get())
                .requires(MEItems.SALT.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SEASONED_ELK.get())
                .requires(MEItems.COOKED_ELK.get())
                .requires(MEItems.SALT.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SEASONED_DIREWOLF.get())
                .requires(MEItems.COOKED_DIREWOLF.get())
                .requires(MEItems.SALT.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.FLOUR.get())
                .requires(MEItems.MORTAR_AND_PESTLE.get())
                .requires(Items.WHEAT)
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.MALTED_GRAIN.get())
                .requires(METags.Items.WATER)
                .requires(METags.Items.WHEAT)
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SALT_BRINE.get())
                .requires(METags.Items.WATER)
                .requires(MEItems.SALT.get())
                .unlockedBy("has_salt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SALT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.PICKLED_EGG.get())
                .requires(METags.Items.EGGS)
                .requires(MEItems.SALT_BRINE.get())
                .unlockedBy("has_salt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SALT_BRINE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.PICKLED_VEGGIES.get())
                .requires(METags.Items.VEGETABLES)
                .requires(METags.Items.VEGETABLES)
                .requires(MEItems.SALT_BRINE.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_salt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SALT_BRINE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.PICKLED_MUSHROOMS.get())
                .requires(METags.Items.MUSHROOMS)
                .requires(METags.Items.MUSHROOMS)
                .requires(MEItems.SALT_BRINE.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_salt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SALT_BRINE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.PICKLED_MEAT.get())
                .requires(METags.Items.RAW_MEATS)
                .requires(METags.Items.RAW_MEATS)
                .requires(MEItems.SALT_BRINE.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_salt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SALT_BRINE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.REDCURRANT_GLAZE.get())
                .requires(MEItems.REDCURRANT.get())
                .requires(MEItems.REDCURRANT.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_berries", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.BERRIES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ELDERBERRY_GLAZE.get())
                .requires(MEItems.ELDERBERRY.get())
                .requires(MEItems.ELDERBERRY.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_berries", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.BERRIES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HAWTHORN_GLAZE.get())
                .requires(MEItems.HAWTHORNBERRY.get())
                .requires(MEItems.HAWTHORNBERRY.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_berries", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.BERRIES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.COWBERRY_GLAZE.get())
                .requires(MEItems.COWBERRY.get())
                .requires(MEItems.COWBERRY.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_berries", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.BERRIES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.BILBERRY_GLAZE.get())
                .requires(MEItems.BILBERRY.get())
                .requires(MEItems.BILBERRY.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_berries", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.BERRIES)
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SEASONED_BLEWIT.get())
                .requires(MEItems.COOKED_BLEWIT.get())
                .requires(MEItems.SALT.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SEASONED_HONEY.get())
                .requires(MEItems.COOKED_HONEY.get())
                .requires(MEItems.SALT.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SEASONED_KING.get())
                .requires(MEItems.COOKED_KING.get())
                .requires(MEItems.SALT.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SEASONED_MATSUTAKE.get())
                .requires(MEItems.COOKED_MATSUTAKE.get())
                .requires(MEItems.SALT.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SEASONED_OYSTER.get())
                .requires(MEItems.COOKED_OYSTER.get())
                .requires(MEItems.SALT.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SEASONED_PORCINI.get())
                .requires(MEItems.COOKED_PORCINI.get())
                .requires(MEItems.SALT.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SEASONED_YELLOWFOOT.get())
                .requires(MEItems.COOKED_YELLOWFOOT.get())
                .requires(MEItems.SALT.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SEASONED_WOODS_CHICKEN.get())
                .requires(MEItems.COOKED_WOODS_CHICKEN.get())
                .requires(MEItems.SALT.get())
                .requires(METags.Items.HERBS)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);


        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MEItems.BLEWIT.get()), RecipeCategory.MISC, MEItems.COOKED_BLEWIT.get(), 0.35F, 100)
                .unlockedBy("has_blewit", has(MEItems.BLEWIT.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_blewit_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.BLEWIT.get()), RecipeCategory.MISC, MEItems.COOKED_BLEWIT.get(), 0.35F, 200)
                .unlockedBy("has_blewit", has(MEItems.BLEWIT.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_blewit_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(MEItems.BLEWIT.get()), RecipeCategory.MISC, MEItems.COOKED_BLEWIT.get(), 0.35F, 600)
                .unlockedBy("has_blewit", has(MEItems.BLEWIT.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_blewit_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MEItems.HONEY.get()), RecipeCategory.MISC, MEItems.COOKED_HONEY.get(), 0.35F, 100)
                .unlockedBy("has_honey", has(MEItems.HONEY.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_honey_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.HONEY.get()), RecipeCategory.MISC, MEItems.COOKED_HONEY.get(), 0.35F, 200)
                .unlockedBy("has_honey", has(MEItems.HONEY.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_honey_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(MEItems.HONEY.get()), RecipeCategory.MISC, MEItems.COOKED_HONEY.get(), 0.35F, 600)
                .unlockedBy("has_honey", has(MEItems.HONEY.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_honey_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MEItems.KING.get()), RecipeCategory.MISC, MEItems.COOKED_KING.get(), 0.35F, 100)
                .unlockedBy("has_king", has(MEItems.KING.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_king_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.KING.get()), RecipeCategory.MISC, MEItems.COOKED_KING.get(), 0.35F, 200)
                .unlockedBy("has_king", has(MEItems.KING.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_king_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(MEItems.KING.get()), RecipeCategory.MISC, MEItems.COOKED_KING.get(), 0.35F, 600)
                .unlockedBy("has_king", has(MEItems.KING.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_king_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MEItems.MATSUTAKE.get()), RecipeCategory.MISC, MEItems.COOKED_MATSUTAKE.get(), 0.35F, 100)
                .unlockedBy("has_matsutake", has(MEItems.MATSUTAKE.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_matsutake_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.MATSUTAKE.get()), RecipeCategory.MISC, MEItems.COOKED_MATSUTAKE.get(), 0.35F, 200)
                .unlockedBy("has_matsutake", has(MEItems.MATSUTAKE.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_matsutake_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(MEItems.MATSUTAKE.get()), RecipeCategory.MISC, MEItems.COOKED_MATSUTAKE.get(), 0.35F, 600)
                .unlockedBy("has_matsutake", has(MEItems.MATSUTAKE.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_matsutake_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MEItems.OYSTER.get()), RecipeCategory.MISC, MEItems.COOKED_OYSTER.get(), 0.35F, 100)
                .unlockedBy("has_oyster", has(MEItems.OYSTER.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_oyster_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.OYSTER.get()), RecipeCategory.MISC, MEItems.COOKED_OYSTER.get(), 0.35F, 200)
                .unlockedBy("has_oyster", has(MEItems.OYSTER.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_oyster_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(MEItems.OYSTER.get()), RecipeCategory.MISC, MEItems.COOKED_OYSTER.get(), 0.35F, 600)
                .unlockedBy("has_oyster", has(MEItems.OYSTER.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_oyster_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MEItems.YELLOWFOOT.get()), RecipeCategory.MISC, MEItems.COOKED_YELLOWFOOT.get(), 0.35F, 100)
                .unlockedBy("has_yellowfoot", has(MEItems.YELLOWFOOT.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_yellowfoot_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.YELLOWFOOT.get()), RecipeCategory.MISC, MEItems.COOKED_YELLOWFOOT.get(), 0.35F, 200)
                .unlockedBy("has_yellowfoot", has(MEItems.YELLOWFOOT.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_yellowfoot_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(MEItems.YELLOWFOOT.get()), RecipeCategory.MISC, MEItems.COOKED_YELLOWFOOT.get(), 0.35F, 600)
                .unlockedBy("has_yellowfoot", has(MEItems.YELLOWFOOT.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_yellowfoot_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MEItems.WOODS_CHICKEN.get()), RecipeCategory.MISC, MEItems.COOKED_WOODS_CHICKEN.get(), 0.35F, 100)
                .unlockedBy("has_woods_chicken", has(MEItems.WOODS_CHICKEN.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_woods_chicken_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.WOODS_CHICKEN.get()), RecipeCategory.MISC, MEItems.COOKED_WOODS_CHICKEN.get(), 0.35F, 200)
                .unlockedBy("has_woods_chicken", has(MEItems.WOODS_CHICKEN.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_woods_chicken_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(MEItems.WOODS_CHICKEN.get()), RecipeCategory.MISC, MEItems.COOKED_WOODS_CHICKEN.get(), 0.35F, 600)
                .unlockedBy("has_woods_chicken", has(MEItems.WOODS_CHICKEN.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_woods_chicken_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MEItems.PORCINI.get()), RecipeCategory.MISC, MEItems.COOKED_PORCINI.get(), 0.35F, 100)
                .unlockedBy("has_porcini", has(MEItems.PORCINI.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_porcini_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.PORCINI.get()), RecipeCategory.MISC, MEItems.COOKED_PORCINI.get(), 0.35F, 200)
                .unlockedBy("has_porcini", has(MEItems.PORCINI.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_porcini_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(MEItems.PORCINI.get()), RecipeCategory.MISC, MEItems.COOKED_PORCINI.get(), 0.35F, 600)
                .unlockedBy("has_porcini", has(MEItems.PORCINI.get())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "cooked_porcini_campfire_cooking"));


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.APPLE_PIE.get())
                .define('A', Items.SUGAR)
                .define('B', METags.Items.WHEAT)
                .define('C', METags.Items.EGGS)
                .define('D', Items.APPLE)
                .pattern("DDD")
                .pattern("ACA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.APRICOT_PIE.get())
                .define('A', Items.SUGAR)
                .define('B', METags.Items.WHEAT)
                .define('C', METags.Items.EGGS)
                .define('D', MEItems.APRICOT.get())
                .pattern("DDD")
                .pattern("ACA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.LEMON_PIE.get())
                .define('A', Items.SUGAR)
                .define('B', METags.Items.WHEAT)
                .define('C', METags.Items.EGGS)
                .define('D', MEItems.LEMON.get())
                .pattern("DDD")
                .pattern("ACA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.BILBERRY_PIE.get())
                .define('A', Items.SUGAR)
                .define('B', METags.Items.WHEAT)
                .define('C', METags.Items.EGGS)
                .define('D', MEItems.BILBERRY.get())
                .pattern("DDD")
                .pattern("ACA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.COWBERRY_PIE.get())
                .define('A', Items.SUGAR)
                .define('B', METags.Items.WHEAT)
                .define('C', METags.Items.EGGS)
                .define('D', MEItems.COWBERRY.get())
                .pattern("DDD")
                .pattern("ACA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.HAWTHORN_PIE.get())
                .define('A', Items.SUGAR)
                .define('B', METags.Items.WHEAT)
                .define('C', METags.Items.EGGS)
                .define('D', MEItems.HAWTHORNBERRY.get())
                .pattern("DDD")
                .pattern("ACA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.ELDERBERRY_PIE.get())
                .define('A', Items.SUGAR)
                .define('B', METags.Items.WHEAT)
                .define('C', METags.Items.EGGS)
                .define('D', MEItems.ELDERBERRY.get())
                .pattern("DDD")
                .pattern("ACA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.REDCURRANT_PIE.get())
                .define('A', Items.SUGAR)
                .define('B', METags.Items.WHEAT)
                .define('C', METags.Items.EGGS)
                .define('D', MEItems.REDCURRANT.get())
                .pattern("DDD")
                .pattern("ACA")
                .pattern("BBB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.MIXEDBERRY_PIE.get())
                .define('A', Items.SUGAR)
                .define('B', METags.Items.WHEAT)
                .define('C', METags.Items.EGGS)
                .define('D', METags.Items.BERRIES)
                .pattern("DDD")
                .pattern("ACA")
                .pattern("BDB")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build())).save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.SWEET_BREAD.get())
                .define('A', Items.SUGAR)
                .define('B', METags.Items.WHEAT)
                .define('C', METags.Items.WATER)
                .pattern("   ")
                .pattern("BAB")
                .pattern(" C ")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.SWEET_BREAD_HONEY.get())
                .define('A', Items.SUGAR)
                .define('B', METags.Items.WHEAT)
                .define('C', METags.Items.WATER)
                .define('D', Items.HONEY_BOTTLE)
                .pattern(" D ")
                .pattern("BAB")
                .pattern(" C ")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "sweet_bread_honey_scratch"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SWEET_BREAD_HONEY.get())
                .requires(Items.HONEY_BOTTLE)
                .requires(MEItems.SWEET_BREAD.get())
                .unlockedBy("has_sweet_bread", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SWEET_BREAD.get())
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "sweet_bread_honey_addition"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.SWEET_BREAD_CREAM.get())
                .define('A', Items.SUGAR)
                .define('B', METags.Items.WHEAT)
                .define('C', METags.Items.WATER)
                .define('D', METags.Items.MILK)
                .pattern(" D ")
                .pattern("BAB")
                .pattern(" C ")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.WHEAT)
                        .build())).save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "sweet_bread_cream_scratch"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SWEET_BREAD_HONEY.get())
                .requires(METags.Items.MILK)
                .requires(MEItems.SWEET_BREAD.get())
                .unlockedBy("has_sweet_bread", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SWEET_BREAD.get())
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation(MedievalEmbroidery.MODID, "sweet_bread_cream_addition"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.BILBERRY_SWEET_BREAD_CREAM.get())
                .requires(MEItems.BILBERRY_GLAZE.get())
                .requires(MEItems.SWEET_BREAD_CREAM.get())
                .unlockedBy("has_sweet_bread_cream", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SWEET_BREAD_CREAM.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.COWBERRY_SWEET_BREAD_CREAM.get())
                .requires(MEItems.COWBERRY_GLAZE.get())
                .requires(MEItems.SWEET_BREAD_CREAM.get())
                .unlockedBy("has_sweet_bread_cream", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SWEET_BREAD_CREAM.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ELDERBERRY_SWEET_BREAD_CREAM.get())
                .requires(MEItems.ELDERBERRY_GLAZE.get())
                .requires(MEItems.SWEET_BREAD_CREAM.get())
                .unlockedBy("has_sweet_bread_cream", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SWEET_BREAD_CREAM.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.FRUIT_SWEET_BREAD_CREAM.get())
                .requires(MEItems.FRUIT_GLAZE.get())
                .requires(MEItems.SWEET_BREAD_CREAM.get())
                .unlockedBy("has_sweet_bread_cream", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SWEET_BREAD_CREAM.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HAWTHORN_SWEET_BREAD_CREAM.get())
                .requires(MEItems.HAWTHORN_GLAZE.get())
                .requires(MEItems.SWEET_BREAD_CREAM.get())
                .unlockedBy("has_sweet_bread_cream", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SWEET_BREAD_CREAM.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.REDCURRANT_SWEET_BREAD_CREAM.get())
                .requires(MEItems.REDCURRANT_GLAZE.get())
                .requires(MEItems.SWEET_BREAD_CREAM.get())
                .unlockedBy("has_sweet_bread_cream", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SWEET_BREAD_CREAM.get())
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.ASTROSTONE_BLOCK.get())
                .define('A', MEItems.ASTROSTONE.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_gem", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.ASTROSTONE.get())
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.FIRESTONE_BLOCK.get())
                .define('A', MEItems.FIRESTONE.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_gem", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.FIRESTONE.get())
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.DEPTHSTONE_BLOCK.get())
                .define('A', MEItems.DEPTHSTONE.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_gem", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.DEPTHSTONE.get())
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.FROSTSTONE_BLOCK.get())
                .define('A', MEItems.FROSTSTONE.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_gem", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.FROSTSTONE.get())
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.SKYSTONE_BLOCK.get())
                .define('A', MEItems.SKYSTONE.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_gem", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SKYSTONE.get())
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.MOSSTONE_BLOCK.get())
                .define('A', MEItems.MOSSTONE.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_gem", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.MOSSTONE.get())
                        .build())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.SEASTONE_BLOCK.get())
                .define('A', MEItems.SEASTONE.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_gem", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SEASTONE.get())
                        .build())).save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PixelPlacementBlocks.IRON_GROUNDED_SWORD.get())
                .requires(Items.IRON_SWORD)
                .unlockedBy("has_sword", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_SWORD)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PixelPlacementBlocks.GOLDEN_GROUNDED_SWORD.get())
                .requires(Items.GOLDEN_SWORD)
                .unlockedBy("has_sword", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLDEN_SWORD)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PixelPlacementBlocks.DIAMOND_GROUNDED_SWORD.get())
                .requires(Items.DIAMOND_SWORD)
                .unlockedBy("has_sword", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIAMOND_SWORD)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PixelPlacementBlocks.NETHERITE_GROUNDED_SWORD.get())
                .requires(Items.NETHERITE_SWORD)
                .unlockedBy("has_sword", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_SWORD)
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.HERB_JAR.get())
                .define('A', Items.GLASS)
                .pattern(" A ")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_table", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PixelPlacementBlocks.BOOK_CLOSED.get())
                .requires(Items.BOOK)
                .unlockedBy("has_book", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BOOK).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.OPEN_BOOK.get())
                .define('A', Items.BOOK)
                .define('B', Items.PAPER)
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_book", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BOOK).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.OPEN_BOOK_FLAT.get())
                .define('A', Items.BOOK)
                .define('B', Items.PAPER)
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_book", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BOOK).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.LARGE_POTION_JAR_RED.get())
                .define('A', Items.GLASS_BOTTLE)
                .define('B', Items.RED_DYE)
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.LARGE_POTION_JAR_GREEN.get())
                .define('A', Items.GLASS_BOTTLE)
                .define('B', Items.GREEN_DYE)
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.LARGE_POTION_JAR_PINK.get())
                .define('A', Items.GLASS_BOTTLE)
                .define('B', Items.PINK_DYE)
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.LARGE_POTION_JAR_PURPLE.get())
                .define('A', Items.GLASS_BOTTLE)
                .define('B', Items.PURPLE_DYE)
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.LARGE_POTION_JAR_CYAN.get())
                .define('A', Items.GLASS_BOTTLE)
                .define('B', Items.CYAN_DYE)
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.PLATE.get())
                .define('A', Items.OAK_PLANKS)
                .pattern(" A ")
                .pattern("AAA")
                .pattern(" A ")
                .unlockedBy("has_plate", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.UTENSIL_METAL.get())
                .define('A', Items.IRON_NUGGET)
                .pattern("AAA")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_uten_metal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.UTENSIL_WOODEN.get())
                .define('A', Items.OAK_PLANKS)
                .pattern("AAA")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_uten_wooden", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.TANKARD.get())
                .define('A', Items.SPRUCE_PLANKS)
                .define('B', Items.IRON_NUGGET)
                .pattern("A A")
                .pattern("A B")
                .pattern("AAA")
                .unlockedBy("has_tankard", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SPRUCE_PLANKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.CUP_CLAY.get())
                .define('A', Items.CLAY)
                .pattern("   ")
                .pattern("A A")
                .pattern("AAA")
                .unlockedBy("has_cup_clay", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CLAY).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.CUP_METAL.get())
                .define('A', Items.IRON_NUGGET)
                .pattern("   ")
                .pattern("A A")
                .pattern("AAA")
                .unlockedBy("has_cup_metal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PixelPlacementBlocks.GOBLET.get())
                .define('A', Items.IRON_NUGGET)
                .pattern("A A")
                .pattern("AAA")
                .pattern(" A ")
                .unlockedBy("has_goblet", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.YELLOW_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.YELLOW_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.WHITE_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.WHITE_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.SWAMPY_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.SWAMPY_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.RED_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.RED_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.PURPLE_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.PURPLE_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.PINK_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.PINK_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.PALE_BLUE_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.PALE_BLUE_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.ORANGE_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.ORANGE_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.NAVY_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.NAVY_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.MAROON_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.MAROON_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.GREY_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.GREY_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.GREEN_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.GREEN_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.FADED_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.FADED_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BROWN_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.BROWN_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BLUE_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.BLUE_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BLACK_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.BLACK_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BEIGE_BRICKS_SLAB.get(), 6)
                .define('A', MEBlocks.BEIGE_BRICKS.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.YELLOW_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.YELLOW_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.WHITE_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.WHITE_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.SWAMPY_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.SWAMPY_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.RED_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.RED_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.PURPLE_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.PURPLE_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.PINK_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.PINK_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.PALE_BLUE_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.PALE_BLUE_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.ORANGE_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.ORANGE_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.NAVY_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.NAVY_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.MAROON_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.MAROON_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.GREY_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.GREY_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.GREEN_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.GREEN_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.FADED_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.FADED_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BROWN_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.BROWN_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BLUE_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.BLUE_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BLACK_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.BLACK_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BEIGE_BRICKS_SLAB_MOSSY.get(), 6)
                .define('A', MEBlocks.BEIGE_BRICKS_MOSSY.get())
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.YELLOW_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.YELLOW_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.WHITE_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.WHITE_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.SWAMPY_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.SWAMPY_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.RED_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.RED_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.PURPLE_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.PURPLE_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.PINK_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.PINK_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.PALE_BLUE_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.PALE_BLUE_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.ORANGE_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.ORANGE_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.NAVY_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.NAVY_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.MAROON_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.MAROON_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.GREY_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.GREY_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.GREEN_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.GREEN_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.FADED_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.FADED_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BROWN_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.BROWN_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BLUE_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.BLUE_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BLACK_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.BLACK_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BEIGE_BRICKS_STAIRS.get(), 4)
                .define('A', MEBlocks.BEIGE_BRICKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.YELLOW_BRICKS_MOSSY.get())
                .requires(MEBlocks.YELLOW_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.WHITE_BRICKS_MOSSY.get())
                .requires(MEBlocks.WHITE_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.SWAMPY_BRICKS_MOSSY.get())
                .requires(MEBlocks.SWAMPY_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.RED_BRICKS_MOSSY.get())
                .requires(MEBlocks.RED_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.PURPLE_BRICKS_MOSSY.get())
                .requires(MEBlocks.PURPLE_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.PINK_BRICKS_MOSSY.get())
                .requires(MEBlocks.PINK_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.PALE_BLUE_BRICKS_MOSSY.get())
                .requires(MEBlocks.PALE_BLUE_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.ORANGE_BRICKS_MOSSY.get())
                .requires(MEBlocks.ORANGE_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.NAVY_BRICKS_MOSSY.get())
                .requires(MEBlocks.NAVY_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.MAROON_BRICKS_MOSSY.get())
                .requires(MEBlocks.MAROON_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.GREY_BRICKS_MOSSY.get())
                .requires(MEBlocks.GREY_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.GREEN_BRICKS_MOSSY.get())
                .requires(MEBlocks.GREEN_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.FADED_BRICKS_MOSSY.get())
                .requires(MEBlocks.FADED_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.BROWN_BRICKS_MOSSY.get())
                .requires(MEBlocks.BROWN_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.BLACK_BRICKS_MOSSY.get())
                .requires(MEBlocks.BLACK_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.BLUE_BRICKS_MOSSY.get())
                .requires(MEBlocks.BLUE_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.BEIGE_BRICKS_MOSSY.get())
                .requires(MEBlocks.BEIGE_BRICKS.get())
                .requires(Items.VINE)
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.YELLOW_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.YELLOW_DYE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.WHITE_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.WHITE_DYE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.SWAMPY_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.VINE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.RED_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.RED_DYE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.PURPLE_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.PURPLE_DYE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.PINK_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.PINK_DYE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.PALE_BLUE_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.LIGHT_BLUE_DYE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.ORANGE_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.ORANGE_DYE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.NAVY_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.LAPIS_LAZULI)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.MAROON_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.RED_DYE)
                .define('C', Items.BROWN_DYE)
                .pattern("BBB")
                .pattern("CAB")
                .pattern("CCC")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.GREY_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.GRAY_DYE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.GREEN_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.GREEN_DYE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.FADED_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.DIRT)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BROWN_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.BROWN_DYE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BLACK_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.BLACK_DYE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BLUE_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Items.BLUE_DYE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEBlocks.BEIGE_BRICKS.get(), 8)
                .define('A', Blocks.BRICKS)
                .define('B', Blocks.SAND)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .unlockedBy("has_bricks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BRICKS).build()))
                .save(pFinishedRecipeConsumer);
    }

}