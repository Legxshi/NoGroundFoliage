package com.legxshi.nogroundfoliage.client.mixin;

import com.legxshi.nogroundfoliage.client.NoGroundFoliageClient;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.core.registries.BuiltInRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(BlockBehaviour.BlockStateBase.class)
public class BlockModelRendererMixin {

    @Inject(
            method = "getRenderShape",
            at = @At("HEAD"),
            cancellable = true
    )
    private void hideHiddenPlants(CallbackInfoReturnable<RenderShape> cir) {
        BlockState state = (BlockState) (Object) this;
        String blockId = BuiltInRegistries.BLOCK.getKey(state.getBlock()).toString();

        if (NoGroundFoliageClient.KNOWN_PLANTS.contains(blockId)) {
            cir.setReturnValue(RenderShape.INVISIBLE);
        }
    }
}