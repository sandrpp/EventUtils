package me.sandrp.eventUtils.events;

import me.sandrp.eventUtils.utils.message.Chat;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.jetbrains.annotations.NotNull;

public class JoinLeave implements Listener {

    public void onJoin(@NotNull PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage(null);
        Chat.sendBroadcastMessage("<pink>"+player.getName()+"</pink> <grey>hat den Server betreten</grey>");    }

    public void onLeave(@NotNull PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage(null);
        Chat.sendBroadcastMessage("<pink>"+player.getName()+"</pink> <grey>hat den Server verlassen</grey>");
    }


}
