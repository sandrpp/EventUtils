package me.sandrp.eventUtils;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main plugin;

    @Override
    public void onEnable() {
        //set plugin
        plugin = this;

        //register
        CommandRegister.registerCommands(this.getServer());
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
