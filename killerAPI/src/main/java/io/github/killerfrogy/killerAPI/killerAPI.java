package io.github.killerfrogy.killerAPI;

import org.bukkit.plugin.java.JavaPlugin;

public final class killerAPI extends JavaPlugin{

	@Override
	public void onEnable() {
		getLogger().info("killerAPI enabled and working");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("killerAPI disabled");
	}
	
}
