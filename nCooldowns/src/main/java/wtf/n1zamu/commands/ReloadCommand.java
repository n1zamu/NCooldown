package wtf.n1zamu.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;
import wtf.n1zamu.NCooldowns;

public class ReloadCommand implements CommandExecutor {
    FileConfiguration config = NCooldowns.getInstance().getConfig();
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (strings.length < 1) {
            sendMessage(commandSender, config.getString("messages.notEnoughArgumentsMessage"));
            return false;
        }

        if (!commandSender.hasPermission("nCooldowns.reload")) {
            sendMessage(commandSender, config.getString("messages.noPermission"));
            return false;
        }

        if (!strings[0].contains("reload")) {
            sendMessage(commandSender, config.getString("messages.unknownUsage"));
            return false;
        }

        NCooldowns.getPlugin(NCooldowns.class).reloadConfig();
        sendMessage(commandSender,config.getString("messages.successfullyReload"));
        return true;
    }


    private void sendMessage(CommandSender player, String text) {
        player.sendMessage(NCooldowns.logo +
                ChatColor.translateAlternateColorCodes('&', text));
    }
}

