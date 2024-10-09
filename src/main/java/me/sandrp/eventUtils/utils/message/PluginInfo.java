package me.sandrp.eventUtils.utils.message;

import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.event.HoverEvent;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PluginInfo {

    private static MiniMessage miniMessage = MiniMessage.miniMessage();

    public static void send(@NotNull CommandSender commandSender, String pluginName, String author, String version, boolean miniMessageApiHint) {
        if(commandSender instanceof Player player){
            Chat.sendMessage(player, "<st><grey>        </st> <gradient:#fd0168:#c844e8>" + pluginName + "</gradient:#fd0168:#c844e8> <st><grey>        </grey></st>");
            Chat.sendMessage(player, "Version: <#dd4282>" + version);
            Chat.sendMessage(player, "Author: <#dd4282>" + author);
            if(miniMessageApiHint) {
                player.sendMessage(miniMessage.deserialize("Info: <#dd4282>the plugin uses MiniMessageAPI for formatting: ").append(miniMessage.deserialize("<blue>https://docs.advntr.dev/</blue>").clickEvent(ClickEvent.openUrl("https://docs.advntr.dev/minimessage/format.html")).hoverEvent(HoverEvent.showText(miniMessage.deserialize("<blue>https://docs.advntr.dev/minimessage/format.html</blue>")))));
            }
                Chat.sendMessage(player, "Commands:");
            Chat.sendMessage(player, "<grey>/actionbar [USAGE] [TYPE] [MESSAGE]</grey>");
            Chat.sendMessage(player, "<dark_grey>(display actionbar messages)</dark_grey>");
            Chat.sendMessage(player, "<grey>/chat [USAGE] [TYPE] [MESSAGE]</grey>");
            Chat.sendMessage(player, "<dark_grey>(display chat messages)</dark_grey>");
            Chat.sendMessage(player, "<grey>/utils</grey> <dark_grey>(this info)</dark_grey>");
            Chat.sendMessage(player, "<st><grey>        </st> <gradient:#fd0168:#c844e8>" + pluginName + "</gradient:#fd0168:#c844e8> <st><grey>        </grey></st>");
        }
        else{
            Console.sendMessage("<st><grey>        </st> <gradient:#fd0168:#c844e8>" + pluginName + "</gradient:#fd0168:#c844e8> <st><grey>        </grey></st>");
            Console.sendMessage("Version: <#dd4282>" + version);
            Console.sendMessage("Author: <#dd4282>" + author);
            Console.sendMessage("Commands:");
            Console.sendMessage("<grey>/actionbar [USAGE] [TYPE] [MESSAGE]</grey>");
            Console.sendMessage("<dark_grey>(display actionbar messages)</dark_grey>");
            Console.sendMessage("<grey>/chat [USAGE] [TYPE] [MESSAGE]</grey>");
            Console.sendMessage("<dark_grey>(display chat messages)</dark_grey>");
            Console.sendMessage("<grey>/utils</grey> <dark_grey>(this info)</dark_grey>");
            Console.sendMessage("<st><grey>        </st> <gradient:#fd0168:#c844e8>" + pluginName + "</gradient:#fd0168:#c844e8> <st><grey>        </grey></st>");
        }
    }
}
