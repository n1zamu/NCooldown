package wtf.n1zamu.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class SQLite {
    private static Statement statement;

    public static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:plugins/nCooldowns/database.db");
            String sql = "CREATE TABLE IF NOT EXISTS cooldowns (id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,time INTEGER,block INTEGER);";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (Exception var1) {
            System.err.println(var1.getClass().getName() + ": " + var1.getMessage());
        }

    }

    private static Set<String> players() {
        Set<String> set = new HashSet<>();

        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM cooldowns;");

            while (rs.next()) {
                String name = rs.getString("name");
                set.add(name);
            }
        } catch (SQLException var3) {
            System.err.println(var3.getClass().getName() + ": " + var3.getMessage());
        }

        return set;
    }

    public static void setBlock(Player p, int time) {
        try {
            statement.executeUpdate("INSERT INTO cooldowns (name,time,block) VALUES ('" + p.getName() + "'," + time + "," + 1 + ");");
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public static boolean isBlocked(Player p) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM cooldowns;");

            while (rs.next()) {
                String name = rs.getString("name");
                int b = rs.getInt("block");
                if (name.equals(p.getName())) {
                    return b == 1;
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }

        return false;
    }

    public static int getTime(Player p) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM cooldowns;");

            while (rs.next()) {
                String name = rs.getString("name");
                int time = rs.getInt("time");
                if (name.equals(p.getName())) {
                    return time;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public static void startChecks() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (Player p : Bukkit.getOnlinePlayers()) {
                    try {
                        if (SQLite.isBlocked(p)) {
                            int time = SQLite.getTime(p);
                            if (time > 0) {
                                SQLite.statement.executeUpdate("UPDATE cooldowns SET time = " + (time - 1) + " WHERE name='" + p.getName() + "';");
                            } else {
                                SQLite.statement.executeUpdate("UPDATE cooldowns SET block = 0 WHERE name='" + p.getName() + "';");
                            }
                        }
                    } catch (SQLException e) {
                        System.err.println(e.getClass().getName() + ": " + e.getMessage());
                    }
                }
            }
        }, 1L, 1000L);
    }

    public static boolean firstJoin(Player p) {
        return players().contains(p.getName());
    }
}
