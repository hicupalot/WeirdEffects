import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

public class ArrowFollow implements Listener {
    @EventHandler
    public void onArrowShot(EntityShootBowEvent e){
        Entity Projectile = e.getProjectile();
        Location eyeloc = e.getEntity().getEyeLocation();
        if (e.getEntity().getType().equals(EntityType.PLAYER)){
            Projectile.setGravity(false);
            Projectile.setRotation(eyeloc.getYaw(),eyeloc.getPitch());
        //        Projectile.setVelocity();


        }
    }
}
