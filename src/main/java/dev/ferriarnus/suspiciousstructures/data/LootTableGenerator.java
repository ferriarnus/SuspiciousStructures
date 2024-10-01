package dev.ferriarnus.suspiciousstructures.data;

import dev.ferriarnus.suspiciousstructures.ModLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.function.BiConsumer;

public class LootTableGenerator implements LootTableSubProvider {

    private final HolderLookup.Provider registries;

    public LootTableGenerator(HolderLookup.Provider registries) {
        this.registries = registries;
    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> biConsumer) {
        biConsumer.accept(
                ModLootTables.HUT_GRAVEL_ARCHAEOLOGY,
                LootTable.lootTable()
                        .withPool(
                                LootPool.lootPool()
                                        .setRolls(ConstantValue.exactly(1.0F))
                                        .add(LootItem.lootTableItem(Items.EMERALD).setWeight(2))
                                        .add(LootItem.lootTableItem(Items.WHEAT).setWeight(2))
                                        .add(LootItem.lootTableItem(Items.WOODEN_HOE).setWeight(2))
                                        .add(LootItem.lootTableItem(Items.CLAY).setWeight(2))
                                        .add(LootItem.lootTableItem(Items.BRICK).setWeight(2))
                                        .add(LootItem.lootTableItem(Items.WHITE_DYE).setWeight(2))
                                        .add(LootItem.lootTableItem(Items.ORANGE_DYE).setWeight(2))
                                        .add(LootItem.lootTableItem(Items.RED_CANDLE).setWeight(2))
                                        .add(LootItem.lootTableItem(Items.GREEN_CANDLE).setWeight(2))
                                        .add(LootItem.lootTableItem(Items.PURPLE_CANDLE).setWeight(2))
                                        .add(LootItem.lootTableItem(Items.BROWN_CANDLE).setWeight(2))
                                        .add(LootItem.lootTableItem(Items.GOLD_NUGGET))
                                        .add(LootItem.lootTableItem(Items.COAL))
                                        .add(LootItem.lootTableItem(Items.WHEAT_SEEDS))
                                        .add(LootItem.lootTableItem(Items.BEETROOT_SEEDS))
                                        .add(LootItem.lootTableItem(Items.DEAD_BUSH))
                                        .add(LootItem.lootTableItem(Items.FLOWER_POT))
                                        .add(LootItem.lootTableItem(Items.BOWL))
                                        .add(LootItem.lootTableItem(Items.STRING))
                                        .add(LootItem.lootTableItem(Items.LEAD))
                        )
        );
    }

    public HolderLookup.Provider registries() {
        return this.registries;
    }
}
