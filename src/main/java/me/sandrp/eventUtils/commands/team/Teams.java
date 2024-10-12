package me.sandrp.eventUtils.commands.team;

import me.sandrp.eventUtils.utils.message.Chat;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Teams extends Command {
    protected Teams(@NotNull String name) {
        super(name);
    }

    protected Teams(@NotNull String name, @NotNull String description, @NotNull String usageMessage, @NotNull List<String> aliases) {
        super(name, description, usageMessage, aliases);
    }

    public Teams() {
        this("team", "command for managing teams", "teams Command", Arrays.asList("t"));
    }

    @Override


    public boolean execute(@NotNull CommandSender commandSender, @NotNull String s, @NotNull String[] strings) {
        if(strings.length >= 1){
            switch (strings[0].toLowerCase(Locale.ROOT)) {
                case "create":
                    //team erstellen
                    break;
                case "delete":
                    //team löschen
                    break;
                case "add":
                    //jemanden zu einem bestimmten Team hinzufügen
                    break;
                case "remove":
                    //jemanden von seinem Aktuellem Team entfernen
                    break;
                case "rename":
                    //team umbenennen
                    break;
                case "color":
                    //farbe von einem bestimmten Team ändern
                    break;
                case "list":
                    //list aller teams mit Spielern, Farbe, Name, etc.
                    break;
                default:
                    //usage Message
                    break;
            }
        } else {
            //usage Message
        }

        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            Chat.sendMessage(player, "team erstellt");
        }
        return false;
    }
}
