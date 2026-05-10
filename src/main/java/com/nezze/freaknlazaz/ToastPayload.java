package com.nezze.freaknlazaz;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record ToastPayload() implements CustomPacketPayload {
    public static final Type<ToastPayload> TYPE =
        new Type<>(ResourceLocation.fromNamespaceAndPath("freaknlazaz", "toast"));

    public static final StreamCodec<FriendlyByteBuf, ToastPayload> STREAM_CODEC =
        StreamCodec.unit(new ToastPayload());

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
