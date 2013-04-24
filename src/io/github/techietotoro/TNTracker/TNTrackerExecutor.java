package io.github.techietotoro.TNTracker;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TNTrackerExecutor implements CommandExecutor {
	private TNTracker plugin;
	
	TNTrackerExecutor(TNTracker p) {
		this.plugin = p;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Implement friendly console UI commands
		if(cmd.getName().equalsIgnoreCase("track add")) {
			
		}
		else if(cmd.getName().equalsIgnoreCase("track remove")) {
			
		}
		
		return false;
	}
	
}
