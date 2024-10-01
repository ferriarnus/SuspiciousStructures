package dev.ferriarnus.suspiciousstructures.data;

import dev.ferriarnus.suspiciousstructures.SuspiciousStructures;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.WritableRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;

@EventBusSubscriber(modid = SuspiciousStructures.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGen {

    @SubscribeEvent
    public static void data(GatherDataEvent event) {
        var registries = event.getLookupProvider();
        var generator = event.getGenerator();
        var pack = generator.getVanillaPack(true);
        var output = generator.getPackOutput();

        generator.addProvider(true, new LootTableProvider(output, Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(LootTableGenerator::new, LootContextParamSets.ARCHAEOLOGY)),
                registries
        ));

        pack.addProvider(out -> new DatapackBuiltinEntriesProvider(out, registries,
                BUILDER, Set.of(SuspiciousStructures.MODID)));
    }

    private static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.STRUCTURE, StructureDatagen::genStructures)
            .add(Registries.STRUCTURE_SET, StructureDatagen::genSets)
            .add(Registries.TEMPLATE_POOL, StructureDatagen::genPools)
            .add(Registries.PROCESSOR_LIST, StructureDatagen::genProcessors);
}
