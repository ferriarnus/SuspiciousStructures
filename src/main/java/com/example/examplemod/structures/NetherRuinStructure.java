package com.example.examplemod.structures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;
import net.minecraft.world.level.levelgen.structure.structures.OceanRuinPieces;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class NetherRuinStructure extends Structure {

    protected NetherRuinStructure(StructureSettings settings) {
        super(settings);
    }

    @Override
    protected @NotNull Optional<GenerationStub> findGenerationPoint(@NotNull GenerationContext generationContext) {
        return onTopOfChunkCenter(generationContext, null, structurePiecesBuilder ->  {
            this.generatePieces(structurePiecesBuilder, generationContext);
        });
    }

    private void generatePieces(StructurePiecesBuilder builder, Structure.GenerationContext context) {
        BlockPos blockpos = new BlockPos(context.chunkPos().getMinBlockX(), 90, context.chunkPos().getMinBlockZ());
        Rotation rotation = Rotation.getRandom(context.random());
        NetherRuinPieces.addPieces(context.structureTemplateManager(), blockpos, rotation, builder, context.random(), this);
    }

    @Override
    public @NotNull StructureType<?> type() {
        return null;
    }
}
