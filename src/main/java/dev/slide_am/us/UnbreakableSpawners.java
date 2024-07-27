package dev.slide_am.us;

import dev.slide_am.us.event.SpawnerBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class UnbreakableSpawners extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SpawnerBreakEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
