package wtf.n1zamu.utils;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import wtf.n1zamu.NCooldowns;
import wtf.n1zamu.database.SQLite;

public class TimeUtil {
    public static String formattedTime(int time) {
        String cooldown = time / 60 + 1 + " минут";
        if (time / 60 + 1 >= 60) cooldown = time / 60 / 60 + " часов";
        if (time / 60 + 1 <= 1) cooldown = time + " секунд";

        return cooldown;
    }

    public static void sendNotification(Player player, String message) {
        if (NCooldowns.getInstance().getConfig().getBoolean("notification.sound")) {
            player.playSound(player.getLocation(), Sound.valueOf(NCooldowns.getInstance().getConfig().getString("notification.soundType")), 1, 1);
        }
        if (NCooldowns.getInstance().getConfig().getBoolean("notification.message")) {
            player.sendMessage(NCooldowns.logo + ChatColor.translateAlternateColorCodes('&', message.replace("%time%", TimeUtil.formattedTime(SQLite.getTime(player)))));
        }
        if (NCooldowns.getInstance().getConfig().getBoolean("notification.message")) {
            player.sendTitle(ChatColor.GOLD + "Задержка", ChatColor.translateAlternateColorCodes('&', message.replace("%time%", TimeUtil.formattedTime(SQLite.getTime(player)))));
        }
    }
}
