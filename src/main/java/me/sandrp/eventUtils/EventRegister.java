package de.elia.systemclasses.register.events;

import de.elia.achivements.events.bossfight.AchievementBossFightEvent;
import de.elia.bossfightcreator.events.connect.ConnectionEvent;
import de.elia.bossfightcreator.game.executer.NewGameExecuter;
import de.elia.items.events.join.RecipeEvent;
import de.elia.items.events.magicbook.MagicBookEvent;
import de.elia.soulboss.entity.events.DropEvent;
import de.elia.soulboss.entity.mobs.boss.mob.ZombieBoss;
import de.elia.soulboss.entity.mobs.boss.mob.ZombieBoss.ZombieBossEvent;
import de.elia.soulboss.events.AttackEvent;
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