package dev.slide_am.us.event;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class SpawnerBreakEvent implements Listener {

    @EventHandler
    public void damageEvent(BlockBreakEvent event){
        if(event.getPlayer().getGameMode() != GameMode.CREATIVE){
            if(event.getBlock().getType() == Material.SPAWNER){
                event.setCancelled(true);
            }
        }
    }
}
