package me.sandrp.eventUtils;

import me.sandrp.eventUtils.utils.message.Console;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main plugin;
    public static MiniMessage miniMessage = MiniMessage.miniMessage();

    //hier API
    public static final Component mainPrefix = miniMessage.deserialize("<<bold><gradient:#ba5370:#f4e2d8>Event</gradient></bold> <grey>></grey> <white> ");
    public static final Component errorPrefix = miniMessage.deserialize("<bold><red>Error</red></bold> <grey>></grey> <white> ");

    @Override
    public void onEnable() {

        //set plugin
        plugin = this;

        //register
        CommandRegister.registerCommands(this.getServer());
        EventRegister.registerEvents(Bukkit.getPluginManager(), this);

        //logs
        Console.sendPrefixMessage("<pink>the plugin has started!</pink>");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    //getter
    public static Main getPlugin() {
        return plugin;
    }
}
