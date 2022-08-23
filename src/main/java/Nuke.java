import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.net.http.WebSocket;

public class Nuke implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player online = (Player) Bukkit.getOnlinePlayers();
        Location startHeight = online.getLocation().add(0,100,0);
        if (sender instanceof Player || sender instanceof ConsoleCommandSender) {
            if (sender.hasPermission("weirdeffects.nuke")) {
                online.getWorld().spawnEntity(startHeight,EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(1,0,0),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(2,0,0),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(3,0,0),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(0,0,1),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(1,0,1),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(2,0,1),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(3,0,1),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(4,0,1),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(1,0,2),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(2,0,2),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(3,0,2),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(4,0,2),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(1,0,3),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(2,0,3),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(3,0,3),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(4,0,3),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(1,0,4),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(2,0,4),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(3,0,4),EntityType.PRIMED_TNT);
                online.getWorld().spawnEntity(startHeight.add(4,0,4),EntityType.PRIMED_TNT);
            }
        }
    return false;
    }
}