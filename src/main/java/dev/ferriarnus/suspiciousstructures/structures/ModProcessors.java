package dev.ferriarnus.suspiciousstructures.structures;

import dev.ferriarnus.suspiciousstructures.SuspiciousStructures;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;

public class ModProcessors {

    public static final ResourceKey<StructureProcessorList> HUTS_ARCHAEOLOGY = ResourceKey.create(Registries.PROCESSOR_LIST, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "huts_arch"));
    public static final ResourceKey<StructureProcessorList> TOWERS_ARCHAEOLOGY = ResourceKey.create(Registries.PROCESSOR_LIST, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "towers_arch"));
    public static final ResourceKey<StructureProcessorList> MONUMENTS_ARCHAEOLOGY = ResourceKey.create(Registries.PROCESSOR_LIST, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "monuments_arch"));

}
