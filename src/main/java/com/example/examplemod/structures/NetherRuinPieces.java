package com.example.examplemod.structures;

import com.example.examplemod.ExampleMod;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.TemplateStructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;
import net.minecraft.world.level.levelgen.structure.structures.OceanRuinPieces;
import net.minecraft.world.level.levelgen.structure.structures.OceanRuinStructure;
import net.minecraft.world.level.levelgen.structure.templatesystem.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.rule.blockentity.AppendLoot;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.List;
import java.util.function.Function;

public class NetherRuinPieces {
    private static final StructureProcessor SUSPICIOUS_BLOCK_PROCESSOR = archyRuleProcessor(Blocks.SAND, Blocks.SUSPICIOUS_SAND, BuiltInLootTables.OCEAN_RUIN_WARM_ARCHAEOLOGY);
    private static final ResourceLocation[] RUINS = new ResourceLocation[]{ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "ruin")};
    private static final ResourceLocation[] RUINS_BRICK = new ResourceLocation[]{};

    public static void addPieces(StructureTemplateManager structureTemplateManager, BlockPos blockpos, Rotation rotation, StructurePiecesBuilder builder, WorldgenRandom random, NetherRuinStructure netherRuinStructure) {
        builder.addPiece(new NetherRuinPiece(structureTemplateManager, RUINS[0], blockpos, rotation, 0.2F, false));
    }

    private static StructureProcessor archyRuleProcessor(Block block, Block suspiciousBlock, ResourceKey<LootTable> lootTable) {
        return new CappedProcessor(new RuleProcessor(List.of(new ProcessorRule(new BlockMatchTest(block), AlwaysTrueTest.INSTANCE, PosAlwaysTrueTest.INSTANCE, suspiciousBlock.defaultBlockState(), new AppendLoot(lootTable)))), ConstantInt.of(5));
    }

    public static class NetherRuinPiece extends TemplateStructurePiece {

        private final float integrity;
        private final boolean isLarge;

        public NetherRuinPiece(StructureTemplateManager structureTemplateManager, ResourceLocation location, BlockPos pos, Rotation rotation, float integrity, boolean isLarge) {
            super(StructurePieceType.OCEAN_RUIN, 0, structureTemplateManager, location, location.toString(), makeSettings(rotation, integrity), pos);
            this.integrity = integrity;
            this.isLarge = isLarge;
        }

        private NetherRuinPiece(StructureTemplateManager structureTemplateManager, CompoundTag genDepth, Rotation rotation, float integrity, boolean isLarge) {
            super(StructurePieceType.OCEAN_RUIN, genDepth, structureTemplateManager, (p_277332_) -> makeSettings(rotation, integrity));
            this.integrity = integrity;
            this.isLarge = isLarge;
        }

        private static StructurePlaceSettings makeSettings(Rotation rotation, float integrity) {
            return (new StructurePlaceSettings()).setRotation(rotation).setMirror(Mirror.NONE).addProcessor(new BlockRotProcessor(integrity)).addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR).addProcessor(SUSPICIOUS_BLOCK_PROCESSOR);
        }

        @Override
        protected void handleDataMarker(String s, BlockPos blockPos, ServerLevelAccessor serverLevelAccessor, RandomSource randomSource, BoundingBox boundingBox) {

        }
    }
}
