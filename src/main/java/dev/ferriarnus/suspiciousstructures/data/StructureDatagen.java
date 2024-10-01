package dev.ferriarnus.suspiciousstructures.data;

import dev.ferriarnus.suspiciousstructures.ModLootTables;
import dev.ferriarnus.suspiciousstructures.SuspiciousStructures;
import dev.ferriarnus.suspiciousstructures.structures.ModProcessors;
import dev.ferriarnus.suspiciousstructures.structures.ModStructurePools;
import dev.ferriarnus.suspiciousstructures.structures.ModStructureSets;
import dev.ferriarnus.suspiciousstructures.structures.ModStructures;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.Pools;
import net.minecraft.tags.BiomeTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.heightproviders.ConstantHeight;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.TerrainAdjustment;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.structures.JigsawStructure;
import net.minecraft.world.level.levelgen.structure.templatesystem.AlwaysTrueTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.CappedProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.PosAlwaysTrueTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.ProcessorRule;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
import net.minecraft.world.level.levelgen.structure.templatesystem.rule.blockentity.AppendLoot;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.neoforged.neoforge.common.Tags;

import java.util.List;

public class StructureDatagen {

    public StructureDatagen() {}

    public static void genStructures(BootstrapContext<Structure> context) {
        HolderGetter<Biome> holdergetter = context.lookup(Registries.BIOME);
        HolderGetter<StructureTemplatePool> holdergetter1 = context.lookup(Registries.TEMPLATE_POOL);

        context.register(ModStructures.Huts.PLAINS, new JigsawStructure((new Structure.StructureSettings.Builder(holdergetter.getOrThrow(BiomeTags.HAS_VILLAGE_PLAINS))).terrainAdapation(TerrainAdjustment.BEARD_THIN).build(),
                        holdergetter1.getOrThrow(ModStructurePools.Huts.PLAINS),
                        6,
                        ConstantHeight.of(VerticalAnchor.absolute(0)),
                        true,
                        Heightmap.Types.WORLD_SURFACE_WG)
        );

        context.register(ModStructures.Huts.DESERT, new JigsawStructure((new Structure.StructureSettings.Builder(holdergetter.getOrThrow(BiomeTags.HAS_VILLAGE_DESERT))).terrainAdapation(TerrainAdjustment.BEARD_THIN).build(),
                holdergetter1.getOrThrow(ModStructurePools.Huts.DESERT),
                6,
                ConstantHeight.of(VerticalAnchor.absolute(0)),
                true,
                Heightmap.Types.WORLD_SURFACE_WG)
        );

        context.register(ModStructures.Huts.SAVANNA, new JigsawStructure((new Structure.StructureSettings.Builder(holdergetter.getOrThrow(BiomeTags.HAS_VILLAGE_SAVANNA))).terrainAdapation(TerrainAdjustment.BEARD_THIN).build(),
                holdergetter1.getOrThrow(ModStructurePools.Huts.SAVANNA),
                6,
                ConstantHeight.of(VerticalAnchor.absolute(0)),
                true,
                Heightmap.Types.WORLD_SURFACE_WG)
        );

        context.register(ModStructures.Huts.TAIGA, new JigsawStructure((new Structure.StructureSettings.Builder(holdergetter.getOrThrow(BiomeTags.HAS_VILLAGE_SNOWY))).terrainAdapation(TerrainAdjustment.BEARD_THIN).build(),
                holdergetter1.getOrThrow(ModStructurePools.Huts.TAIGA),
                6,
                ConstantHeight.of(VerticalAnchor.absolute(0)),
                true,
                Heightmap.Types.WORLD_SURFACE_WG)
        );

        context.register(ModStructures.Towers.PLAINS, new JigsawStructure((new Structure.StructureSettings.Builder(holdergetter.getOrThrow(BiomeTags.HAS_VILLAGE_PLAINS))).terrainAdapation(TerrainAdjustment.BEARD_THIN).build(),
                holdergetter1.getOrThrow(ModStructurePools.Towers.PLAINS),
                6,
                ConstantHeight.of(VerticalAnchor.absolute(0)),
                true,
                Heightmap.Types.WORLD_SURFACE_WG)
        );

        context.register(ModStructures.Towers.BIRCH, new JigsawStructure((new Structure.StructureSettings.Builder(holdergetter.getOrThrow(Tags.Biomes.IS_BIRCH_FOREST))).terrainAdapation(TerrainAdjustment.BEARD_THIN).build(),
                holdergetter1.getOrThrow(ModStructurePools.Towers.BIRCH),
                6,
                ConstantHeight.of(VerticalAnchor.absolute(0)),
                true,
                Heightmap.Types.WORLD_SURFACE_WG)
        );

        context.register(ModStructures.Monuments.PLAINS, new JigsawStructure((new Structure.StructureSettings.Builder(holdergetter.getOrThrow(BiomeTags.HAS_VILLAGE_PLAINS))).terrainAdapation(TerrainAdjustment.BEARD_THIN).build(),
                holdergetter1.getOrThrow(ModStructurePools.Monuments.PLAINS),
                6,
                ConstantHeight.of(VerticalAnchor.absolute(0)),
                true,
                Heightmap.Types.WORLD_SURFACE_WG)
        );

        context.register(ModStructures.Monuments.DESERT, new JigsawStructure((new Structure.StructureSettings.Builder(holdergetter.getOrThrow(BiomeTags.HAS_VILLAGE_DESERT))).terrainAdapation(TerrainAdjustment.BEARD_THIN).build(),
                holdergetter1.getOrThrow(ModStructurePools.Monuments.DESERT),
                6,
                ConstantHeight.of(VerticalAnchor.absolute(0)),
                true,
                Heightmap.Types.WORLD_SURFACE_WG)
        );
    }

