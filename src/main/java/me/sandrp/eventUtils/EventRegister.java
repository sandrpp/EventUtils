package me.sandrp.eventUtils;

import me.sandrp.eventUtils.events.JoinLeave;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class EventRegister {
    public static void registerEvents(@NotNull PluginManager pluginManager, @NotNull JavaPlugin main) {
        pluginManager.registerEvents(new JoinLeave(), main);
    }
}