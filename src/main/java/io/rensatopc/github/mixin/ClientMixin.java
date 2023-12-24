package io.rensatopc.github.mixin;

import io.rensatopc.github.main.KeyBoardNoteBlockMod;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class ClientMixin {
    @Inject(at=@At("HEAD"), method="run")
    public void myRun(CallbackInfo info) {
        KeyBoardNoteBlockMod.logger.debug("Hello Minecraft!");
    }
}