    public static void genPools(BootstrapContext<StructureTemplatePool> context) {
        HolderGetter<StructureTemplatePool> pools = context.lookup(Registries.TEMPLATE_POOL);
        Holder<StructureTemplatePool> fallback = pools.getOrThrow(Pools.EMPTY);

        HolderGetter<StructureProcessorList> processors = context.lookup(Registries.PROCESSOR_LIST);
        Holder<StructureProcessorList> huts_arch = processors.getOrThrow(ModProcessors.HUTS_ARCHAEOLOGY);
        Holder<StructureProcessorList> tower_arch = processors.getOrThrow(ModProcessors.TOWERS_ARCHAEOLOGY);
        Holder<StructureProcessorList> monument_arch = processors.getOrThrow(ModProcessors.MONUMENTS_ARCHAEOLOGY);


        context.register(ModStructurePools.Huts.PLAINS, new StructureTemplatePool(fallback, ImmutableList.of(Pair.of(StructurePoolElement.single(SuspiciousStructures.MODID+ ":huts/plains", huts_arch), 1)), StructureTemplatePool.Projection.RIGID));
        context.register(ModStructurePools.Huts.DESERT, new StructureTemplatePool(fallback, ImmutableList.of(Pair.of(StructurePoolElement.single(SuspiciousStructures.MODID+ ":huts/desert", huts_arch), 1)), StructureTemplatePool.Projection.RIGID));
        context.register(ModStructurePools.Huts.SAVANNA, new StructureTemplatePool(fallback, ImmutableList.of(Pair.of(StructurePoolElement.single(SuspiciousStructures.MODID+ ":huts/savanna", huts_arch), 1)), StructureTemplatePool.Projection.RIGID));
        context.register(ModStructurePools.Huts.TAIGA, new StructureTemplatePool(fallback, ImmutableList.of(Pair.of(StructurePoolElement.single(SuspiciousStructures.MODID+ ":huts/taiga", huts_arch), 1)), StructureTemplatePool.Projection.RIGID));

        context.register(ModStructurePools.Towers.PLAINS, new StructureTemplatePool(fallback, ImmutableList.of(Pair.of(StructurePoolElement.single(SuspiciousStructures.MODID+ ":towers/plains", tower_arch), 1)), StructureTemplatePool.Projection.RIGID));
        context.register(ModStructurePools.Towers.BIRCH, new StructureTemplatePool(fallback, ImmutableList.of(Pair.of(StructurePoolElement.single(SuspiciousStructures.MODID+ ":towers/birch", tower_arch), 1)), StructureTemplatePool.Projection.RIGID));

        context.register(ModStructurePools.Monuments.PLAINS, new StructureTemplatePool(fallback, ImmutableList.of(Pair.of(StructurePoolElement.single(SuspiciousStructures.MODID+ ":monuments/plains", monument_arch), 1)), StructureTemplatePool.Projection.RIGID));
        context.register(ModStructurePools.Monuments.DESERT, new StructureTemplatePool(fallback, ImmutableList.of(Pair.of(StructurePoolElement.single(SuspiciousStructures.MODID+ ":monuments/desert", monument_arch), 1)), StructureTemplatePool.Projection.RIGID));

    }

