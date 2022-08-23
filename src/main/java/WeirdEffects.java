import org.bukkit.plugin.java.JavaPlugin;

public final class WeirdEffects extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ArrowFollow(), this);

    }
}
