package de.officialbaum.test.lol;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Kit implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String l, String[] args) {
		if(cs instanceof Player) {
			Player p = (Player) cs;
			if(args.length == 0) {
				p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 1));
				p.sendMessage("Du hast ein Diamand Schwert erhalten!");
			}
		}
		
		

		return false;
	}

}
