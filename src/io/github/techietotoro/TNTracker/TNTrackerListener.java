package io.github.techietotoro.TNTracker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class TNTrackerListener implements Listener {
	@EventHandler(priority = EventPriority.MONITOR)
    public void blockPlace(BlockPlaceEvent event) {
		Block block = event.getBlockPlaced();
		Player player = event.getPlayer();
		if (block.getTypeId() == 46) {
			// log player and block location
			log("TNT placed by player " + player.getName() + " at world location: " + "X: " + block.getX() + " Y: " + block.getY() + " Z: " + block.getZ());
		}
    }
	
	public static void log(String str) {
		final Logger logger = Logger.getLogger("Minecraft");
		PrintWriter writer = null;
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		try {
			writer = new PrintWriter(new BufferedWriter(new FileWriter("TNTrackerLog.txt", true)));
		    writer.println(dateFormat.format(date) + " " + str);
		} catch (IOException ex){
		  // report
			logger.info("[TNTracker] Serious log IOException error!");
		} finally {
		   try {writer.close();} catch (Exception ex) {}
		}
		
		logger.info("[TNTracker] " + str);
	}
	
	
}
