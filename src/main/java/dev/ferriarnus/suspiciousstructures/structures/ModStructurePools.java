package dev.ferriarnus.suspiciousstructures.structures;

import dev.ferriarnus.suspiciousstructures.SuspiciousStructures;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;

public class ModStructurePools {

    public static class Huts {
        public static final ResourceKey<StructureTemplatePool> PLAINS = ResourceKey.create(Registries.TEMPLATE_POOL, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "huts/plains"));
        public static final ResourceKey<StructureTemplatePool> DESERT = ResourceKey.create(Registries.TEMPLATE_POOL, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "huts/desert"));;
        public static final ResourceKey<StructureTemplatePool> SAVANNA = ResourceKey.create(Registries.TEMPLATE_POOL, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "huts/savanna"));;
        public static final ResourceKey<StructureTemplatePool> TAIGA = ResourceKey.create(Registries.TEMPLATE_POOL, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "huts/taiga"));;

    }

    public static class Towers {
        public static final ResourceKey<StructureTemplatePool> PLAINS = ResourceKey.create(Registries.TEMPLATE_POOL, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "towers/plains"));
        public static final ResourceKey<StructureTemplatePool> BIRCH = ResourceKey.create(Registries.TEMPLATE_POOL, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "towers/birch"));;
    }

    public static class Monuments {
        public static final ResourceKey<StructureTemplatePool> PLAINS = ResourceKey.create(Registries.TEMPLATE_POOL, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "monuments/plains"));
        public static final ResourceKey<StructureTemplatePool> DESERT = ResourceKey.create(Registries.TEMPLATE_POOL, ResourceLocation.fromNamespaceAndPath(SuspiciousStructures.MODID, "monuments/desert"));;
    }

}
