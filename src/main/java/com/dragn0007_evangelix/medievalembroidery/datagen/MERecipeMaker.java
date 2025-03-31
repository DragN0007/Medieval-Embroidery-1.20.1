package com.dragn0007_evangelix.medievalembroidery.datagen;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocksDataGen;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import com.dragn0007_evangelix.medievalembroidery.util.METags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEBlocks.OBSIDIAN_GROUNDED_SWORD.get())
                .requires(MEItems.OBSIDIAN_SWORD.get())
                .unlockedBy("has_sword", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.OBSIDIAN_SWORD.get())
                        .build()))
                .save(pFinishedRecipeConsumer);



//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.FANGED_ELK_HELMET_IRON.get())
//                .requires(MEItems.FANGED_ELK_HELMET.get())
//                .requires(Items.IRON_INGOT)
//                .requires(Items.IRON_INGOT)
//                .unlockedBy("has_antlers", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.FANGED_ELK_HELMET.get())
//                        .build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.FANGED_ELK_HELMET_GOLD.get())
//                .requires(MEItems.FANGED_ELK_HELMET.get())
//                .requires(Items.GOLD_INGOT)
//                .requires(Items.GOLD_INGOT)
//                .unlockedBy("has_antlers", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.FANGED_ELK_HELMET.get())
//                        .build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.FANGED_ELK_HELMET_DIAMOND.get())
//                .requires(MEItems.FANGED_ELK_HELMET.get())
//                .requires(Items.DIAMOND)
//                .requires(Items.DIAMOND)
//                .unlockedBy("has_antlers", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.FANGED_ELK_HELMET.get())
//                        .build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.FANGED_ELK_HELMET_NETHERITE.get())
//                .requires(MEItems.FANGED_ELK_HELMET_DIAMOND.get())
//                .requires(Items.NETHERITE_INGOT)
//                .unlockedBy("has_antlers", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.FANGED_ELK_HELMET.get())
//                        .build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.FANGED_ELK_HELMET_OBSIDIAN.get())
//                .requires(MEItems.FANGED_ELK_HELMET.get())
//                .requires(MEItems.OBSIDIAN_SHARD.get())
//                .requires(MEItems.OBSIDIAN_SHARD.get())
//                .unlockedBy("has_antlers", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.FANGED_ELK_HELMET.get())
//                        .build()))
//                .save(pFinishedRecipeConsumer);
//
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.OBSIDIAN_HELMET.get())
//                .define('A', MEItems.OBSIDIAN_SHARD.get())
//                .define('B', MEItems.CRYING_OBSIDIAN_SHARD.get())
//                .define('C', Items.DIAMOND_HELMET)
//                .pattern("ABA")
//                .pattern("ACA")
//                .unlockedBy("has_obsidian_shard", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.OBSIDIAN_SHARD.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.OBSIDIAN_CHESTPLATE.get())
//                .define('A', MEItems.OBSIDIAN_SHARD.get())
//                .define('B', MEItems.CRYING_OBSIDIAN_SHARD.get())
//                .define('C', Items.DIAMOND_CHESTPLATE)
//                .pattern("A A")
//                .pattern("ACA")
//                .pattern("ABA")
//                .unlockedBy("has_obsidian_shard", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.OBSIDIAN_SHARD.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.OBSIDIAN_LEGGINGS.get())
//                .define('A', MEItems.OBSIDIAN_SHARD.get())
//                .define('B', MEItems.CRYING_OBSIDIAN_SHARD.get())
//                .define('C', Items.DIAMOND_LEGGINGS)
//                .pattern("ACA")
//                .pattern("A A")
//                .pattern("B B")
//                .unlockedBy("has_obsidian_shard", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.OBSIDIAN_SHARD.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.OBSIDIAN_BOOTS.get())
//                .define('A', MEItems.OBSIDIAN_SHARD.get())
//                .define('B', MEItems.CRYING_OBSIDIAN_SHARD.get())
//                .define('C', Items.DIAMOND_BOOTS)
//                .pattern("ACA")
//                .pattern("B B")
//                .unlockedBy("has_obsidian_shard", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.OBSIDIAN_SHARD.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.YAK_WOOL_HELMET.get())
//                .define('A', MEItems.YAK_WOOL.get())
//                .pattern("AAA")
//                .pattern("A A")
//                .unlockedBy("has_yak_wool", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.YAK_WOOL.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.YAK_WOOL_CHESTPLATE.get())
//                .define('A', MEItems.YAK_WOOL.get())
//                .pattern("A A")
//                .pattern("AAA")
//                .pattern("AAA")
//                .unlockedBy("has_yak_wool", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.YAK_WOOL.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.YAK_WOOL_LEGGINGS.get())
//                .define('A', MEItems.YAK_WOOL.get())
//                .pattern("AAA")
//                .pattern("A A")
//                .pattern("A A")
//                .unlockedBy("has_yak_wool", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.YAK_WOOL.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.YAK_WOOL_BOOTS.get())
//                .define('A', MEItems.YAK_WOOL.get())
//                .pattern("A A")
//                .pattern("A A")
//                .unlockedBy("has_yak_wool", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.YAK_WOOL.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.DIREWOLF_CHESTPLATE.get())
//                .define('A', MEItems.BOAR_FUR.get())
//                .define('B', Items.IRON_INGOT)
//                .pattern("A A")
//                .pattern("ABA")
//                .pattern("ABA")
//                .unlockedBy("has_direwolf_fur", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.DIREWOLF_FUR.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.DIREWOLF_LEGGINGS.get())
//                .define('A', MEItems.BOAR_FUR.get())
//                .define('B', Items.IRON_INGOT)
//                .pattern("AAA")
//                .pattern("A A")
//                .pattern("B B")
//                .unlockedBy("has_direwolf_fur", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.DIREWOLF_FUR.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.DIREWOLF_BOOTS.get())
//                .define('A', MEItems.BOAR_FUR.get())
//                .define('B', Items.IRON_INGOT)
//                .pattern("A A")
//                .pattern("B B")
//                .unlockedBy("has_direwolf_fur", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.DIREWOLF_FUR.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.BOAR_CHESTPLATE.get())
//                .define('A', MEItems.BOAR_FUR.get())
//                .define('B', Items.IRON_INGOT)
//                .pattern("A A")
//                .pattern("ABA")
//                .pattern("ABA")
//                .unlockedBy("has_boar_fur", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.BOAR_FUR.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.BOAR_LEGGINGS.get())
//                .define('A', MEItems.BOAR_FUR.get())
//                .define('B', Items.IRON_INGOT)
//                .pattern("AAA")
//                .pattern("A A")
//                .pattern("B B")
//                .unlockedBy("has_boar_fur", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.BOAR_FUR.get()).build()))
//                .save(pFinishedRecipeConsumer);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.BOAR_BOOTS.get())
//                .define('A', MEItems.BOAR_FUR.get())
//                .define('B', Items.IRON_INGOT)
//                .pattern("A A")
//                .pattern("B B")
//                .unlockedBy("has_boar_fur", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(MEItems.BOAR_FUR.get()).build()))
//                .save(pFinishedRecipeConsumer);






        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.MATSUTAKE_SPORES.get())
                .requires(MEItems.MATSUTAKE.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.MATSUTAKE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.PORCINI_SPORES.get())
                .requires(MEItems.PORCINI.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.PORCINI.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.KING_SPORES.get())
                .requires(MEItems.KING.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.KING.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HONEY_SPORES.get())
                .requires(MEItems.HONEY.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.HONEY.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.YELLOWFOOT_SPORES.get())
                .requires(MEItems.YELLOWFOOT.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.YELLOWFOOT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.OYSTER_SPORES.get())
                .requires(MEItems.OYSTER.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.OYSTER.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.WOODSCHICKEN_SPORES.get())
                .requires(MEItems.WOODSCHICKEN.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.WOODSCHICKEN.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.BLEWIT_SPORES.get())
                .requires(MEItems.BLEWIT.get())
                .unlockedBy("has_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.BLEWIT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.STEW_JARRED.get())
                .requires(METags.Items.VEGETABLES)
                .requires(METags.Items.HERBS)
                .requires(METags.Items.COOKED_MEATS)
                .requires(MEItems.SALT.get())
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SOUP_JARRED.get())
                .requires(METags.Items.HERBS)
                .requires(METags.Items.HERBS)
                .requires(METags.Items.WATER)
                .requires(MEItems.SALT.get())
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(METags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);



        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.BLEWIT.get()), RecipeCategory.MISC, MEItems.COOKED_BLEWIT.get(), 0.35F, 200)
                .unlockedBy("has_blewit_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.BLEWIT.get()).build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.HONEY.get()), RecipeCategory.MISC, MEItems.COOKED_HONEY.get(), 0.35F, 200)
                .unlockedBy("has_honey_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.HONEY.get()).build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.MATSUTAKE.get()), RecipeCategory.MISC, MEItems.COOKED_MATSUTAKE.get(), 0.35F, 200)
                .unlockedBy("has_matsutake_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.MATSUTAKE.get()).build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.WOODSCHICKEN.get()), RecipeCategory.MISC, MEItems.COOKED_WOODSCHICKEN.get(), 0.35F, 200)
                .unlockedBy("has_woodschicken_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.WOODSCHICKEN.get()).build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.OYSTER.get()), RecipeCategory.MISC, MEItems.COOKED_OYSTER.get(), 0.35F, 200)
                .unlockedBy("has_oyster_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.OYSTER.get()).build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.YELLOWFOOT.get()), RecipeCategory.MISC, MEItems.COOKED_YELLOWFOOT.get(), 0.35F, 200)
                .unlockedBy("has_yellowfoot_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.YELLOWFOOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.PORCINI.get()), RecipeCategory.MISC, MEItems.COOKED_PORCINI.get(), 0.35F, 200)
                .unlockedBy("has_porcini_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.PORCINI.get()).build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(MEItems.KING.get()), RecipeCategory.MISC, MEItems.COOKED_KING.get(), 0.35F, 200)
                .unlockedBy("has_king_mushroom", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.KING.get()).build()))
                .save(pFinishedRecipeConsumer);





        //TODO;
         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SUMMONING_SPELL_WEATHER.get())
                .requires(MEItems.SUMMONING_SPELL.get())
                .requires(MEItems.WEATHER_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_summoning_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SUMMONING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SUMMONING_SPELL_ASTRO.get())
                .requires(MEItems.SUMMONING_SPELL.get())
                .requires(MEItems.ASTRO_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_summoning_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SUMMONING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SUMMONING_SPELL_DEPTHS.get())
                .requires(MEItems.SUMMONING_SPELL.get())
                .requires(MEItems.DEPTHS_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_summoning_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SUMMONING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SUMMONING_SPELL_NATURE.get())
                .requires(MEItems.SUMMONING_SPELL.get())
                .requires(MEItems.NATURE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_summoning_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SUMMONING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SUMMONING_SPELL_ICE.get())
                .requires(MEItems.SUMMONING_SPELL.get())
                .requires(MEItems.ICE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_summoning_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SUMMONING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SUMMONING_SPELL_WATER.get())
                .requires(MEItems.SUMMONING_SPELL.get())
                .requires(MEItems.WATER_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_summoning_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SUMMONING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.SUMMONING_SPELL_FIRE.get())
                .requires(MEItems.SUMMONING_SPELL.get())
                .requires(MEItems.FIRE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_summoning_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.SUMMONING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);




         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.OFFENSIVE_SPELL_WEATHER.get())
                .requires(MEItems.OFFENSIVE_SPELL.get())
                .requires(MEItems.WEATHER_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_offensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.OFFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.OFFENSIVE_SPELL_ASTRO.get())
                .requires(MEItems.OFFENSIVE_SPELL.get())
                .requires(MEItems.ASTRO_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_offensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.OFFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.OFFENSIVE_SPELL_DEPTHS.get())
                .requires(MEItems.OFFENSIVE_SPELL.get())
                .requires(MEItems.DEPTHS_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_offensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.OFFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.OFFENSIVE_SPELL_NATURE.get())
                .requires(MEItems.OFFENSIVE_SPELL.get())
                .requires(MEItems.NATURE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_offensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.OFFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.OFFENSIVE_SPELL_ICE.get())
                .requires(MEItems.OFFENSIVE_SPELL.get())
                .requires(MEItems.ICE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_offensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.OFFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.OFFENSIVE_SPELL_WATER.get())
                .requires(MEItems.OFFENSIVE_SPELL.get())
                .requires(MEItems.WATER_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_offensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.OFFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.OFFENSIVE_SPELL_FIRE.get())
                .requires(MEItems.OFFENSIVE_SPELL.get())
                .requires(MEItems.FIRE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_offensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.OFFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);





         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HEALING_SPELL_WEATHER.get())
                .requires(MEItems.HEALING_SPELL.get())
                .requires(MEItems.WEATHER_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_healing_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.HEALING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HEALING_SPELL_ASTRO.get())
                .requires(MEItems.HEALING_SPELL.get())
                .requires(MEItems.ASTRO_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_healing_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.HEALING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HEALING_SPELL_DEPTHS.get())
                .requires(MEItems.HEALING_SPELL.get())
                .requires(MEItems.DEPTHS_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_healing_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.HEALING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HEALING_SPELL_NATURE.get())
                .requires(MEItems.HEALING_SPELL.get())
                .requires(MEItems.NATURE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_healing_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.HEALING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HEALING_SPELL_ICE.get())
                .requires(MEItems.HEALING_SPELL.get())
                .requires(MEItems.ICE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_healing_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.HEALING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HEALING_SPELL_WATER.get())
                .requires(MEItems.HEALING_SPELL.get())
                .requires(MEItems.WATER_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_healing_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.HEALING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.HEALING_SPELL_FIRE.get())
                .requires(MEItems.HEALING_SPELL.get())
                .requires(MEItems.FIRE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_healing_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.HEALING_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);






         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.DEFENSIVE_SPELL_WEATHER.get())
                .requires(MEItems.DEFENSIVE_SPELL.get())
                .requires(MEItems.WEATHER_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_defensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.DEFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.DEFENSIVE_SPELL_ASTRO.get())
                .requires(MEItems.DEFENSIVE_SPELL.get())
                .requires(MEItems.ASTRO_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_defensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.DEFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.DEFENSIVE_SPELL_DEPTHS.get())
                .requires(MEItems.DEFENSIVE_SPELL.get())
                .requires(MEItems.DEPTHS_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_defensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.DEFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.DEFENSIVE_SPELL_NATURE.get())
                .requires(MEItems.DEFENSIVE_SPELL.get())
                .requires(MEItems.NATURE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_defensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.DEFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.DEFENSIVE_SPELL_ICE.get())
                .requires(MEItems.DEFENSIVE_SPELL.get())
                .requires(MEItems.ICE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_defensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.DEFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.DEFENSIVE_SPELL_WATER.get())
                .requires(MEItems.DEFENSIVE_SPELL.get())
                .requires(MEItems.WATER_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_defensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.DEFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.DEFENSIVE_SPELL_FIRE.get())
                .requires(MEItems.DEFENSIVE_SPELL.get())
                .requires(MEItems.FIRE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_defensive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.DEFENSIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);





         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ASSISTIVE_SPELL_WEATHER.get())
                .requires(MEItems.ASSISTIVE_SPELL.get())
                .requires(MEItems.WEATHER_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_assistive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.ASSISTIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ASSISTIVE_SPELL_ASTRO.get())
                .requires(MEItems.ASSISTIVE_SPELL.get())
                .requires(MEItems.ASTRO_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_assistive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.ASSISTIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ASSISTIVE_SPELL_DEPTHS.get())
                .requires(MEItems.ASSISTIVE_SPELL.get())
                .requires(MEItems.DEPTHS_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_assistive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.ASSISTIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ASSISTIVE_SPELL_NATURE.get())
                .requires(MEItems.ASSISTIVE_SPELL.get())
                .requires(MEItems.NATURE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_assistive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.ASSISTIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ASSISTIVE_SPELL_ICE.get())
                .requires(MEItems.ASSISTIVE_SPELL.get())
                .requires(MEItems.ICE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_assistive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.ASSISTIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ASSISTIVE_SPELL_WATER.get())
                .requires(MEItems.ASSISTIVE_SPELL.get())
                .requires(MEItems.WATER_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_assistive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.ASSISTIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ASSISTIVE_SPELL_FIRE.get())
                .requires(MEItems.ASSISTIVE_SPELL.get())
                .requires(MEItems.FIRE_RIBBON.get())
                .requires(Items.GOLD_INGOT)

                .unlockedBy("has_assistive_scroll", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.ASSISTIVE_SPELL.get()).build()))
                .save(pFinishedRecipeConsumer);






         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.WEATHER_RIBBON.get())
                .requires(MEItems.SKYSTONE.get())
                .requires(MEItems.RIBBON.get())

                .unlockedBy("has_ribbon", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.RIBBON.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ASTRO_RIBBON.get())
                .requires(MEItems.ASTROSTONE.get())
                .requires(MEItems.RIBBON.get())

                .unlockedBy("has_ribbon", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.RIBBON.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.DEPTHS_RIBBON.get())
                .requires(MEItems.DEPTHSTONE.get())
                .requires(MEItems.RIBBON.get())

                .unlockedBy("has_ribbon", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.RIBBON.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.NATURE_RIBBON.get())
                .requires(MEItems.MOSSTONE.get())
                .requires(MEItems.RIBBON.get())

                .unlockedBy("has_ribbon", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.RIBBON.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ICE_RIBBON.get())
                .requires(MEItems.FROSTSTONE.get())
                .requires(MEItems.RIBBON.get())

                .unlockedBy("has_ribbon", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.RIBBON.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.WATER_RIBBON.get())
                .requires(MEItems.SEASTONE.get())
                .requires(MEItems.RIBBON.get())

                .unlockedBy("has_ribbon", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.RIBBON.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.FIRE_RIBBON.get())
                .requires(MEItems.FIRESTONE.get())
                .requires(MEItems.RIBBON.get())

                .unlockedBy("has_ribbon", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(MEItems.RIBBON.get()).build()))
                .save(pFinishedRecipeConsumer);

         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.RIBBON.get())
                .requires(Items.WHITE_WOOL)
                .requires(Items.GOLD_NUGGET)

                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WHITE_WOOL).build()))
                .save(pFinishedRecipeConsumer);


         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MEItems.ATTUNED_SCROLL.get())
                .requires(Items.PAPER)
                .requires(MEItems.CRYSTAL_DUST.get())

                .unlockedBy("has_paper", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.PAPER).build()))
                .save(pFinishedRecipeConsumer);




        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.OBSIDIAN_BATTLEAXE.get())
                .define('A', Items.STICK)
                .define('B', MEItems.OBSIDIAN_SHARD.get())
                .define('D', Items.DIAMOND_AXE)
                .pattern("BDB")
                .pattern("BAB")
                .pattern(" A ")
                .unlockedBy("has_obsidian", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.OBSIDIAN).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.OBSIDIAN_HOE.get())
                .define('A', Items.STICK)
                .define('B', MEItems.OBSIDIAN_SHARD.get())
                .define('C', Items.DIAMOND)
                .define('D', Items.DIAMOND_HOE)
                .pattern("BCD")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_obsidian", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.OBSIDIAN).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.OBSIDIAN_SHOVEL.get())
                .define('A', Items.STICK)
                .define('B', MEItems.OBSIDIAN_SHARD.get())
                .define('D', Items.DIAMOND_SHOVEL)
                .pattern(" BD")
                .pattern(" A ")
                .pattern(" A ")
                .unlockedBy("has_obsidian", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.OBSIDIAN).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.OBSIDIAN_SWORD.get())
                .define('A', Items.STICK)
                .define('B', MEItems.OBSIDIAN_SHARD.get())
                .define('D', Items.DIAMOND_SWORD)
                .pattern(" BD")
                .pattern(" B ")
                .pattern(" A ")
                .unlockedBy("has_obsidian", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.OBSIDIAN).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.OBSIDIAN_PICKAXE.get())
                .define('A', Items.STICK)
                .define('B', MEItems.OBSIDIAN_SHARD.get())
                .define('C', Items.DIAMOND)
                .define('D', Items.DIAMOND_PICKAXE)
                .pattern("BCB")
                .pattern(" AD")
                .pattern(" A ")
                .unlockedBy("has_obsidian", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.OBSIDIAN).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.OBSIDIAN_AXE.get())
                .define('A', Items.STICK)
                .define('B', MEItems.OBSIDIAN_SHARD.get())
                .define('C', Items.DIAMOND)
                .define('D', Items.DIAMOND_AXE)
                .pattern("BCD")
                .pattern("BA ")
                .pattern(" A ")
                .unlockedBy("has_obsidian", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.OBSIDIAN).build()))
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MEItems.MORTARNPESTLE.get())
                .define('A', Items.BOWL)
                .define('B', Items.COBBLESTONE)
                .pattern("A")
                .pattern("B")
                .unlockedBy("has_stone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.COBBLESTONE).build()))
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