package com.dragn0007_evangelix.medievalembroidery.datagen.biglooter;

import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.custom.crop.MEHerbBlock;
import com.dragn0007_evangelix.medievalembroidery.item.MEItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class MEBlockLoot extends BlockLootSubProvider {

    public MEBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        add(MEBlocks.FIRESTONE_ORE.get(), block -> createOreDrop(MEBlocks.FIRESTONE_ORE.get(), MEItems.FIRESTONE.get()));
        dropSelf(MEBlocks.FIRESTONE_BLOCK.get());
        add(MEBlocks.SEASTONE_ORE.get(), block -> createOreDrop(MEBlocks.SEASTONE_ORE.get(), MEItems.SEASTONE.get()));
        dropSelf(MEBlocks.SEASTONE_BLOCK.get());
        add(MEBlocks.FROSTSTONE_ORE.get(), block -> createOreDrop(MEBlocks.FROSTSTONE_ORE.get(), MEItems.FROSTSTONE.get()));
        dropSelf(MEBlocks.FROSTSTONE_BLOCK.get());
        add(MEBlocks.MOSSTONE_ORE.get(), block -> createOreDrop(MEBlocks.MOSSTONE_ORE.get(), MEItems.MOSSTONE.get()));
        dropSelf(MEBlocks.MOSSTONE_BLOCK.get());
        add(MEBlocks.ASTROSTONE_ORE.get(), block -> createOreDrop(MEBlocks.ASTROSTONE_ORE.get(), MEItems.ASTROSTONE.get()));
        dropSelf(MEBlocks.ASTROSTONE_BLOCK.get());
        add(MEBlocks.DEPTHSTONE_ORE.get(), block -> createOreDrop(MEBlocks.DEPTHSTONE_ORE.get(), MEItems.DEPTHSTONE.get()));
        dropSelf(MEBlocks.DEPTHSTONE_BLOCK.get());
        add(MEBlocks.SKYSTONE_ORE.get(), block -> createOreDrop(MEBlocks.SKYSTONE_ORE.get(), MEItems.SKYSTONE.get()));
        dropSelf(MEBlocks.SKYSTONE_BLOCK.get());
        add(MEBlocks.SALT_ORE.get(), block -> createOreDrop(MEBlocks.SALT_ORE.get(), MEItems.SALT.get()));

        add(MEBlocks.ASSISTIVE_CRYSTAL_ORE.get(), block -> createOreDrop(MEBlocks.ASSISTIVE_CRYSTAL_ORE.get(), MEItems.ASSISTIVE_CRYSTAL_SHARD.get()));
        add(MEBlocks.CONJURING_CRYSTAL_ORE.get(), block -> createOreDrop(MEBlocks.CONJURING_CRYSTAL_ORE.get(), MEItems.CONJURING_CRYSTAL_SHARD.get()));
        add(MEBlocks.DESTRUCTIVE_CRYSTAL_ORE.get(), block -> createOreDrop(MEBlocks.DESTRUCTIVE_CRYSTAL_ORE.get(), MEItems.DESTRUCTIVE_CRYSTAL_SHARD.get()));
        add(MEBlocks.HEALING_CRYSTAL_ORE.get(), block -> createOreDrop(MEBlocks.HEALING_CRYSTAL_ORE.get(), MEItems.HEALING_CRYSTAL_SHARD.get()));
        add(MEBlocks.PROTECTIVE_CRYSTAL_ORE.get(), block -> createOreDrop(MEBlocks.PROTECTIVE_CRYSTAL_ORE.get(), MEItems.PROTECTIVE_CRYSTAL_SHARD.get()));

        dropSelf(MEBlocks.CONJURING_CRYSTAL_BALL.get());

        dropOther(MEBlocks.SWEET_BREAD.get(), MEItems.SWEET_BREAD.get());
        dropOther(MEBlocks.SWEET_BREAD_CREAM.get(), MEItems.SWEET_BREAD_CREAM.get());
        dropOther(MEBlocks.SWEET_BREAD_HONEY.get(), MEItems.SWEET_BREAD_HONEY.get());
        dropOther(MEBlocks.SWEET_BREAD_REDCURRANT.get(), MEItems.REDCURRANT_SWEET_BREAD_CREAM.get());
        dropOther(MEBlocks.SWEET_BREAD_BILBERRY.get(), MEItems.BILBERRY_SWEET_BREAD_CREAM.get());
        dropOther(MEBlocks.SWEET_BREAD_COWBERRY.get(), MEItems.COWBERRY_SWEET_BREAD_CREAM.get());
        dropOther(MEBlocks.SWEET_BREAD_HAWTHORN.get(), MEItems.HAWTHORN_SWEET_BREAD_CREAM.get());
        dropOther(MEBlocks.SWEET_BREAD_ELDERBERRY.get(), MEItems.ELDERBERRY_SWEET_BREAD_CREAM.get());
        dropOther(MEBlocks.SWEET_BREAD_FRUIT.get(), MEItems.FRUIT_SWEET_BREAD_CREAM.get());

        this.dropOther(MEBlocks.WILD_BRUTEFLOWER.get(), MEItems.BRUTEFLOWER.get());
        LootItemCondition.Builder lootitemcondition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.BRUTEFLOWER.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.BRUTEFLOWER.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.BRUTEFLOWER.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder1).add(LootItem.lootTableItem
                (MEItems.BRUTEFLOWER.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(MEBlocks.WILD_CACHEN.get(), MEItems.CACHEN.get());
        LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.CACHEN.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.CACHEN.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.CACHEN.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder2).add(LootItem.lootTableItem
                (MEItems.CACHEN.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(MEBlocks.WILD_CANNAAN.get(), MEItems.CANNAAN.get());
        LootItemCondition.Builder lootitemcondition$builder3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.CANNAAN.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.CANNAAN.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.CANNAAN.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder3).add(LootItem.lootTableItem
                (MEItems.CANNAAN.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(MEBlocks.WILD_DRAGONEYE.get(), MEItems.DRAGONEYE.get());
        LootItemCondition.Builder lootitemcondition$builder4 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.DRAGONEYE.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.DRAGONEYE.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.DRAGONEYE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder4).add(LootItem.lootTableItem
                (MEItems.DRAGONEYE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(MEBlocks.WILD_SPRINNAN.get(), MEItems.SPRINNAN.get());
        LootItemCondition.Builder lootitemcondition$builder5 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.SPRINNAN.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.SPRINNAN.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.SPRINNAN.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder5).add(LootItem.lootTableItem
                (MEItems.SPRINNAN.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(MEBlocks.WILD_SPRINNAN.get(), MEItems.SPRINNAN.get());
        LootItemCondition.Builder lootitemcondition$builder6 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.SPRINNAN.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.SPRINNAN.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.SPRINNAN.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder6).add(LootItem.lootTableItem
                (MEItems.SPRINNAN.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(MEBlocks.WILD_GRANGIN.get(), MEItems.GRANGIN.get());
        LootItemCondition.Builder lootitemcondition$builder7 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.GRANGIN.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.GRANGIN.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.GRANGIN.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder7).add(LootItem.lootTableItem
                (MEItems.GRANGIN.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(MEBlocks.WILD_FAIRYFLOWER.get(), MEItems.FAIRYFLOWER.get());
        LootItemCondition.Builder lootitemcondition$builder8 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.FAIRYFLOWER.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.FAIRYFLOWER.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.FAIRYFLOWER.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder8).add(LootItem.lootTableItem
                (MEItems.FAIRYFLOWER.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(MEBlocks.WILD_LADYRIVER.get(), MEItems.LADYRIVER.get());
        LootItemCondition.Builder lootitemcondition$builder9 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.LADYRIVER.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.LADYRIVER.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.LADYRIVER.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder9).add(LootItem.lootTableItem
                (MEItems.LADYRIVER.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(MEBlocks.WILD_HENVEN.get(), MEItems.HENVEN.get());
        LootItemCondition.Builder lootitemcondition$builder23 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.HENVEN.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.HENVEN.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.HENVEN.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder23).add(LootItem.lootTableItem
                (MEItems.HENVEN.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropOther(MEBlocks.WILD_VIRENNES.get(), MEItems.VIRENNES.get());
        LootItemCondition.Builder lootitemcondition$builder24 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.VIRENNES.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.VIRENNES.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.VIRENNES.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder24).add(LootItem.lootTableItem
                (MEItems.VIRENNES.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder10 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.BILBERRY_BUSH.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.BILBERRY_BUSH.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.BILBERRY.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder10).add(LootItem.lootTableItem
                (MEItems.BILBERRY.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder11 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.COWBERRY_BUSH.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.COWBERRY_BUSH.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.COWBERRY.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder11).add(LootItem.lootTableItem
                (MEItems.COWBERRY.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder12 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.ELDERBERRY_BUSH.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.ELDERBERRY_BUSH.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.ELDERBERRY.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder12).add(LootItem.lootTableItem
                (MEItems.ELDERBERRY.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder13 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.HAWTHORN_BUSH.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.HAWTHORN_BUSH.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.HAWTHORNBERRY.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder13).add(LootItem.lootTableItem
                (MEItems.HAWTHORNBERRY.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        LootItemCondition.Builder lootitemcondition$builder14 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.REDCURRANT_BUSH.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 3));
        this.add(MEBlocks.REDCURRANT_BUSH.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.REDCURRANT.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder14).add(LootItem.lootTableItem
                (MEItems.REDCURRANT.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        dropSelf(MEBlocks.BLUE_DRAGON.get());
        dropSelf(MEBlocks.VIOLET_DRAGON.get());
        dropSelf(MEBlocks.PINK_MAGE.get());
        dropSelf(MEBlocks.PURPLE_MAGE.get());
        dropSelf(MEBlocks.FIRE_DAISY.get());
        dropSelf(MEBlocks.GROUND_VINE.get());

        this.dropSelf(MEBlocks.WILD_BLEWIT.get());
        LootItemCondition.Builder lootitemcondition$builder15 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.BLEWIT.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 2));
        this.add(MEBlocks.BLEWIT.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.BLEWIT.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder15).add(LootItem.lootTableItem
                (MEItems.BLEWIT.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));


        this.dropSelf(MEBlocks.WILD_KING.get());
        LootItemCondition.Builder lootitemcondition$builder16 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.KING.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 2));
        this.add(MEBlocks.KING.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.KING.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder16).add(LootItem.lootTableItem
                (MEItems.KING.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropSelf(MEBlocks.WILD_HONEY.get());
        LootItemCondition.Builder lootitemcondition$builder17 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.HONEY.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 2));
        this.add(MEBlocks.HONEY.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.HONEY.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder17).add(LootItem.lootTableItem
                (MEItems.HONEY.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropSelf(MEBlocks.WILD_MATSUTAKE.get());
        LootItemCondition.Builder lootitemcondition$builder18 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.MATSUTAKE.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 2));
        this.add(MEBlocks.MATSUTAKE.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.MATSUTAKE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder18).add(LootItem.lootTableItem
                (MEItems.MATSUTAKE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropSelf(MEBlocks.WILD_OYSTER.get());
        LootItemCondition.Builder lootitemcondition$builder19 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.OYSTER.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 2));
        this.add(MEBlocks.OYSTER.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.OYSTER.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder19).add(LootItem.lootTableItem
                (MEItems.OYSTER.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropSelf(MEBlocks.WILD_PORCINI.get());
        LootItemCondition.Builder lootitemcondition$builder20 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.PORCINI.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 2));
        this.add(MEBlocks.PORCINI.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.PORCINI.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder20).add(LootItem.lootTableItem
                (MEItems.PORCINI.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropSelf(MEBlocks.WILD_YELLOWFOOT.get());
        LootItemCondition.Builder lootitemcondition$builder21 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.YELLOWFOOT.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 2));
        this.add(MEBlocks.YELLOWFOOT.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.YELLOWFOOT.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder21).add(LootItem.lootTableItem
                (MEItems.YELLOWFOOT.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        this.dropSelf(MEBlocks.WILD_WOODS_CHICKEN.get());
        LootItemCondition.Builder lootitemcondition$builder22 = LootItemBlockStatePropertyCondition.hasBlockStateProperties
                (MEBlocks.WOODS_CHICKEN.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty
                (MEHerbBlock.AGE, 2));
        this.add(MEBlocks.WOODS_CHICKEN.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem
                (MEItems.WOODS_CHICKEN.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder22).add(LootItem.lootTableItem
                (MEItems.WOODS_CHICKEN.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2)))));

        dropSelf(MEBlocks.BEIGE_BRICKS.get());
        dropSelf(MEBlocks.BLACK_BRICKS.get());
        dropSelf(MEBlocks.BLUE_BRICKS.get());
        dropSelf(MEBlocks.BROWN_BRICKS.get());
        dropSelf(MEBlocks.FADED_BRICKS.get());
        dropSelf(MEBlocks.GREEN_BRICKS.get());
        dropSelf(MEBlocks.GREY_BRICKS.get());
        dropSelf(MEBlocks.MAROON_BRICKS.get());
        dropSelf(MEBlocks.NAVY_BRICKS.get());
        dropSelf(MEBlocks.ORANGE_BRICKS.get());
        dropSelf(MEBlocks.PALE_BLUE_BRICKS.get());
        dropSelf(MEBlocks.PINK_BRICKS.get());
        dropSelf(MEBlocks.PURPLE_BRICKS.get());
        dropSelf(MEBlocks.RED_BRICKS.get());
        dropSelf(MEBlocks.SWAMPY_BRICKS.get());
        dropSelf(MEBlocks.WHITE_BRICKS.get());
        dropSelf(MEBlocks.YELLOW_BRICKS.get());
        dropSelf(MEBlocks.BEIGE_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.BLACK_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.BLUE_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.BROWN_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.FADED_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.GREEN_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.GREY_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.MAROON_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.NAVY_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.ORANGE_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.PALE_BLUE_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.PINK_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.PURPLE_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.RED_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.SWAMPY_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.WHITE_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.YELLOW_BRICKS_MOSSY.get());
        dropSelf(MEBlocks.BEIGE_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.BLACK_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.BLUE_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.BROWN_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.FADED_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.GREEN_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.GREY_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.MAROON_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.NAVY_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.ORANGE_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.PALE_BLUE_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.PINK_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.PURPLE_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.RED_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.SWAMPY_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.WHITE_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.YELLOW_BRICKS_STAIRS.get());
        dropSelf(MEBlocks.BEIGE_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.BLACK_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.BLUE_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.BROWN_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.FADED_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.GREEN_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.GREY_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.MAROON_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.NAVY_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.ORANGE_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.PALE_BLUE_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.PINK_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.PURPLE_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.RED_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.SWAMPY_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.WHITE_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.YELLOW_BRICKS_STAIRS_MOSSY.get());
        dropSelf(MEBlocks.BEIGE_BRICKS_SLAB.get());
        dropSelf(MEBlocks.BLACK_BRICKS_SLAB.get());
        dropSelf(MEBlocks.BLUE_BRICKS_SLAB.get());
        dropSelf(MEBlocks.BROWN_BRICKS_SLAB.get());
        dropSelf(MEBlocks.FADED_BRICKS_SLAB.get());
        dropSelf(MEBlocks.GREEN_BRICKS_SLAB.get());
        dropSelf(MEBlocks.GREY_BRICKS_SLAB.get());
        dropSelf(MEBlocks.MAROON_BRICKS_SLAB.get());
        dropSelf(MEBlocks.NAVY_BRICKS_SLAB.get());
        dropSelf(MEBlocks.ORANGE_BRICKS_SLAB.get());
        dropSelf(MEBlocks.PALE_BLUE_BRICKS_SLAB.get());
        dropSelf(MEBlocks.PINK_BRICKS_SLAB.get());
        dropSelf(MEBlocks.PURPLE_BRICKS_SLAB.get());
        dropSelf(MEBlocks.RED_BRICKS_SLAB.get());
        dropSelf(MEBlocks.SWAMPY_BRICKS_SLAB.get());
        dropSelf(MEBlocks.WHITE_BRICKS_SLAB.get());
        dropSelf(MEBlocks.YELLOW_BRICKS_SLAB.get());
        dropSelf(MEBlocks.BEIGE_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.BLACK_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.BLUE_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.BROWN_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.FADED_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.GREEN_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.GREY_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.MAROON_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.NAVY_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.ORANGE_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.PALE_BLUE_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.PINK_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.PURPLE_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.RED_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.SWAMPY_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.WHITE_BRICKS_SLAB_MOSSY.get());
        dropSelf(MEBlocks.YELLOW_BRICKS_SLAB_MOSSY.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MEBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
