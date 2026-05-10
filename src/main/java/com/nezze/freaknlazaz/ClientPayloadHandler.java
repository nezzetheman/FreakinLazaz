package com.nezze.freaknlazaz;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.toasts.SystemToast;
import net.minecraft.network.chat.Component;
import net.neoforged.neoforge.network.handling.IPayloadContext;

@SuppressWarnings("unused")

public class ClientPayloadHandler {
    public static void handleToast(ToastPayload payload, IPayloadContext context) {
        context.enqueueWork(() -> {
            Minecraft mc = Minecraft.getInstance();
            SystemToast.addOrUpdate(
                mc.getToasts(),
                SystemToast.SystemToastId.PACK_COPY_FAILURE, // återanvänd ett befintligt ID
                Component.literal("Välkommen tillbaka, idiot"),
                Component.literal("Borde du inte sova nu?")
            );
        });
    }
}
