package fr.weefle.waze.legacy;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import fr.weefle.waze.nms.BossBarAPI;

@SuppressWarnings("deprecation")
public class BossBarOld implements BossBarAPI {

	@Override
	public void sendBossBar(Player p, String message, int percent, String color, String id, String type) {
		
			//BarAPI.setMessage(p, message, percent);
			org.inventivetalent.bossbar.BossBarAPI.setMessage(p, message, percent);
			
	}

	@Override
	public void removeBossBar(Player p, String id) {
		
			//BarAPI.removeBar(p);
		org.inventivetalent.bossbar.BossBarAPI.removeBar(p);
		
	}

	@Override
	public void sendBossBarTimer(Player p, String message, int percent, String color, int time, String id, String type) {
		
            //BarAPI.setMessage(p, message, time);
		org.inventivetalent.bossbar.BossBarAPI.setMessage(p, message, percent, time);
          
        }

	@Override
	public String[] getBossBars(Player p) {
		//return BarAPI.getMessage(p);
		ArrayList<String> bar = new ArrayList<>();
		bar.add(org.inventivetalent.bossbar.BossBarAPI.getMessage(p));
		return bar.toArray(new String[bar.size()]);
	}
	
}