package io.github.techietotoro.TNTracker;

import org.bukkit.plugin.java.JavaPlugin;

public final class TNTracker extends JavaPlugin {

	@Override
    public void onEnable(){
		getServer().getPluginManager().registerEvents(new TNTrackerListener(), this);
		
		getCommand("tracker add").setExecutor(new TNTrackerExecutor(this));
		getCommand("tracker remove").setExecutor(new TNTrackerExecutor(this));
	}
	
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		
	}
}
