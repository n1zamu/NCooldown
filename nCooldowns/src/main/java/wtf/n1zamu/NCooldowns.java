package wtf.n1zamu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import wtf.n1zamu.commands.ReloadCommand;
import wtf.n1zamu.listeners.*;
import wtf.n1zamu.mysql.SQLite;

public final class NCooldowns extends JavaPlugin {
    public static String logo = ChatColor.GOLD + "Задержка" + ChatColor.GRAY + " » ";
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getLogger().info("=====NCooldowns successfully loaded=====");
        getLogger().info("=====Author: github.com/n1zamu=====");
        Bukkit.getPluginManager().registerEvents(new AsyncPlayerChatListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);
        Bukkit.getPluginManager().registerEvents(new CommandsListener(), this);
        getCommand("ncooldowns").setExecutor(new ReloadCommand());
        SQLite.connect();
        SQLite.startChecks();
    }

    @Override
    public void onDisable() {
        getLogger().info("=====NCooldowns successfully unloaded=====");
        getLogger().info("=====Author: github.com/n1zamu=====");
    }
    public static NCooldowns getInstance() {
        return NCooldowns.getPlugin(NCooldowns.class);
    }
}
