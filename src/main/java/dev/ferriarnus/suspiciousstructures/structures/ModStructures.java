package dev.ferriarnus.suspiciousstructures.structures;

import dev.ferriarnus.suspiciousstructures.SuspiciousStructures;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.Structure;

public class ModStructures {

    public static class Huts {
        public static final ResourceKey<Structure> PLAINS = ResourceKey.create(Registries.STRUCTURE, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "huts/plains"));
        public static final ResourceKey<Structure> DESERT = ResourceKey.create(Registries.STRUCTURE, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "huts/desert"));
        public static final ResourceKey<Structure> SAVANNA = ResourceKey.create(Registries.STRUCTURE, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "huts/savanna"));
        public static final ResourceKey<Structure> TAIGA = ResourceKey.create(Registries.STRUCTURE, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "huts/taiga"));

    }

    public static class Towers {
        public static final ResourceKey<Structure> PLAINS = ResourceKey.create(Registries.STRUCTURE, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "towers/plains"));
        public static final ResourceKey<Structure> BIRCH = ResourceKey.create(Registries.STRUCTURE, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "towers/birch"));
    }

    public static class Monuments {
        public static final ResourceKey<Structure> PLAINS = ResourceKey.create(Registries.STRUCTURE, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "monuments/plains"));
        public static final ResourceKey<Structure> DESERT = ResourceKey.create(Registries.STRUCTURE, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "monuments/desert"));
    }
}
