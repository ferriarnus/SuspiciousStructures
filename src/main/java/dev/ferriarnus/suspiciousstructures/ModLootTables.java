package dev.ferriarnus.suspiciousstructures;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;

public class ModLootTables {

    public static final ResourceKey<LootTable> HUT_GRAVEL_ARCHAEOLOGY = ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "hut_gravel_arch"));

}
