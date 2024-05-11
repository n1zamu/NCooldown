package wtf.n1zamu.listeners;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import wtf.n1zamu.NCooldowns;
import wtf.n1zamu.mysql.SQLite;
import wtf.n1zamu.utils.TimeUtil;

public class CommandsListener implements Listener {
    FileConfiguration config = NCooldowns.getInstance().getConfig();
    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();
        String command = event.getMessage();
        if (!config.getBoolean("doubleDotCommands"))
            return;
        if (player.hasPermission("nCooldowns.doubleDot"))
            return;
        if (command.contains(":") && SQLite.isBlocked(player)) {
            event.setCancelled(true);
            TimeUtil.sendNotification(player, config.getString("messages.doubleDotMessage"));
        }
    }
}
