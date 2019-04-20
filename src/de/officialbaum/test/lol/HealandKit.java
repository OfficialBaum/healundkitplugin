package de.officialbaum.test.lol;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealandKit implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender cs, Command command, String label, String[] args) {
		if(cs instanceof Player) {
		Player p = (Player) cs;
		if(args.length == 0) {
			p.setHealth(20);
			p.setFoodLevel(20);
			p.sendMessage("Du wurdest erfolgreich geheilt!");
		} else if
			(args.length == 1) {
			Player t = Bukkit.getPlayer(args[0]);
			t.setHealth(20);
			t.setFoodLevel(20);
			if(t == cs) {
			t.sendMessage("Du hast dich erfolgreich geheilt!");
			} else
				t.sendMessage("Du wurdest von" + cs + "geheilt!");
			
		} else
			p.sendMessage("Bitte benutze /heal <Player>");
			
	} else 
		if(args.length == 0) {
			cs.sendMessage("Du kannst dich nur als Spieler heilen!");
		} else { 
			Player t = Bukkit.getPlayer(args[0]);
			if(Bukkit.getOnlinePlayers().contains(t)) {
				t.setHealth(20);
				t.setFoodLevel(20);
				t.sendMessage("Du wurdest erfolgreich von der Konsole geheilt!");
			} else {
				cs.sendMessage("Dieser Spieler ist nicht online XD!");
			}
		}
		
		
		
		
		return false;
	}
	

}
