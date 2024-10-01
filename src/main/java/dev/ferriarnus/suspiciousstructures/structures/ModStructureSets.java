package dev.ferriarnus.suspiciousstructures.structures;

import dev.ferriarnus.suspiciousstructures.SuspiciousStructures;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.StructureSet;

public class ModStructureSets {

    public static final ResourceKey<StructureSet> HUTS = ResourceKey.create(Registries.STRUCTURE_SET, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "huts"));
    public static final ResourceKey<StructureSet> TOWERS = ResourceKey.create(Registries.STRUCTURE_SET, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "towers"));
    public static final ResourceKey<StructureSet> MONUMENTS = ResourceKey.create(Registries.STRUCTURE_SET, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "monuments"));

}
