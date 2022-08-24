import org.bukkit.FluidCollisionMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

import java.net.http.WebSocket;

public class MachineGun implements Listener {
    @EventHandler
    public void onSwing(PlayerInteractEvent e){
        Player player = e.getPlayer();
        Location playerLoc = player.getLocation();
        if (e.getItem()==null || e.getItem().getType()==Material.AIR){
            return;
        }
        if (e.getItem().getType().equals(Material.IRON_SWORD)){
            if (e.getAction().equals(Action.RIGHT_CLICK_AIR)){
                Location playerEyeLocShoot = player.getEyeLocation().add(1,0,0);
                Vector targetBlock = player.getTargetBlockExact(100).getLocation().toVector();
                playerLoc.getWorld().spawnArrow(playerEyeLocShoot.subtract(0,0.5,0),targetBlock,20,12);

            }
        }
    }
}
