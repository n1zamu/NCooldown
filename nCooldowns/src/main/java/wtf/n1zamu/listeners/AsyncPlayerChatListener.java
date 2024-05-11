package wtf.n1zamu.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import wtf.n1zamu.NCooldowns;
import wtf.n1zamu.mysql.SQLite;
import wtf.n1zamu.utils.TimeUtil;
public class AsyncPlayerChatListener implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        if (SQLite.isBlocked(player)) {
            if (!player.hasPermission("nCooldown.bypass")) {
                int time = SQLite.getTime(player);
                if (time > 0) {
                    e.setCancelled(true);
                    TimeUtil.sendNotification(player, NCooldowns.getInstance().getConfig().getString("messages.blockMessage"));
                }
            }
        }
    }
}

