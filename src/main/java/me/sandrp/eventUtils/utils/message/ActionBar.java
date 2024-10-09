package me.sandrp.eventUtils.utils.message;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ActionBar {
    private static final MiniMessage miniMessage = MiniMessage.miniMessage();

    public static void sendMessage(@NotNull Player player, String messageIn){
        Component messageOut = miniMessage.deserialize(messageIn);
        player.sendActionBar(messageOut);
    }

    public static void sendBroadcastMessage(String messageIn){
        Component messageOut = miniMessage.deserialize(messageIn);
        Bukkit.getOnlinePlayers().forEach(player -> {
            player.sendActionBar(messageOut);
        });
    }
}
