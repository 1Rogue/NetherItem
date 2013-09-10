package io.github.excusemyluck;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.java.JavaPlugin;

public class NI extends JavaPlugin {
	public PluginLoader pl;
	public final Logger logger = Logger.getLogger("Minecraft");
	public PluginDescriptionFile pdfFile = this.getDescription();
	public final PlayerListener PlayerListener = new PlayerListener(this);

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PlayerListener(this),
				this);

		Bukkit.getConsoleSender().sendMessage(
				ChatColor.GOLD + "[NI]" + ChatColor.GREEN + " is now enabled!");
	}

	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(
				ChatColor.GOLD + "[NI]" + ChatColor.RED + " is now disabled!");
	}

	public void logInfo(String log) {
		logger.info(log);
	}

	public void logWarning(String log) {
		logger.warning(log);
	}
}
