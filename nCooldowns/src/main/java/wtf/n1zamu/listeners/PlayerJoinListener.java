package wtf.n1zamu.listeners;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import wtf.n1zamu.NCooldowns;
import wtf.n1zamu.database.SQLite;
import wtf.n1zamu.utils.TimeUtil;

public class PlayerJoinListener implements Listener {
    FileConfiguration config = NCooldowns.getInstance().getConfig();
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if (!SQLite.firstJoin(player)) {
            SQLite.setBlock(player, config.getInt("cooldown"));
            TimeUtil.sendNotification(player, config.getString("messages.joinMessage"));
        }
    }
}