    public static void genSets(BootstrapContext<StructureSet> context) {
        HolderGetter<Structure> holdergetter = context.lookup(Registries.STRUCTURE);
        HolderGetter<Biome> holdergetter1 = context.lookup(Registries.BIOME);

        context.register(ModStructureSets.HUTS, new StructureSet(
                    List.of(StructureSet.entry(holdergetter.getOrThrow(ModStructures.Huts.PLAINS)),
                            StructureSet.entry(holdergetter.getOrThrow(ModStructures.Huts.DESERT)),
                            StructureSet.entry(holdergetter.getOrThrow(ModStructures.Huts.SAVANNA)),
                            StructureSet.entry(holdergetter.getOrThrow(ModStructures.Huts.TAIGA))),
                new RandomSpreadStructurePlacement(20, 8, RandomSpreadType.LINEAR, 2984649))
        );

        context.register(ModStructureSets.TOWERS, new StructureSet(
                List.of(StructureSet.entry(holdergetter.getOrThrow(ModStructures.Towers.PLAINS)),
                        StructureSet.entry(holdergetter.getOrThrow(ModStructures.Towers.BIRCH))),
                new RandomSpreadStructurePlacement(20, 8, RandomSpreadType.LINEAR, 94909895))
        );

        context.register(ModStructureSets.MONUMENTS, new StructureSet(
                List.of(StructureSet.entry(holdergetter.getOrThrow(ModStructures.Monuments.PLAINS)),
                        StructureSet.entry(holdergetter.getOrThrow(ModStructures.Monuments.DESERT))),
                new RandomSpreadStructurePlacement(20, 8, RandomSpreadType.LINEAR, 184964518))
        );
    }

    public static void genProcessors(BootstrapContext<StructureProcessorList> context) {
        HolderGetter<Block> holdergetter = context.lookup(Registries.BLOCK);

        context.register(ModProcessors.HUTS_ARCHAEOLOGY, new StructureProcessorList(ImmutableList.of(
                new CappedProcessor(new RuleProcessor(List.of(new ProcessorRule(new BlockMatchTest(Blocks.GRAVEL), AlwaysTrueTest.INSTANCE, PosAlwaysTrueTest.INSTANCE, Blocks.SUSPICIOUS_GRAVEL.defaultBlockState(), new AppendLoot(ModLootTables.HUT_GRAVEL_ARCHAEOLOGY)))), UniformInt.of(1, 2)),
                new CappedProcessor(new RuleProcessor(List.of(new ProcessorRule(new BlockMatchTest(Blocks.SAND), AlwaysTrueTest.INSTANCE, PosAlwaysTrueTest.INSTANCE, Blocks.SUSPICIOUS_SAND.defaultBlockState(), new AppendLoot(BuiltInLootTables.TRAIL_RUINS_ARCHAEOLOGY_COMMON)))), UniformInt.of(1, 2))
        )));

        context.register(ModProcessors.TOWERS_ARCHAEOLOGY, new StructureProcessorList(ImmutableList.of(
                new CappedProcessor(new RuleProcessor(List.of(new ProcessorRule(new BlockMatchTest(Blocks.GRAVEL), AlwaysTrueTest.INSTANCE, PosAlwaysTrueTest.INSTANCE, Blocks.SUSPICIOUS_GRAVEL.defaultBlockState(), new AppendLoot(BuiltInLootTables.TRAIL_RUINS_ARCHAEOLOGY_COMMON)))), UniformInt.of(1, 2)),
                new CappedProcessor(new RuleProcessor(List.of(new ProcessorRule(new BlockMatchTest(Blocks.SAND), AlwaysTrueTest.INSTANCE, PosAlwaysTrueTest.INSTANCE, Blocks.SUSPICIOUS_SAND.defaultBlockState(), new AppendLoot(BuiltInLootTables.TRAIL_RUINS_ARCHAEOLOGY_COMMON)))), UniformInt.of(1, 2))
        )));

        context.register(ModProcessors.MONUMENTS_ARCHAEOLOGY, new StructureProcessorList(ImmutableList.of(
                new CappedProcessor(new RuleProcessor(List.of(new ProcessorRule(new BlockMatchTest(Blocks.GRAVEL), AlwaysTrueTest.INSTANCE, PosAlwaysTrueTest.INSTANCE, Blocks.SUSPICIOUS_GRAVEL.defaultBlockState(), new AppendLoot(BuiltInLootTables.TRAIL_RUINS_ARCHAEOLOGY_COMMON)))), UniformInt.of(2, 4)),
                new CappedProcessor(new RuleProcessor(List.of(new ProcessorRule(new BlockMatchTest(Blocks.SAND), AlwaysTrueTest.INSTANCE, PosAlwaysTrueTest.INSTANCE, Blocks.SUSPICIOUS_SAND.defaultBlockState(), new AppendLoot(BuiltInLootTables.TRAIL_RUINS_ARCHAEOLOGY_COMMON)))), UniformInt.of(2, 4))
        )));
    }

}
