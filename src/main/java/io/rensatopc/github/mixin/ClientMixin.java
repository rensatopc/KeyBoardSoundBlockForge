package io.rensatopc.github.mixin;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import io.rensatopc.github.util.ModLogger;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@OnlyIn(Dist.CLIENT)
@Mixin(Minecraft.class)
public abstract class ClientMixin {
    @Inject(method="run", at=@At("HEAD"))
    protected void myRun(CallbackInfo info) {
        ModLogger.getLogger().info("Hello Minecraft!");
    }
}
