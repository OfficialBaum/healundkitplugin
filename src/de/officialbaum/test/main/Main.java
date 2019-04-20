package de.officialbaum.test.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.officialbaum.test.lol.HealandKit;
import de.officialbaum.test.lol.Kit;



public class Main extends JavaPlugin {
	
	private static Main testplugin;
	
	public void onEnable() {
		testplugin  = this;

		getCommand("heal").setExecutor(new HealandKit());
		getCommand("kit").setExecutor(new Kit());

		}
	}

