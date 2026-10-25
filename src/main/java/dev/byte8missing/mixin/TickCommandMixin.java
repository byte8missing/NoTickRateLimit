package dev.byte8missing.mixin;

import net.minecraft.server.commands.TickCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(TickCommand.class)
public class TickCommandMixin {

    @ModifyConstant(method = "*", constant = @Constant(floatValue = 10000.0F))
    private static float modifyMaxTickRate(float original) {
        return Float.MAX_VALUE;
    }
}