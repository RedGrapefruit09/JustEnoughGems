package com.redgrapefruit.justenoughgems.mixin;

import com.redgrapefruit.justenoughgems.armor.ArmorReflectionMixinImpl;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class ArmorReflectionMixin {
    @Shadow @Final private PlayerInventory inventory;

    @Inject(method = "damageArmor", at = @At("HEAD")) @Unique
    private void jeg$damageArmor(DamageSource source, float amount, CallbackInfo ci) {
        // the implementation is wrapped into native kotlin
        ArmorReflectionMixinImpl.INSTANCE.onArmorDamaged(inventory, source, amount, (PlayerEntity) (Object) this);
    }
}
